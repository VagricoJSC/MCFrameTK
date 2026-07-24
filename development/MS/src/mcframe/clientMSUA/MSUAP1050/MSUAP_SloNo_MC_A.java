package mcframe.clientMSUA.MSUAP1050;

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
 * 画面"MSUAP_SloNo"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_SloNo_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SCREEN_ID = "MSUAP1050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_in_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_in_slo_d_no = null;
	/**
	 * Search sales order details 受注明細検索.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_d_no_srh_flg = null;
	/**
	 * Reference authority only 参照権限ありのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_ref_auth_flg = null;
	/**
	 * Only controlled advance received shipping 前受金出荷制御対象のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_adv_rcv_flg = null;
	public MCLabel Cnd_slo_dt_fr_Label = null;
	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_fr = null;
	public MCLabel Cnd_slo_dt_to_Label = null;
	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_to = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCCheckBox Cnd_vmi_flg = null;
	public MCLabel Cnd_sls_usr_cd_Label = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_cst_itm_cd_Label = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_nm = null;
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
	public MCTable2<mcframe.clientMSUA.MSUAP1050.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_dt = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_nm = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
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
	private final mcframe.clientMSUA.MSUAP1050.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1050.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1050.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1050.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1050.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1050.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1050.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1050.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1050.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1050.RsltR.class);
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
	public MSUAP_SloNo_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_SloNo_MC_A(String name) {
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
		MSUAP_SloNo_MC.jbCreateTop((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbCreateCnd((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbCreateSrchBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbCreateCtrl((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbCreateRslt((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbCreateBtn((MSUAP_SloNo)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_SloNo p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_SloNo p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_SloNo p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_SloNo p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_SloNo p) {
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSUA.MSUAP1050.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSUA.MSUAP1050.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_SloNo p) {
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

	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_usr_cd_p = null;

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_usr_cd_ListPutter() {
		if (Cnd_sls_usr_cd_p == null) {
			Cnd_sls_usr_cd_p = createCnd_sls_usr_cd_ListPutter(Cnd_sls_usr_cd, "sls_usr_cd", "sls_usr_nm");

		}
		return Cnd_sls_usr_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_SloNo create(){
		MSUAP_SloNo p = new MSUAP_SloNo();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_SloNo create(String name){
		MSUAP_SloNo p = new MSUAP_SloNo(name);
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
		MSUAP_SloNo_MC.jbfInitTop((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbfInitCnd((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbfInitSrchBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbfInitCtrl((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbfInitRslt((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbfInitBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitTop((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitCnd((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitSrchBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitCtrl((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitRslt((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.jbInitBtn((MSUAP_SloNo)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_in_slo_d_no_Label = p.beansFactory.createLabel("Cnd.in_slo_d_no_Label");
		p.Cnd_in_slo_d_no = p.beansFactory.createTextField("Cnd.in_slo_d_no");
		p.Cnd_in_slo_d_no.setLabel(p.Cnd_in_slo_d_no_Label);
		p.Cnd_slo_d_no_srh_flg = p.beansFactory.createCheckBox("Cnd.slo_d_no_srh_flg");
		p.Cnd_ref_auth_flg = p.beansFactory.createCheckBox("Cnd.ref_auth_flg");
		p.Cnd_adv_rcv_flg = p.beansFactory.createCheckBox("Cnd.adv_rcv_flg");
		p.Cnd_slo_dt_fr_Label = p.beansFactory.createLabel("Cnd.slo_dt_fr_Label");
		p.Cnd_slo_dt_fr = p.beansFactory.createDateField("Cnd.slo_dt_fr");
		p.Cnd_slo_dt_fr.setLabel(p.Cnd_slo_dt_fr_Label);
		p.Cnd_slo_dt_to_Label = p.beansFactory.createLabel("Cnd.slo_dt_to_Label");
		p.Cnd_slo_dt_to = p.beansFactory.createDateField("Cnd.slo_dt_to");
		p.Cnd_slo_dt_to.setLabel(p.Cnd_slo_dt_to_Label);
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_vmi_flg = p.beansFactory.createCheckBox("Cnd.vmi_flg");
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_slo_dt = p.beansFactory.createTableColumn("Rslt.slo_dt", MCColumnType.DATE);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_SloNo p) {
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
	protected static void jbInitTop(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.TopPanel.add(p.SrchBtnPanel, null);
		p.SrchBtnPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.CndPanel.setLastBeans(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_in_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_in_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_in_slo_d_no);
		p.Cnd_in_slo_d_no.setNextBeans(p.Cnd_slo_d_no_srh_flg);
		p.Cnd_in_slo_d_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.in_slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_in_slo_d_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_srh_flg);
		p.Cnd_slo_d_no_srh_flg.setNextBeans(p.Cnd_ref_auth_flg);
		p.Cnd_slo_d_no_srh_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.slo_d_no_srh_flg_META);
		p.CndPanel.add(p.Cnd_ref_auth_flg);
		p.Cnd_ref_auth_flg.setNextBeans(p.Cnd_adv_rcv_flg);
		p.Cnd_ref_auth_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.ref_auth_flg_META);
		p.CndPanel.add(p.Cnd_adv_rcv_flg);
		p.Cnd_adv_rcv_flg.setNextBeans(p.Cnd_slo_dt_fr);
		p.Cnd_adv_rcv_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.adv_rcv_flg_META);
		p.CndPanel.add(p.Cnd_slo_dt_fr_Label);
		p.CndPanel.add(p.Cnd_slo_dt_fr);
		p.Cnd_slo_dt_fr.setNextBeans(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_fr.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.slo_dt_fr_META);
		p.Cnd_slo_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_slo_dt_to_Label);
		p.CndPanel.add(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_to.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_slo_dt_to.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.slo_dt_to_META);
		p.Cnd_slo_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_vmi_flg);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_vmi_flg);
		p.Cnd_vmi_flg.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_vmi_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.vmi_flg_META);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.cst_itm_cd_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
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
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1050.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_SloNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_SloNo p) {
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
	protected static void jbInitRslt(MSUAP_SloNo p) {
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
	protected static void jbInitBtn(MSUAP_SloNo p) {
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
		MSUAP_SloNo_MC.mcInitTop((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.mcInitCnd((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.mcInitSrchBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.mcInitCtrl((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.mcInitRslt((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.mcInitBtn((MSUAP_SloNo)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_SloNo_MC.statusInitSRCH_Top((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.statusInitSRCH_Cnd((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.statusInitSRCH_SrchBtn((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.statusInitSRCH_Ctrl((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.statusInitSRCH_Rslt((MSUAP_SloNo)this);
		MSUAP_SloNo_MC.statusInitSRCH_Btn((MSUAP_SloNo)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_SloNo p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_SloNo p) {
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_in_slo_d_no.setListListener(p);
		p.Cnd_in_slo_d_no.addAllListener(p);
		p.Cnd_slo_d_no_srh_flg.addAllListener(p);
		p.Cnd_ref_auth_flg.addAllListener(p);
		p.Cnd_adv_rcv_flg.addAllListener(p);
		p.Cnd_slo_dt_fr.setListListener(p);
		p.Cnd_slo_dt_fr.addAllListener(p);
		p.Cnd_slo_dt_to.setListListener(p);
		p.Cnd_slo_dt_to.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_vmi_flg.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_SloNo p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_SloNo p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_SloNo p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_slo_dt.addAllListener(p);
		p.columnRslt_slo_dt.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_SloNo p) {
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
	protected static void statusInitSRCH_Top(MSUAP_SloNo p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_SloNo p){
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no_srh_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ref_auth_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_adv_rcv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_slo_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vmi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_SloNo p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_SloNo p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_SloNo p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_SloNo p){
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
		MSUAP_SloNo_MC.setTableConfigRslt((MSUAP_SloNo)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_SloNo p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_slo_dt.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.slo_dt_META);
		p.columnRslt_slo_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_dt);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSUA.MSUAP1050.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
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
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
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
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_in_slo_d_no) return doCnd_in_slo_d_no_VC(info);
		if (vc == Cnd_slo_d_no_srh_flg) return doCnd_slo_d_no_srh_flg_VC(info);
		if (vc == Cnd_ref_auth_flg) return doCnd_ref_auth_flg_VC(info);
		if (vc == Cnd_adv_rcv_flg) return doCnd_adv_rcv_flg_VC(info);
		if (vc == Cnd_slo_dt_fr) return doCnd_slo_dt_fr_VC(info);
		if (vc == Cnd_slo_dt_to) return doCnd_slo_dt_to_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_vmi_flg) return doCnd_vmi_flg_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_slo_dt) return doRslt_slo_dt_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
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
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_d_no_srh_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_d_no_srh_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ref_auth_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ref_auth_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_in_slo_d_no) doCnd_in_slo_d_no_NC(info);
		else if (nc == Cnd_slo_d_no_srh_flg) doCnd_slo_d_no_srh_flg_NC(info);
		else if (nc == Cnd_ref_auth_flg) doCnd_ref_auth_flg_NC(info);
		else if (nc == Cnd_adv_rcv_flg) doCnd_adv_rcv_flg_NC(info);
		else if (nc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NC(info);
		else if (nc == Cnd_slo_dt_to) doCnd_slo_dt_to_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_vmi_flg) doCnd_vmi_flg_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_slo_dt) doRslt_slo_dt_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no_srh_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_srh_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_auth_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_auth_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_in_slo_d_no) doCnd_in_slo_d_no_NE(info);
		else if (ne == Cnd_slo_d_no_srh_flg) doCnd_slo_d_no_srh_flg_NE(info);
		else if (ne == Cnd_ref_auth_flg) doCnd_ref_auth_flg_NE(info);
		else if (ne == Cnd_adv_rcv_flg) doCnd_adv_rcv_flg_NE(info);
		else if (ne == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NE(info);
		else if (ne == Cnd_slo_dt_to) doCnd_slo_dt_to_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_vmi_flg) doCnd_vmi_flg_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_slo_dt) doRslt_slo_dt_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no_srh_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_srh_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_auth_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_auth_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_in_slo_d_no) doCnd_in_slo_d_no_NX(info);
		else if (nx == Cnd_slo_d_no_srh_flg) doCnd_slo_d_no_srh_flg_NX(info);
		else if (nx == Cnd_ref_auth_flg) doCnd_ref_auth_flg_NX(info);
		else if (nx == Cnd_adv_rcv_flg) doCnd_adv_rcv_flg_NX(info);
		else if (nx == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NX(info);
		else if (nx == Cnd_slo_dt_to) doCnd_slo_dt_to_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_vmi_flg) doCnd_vmi_flg_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_slo_dt) doRslt_slo_dt_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no_srh_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_srh_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_auth_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_auth_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_in_slo_d_no) doCnd_in_slo_d_no_LC(info);
		else if (lc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_LC(info);
		else if (lc == Cnd_slo_dt_to) doCnd_slo_dt_to_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_slo_dt) doRslt_slo_dt_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sls_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}