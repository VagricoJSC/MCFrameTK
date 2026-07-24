package mcframe.clientMBBB.MBBBP0130;

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
import mcframe.clientMBBB.MBBBP0130.MBBBP_JournalSrchByAc_MC.MB_MBBBL0130_Srch01Caller;

/**
 * 画面"MBBBP_JournalSrchByAc"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_JournalSrchByAc_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBBP0130";

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
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_jnl_grp_no_Label = null;
	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_grp_no = null;
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public MCTextField Cnd_jnl_rmrks = null;
	public MCLabel Cnd_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym = null;
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
	public MCLabel Cnd_slip_cnt_id_Label = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_slip_cnt_id = null;
	public MCLabel Cnd_ac_cd_Label = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCTextField Cnd_ac_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_ac_typ_Label = null;
	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ = null;
	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm = null;
	public MCLabel Cnd_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Cnd_tax_nm = null;
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_if_flg = null;
	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_slip_cnt_flg = null;
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public MCCheckBox Cnd_dpt_flg = null;
	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public MCCheckBox Cnd_sub_ac_flg = null;
	/**
	 * Tax 税.<p>
	 *
	 */
	public MCCheckBox Cnd_tax_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_deselect_all = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0130.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
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
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_if_typ = null;
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_if_typ_nm = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_cnt_id = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_nm = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_ac_nm = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_nm = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_amt = null;
	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_tax_amt = null;
	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_c_amt = null;
	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_c_tax_amt = null;
	/**
	 * Debt and credit amount (Base currency) 基準通貨貸借金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_total_amt = null;
	/**
	 * Debt and credit tax amount (Base currency) 基準通貨貸借税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_total_tax_amt = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_trd_amt = null;
	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_trd_tax_amt = null;
	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_c_trd_amt = null;
	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_c_trd_tax_amt = null;
	/**
	 * Debt and credit amount (Transaction currency) 取引通貨貸借金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_total_trd_amt = null;
	/**
	 * Debt and credit tax amount (Transaction currency) 取引通貨貸借税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_total_trd_tax_amt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Auto-Journal slip list 自動仕訳伝票一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0120 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MB_MBBBL0130_Srch01]のCallerの作成 */
	protected MBBBP_JournalSrchByAc_MC.MB_MBBBL0130_Srch01Caller createMB_MBBBL0130_Srch01() {
		MBBBP_JournalSrchByAc_MC.MB_MBBBL0130_Srch01Caller<MBBBP_JournalSrchByAc, MB_MBBBL0130_Srch01Bridge>
		caller = ((MBBBP_JournalSrchByAc_MC)this).new MB_MBBBL0130_Srch01Caller<MBBBP_JournalSrchByAc, MB_MBBBL0130_Srch01Bridge>(
					(MBBBP_JournalSrchByAc)this, new MB_MBBBL0130_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0130_Srch01]の呼び出し */
	protected void callMB_MBBBL0130_Srch01() {
		MCCaller caller = createMB_MBBBL0130_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0130.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0130.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0130.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0130.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0130.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0130.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0130.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0130.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0130.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0130.RsltR.class);
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
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_JournalSrchByAc_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_JournalSrchByAc_MC_A(String name) {
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
		MBBBP_JournalSrchByAc_MC.jbCreateTop((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateFold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateTab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateTab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateCnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateCnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateCtrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateRslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbCreateBtn((MBBBP_JournalSrchByAc)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_JournalSrchByAc p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_JournalSrchByAc p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBBP_JournalSrchByAc p) {
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

	
	/** [Cnd_jnl_grp_no_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_grp_no_p = null;

	/**
	 * [Cnd_jnl_grp_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_grp_no_ListPutter() {
		if (Cnd_jnl_grp_no_p == null) {
			Cnd_jnl_grp_no_p = createCnd_jnl_grp_no_ListPutter(Cnd_jnl_grp_no, "jnl_grp_no", "jnl_rmrks");

		}
		return Cnd_jnl_grp_no_p;
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
	
	
	/** [Cnd_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_cd_p = null;

	/**
	 * [Cnd_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_cd_ListPutter() {
		if (Cnd_ac_cd_p == null) {
			Cnd_ac_cd_p = createCnd_ac_cd_ListPutter(Cnd_ac_cd, "ac_cd", "ac_nm");

		}
		return Cnd_ac_cd_p;
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
	
	
	/** [Cnd_ac_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ_p = null;

	/**
	 * [Cnd_ac_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ_ListPutter() {
		if (Cnd_ac_typ_p == null) {
			Cnd_ac_typ_p = createCnd_ac_typ_ListPutter(Cnd_ac_typ, "ac_typ", "ac_typ_nm");

		}
		return Cnd_ac_typ_p;
	}
	
	
	/** [Cnd_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tax_cd_p = null;

	/**
	 * [Cnd_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tax_cd_ListPutter() {
		if (Cnd_tax_cd_p == null) {
			Cnd_tax_cd_p = createCnd_tax_cd_ListPutter(Cnd_tax_cd, "tax_cd", "tax_nm");

		}
		return Cnd_tax_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JournalSrchByAc create(){
		MBBBP_JournalSrchByAc p = new MBBBP_JournalSrchByAc();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JournalSrchByAc create(String name){
		MBBBP_JournalSrchByAc p = new MBBBP_JournalSrchByAc(name);
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
		MBBBP_JournalSrchByAc_MC.jbfInitTop((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitFold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitTab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitTab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitCnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitCnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitCtrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitRslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbfInitBtn((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitTop((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitFold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitTab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitTab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitCnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitCnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitCtrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitRslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.jbInitBtn((MBBBP_JournalSrchByAc)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_jnl_grp_no_Label = p.beansFactory.createLabel("Cnd.jnl_grp_no_Label");
		p.Cnd_jnl_grp_no = p.beansFactory.createTextComboBox("Cnd.jnl_grp_no");
		p.Cnd_jnl_grp_no.setLabel(p.Cnd_jnl_grp_no_Label);
		p.Cnd_jnl_rmrks = p.beansFactory.createTextField("Cnd.jnl_rmrks");
		p.Cnd_ac_ym_Label = p.beansFactory.createLabel("Cnd.ac_ym_Label");
		p.Cnd_ac_ym = p.beansFactory.createDateField("Cnd.ac_ym");
		p.Cnd_ac_ym.setLabel(p.Cnd_ac_ym_Label);
		p.Cnd_ac_if_typ_Label = p.beansFactory.createLabel("Cnd.ac_if_typ_Label");
		p.Cnd_ac_if_typ = p.beansFactory.createTextComboBox("Cnd.ac_if_typ");
		p.Cnd_ac_if_typ.setLabel(p.Cnd_ac_if_typ_Label);
		p.Cnd_ac_if_typ_nm = p.beansFactory.createTextField("Cnd.ac_if_typ_nm");
		p.Cnd_slip_cnt_id_Label = p.beansFactory.createLabel("Cnd.slip_cnt_id_Label");
		p.Cnd_slip_cnt_id = p.beansFactory.createTextField("Cnd.slip_cnt_id");
		p.Cnd_slip_cnt_id.setLabel(p.Cnd_slip_cnt_id_Label);
		p.Cnd_ac_cd_Label = p.beansFactory.createLabel("Cnd.ac_cd_Label");
		p.Cnd_ac_cd = p.beansFactory.createTextField("Cnd.ac_cd");
		p.Cnd_ac_cd.setLabel(p.Cnd_ac_cd_Label);
		p.Cnd_ac_nm = p.beansFactory.createTextField("Cnd.ac_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_ac_typ_Label = p.beansFactory.createLabel("Cnd.ac_typ_Label");
		p.Cnd_ac_typ = p.beansFactory.createTextComboBox("Cnd.ac_typ");
		p.Cnd_ac_typ.setLabel(p.Cnd_ac_typ_Label);
		p.Cnd_ac_typ_nm = p.beansFactory.createTextField("Cnd.ac_typ_nm");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
		p.Cnd_ac_if_flg = p.beansFactory.createCheckBox("Cnd.ac_if_flg");
		p.Cnd_slip_cnt_flg = p.beansFactory.createCheckBox("Cnd.slip_cnt_flg");
		p.Cnd_dpt_flg = p.beansFactory.createCheckBox("Cnd.dpt_flg");
		p.Cnd_sub_ac_flg = p.beansFactory.createCheckBox("Cnd.sub_ac_flg");
		p.Cnd_tax_flg = p.beansFactory.createCheckBox("Cnd.tax_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_jnl_grp_no = p.beansFactory.createTableColumn("Rslt.jnl_grp_no", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_if_typ = p.beansFactory.createTableColumn("Rslt.ac_if_typ", MCColumnType.TEXT);
		p.columnRslt_ac_if_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_if_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slip_cnt_id = p.beansFactory.createTableColumn("Rslt.slip_cnt_id", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ac_cd = p.beansFactory.createTableColumn("Rslt.ac_cd", MCColumnType.TEXT);
		p.columnRslt_ac_nm = p.beansFactory.createTableColumn("Rslt.ac_nm", MCColumnType.TEXT);
		p.columnRslt_sub_ac_cd = p.beansFactory.createTableColumn("Rslt.sub_ac_cd", MCColumnType.TEXT);
		p.columnRslt_sub_ac_nm = p.beansFactory.createTableColumn("Rslt.sub_ac_nm", MCColumnType.TEXT);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_d_amt = p.beansFactory.createTableColumn("Rslt.d_amt", MCColumnType.NUMBER);
		p.columnRslt_d_tax_amt = p.beansFactory.createTableColumn("Rslt.d_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_c_amt = p.beansFactory.createTableColumn("Rslt.c_amt", MCColumnType.NUMBER);
		p.columnRslt_c_tax_amt = p.beansFactory.createTableColumn("Rslt.c_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_total_amt = p.beansFactory.createTableColumn("Rslt.total_amt", MCColumnType.NUMBER);
		p.columnRslt_total_tax_amt = p.beansFactory.createTableColumn("Rslt.total_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_d_trd_amt = p.beansFactory.createTableColumn("Rslt.d_trd_amt", MCColumnType.NUMBER);
		p.columnRslt_d_trd_tax_amt = p.beansFactory.createTableColumn("Rslt.d_trd_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_c_trd_amt = p.beansFactory.createTableColumn("Rslt.c_trd_amt", MCColumnType.NUMBER);
		p.columnRslt_c_trd_tax_amt = p.beansFactory.createTableColumn("Rslt.c_trd_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_total_trd_amt = p.beansFactory.createTableColumn("Rslt.total_trd_amt", MCColumnType.NUMBER);
		p.columnRslt_total_trd_tax_amt = p.beansFactory.createTableColumn("Rslt.total_trd_tax_amt", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0120 = p.beansFactory.createButton("Btn.open_MBBBP0120", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_JournalSrchByAc p) {
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
	protected static void jbInitFold(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_jnl_grp_no.setListType(MCListType.STRICT);
		p.Cnd_jnl_grp_no.setLinkBeans(p.Cnd_jnl_rmrks);
		p.CndPanel.add(p.Cnd_jnl_grp_no_Label);
		p.CndPanel.add(p.Cnd_jnl_grp_no);
		p.CndPanel.setLastBeans(p.Cnd_jnl_grp_no);
		p.Cnd_jnl_grp_no.setNextBeans(p.Cnd_jnl_rmrks);
		p.Cnd_jnl_grp_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.jnl_grp_no_META);
		p.CndPanel.add(p.Cnd_jnl_rmrks);
		p.Cnd_jnl_rmrks.setNextBeans(p.Cnd_ac_ym);
		p.Cnd_jnl_rmrks.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.jnl_rmrks_META);
		p.CndPanel.add(p.Cnd_ac_ym_Label);
		p.CndPanel.add(p.Cnd_ac_ym);
		p.Cnd_ac_ym.setNextBeans(p.Cnd_ac_if_typ);
		p.Cnd_ac_ym.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_ym_META);
		p.Cnd_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_ac_if_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_if_typ, true);
		p.Cnd_ac_if_typ.setLinkBeans(p.Cnd_ac_if_typ_nm);
		p.CndPanel.add(p.Cnd_ac_if_typ_Label);
		p.CndPanel.add(p.Cnd_ac_if_typ);
		p.Cnd_ac_if_typ.setNextBeans(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_if_typ_META);
		p.CndPanel.add(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ_nm.setNextBeans(p.Cnd_slip_cnt_id);
		p.Cnd_ac_if_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_if_typ_nm_META);
		p.CndPanel.add(p.Cnd_slip_cnt_id_Label);
		p.CndPanel.add(p.Cnd_slip_cnt_id);
		p.Cnd_slip_cnt_id.setNextBeans(p.Cnd_ac_cd);
		p.Cnd_slip_cnt_id.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.slip_cnt_id_META);
		p.setPluralValueEnable(p.Cnd_slip_cnt_id, true);
		p.CndPanel.add(p.Cnd_ac_cd_Label);
		p.CndPanel.add(p.Cnd_ac_cd);
		p.Cnd_ac_cd.setNextBeans(p.Cnd_ac_nm);
		p.Cnd_ac_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_cd_META);
		p.Cnd_ac_cd.addLinkBeans(p.Cnd_ac_nm);
		p.Cnd_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_cd, true);
		p.CndPanel.add(p.Cnd_ac_nm);
		p.Cnd_ac_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_ac_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_nm, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_ac_typ);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_ac_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ, true);
		p.Cnd_ac_typ.setLinkBeans(p.Cnd_ac_typ_nm);
		p.CndPanel.add(p.Cnd_ac_typ_Label);
		p.CndPanel.add(p.Cnd_ac_typ);
		p.Cnd_ac_typ.setNextBeans(p.Cnd_ac_typ_nm);
		p.Cnd_ac_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_typ_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm);
		p.Cnd_ac_typ_nm.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_ac_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_typ_nm_META);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.Cnd2Panel.add(p.Cnd_ac_if_flg);
		p.Cnd2Panel.setLastBeans(p.Cnd_ac_if_flg);
		p.Cnd_ac_if_flg.setNextBeans(p.Cnd_slip_cnt_flg);
		p.Cnd_ac_if_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.ac_if_flg_META);
		p.Cnd2Panel.add(p.Cnd_slip_cnt_flg);
		p.Cnd_slip_cnt_flg.setNextBeans(p.Cnd_dpt_flg);
		p.Cnd_slip_cnt_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.slip_cnt_flg_META);
		p.Cnd2Panel.add(p.Cnd_dpt_flg);
		p.Cnd_dpt_flg.setNextBeans(p.Cnd_sub_ac_flg);
		p.Cnd_dpt_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.dpt_flg_META);
		p.Cnd2Panel.add(p.Cnd_sub_ac_flg);
		p.Cnd_sub_ac_flg.setNextBeans(p.Cnd_tax_flg);
		p.Cnd_sub_ac_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.sub_ac_flg_META);
		p.Cnd2Panel.add(p.Cnd_tax_flg);
		p.Cnd_tax_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_tax_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0130.CndR.tax_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Cnd2Panel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Cnd2Panel.add(p.Cnd_deselect_all);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_JournalSrchByAc p) {
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
	protected static void jbInitRslt(MBBBP_JournalSrchByAc p) {
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
	protected static void jbInitBtn(MBBBP_JournalSrchByAc p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MBBBP0120);
		p.BtnPanel.setLastBeans(p.Btn_open_MBBBP0120);
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
		MBBBP_JournalSrchByAc_MC.mcInitTop((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitFold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitTab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitTab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitCnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitCnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitCtrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitRslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.mcInitBtn((MBBBP_JournalSrchByAc)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Top((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Fold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Tab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Tab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Cnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Cnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Ctrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Rslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitSRCH_Btn((MBBBP_JournalSrchByAc)this);

		// [REF]ステータスのモードの設定
		MBBBP_JournalSrchByAc_MC.statusInitREF_Top((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Fold((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Tab1((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Tab2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Cnd((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Cnd2((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Ctrl((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Rslt((MBBBP_JournalSrchByAc)this);
		MBBBP_JournalSrchByAc_MC.statusInitREF_Btn((MBBBP_JournalSrchByAc)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_JournalSrchByAc p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_JournalSrchByAc p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MBBBP_JournalSrchByAc p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MBBBP_JournalSrchByAc p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_JournalSrchByAc p) {
		p.Cnd_jnl_grp_no.setListListener(p);
		p.Cnd_jnl_grp_no.addAllListener(p);
		p.Cnd_jnl_rmrks.setListListener(p);
		p.Cnd_jnl_rmrks.addAllListener(p);
		p.Cnd_ac_ym.setListListener(p);
		p.Cnd_ac_ym.addAllListener(p);
		p.Cnd_ac_if_typ.setListListener(p);
		p.Cnd_ac_if_typ.addAllListener(p);
		p.Cnd_ac_if_typ_nm.setListListener(p);
		p.Cnd_ac_if_typ_nm.addAllListener(p);
		p.Cnd_slip_cnt_id.setListListener(p);
		p.Cnd_slip_cnt_id.addAllListener(p);
		p.Cnd_ac_cd.setListListener(p);
		p.Cnd_ac_cd.addAllListener(p);
		p.Cnd_ac_nm.setListListener(p);
		p.Cnd_ac_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_ac_typ.setListListener(p);
		p.Cnd_ac_typ.addAllListener(p);
		p.Cnd_ac_typ_nm.setListListener(p);
		p.Cnd_ac_typ_nm.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
		p.Cnd_ac_if_flg.addAllListener(p);
		p.Cnd_slip_cnt_flg.addAllListener(p);
		p.Cnd_dpt_flg.addAllListener(p);
		p.Cnd_sub_ac_flg.addAllListener(p);
		p.Cnd_tax_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MBBBP_JournalSrchByAc p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_JournalSrchByAc p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_JournalSrchByAc p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_jnl_grp_no.addAllListener(p);
		p.columnRslt_jnl_grp_no.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_if_typ.addAllListener(p);
		p.columnRslt_ac_if_typ.setListListener(p);
		p.columnRslt_ac_if_typ_nm.addAllListener(p);
		p.columnRslt_ac_if_typ_nm.setListListener(p);
		p.columnRslt_slip_cnt_id.addAllListener(p);
		p.columnRslt_slip_cnt_id.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_ac_cd.addAllListener(p);
		p.columnRslt_ac_cd.setListListener(p);
		p.columnRslt_ac_nm.addAllListener(p);
		p.columnRslt_ac_nm.setListListener(p);
		p.columnRslt_sub_ac_cd.addAllListener(p);
		p.columnRslt_sub_ac_cd.setListListener(p);
		p.columnRslt_sub_ac_nm.addAllListener(p);
		p.columnRslt_sub_ac_nm.setListListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_d_amt.addAllListener(p);
		p.columnRslt_d_amt.setListListener(p);
		p.columnRslt_d_tax_amt.addAllListener(p);
		p.columnRslt_d_tax_amt.setListListener(p);
		p.columnRslt_c_amt.addAllListener(p);
		p.columnRslt_c_amt.setListListener(p);
		p.columnRslt_c_tax_amt.addAllListener(p);
		p.columnRslt_c_tax_amt.setListListener(p);
		p.columnRslt_total_amt.addAllListener(p);
		p.columnRslt_total_amt.setListListener(p);
		p.columnRslt_total_tax_amt.addAllListener(p);
		p.columnRslt_total_tax_amt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_d_trd_amt.addAllListener(p);
		p.columnRslt_d_trd_amt.setListListener(p);
		p.columnRslt_d_trd_tax_amt.addAllListener(p);
		p.columnRslt_d_trd_tax_amt.setListListener(p);
		p.columnRslt_c_trd_amt.addAllListener(p);
		p.columnRslt_c_trd_amt.setListListener(p);
		p.columnRslt_c_trd_tax_amt.addAllListener(p);
		p.columnRslt_c_trd_tax_amt.setListListener(p);
		p.columnRslt_total_trd_amt.addAllListener(p);
		p.columnRslt_total_trd_amt.setListListener(p);
		p.columnRslt_total_trd_tax_amt.addAllListener(p);
		p.columnRslt_total_trd_tax_amt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBBP_JournalSrchByAc p) {
		p.Btn_open_MBBBP0120.addAllListener(p);
		p.Btn_open_MBBBP0120.setAPMethodName("doBtn_open_MBBBP0120");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_JournalSrchByAc p){
		p.Cnd_jnl_grp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_jnl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_slip_cnt_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_if_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_slip_cnt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sub_ac_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_tax_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_JournalSrchByAc p){
		p.columnRslt_jnl_grp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_d_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_d_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_c_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_c_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_total_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_total_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_d_trd_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_d_trd_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_c_trd_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_c_trd_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_total_trd_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_total_trd_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBBP_JournalSrchByAc p){
		p.Btn_open_MBBBP0120.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_JournalSrchByAc p){
		p.Cnd_jnl_grp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_jnl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_slip_cnt_id.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slip_cnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sub_ac_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tax_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_JournalSrchByAc p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_JournalSrchByAc p){
		p.columnRslt_jnl_grp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_cnt_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_d_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_d_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_c_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_c_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_total_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_total_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_d_trd_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_d_trd_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_c_trd_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_c_trd_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_total_trd_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_total_trd_tax_amt.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBBP_JournalSrchByAc p){
		p.Btn_open_MBBBP0120.putMode(p, REF, MCMode.ENABLE);

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
		MBBBP_JournalSrchByAc_MC.setTableConfigRslt((MBBBP_JournalSrchByAc)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_JournalSrchByAc p) {
		p.columnRslt_jnl_grp_no.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.jnl_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_grp_no);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_if_typ.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.ac_if_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_if_typ);
		p.columnRslt_ac_if_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.ac_if_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_if_typ_nm);
		p.columnRslt_slip_cnt_id.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.slip_cnt_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_cnt_id);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_cd);
		p.columnRslt_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_nm);
		p.columnRslt_sub_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.sub_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_ac_cd);
		p.columnRslt_sub_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.sub_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_ac_nm);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_d_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.d_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_amt);
		p.columnRslt_d_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.d_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_tax_amt);
		p.columnRslt_c_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.c_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_c_amt);
		p.columnRslt_c_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.c_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_c_tax_amt);
		p.columnRslt_total_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.total_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_total_amt);
		p.columnRslt_total_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.total_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_total_tax_amt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_d_trd_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.d_trd_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_trd_amt);
		p.columnRslt_d_trd_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.d_trd_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_trd_tax_amt);
		p.columnRslt_c_trd_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.c_trd_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_c_trd_amt);
		p.columnRslt_c_trd_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.c_trd_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_c_trd_tax_amt);
		p.columnRslt_total_trd_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.total_trd_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_total_trd_amt);
		p.columnRslt_total_trd_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0130.RsltR.total_trd_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_total_trd_tax_amt);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_jnl_grp_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_grp_no.getListConfig().setPutter(getCnd_jnl_grp_no_ListPutter());
		Cnd_ac_if_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_if_typ.getListConfig().setPutter(getCnd_ac_if_typ_ListPutter());
		Cnd_ac_cd.getListConfig().setPutter(getCnd_ac_cd_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_ac_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ.getListConfig().setPutter(getCnd_ac_typ_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_jnl_grp_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_grp_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.JnlGrpNo");
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
	 * [Cnd_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Account");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTax");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_jnl_grp_no) return getCnd_jnl_grp_no(row, info);
		if(combo == Cnd_ac_if_typ) return getCnd_ac_if_typ(row, info);
		if(combo == Cnd_ac_cd) return getCnd_ac_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_ac_typ) return getCnd_ac_typ(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_select_all) doCnd_select_all(info);
		else if (ap == Cnd_deselect_all) doCnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_open_MBBBP0120) doBtn_open_MBBBP0120(info);
	}

	/**
	 * [Cnd]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0120(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_jnl_grp_no) return doCnd_jnl_grp_no_VC(info);
		if (vc == Cnd_jnl_rmrks) return doCnd_jnl_rmrks_VC(info);
		if (vc == Cnd_ac_ym) return doCnd_ac_ym_VC(info);
		if (vc == Cnd_ac_if_typ) return doCnd_ac_if_typ_VC(info);
		if (vc == Cnd_ac_if_typ_nm) return doCnd_ac_if_typ_nm_VC(info);
		if (vc == Cnd_slip_cnt_id) return doCnd_slip_cnt_id_VC(info);
		if (vc == Cnd_ac_cd) return doCnd_ac_cd_VC(info);
		if (vc == Cnd_ac_nm) return doCnd_ac_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_ac_typ) return doCnd_ac_typ_VC(info);
		if (vc == Cnd_ac_typ_nm) return doCnd_ac_typ_nm_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == Cnd_ac_if_flg) return doCnd_ac_if_flg_VC(info);
		if (vc == Cnd_slip_cnt_flg) return doCnd_slip_cnt_flg_VC(info);
		if (vc == Cnd_dpt_flg) return doCnd_dpt_flg_VC(info);
		if (vc == Cnd_sub_ac_flg) return doCnd_sub_ac_flg_VC(info);
		if (vc == Cnd_tax_flg) return doCnd_tax_flg_VC(info);
		if (vc == columnRslt_jnl_grp_no) return doRslt_jnl_grp_no_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_if_typ) return doRslt_ac_if_typ_VC(info);
		if (vc == columnRslt_ac_if_typ_nm) return doRslt_ac_if_typ_nm_VC(info);
		if (vc == columnRslt_slip_cnt_id) return doRslt_slip_cnt_id_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_ac_cd) return doRslt_ac_cd_VC(info);
		if (vc == columnRslt_ac_nm) return doRslt_ac_nm_VC(info);
		if (vc == columnRslt_sub_ac_cd) return doRslt_sub_ac_cd_VC(info);
		if (vc == columnRslt_sub_ac_nm) return doRslt_sub_ac_nm_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_d_amt) return doRslt_d_amt_VC(info);
		if (vc == columnRslt_d_tax_amt) return doRslt_d_tax_amt_VC(info);
		if (vc == columnRslt_c_amt) return doRslt_c_amt_VC(info);
		if (vc == columnRslt_c_tax_amt) return doRslt_c_tax_amt_VC(info);
		if (vc == columnRslt_total_amt) return doRslt_total_amt_VC(info);
		if (vc == columnRslt_total_tax_amt) return doRslt_total_tax_amt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_d_trd_amt) return doRslt_d_trd_amt_VC(info);
		if (vc == columnRslt_d_trd_tax_amt) return doRslt_d_trd_tax_amt_VC(info);
		if (vc == columnRslt_c_trd_amt) return doRslt_c_trd_amt_VC(info);
		if (vc == columnRslt_c_trd_tax_amt) return doRslt_c_trd_tax_amt_VC(info);
		if (vc == columnRslt_total_trd_amt) return doRslt_total_trd_amt_VC(info);
		if (vc == columnRslt_total_trd_tax_amt) return doRslt_total_trd_tax_amt_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[jnl_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_grp_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slip_cnt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_if_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_if_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slip_cnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slip_cnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_if_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_if_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_if_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_cnt_id_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[c_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_c_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[c_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_c_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[total_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_total_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[total_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_total_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_trd_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_trd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_trd_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_trd_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[c_trd_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_c_trd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[c_trd_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_c_trd_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[total_trd_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_total_trd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[total_trd_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_total_trd_tax_amt_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NC(info);
		else if (nc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NC(info);
		else if (nc == Cnd_ac_ym) doCnd_ac_ym_NC(info);
		else if (nc == Cnd_ac_if_typ) doCnd_ac_if_typ_NC(info);
		else if (nc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NC(info);
		else if (nc == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NC(info);
		else if (nc == Cnd_ac_cd) doCnd_ac_cd_NC(info);
		else if (nc == Cnd_ac_nm) doCnd_ac_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_ac_typ) doCnd_ac_typ_NC(info);
		else if (nc == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == Cnd_ac_if_flg) doCnd_ac_if_flg_NC(info);
		else if (nc == Cnd_slip_cnt_flg) doCnd_slip_cnt_flg_NC(info);
		else if (nc == Cnd_dpt_flg) doCnd_dpt_flg_NC(info);
		else if (nc == Cnd_sub_ac_flg) doCnd_sub_ac_flg_NC(info);
		else if (nc == Cnd_tax_flg) doCnd_tax_flg_NC(info);
		else if (nc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_if_typ) doRslt_ac_if_typ_NC(info);
		else if (nc == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NC(info);
		else if (nc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_ac_cd) doRslt_ac_cd_NC(info);
		else if (nc == columnRslt_ac_nm) doRslt_ac_nm_NC(info);
		else if (nc == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NC(info);
		else if (nc == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_d_amt) doRslt_d_amt_NC(info);
		else if (nc == columnRslt_d_tax_amt) doRslt_d_tax_amt_NC(info);
		else if (nc == columnRslt_c_amt) doRslt_c_amt_NC(info);
		else if (nc == columnRslt_c_tax_amt) doRslt_c_tax_amt_NC(info);
		else if (nc == columnRslt_total_amt) doRslt_total_amt_NC(info);
		else if (nc == columnRslt_total_tax_amt) doRslt_total_tax_amt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_d_trd_amt) doRslt_d_trd_amt_NC(info);
		else if (nc == columnRslt_d_trd_tax_amt) doRslt_d_trd_tax_amt_NC(info);
		else if (nc == columnRslt_c_trd_amt) doRslt_c_trd_amt_NC(info);
		else if (nc == columnRslt_c_trd_tax_amt) doRslt_c_trd_tax_amt_NC(info);
		else if (nc == columnRslt_total_trd_amt) doRslt_total_trd_amt_NC(info);
		else if (nc == columnRslt_total_trd_tax_amt) doRslt_total_trd_tax_amt_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_if_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NE(info);
		else if (ne == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NE(info);
		else if (ne == Cnd_ac_ym) doCnd_ac_ym_NE(info);
		else if (ne == Cnd_ac_if_typ) doCnd_ac_if_typ_NE(info);
		else if (ne == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NE(info);
		else if (ne == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NE(info);
		else if (ne == Cnd_ac_cd) doCnd_ac_cd_NE(info);
		else if (ne == Cnd_ac_nm) doCnd_ac_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_ac_typ) doCnd_ac_typ_NE(info);
		else if (ne == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == Cnd_ac_if_flg) doCnd_ac_if_flg_NE(info);
		else if (ne == Cnd_slip_cnt_flg) doCnd_slip_cnt_flg_NE(info);
		else if (ne == Cnd_dpt_flg) doCnd_dpt_flg_NE(info);
		else if (ne == Cnd_sub_ac_flg) doCnd_sub_ac_flg_NE(info);
		else if (ne == Cnd_tax_flg) doCnd_tax_flg_NE(info);
		else if (ne == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_if_typ) doRslt_ac_if_typ_NE(info);
		else if (ne == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NE(info);
		else if (ne == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_ac_cd) doRslt_ac_cd_NE(info);
		else if (ne == columnRslt_ac_nm) doRslt_ac_nm_NE(info);
		else if (ne == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NE(info);
		else if (ne == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_d_amt) doRslt_d_amt_NE(info);
		else if (ne == columnRslt_d_tax_amt) doRslt_d_tax_amt_NE(info);
		else if (ne == columnRslt_c_amt) doRslt_c_amt_NE(info);
		else if (ne == columnRslt_c_tax_amt) doRslt_c_tax_amt_NE(info);
		else if (ne == columnRslt_total_amt) doRslt_total_amt_NE(info);
		else if (ne == columnRslt_total_tax_amt) doRslt_total_tax_amt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_d_trd_amt) doRslt_d_trd_amt_NE(info);
		else if (ne == columnRslt_d_trd_tax_amt) doRslt_d_trd_tax_amt_NE(info);
		else if (ne == columnRslt_c_trd_amt) doRslt_c_trd_amt_NE(info);
		else if (ne == columnRslt_c_trd_tax_amt) doRslt_c_trd_tax_amt_NE(info);
		else if (ne == columnRslt_total_trd_amt) doRslt_total_trd_amt_NE(info);
		else if (ne == columnRslt_total_trd_tax_amt) doRslt_total_trd_tax_amt_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_if_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_jnl_grp_no) doCnd_jnl_grp_no_NX(info);
		else if (nx == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NX(info);
		else if (nx == Cnd_ac_ym) doCnd_ac_ym_NX(info);
		else if (nx == Cnd_ac_if_typ) doCnd_ac_if_typ_NX(info);
		else if (nx == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NX(info);
		else if (nx == Cnd_slip_cnt_id) doCnd_slip_cnt_id_NX(info);
		else if (nx == Cnd_ac_cd) doCnd_ac_cd_NX(info);
		else if (nx == Cnd_ac_nm) doCnd_ac_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_ac_typ) doCnd_ac_typ_NX(info);
		else if (nx == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == Cnd_ac_if_flg) doCnd_ac_if_flg_NX(info);
		else if (nx == Cnd_slip_cnt_flg) doCnd_slip_cnt_flg_NX(info);
		else if (nx == Cnd_dpt_flg) doCnd_dpt_flg_NX(info);
		else if (nx == Cnd_sub_ac_flg) doCnd_sub_ac_flg_NX(info);
		else if (nx == Cnd_tax_flg) doCnd_tax_flg_NX(info);
		else if (nx == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_if_typ) doRslt_ac_if_typ_NX(info);
		else if (nx == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_NX(info);
		else if (nx == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_ac_cd) doRslt_ac_cd_NX(info);
		else if (nx == columnRslt_ac_nm) doRslt_ac_nm_NX(info);
		else if (nx == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_NX(info);
		else if (nx == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_d_amt) doRslt_d_amt_NX(info);
		else if (nx == columnRslt_d_tax_amt) doRslt_d_tax_amt_NX(info);
		else if (nx == columnRslt_c_amt) doRslt_c_amt_NX(info);
		else if (nx == columnRslt_c_tax_amt) doRslt_c_tax_amt_NX(info);
		else if (nx == columnRslt_total_amt) doRslt_total_amt_NX(info);
		else if (nx == columnRslt_total_tax_amt) doRslt_total_tax_amt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_d_trd_amt) doRslt_d_trd_amt_NX(info);
		else if (nx == columnRslt_d_trd_tax_amt) doRslt_d_trd_tax_amt_NX(info);
		else if (nx == columnRslt_c_trd_amt) doRslt_c_trd_amt_NX(info);
		else if (nx == columnRslt_c_trd_tax_amt) doRslt_c_trd_tax_amt_NX(info);
		else if (nx == columnRslt_total_trd_amt) doRslt_total_trd_amt_NX(info);
		else if (nx == columnRslt_total_trd_tax_amt) doRslt_total_trd_tax_amt_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_cnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_if_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_jnl_grp_no) doCnd_jnl_grp_no_LC(info);
		else if (lc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_LC(info);
		else if (lc == Cnd_ac_ym) doCnd_ac_ym_LC(info);
		else if (lc == Cnd_ac_if_typ) doCnd_ac_if_typ_LC(info);
		else if (lc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_LC(info);
		else if (lc == Cnd_slip_cnt_id) doCnd_slip_cnt_id_LC(info);
		else if (lc == Cnd_ac_cd) doCnd_ac_cd_LC(info);
		else if (lc == Cnd_ac_nm) doCnd_ac_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_ac_typ) doCnd_ac_typ_LC(info);
		else if (lc == Cnd_ac_typ_nm) doCnd_ac_typ_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_if_typ) doRslt_ac_if_typ_LC(info);
		else if (lc == columnRslt_ac_if_typ_nm) doRslt_ac_if_typ_nm_LC(info);
		else if (lc == columnRslt_slip_cnt_id) doRslt_slip_cnt_id_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_ac_cd) doRslt_ac_cd_LC(info);
		else if (lc == columnRslt_ac_nm) doRslt_ac_nm_LC(info);
		else if (lc == columnRslt_sub_ac_cd) doRslt_sub_ac_cd_LC(info);
		else if (lc == columnRslt_sub_ac_nm) doRslt_sub_ac_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_d_amt) doRslt_d_amt_LC(info);
		else if (lc == columnRslt_d_tax_amt) doRslt_d_tax_amt_LC(info);
		else if (lc == columnRslt_c_amt) doRslt_c_amt_LC(info);
		else if (lc == columnRslt_c_tax_amt) doRslt_c_tax_amt_LC(info);
		else if (lc == columnRslt_total_amt) doRslt_total_amt_LC(info);
		else if (lc == columnRslt_total_tax_amt) doRslt_total_tax_amt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_d_trd_amt) doRslt_d_trd_amt_LC(info);
		else if (lc == columnRslt_d_trd_tax_amt) doRslt_d_trd_tax_amt_LC(info);
		else if (lc == columnRslt_c_trd_amt) doRslt_c_trd_amt_LC(info);
		else if (lc == columnRslt_c_trd_tax_amt) doRslt_c_trd_tax_amt_LC(info);
		else if (lc == columnRslt_total_trd_amt) doRslt_total_trd_amt_LC(info);
		else if (lc == columnRslt_total_trd_tax_amt) doRslt_total_trd_tax_amt_LC(info);
	}

	/**
	 * [Cnd]パネルの[jnl_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_cnt_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_if_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_if_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_if_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_cnt_id_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_trd_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_trd_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[c_trd_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_c_trd_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[total_trd_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_total_trd_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_grp_no]の作成メソッド
	 */
	public MCList getCnd_jnl_grp_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getJnlGrpNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_if_typ]の作成メソッド
	 */
	public MCList getCnd_ac_if_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcIfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_cd]の作成メソッド
	 */
	public MCList getCnd_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ]の作成メソッド
	 */
	public MCList getCnd_ac_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tax_cd]の作成メソッド
	 */
	public MCList getCnd_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTax(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0130.Srch01")) {
			return new MB_MBBBL0130_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0130_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0130_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0130_Srch01Bridge() {
			p_MB_MBBBL0130_Srch01 = new MCParam(PDef.MB_MBBBL0130_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0130_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0130.RsltR.class));

			p_MB_MBBBL0130_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0130_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0130_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0130_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0130_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0130.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0130.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0130.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0130_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0130_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0130.RsltR>)p_MB_MBBBL0130_Srch01.getContainerParam().getDownBlock(0));
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