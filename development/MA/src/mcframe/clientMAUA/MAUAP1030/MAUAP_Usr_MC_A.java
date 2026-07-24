package mcframe.clientMAUA.MAUAP1030;

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
 * 画面"MAUAP_Usr"パネルクラスです。<p>
 *
 * 担当者の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUAP_Usr_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MAUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUAP1030";

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
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
	/**
	 * With PIC authority 担当者権限あり.<p>
	 *
	 */
	public MCCheckBox Cnd_referring_usr_acl_flg = null;
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	public MCLabel Cnd_usr_alt_nm1_Label = null;
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm1 = null;
	public MCLabel Cnd_usr_alt_nm2_Label = null;
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm2 = null;
	public MCLabel Cnd_usr_alt_nm3_Label = null;
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm3 = null;
	public MCLabel Cnd_usr_alt_nm4_Label = null;
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm4 = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_aff_dpt_cd_Label = null;
	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_aff_dpt_cd = null;
	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public MCTextField Cnd_aff_dpt_nm = null;
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
	public MCTable2<mcframe.clientMAUA.MAUAP1030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_alt_nm1 = null;
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_alt_nm2 = null;
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_alt_nm3 = null;
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_alt_nm4 = null;
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd1 = null;
	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm1 = null;
	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd2 = null;
	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm2 = null;
	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd3 = null;
	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm3 = null;
	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd4 = null;
	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm4 = null;
	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd5 = null;
	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm5 = null;
	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd6 = null;
	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm6 = null;
	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd7 = null;
	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm7 = null;
	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd8 = null;
	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm8 = null;
	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_cd9 = null;
	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_add_dpt_nm9 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3 = null;
	/**
	 * Entry date and time (PIC) 登録日時（担当者）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update date and time (PIC) 更新日時（担当者）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acl_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acl_upd_ts = null;
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
	private final mcframe.clientMAUA.MAUAP1030.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUA.MAUAP1030.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMAUA.MAUAP1030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1030.CndR createCndR() {
		return mcframe.clientMAUA.MAUAP1030.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMAUA.MAUAP1030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMAUA.MAUAP1030.RsltR createRsltR() {
		return mcframe.clientMAUA.MAUAP1030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMAUA.MAUAP1030.RsltR.class);
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
	public MAUAP_Usr_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Usr_MC_A(String name) {
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
		MAUAP_Usr_MC.jbCreateTop((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbCreateCnd((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbCreateSrchBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbCreateCtrl((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbCreateRslt((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbCreateBtn((MAUAP_Usr)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MAUAP_Usr p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MAUAP_Usr p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MAUAP_Usr p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MAUAP_Usr p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MAUAP_Usr p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUAP_Usr p) {
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

	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_aff_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aff_dpt_cd_p = null;

	/**
	 * [Cnd_aff_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aff_dpt_cd_ListPutter() {
		if (Cnd_aff_dpt_cd_p == null) {
			Cnd_aff_dpt_cd_p = createCnd_aff_dpt_cd_ListPutter(Cnd_aff_dpt_cd, "aff_dpt_cd", "aff_dpt_nm");

		}
		return Cnd_aff_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Usr create(){
		MAUAP_Usr p = new MAUAP_Usr();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Usr create(String name){
		MAUAP_Usr p = new MAUAP_Usr(name);
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
		MAUAP_Usr_MC.jbfInitTop((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbfInitCnd((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbfInitSrchBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbfInitCtrl((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbfInitRslt((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbfInitBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitTop((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitCnd((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitSrchBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitCtrl((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitRslt((MAUAP_Usr)this);
		MAUAP_Usr_MC.jbInitBtn((MAUAP_Usr)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_referring_usr_acl_flg = p.beansFactory.createCheckBox("Cnd.referring_usr_acl_flg");
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_usr_alt_nm1_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm1_Label");
		p.Cnd_usr_alt_nm1 = p.beansFactory.createTextField("Cnd.usr_alt_nm1");
		p.Cnd_usr_alt_nm1.setLabel(p.Cnd_usr_alt_nm1_Label);
		p.Cnd_usr_alt_nm2_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm2_Label");
		p.Cnd_usr_alt_nm2 = p.beansFactory.createTextField("Cnd.usr_alt_nm2");
		p.Cnd_usr_alt_nm2.setLabel(p.Cnd_usr_alt_nm2_Label);
		p.Cnd_usr_alt_nm3_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm3_Label");
		p.Cnd_usr_alt_nm3 = p.beansFactory.createTextField("Cnd.usr_alt_nm3");
		p.Cnd_usr_alt_nm3.setLabel(p.Cnd_usr_alt_nm3_Label);
		p.Cnd_usr_alt_nm4_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm4_Label");
		p.Cnd_usr_alt_nm4 = p.beansFactory.createTextField("Cnd.usr_alt_nm4");
		p.Cnd_usr_alt_nm4.setLabel(p.Cnd_usr_alt_nm4_Label);
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_aff_dpt_cd_Label = p.beansFactory.createLabel("Cnd.aff_dpt_cd_Label");
		p.Cnd_aff_dpt_cd = p.beansFactory.createTextComboBox("Cnd.aff_dpt_cd");
		p.Cnd_aff_dpt_cd.setLabel(p.Cnd_aff_dpt_cd_Label);
		p.Cnd_aff_dpt_nm = p.beansFactory.createTextField("Cnd.aff_dpt_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_usr_alt_nm1 = p.beansFactory.createTableColumn("Rslt.usr_alt_nm1", MCColumnType.TEXT);
		p.columnRslt_usr_alt_nm2 = p.beansFactory.createTableColumn("Rslt.usr_alt_nm2", MCColumnType.TEXT);
		p.columnRslt_usr_alt_nm3 = p.beansFactory.createTableColumn("Rslt.usr_alt_nm3", MCColumnType.TEXT);
		p.columnRslt_usr_alt_nm4 = p.beansFactory.createTableColumn("Rslt.usr_alt_nm4", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd1 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd1", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm1 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm1", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd2 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd2", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm2 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm2", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd3 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd3", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm3 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm3", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd4 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd4", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm4 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm4", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd5 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd5", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm5 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm5", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd6 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd6", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm6 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm6", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd7 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd7", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm7 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm7", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd8 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd8", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm8 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm8", MCColumnType.TEXT);
		p.columnRslt_add_dpt_cd9 = p.beansFactory.createTableColumn("Rslt.add_dpt_cd9", MCColumnType.TEXT);
		p.columnRslt_add_dpt_nm9 = p.beansFactory.createTableColumn("Rslt.add_dpt_nm9", MCColumnType.TEXT);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_acl_ins_ts = p.beansFactory.createTableColumn("Rslt.acl_ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_acl_upd_ts = p.beansFactory.createTableColumn("Rslt.acl_upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUAP_Usr p) {
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
	protected static void jbInitTop(MAUAP_Usr p) {
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
	protected static void jbInitCnd(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cd);
		p.CndPanel.setLastBeans(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_cd_META);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_referring_usr_acl_flg);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_referring_usr_acl_flg);
		p.Cnd_referring_usr_acl_flg.setNextBeans(p.Cnd_dt);
		p.Cnd_referring_usr_acl_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.referring_usr_acl_flg_META);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setNextBeans(p.Cnd_usr_alt_nm1);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_usr_alt_nm1_Label);
		p.CndPanel.add(p.Cnd_usr_alt_nm1);
		p.Cnd_usr_alt_nm1.setNextBeans(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm1, true);
		p.CndPanel.add(p.Cnd_usr_alt_nm2_Label);
		p.CndPanel.add(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm2.setNextBeans(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm2, true);
		p.CndPanel.add(p.Cnd_usr_alt_nm3_Label);
		p.CndPanel.add(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm3.setNextBeans(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm3, true);
		p.CndPanel.add(p.Cnd_usr_alt_nm4_Label);
		p.CndPanel.add(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm4.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_alt_nm4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.usr_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm4, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_aff_dpt_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_aff_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aff_dpt_cd, true);
		p.Cnd_aff_dpt_cd.setLinkBeans(p.Cnd_aff_dpt_nm);
		p.CndPanel.add(p.Cnd_aff_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_aff_dpt_cd);
		p.Cnd_aff_dpt_cd.setNextBeans(p.Cnd_aff_dpt_nm);
		p.Cnd_aff_dpt_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.aff_dpt_cd_META);
		p.CndPanel.add(p.Cnd_aff_dpt_nm);
		p.Cnd_aff_dpt_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_aff_dpt_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.aff_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_aff_dpt_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
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
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1030.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MAUAP_Usr p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MAUAP_Usr p) {
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
	protected static void jbInitRslt(MAUAP_Usr p) {
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
	protected static void jbInitBtn(MAUAP_Usr p) {
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
		MAUAP_Usr_MC.mcInitTop((MAUAP_Usr)this);
		MAUAP_Usr_MC.mcInitCnd((MAUAP_Usr)this);
		MAUAP_Usr_MC.mcInitSrchBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.mcInitCtrl((MAUAP_Usr)this);
		MAUAP_Usr_MC.mcInitRslt((MAUAP_Usr)this);
		MAUAP_Usr_MC.mcInitBtn((MAUAP_Usr)this);

		// [SRCH]ステータスのモードの設定
		MAUAP_Usr_MC.statusInitSRCH_Top((MAUAP_Usr)this);
		MAUAP_Usr_MC.statusInitSRCH_Cnd((MAUAP_Usr)this);
		MAUAP_Usr_MC.statusInitSRCH_SrchBtn((MAUAP_Usr)this);
		MAUAP_Usr_MC.statusInitSRCH_Ctrl((MAUAP_Usr)this);
		MAUAP_Usr_MC.statusInitSRCH_Rslt((MAUAP_Usr)this);
		MAUAP_Usr_MC.statusInitSRCH_Btn((MAUAP_Usr)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MAUAP_Usr p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MAUAP_Usr p) {
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_referring_usr_acl_flg.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_usr_alt_nm1.setListListener(p);
		p.Cnd_usr_alt_nm1.addAllListener(p);
		p.Cnd_usr_alt_nm2.setListListener(p);
		p.Cnd_usr_alt_nm2.addAllListener(p);
		p.Cnd_usr_alt_nm3.setListListener(p);
		p.Cnd_usr_alt_nm3.addAllListener(p);
		p.Cnd_usr_alt_nm4.setListListener(p);
		p.Cnd_usr_alt_nm4.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_aff_dpt_cd.setListListener(p);
		p.Cnd_aff_dpt_cd.addAllListener(p);
		p.Cnd_aff_dpt_nm.setListListener(p);
		p.Cnd_aff_dpt_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MAUAP_Usr p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MAUAP_Usr p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MAUAP_Usr p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_usr_alt_nm1.addAllListener(p);
		p.columnRslt_usr_alt_nm1.setListListener(p);
		p.columnRslt_usr_alt_nm2.addAllListener(p);
		p.columnRslt_usr_alt_nm2.setListListener(p);
		p.columnRslt_usr_alt_nm3.addAllListener(p);
		p.columnRslt_usr_alt_nm3.setListListener(p);
		p.columnRslt_usr_alt_nm4.addAllListener(p);
		p.columnRslt_usr_alt_nm4.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_add_dpt_cd1.addAllListener(p);
		p.columnRslt_add_dpt_cd1.setListListener(p);
		p.columnRslt_add_dpt_nm1.addAllListener(p);
		p.columnRslt_add_dpt_nm1.setListListener(p);
		p.columnRslt_add_dpt_cd2.addAllListener(p);
		p.columnRslt_add_dpt_cd2.setListListener(p);
		p.columnRslt_add_dpt_nm2.addAllListener(p);
		p.columnRslt_add_dpt_nm2.setListListener(p);
		p.columnRslt_add_dpt_cd3.addAllListener(p);
		p.columnRslt_add_dpt_cd3.setListListener(p);
		p.columnRslt_add_dpt_nm3.addAllListener(p);
		p.columnRslt_add_dpt_nm3.setListListener(p);
		p.columnRslt_add_dpt_cd4.addAllListener(p);
		p.columnRslt_add_dpt_cd4.setListListener(p);
		p.columnRslt_add_dpt_nm4.addAllListener(p);
		p.columnRslt_add_dpt_nm4.setListListener(p);
		p.columnRslt_add_dpt_cd5.addAllListener(p);
		p.columnRslt_add_dpt_cd5.setListListener(p);
		p.columnRslt_add_dpt_nm5.addAllListener(p);
		p.columnRslt_add_dpt_nm5.setListListener(p);
		p.columnRslt_add_dpt_cd6.addAllListener(p);
		p.columnRslt_add_dpt_cd6.setListListener(p);
		p.columnRslt_add_dpt_nm6.addAllListener(p);
		p.columnRslt_add_dpt_nm6.setListListener(p);
		p.columnRslt_add_dpt_cd7.addAllListener(p);
		p.columnRslt_add_dpt_cd7.setListListener(p);
		p.columnRslt_add_dpt_nm7.addAllListener(p);
		p.columnRslt_add_dpt_nm7.setListListener(p);
		p.columnRslt_add_dpt_cd8.addAllListener(p);
		p.columnRslt_add_dpt_cd8.setListListener(p);
		p.columnRslt_add_dpt_nm8.addAllListener(p);
		p.columnRslt_add_dpt_nm8.setListListener(p);
		p.columnRslt_add_dpt_cd9.addAllListener(p);
		p.columnRslt_add_dpt_cd9.setListListener(p);
		p.columnRslt_add_dpt_nm9.addAllListener(p);
		p.columnRslt_add_dpt_nm9.setListListener(p);
		p.columnRslt_memo1.addAllListener(p);
		p.columnRslt_memo1.setListListener(p);
		p.columnRslt_memo2.addAllListener(p);
		p.columnRslt_memo2.setListListener(p);
		p.columnRslt_memo3.addAllListener(p);
		p.columnRslt_memo3.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_acl_ins_ts.addAllListener(p);
		p.columnRslt_acl_ins_ts.setListListener(p);
		p.columnRslt_acl_upd_ts.addAllListener(p);
		p.columnRslt_acl_upd_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUAP_Usr p) {
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
	protected static void statusInitSRCH_Top(MAUAP_Usr p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MAUAP_Usr p){
		p.Cnd_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_referring_usr_acl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aff_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aff_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MAUAP_Usr p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MAUAP_Usr p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MAUAP_Usr p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_alt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_alt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_alt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_alt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_add_dpt_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MAUAP_Usr p){
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
		MAUAP_Usr_MC.setTableConfigRslt((MAUAP_Usr)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MAUAP_Usr p) {
		p.columnRslt_check.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_usr_alt_nm1.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_alt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_alt_nm1);
		p.columnRslt_usr_alt_nm2.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_alt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_alt_nm2);
		p.columnRslt_usr_alt_nm3.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_alt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_alt_nm3);
		p.columnRslt_usr_alt_nm4.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.usr_alt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_alt_nm4);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_add_dpt_cd1.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd1);
		p.columnRslt_add_dpt_nm1.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm1);
		p.columnRslt_add_dpt_cd2.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd2);
		p.columnRslt_add_dpt_nm2.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm2);
		p.columnRslt_add_dpt_cd3.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd3);
		p.columnRslt_add_dpt_nm3.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm3);
		p.columnRslt_add_dpt_cd4.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd4);
		p.columnRslt_add_dpt_nm4.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm4);
		p.columnRslt_add_dpt_cd5.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd5);
		p.columnRslt_add_dpt_nm5.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm5);
		p.columnRslt_add_dpt_cd6.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd6);
		p.columnRslt_add_dpt_nm6.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm6);
		p.columnRslt_add_dpt_cd7.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd7);
		p.columnRslt_add_dpt_nm7.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm7);
		p.columnRslt_add_dpt_cd8.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd8);
		p.columnRslt_add_dpt_nm8.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm8);
		p.columnRslt_add_dpt_cd9.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_cd9);
		p.columnRslt_add_dpt_nm9.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.add_dpt_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_add_dpt_nm9);
		p.columnRslt_memo1.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_acl_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.acl_ins_ts_META);
		p.columnRslt_acl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acl_ins_ts);
		p.columnRslt_acl_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1030.RsltR.acl_upd_ts_META);
		p.columnRslt_acl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acl_upd_ts);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_usr_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_aff_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aff_dpt_cd.getListConfig().setPutter(getCnd_aff_dpt_cd_ListPutter());
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
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_aff_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aff_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_aff_dpt_cd) return getCnd_aff_dpt_cd(row, info);
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
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_referring_usr_acl_flg) return doCnd_referring_usr_acl_flg_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
		if (vc == Cnd_usr_alt_nm1) return doCnd_usr_alt_nm1_VC(info);
		if (vc == Cnd_usr_alt_nm2) return doCnd_usr_alt_nm2_VC(info);
		if (vc == Cnd_usr_alt_nm3) return doCnd_usr_alt_nm3_VC(info);
		if (vc == Cnd_usr_alt_nm4) return doCnd_usr_alt_nm4_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_aff_dpt_cd) return doCnd_aff_dpt_cd_VC(info);
		if (vc == Cnd_aff_dpt_nm) return doCnd_aff_dpt_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_usr_alt_nm1) return doRslt_usr_alt_nm1_VC(info);
		if (vc == columnRslt_usr_alt_nm2) return doRslt_usr_alt_nm2_VC(info);
		if (vc == columnRslt_usr_alt_nm3) return doRslt_usr_alt_nm3_VC(info);
		if (vc == columnRslt_usr_alt_nm4) return doRslt_usr_alt_nm4_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_add_dpt_cd1) return doRslt_add_dpt_cd1_VC(info);
		if (vc == columnRslt_add_dpt_nm1) return doRslt_add_dpt_nm1_VC(info);
		if (vc == columnRslt_add_dpt_cd2) return doRslt_add_dpt_cd2_VC(info);
		if (vc == columnRslt_add_dpt_nm2) return doRslt_add_dpt_nm2_VC(info);
		if (vc == columnRslt_add_dpt_cd3) return doRslt_add_dpt_cd3_VC(info);
		if (vc == columnRslt_add_dpt_nm3) return doRslt_add_dpt_nm3_VC(info);
		if (vc == columnRslt_add_dpt_cd4) return doRslt_add_dpt_cd4_VC(info);
		if (vc == columnRslt_add_dpt_nm4) return doRslt_add_dpt_nm4_VC(info);
		if (vc == columnRslt_add_dpt_cd5) return doRslt_add_dpt_cd5_VC(info);
		if (vc == columnRslt_add_dpt_nm5) return doRslt_add_dpt_nm5_VC(info);
		if (vc == columnRslt_add_dpt_cd6) return doRslt_add_dpt_cd6_VC(info);
		if (vc == columnRslt_add_dpt_nm6) return doRslt_add_dpt_nm6_VC(info);
		if (vc == columnRslt_add_dpt_cd7) return doRslt_add_dpt_cd7_VC(info);
		if (vc == columnRslt_add_dpt_nm7) return doRslt_add_dpt_nm7_VC(info);
		if (vc == columnRslt_add_dpt_cd8) return doRslt_add_dpt_cd8_VC(info);
		if (vc == columnRslt_add_dpt_nm8) return doRslt_add_dpt_nm8_VC(info);
		if (vc == columnRslt_add_dpt_cd9) return doRslt_add_dpt_cd9_VC(info);
		if (vc == columnRslt_add_dpt_nm9) return doRslt_add_dpt_nm9_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_acl_ins_ts) return doRslt_acl_ins_ts_VC(info);
		if (vc == columnRslt_acl_upd_ts) return doRslt_acl_upd_ts_VC(info);
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
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[referring_usr_acl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_referring_usr_acl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aff_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aff_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aff_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aff_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_add_dpt_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acl_ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acl_upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acl_upd_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_referring_usr_acl_flg) doCnd_referring_usr_acl_flg_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
		else if (nc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NC(info);
		else if (nc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NC(info);
		else if (nc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NC(info);
		else if (nc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_aff_dpt_cd) doCnd_aff_dpt_cd_NC(info);
		else if (nc == Cnd_aff_dpt_nm) doCnd_aff_dpt_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_usr_alt_nm1) doRslt_usr_alt_nm1_NC(info);
		else if (nc == columnRslt_usr_alt_nm2) doRslt_usr_alt_nm2_NC(info);
		else if (nc == columnRslt_usr_alt_nm3) doRslt_usr_alt_nm3_NC(info);
		else if (nc == columnRslt_usr_alt_nm4) doRslt_usr_alt_nm4_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_add_dpt_cd1) doRslt_add_dpt_cd1_NC(info);
		else if (nc == columnRslt_add_dpt_nm1) doRslt_add_dpt_nm1_NC(info);
		else if (nc == columnRslt_add_dpt_cd2) doRslt_add_dpt_cd2_NC(info);
		else if (nc == columnRslt_add_dpt_nm2) doRslt_add_dpt_nm2_NC(info);
		else if (nc == columnRslt_add_dpt_cd3) doRslt_add_dpt_cd3_NC(info);
		else if (nc == columnRslt_add_dpt_nm3) doRslt_add_dpt_nm3_NC(info);
		else if (nc == columnRslt_add_dpt_cd4) doRslt_add_dpt_cd4_NC(info);
		else if (nc == columnRslt_add_dpt_nm4) doRslt_add_dpt_nm4_NC(info);
		else if (nc == columnRslt_add_dpt_cd5) doRslt_add_dpt_cd5_NC(info);
		else if (nc == columnRslt_add_dpt_nm5) doRslt_add_dpt_nm5_NC(info);
		else if (nc == columnRslt_add_dpt_cd6) doRslt_add_dpt_cd6_NC(info);
		else if (nc == columnRslt_add_dpt_nm6) doRslt_add_dpt_nm6_NC(info);
		else if (nc == columnRslt_add_dpt_cd7) doRslt_add_dpt_cd7_NC(info);
		else if (nc == columnRslt_add_dpt_nm7) doRslt_add_dpt_nm7_NC(info);
		else if (nc == columnRslt_add_dpt_cd8) doRslt_add_dpt_cd8_NC(info);
		else if (nc == columnRslt_add_dpt_nm8) doRslt_add_dpt_nm8_NC(info);
		else if (nc == columnRslt_add_dpt_cd9) doRslt_add_dpt_cd9_NC(info);
		else if (nc == columnRslt_add_dpt_nm9) doRslt_add_dpt_nm9_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_acl_ins_ts) doRslt_acl_ins_ts_NC(info);
		else if (nc == columnRslt_acl_upd_ts) doRslt_acl_upd_ts_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[referring_usr_acl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_referring_usr_acl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_upd_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_referring_usr_acl_flg) doCnd_referring_usr_acl_flg_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
		else if (ne == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NE(info);
		else if (ne == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NE(info);
		else if (ne == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NE(info);
		else if (ne == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_aff_dpt_cd) doCnd_aff_dpt_cd_NE(info);
		else if (ne == Cnd_aff_dpt_nm) doCnd_aff_dpt_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_usr_alt_nm1) doRslt_usr_alt_nm1_NE(info);
		else if (ne == columnRslt_usr_alt_nm2) doRslt_usr_alt_nm2_NE(info);
		else if (ne == columnRslt_usr_alt_nm3) doRslt_usr_alt_nm3_NE(info);
		else if (ne == columnRslt_usr_alt_nm4) doRslt_usr_alt_nm4_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_add_dpt_cd1) doRslt_add_dpt_cd1_NE(info);
		else if (ne == columnRslt_add_dpt_nm1) doRslt_add_dpt_nm1_NE(info);
		else if (ne == columnRslt_add_dpt_cd2) doRslt_add_dpt_cd2_NE(info);
		else if (ne == columnRslt_add_dpt_nm2) doRslt_add_dpt_nm2_NE(info);
		else if (ne == columnRslt_add_dpt_cd3) doRslt_add_dpt_cd3_NE(info);
		else if (ne == columnRslt_add_dpt_nm3) doRslt_add_dpt_nm3_NE(info);
		else if (ne == columnRslt_add_dpt_cd4) doRslt_add_dpt_cd4_NE(info);
		else if (ne == columnRslt_add_dpt_nm4) doRslt_add_dpt_nm4_NE(info);
		else if (ne == columnRslt_add_dpt_cd5) doRslt_add_dpt_cd5_NE(info);
		else if (ne == columnRslt_add_dpt_nm5) doRslt_add_dpt_nm5_NE(info);
		else if (ne == columnRslt_add_dpt_cd6) doRslt_add_dpt_cd6_NE(info);
		else if (ne == columnRslt_add_dpt_nm6) doRslt_add_dpt_nm6_NE(info);
		else if (ne == columnRslt_add_dpt_cd7) doRslt_add_dpt_cd7_NE(info);
		else if (ne == columnRslt_add_dpt_nm7) doRslt_add_dpt_nm7_NE(info);
		else if (ne == columnRslt_add_dpt_cd8) doRslt_add_dpt_cd8_NE(info);
		else if (ne == columnRslt_add_dpt_nm8) doRslt_add_dpt_nm8_NE(info);
		else if (ne == columnRslt_add_dpt_cd9) doRslt_add_dpt_cd9_NE(info);
		else if (ne == columnRslt_add_dpt_nm9) doRslt_add_dpt_nm9_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_acl_ins_ts) doRslt_acl_ins_ts_NE(info);
		else if (ne == columnRslt_acl_upd_ts) doRslt_acl_upd_ts_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[referring_usr_acl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_referring_usr_acl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_upd_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_referring_usr_acl_flg) doCnd_referring_usr_acl_flg_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
		else if (nx == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NX(info);
		else if (nx == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NX(info);
		else if (nx == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NX(info);
		else if (nx == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_aff_dpt_cd) doCnd_aff_dpt_cd_NX(info);
		else if (nx == Cnd_aff_dpt_nm) doCnd_aff_dpt_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_usr_alt_nm1) doRslt_usr_alt_nm1_NX(info);
		else if (nx == columnRslt_usr_alt_nm2) doRslt_usr_alt_nm2_NX(info);
		else if (nx == columnRslt_usr_alt_nm3) doRslt_usr_alt_nm3_NX(info);
		else if (nx == columnRslt_usr_alt_nm4) doRslt_usr_alt_nm4_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_add_dpt_cd1) doRslt_add_dpt_cd1_NX(info);
		else if (nx == columnRslt_add_dpt_nm1) doRslt_add_dpt_nm1_NX(info);
		else if (nx == columnRslt_add_dpt_cd2) doRslt_add_dpt_cd2_NX(info);
		else if (nx == columnRslt_add_dpt_nm2) doRslt_add_dpt_nm2_NX(info);
		else if (nx == columnRslt_add_dpt_cd3) doRslt_add_dpt_cd3_NX(info);
		else if (nx == columnRslt_add_dpt_nm3) doRslt_add_dpt_nm3_NX(info);
		else if (nx == columnRslt_add_dpt_cd4) doRslt_add_dpt_cd4_NX(info);
		else if (nx == columnRslt_add_dpt_nm4) doRslt_add_dpt_nm4_NX(info);
		else if (nx == columnRslt_add_dpt_cd5) doRslt_add_dpt_cd5_NX(info);
		else if (nx == columnRslt_add_dpt_nm5) doRslt_add_dpt_nm5_NX(info);
		else if (nx == columnRslt_add_dpt_cd6) doRslt_add_dpt_cd6_NX(info);
		else if (nx == columnRslt_add_dpt_nm6) doRslt_add_dpt_nm6_NX(info);
		else if (nx == columnRslt_add_dpt_cd7) doRslt_add_dpt_cd7_NX(info);
		else if (nx == columnRslt_add_dpt_nm7) doRslt_add_dpt_nm7_NX(info);
		else if (nx == columnRslt_add_dpt_cd8) doRslt_add_dpt_cd8_NX(info);
		else if (nx == columnRslt_add_dpt_nm8) doRslt_add_dpt_nm8_NX(info);
		else if (nx == columnRslt_add_dpt_cd9) doRslt_add_dpt_cd9_NX(info);
		else if (nx == columnRslt_add_dpt_nm9) doRslt_add_dpt_nm9_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_acl_ins_ts) doRslt_acl_ins_ts_NX(info);
		else if (nx == columnRslt_acl_upd_ts) doRslt_acl_upd_ts_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[referring_usr_acl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_referring_usr_acl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
		else if (lc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_LC(info);
		else if (lc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_LC(info);
		else if (lc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_LC(info);
		else if (lc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_aff_dpt_cd) doCnd_aff_dpt_cd_LC(info);
		else if (lc == Cnd_aff_dpt_nm) doCnd_aff_dpt_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_usr_alt_nm1) doRslt_usr_alt_nm1_LC(info);
		else if (lc == columnRslt_usr_alt_nm2) doRslt_usr_alt_nm2_LC(info);
		else if (lc == columnRslt_usr_alt_nm3) doRslt_usr_alt_nm3_LC(info);
		else if (lc == columnRslt_usr_alt_nm4) doRslt_usr_alt_nm4_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_add_dpt_cd1) doRslt_add_dpt_cd1_LC(info);
		else if (lc == columnRslt_add_dpt_nm1) doRslt_add_dpt_nm1_LC(info);
		else if (lc == columnRslt_add_dpt_cd2) doRslt_add_dpt_cd2_LC(info);
		else if (lc == columnRslt_add_dpt_nm2) doRslt_add_dpt_nm2_LC(info);
		else if (lc == columnRslt_add_dpt_cd3) doRslt_add_dpt_cd3_LC(info);
		else if (lc == columnRslt_add_dpt_nm3) doRslt_add_dpt_nm3_LC(info);
		else if (lc == columnRslt_add_dpt_cd4) doRslt_add_dpt_cd4_LC(info);
		else if (lc == columnRslt_add_dpt_nm4) doRslt_add_dpt_nm4_LC(info);
		else if (lc == columnRslt_add_dpt_cd5) doRslt_add_dpt_cd5_LC(info);
		else if (lc == columnRslt_add_dpt_nm5) doRslt_add_dpt_nm5_LC(info);
		else if (lc == columnRslt_add_dpt_cd6) doRslt_add_dpt_cd6_LC(info);
		else if (lc == columnRslt_add_dpt_nm6) doRslt_add_dpt_nm6_LC(info);
		else if (lc == columnRslt_add_dpt_cd7) doRslt_add_dpt_cd7_LC(info);
		else if (lc == columnRslt_add_dpt_nm7) doRslt_add_dpt_nm7_LC(info);
		else if (lc == columnRslt_add_dpt_cd8) doRslt_add_dpt_cd8_LC(info);
		else if (lc == columnRslt_add_dpt_nm8) doRslt_add_dpt_nm8_LC(info);
		else if (lc == columnRslt_add_dpt_cd9) doRslt_add_dpt_cd9_LC(info);
		else if (lc == columnRslt_add_dpt_nm9) doRslt_add_dpt_nm9_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_acl_ins_ts) doRslt_acl_ins_ts_LC(info);
		else if (lc == columnRslt_acl_upd_ts) doRslt_acl_upd_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aff_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aff_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[add_dpt_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_add_dpt_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acl_upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aff_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_aff_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}