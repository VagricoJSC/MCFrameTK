package mcframe.clientMSUA.MSUAP1080;

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
 * 画面"MSUAP_ShipRqstId"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_ShipRqstId_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SCREEN_ID = "MSUAP1080";

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
	public MCLabel Cnd_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_typ_nm = null;
	public MCLabel Cnd_base_dt_Label = null;
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDateField Cnd_base_dt = null;
	public MCLabel Cnd_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_cd = null;
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_nm = null;
	public MCLabel Cnd_ship_rqst_id_alt_nm1_Label = null;
	/**
	 * Shipping requested identification alias name 1 出荷依頼先識別別名１.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_alt_nm1 = null;
	public MCLabel Cnd_ship_rqst_id_alt_nm2_Label = null;
	/**
	 * Shipping requested identification alias name 2 出荷依頼先識別別名２.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_alt_nm2 = null;
	public MCLabel Cnd_ship_rqst_id_alt_nm3_Label = null;
	/**
	 * Shipping requested identification alias name 3 出荷依頼先識別別名３.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_alt_nm3 = null;
	public MCLabel Cnd_ship_rqst_id_alt_nm4_Label = null;
	/**
	 * Shipping requested identification alias name 4 出荷依頼先識別別名４.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_alt_nm4 = null;
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
	public MCTable2<mcframe.clientMSUA.MSUAP1080.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_cd = null;
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_nm = null;
	/**
	 * Shipping requested identification alias name 1 出荷依頼先識別別名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_alt_nm1 = null;
	/**
	 * Shipping requested identification alias name 2 出荷依頼先識別別名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_alt_nm2 = null;
	/**
	 * Shipping requested identification alias name 3 出荷依頼先識別別名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_alt_nm3 = null;
	/**
	 * Shipping requested identification alias name 4 出荷依頼先識別別名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_alt_nm4 = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
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
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fax = null;
	/**
	 * Shipping requested dept. 出荷依頼先部署.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_cntct_dpt = null;
	/**
	 * Shipping requested PIC 出荷依頼先担当者.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_cntct_psn = null;
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
	private final mcframe.clientMSUA.MSUAP1080.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1080.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1080.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1080.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1080.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1080.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1080.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1080.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1080.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1080.RsltR.class);
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
	public MSUAP_ShipRqstId_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_ShipRqstId_MC_A(String name) {
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
		MSUAP_ShipRqstId_MC.jbCreateTop((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbCreateCnd((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbCreateSrchBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbCreateCtrl((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbCreateRslt((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbCreateBtn((MSUAP_ShipRqstId)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_ShipRqstId p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_ShipRqstId p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_ShipRqstId p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_ShipRqstId p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_ShipRqstId p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_ShipRqstId p) {
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

	
	/** [Cnd_ship_rqst_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_typ_p = null;

	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_typ_ListPutter() {
		if (Cnd_ship_rqst_id_typ_p == null) {
			Cnd_ship_rqst_id_typ_p = createCnd_ship_rqst_id_typ_ListPutter(Cnd_ship_rqst_id_typ, "ship_rqst_id_typ", "ship_rqst_id_typ_nm");

		}
		return Cnd_ship_rqst_id_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_ShipRqstId create(){
		MSUAP_ShipRqstId p = new MSUAP_ShipRqstId();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_ShipRqstId create(String name){
		MSUAP_ShipRqstId p = new MSUAP_ShipRqstId(name);
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
		MSUAP_ShipRqstId_MC.jbfInitTop((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbfInitCnd((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbfInitSrchBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbfInitCtrl((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbfInitRslt((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbfInitBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitTop((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitCnd((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitSrchBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitCtrl((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitRslt((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.jbInitBtn((MSUAP_ShipRqstId)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_typ_Label");
		p.Cnd_ship_rqst_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_rqst_id_typ");
		p.Cnd_ship_rqst_id_typ.setLabel(p.Cnd_ship_rqst_id_typ_Label);
		p.Cnd_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_typ_nm");
		p.Cnd_base_dt_Label = p.beansFactory.createLabel("Cnd.base_dt_Label");
		p.Cnd_base_dt = p.beansFactory.createDateField("Cnd.base_dt");
		p.Cnd_base_dt.setLabel(p.Cnd_base_dt_Label);
		p.Cnd_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_cd_Label");
		p.Cnd_ship_rqst_id_cd = p.beansFactory.createTextField("Cnd.ship_rqst_id_cd");
		p.Cnd_ship_rqst_id_cd.setLabel(p.Cnd_ship_rqst_id_cd_Label);
		p.Cnd_ship_rqst_id_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_nm");
		p.Cnd_ship_rqst_id_alt_nm1_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_alt_nm1_Label");
		p.Cnd_ship_rqst_id_alt_nm1 = p.beansFactory.createTextField("Cnd.ship_rqst_id_alt_nm1");
		p.Cnd_ship_rqst_id_alt_nm1.setLabel(p.Cnd_ship_rqst_id_alt_nm1_Label);
		p.Cnd_ship_rqst_id_alt_nm2_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_alt_nm2_Label");
		p.Cnd_ship_rqst_id_alt_nm2 = p.beansFactory.createTextField("Cnd.ship_rqst_id_alt_nm2");
		p.Cnd_ship_rqst_id_alt_nm2.setLabel(p.Cnd_ship_rqst_id_alt_nm2_Label);
		p.Cnd_ship_rqst_id_alt_nm3_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_alt_nm3_Label");
		p.Cnd_ship_rqst_id_alt_nm3 = p.beansFactory.createTextField("Cnd.ship_rqst_id_alt_nm3");
		p.Cnd_ship_rqst_id_alt_nm3.setLabel(p.Cnd_ship_rqst_id_alt_nm3_Label);
		p.Cnd_ship_rqst_id_alt_nm4_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_alt_nm4_Label");
		p.Cnd_ship_rqst_id_alt_nm4 = p.beansFactory.createTextField("Cnd.ship_rqst_id_alt_nm4");
		p.Cnd_ship_rqst_id_alt_nm4.setLabel(p.Cnd_ship_rqst_id_alt_nm4_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_ship_rqst_id_cd = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_alt_nm1 = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_alt_nm1", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_alt_nm2 = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_alt_nm2", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_alt_nm3 = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_alt_nm3", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_alt_nm4 = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_alt_nm4", MCColumnType.TEXT);
		p.columnRslt_cntry_cd = p.beansFactory.createTableColumn("Rslt.cntry_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_nm = p.beansFactory.createTableColumn("Rslt.cntry_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_zip_cd = p.beansFactory.createTableColumn("Rslt.zip_cd", MCColumnType.TEXT);
		p.columnRslt_addr1 = p.beansFactory.createTableColumn("Rslt.addr1", MCColumnType.TEXT);
		p.columnRslt_addr2 = p.beansFactory.createTableColumn("Rslt.addr2", MCColumnType.TEXT);
		p.columnRslt_addr3 = p.beansFactory.createTableColumn("Rslt.addr3", MCColumnType.TEXT);
		p.columnRslt_addr4 = p.beansFactory.createTableColumn("Rslt.addr4", MCColumnType.TEXT);
		p.columnRslt_tel = p.beansFactory.createTableColumn("Rslt.tel", MCColumnType.TEXT);
		p.columnRslt_fax = p.beansFactory.createTableColumn("Rslt.fax", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_cntct_dpt = p.beansFactory.createTableColumn("Rslt.ship_rqst_cntct_dpt", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_cntct_psn = p.beansFactory.createTableColumn("Rslt.ship_rqst_cntct_psn", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_ShipRqstId p) {
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
	protected static void jbInitTop(MSUAP_ShipRqstId p) {
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
	protected static void jbInitCnd(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_ship_rqst_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_typ, true);
		p.Cnd_ship_rqst_id_typ.setLinkBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ);
		p.CndPanel.setLastBeans(p.Cnd_ship_rqst_id_typ);
		p.Cnd_ship_rqst_id_typ.setNextBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ_nm.setNextBeans(p.Cnd_base_dt);
		p.Cnd_ship_rqst_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_base_dt_Label);
		p.CndPanel.add(p.Cnd_base_dt);
		p.Cnd_base_dt.setNextBeans(p.Cnd_ship_rqst_id_cd);
		p.Cnd_base_dt.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.base_dt_META);
		p.Cnd_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_cd.setNextBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_cd_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_nm.setNextBeans(p.Cnd_ship_rqst_id_alt_nm1);
		p.Cnd_ship_rqst_id_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_nm, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm1_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm1);
		p.Cnd_ship_rqst_id_alt_nm1.setNextBeans(p.Cnd_ship_rqst_id_alt_nm2);
		p.Cnd_ship_rqst_id_alt_nm1.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_alt_nm1, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm2_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm2);
		p.Cnd_ship_rqst_id_alt_nm2.setNextBeans(p.Cnd_ship_rqst_id_alt_nm3);
		p.Cnd_ship_rqst_id_alt_nm2.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_alt_nm2, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm3_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm3);
		p.Cnd_ship_rqst_id_alt_nm3.setNextBeans(p.Cnd_ship_rqst_id_alt_nm4);
		p.Cnd_ship_rqst_id_alt_nm3.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_alt_nm3, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm4_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_alt_nm4);
		p.Cnd_ship_rqst_id_alt_nm4.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.ship_rqst_id_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_alt_nm4, true);
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
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1080.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_ShipRqstId p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_ShipRqstId p) {
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
	protected static void jbInitRslt(MSUAP_ShipRqstId p) {
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
	protected static void jbInitBtn(MSUAP_ShipRqstId p) {
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
		MSUAP_ShipRqstId_MC.mcInitTop((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.mcInitCnd((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.mcInitSrchBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.mcInitCtrl((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.mcInitRslt((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.mcInitBtn((MSUAP_ShipRqstId)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_ShipRqstId_MC.statusInitSRCH_Top((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.statusInitSRCH_Cnd((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.statusInitSRCH_SrchBtn((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.statusInitSRCH_Ctrl((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.statusInitSRCH_Rslt((MSUAP_ShipRqstId)this);
		MSUAP_ShipRqstId_MC.statusInitSRCH_Btn((MSUAP_ShipRqstId)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_ShipRqstId p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_ShipRqstId p) {
		p.Cnd_ship_rqst_id_typ.setListListener(p);
		p.Cnd_ship_rqst_id_typ.addAllListener(p);
		p.Cnd_ship_rqst_id_typ_nm.setListListener(p);
		p.Cnd_ship_rqst_id_typ_nm.addAllListener(p);
		p.Cnd_base_dt.setListListener(p);
		p.Cnd_base_dt.addAllListener(p);
		p.Cnd_ship_rqst_id_cd.setListListener(p);
		p.Cnd_ship_rqst_id_cd.addAllListener(p);
		p.Cnd_ship_rqst_id_nm.setListListener(p);
		p.Cnd_ship_rqst_id_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_alt_nm1.setListListener(p);
		p.Cnd_ship_rqst_id_alt_nm1.addAllListener(p);
		p.Cnd_ship_rqst_id_alt_nm2.setListListener(p);
		p.Cnd_ship_rqst_id_alt_nm2.addAllListener(p);
		p.Cnd_ship_rqst_id_alt_nm3.setListListener(p);
		p.Cnd_ship_rqst_id_alt_nm3.addAllListener(p);
		p.Cnd_ship_rqst_id_alt_nm4.setListListener(p);
		p.Cnd_ship_rqst_id_alt_nm4.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_ShipRqstId p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_ShipRqstId p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_ShipRqstId p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_ship_rqst_id_cd.addAllListener(p);
		p.columnRslt_ship_rqst_id_cd.setListListener(p);
		p.columnRslt_ship_rqst_id_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_alt_nm1.addAllListener(p);
		p.columnRslt_ship_rqst_id_alt_nm1.setListListener(p);
		p.columnRslt_ship_rqst_id_alt_nm2.addAllListener(p);
		p.columnRslt_ship_rqst_id_alt_nm2.setListListener(p);
		p.columnRslt_ship_rqst_id_alt_nm3.addAllListener(p);
		p.columnRslt_ship_rqst_id_alt_nm3.setListListener(p);
		p.columnRslt_ship_rqst_id_alt_nm4.addAllListener(p);
		p.columnRslt_ship_rqst_id_alt_nm4.setListListener(p);
		p.columnRslt_cntry_cd.addAllListener(p);
		p.columnRslt_cntry_cd.setListListener(p);
		p.columnRslt_cntry_nm.addAllListener(p);
		p.columnRslt_cntry_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_zip_cd.addAllListener(p);
		p.columnRslt_zip_cd.setListListener(p);
		p.columnRslt_addr1.addAllListener(p);
		p.columnRslt_addr1.setListListener(p);
		p.columnRslt_addr2.addAllListener(p);
		p.columnRslt_addr2.setListListener(p);
		p.columnRslt_addr3.addAllListener(p);
		p.columnRslt_addr3.setListListener(p);
		p.columnRslt_addr4.addAllListener(p);
		p.columnRslt_addr4.setListListener(p);
		p.columnRslt_tel.addAllListener(p);
		p.columnRslt_tel.setListListener(p);
		p.columnRslt_fax.addAllListener(p);
		p.columnRslt_fax.setListListener(p);
		p.columnRslt_ship_rqst_cntct_dpt.addAllListener(p);
		p.columnRslt_ship_rqst_cntct_dpt.setListListener(p);
		p.columnRslt_ship_rqst_cntct_psn.addAllListener(p);
		p.columnRslt_ship_rqst_cntct_psn.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_ShipRqstId p) {
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
	protected static void statusInitSRCH_Top(MSUAP_ShipRqstId p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_ShipRqstId p){
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_alt_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_alt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_alt_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_alt_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_ShipRqstId p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_ShipRqstId p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_ShipRqstId p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_alt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_alt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_alt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_alt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_ShipRqstId p){
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
		MSUAP_ShipRqstId_MC.setTableConfigRslt((MSUAP_ShipRqstId)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_ShipRqstId p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_ship_rqst_id_cd.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_cd);
		p.columnRslt_ship_rqst_id_nm.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_nm);
		p.columnRslt_ship_rqst_id_alt_nm1.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_alt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_alt_nm1);
		p.columnRslt_ship_rqst_id_alt_nm2.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_alt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_alt_nm2);
		p.columnRslt_ship_rqst_id_alt_nm3.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_alt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_alt_nm3);
		p.columnRslt_ship_rqst_id_alt_nm4.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_id_alt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_alt_nm4);
		p.columnRslt_cntry_cd.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_cd);
		p.columnRslt_cntry_nm.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_zip_cd.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.zip_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_zip_cd);
		p.columnRslt_addr1.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.addr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_addr1);
		p.columnRslt_addr2.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.addr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_addr2);
		p.columnRslt_addr3.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.addr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_addr3);
		p.columnRslt_addr4.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.addr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_addr4);
		p.columnRslt_tel.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.tel_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tel);
		p.columnRslt_fax.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.fax_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fax);
		p.columnRslt_ship_rqst_cntct_dpt.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_cntct_dpt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_cntct_dpt);
		p.columnRslt_ship_rqst_cntct_psn.setMeta(mcframe.clientMSUA.MSUAP1080.RsltR.ship_rqst_cntct_psn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_cntct_psn);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_ship_rqst_id_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ship_rqst_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_rqst_id_typ.getListConfig().setPutter(getCnd_ship_rqst_id_typ_ListPutter());
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
	 * [Cnd_ship_rqst_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipRqstIdTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ship_rqst_id_typ) return getCnd_ship_rqst_id_typ(row, info);
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
		if (vc == Cnd_ship_rqst_id_typ) return doCnd_ship_rqst_id_typ_VC(info);
		if (vc == Cnd_ship_rqst_id_typ_nm) return doCnd_ship_rqst_id_typ_nm_VC(info);
		if (vc == Cnd_base_dt) return doCnd_base_dt_VC(info);
		if (vc == Cnd_ship_rqst_id_cd) return doCnd_ship_rqst_id_cd_VC(info);
		if (vc == Cnd_ship_rqst_id_nm) return doCnd_ship_rqst_id_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_alt_nm1) return doCnd_ship_rqst_id_alt_nm1_VC(info);
		if (vc == Cnd_ship_rqst_id_alt_nm2) return doCnd_ship_rqst_id_alt_nm2_VC(info);
		if (vc == Cnd_ship_rqst_id_alt_nm3) return doCnd_ship_rqst_id_alt_nm3_VC(info);
		if (vc == Cnd_ship_rqst_id_alt_nm4) return doCnd_ship_rqst_id_alt_nm4_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_ship_rqst_id_cd) return doRslt_ship_rqst_id_cd_VC(info);
		if (vc == columnRslt_ship_rqst_id_nm) return doRslt_ship_rqst_id_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_alt_nm1) return doRslt_ship_rqst_id_alt_nm1_VC(info);
		if (vc == columnRslt_ship_rqst_id_alt_nm2) return doRslt_ship_rqst_id_alt_nm2_VC(info);
		if (vc == columnRslt_ship_rqst_id_alt_nm3) return doRslt_ship_rqst_id_alt_nm3_VC(info);
		if (vc == columnRslt_ship_rqst_id_alt_nm4) return doRslt_ship_rqst_id_alt_nm4_VC(info);
		if (vc == columnRslt_cntry_cd) return doRslt_cntry_cd_VC(info);
		if (vc == columnRslt_cntry_nm) return doRslt_cntry_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_zip_cd) return doRslt_zip_cd_VC(info);
		if (vc == columnRslt_addr1) return doRslt_addr1_VC(info);
		if (vc == columnRslt_addr2) return doRslt_addr2_VC(info);
		if (vc == columnRslt_addr3) return doRslt_addr3_VC(info);
		if (vc == columnRslt_addr4) return doRslt_addr4_VC(info);
		if (vc == columnRslt_tel) return doRslt_tel_VC(info);
		if (vc == columnRslt_fax) return doRslt_fax_VC(info);
		if (vc == columnRslt_ship_rqst_cntct_dpt) return doRslt_ship_rqst_cntct_dpt_VC(info);
		if (vc == columnRslt_ship_rqst_cntct_psn) return doRslt_ship_rqst_cntct_psn_VC(info);
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
	 * [Cnd]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_alt_nm4_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_cntct_psn_VC(MCEventInfo info){
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
		else if (nc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Cnd_base_dt) doCnd_base_dt_NC(info);
		else if (nc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NC(info);
		else if (nc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_alt_nm1) doCnd_ship_rqst_id_alt_nm1_NC(info);
		else if (nc == Cnd_ship_rqst_id_alt_nm2) doCnd_ship_rqst_id_alt_nm2_NC(info);
		else if (nc == Cnd_ship_rqst_id_alt_nm3) doCnd_ship_rqst_id_alt_nm3_NC(info);
		else if (nc == Cnd_ship_rqst_id_alt_nm4) doCnd_ship_rqst_id_alt_nm4_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NC(info);
		else if (nc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_alt_nm1) doRslt_ship_rqst_id_alt_nm1_NC(info);
		else if (nc == columnRslt_ship_rqst_id_alt_nm2) doRslt_ship_rqst_id_alt_nm2_NC(info);
		else if (nc == columnRslt_ship_rqst_id_alt_nm3) doRslt_ship_rqst_id_alt_nm3_NC(info);
		else if (nc == columnRslt_ship_rqst_id_alt_nm4) doRslt_ship_rqst_id_alt_nm4_NC(info);
		else if (nc == columnRslt_cntry_cd) doRslt_cntry_cd_NC(info);
		else if (nc == columnRslt_cntry_nm) doRslt_cntry_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_zip_cd) doRslt_zip_cd_NC(info);
		else if (nc == columnRslt_addr1) doRslt_addr1_NC(info);
		else if (nc == columnRslt_addr2) doRslt_addr2_NC(info);
		else if (nc == columnRslt_addr3) doRslt_addr3_NC(info);
		else if (nc == columnRslt_addr4) doRslt_addr4_NC(info);
		else if (nc == columnRslt_tel) doRslt_tel_NC(info);
		else if (nc == columnRslt_fax) doRslt_fax_NC(info);
		else if (nc == columnRslt_ship_rqst_cntct_dpt) doRslt_ship_rqst_cntct_dpt_NC(info);
		else if (nc == columnRslt_ship_rqst_cntct_psn) doRslt_ship_rqst_cntct_psn_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm4_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tel_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fax_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_psn_NC(MCEventInfo info){
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
		else if (ne == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Cnd_base_dt) doCnd_base_dt_NE(info);
		else if (ne == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NE(info);
		else if (ne == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_alt_nm1) doCnd_ship_rqst_id_alt_nm1_NE(info);
		else if (ne == Cnd_ship_rqst_id_alt_nm2) doCnd_ship_rqst_id_alt_nm2_NE(info);
		else if (ne == Cnd_ship_rqst_id_alt_nm3) doCnd_ship_rqst_id_alt_nm3_NE(info);
		else if (ne == Cnd_ship_rqst_id_alt_nm4) doCnd_ship_rqst_id_alt_nm4_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NE(info);
		else if (ne == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_alt_nm1) doRslt_ship_rqst_id_alt_nm1_NE(info);
		else if (ne == columnRslt_ship_rqst_id_alt_nm2) doRslt_ship_rqst_id_alt_nm2_NE(info);
		else if (ne == columnRslt_ship_rqst_id_alt_nm3) doRslt_ship_rqst_id_alt_nm3_NE(info);
		else if (ne == columnRslt_ship_rqst_id_alt_nm4) doRslt_ship_rqst_id_alt_nm4_NE(info);
		else if (ne == columnRslt_cntry_cd) doRslt_cntry_cd_NE(info);
		else if (ne == columnRslt_cntry_nm) doRslt_cntry_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_zip_cd) doRslt_zip_cd_NE(info);
		else if (ne == columnRslt_addr1) doRslt_addr1_NE(info);
		else if (ne == columnRslt_addr2) doRslt_addr2_NE(info);
		else if (ne == columnRslt_addr3) doRslt_addr3_NE(info);
		else if (ne == columnRslt_addr4) doRslt_addr4_NE(info);
		else if (ne == columnRslt_tel) doRslt_tel_NE(info);
		else if (ne == columnRslt_fax) doRslt_fax_NE(info);
		else if (ne == columnRslt_ship_rqst_cntct_dpt) doRslt_ship_rqst_cntct_dpt_NE(info);
		else if (ne == columnRslt_ship_rqst_cntct_psn) doRslt_ship_rqst_cntct_psn_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm4_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tel_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fax_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_psn_NE(MCEventInfo info){
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
		else if (nx == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Cnd_base_dt) doCnd_base_dt_NX(info);
		else if (nx == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NX(info);
		else if (nx == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_alt_nm1) doCnd_ship_rqst_id_alt_nm1_NX(info);
		else if (nx == Cnd_ship_rqst_id_alt_nm2) doCnd_ship_rqst_id_alt_nm2_NX(info);
		else if (nx == Cnd_ship_rqst_id_alt_nm3) doCnd_ship_rqst_id_alt_nm3_NX(info);
		else if (nx == Cnd_ship_rqst_id_alt_nm4) doCnd_ship_rqst_id_alt_nm4_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NX(info);
		else if (nx == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_alt_nm1) doRslt_ship_rqst_id_alt_nm1_NX(info);
		else if (nx == columnRslt_ship_rqst_id_alt_nm2) doRslt_ship_rqst_id_alt_nm2_NX(info);
		else if (nx == columnRslt_ship_rqst_id_alt_nm3) doRslt_ship_rqst_id_alt_nm3_NX(info);
		else if (nx == columnRslt_ship_rqst_id_alt_nm4) doRslt_ship_rqst_id_alt_nm4_NX(info);
		else if (nx == columnRslt_cntry_cd) doRslt_cntry_cd_NX(info);
		else if (nx == columnRslt_cntry_nm) doRslt_cntry_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_zip_cd) doRslt_zip_cd_NX(info);
		else if (nx == columnRslt_addr1) doRslt_addr1_NX(info);
		else if (nx == columnRslt_addr2) doRslt_addr2_NX(info);
		else if (nx == columnRslt_addr3) doRslt_addr3_NX(info);
		else if (nx == columnRslt_addr4) doRslt_addr4_NX(info);
		else if (nx == columnRslt_tel) doRslt_tel_NX(info);
		else if (nx == columnRslt_fax) doRslt_fax_NX(info);
		else if (nx == columnRslt_ship_rqst_cntct_dpt) doRslt_ship_rqst_cntct_dpt_NX(info);
		else if (nx == columnRslt_ship_rqst_cntct_psn) doRslt_ship_rqst_cntct_psn_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm4_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tel_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fax_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Cnd_base_dt) doCnd_base_dt_LC(info);
		else if (lc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_LC(info);
		else if (lc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_alt_nm1) doCnd_ship_rqst_id_alt_nm1_LC(info);
		else if (lc == Cnd_ship_rqst_id_alt_nm2) doCnd_ship_rqst_id_alt_nm2_LC(info);
		else if (lc == Cnd_ship_rqst_id_alt_nm3) doCnd_ship_rqst_id_alt_nm3_LC(info);
		else if (lc == Cnd_ship_rqst_id_alt_nm4) doCnd_ship_rqst_id_alt_nm4_LC(info);
		else if (lc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_LC(info);
		else if (lc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_alt_nm1) doRslt_ship_rqst_id_alt_nm1_LC(info);
		else if (lc == columnRslt_ship_rqst_id_alt_nm2) doRslt_ship_rqst_id_alt_nm2_LC(info);
		else if (lc == columnRslt_ship_rqst_id_alt_nm3) doRslt_ship_rqst_id_alt_nm3_LC(info);
		else if (lc == columnRslt_ship_rqst_id_alt_nm4) doRslt_ship_rqst_id_alt_nm4_LC(info);
		else if (lc == columnRslt_cntry_cd) doRslt_cntry_cd_LC(info);
		else if (lc == columnRslt_cntry_nm) doRslt_cntry_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_zip_cd) doRslt_zip_cd_LC(info);
		else if (lc == columnRslt_addr1) doRslt_addr1_LC(info);
		else if (lc == columnRslt_addr2) doRslt_addr2_LC(info);
		else if (lc == columnRslt_addr3) doRslt_addr3_LC(info);
		else if (lc == columnRslt_addr4) doRslt_addr4_LC(info);
		else if (lc == columnRslt_tel) doRslt_tel_LC(info);
		else if (lc == columnRslt_fax) doRslt_fax_LC(info);
		else if (lc == columnRslt_ship_rqst_cntct_dpt) doRslt_ship_rqst_cntct_dpt_LC(info);
		else if (lc == columnRslt_ship_rqst_cntct_psn) doRslt_ship_rqst_cntct_psn_LC(info);
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tel_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fax_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipRqstIdTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}