package mcframe.clientMSUA.MSUAP1130;

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

/**
 * 画面"MSUAP_AdvPay"パネルクラスです。<p>
 *
 * 前渡金の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_AdvPay_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MSUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUAP1130";

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
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	public MCTitledBorder Tab1TitledBorder = null;
	// [Tab1]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Payment schedule management classification cd. 支払先予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Payment schedule management classification dept. cd. 支払先予定管理先部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_cd = null;
	/**
	 * Payment schedule management classification dept. name 支払先予定管理先部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
	public MCLabel Cnd_bsppl_wg_cd_Label = null;
	/**
	 * Scheduled payee WG cd. 支払予定管理先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_wg_cd = null;
	/**
	 * Scheduled payee WG name 支払予定管理先ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_wg_nm = null;
	public MCLabel Cnd_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_nm = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	public MCLabel Cnd_pay_usr_cd_Label = null;
	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_cd = null;
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_nm = null;
	public MCLabel Cnd_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_nm = null;
	public MCLabel Cnd_pay_dpt_wg_cd_Label = null;
	/**
	 * Payment dept. WG cd. 支払部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pay_dpt_wg_cd = null;
	/**
	 * Payment dept. WG name 支払部門ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_wg_nm = null;
	public MCLabel Cnd_pay_act_dt_fr_Label = null;
	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_fr = null;
	public MCLabel Cnd_pay_act_dt_to_Label = null;
	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_to = null;
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	public MCLabel Cnd_adv_pay_act_no_Label = null;
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_adv_pay_act_no = null;
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_ap_sttl_cd_Label = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCTextField Cnd_ap_sttl_nm = null;
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSUA.MSUAP1130.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_pay_act_no = null;
	/**
	 * Transaction offset amount 取引相殺対象額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_setoff_tgt_amt = null;
	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_setoff_schd_amt = null;
	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_setoff_act_amt = null;
	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_not_proc_bal = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_dt = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ_nm = null;
	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_usr_cd = null;
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_usr_nm = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ_nm = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_nm = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_dt = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_days = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_nm = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_nm = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accptr = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
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
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSUA.MSUAP1130.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1130.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1130.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1130.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1130.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1130.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1130.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1130.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1130.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1130.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(CndPanel);
		ret.add(SrchBtnPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_AdvPay_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_AdvPay_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUAP_AdvPay_MC.jbCreateTop((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateFold((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateTab1((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateCnd((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateSrchBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateCtrl((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateRslt((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbCreateBtn((MSUAP_AdvPay)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_AdvPay p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSUAP_AdvPay p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSUAP_AdvPay p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_AdvPay p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_AdvPay p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_AdvPay p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_AdvPay p) {
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSUA.MSUAP1130.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_AdvPay p) {
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

	
	/** [Cnd_pay_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_usr_cd_p = null;

	/**
	 * [Cnd_pay_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_usr_cd_ListPutter() {
		if (Cnd_pay_usr_cd_p == null) {
			Cnd_pay_usr_cd_p = createCnd_pay_usr_cd_ListPutter(Cnd_pay_usr_cd, "pay_usr_cd", "pay_usr_nm");

		}
		return Cnd_pay_usr_cd_p;
	}
	
	
	/** [Cnd_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_dpt_cd_p = null;

	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_dpt_cd_ListPutter() {
		if (Cnd_pay_dpt_cd_p == null) {
			Cnd_pay_dpt_cd_p = createCnd_pay_dpt_cd_ListPutter(Cnd_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Cnd_pay_dpt_cd_p;
	}
	
	
	/** [Cnd_pay_dpt_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_dpt_wg_cd_p = null;

	/**
	 * [Cnd_pay_dpt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_dpt_wg_cd_ListPutter() {
		if (Cnd_pay_dpt_wg_cd_p == null) {
			Cnd_pay_dpt_wg_cd_p = createCnd_pay_dpt_wg_cd_ListPutter(Cnd_pay_dpt_wg_cd, "pay_dpt_wg_cd", "pay_dpt_wg_nm");

		}
		return Cnd_pay_dpt_wg_cd_p;
	}
	
	
	/** [Cnd_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_sttl_cd_p = null;

	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_sttl_cd_ListPutter() {
		if (Cnd_ap_sttl_cd_p == null) {
			Cnd_ap_sttl_cd_p = createCnd_ap_sttl_cd_ListPutter(Cnd_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm");

		}
		return Cnd_ap_sttl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_AdvPay create(){
		MSUAP_AdvPay p = new MSUAP_AdvPay();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_AdvPay create(String name){
		MSUAP_AdvPay p = new MSUAP_AdvPay(name);
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
		MSUAP_AdvPay_MC.jbfInitTop((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitFold((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitTab1((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitCnd((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitSrchBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitCtrl((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitRslt((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbfInitBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitTop((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitFold((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitTab1((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitCnd((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitSrchBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitCtrl((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitRslt((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.jbInitBtn((MSUAP_AdvPay)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		p.Tab1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_bsppl_wg_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_wg_cd_Label");
		p.Cnd_bsppl_wg_cd = p.beansFactory.createTextField("Cnd.bsppl_wg_cd");
		p.Cnd_bsppl_wg_cd.setLabel(p.Cnd_bsppl_wg_cd_Label);
		p.Cnd_bsppl_wg_nm = p.beansFactory.createTextField("Cnd.bsppl_wg_nm");
		p.Cnd_bd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bd_dpt_cd_Label");
		p.Cnd_bd_dpt_cd = p.beansFactory.createTextField("Cnd.bd_dpt_cd");
		p.Cnd_bd_dpt_cd.setLabel(p.Cnd_bd_dpt_cd_Label);
		p.Cnd_bd_dpt_nm = p.beansFactory.createTextField("Cnd.bd_dpt_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextField("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_pay_usr_cd_Label = p.beansFactory.createLabel("Cnd.pay_usr_cd_Label");
		p.Cnd_pay_usr_cd = p.beansFactory.createTextField("Cnd.pay_usr_cd");
		p.Cnd_pay_usr_cd.setLabel(p.Cnd_pay_usr_cd_Label);
		p.Cnd_pay_usr_nm = p.beansFactory.createTextField("Cnd.pay_usr_nm");
		p.Cnd_pay_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_cd_Label");
		p.Cnd_pay_dpt_cd = p.beansFactory.createTextField("Cnd.pay_dpt_cd");
		p.Cnd_pay_dpt_cd.setLabel(p.Cnd_pay_dpt_cd_Label);
		p.Cnd_pay_dpt_nm = p.beansFactory.createTextField("Cnd.pay_dpt_nm");
		p.Cnd_pay_dpt_wg_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_wg_cd_Label");
		p.Cnd_pay_dpt_wg_cd = p.beansFactory.createTextComboBox("Cnd.pay_dpt_wg_cd");
		p.Cnd_pay_dpt_wg_cd.setLabel(p.Cnd_pay_dpt_wg_cd_Label);
		p.Cnd_pay_dpt_wg_nm = p.beansFactory.createTextField("Cnd.pay_dpt_wg_nm");
		p.Cnd_pay_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_fr_Label");
		p.Cnd_pay_act_dt_fr = p.beansFactory.createDateField("Cnd.pay_act_dt_fr");
		p.Cnd_pay_act_dt_fr.setLabel(p.Cnd_pay_act_dt_fr_Label);
		p.Cnd_pay_act_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_to_Label");
		p.Cnd_pay_act_dt_to = p.beansFactory.createDateField("Cnd.pay_act_dt_to");
		p.Cnd_pay_act_dt_to.setLabel(p.Cnd_pay_act_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_adv_pay_act_no_Label = p.beansFactory.createLabel("Cnd.adv_pay_act_no_Label");
		p.Cnd_adv_pay_act_no = p.beansFactory.createTextField("Cnd.adv_pay_act_no");
		p.Cnd_adv_pay_act_no.setLabel(p.Cnd_adv_pay_act_no_Label);
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_ap_sttl_cd_Label = p.beansFactory.createLabel("Cnd.ap_sttl_cd_Label");
		p.Cnd_ap_sttl_cd = p.beansFactory.createTextComboBox("Cnd.ap_sttl_cd");
		p.Cnd_ap_sttl_cd.setLabel(p.Cnd_ap_sttl_cd_Label);
		p.Cnd_ap_sttl_nm = p.beansFactory.createTextField("Cnd.ap_sttl_nm");
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_adv_pay_act_no = p.beansFactory.createTableColumn("Rslt.adv_pay_act_no", MCColumnType.TEXT);
		p.columnRslt_trd_cur_setoff_tgt_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_setoff_tgt_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_setoff_schd_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_setoff_schd_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_setoff_act_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_setoff_act_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_not_proc_bal = p.beansFactory.createTableColumn("Rslt.trd_cur_not_proc_bal", MCColumnType.NUMBER);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_pay_act_dt = p.beansFactory.createTableColumn("Rslt.pay_act_dt", MCColumnType.DATE);
		p.columnRslt_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_pay_usr_cd = p.beansFactory.createTableColumn("Rslt.pay_usr_cd", MCColumnType.TEXT);
		p.columnRslt_pay_usr_nm = p.beansFactory.createTableColumn("Rslt.pay_usr_nm", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_cd = p.beansFactory.createTableColumn("Rslt.pay_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_nm = p.beansFactory.createTableColumn("Rslt.pay_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_note_days = p.beansFactory.createTableColumn("Rslt.note_days", MCColumnType.NUMBER);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_draw_bank_cd = p.beansFactory.createTableColumn("Rslt.draw_bank_cd", MCColumnType.TEXT);
		p.columnRslt_draw_bank_nm = p.beansFactory.createTableColumn("Rslt.draw_bank_nm", MCColumnType.TEXT);
		p.columnRslt_draw_branch_cd = p.beansFactory.createTableColumn("Rslt.draw_branch_cd", MCColumnType.TEXT);
		p.columnRslt_draw_branch_nm = p.beansFactory.createTableColumn("Rslt.draw_branch_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr = p.beansFactory.createTableColumn("Rslt.endrsr", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSUAP_AdvPay p) {
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
		p.FoldPanel.setNextBeans(p.SrchBtnPanel);
		p.TopPanel.add(p.SrchBtnPanel, null);
		p.SrchBtnPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.Tab1Panel, null);
		p.FoldPanel.setLastBeans(p.Tab1Panel);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.Tab1Panel.setBorder(p.Tab1TitledBorder);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.CndPanel.setLastBeans(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_nm_META);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_bsppl_wg_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_dpt_nm_META);
		p.CndPanel.add(p.Cnd_bsppl_wg_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_wg_cd);
		p.Cnd_bsppl_wg_cd.setNextBeans(p.Cnd_bsppl_wg_nm);
		p.Cnd_bsppl_wg_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_wg_cd_META);
		p.Cnd_bsppl_wg_cd.addLinkBeans(p.Cnd_bsppl_wg_nm);
		p.CndPanel.add(p.Cnd_bsppl_wg_nm);
		p.Cnd_bsppl_wg_nm.setNextBeans(p.Cnd_bd_dpt_cd);
		p.Cnd_bsppl_wg_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bsppl_wg_nm_META);
		p.CndPanel.add(p.Cnd_bd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bd_dpt_cd);
		p.Cnd_bd_dpt_cd.setNextBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bd_dpt_cd_META);
		p.Cnd_bd_dpt_cd.addLinkBeans(p.Cnd_bd_dpt_nm);
		p.CndPanel.add(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_bd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.bd_dpt_nm_META);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.trd_cur_cd_META);
		p.Cnd_trd_cur_cd.addLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_pay_usr_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.trd_cur_nm_META);
		p.CndPanel.add(p.Cnd_pay_usr_cd_Label);
		p.CndPanel.add(p.Cnd_pay_usr_cd);
		p.Cnd_pay_usr_cd.setNextBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_usr_cd_META);
		p.Cnd_pay_usr_cd.addLinkBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_usr_cd, true);
		p.CndPanel.add(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_nm.setNextBeans(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_usr_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_usr_nm, true);
		p.CndPanel.add(p.Cnd_pay_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_dpt_cd.setNextBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_dpt_cd_META);
		p.Cnd_pay_dpt_cd.addLinkBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_cd, true);
		p.CndPanel.add(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_nm.setNextBeans(p.Cnd_pay_dpt_wg_cd);
		p.Cnd_pay_dpt_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_dpt_nm_META);
		p.Cnd_pay_dpt_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_wg_cd, true);
		p.Cnd_pay_dpt_wg_cd.setLinkBeans(p.Cnd_pay_dpt_wg_nm);
		p.CndPanel.add(p.Cnd_pay_dpt_wg_cd_Label);
		p.CndPanel.add(p.Cnd_pay_dpt_wg_cd);
		p.Cnd_pay_dpt_wg_cd.setNextBeans(p.Cnd_pay_dpt_wg_nm);
		p.Cnd_pay_dpt_wg_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_dpt_wg_cd_META);
		p.CndPanel.add(p.Cnd_pay_dpt_wg_nm);
		p.Cnd_pay_dpt_wg_nm.setNextBeans(p.Cnd_pay_act_dt_fr);
		p.Cnd_pay_dpt_wg_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_dpt_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_dpt_wg_nm, true);
		p.CndPanel.add(p.Cnd_pay_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_fr);
		p.Cnd_pay_act_dt_fr.setNextBeans(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_act_dt_fr_META);
		p.Cnd_pay_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_pay_act_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.pay_act_dt_to_META);
		p.Cnd_pay_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_adv_pay_act_no);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_adv_pay_act_no_Label);
		p.CndPanel.add(p.Cnd_adv_pay_act_no);
		p.Cnd_adv_pay_act_no.setNextBeans(p.Cnd_note_no);
		p.Cnd_adv_pay_act_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.adv_pay_act_no_META);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_ap_sttl_cd);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.note_no_META);
		p.Cnd_ap_sttl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_sttl_cd, true);
		p.Cnd_ap_sttl_cd.setLinkBeans(p.Cnd_ap_sttl_nm);
		p.CndPanel.add(p.Cnd_ap_sttl_cd_Label);
		p.CndPanel.add(p.Cnd_ap_sttl_cd);
		p.Cnd_ap_sttl_cd.setNextBeans(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.ap_sttl_cd_META);
		p.CndPanel.add(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.ap_sttl_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_sttl_nm, true);
		p.SrchBtnPanel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtnPanel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtnPanel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtnPanel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtnPanel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1130.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSUAP_AdvPay p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
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
		MSUAP_AdvPay_MC.mcInitTop((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitFold((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitTab1((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitCnd((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitSrchBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitCtrl((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitRslt((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.mcInitBtn((MSUAP_AdvPay)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_AdvPay_MC.statusInitSRCH_Top((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Fold((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Tab1((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Cnd((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_SrchBtn((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Ctrl((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Rslt((MSUAP_AdvPay)this);
		MSUAP_AdvPay_MC.statusInitSRCH_Btn((MSUAP_AdvPay)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_AdvPay p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSUAP_AdvPay p) {
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSUAP_AdvPay p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_AdvPay p) {
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_bsppl_wg_cd.setListListener(p);
		p.Cnd_bsppl_wg_cd.addAllListener(p);
		p.Cnd_bsppl_wg_nm.setListListener(p);
		p.Cnd_bsppl_wg_nm.addAllListener(p);
		p.Cnd_bd_dpt_cd.setListListener(p);
		p.Cnd_bd_dpt_cd.addAllListener(p);
		p.Cnd_bd_dpt_nm.setListListener(p);
		p.Cnd_bd_dpt_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_pay_usr_cd.setListListener(p);
		p.Cnd_pay_usr_cd.addAllListener(p);
		p.Cnd_pay_usr_nm.setListListener(p);
		p.Cnd_pay_usr_nm.addAllListener(p);
		p.Cnd_pay_dpt_cd.setListListener(p);
		p.Cnd_pay_dpt_cd.addAllListener(p);
		p.Cnd_pay_dpt_nm.setListListener(p);
		p.Cnd_pay_dpt_nm.addAllListener(p);
		p.Cnd_pay_dpt_wg_cd.setListListener(p);
		p.Cnd_pay_dpt_wg_cd.addAllListener(p);
		p.Cnd_pay_dpt_wg_nm.setListListener(p);
		p.Cnd_pay_dpt_wg_nm.addAllListener(p);
		p.Cnd_pay_act_dt_fr.setListListener(p);
		p.Cnd_pay_act_dt_fr.addAllListener(p);
		p.Cnd_pay_act_dt_to.setListListener(p);
		p.Cnd_pay_act_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_adv_pay_act_no.setListListener(p);
		p.Cnd_adv_pay_act_no.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_ap_sttl_cd.setListListener(p);
		p.Cnd_ap_sttl_cd.addAllListener(p);
		p.Cnd_ap_sttl_nm.setListListener(p);
		p.Cnd_ap_sttl_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_AdvPay p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_AdvPay p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_AdvPay p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_adv_pay_act_no.addAllListener(p);
		p.columnRslt_adv_pay_act_no.setListListener(p);
		p.columnRslt_trd_cur_setoff_tgt_amt.addAllListener(p);
		p.columnRslt_trd_cur_setoff_tgt_amt.setListListener(p);
		p.columnRslt_trd_cur_setoff_schd_amt.addAllListener(p);
		p.columnRslt_trd_cur_setoff_schd_amt.setListListener(p);
		p.columnRslt_trd_cur_setoff_act_amt.addAllListener(p);
		p.columnRslt_trd_cur_setoff_act_amt.setListListener(p);
		p.columnRslt_trd_cur_not_proc_bal.addAllListener(p);
		p.columnRslt_trd_cur_not_proc_bal.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_pay_act_dt.addAllListener(p);
		p.columnRslt_pay_act_dt.setListListener(p);
		p.columnRslt_ap_sttl_cd.addAllListener(p);
		p.columnRslt_ap_sttl_cd.setListListener(p);
		p.columnRslt_ap_sttl_nm.addAllListener(p);
		p.columnRslt_ap_sttl_nm.setListListener(p);
		p.columnRslt_ap_sttl_typ.addAllListener(p);
		p.columnRslt_ap_sttl_typ.setListListener(p);
		p.columnRslt_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_pay_usr_cd.addAllListener(p);
		p.columnRslt_pay_usr_cd.setListListener(p);
		p.columnRslt_pay_usr_nm.addAllListener(p);
		p.columnRslt_pay_usr_nm.setListListener(p);
		p.columnRslt_pay_dpt_cd.addAllListener(p);
		p.columnRslt_pay_dpt_cd.setListListener(p);
		p.columnRslt_pay_dpt_nm.addAllListener(p);
		p.columnRslt_pay_dpt_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_note_days.addAllListener(p);
		p.columnRslt_note_days.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_draw_bank_cd.addAllListener(p);
		p.columnRslt_draw_bank_cd.setListListener(p);
		p.columnRslt_draw_bank_nm.addAllListener(p);
		p.columnRslt_draw_bank_nm.setListListener(p);
		p.columnRslt_draw_branch_cd.addAllListener(p);
		p.columnRslt_draw_branch_cd.setListListener(p);
		p.columnRslt_draw_branch_nm.addAllListener(p);
		p.columnRslt_draw_branch_nm.setListListener(p);
		p.columnRslt_endrsr.addAllListener(p);
		p.columnRslt_endrsr.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_AdvPay p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSUAP_AdvPay p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSUAP_AdvPay p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSUAP_AdvPay p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_AdvPay p){
		p.Cnd_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bsppl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bsppl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pay_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_adv_pay_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_AdvPay p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_AdvPay p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_AdvPay p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_setoff_tgt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_setoff_schd_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_setoff_act_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_not_proc_bal.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_AdvPay p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

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
		MSUAP_AdvPay_MC.setTableConfigRslt((MSUAP_AdvPay)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_AdvPay p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_adv_pay_act_no.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.adv_pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_no);
		p.columnRslt_trd_cur_setoff_tgt_amt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.trd_cur_setoff_tgt_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_setoff_tgt_amt);
		p.columnRslt_trd_cur_setoff_schd_amt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.trd_cur_setoff_schd_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_setoff_schd_amt);
		p.columnRslt_trd_cur_setoff_act_amt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.trd_cur_setoff_act_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_setoff_act_amt);
		p.columnRslt_trd_cur_not_proc_bal.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.trd_cur_not_proc_bal_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_not_proc_bal);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_pay_act_dt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.pay_act_dt_META);
		p.columnRslt_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_dt);
		p.columnRslt_ap_sttl_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_cd);
		p.columnRslt_ap_sttl_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_nm);
		p.columnRslt_ap_sttl_typ.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ);
		p.columnRslt_ap_sttl_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ_nm);
		p.columnRslt_pay_usr_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.pay_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_usr_cd);
		p.columnRslt_pay_usr_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.pay_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_usr_nm);
		p.columnRslt_pay_dpt_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.pay_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_cd);
		p.columnRslt_pay_dpt_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.pay_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.columnRslt_note_no.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_note_days.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.note_days_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_days);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_draw_bank_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.draw_bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_cd);
		p.columnRslt_draw_bank_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.draw_bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_nm);
		p.columnRslt_draw_branch_cd.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.draw_branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_cd);
		p.columnRslt_draw_branch_nm.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.draw_branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_nm);
		p.columnRslt_endrsr.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.endrsr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr);
		p.columnRslt_accptr.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSUA.MSUAP1130.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_pay_usr_cd.getListConfig().setPutter(getCnd_pay_usr_cd_ListPutter());
		Cnd_pay_dpt_cd.getListConfig().setPutter(getCnd_pay_dpt_cd_ListPutter());
		Cnd_pay_dpt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pay_dpt_wg_cd.getListConfig().setPutter(getCnd_pay_dpt_wg_cd_ListPutter());
		Cnd_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_sttl_cd.getListConfig().setPutter(getCnd_ap_sttl_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [Cnd_pay_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_pay_usr_cd) return getCnd_pay_usr_cd(row, info);
		if(combo == Cnd_pay_dpt_cd) return getCnd_pay_dpt_cd(row, info);
		if(combo == Cnd_pay_dpt_wg_cd) return getCnd_pay_dpt_wg_cd(row, info);
		if(combo == Cnd_ap_sttl_cd) return getCnd_ap_sttl_cd(row, info);
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
		else if (ap == Btn_accept) doBtn_accept(info);
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
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_bsppl_wg_cd) return doCnd_bsppl_wg_cd_VC(info);
		if (vc == Cnd_bsppl_wg_nm) return doCnd_bsppl_wg_nm_VC(info);
		if (vc == Cnd_bd_dpt_cd) return doCnd_bd_dpt_cd_VC(info);
		if (vc == Cnd_bd_dpt_nm) return doCnd_bd_dpt_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_pay_usr_cd) return doCnd_pay_usr_cd_VC(info);
		if (vc == Cnd_pay_usr_nm) return doCnd_pay_usr_nm_VC(info);
		if (vc == Cnd_pay_dpt_cd) return doCnd_pay_dpt_cd_VC(info);
		if (vc == Cnd_pay_dpt_nm) return doCnd_pay_dpt_nm_VC(info);
		if (vc == Cnd_pay_dpt_wg_cd) return doCnd_pay_dpt_wg_cd_VC(info);
		if (vc == Cnd_pay_dpt_wg_nm) return doCnd_pay_dpt_wg_nm_VC(info);
		if (vc == Cnd_pay_act_dt_fr) return doCnd_pay_act_dt_fr_VC(info);
		if (vc == Cnd_pay_act_dt_to) return doCnd_pay_act_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_adv_pay_act_no) return doCnd_adv_pay_act_no_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_ap_sttl_cd) return doCnd_ap_sttl_cd_VC(info);
		if (vc == Cnd_ap_sttl_nm) return doCnd_ap_sttl_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_adv_pay_act_no) return doRslt_adv_pay_act_no_VC(info);
		if (vc == columnRslt_trd_cur_setoff_tgt_amt) return doRslt_trd_cur_setoff_tgt_amt_VC(info);
		if (vc == columnRslt_trd_cur_setoff_schd_amt) return doRslt_trd_cur_setoff_schd_amt_VC(info);
		if (vc == columnRslt_trd_cur_setoff_act_amt) return doRslt_trd_cur_setoff_act_amt_VC(info);
		if (vc == columnRslt_trd_cur_not_proc_bal) return doRslt_trd_cur_not_proc_bal_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_pay_act_dt) return doRslt_pay_act_dt_VC(info);
		if (vc == columnRslt_ap_sttl_cd) return doRslt_ap_sttl_cd_VC(info);
		if (vc == columnRslt_ap_sttl_nm) return doRslt_ap_sttl_nm_VC(info);
		if (vc == columnRslt_ap_sttl_typ) return doRslt_ap_sttl_typ_VC(info);
		if (vc == columnRslt_ap_sttl_typ_nm) return doRslt_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_pay_usr_cd) return doRslt_pay_usr_cd_VC(info);
		if (vc == columnRslt_pay_usr_nm) return doRslt_pay_usr_nm_VC(info);
		if (vc == columnRslt_pay_dpt_cd) return doRslt_pay_dpt_cd_VC(info);
		if (vc == columnRslt_pay_dpt_nm) return doRslt_pay_dpt_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_note_days) return doRslt_note_days_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_draw_bank_cd) return doRslt_draw_bank_cd_VC(info);
		if (vc == columnRslt_draw_bank_nm) return doRslt_draw_bank_nm_VC(info);
		if (vc == columnRslt_draw_branch_cd) return doRslt_draw_branch_cd_VC(info);
		if (vc == columnRslt_draw_branch_nm) return doRslt_draw_branch_nm_VC(info);
		if (vc == columnRslt_endrsr) return doRslt_endrsr_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
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
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[match_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_match_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_tgt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_setoff_tgt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_schd_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_setoff_schd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_act_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_setoff_act_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_not_proc_bal]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_not_proc_bal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_bsppl_wg_cd) doCnd_bsppl_wg_cd_NC(info);
		else if (nc == Cnd_bsppl_wg_nm) doCnd_bsppl_wg_nm_NC(info);
		else if (nc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NC(info);
		else if (nc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NC(info);
		else if (nc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NC(info);
		else if (nc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NC(info);
		else if (nc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NC(info);
		else if (nc == Cnd_pay_dpt_wg_cd) doCnd_pay_dpt_wg_cd_NC(info);
		else if (nc == Cnd_pay_dpt_wg_nm) doCnd_pay_dpt_wg_nm_NC(info);
		else if (nc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NC(info);
		else if (nc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NC(info);
		else if (nc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NC(info);
		else if (nc == columnRslt_trd_cur_setoff_tgt_amt) doRslt_trd_cur_setoff_tgt_amt_NC(info);
		else if (nc == columnRslt_trd_cur_setoff_schd_amt) doRslt_trd_cur_setoff_schd_amt_NC(info);
		else if (nc == columnRslt_trd_cur_setoff_act_amt) doRslt_trd_cur_setoff_act_amt_NC(info);
		else if (nc == columnRslt_trd_cur_not_proc_bal) doRslt_trd_cur_not_proc_bal_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_pay_act_dt) doRslt_pay_act_dt_NC(info);
		else if (nc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NC(info);
		else if (nc == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NC(info);
		else if (nc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NC(info);
		else if (nc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_note_days) doRslt_note_days_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NC(info);
		else if (nc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NC(info);
		else if (nc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NC(info);
		else if (nc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NC(info);
		else if (nc == columnRslt_endrsr) doRslt_endrsr_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_tgt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_tgt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_schd_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_schd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_act_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_act_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_not_proc_bal]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_not_proc_bal_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_bsppl_wg_cd) doCnd_bsppl_wg_cd_NE(info);
		else if (ne == Cnd_bsppl_wg_nm) doCnd_bsppl_wg_nm_NE(info);
		else if (ne == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NE(info);
		else if (ne == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NE(info);
		else if (ne == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NE(info);
		else if (ne == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NE(info);
		else if (ne == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NE(info);
		else if (ne == Cnd_pay_dpt_wg_cd) doCnd_pay_dpt_wg_cd_NE(info);
		else if (ne == Cnd_pay_dpt_wg_nm) doCnd_pay_dpt_wg_nm_NE(info);
		else if (ne == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NE(info);
		else if (ne == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NE(info);
		else if (ne == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NE(info);
		else if (ne == columnRslt_trd_cur_setoff_tgt_amt) doRslt_trd_cur_setoff_tgt_amt_NE(info);
		else if (ne == columnRslt_trd_cur_setoff_schd_amt) doRslt_trd_cur_setoff_schd_amt_NE(info);
		else if (ne == columnRslt_trd_cur_setoff_act_amt) doRslt_trd_cur_setoff_act_amt_NE(info);
		else if (ne == columnRslt_trd_cur_not_proc_bal) doRslt_trd_cur_not_proc_bal_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_pay_act_dt) doRslt_pay_act_dt_NE(info);
		else if (ne == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NE(info);
		else if (ne == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NE(info);
		else if (ne == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NE(info);
		else if (ne == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_note_days) doRslt_note_days_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NE(info);
		else if (ne == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NE(info);
		else if (ne == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NE(info);
		else if (ne == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NE(info);
		else if (ne == columnRslt_endrsr) doRslt_endrsr_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_tgt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_tgt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_schd_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_schd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_act_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_act_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_not_proc_bal]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_not_proc_bal_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_bsppl_wg_cd) doCnd_bsppl_wg_cd_NX(info);
		else if (nx == Cnd_bsppl_wg_nm) doCnd_bsppl_wg_nm_NX(info);
		else if (nx == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NX(info);
		else if (nx == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NX(info);
		else if (nx == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NX(info);
		else if (nx == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NX(info);
		else if (nx == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NX(info);
		else if (nx == Cnd_pay_dpt_wg_cd) doCnd_pay_dpt_wg_cd_NX(info);
		else if (nx == Cnd_pay_dpt_wg_nm) doCnd_pay_dpt_wg_nm_NX(info);
		else if (nx == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NX(info);
		else if (nx == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NX(info);
		else if (nx == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NX(info);
		else if (nx == columnRslt_trd_cur_setoff_tgt_amt) doRslt_trd_cur_setoff_tgt_amt_NX(info);
		else if (nx == columnRslt_trd_cur_setoff_schd_amt) doRslt_trd_cur_setoff_schd_amt_NX(info);
		else if (nx == columnRslt_trd_cur_setoff_act_amt) doRslt_trd_cur_setoff_act_amt_NX(info);
		else if (nx == columnRslt_trd_cur_not_proc_bal) doRslt_trd_cur_not_proc_bal_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_pay_act_dt) doRslt_pay_act_dt_NX(info);
		else if (nx == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NX(info);
		else if (nx == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NX(info);
		else if (nx == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NX(info);
		else if (nx == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_note_days) doRslt_note_days_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NX(info);
		else if (nx == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NX(info);
		else if (nx == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NX(info);
		else if (nx == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NX(info);
		else if (nx == columnRslt_endrsr) doRslt_endrsr_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_tgt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_tgt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_schd_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_schd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_act_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_act_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_not_proc_bal]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_not_proc_bal_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_bsppl_wg_cd) doCnd_bsppl_wg_cd_LC(info);
		else if (lc == Cnd_bsppl_wg_nm) doCnd_bsppl_wg_nm_LC(info);
		else if (lc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_LC(info);
		else if (lc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_LC(info);
		else if (lc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_LC(info);
		else if (lc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_LC(info);
		else if (lc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_LC(info);
		else if (lc == Cnd_pay_dpt_wg_cd) doCnd_pay_dpt_wg_cd_LC(info);
		else if (lc == Cnd_pay_dpt_wg_nm) doCnd_pay_dpt_wg_nm_LC(info);
		else if (lc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_LC(info);
		else if (lc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_LC(info);
		else if (lc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_LC(info);
		else if (lc == columnRslt_trd_cur_setoff_tgt_amt) doRslt_trd_cur_setoff_tgt_amt_LC(info);
		else if (lc == columnRslt_trd_cur_setoff_schd_amt) doRslt_trd_cur_setoff_schd_amt_LC(info);
		else if (lc == columnRslt_trd_cur_setoff_act_amt) doRslt_trd_cur_setoff_act_amt_LC(info);
		else if (lc == columnRslt_trd_cur_not_proc_bal) doRslt_trd_cur_not_proc_bal_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_pay_act_dt) doRslt_pay_act_dt_LC(info);
		else if (lc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_LC(info);
		else if (lc == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_LC(info);
		else if (lc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_LC(info);
		else if (lc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_note_days) doRslt_note_days_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_LC(info);
		else if (lc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_LC(info);
		else if (lc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_LC(info);
		else if (lc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_LC(info);
		else if (lc == columnRslt_endrsr) doRslt_endrsr_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_tgt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_tgt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_schd_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_schd_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_setoff_act_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_setoff_act_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_not_proc_bal]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_not_proc_bal_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_usr_cd]の作成メソッド
	 */
	public MCList getCnd_pay_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_wg_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_sttl_cd]の作成メソッド
	 */
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}