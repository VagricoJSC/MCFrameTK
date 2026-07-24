package mcframe.clientMSBE.MSBEP1430;

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
import mcframe.clientMSBE.MSBEP1430.MSBEP_ShipPlnSrch_MC.MS_MSBEL1430_Srch01Caller;

/**
 * 画面"MSBEP_ShipPlnSrch"パネルクラスです。<p>
 *
 * 出荷計画を確認する<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipPlnSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP1430";

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
	public MCTitledBorder FoldTitledBorder = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [AllocSts]ブロック関連のField定義
	public MCPanel AllocStsPanel = null;
	public MCTitledBorder AllocStsTitledBorder = null;
	// [AllocSts]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public MCCheckBox Cnd_not_alloc_flg = null;
	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public MCCheckBox Cnd_part_alloc_flg = null;
	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public MCCheckBox Cnd_all_alloc_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_invalid_flg = null;
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
	public MCLabel Cnd_ship_wk_grp_cd_Label = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_wk_grp_nm = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ssdt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ssdt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ssdt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ssdt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ssdt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	/**
	 * Shipping available only 出荷可能のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_abl_only_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMSBE.MSBEP1430.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_ship_schd_dt;// [Rslt]の[ship_schd_dt_p.ymd]を[columnRslt_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_schd_hm;// [Rslt]の[ship_schd_dt_p.hm]を[columnRslt_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_dlv_schd_dt;// [Rslt]の[dlv_schd_dt_p.ymd]を[columnRslt_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_schd_hm;// [Rslt]の[dlv_schd_dt_p.hm]を[columnRslt_dlv_schd_hm]としてエイリアス定義。
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_nm = null;
	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_inst_ship_to_cnt = null;
	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_inst_d_cnt = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_inst_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_inst_dim = null;
	/**
	 * Number of receiving point 送付先数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_ship_to_cnt = null;
	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_cnt = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dim = null;
	public MCColumnGroup cgRslt_not_inst_grp = null;
	public MCColumnGroup cgRslt_inst_grp = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBEL1430_Srch01]のCallerの作成 */
	protected MSBEP_ShipPlnSrch_MC.MS_MSBEL1430_Srch01Caller createMS_MSBEL1430_Srch01() {
		MSBEP_ShipPlnSrch_MC.MS_MSBEL1430_Srch01Caller<MSBEP_ShipPlnSrch, MS_MSBEL1430_Srch01Bridge>
		caller = ((MSBEP_ShipPlnSrch_MC)this).new MS_MSBEL1430_Srch01Caller<MSBEP_ShipPlnSrch, MS_MSBEL1430_Srch01Bridge>(
					(MSBEP_ShipPlnSrch)this, new MS_MSBEL1430_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1430_Srch01]の呼び出し */
	protected void callMS_MSBEL1430_Srch01() {
		MCCaller caller = createMS_MSBEL1430_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1430.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1430.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1430.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1430.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1430.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1430.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1430.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1430.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1430.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1430.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1430.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1430.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createColumnGroupTable("Rslt.table");
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
		ret.add(AllocStsPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipPlnSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipPlnSrch_MC_A(String name) {
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
		MSBEP_ShipPlnSrch_MC.jbCreateTop((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbCreateFold((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbCreateAllocSts((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbCreateCnd((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbCreateCtrl((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbCreateRslt((MSBEP_ShipPlnSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ShipPlnSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ShipPlnSrch p) {
	}

	/**
	 * [AllocSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocSts(MSBEP_ShipPlnSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipPlnSrch p) {
		p.Cnd_ssdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ssdt_p());
		p.Cnd_ssdt_p_PPanel.setName("Cnd.ssdt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_ShipPlnSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ShipPlnSrch p) {
		p.Rslt_ship_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1430.RsltR.$ship_schd_dt_p);
		p.Rslt_ship_schd_dt_p_PPanel.setName("Rslt.ship_schd_dt_p");
		p.columnRslt_ship_schd_dt = p.Rslt_ship_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_schd_dt.addAliasName("Rslt.ship_schd_dt", p);
		p.columnRslt_ship_schd_hm = p.Rslt_ship_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_schd_hm.addAliasName("Rslt.ship_schd_hm", p);
		p.Rslt_dlv_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1430.RsltR.$dlv_schd_dt_p);
		p.Rslt_dlv_schd_dt_p_PPanel.setName("Rslt.dlv_schd_dt_p");
		p.columnRslt_dlv_schd_dt = p.Rslt_dlv_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_schd_dt.addAliasName("Rslt.dlv_schd_dt", p);
		p.columnRslt_dlv_schd_hm = p.Rslt_dlv_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_schd_hm.addAliasName("Rslt.dlv_schd_hm", p);
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

	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
	}
	
	
	/** [Cnd_ship_wk_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_wk_grp_cd_p = null;

	/**
	 * [Cnd_ship_wk_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_wk_grp_cd_ListPutter() {
		if (Cnd_ship_wk_grp_cd_p == null) {
			Cnd_ship_wk_grp_cd_p = createCnd_ship_wk_grp_cd_ListPutter(Cnd_ship_wk_grp_cd, "ship_wk_grp_cd", "ship_wk_grp_nm");

		}
		return Cnd_ship_wk_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipPlnSrch create(){
		MSBEP_ShipPlnSrch p = new MSBEP_ShipPlnSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipPlnSrch create(String name){
		MSBEP_ShipPlnSrch p = new MSBEP_ShipPlnSrch(name);
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
		MSBEP_ShipPlnSrch_MC.jbfInitTop((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbfInitFold((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbfInitAllocSts((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbfInitCnd((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbfInitCtrl((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbfInitRslt((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitTop((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitFold((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitAllocSts((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitCnd((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitCtrl((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.jbInitRslt((MSBEP_ShipPlnSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTitledBorder = p.beansFactory.createTitledBorder();
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocSts(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.AllocStsPanel = p.beansFactory.createPanel("AllocSts");
		p.AllocStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_not_alloc_flg = p.beansFactory.createCheckBox("Cnd.not_alloc_flg");
		p.Cnd_part_alloc_flg = p.beansFactory.createCheckBox("Cnd.part_alloc_flg");
		p.Cnd_all_alloc_flg = p.beansFactory.createCheckBox("Cnd.all_alloc_flg");
		p.Cnd_alloc_invalid_flg = p.beansFactory.createCheckBox("Cnd.alloc_invalid_flg");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_ship_wk_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_grp_cd_Label");
		p.Cnd_ship_wk_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_grp_cd");
		p.Cnd_ship_wk_grp_cd.setLabel(p.Cnd_ship_wk_grp_cd_Label);
		p.Cnd_ship_wk_grp_nm = p.beansFactory.createTextField("Cnd.ship_wk_grp_nm");
		p.Cnd_ship_abl_only_flg = p.beansFactory.createCheckBox("Cnd.ship_abl_only_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_wk_cd = p.beansFactory.createTableColumn("Rslt.ship_wk_cd", MCColumnType.TEXT);
		p.columnRslt_ship_wk_nm = p.beansFactory.createTableColumn("Rslt.ship_wk_nm", MCColumnType.TEXT);
		p.columnRslt_not_inst_ship_to_cnt = p.beansFactory.createTableColumn("Rslt.not_inst_ship_to_cnt", MCColumnType.NUMBER);
		p.columnRslt_not_inst_d_cnt = p.beansFactory.createTableColumn("Rslt.not_inst_d_cnt", MCColumnType.NUMBER);
		p.columnRslt_not_inst_wt = p.beansFactory.createTableColumn("Rslt.not_inst_wt", MCColumnType.NUMBER);
		p.columnRslt_not_inst_dim = p.beansFactory.createTableColumn("Rslt.not_inst_dim", MCColumnType.NUMBER);
		p.columnRslt_inst_ship_to_cnt = p.beansFactory.createTableColumn("Rslt.inst_ship_to_cnt", MCColumnType.NUMBER);
		p.columnRslt_inst_d_cnt = p.beansFactory.createTableColumn("Rslt.inst_d_cnt", MCColumnType.NUMBER);
		p.columnRslt_inst_wt = p.beansFactory.createTableColumn("Rslt.inst_wt", MCColumnType.NUMBER);
		p.columnRslt_inst_dim = p.beansFactory.createTableColumn("Rslt.inst_dim", MCColumnType.NUMBER);
		p.cgRslt_not_inst_grp = p.beansFactory.createColumnGroup("Rslt.not_inst_grp");
		p.cgRslt_inst_grp = p.beansFactory.createColumnGroup("Rslt.inst_grp");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setBorder(p.FoldTitledBorder);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.AllocStsPanel, null);
		p.FoldPanel.setLastBeans(p.AllocStsPanel);
		p.AllocStsPanel.setNextBeans(p.CndPanel);
		p.FoldPanel.add(p.CndPanel, null);
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocSts(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.AllocStsPanel.setBorder(p.AllocStsTitledBorder);
		p.AllocStsPanel.setValueCheck(false);
		p.AllocStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocStsPanel.setLayoutPosition("CN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.AllocStsPanel.add(p.Cnd_not_alloc_flg);
		p.AllocStsPanel.setLastBeans(p.Cnd_not_alloc_flg);
		p.Cnd_not_alloc_flg.setNextBeans(p.Cnd_part_alloc_flg);
		p.Cnd_not_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.not_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_part_alloc_flg);
		p.Cnd_part_alloc_flg.setNextBeans(p.Cnd_all_alloc_flg);
		p.Cnd_part_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.part_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_all_alloc_flg);
		p.Cnd_all_alloc_flg.setNextBeans(p.Cnd_alloc_invalid_flg);
		p.Cnd_all_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.all_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_alloc_invalid_flg);
		p.Cnd_alloc_invalid_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.alloc_invalid_flg_META);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_ship_wk_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_ship_wk_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_cd, true);
		p.Cnd_ship_wk_grp_cd.setLinkBeans(p.Cnd_ship_wk_grp_nm);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd);
		p.Cnd_ship_wk_grp_cd.setNextBeans(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.ship_wk_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_nm.setNextBeans(p.Cnd_ssdt_p_PPanel);
		p.Cnd_ship_wk_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.ship_wk_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_nm, true);
		p.CndPanel.add(p.Cnd_ssdt_p_PPanel);
		p.Cnd_ssdt_p_PPanel.setNextBeans(p.Cnd_ship_abl_only_flg);
		p.CndPanel.add(p.Cnd_ship_abl_only_flg);
		p.Cnd_ship_abl_only_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1430.CndR.ship_abl_only_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ShipPlnSrch p) {
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
	protected static void jbInitRslt(MSBEP_ShipPlnSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
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
		MSBEP_ShipPlnSrch_MC.mcInitTop((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.mcInitFold((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.mcInitAllocSts((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.mcInitCnd((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.mcInitCtrl((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.mcInitRslt((MSBEP_ShipPlnSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_Top((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_Fold((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_AllocSts((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_Cnd((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_Ctrl((MSBEP_ShipPlnSrch)this);
		MSBEP_ShipPlnSrch_MC.statusInitSRCH_Rslt((MSBEP_ShipPlnSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ShipPlnSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ShipPlnSrch p) {
	}

	/**
	 *  [AllocSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocSts(MSBEP_ShipPlnSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipPlnSrch p) {
		p.Cnd_not_alloc_flg.addAllListener(p);
		p.Cnd_part_alloc_flg.addAllListener(p);
		p.Cnd_all_alloc_flg.addAllListener(p);
		p.Cnd_alloc_invalid_flg.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_ship_wk_grp_cd.setListListener(p);
		p.Cnd_ship_wk_grp_cd.addAllListener(p);
		p.Cnd_ship_wk_grp_nm.setListListener(p);
		p.Cnd_ship_wk_grp_nm.addAllListener(p);
		p.Cnd_ship_abl_only_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ShipPlnSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ShipPlnSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_ship_wk_cd.addAllListener(p);
		p.columnRslt_ship_wk_cd.setListListener(p);
		p.columnRslt_ship_wk_nm.addAllListener(p);
		p.columnRslt_ship_wk_nm.setListListener(p);
		p.columnRslt_not_inst_ship_to_cnt.addAllListener(p);
		p.columnRslt_not_inst_ship_to_cnt.setListListener(p);
		p.columnRslt_not_inst_d_cnt.addAllListener(p);
		p.columnRslt_not_inst_d_cnt.setListListener(p);
		p.columnRslt_not_inst_wt.addAllListener(p);
		p.columnRslt_not_inst_wt.setListListener(p);
		p.columnRslt_not_inst_dim.addAllListener(p);
		p.columnRslt_not_inst_dim.setListListener(p);
		p.columnRslt_inst_ship_to_cnt.addAllListener(p);
		p.columnRslt_inst_ship_to_cnt.setListListener(p);
		p.columnRslt_inst_d_cnt.addAllListener(p);
		p.columnRslt_inst_d_cnt.setListListener(p);
		p.columnRslt_inst_wt.addAllListener(p);
		p.columnRslt_inst_wt.setListListener(p);
		p.columnRslt_inst_dim.addAllListener(p);
		p.columnRslt_inst_dim.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_ShipPlnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_ShipPlnSrch p){

	}

	/**
	 * [SRCH]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocSts(MSBEP_ShipPlnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ShipPlnSrch p){
		p.Cnd_not_alloc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_abl_only_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_ShipPlnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_ShipPlnSrch p){
		p.columnRslt_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ship_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_inst_ship_to_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_inst_d_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_inst_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_inst_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inst_ship_to_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inst_d_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inst_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inst_dim.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MSBEP_ShipPlnSrch_MC.setTableConfigRslt((MSBEP_ShipPlnSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ShipPlnSrch p) {
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.RsltTable.addTable(p.Rslt_ship_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_schd_dt_p_PPanel.YmdHmTable);
		p.columnRslt_ship_wk_cd.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.ship_wk_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_cd);
		p.columnRslt_ship_wk_nm.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.ship_wk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_nm);
		p.columnRslt_not_inst_ship_to_cnt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.not_inst_ship_to_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_inst_ship_to_cnt);
		p.columnRslt_not_inst_d_cnt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.not_inst_d_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_inst_d_cnt);
		p.columnRslt_not_inst_wt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.not_inst_wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_inst_wt);
		p.columnRslt_not_inst_dim.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.not_inst_dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_inst_dim);
		p.columnRslt_inst_ship_to_cnt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.inst_ship_to_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_ship_to_cnt);
		p.columnRslt_inst_d_cnt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.inst_d_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_cnt);
		p.columnRslt_inst_wt.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.inst_wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_wt);
		p.columnRslt_inst_dim.setMeta(mcframe.clientMSBE.MSBEP1430.RsltR.inst_dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dim);
		p.RsltTable.addColumnGroup(p.Rslt_ship_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addColumnGroup(p.Rslt_dlv_schd_dt_p_PPanel.YmdHmTable);
		p.cgRslt_not_inst_grp.add(p.columnRslt_not_inst_ship_to_cnt);
		p.cgRslt_not_inst_grp.add(p.columnRslt_not_inst_d_cnt);
		p.cgRslt_not_inst_grp.add(p.columnRslt_not_inst_wt);
		p.cgRslt_not_inst_grp.add(p.columnRslt_not_inst_dim);
		p.RsltTable.addColumnGroup(p.cgRslt_not_inst_grp);
		p.cgRslt_inst_grp.add(p.columnRslt_inst_ship_to_cnt);
		p.cgRslt_inst_grp.add(p.columnRslt_inst_d_cnt);
		p.cgRslt_inst_grp.add(p.columnRslt_inst_wt);
		p.cgRslt_inst_grp.add(p.columnRslt_inst_dim);
		p.RsltTable.addColumnGroup(p.cgRslt_inst_grp);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_ship_wk_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_grp_cd.getListConfig().setPutter(getCnd_ship_wk_grp_cd_ListPutter());
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
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_wk_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWkGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_ship_wk_grp_cd) return getCnd_ship_wk_grp_cd(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == Cnd_not_alloc_flg) return doCnd_not_alloc_flg_VC(info);
		if (vc == Cnd_part_alloc_flg) return doCnd_part_alloc_flg_VC(info);
		if (vc == Cnd_all_alloc_flg) return doCnd_all_alloc_flg_VC(info);
		if (vc == Cnd_alloc_invalid_flg) return doCnd_alloc_invalid_flg_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_ship_wk_grp_cd) return doCnd_ship_wk_grp_cd_VC(info);
		if (vc == Cnd_ship_wk_grp_nm) return doCnd_ship_wk_grp_nm_VC(info);
		if (vc == Cnd_ship_abl_only_flg) return doCnd_ship_abl_only_flg_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_wk_cd) return doRslt_ship_wk_cd_VC(info);
		if (vc == columnRslt_ship_wk_nm) return doRslt_ship_wk_nm_VC(info);
		if (vc == columnRslt_not_inst_ship_to_cnt) return doRslt_not_inst_ship_to_cnt_VC(info);
		if (vc == columnRslt_not_inst_d_cnt) return doRslt_not_inst_d_cnt_VC(info);
		if (vc == columnRslt_not_inst_wt) return doRslt_not_inst_wt_VC(info);
		if (vc == columnRslt_not_inst_dim) return doRslt_not_inst_dim_VC(info);
		if (vc == columnRslt_inst_ship_to_cnt) return doRslt_inst_ship_to_cnt_VC(info);
		if (vc == columnRslt_inst_d_cnt) return doRslt_inst_d_cnt_VC(info);
		if (vc == columnRslt_inst_wt) return doRslt_inst_wt_VC(info);
		if (vc == columnRslt_inst_dim) return doRslt_inst_dim_VC(info);
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
	 * [Cnd]パネルの[not_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_all_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_abl_only_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_abl_only_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_inst_ship_to_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_inst_ship_to_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_inst_d_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_inst_d_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_inst_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_inst_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_inst_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_inst_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_ship_to_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_ship_to_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_d_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dim_VC(MCEventInfo info){
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
		else if (nc == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NC(info);
		else if (nc == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NC(info);
		else if (nc == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NC(info);
		else if (nc == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NC(info);
		else if (nc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NC(info);
		else if (nc == Cnd_ship_abl_only_flg) doCnd_ship_abl_only_flg_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NC(info);
		else if (nc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NC(info);
		else if (nc == columnRslt_not_inst_ship_to_cnt) doRslt_not_inst_ship_to_cnt_NC(info);
		else if (nc == columnRslt_not_inst_d_cnt) doRslt_not_inst_d_cnt_NC(info);
		else if (nc == columnRslt_not_inst_wt) doRslt_not_inst_wt_NC(info);
		else if (nc == columnRslt_not_inst_dim) doRslt_not_inst_dim_NC(info);
		else if (nc == columnRslt_inst_ship_to_cnt) doRslt_inst_ship_to_cnt_NC(info);
		else if (nc == columnRslt_inst_d_cnt) doRslt_inst_d_cnt_NC(info);
		else if (nc == columnRslt_inst_wt) doRslt_inst_wt_NC(info);
		else if (nc == columnRslt_inst_dim) doRslt_inst_dim_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_abl_only_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_abl_only_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_ship_to_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_ship_to_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_d_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_d_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_dim_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_ship_to_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_ship_to_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dim_NC(MCEventInfo info){
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
		else if (ne == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NE(info);
		else if (ne == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NE(info);
		else if (ne == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NE(info);
		else if (ne == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NE(info);
		else if (ne == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NE(info);
		else if (ne == Cnd_ship_abl_only_flg) doCnd_ship_abl_only_flg_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NE(info);
		else if (ne == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NE(info);
		else if (ne == columnRslt_not_inst_ship_to_cnt) doRslt_not_inst_ship_to_cnt_NE(info);
		else if (ne == columnRslt_not_inst_d_cnt) doRslt_not_inst_d_cnt_NE(info);
		else if (ne == columnRslt_not_inst_wt) doRslt_not_inst_wt_NE(info);
		else if (ne == columnRslt_not_inst_dim) doRslt_not_inst_dim_NE(info);
		else if (ne == columnRslt_inst_ship_to_cnt) doRslt_inst_ship_to_cnt_NE(info);
		else if (ne == columnRslt_inst_d_cnt) doRslt_inst_d_cnt_NE(info);
		else if (ne == columnRslt_inst_wt) doRslt_inst_wt_NE(info);
		else if (ne == columnRslt_inst_dim) doRslt_inst_dim_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_abl_only_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_abl_only_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_ship_to_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_ship_to_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_d_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_d_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_dim_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_ship_to_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_ship_to_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dim_NE(MCEventInfo info){
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
		else if (nx == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NX(info);
		else if (nx == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NX(info);
		else if (nx == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NX(info);
		else if (nx == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NX(info);
		else if (nx == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NX(info);
		else if (nx == Cnd_ship_abl_only_flg) doCnd_ship_abl_only_flg_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NX(info);
		else if (nx == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NX(info);
		else if (nx == columnRslt_not_inst_ship_to_cnt) doRslt_not_inst_ship_to_cnt_NX(info);
		else if (nx == columnRslt_not_inst_d_cnt) doRslt_not_inst_d_cnt_NX(info);
		else if (nx == columnRslt_not_inst_wt) doRslt_not_inst_wt_NX(info);
		else if (nx == columnRslt_not_inst_dim) doRslt_not_inst_dim_NX(info);
		else if (nx == columnRslt_inst_ship_to_cnt) doRslt_inst_ship_to_cnt_NX(info);
		else if (nx == columnRslt_inst_d_cnt) doRslt_inst_d_cnt_NX(info);
		else if (nx == columnRslt_inst_wt) doRslt_inst_wt_NX(info);
		else if (nx == columnRslt_inst_dim) doRslt_inst_dim_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_abl_only_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_abl_only_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_ship_to_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_ship_to_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_d_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_d_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_dim_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_ship_to_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_ship_to_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dim_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_LC(info);
		else if (lc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_LC(info);
		else if (lc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_LC(info);
		else if (lc == columnRslt_not_inst_ship_to_cnt) doRslt_not_inst_ship_to_cnt_LC(info);
		else if (lc == columnRslt_not_inst_d_cnt) doRslt_not_inst_d_cnt_LC(info);
		else if (lc == columnRslt_not_inst_wt) doRslt_not_inst_wt_LC(info);
		else if (lc == columnRslt_not_inst_dim) doRslt_not_inst_dim_LC(info);
		else if (lc == columnRslt_inst_ship_to_cnt) doRslt_inst_ship_to_cnt_LC(info);
		else if (lc == columnRslt_inst_d_cnt) doRslt_inst_d_cnt_LC(info);
		else if (lc == columnRslt_inst_wt) doRslt_inst_wt_LC(info);
		else if (lc == columnRslt_inst_dim) doRslt_inst_dim_LC(info);
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_ship_to_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_ship_to_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_d_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_d_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_inst_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_inst_dim_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_ship_to_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_ship_to_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dim_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_wk_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWkGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1430.Srch01")) {
			return new MS_MSBEL1430_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1430_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1430_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1430_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1430_Srch01Bridge() {
			p_MS_MSBEL1430_Srch01 = new MCParam(PDef.MS_MSBEL1430_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1430_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1430.RsltR.class));

			p_MS_MSBEL1430_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1430_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1430_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1430_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1430_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1430.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1430.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1430.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1430_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1430.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1430_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1430.RsltR>)p_MS_MSBEL1430_Srch01.getContainerParam().getDownBlock(0));
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
}