package mcframe.clientMAUA.MAUAP1060;

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
 * 画面"MAUAP_Account"パネルクラスです。<p>
 *
 * 勘定科目の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUAP_Account_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SCREEN_ID = "MAUAP1060";

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
	public MCLabel Cnd_ac_nm2_Label = null;
	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public MCTextField Cnd_ac_nm2 = null;
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public MCCheckBox Cnd_sub_flg = null;
	public MCLabel Cnd_dc_typ_Label = null;
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dc_typ = null;
	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public MCTextField Cnd_dc_typ_nm = null;
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
	public MCLabel Cnd_ap_typ_Label = null;
	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_typ = null;
	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public MCTextField Cnd_ap_typ_nm = null;
	public MCLabel Cnd_ar_typ_Label = null;
	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ar_typ = null;
	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public MCTextField Cnd_ar_typ_nm = null;
	public MCLabel Cnd_ac_tax_cd_Label = null;
	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_tax_cd = null;
	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public MCTextField Cnd_ac_tax_nm = null;
	public MCLabel Cnd_ac_typ1_Label = null;
	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ1 = null;
	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm1 = null;
	public MCLabel Cnd_ac_typ2_Label = null;
	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ2 = null;
	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm2 = null;
	public MCLabel Cnd_ac_typ3_Label = null;
	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ3 = null;
	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm3 = null;
	public MCLabel Cnd_ac_typ4_Label = null;
	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ4 = null;
	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm4 = null;
	public MCLabel Cnd_ac_typ5_Label = null;
	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_typ5 = null;
	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public MCTextField Cnd_ac_typ_nm5 = null;
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
	// [SrchBtn1]ブロック関連のField定義
	public MCPanel SrchBtn1Panel = null;
	// [SrchBtn1]ブロックの項目のField定義
	// [SrchBtn2]ブロック関連のField定義
	public MCPanel SrchBtn2Panel = null;
	// [SrchBtn2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMAUA.MAUAP1060.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_nm2 = null;
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dc_typ = null;
	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dc_typ_nm = null;
	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ = null;
	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm = null;
	/**
	 * Subsidiary account used flg. 補助科目使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_flg = null;
	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_tax_cd = null;
	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_tax_nm = null;
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_tax_typ = null;
	/**
	 * Aggregated 0 used flg. 集計０使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum0_flg = null;
	/**
	 * Aggregated 1 used flg. 集計１使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum1_flg = null;
	/**
	 * Aggregated 2 used flg. 集計２使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum2_flg = null;
	/**
	 * Aggregated 3 used flg. 集計３使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum3_flg = null;
	/**
	 * Aggregated 4 used flg. 集計４使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum4_flg = null;
	/**
	 * Aggregated 5 used flg. 集計５使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum5_flg = null;
	/**
	 * Foreign currency flg. 外貨ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Project used flg. プロジェクト使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_project_flg = null;
	/**
	 * BP used flg. 取引先使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_flg = null;
	/**
	 * PIC used flg. 担当者使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_flg = null;
	/**
	 * Bank account used flg. 口座使用ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_flg = null;
	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ = null;
	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ_nm = null;
	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ = null;
	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ_nm = null;
	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ1 = null;
	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm1 = null;
	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ2 = null;
	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm2 = null;
	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ3 = null;
	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm3 = null;
	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ4 = null;
	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm4 = null;
	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ5 = null;
	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_typ_nm5 = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
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
	private final mcframe.clientMAUA.MAUAP1060.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUA.MAUAP1060.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMAUA.MAUAP1060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1060.CndR createCndR() {
		return mcframe.clientMAUA.MAUAP1060.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMAUA.MAUAP1060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMAUA.MAUAP1060.RsltR createRsltR() {
		return mcframe.clientMAUA.MAUAP1060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMAUA.MAUAP1060.RsltR.class);
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
		ret.add(SrchBtn1Panel);
		ret.add(SrchBtn2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Account_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Account_MC_A(String name) {
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
		MAUAP_Account_MC.jbCreateTop((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateCnd((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateSrchBtn1((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateSrchBtn2((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateCtrl((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateRslt((MAUAP_Account)this);
		MAUAP_Account_MC.jbCreateBtn((MAUAP_Account)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MAUAP_Account p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MAUAP_Account p) {
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MAUAP_Account p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MAUAP_Account p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MAUAP_Account p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MAUAP_Account p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUAP_Account p) {
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

	
	/** [Cnd_dc_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dc_typ_p = null;

	/**
	 * [Cnd_dc_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dc_typ_ListPutter() {
		if (Cnd_dc_typ_p == null) {
			Cnd_dc_typ_p = createCnd_dc_typ_ListPutter(Cnd_dc_typ, "dc_typ", "dc_typ_nm");

		}
		return Cnd_dc_typ_p;
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
	
	
	/** [Cnd_ap_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ap_typ_p = null;

	/**
	 * [Cnd_ap_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_typ_ListPutter() {
		if (Cnd_ap_typ_p == null) {
			Cnd_ap_typ_p = createCnd_ap_typ_ListPutter(Cnd_ap_typ, "ap_typ", "ap_typ_nm");

		}
		return Cnd_ap_typ_p;
	}
	
	
	/** [Cnd_ar_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ar_typ_p = null;

	/**
	 * [Cnd_ar_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_typ_ListPutter() {
		if (Cnd_ar_typ_p == null) {
			Cnd_ar_typ_p = createCnd_ar_typ_ListPutter(Cnd_ar_typ, "ar_typ", "ar_typ_nm");

		}
		return Cnd_ar_typ_p;
	}
	
	
	/** [Cnd_ac_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_tax_cd_p = null;

	/**
	 * [Cnd_ac_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_tax_cd_ListPutter() {
		if (Cnd_ac_tax_cd_p == null) {
			Cnd_ac_tax_cd_p = createCnd_ac_tax_cd_ListPutter(Cnd_ac_tax_cd, "ac_tax_cd", "ac_tax_nm");

		}
		return Cnd_ac_tax_cd_p;
	}
	
	
	/** [Cnd_ac_typ1_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ1_p = null;

	/**
	 * [Cnd_ac_typ1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ1_ListPutter() {
		if (Cnd_ac_typ1_p == null) {
			Cnd_ac_typ1_p = createCnd_ac_typ1_ListPutter(Cnd_ac_typ1, "ac_typ1", "ac_typ_nm1");

		}
		return Cnd_ac_typ1_p;
	}
	
	
	/** [Cnd_ac_typ2_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ2_p = null;

	/**
	 * [Cnd_ac_typ2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ2_ListPutter() {
		if (Cnd_ac_typ2_p == null) {
			Cnd_ac_typ2_p = createCnd_ac_typ2_ListPutter(Cnd_ac_typ2, "ac_typ2", "ac_typ_nm2");

		}
		return Cnd_ac_typ2_p;
	}
	
	
	/** [Cnd_ac_typ3_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ3_p = null;

	/**
	 * [Cnd_ac_typ3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ3_ListPutter() {
		if (Cnd_ac_typ3_p == null) {
			Cnd_ac_typ3_p = createCnd_ac_typ3_ListPutter(Cnd_ac_typ3, "ac_typ3", "ac_typ_nm3");

		}
		return Cnd_ac_typ3_p;
	}
	
	
	/** [Cnd_ac_typ4_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ4_p = null;

	/**
	 * [Cnd_ac_typ4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ4_ListPutter() {
		if (Cnd_ac_typ4_p == null) {
			Cnd_ac_typ4_p = createCnd_ac_typ4_ListPutter(Cnd_ac_typ4, "ac_typ4", "ac_typ_nm4");

		}
		return Cnd_ac_typ4_p;
	}
	
	
	/** [Cnd_ac_typ5_ListPutter]の定義 */
	private MCListPutter Cnd_ac_typ5_p = null;

	/**
	 * [Cnd_ac_typ5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_typ5_ListPutter() {
		if (Cnd_ac_typ5_p == null) {
			Cnd_ac_typ5_p = createCnd_ac_typ5_ListPutter(Cnd_ac_typ5, "ac_typ5", "ac_typ_nm5");

		}
		return Cnd_ac_typ5_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Account create(){
		MAUAP_Account p = new MAUAP_Account();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Account create(String name){
		MAUAP_Account p = new MAUAP_Account(name);
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
		MAUAP_Account_MC.jbfInitTop((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitCnd((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitSrchBtn1((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitSrchBtn2((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitCtrl((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitRslt((MAUAP_Account)this);
		MAUAP_Account_MC.jbfInitBtn((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitTop((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitCnd((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitSrchBtn1((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitSrchBtn2((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitCtrl((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitRslt((MAUAP_Account)this);
		MAUAP_Account_MC.jbInitBtn((MAUAP_Account)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MAUAP_Account p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MAUAP_Account p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ac_cd_Label = p.beansFactory.createLabel("Cnd.ac_cd_Label");
		p.Cnd_ac_cd = p.beansFactory.createTextField("Cnd.ac_cd");
		p.Cnd_ac_cd.setLabel(p.Cnd_ac_cd_Label);
		p.Cnd_ac_nm = p.beansFactory.createTextField("Cnd.ac_nm");
		p.Cnd_ac_nm2_Label = p.beansFactory.createLabel("Cnd.ac_nm2_Label");
		p.Cnd_ac_nm2 = p.beansFactory.createTextField("Cnd.ac_nm2");
		p.Cnd_ac_nm2.setLabel(p.Cnd_ac_nm2_Label);
		p.Cnd_sub_flg = p.beansFactory.createCheckBox("Cnd.sub_flg");
		p.Cnd_dc_typ_Label = p.beansFactory.createLabel("Cnd.dc_typ_Label");
		p.Cnd_dc_typ = p.beansFactory.createTextComboBox("Cnd.dc_typ");
		p.Cnd_dc_typ.setLabel(p.Cnd_dc_typ_Label);
		p.Cnd_dc_typ_nm = p.beansFactory.createTextField("Cnd.dc_typ_nm");
		p.Cnd_ac_typ_Label = p.beansFactory.createLabel("Cnd.ac_typ_Label");
		p.Cnd_ac_typ = p.beansFactory.createTextComboBox("Cnd.ac_typ");
		p.Cnd_ac_typ.setLabel(p.Cnd_ac_typ_Label);
		p.Cnd_ac_typ_nm = p.beansFactory.createTextField("Cnd.ac_typ_nm");
		p.Cnd_ap_typ_Label = p.beansFactory.createLabel("Cnd.ap_typ_Label");
		p.Cnd_ap_typ = p.beansFactory.createTextComboBox("Cnd.ap_typ");
		p.Cnd_ap_typ.setLabel(p.Cnd_ap_typ_Label);
		p.Cnd_ap_typ_nm = p.beansFactory.createTextField("Cnd.ap_typ_nm");
		p.Cnd_ar_typ_Label = p.beansFactory.createLabel("Cnd.ar_typ_Label");
		p.Cnd_ar_typ = p.beansFactory.createTextComboBox("Cnd.ar_typ");
		p.Cnd_ar_typ.setLabel(p.Cnd_ar_typ_Label);
		p.Cnd_ar_typ_nm = p.beansFactory.createTextField("Cnd.ar_typ_nm");
		p.Cnd_ac_tax_cd_Label = p.beansFactory.createLabel("Cnd.ac_tax_cd_Label");
		p.Cnd_ac_tax_cd = p.beansFactory.createTextComboBox("Cnd.ac_tax_cd");
		p.Cnd_ac_tax_cd.setLabel(p.Cnd_ac_tax_cd_Label);
		p.Cnd_ac_tax_nm = p.beansFactory.createTextField("Cnd.ac_tax_nm");
		p.Cnd_ac_typ1_Label = p.beansFactory.createLabel("Cnd.ac_typ1_Label");
		p.Cnd_ac_typ1 = p.beansFactory.createTextComboBox("Cnd.ac_typ1");
		p.Cnd_ac_typ1.setLabel(p.Cnd_ac_typ1_Label);
		p.Cnd_ac_typ_nm1 = p.beansFactory.createTextField("Cnd.ac_typ_nm1");
		p.Cnd_ac_typ2_Label = p.beansFactory.createLabel("Cnd.ac_typ2_Label");
		p.Cnd_ac_typ2 = p.beansFactory.createTextComboBox("Cnd.ac_typ2");
		p.Cnd_ac_typ2.setLabel(p.Cnd_ac_typ2_Label);
		p.Cnd_ac_typ_nm2 = p.beansFactory.createTextField("Cnd.ac_typ_nm2");
		p.Cnd_ac_typ3_Label = p.beansFactory.createLabel("Cnd.ac_typ3_Label");
		p.Cnd_ac_typ3 = p.beansFactory.createTextComboBox("Cnd.ac_typ3");
		p.Cnd_ac_typ3.setLabel(p.Cnd_ac_typ3_Label);
		p.Cnd_ac_typ_nm3 = p.beansFactory.createTextField("Cnd.ac_typ_nm3");
		p.Cnd_ac_typ4_Label = p.beansFactory.createLabel("Cnd.ac_typ4_Label");
		p.Cnd_ac_typ4 = p.beansFactory.createTextComboBox("Cnd.ac_typ4");
		p.Cnd_ac_typ4.setLabel(p.Cnd_ac_typ4_Label);
		p.Cnd_ac_typ_nm4 = p.beansFactory.createTextField("Cnd.ac_typ_nm4");
		p.Cnd_ac_typ5_Label = p.beansFactory.createLabel("Cnd.ac_typ5_Label");
		p.Cnd_ac_typ5 = p.beansFactory.createTextComboBox("Cnd.ac_typ5");
		p.Cnd_ac_typ5.setLabel(p.Cnd_ac_typ5_Label);
		p.Cnd_ac_typ_nm5 = p.beansFactory.createTextField("Cnd.ac_typ_nm5");
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
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MAUAP_Account p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MAUAP_Account p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MAUAP_Account p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MAUAP_Account p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_ac_cd = p.beansFactory.createTableColumn("Rslt.ac_cd", MCColumnType.TEXT);
		p.columnRslt_ac_nm = p.beansFactory.createTableColumn("Rslt.ac_nm", MCColumnType.TEXT);
		p.columnRslt_ac_nm2 = p.beansFactory.createTableColumn("Rslt.ac_nm2", MCColumnType.TEXT);
		p.columnRslt_dc_typ = p.beansFactory.createTableColumn("Rslt.dc_typ", MCColumnType.TEXT);
		p.columnRslt_dc_typ_nm = p.beansFactory.createTableColumn("Rslt.dc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_typ = p.beansFactory.createTableColumn("Rslt.ac_typ", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sub_flg = p.beansFactory.createTableColumn("Rslt.sub_flg", MCColumnType.CHECK);
		p.columnRslt_ac_tax_cd = p.beansFactory.createTableColumn("Rslt.ac_tax_cd", MCColumnType.TEXT);
		p.columnRslt_ac_tax_nm = p.beansFactory.createTableColumn("Rslt.ac_tax_nm", MCColumnType.TEXT);
		p.columnRslt_ac_tax_typ = p.beansFactory.createTableColumn("Rslt.ac_tax_typ", MCColumnType.TEXT);
		p.columnRslt_sum0_flg = p.beansFactory.createTableColumn("Rslt.sum0_flg", MCColumnType.CHECK);
		p.columnRslt_sum1_flg = p.beansFactory.createTableColumn("Rslt.sum1_flg", MCColumnType.CHECK);
		p.columnRslt_sum2_flg = p.beansFactory.createTableColumn("Rslt.sum2_flg", MCColumnType.CHECK);
		p.columnRslt_sum3_flg = p.beansFactory.createTableColumn("Rslt.sum3_flg", MCColumnType.CHECK);
		p.columnRslt_sum4_flg = p.beansFactory.createTableColumn("Rslt.sum4_flg", MCColumnType.CHECK);
		p.columnRslt_sum5_flg = p.beansFactory.createTableColumn("Rslt.sum5_flg", MCColumnType.CHECK);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_project_flg = p.beansFactory.createTableColumn("Rslt.project_flg", MCColumnType.CHECK);
		p.columnRslt_bp_flg = p.beansFactory.createTableColumn("Rslt.bp_flg", MCColumnType.CHECK);
		p.columnRslt_usr_flg = p.beansFactory.createTableColumn("Rslt.usr_flg", MCColumnType.CHECK);
		p.columnRslt_bank_ac_flg = p.beansFactory.createTableColumn("Rslt.bank_ac_flg", MCColumnType.CHECK);
		p.columnRslt_ap_typ = p.beansFactory.createTableColumn("Rslt.ap_typ", MCColumnType.TEXT);
		p.columnRslt_ap_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ar_typ = p.beansFactory.createTableColumn("Rslt.ar_typ", MCColumnType.TEXT);
		p.columnRslt_ar_typ_nm = p.beansFactory.createTableColumn("Rslt.ar_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_typ1 = p.beansFactory.createTableColumn("Rslt.ac_typ1", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm1 = p.beansFactory.createTableColumn("Rslt.ac_typ_nm1", MCColumnType.TEXT);
		p.columnRslt_ac_typ2 = p.beansFactory.createTableColumn("Rslt.ac_typ2", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm2 = p.beansFactory.createTableColumn("Rslt.ac_typ_nm2", MCColumnType.TEXT);
		p.columnRslt_ac_typ3 = p.beansFactory.createTableColumn("Rslt.ac_typ3", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm3 = p.beansFactory.createTableColumn("Rslt.ac_typ_nm3", MCColumnType.TEXT);
		p.columnRslt_ac_typ4 = p.beansFactory.createTableColumn("Rslt.ac_typ4", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm4 = p.beansFactory.createTableColumn("Rslt.ac_typ_nm4", MCColumnType.TEXT);
		p.columnRslt_ac_typ5 = p.beansFactory.createTableColumn("Rslt.ac_typ5", MCColumnType.TEXT);
		p.columnRslt_ac_typ_nm5 = p.beansFactory.createTableColumn("Rslt.ac_typ_nm5", MCColumnType.TEXT);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUAP_Account p) {
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
	protected static void jbInitTop(MAUAP_Account p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtn1Panel);
		p.TopPanel.add(p.SrchBtn1Panel, null);
		p.SrchBtn1Panel.setNextBeans(p.SrchBtn2Panel);
		p.TopPanel.add(p.SrchBtn2Panel, null);
		p.SrchBtn2Panel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MAUAP_Account p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ac_cd_Label);
		p.CndPanel.add(p.Cnd_ac_cd);
		p.CndPanel.setLastBeans(p.Cnd_ac_cd);
		p.Cnd_ac_cd.setNextBeans(p.Cnd_ac_nm);
		p.Cnd_ac_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_cd_META);
		p.setPluralValueEnable(p.Cnd_ac_cd, true);
		p.CndPanel.add(p.Cnd_ac_nm);
		p.Cnd_ac_nm.setNextBeans(p.Cnd_ac_nm2);
		p.Cnd_ac_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_nm, true);
		p.CndPanel.add(p.Cnd_ac_nm2_Label);
		p.CndPanel.add(p.Cnd_ac_nm2);
		p.Cnd_ac_nm2.setNextBeans(p.Cnd_sub_flg);
		p.Cnd_ac_nm2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_nm2_META);
		p.setPluralValueEnable(p.Cnd_ac_nm2, true);
		p.CndPanel.add(p.Cnd_sub_flg);
		p.Cnd_sub_flg.setNextBeans(p.Cnd_dc_typ);
		p.Cnd_sub_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.sub_flg_META);
		p.Cnd_dc_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dc_typ, true);
		p.Cnd_dc_typ.setLinkBeans(p.Cnd_dc_typ_nm);
		p.CndPanel.add(p.Cnd_dc_typ_Label);
		p.CndPanel.add(p.Cnd_dc_typ);
		p.Cnd_dc_typ.setNextBeans(p.Cnd_dc_typ_nm);
		p.Cnd_dc_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.dc_typ_META);
		p.CndPanel.add(p.Cnd_dc_typ_nm);
		p.Cnd_dc_typ_nm.setNextBeans(p.Cnd_ac_typ);
		p.Cnd_dc_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.dc_typ_nm_META);
		p.Cnd_ac_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ, true);
		p.Cnd_ac_typ.setLinkBeans(p.Cnd_ac_typ_nm);
		p.CndPanel.add(p.Cnd_ac_typ_Label);
		p.CndPanel.add(p.Cnd_ac_typ);
		p.Cnd_ac_typ.setNextBeans(p.Cnd_ac_typ_nm);
		p.Cnd_ac_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm);
		p.Cnd_ac_typ_nm.setNextBeans(p.Cnd_ap_typ);
		p.Cnd_ac_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm_META);
		p.Cnd_ap_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_typ, true);
		p.Cnd_ap_typ.setLinkBeans(p.Cnd_ap_typ_nm);
		p.CndPanel.add(p.Cnd_ap_typ_Label);
		p.CndPanel.add(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setNextBeans(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ap_typ_META);
		p.CndPanel.add(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ_nm.setNextBeans(p.Cnd_ar_typ);
		p.Cnd_ap_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ap_typ_nm_META);
		p.Cnd_ar_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_typ, true);
		p.Cnd_ar_typ.setLinkBeans(p.Cnd_ar_typ_nm);
		p.CndPanel.add(p.Cnd_ar_typ_Label);
		p.CndPanel.add(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setNextBeans(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ar_typ_META);
		p.CndPanel.add(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ_nm.setNextBeans(p.Cnd_ac_tax_cd);
		p.Cnd_ar_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ar_typ_nm_META);
		p.Cnd_ac_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_tax_cd, true);
		p.Cnd_ac_tax_cd.setLinkBeans(p.Cnd_ac_tax_nm);
		p.CndPanel.add(p.Cnd_ac_tax_cd_Label);
		p.CndPanel.add(p.Cnd_ac_tax_cd);
		p.Cnd_ac_tax_cd.setNextBeans(p.Cnd_ac_tax_nm);
		p.Cnd_ac_tax_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_tax_cd_META);
		p.CndPanel.add(p.Cnd_ac_tax_nm);
		p.Cnd_ac_tax_nm.setNextBeans(p.Cnd_ac_typ1);
		p.Cnd_ac_tax_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_tax_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_tax_nm, true);
		p.Cnd_ac_typ1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ1, true);
		p.Cnd_ac_typ1.setLinkBeans(p.Cnd_ac_typ_nm1);
		p.CndPanel.add(p.Cnd_ac_typ1_Label);
		p.CndPanel.add(p.Cnd_ac_typ1);
		p.Cnd_ac_typ1.setNextBeans(p.Cnd_ac_typ_nm1);
		p.Cnd_ac_typ1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ1_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm1);
		p.Cnd_ac_typ_nm1.setNextBeans(p.Cnd_ac_typ2);
		p.Cnd_ac_typ_nm1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm1_META);
		p.Cnd_ac_typ2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ2, true);
		p.Cnd_ac_typ2.setLinkBeans(p.Cnd_ac_typ_nm2);
		p.CndPanel.add(p.Cnd_ac_typ2_Label);
		p.CndPanel.add(p.Cnd_ac_typ2);
		p.Cnd_ac_typ2.setNextBeans(p.Cnd_ac_typ_nm2);
		p.Cnd_ac_typ2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ2_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm2);
		p.Cnd_ac_typ_nm2.setNextBeans(p.Cnd_ac_typ3);
		p.Cnd_ac_typ_nm2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm2_META);
		p.Cnd_ac_typ3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ3, true);
		p.Cnd_ac_typ3.setLinkBeans(p.Cnd_ac_typ_nm3);
		p.CndPanel.add(p.Cnd_ac_typ3_Label);
		p.CndPanel.add(p.Cnd_ac_typ3);
		p.Cnd_ac_typ3.setNextBeans(p.Cnd_ac_typ_nm3);
		p.Cnd_ac_typ3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ3_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm3);
		p.Cnd_ac_typ_nm3.setNextBeans(p.Cnd_ac_typ4);
		p.Cnd_ac_typ_nm3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm3_META);
		p.Cnd_ac_typ4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ4, true);
		p.Cnd_ac_typ4.setLinkBeans(p.Cnd_ac_typ_nm4);
		p.CndPanel.add(p.Cnd_ac_typ4_Label);
		p.CndPanel.add(p.Cnd_ac_typ4);
		p.Cnd_ac_typ4.setNextBeans(p.Cnd_ac_typ_nm4);
		p.Cnd_ac_typ4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ4_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm4);
		p.Cnd_ac_typ_nm4.setNextBeans(p.Cnd_ac_typ5);
		p.Cnd_ac_typ_nm4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm4_META);
		p.Cnd_ac_typ5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_typ5, true);
		p.Cnd_ac_typ5.setLinkBeans(p.Cnd_ac_typ_nm5);
		p.CndPanel.add(p.Cnd_ac_typ5_Label);
		p.CndPanel.add(p.Cnd_ac_typ5);
		p.Cnd_ac_typ5.setNextBeans(p.Cnd_ac_typ_nm5);
		p.Cnd_ac_typ5.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ5_META);
		p.CndPanel.add(p.Cnd_ac_typ_nm5);
		p.Cnd_ac_typ_nm5.setNextBeans(p.Cnd_memo1);
		p.Cnd_ac_typ_nm5.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.ac_typ_nm5_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.SrchBtn2Panel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1060.CndR.match_typ_META);
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MAUAP_Account p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MAUAP_Account p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MAUAP_Account p) {
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
	protected static void jbInitRslt(MAUAP_Account p) {
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
	protected static void jbInitBtn(MAUAP_Account p) {
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
		MAUAP_Account_MC.mcInitTop((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitCnd((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitSrchBtn1((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitSrchBtn2((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitCtrl((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitRslt((MAUAP_Account)this);
		MAUAP_Account_MC.mcInitBtn((MAUAP_Account)this);

		// [SRCH]ステータスのモードの設定
		MAUAP_Account_MC.statusInitSRCH_Top((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_Cnd((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_SrchBtn1((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_SrchBtn2((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_Ctrl((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_Rslt((MAUAP_Account)this);
		MAUAP_Account_MC.statusInitSRCH_Btn((MAUAP_Account)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MAUAP_Account p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MAUAP_Account p) {
		p.Cnd_ac_cd.setListListener(p);
		p.Cnd_ac_cd.addAllListener(p);
		p.Cnd_ac_nm.setListListener(p);
		p.Cnd_ac_nm.addAllListener(p);
		p.Cnd_ac_nm2.setListListener(p);
		p.Cnd_ac_nm2.addAllListener(p);
		p.Cnd_sub_flg.addAllListener(p);
		p.Cnd_dc_typ.setListListener(p);
		p.Cnd_dc_typ.addAllListener(p);
		p.Cnd_dc_typ_nm.setListListener(p);
		p.Cnd_dc_typ_nm.addAllListener(p);
		p.Cnd_ac_typ.setListListener(p);
		p.Cnd_ac_typ.addAllListener(p);
		p.Cnd_ac_typ_nm.setListListener(p);
		p.Cnd_ac_typ_nm.addAllListener(p);
		p.Cnd_ap_typ.setListListener(p);
		p.Cnd_ap_typ.addAllListener(p);
		p.Cnd_ap_typ_nm.setListListener(p);
		p.Cnd_ap_typ_nm.addAllListener(p);
		p.Cnd_ar_typ.setListListener(p);
		p.Cnd_ar_typ.addAllListener(p);
		p.Cnd_ar_typ_nm.setListListener(p);
		p.Cnd_ar_typ_nm.addAllListener(p);
		p.Cnd_ac_tax_cd.setListListener(p);
		p.Cnd_ac_tax_cd.addAllListener(p);
		p.Cnd_ac_tax_nm.setListListener(p);
		p.Cnd_ac_tax_nm.addAllListener(p);
		p.Cnd_ac_typ1.setListListener(p);
		p.Cnd_ac_typ1.addAllListener(p);
		p.Cnd_ac_typ_nm1.setListListener(p);
		p.Cnd_ac_typ_nm1.addAllListener(p);
		p.Cnd_ac_typ2.setListListener(p);
		p.Cnd_ac_typ2.addAllListener(p);
		p.Cnd_ac_typ_nm2.setListListener(p);
		p.Cnd_ac_typ_nm2.addAllListener(p);
		p.Cnd_ac_typ3.setListListener(p);
		p.Cnd_ac_typ3.addAllListener(p);
		p.Cnd_ac_typ_nm3.setListListener(p);
		p.Cnd_ac_typ_nm3.addAllListener(p);
		p.Cnd_ac_typ4.setListListener(p);
		p.Cnd_ac_typ4.addAllListener(p);
		p.Cnd_ac_typ_nm4.setListListener(p);
		p.Cnd_ac_typ_nm4.addAllListener(p);
		p.Cnd_ac_typ5.setListListener(p);
		p.Cnd_ac_typ5.addAllListener(p);
		p.Cnd_ac_typ_nm5.setListListener(p);
		p.Cnd_ac_typ_nm5.addAllListener(p);
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
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MAUAP_Account p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MAUAP_Account p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MAUAP_Account p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MAUAP_Account p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_ac_cd.addAllListener(p);
		p.columnRslt_ac_cd.setListListener(p);
		p.columnRslt_ac_nm.addAllListener(p);
		p.columnRslt_ac_nm.setListListener(p);
		p.columnRslt_ac_nm2.addAllListener(p);
		p.columnRslt_ac_nm2.setListListener(p);
		p.columnRslt_dc_typ.addAllListener(p);
		p.columnRslt_dc_typ.setListListener(p);
		p.columnRslt_dc_typ_nm.addAllListener(p);
		p.columnRslt_dc_typ_nm.setListListener(p);
		p.columnRslt_ac_typ.addAllListener(p);
		p.columnRslt_ac_typ.setListListener(p);
		p.columnRslt_ac_typ_nm.addAllListener(p);
		p.columnRslt_ac_typ_nm.setListListener(p);
		p.columnRslt_sub_flg.addAllListener(p);
		p.columnRslt_ac_tax_cd.addAllListener(p);
		p.columnRslt_ac_tax_cd.setListListener(p);
		p.columnRslt_ac_tax_nm.addAllListener(p);
		p.columnRslt_ac_tax_nm.setListListener(p);
		p.columnRslt_ac_tax_typ.addAllListener(p);
		p.columnRslt_ac_tax_typ.setListListener(p);
		p.columnRslt_sum0_flg.addAllListener(p);
		p.columnRslt_sum1_flg.addAllListener(p);
		p.columnRslt_sum2_flg.addAllListener(p);
		p.columnRslt_sum3_flg.addAllListener(p);
		p.columnRslt_sum4_flg.addAllListener(p);
		p.columnRslt_sum5_flg.addAllListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_project_flg.addAllListener(p);
		p.columnRslt_bp_flg.addAllListener(p);
		p.columnRslt_usr_flg.addAllListener(p);
		p.columnRslt_bank_ac_flg.addAllListener(p);
		p.columnRslt_ap_typ.addAllListener(p);
		p.columnRslt_ap_typ.setListListener(p);
		p.columnRslt_ap_typ_nm.addAllListener(p);
		p.columnRslt_ap_typ_nm.setListListener(p);
		p.columnRslt_ar_typ.addAllListener(p);
		p.columnRslt_ar_typ.setListListener(p);
		p.columnRslt_ar_typ_nm.addAllListener(p);
		p.columnRslt_ar_typ_nm.setListListener(p);
		p.columnRslt_ac_typ1.addAllListener(p);
		p.columnRslt_ac_typ1.setListListener(p);
		p.columnRslt_ac_typ_nm1.addAllListener(p);
		p.columnRslt_ac_typ_nm1.setListListener(p);
		p.columnRslt_ac_typ2.addAllListener(p);
		p.columnRslt_ac_typ2.setListListener(p);
		p.columnRslt_ac_typ_nm2.addAllListener(p);
		p.columnRslt_ac_typ_nm2.setListListener(p);
		p.columnRslt_ac_typ3.addAllListener(p);
		p.columnRslt_ac_typ3.setListListener(p);
		p.columnRslt_ac_typ_nm3.addAllListener(p);
		p.columnRslt_ac_typ_nm3.setListListener(p);
		p.columnRslt_ac_typ4.addAllListener(p);
		p.columnRslt_ac_typ4.setListListener(p);
		p.columnRslt_ac_typ_nm4.addAllListener(p);
		p.columnRslt_ac_typ_nm4.setListListener(p);
		p.columnRslt_ac_typ5.addAllListener(p);
		p.columnRslt_ac_typ5.setListListener(p);
		p.columnRslt_ac_typ_nm5.addAllListener(p);
		p.columnRslt_ac_typ_nm5.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUAP_Account p) {
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
	protected static void statusInitSRCH_Top(MAUAP_Account p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MAUAP_Account p){
		p.Cnd_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dc_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ap_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ar_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_typ2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_typ3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_typ4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_typ5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_typ_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn1(MAUAP_Account p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn2(MAUAP_Account p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MAUAP_Account p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MAUAP_Account p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_tax_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum0_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum1_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum2_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum3_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum4_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sum5_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_project_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_typ_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MAUAP_Account p){
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
		MAUAP_Account_MC.setTableConfigRslt((MAUAP_Account)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MAUAP_Account p) {
		p.columnRslt_check.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_ac_cd.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_cd);
		p.columnRslt_ac_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_nm);
		p.columnRslt_ac_nm2.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_nm2);
		p.columnRslt_dc_typ.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.dc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dc_typ);
		p.columnRslt_dc_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.dc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dc_typ_nm);
		p.columnRslt_ac_typ.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ);
		p.columnRslt_ac_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm);
		p.columnRslt_sub_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sub_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_flg);
		p.columnRslt_ac_tax_cd.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_tax_cd);
		p.columnRslt_ac_tax_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_tax_nm);
		p.columnRslt_ac_tax_typ.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_tax_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_tax_typ);
		p.columnRslt_sum0_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum0_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum0_flg);
		p.columnRslt_sum1_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum1_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum1_flg);
		p.columnRslt_sum2_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum2_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum2_flg);
		p.columnRslt_sum3_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum3_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum3_flg);
		p.columnRslt_sum4_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum4_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum4_flg);
		p.columnRslt_sum5_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.sum5_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum5_flg);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_project_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.project_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_project_flg);
		p.columnRslt_bp_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.bp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_flg);
		p.columnRslt_usr_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.usr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_flg);
		p.columnRslt_bank_ac_flg.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.bank_ac_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_flg);
		p.columnRslt_ap_typ.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ap_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ);
		p.columnRslt_ap_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ap_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ_nm);
		p.columnRslt_ar_typ.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ar_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ);
		p.columnRslt_ar_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ar_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ_nm);
		p.columnRslt_ac_typ1.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ1);
		p.columnRslt_ac_typ_nm1.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm1);
		p.columnRslt_ac_typ2.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ2);
		p.columnRslt_ac_typ_nm2.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm2);
		p.columnRslt_ac_typ3.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ3);
		p.columnRslt_ac_typ_nm3.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm3);
		p.columnRslt_ac_typ4.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ4);
		p.columnRslt_ac_typ_nm4.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm4);
		p.columnRslt_ac_typ5.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ5);
		p.columnRslt_ac_typ_nm5.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ac_typ_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_typ_nm5);
		p.columnRslt_memo1.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1060.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_ac_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dc_typ.getListConfig().setPutter(getCnd_dc_typ_ListPutter());
		Cnd_ac_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ.getListConfig().setPutter(getCnd_ac_typ_ListPutter());
		Cnd_ap_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_typ.getListConfig().setPutter(getCnd_ap_typ_ListPutter());
		Cnd_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_typ.getListConfig().setPutter(getCnd_ar_typ_ListPutter());
		Cnd_ac_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_tax_cd.getListConfig().setPutter(getCnd_ac_tax_cd_ListPutter());
		Cnd_ac_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ1.getListConfig().setPutter(getCnd_ac_typ1_ListPutter());
		Cnd_ac_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ2.getListConfig().setPutter(getCnd_ac_typ2_ListPutter());
		Cnd_ac_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ3.getListConfig().setPutter(getCnd_ac_typ3_ListPutter());
		Cnd_ac_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ4.getListConfig().setPutter(getCnd_ac_typ4_ListPutter());
		Cnd_ac_typ5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_typ5.getListConfig().setPutter(getCnd_ac_typ5_ListPutter());
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
	 * [Cnd_dc_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DcTyp");
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
	 * [Cnd_ap_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSubtyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSubtyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTax");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSubtyp1");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSubtyp2");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSubtyp3");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSubtyp4");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_typ5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_typ5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSubtyp5");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_dc_typ) return getCnd_dc_typ(row, info);
		if(combo == Cnd_ac_typ) return getCnd_ac_typ(row, info);
		if(combo == Cnd_ap_typ) return getCnd_ap_typ(row, info);
		if(combo == Cnd_ar_typ) return getCnd_ar_typ(row, info);
		if(combo == Cnd_ac_tax_cd) return getCnd_ac_tax_cd(row, info);
		if(combo == Cnd_ac_typ1) return getCnd_ac_typ1(row, info);
		if(combo == Cnd_ac_typ2) return getCnd_ac_typ2(row, info);
		if(combo == Cnd_ac_typ3) return getCnd_ac_typ3(row, info);
		if(combo == Cnd_ac_typ4) return getCnd_ac_typ4(row, info);
		if(combo == Cnd_ac_typ5) return getCnd_ac_typ5(row, info);
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
		if (vc == Cnd_ac_cd) return doCnd_ac_cd_VC(info);
		if (vc == Cnd_ac_nm) return doCnd_ac_nm_VC(info);
		if (vc == Cnd_ac_nm2) return doCnd_ac_nm2_VC(info);
		if (vc == Cnd_sub_flg) return doCnd_sub_flg_VC(info);
		if (vc == Cnd_dc_typ) return doCnd_dc_typ_VC(info);
		if (vc == Cnd_dc_typ_nm) return doCnd_dc_typ_nm_VC(info);
		if (vc == Cnd_ac_typ) return doCnd_ac_typ_VC(info);
		if (vc == Cnd_ac_typ_nm) return doCnd_ac_typ_nm_VC(info);
		if (vc == Cnd_ap_typ) return doCnd_ap_typ_VC(info);
		if (vc == Cnd_ap_typ_nm) return doCnd_ap_typ_nm_VC(info);
		if (vc == Cnd_ar_typ) return doCnd_ar_typ_VC(info);
		if (vc == Cnd_ar_typ_nm) return doCnd_ar_typ_nm_VC(info);
		if (vc == Cnd_ac_tax_cd) return doCnd_ac_tax_cd_VC(info);
		if (vc == Cnd_ac_tax_nm) return doCnd_ac_tax_nm_VC(info);
		if (vc == Cnd_ac_typ1) return doCnd_ac_typ1_VC(info);
		if (vc == Cnd_ac_typ_nm1) return doCnd_ac_typ_nm1_VC(info);
		if (vc == Cnd_ac_typ2) return doCnd_ac_typ2_VC(info);
		if (vc == Cnd_ac_typ_nm2) return doCnd_ac_typ_nm2_VC(info);
		if (vc == Cnd_ac_typ3) return doCnd_ac_typ3_VC(info);
		if (vc == Cnd_ac_typ_nm3) return doCnd_ac_typ_nm3_VC(info);
		if (vc == Cnd_ac_typ4) return doCnd_ac_typ4_VC(info);
		if (vc == Cnd_ac_typ_nm4) return doCnd_ac_typ_nm4_VC(info);
		if (vc == Cnd_ac_typ5) return doCnd_ac_typ5_VC(info);
		if (vc == Cnd_ac_typ_nm5) return doCnd_ac_typ_nm5_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_ac_cd) return doRslt_ac_cd_VC(info);
		if (vc == columnRslt_ac_nm) return doRslt_ac_nm_VC(info);
		if (vc == columnRslt_ac_nm2) return doRslt_ac_nm2_VC(info);
		if (vc == columnRslt_dc_typ) return doRslt_dc_typ_VC(info);
		if (vc == columnRslt_dc_typ_nm) return doRslt_dc_typ_nm_VC(info);
		if (vc == columnRslt_ac_typ) return doRslt_ac_typ_VC(info);
		if (vc == columnRslt_ac_typ_nm) return doRslt_ac_typ_nm_VC(info);
		if (vc == columnRslt_sub_flg) return doRslt_sub_flg_VC(info);
		if (vc == columnRslt_ac_tax_cd) return doRslt_ac_tax_cd_VC(info);
		if (vc == columnRslt_ac_tax_nm) return doRslt_ac_tax_nm_VC(info);
		if (vc == columnRslt_ac_tax_typ) return doRslt_ac_tax_typ_VC(info);
		if (vc == columnRslt_sum0_flg) return doRslt_sum0_flg_VC(info);
		if (vc == columnRslt_sum1_flg) return doRslt_sum1_flg_VC(info);
		if (vc == columnRslt_sum2_flg) return doRslt_sum2_flg_VC(info);
		if (vc == columnRslt_sum3_flg) return doRslt_sum3_flg_VC(info);
		if (vc == columnRslt_sum4_flg) return doRslt_sum4_flg_VC(info);
		if (vc == columnRslt_sum5_flg) return doRslt_sum5_flg_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_project_flg) return doRslt_project_flg_VC(info);
		if (vc == columnRslt_bp_flg) return doRslt_bp_flg_VC(info);
		if (vc == columnRslt_usr_flg) return doRslt_usr_flg_VC(info);
		if (vc == columnRslt_bank_ac_flg) return doRslt_bank_ac_flg_VC(info);
		if (vc == columnRslt_ap_typ) return doRslt_ap_typ_VC(info);
		if (vc == columnRslt_ap_typ_nm) return doRslt_ap_typ_nm_VC(info);
		if (vc == columnRslt_ar_typ) return doRslt_ar_typ_VC(info);
		if (vc == columnRslt_ar_typ_nm) return doRslt_ar_typ_nm_VC(info);
		if (vc == columnRslt_ac_typ1) return doRslt_ac_typ1_VC(info);
		if (vc == columnRslt_ac_typ_nm1) return doRslt_ac_typ_nm1_VC(info);
		if (vc == columnRslt_ac_typ2) return doRslt_ac_typ2_VC(info);
		if (vc == columnRslt_ac_typ_nm2) return doRslt_ac_typ_nm2_VC(info);
		if (vc == columnRslt_ac_typ3) return doRslt_ac_typ3_VC(info);
		if (vc == columnRslt_ac_typ_nm3) return doRslt_ac_typ_nm3_VC(info);
		if (vc == columnRslt_ac_typ4) return doRslt_ac_typ4_VC(info);
		if (vc == columnRslt_ac_typ_nm4) return doRslt_ac_typ_nm4_VC(info);
		if (vc == columnRslt_ac_typ5) return doRslt_ac_typ5_VC(info);
		if (vc == columnRslt_ac_typ_nm5) return doRslt_ac_typ_nm5_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
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
	 * [Cnd]パネルの[ac_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dc_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_typ_nm5_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_tax_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_tax_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum0_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum0_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum5_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum5_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[project_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_project_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_typ_nm5_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ac_cd) doCnd_ac_cd_NC(info);
		else if (nc == Cnd_ac_nm) doCnd_ac_nm_NC(info);
		else if (nc == Cnd_ac_nm2) doCnd_ac_nm2_NC(info);
		else if (nc == Cnd_sub_flg) doCnd_sub_flg_NC(info);
		else if (nc == Cnd_dc_typ) doCnd_dc_typ_NC(info);
		else if (nc == Cnd_dc_typ_nm) doCnd_dc_typ_nm_NC(info);
		else if (nc == Cnd_ac_typ) doCnd_ac_typ_NC(info);
		else if (nc == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NC(info);
		else if (nc == Cnd_ap_typ) doCnd_ap_typ_NC(info);
		else if (nc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NC(info);
		else if (nc == Cnd_ar_typ) doCnd_ar_typ_NC(info);
		else if (nc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NC(info);
		else if (nc == Cnd_ac_tax_cd) doCnd_ac_tax_cd_NC(info);
		else if (nc == Cnd_ac_tax_nm) doCnd_ac_tax_nm_NC(info);
		else if (nc == Cnd_ac_typ1) doCnd_ac_typ1_NC(info);
		else if (nc == Cnd_ac_typ_nm1) doCnd_ac_typ_nm1_NC(info);
		else if (nc == Cnd_ac_typ2) doCnd_ac_typ2_NC(info);
		else if (nc == Cnd_ac_typ_nm2) doCnd_ac_typ_nm2_NC(info);
		else if (nc == Cnd_ac_typ3) doCnd_ac_typ3_NC(info);
		else if (nc == Cnd_ac_typ_nm3) doCnd_ac_typ_nm3_NC(info);
		else if (nc == Cnd_ac_typ4) doCnd_ac_typ4_NC(info);
		else if (nc == Cnd_ac_typ_nm4) doCnd_ac_typ_nm4_NC(info);
		else if (nc == Cnd_ac_typ5) doCnd_ac_typ5_NC(info);
		else if (nc == Cnd_ac_typ_nm5) doCnd_ac_typ_nm5_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_ac_cd) doRslt_ac_cd_NC(info);
		else if (nc == columnRslt_ac_nm) doRslt_ac_nm_NC(info);
		else if (nc == columnRslt_ac_nm2) doRslt_ac_nm2_NC(info);
		else if (nc == columnRslt_dc_typ) doRslt_dc_typ_NC(info);
		else if (nc == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NC(info);
		else if (nc == columnRslt_ac_typ) doRslt_ac_typ_NC(info);
		else if (nc == columnRslt_ac_typ_nm) doRslt_ac_typ_nm_NC(info);
		else if (nc == columnRslt_sub_flg) doRslt_sub_flg_NC(info);
		else if (nc == columnRslt_ac_tax_cd) doRslt_ac_tax_cd_NC(info);
		else if (nc == columnRslt_ac_tax_nm) doRslt_ac_tax_nm_NC(info);
		else if (nc == columnRslt_ac_tax_typ) doRslt_ac_tax_typ_NC(info);
		else if (nc == columnRslt_sum0_flg) doRslt_sum0_flg_NC(info);
		else if (nc == columnRslt_sum1_flg) doRslt_sum1_flg_NC(info);
		else if (nc == columnRslt_sum2_flg) doRslt_sum2_flg_NC(info);
		else if (nc == columnRslt_sum3_flg) doRslt_sum3_flg_NC(info);
		else if (nc == columnRslt_sum4_flg) doRslt_sum4_flg_NC(info);
		else if (nc == columnRslt_sum5_flg) doRslt_sum5_flg_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_project_flg) doRslt_project_flg_NC(info);
		else if (nc == columnRslt_bp_flg) doRslt_bp_flg_NC(info);
		else if (nc == columnRslt_usr_flg) doRslt_usr_flg_NC(info);
		else if (nc == columnRslt_bank_ac_flg) doRslt_bank_ac_flg_NC(info);
		else if (nc == columnRslt_ap_typ) doRslt_ap_typ_NC(info);
		else if (nc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NC(info);
		else if (nc == columnRslt_ar_typ) doRslt_ar_typ_NC(info);
		else if (nc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NC(info);
		else if (nc == columnRslt_ac_typ1) doRslt_ac_typ1_NC(info);
		else if (nc == columnRslt_ac_typ_nm1) doRslt_ac_typ_nm1_NC(info);
		else if (nc == columnRslt_ac_typ2) doRslt_ac_typ2_NC(info);
		else if (nc == columnRslt_ac_typ_nm2) doRslt_ac_typ_nm2_NC(info);
		else if (nc == columnRslt_ac_typ3) doRslt_ac_typ3_NC(info);
		else if (nc == columnRslt_ac_typ_nm3) doRslt_ac_typ_nm3_NC(info);
		else if (nc == columnRslt_ac_typ4) doRslt_ac_typ4_NC(info);
		else if (nc == columnRslt_ac_typ_nm4) doRslt_ac_typ_nm4_NC(info);
		else if (nc == columnRslt_ac_typ5) doRslt_ac_typ5_NC(info);
		else if (nc == columnRslt_ac_typ_nm5) doRslt_ac_typ_nm5_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm5_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum0_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum0_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum5_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum5_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm5_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ac_cd) doCnd_ac_cd_NE(info);
		else if (ne == Cnd_ac_nm) doCnd_ac_nm_NE(info);
		else if (ne == Cnd_ac_nm2) doCnd_ac_nm2_NE(info);
		else if (ne == Cnd_sub_flg) doCnd_sub_flg_NE(info);
		else if (ne == Cnd_dc_typ) doCnd_dc_typ_NE(info);
		else if (ne == Cnd_dc_typ_nm) doCnd_dc_typ_nm_NE(info);
		else if (ne == Cnd_ac_typ) doCnd_ac_typ_NE(info);
		else if (ne == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NE(info);
		else if (ne == Cnd_ap_typ) doCnd_ap_typ_NE(info);
		else if (ne == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NE(info);
		else if (ne == Cnd_ar_typ) doCnd_ar_typ_NE(info);
		else if (ne == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NE(info);
		else if (ne == Cnd_ac_tax_cd) doCnd_ac_tax_cd_NE(info);
		else if (ne == Cnd_ac_tax_nm) doCnd_ac_tax_nm_NE(info);
		else if (ne == Cnd_ac_typ1) doCnd_ac_typ1_NE(info);
		else if (ne == Cnd_ac_typ_nm1) doCnd_ac_typ_nm1_NE(info);
		else if (ne == Cnd_ac_typ2) doCnd_ac_typ2_NE(info);
		else if (ne == Cnd_ac_typ_nm2) doCnd_ac_typ_nm2_NE(info);
		else if (ne == Cnd_ac_typ3) doCnd_ac_typ3_NE(info);
		else if (ne == Cnd_ac_typ_nm3) doCnd_ac_typ_nm3_NE(info);
		else if (ne == Cnd_ac_typ4) doCnd_ac_typ4_NE(info);
		else if (ne == Cnd_ac_typ_nm4) doCnd_ac_typ_nm4_NE(info);
		else if (ne == Cnd_ac_typ5) doCnd_ac_typ5_NE(info);
		else if (ne == Cnd_ac_typ_nm5) doCnd_ac_typ_nm5_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_ac_cd) doRslt_ac_cd_NE(info);
		else if (ne == columnRslt_ac_nm) doRslt_ac_nm_NE(info);
		else if (ne == columnRslt_ac_nm2) doRslt_ac_nm2_NE(info);
		else if (ne == columnRslt_dc_typ) doRslt_dc_typ_NE(info);
		else if (ne == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NE(info);
		else if (ne == columnRslt_ac_typ) doRslt_ac_typ_NE(info);
		else if (ne == columnRslt_ac_typ_nm) doRslt_ac_typ_nm_NE(info);
		else if (ne == columnRslt_sub_flg) doRslt_sub_flg_NE(info);
		else if (ne == columnRslt_ac_tax_cd) doRslt_ac_tax_cd_NE(info);
		else if (ne == columnRslt_ac_tax_nm) doRslt_ac_tax_nm_NE(info);
		else if (ne == columnRslt_ac_tax_typ) doRslt_ac_tax_typ_NE(info);
		else if (ne == columnRslt_sum0_flg) doRslt_sum0_flg_NE(info);
		else if (ne == columnRslt_sum1_flg) doRslt_sum1_flg_NE(info);
		else if (ne == columnRslt_sum2_flg) doRslt_sum2_flg_NE(info);
		else if (ne == columnRslt_sum3_flg) doRslt_sum3_flg_NE(info);
		else if (ne == columnRslt_sum4_flg) doRslt_sum4_flg_NE(info);
		else if (ne == columnRslt_sum5_flg) doRslt_sum5_flg_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_project_flg) doRslt_project_flg_NE(info);
		else if (ne == columnRslt_bp_flg) doRslt_bp_flg_NE(info);
		else if (ne == columnRslt_usr_flg) doRslt_usr_flg_NE(info);
		else if (ne == columnRslt_bank_ac_flg) doRslt_bank_ac_flg_NE(info);
		else if (ne == columnRslt_ap_typ) doRslt_ap_typ_NE(info);
		else if (ne == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NE(info);
		else if (ne == columnRslt_ar_typ) doRslt_ar_typ_NE(info);
		else if (ne == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NE(info);
		else if (ne == columnRslt_ac_typ1) doRslt_ac_typ1_NE(info);
		else if (ne == columnRslt_ac_typ_nm1) doRslt_ac_typ_nm1_NE(info);
		else if (ne == columnRslt_ac_typ2) doRslt_ac_typ2_NE(info);
		else if (ne == columnRslt_ac_typ_nm2) doRslt_ac_typ_nm2_NE(info);
		else if (ne == columnRslt_ac_typ3) doRslt_ac_typ3_NE(info);
		else if (ne == columnRslt_ac_typ_nm3) doRslt_ac_typ_nm3_NE(info);
		else if (ne == columnRslt_ac_typ4) doRslt_ac_typ4_NE(info);
		else if (ne == columnRslt_ac_typ_nm4) doRslt_ac_typ_nm4_NE(info);
		else if (ne == columnRslt_ac_typ5) doRslt_ac_typ5_NE(info);
		else if (ne == columnRslt_ac_typ_nm5) doRslt_ac_typ_nm5_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm5_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum0_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum0_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum5_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum5_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm5_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ac_cd) doCnd_ac_cd_NX(info);
		else if (nx == Cnd_ac_nm) doCnd_ac_nm_NX(info);
		else if (nx == Cnd_ac_nm2) doCnd_ac_nm2_NX(info);
		else if (nx == Cnd_sub_flg) doCnd_sub_flg_NX(info);
		else if (nx == Cnd_dc_typ) doCnd_dc_typ_NX(info);
		else if (nx == Cnd_dc_typ_nm) doCnd_dc_typ_nm_NX(info);
		else if (nx == Cnd_ac_typ) doCnd_ac_typ_NX(info);
		else if (nx == Cnd_ac_typ_nm) doCnd_ac_typ_nm_NX(info);
		else if (nx == Cnd_ap_typ) doCnd_ap_typ_NX(info);
		else if (nx == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NX(info);
		else if (nx == Cnd_ar_typ) doCnd_ar_typ_NX(info);
		else if (nx == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NX(info);
		else if (nx == Cnd_ac_tax_cd) doCnd_ac_tax_cd_NX(info);
		else if (nx == Cnd_ac_tax_nm) doCnd_ac_tax_nm_NX(info);
		else if (nx == Cnd_ac_typ1) doCnd_ac_typ1_NX(info);
		else if (nx == Cnd_ac_typ_nm1) doCnd_ac_typ_nm1_NX(info);
		else if (nx == Cnd_ac_typ2) doCnd_ac_typ2_NX(info);
		else if (nx == Cnd_ac_typ_nm2) doCnd_ac_typ_nm2_NX(info);
		else if (nx == Cnd_ac_typ3) doCnd_ac_typ3_NX(info);
		else if (nx == Cnd_ac_typ_nm3) doCnd_ac_typ_nm3_NX(info);
		else if (nx == Cnd_ac_typ4) doCnd_ac_typ4_NX(info);
		else if (nx == Cnd_ac_typ_nm4) doCnd_ac_typ_nm4_NX(info);
		else if (nx == Cnd_ac_typ5) doCnd_ac_typ5_NX(info);
		else if (nx == Cnd_ac_typ_nm5) doCnd_ac_typ_nm5_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_ac_cd) doRslt_ac_cd_NX(info);
		else if (nx == columnRslt_ac_nm) doRslt_ac_nm_NX(info);
		else if (nx == columnRslt_ac_nm2) doRslt_ac_nm2_NX(info);
		else if (nx == columnRslt_dc_typ) doRslt_dc_typ_NX(info);
		else if (nx == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_NX(info);
		else if (nx == columnRslt_ac_typ) doRslt_ac_typ_NX(info);
		else if (nx == columnRslt_ac_typ_nm) doRslt_ac_typ_nm_NX(info);
		else if (nx == columnRslt_sub_flg) doRslt_sub_flg_NX(info);
		else if (nx == columnRslt_ac_tax_cd) doRslt_ac_tax_cd_NX(info);
		else if (nx == columnRslt_ac_tax_nm) doRslt_ac_tax_nm_NX(info);
		else if (nx == columnRslt_ac_tax_typ) doRslt_ac_tax_typ_NX(info);
		else if (nx == columnRslt_sum0_flg) doRslt_sum0_flg_NX(info);
		else if (nx == columnRslt_sum1_flg) doRslt_sum1_flg_NX(info);
		else if (nx == columnRslt_sum2_flg) doRslt_sum2_flg_NX(info);
		else if (nx == columnRslt_sum3_flg) doRslt_sum3_flg_NX(info);
		else if (nx == columnRslt_sum4_flg) doRslt_sum4_flg_NX(info);
		else if (nx == columnRslt_sum5_flg) doRslt_sum5_flg_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_project_flg) doRslt_project_flg_NX(info);
		else if (nx == columnRslt_bp_flg) doRslt_bp_flg_NX(info);
		else if (nx == columnRslt_usr_flg) doRslt_usr_flg_NX(info);
		else if (nx == columnRslt_bank_ac_flg) doRslt_bank_ac_flg_NX(info);
		else if (nx == columnRslt_ap_typ) doRslt_ap_typ_NX(info);
		else if (nx == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NX(info);
		else if (nx == columnRslt_ar_typ) doRslt_ar_typ_NX(info);
		else if (nx == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NX(info);
		else if (nx == columnRslt_ac_typ1) doRslt_ac_typ1_NX(info);
		else if (nx == columnRslt_ac_typ_nm1) doRslt_ac_typ_nm1_NX(info);
		else if (nx == columnRslt_ac_typ2) doRslt_ac_typ2_NX(info);
		else if (nx == columnRslt_ac_typ_nm2) doRslt_ac_typ_nm2_NX(info);
		else if (nx == columnRslt_ac_typ3) doRslt_ac_typ3_NX(info);
		else if (nx == columnRslt_ac_typ_nm3) doRslt_ac_typ_nm3_NX(info);
		else if (nx == columnRslt_ac_typ4) doRslt_ac_typ4_NX(info);
		else if (nx == columnRslt_ac_typ_nm4) doRslt_ac_typ_nm4_NX(info);
		else if (nx == columnRslt_ac_typ5) doRslt_ac_typ5_NX(info);
		else if (nx == columnRslt_ac_typ_nm5) doRslt_ac_typ_nm5_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm5_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum0_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum0_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum5_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum5_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[project_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_project_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm5_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_cd) doCnd_ac_cd_LC(info);
		else if (lc == Cnd_ac_nm) doCnd_ac_nm_LC(info);
		else if (lc == Cnd_ac_nm2) doCnd_ac_nm2_LC(info);
		else if (lc == Cnd_dc_typ) doCnd_dc_typ_LC(info);
		else if (lc == Cnd_dc_typ_nm) doCnd_dc_typ_nm_LC(info);
		else if (lc == Cnd_ac_typ) doCnd_ac_typ_LC(info);
		else if (lc == Cnd_ac_typ_nm) doCnd_ac_typ_nm_LC(info);
		else if (lc == Cnd_ap_typ) doCnd_ap_typ_LC(info);
		else if (lc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_LC(info);
		else if (lc == Cnd_ar_typ) doCnd_ar_typ_LC(info);
		else if (lc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_LC(info);
		else if (lc == Cnd_ac_tax_cd) doCnd_ac_tax_cd_LC(info);
		else if (lc == Cnd_ac_tax_nm) doCnd_ac_tax_nm_LC(info);
		else if (lc == Cnd_ac_typ1) doCnd_ac_typ1_LC(info);
		else if (lc == Cnd_ac_typ_nm1) doCnd_ac_typ_nm1_LC(info);
		else if (lc == Cnd_ac_typ2) doCnd_ac_typ2_LC(info);
		else if (lc == Cnd_ac_typ_nm2) doCnd_ac_typ_nm2_LC(info);
		else if (lc == Cnd_ac_typ3) doCnd_ac_typ3_LC(info);
		else if (lc == Cnd_ac_typ_nm3) doCnd_ac_typ_nm3_LC(info);
		else if (lc == Cnd_ac_typ4) doCnd_ac_typ4_LC(info);
		else if (lc == Cnd_ac_typ_nm4) doCnd_ac_typ_nm4_LC(info);
		else if (lc == Cnd_ac_typ5) doCnd_ac_typ5_LC(info);
		else if (lc == Cnd_ac_typ_nm5) doCnd_ac_typ_nm5_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnRslt_ac_cd) doRslt_ac_cd_LC(info);
		else if (lc == columnRslt_ac_nm) doRslt_ac_nm_LC(info);
		else if (lc == columnRslt_ac_nm2) doRslt_ac_nm2_LC(info);
		else if (lc == columnRslt_dc_typ) doRslt_dc_typ_LC(info);
		else if (lc == columnRslt_dc_typ_nm) doRslt_dc_typ_nm_LC(info);
		else if (lc == columnRslt_ac_typ) doRslt_ac_typ_LC(info);
		else if (lc == columnRslt_ac_typ_nm) doRslt_ac_typ_nm_LC(info);
		else if (lc == columnRslt_ac_tax_cd) doRslt_ac_tax_cd_LC(info);
		else if (lc == columnRslt_ac_tax_nm) doRslt_ac_tax_nm_LC(info);
		else if (lc == columnRslt_ac_tax_typ) doRslt_ac_tax_typ_LC(info);
		else if (lc == columnRslt_ap_typ) doRslt_ap_typ_LC(info);
		else if (lc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_LC(info);
		else if (lc == columnRslt_ar_typ) doRslt_ar_typ_LC(info);
		else if (lc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_LC(info);
		else if (lc == columnRslt_ac_typ1) doRslt_ac_typ1_LC(info);
		else if (lc == columnRslt_ac_typ_nm1) doRslt_ac_typ_nm1_LC(info);
		else if (lc == columnRslt_ac_typ2) doRslt_ac_typ2_LC(info);
		else if (lc == columnRslt_ac_typ_nm2) doRslt_ac_typ_nm2_LC(info);
		else if (lc == columnRslt_ac_typ3) doRslt_ac_typ3_LC(info);
		else if (lc == columnRslt_ac_typ_nm3) doRslt_ac_typ_nm3_LC(info);
		else if (lc == columnRslt_ac_typ4) doRslt_ac_typ4_LC(info);
		else if (lc == columnRslt_ac_typ_nm4) doRslt_ac_typ_nm4_LC(info);
		else if (lc == columnRslt_ac_typ5) doRslt_ac_typ5_LC(info);
		else if (lc == columnRslt_ac_typ_nm5) doRslt_ac_typ_nm5_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
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
	 * [Cnd]パネルの[ac_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dc_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_typ_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_typ_nm5_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_tax_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_tax_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_typ_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_typ_nm5_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_dc_typ]の作成メソッド
	 */
	public MCList getCnd_dc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ]の作成メソッド
	 */
	public MCList getCnd_ac_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_typ]の作成メソッド
	 */
	public MCList getCnd_ap_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSubtyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_typ]の作成メソッド
	 */
	public MCList getCnd_ar_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSubtyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_tax_cd]の作成メソッド
	 */
	public MCList getCnd_ac_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ1]の作成メソッド
	 */
	public MCList getCnd_ac_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSubtyp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ2]の作成メソッド
	 */
	public MCList getCnd_ac_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSubtyp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ3]の作成メソッド
	 */
	public MCList getCnd_ac_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSubtyp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ4]の作成メソッド
	 */
	public MCList getCnd_ac_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSubtyp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_typ5]の作成メソッド
	 */
	public MCList getCnd_ac_typ5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSubtyp5(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}