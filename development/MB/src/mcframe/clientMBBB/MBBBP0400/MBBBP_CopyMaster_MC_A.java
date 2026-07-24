package mcframe.clientMBBB.MBBBP0400;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMBBB.MBBBP0400.MBBBP_CopyMaster_MC.MB_MBBBL0400_Upd01Caller;

/**
 * 画面"MBBBP_CopyMaster"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_CopyMaster_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBBP0400";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * ADD_ONLY,Add only;ADD_UPD,Add/Update;REMAKE,Re-create after deletion ADD_ONLY,追加のみ;ADD_UPD,追加・更新;REMAKE,削除後再作成.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_ADD_ONLY = null;
	public MCRadioButton Cnd_ope_ADD_UPD = null;
	public MCRadioButton Cnd_ope_REMAKE = null;
	/**
	 * Import account master 勘定科目マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_account_flg = null;
	/**
	 * Account master entry 勘定科目マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP1020 = null;
	/**
	 * Import subsidiary account master 補助勘定科目マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_sub_account_flg = null;
	/**
	 * Subsidiary account master entry 補助勘定科目マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP1030 = null;
	/**
	 * Import accounting dept. master 会計部門マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_dpt_flg = null;
	/**
	 * Accounting dept. master entry 会計部門マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP1000 = null;
	/**
	 * Import bank account type setting master 口座科目設定マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_bac_ac_flg = null;
	/**
	 * Bank account type setting master entry 口座科目設定マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP1130 = null;
	/**
	 * Import bank master 銀行マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_bank_flg = null;
	/**
	 * Bank master entry 銀行マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP0030_bank = null;
	/**
	 * Import bank branch master 銀行支店マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_bank_branch_flg = null;
	/**
	 * Bank branch master entry 銀行支店マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP0030_bank_branch = null;
	/**
	 * Import bank account master 口座マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_bank_ac_flg = null;
	/**
	 * Bank account master entry 口座マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP0030_bank_ac = null;
	/**
	 * Import exchange rate master 為替レートマスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_cur_xrate_flg = null;
	/**
	 * Exchange rate master entry 為替レートマスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP0050 = null;
	/**
	 * Import accounting tax master 会計税マスタ取込.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_tax_flg = null;
	/**
	 * Accounting tax master entry 会計税マスタ登録.<p>
	 *
	 */
	public MCButton Cnd_open_MABCP1180 = null;
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
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD};
	
	/** [MB_MBBBL0400_Upd01]のCallerの作成 */
	protected MBBBP_CopyMaster_MC.MB_MBBBL0400_Upd01Caller createMB_MBBBL0400_Upd01() {
		MBBBP_CopyMaster_MC.MB_MBBBL0400_Upd01Caller<MBBBP_CopyMaster, MB_MBBBL0400_Upd01Bridge>
		caller = ((MBBBP_CopyMaster_MC)this).new MB_MBBBL0400_Upd01Caller<MBBBP_CopyMaster, MB_MBBBL0400_Upd01Bridge>(
					(MBBBP_CopyMaster)this, new MB_MBBBL0400_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBBL0400_Upd01]の呼び出し */
	protected void callMB_MBBBL0400_Upd01() {
		MCCaller caller = createMB_MBBBL0400_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0400.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0400.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0400.CndR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
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
		ret.add(CndPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_CopyMaster_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBBP_CopyMaster_MC.jbCreateScreenOpe((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbCreateCnd((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbCreateBtn((MBBBP_CopyMaster)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBBP_CopyMaster p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_CopyMaster p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBBP_CopyMaster p) {
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


	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_CopyMaster create(){
		MBBBP_CopyMaster p = new MBBBP_CopyMaster();
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
		MBBBP_CopyMaster_MC.jbfInitScreenOpe((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbfInitCnd((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbfInitBtn((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbInitScreenOpe((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbInitCnd((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.jbInitBtn((MBBBP_CopyMaster)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBBP_CopyMaster p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_CopyMaster p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_ADD_ONLY = p.beansFactory.createRadioButton("Cnd.ope_ADD_ONLY");
		p.Cnd_ope_ADD_UPD = p.beansFactory.createRadioButton("Cnd.ope_ADD_UPD");
		p.Cnd_ope_REMAKE = p.beansFactory.createRadioButton("Cnd.ope_REMAKE");
		p.Cnd_account_flg = p.beansFactory.createCheckBox("Cnd.account_flg");
		p.Cnd_open_MABCP1020 = p.beansFactory.createButton("Cnd.open_MABCP1020", "open");
		p.Cnd_sub_account_flg = p.beansFactory.createCheckBox("Cnd.sub_account_flg");
		p.Cnd_open_MABCP1030 = p.beansFactory.createButton("Cnd.open_MABCP1030", "open");
		p.Cnd_ac_dpt_flg = p.beansFactory.createCheckBox("Cnd.ac_dpt_flg");
		p.Cnd_open_MABCP1000 = p.beansFactory.createButton("Cnd.open_MABCP1000", "open");
		p.Cnd_bac_ac_flg = p.beansFactory.createCheckBox("Cnd.bac_ac_flg");
		p.Cnd_open_MABCP1130 = p.beansFactory.createButton("Cnd.open_MABCP1130", "open");
		p.Cnd_bank_flg = p.beansFactory.createCheckBox("Cnd.bank_flg");
		p.Cnd_open_MABCP0030_bank = p.beansFactory.createButton("Cnd.open_MABCP0030_bank", "open");
		p.Cnd_bank_branch_flg = p.beansFactory.createCheckBox("Cnd.bank_branch_flg");
		p.Cnd_open_MABCP0030_bank_branch = p.beansFactory.createButton("Cnd.open_MABCP0030_bank_branch", "open");
		p.Cnd_bank_ac_flg = p.beansFactory.createCheckBox("Cnd.bank_ac_flg");
		p.Cnd_open_MABCP0030_bank_ac = p.beansFactory.createButton("Cnd.open_MABCP0030_bank_ac", "open");
		p.Cnd_cur_xrate_flg = p.beansFactory.createCheckBox("Cnd.cur_xrate_flg");
		p.Cnd_open_MABCP0050 = p.beansFactory.createButton("Cnd.open_MABCP0050", "open");
		p.Cnd_ac_tax_flg = p.beansFactory.createCheckBox("Cnd.ac_tax_flg");
		p.Cnd_open_MABCP1180 = p.beansFactory.createButton("Cnd.open_MABCP1180", "open");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBBP_CopyMaster p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBBP_CopyMaster p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_CopyMaster p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BtnPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_ADD_ONLY);
		p.Cnd_ope_ADD_ONLY.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_ADD_ONLY);
		p.ScreenOpePanel.add(p.Cnd_ope_ADD_ONLY);
		p.Cnd_ope_ADD_ONLY.setNextBeans(p.Cnd_ope_ADD_UPD);
		p.Cnd_ope_ADD_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_ADD_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_ADD_UPD);
		p.Cnd_ope_ADD_UPD.setNextBeans(p.Cnd_ope_REMAKE);
		p.Cnd_ope_REMAKE.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REMAKE);
		p.ScreenOpePanel.add(p.Cnd_ope_REMAKE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.ope_META);
		p.CndPanel.add(p.Cnd_account_flg);
		p.CndPanel.setLastBeans(p.Cnd_account_flg);
		p.Cnd_account_flg.setNextBeans(p.Cnd_open_MABCP1020);
		p.Cnd_account_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.account_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP1020);
		p.Cnd_open_MABCP1020.setNextBeans(p.Cnd_sub_account_flg);
		p.CndPanel.add(p.Cnd_sub_account_flg);
		p.Cnd_sub_account_flg.setNextBeans(p.Cnd_open_MABCP1030);
		p.Cnd_sub_account_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.sub_account_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP1030);
		p.Cnd_open_MABCP1030.setNextBeans(p.Cnd_ac_dpt_flg);
		p.CndPanel.add(p.Cnd_ac_dpt_flg);
		p.Cnd_ac_dpt_flg.setNextBeans(p.Cnd_open_MABCP1000);
		p.Cnd_ac_dpt_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.ac_dpt_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP1000);
		p.Cnd_open_MABCP1000.setNextBeans(p.Cnd_bac_ac_flg);
		p.CndPanel.add(p.Cnd_bac_ac_flg);
		p.Cnd_bac_ac_flg.setNextBeans(p.Cnd_open_MABCP1130);
		p.Cnd_bac_ac_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.bac_ac_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP1130);
		p.Cnd_open_MABCP1130.setNextBeans(p.Cnd_bank_flg);
		p.CndPanel.add(p.Cnd_bank_flg);
		p.Cnd_bank_flg.setNextBeans(p.Cnd_open_MABCP0030_bank);
		p.Cnd_bank_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.bank_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP0030_bank);
		p.Cnd_open_MABCP0030_bank.setNextBeans(p.Cnd_bank_branch_flg);
		p.CndPanel.add(p.Cnd_bank_branch_flg);
		p.Cnd_bank_branch_flg.setNextBeans(p.Cnd_open_MABCP0030_bank_branch);
		p.Cnd_bank_branch_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.bank_branch_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP0030_bank_branch);
		p.Cnd_open_MABCP0030_bank_branch.setNextBeans(p.Cnd_bank_ac_flg);
		p.CndPanel.add(p.Cnd_bank_ac_flg);
		p.Cnd_bank_ac_flg.setNextBeans(p.Cnd_open_MABCP0030_bank_ac);
		p.Cnd_bank_ac_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.bank_ac_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP0030_bank_ac);
		p.Cnd_open_MABCP0030_bank_ac.setNextBeans(p.Cnd_cur_xrate_flg);
		p.CndPanel.add(p.Cnd_cur_xrate_flg);
		p.Cnd_cur_xrate_flg.setNextBeans(p.Cnd_open_MABCP0050);
		p.Cnd_cur_xrate_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.cur_xrate_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP0050);
		p.Cnd_open_MABCP0050.setNextBeans(p.Cnd_ac_tax_flg);
		p.CndPanel.add(p.Cnd_ac_tax_flg);
		p.Cnd_ac_tax_flg.setNextBeans(p.Cnd_open_MABCP1180);
		p.Cnd_ac_tax_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0400.CndR.ac_tax_flg_META);
		p.CndPanel.add(p.Cnd_open_MABCP1180);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBBP_CopyMaster p) {
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
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MBBBP_CopyMaster_MC.mcInitScreenOpe((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.mcInitCnd((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.mcInitBtn((MBBBP_CopyMaster)this);

		// [UPD]ステータスのモードの設定
		MBBBP_CopyMaster_MC.statusInitUPD_ScreenOpe((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.statusInitUPD_Cnd((MBBBP_CopyMaster)this);
		MBBBP_CopyMaster_MC.statusInitUPD_Btn((MBBBP_CopyMaster)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBBP_CopyMaster p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_CopyMaster p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_ADD_ONLY.addAllListener(p);
		p.Cnd_ope_ADD_UPD.addAllListener(p);
		p.Cnd_ope_REMAKE.addAllListener(p);
		p.Cnd_account_flg.addAllListener(p);
		p.Cnd_open_MABCP1020.addAllListener(p);
		p.Cnd_open_MABCP1020.setAPMethodName("doCnd_open_MABCP1020");
		p.Cnd_sub_account_flg.addAllListener(p);
		p.Cnd_open_MABCP1030.addAllListener(p);
		p.Cnd_open_MABCP1030.setAPMethodName("doCnd_open_MABCP1030");
		p.Cnd_ac_dpt_flg.addAllListener(p);
		p.Cnd_open_MABCP1000.addAllListener(p);
		p.Cnd_open_MABCP1000.setAPMethodName("doCnd_open_MABCP1000");
		p.Cnd_bac_ac_flg.addAllListener(p);
		p.Cnd_open_MABCP1130.addAllListener(p);
		p.Cnd_open_MABCP1130.setAPMethodName("doCnd_open_MABCP1130");
		p.Cnd_bank_flg.addAllListener(p);
		p.Cnd_open_MABCP0030_bank.addAllListener(p);
		p.Cnd_open_MABCP0030_bank.setAPMethodName("doCnd_open_MABCP0030_bank");
		p.Cnd_bank_branch_flg.addAllListener(p);
		p.Cnd_open_MABCP0030_bank_branch.addAllListener(p);
		p.Cnd_open_MABCP0030_bank_branch.setAPMethodName("doCnd_open_MABCP0030_bank_branch");
		p.Cnd_bank_ac_flg.addAllListener(p);
		p.Cnd_open_MABCP0030_bank_ac.addAllListener(p);
		p.Cnd_open_MABCP0030_bank_ac.setAPMethodName("doCnd_open_MABCP0030_bank_ac");
		p.Cnd_cur_xrate_flg.addAllListener(p);
		p.Cnd_open_MABCP0050.addAllListener(p);
		p.Cnd_open_MABCP0050.setAPMethodName("doCnd_open_MABCP0050");
		p.Cnd_ac_tax_flg.addAllListener(p);
		p.Cnd_open_MABCP1180.addAllListener(p);
		p.Cnd_open_MABCP1180.setAPMethodName("doCnd_open_MABCP1180");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBBP_CopyMaster p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MBBBP_CopyMaster p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MBBBP_CopyMaster p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_account_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP1020.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_account_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP1030.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP1000.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bac_ac_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP1130.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bank_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP0030_bank.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bank_branch_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP0030_bank_branch.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bank_ac_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP0030_bank_ac.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cur_xrate_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP0050.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_tax_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_open_MABCP1180.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MBBBP_CopyMaster p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

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
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_open_MABCP1020) doCnd_open_MABCP1020(info);
		else if (ap == Cnd_open_MABCP1030) doCnd_open_MABCP1030(info);
		else if (ap == Cnd_open_MABCP1000) doCnd_open_MABCP1000(info);
		else if (ap == Cnd_open_MABCP1130) doCnd_open_MABCP1130(info);
		else if (ap == Cnd_open_MABCP0030_bank) doCnd_open_MABCP0030_bank(info);
		else if (ap == Cnd_open_MABCP0030_bank_branch) doCnd_open_MABCP0030_bank_branch(info);
		else if (ap == Cnd_open_MABCP0030_bank_ac) doCnd_open_MABCP0030_bank_ac(info);
		else if (ap == Cnd_open_MABCP0050) doCnd_open_MABCP0050(info);
		else if (ap == Cnd_open_MABCP1180) doCnd_open_MABCP1180(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[open_MABCP1020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP1020(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP1030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP1030(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP1000]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP1000(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP1130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP1130(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP0030_bank]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP0030_bank(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP0030_bank_branch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP0030_bank_branch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP0030_bank_ac]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP0030_bank_ac(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP0050(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MABCP1180]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MABCP1180(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_account_flg) return doCnd_account_flg_VC(info);
		if (vc == Cnd_sub_account_flg) return doCnd_sub_account_flg_VC(info);
		if (vc == Cnd_ac_dpt_flg) return doCnd_ac_dpt_flg_VC(info);
		if (vc == Cnd_bac_ac_flg) return doCnd_bac_ac_flg_VC(info);
		if (vc == Cnd_bank_flg) return doCnd_bank_flg_VC(info);
		if (vc == Cnd_bank_branch_flg) return doCnd_bank_branch_flg_VC(info);
		if (vc == Cnd_bank_ac_flg) return doCnd_bank_ac_flg_VC(info);
		if (vc == Cnd_cur_xrate_flg) return doCnd_cur_xrate_flg_VC(info);
		if (vc == Cnd_ac_tax_flg) return doCnd_ac_tax_flg_VC(info);
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
	 * [Cnd]パネルの[account_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_account_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_account_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_account_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bac_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bac_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_branch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_branch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_xrate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_xrate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_tax_flg_VC(MCEventInfo info){
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
		if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_account_flg) doCnd_account_flg_NC(info);
		else if (nc == Cnd_sub_account_flg) doCnd_sub_account_flg_NC(info);
		else if (nc == Cnd_ac_dpt_flg) doCnd_ac_dpt_flg_NC(info);
		else if (nc == Cnd_bac_ac_flg) doCnd_bac_ac_flg_NC(info);
		else if (nc == Cnd_bank_flg) doCnd_bank_flg_NC(info);
		else if (nc == Cnd_bank_branch_flg) doCnd_bank_branch_flg_NC(info);
		else if (nc == Cnd_bank_ac_flg) doCnd_bank_ac_flg_NC(info);
		else if (nc == Cnd_cur_xrate_flg) doCnd_cur_xrate_flg_NC(info);
		else if (nc == Cnd_ac_tax_flg) doCnd_ac_tax_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[account_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_account_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_account_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_account_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bac_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bac_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_branch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_branch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_xrate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_xrate_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_account_flg) doCnd_account_flg_NE(info);
		else if (ne == Cnd_sub_account_flg) doCnd_sub_account_flg_NE(info);
		else if (ne == Cnd_ac_dpt_flg) doCnd_ac_dpt_flg_NE(info);
		else if (ne == Cnd_bac_ac_flg) doCnd_bac_ac_flg_NE(info);
		else if (ne == Cnd_bank_flg) doCnd_bank_flg_NE(info);
		else if (ne == Cnd_bank_branch_flg) doCnd_bank_branch_flg_NE(info);
		else if (ne == Cnd_bank_ac_flg) doCnd_bank_ac_flg_NE(info);
		else if (ne == Cnd_cur_xrate_flg) doCnd_cur_xrate_flg_NE(info);
		else if (ne == Cnd_ac_tax_flg) doCnd_ac_tax_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[account_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_account_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_account_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_account_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bac_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bac_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_branch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_branch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_xrate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_xrate_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_account_flg) doCnd_account_flg_NX(info);
		else if (nx == Cnd_sub_account_flg) doCnd_sub_account_flg_NX(info);
		else if (nx == Cnd_ac_dpt_flg) doCnd_ac_dpt_flg_NX(info);
		else if (nx == Cnd_bac_ac_flg) doCnd_bac_ac_flg_NX(info);
		else if (nx == Cnd_bank_flg) doCnd_bank_flg_NX(info);
		else if (nx == Cnd_bank_branch_flg) doCnd_bank_branch_flg_NX(info);
		else if (nx == Cnd_bank_ac_flg) doCnd_bank_ac_flg_NX(info);
		else if (nx == Cnd_cur_xrate_flg) doCnd_cur_xrate_flg_NX(info);
		else if (nx == Cnd_ac_tax_flg) doCnd_ac_tax_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[account_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_account_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_account_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_account_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bac_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bac_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_branch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_branch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_xrate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_xrate_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0400.Upd01")) {
			return new MB_MBBBL0400_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0400_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0400_Upd01;

		/** コンストラクタ */
		protected MB_MBBBL0400_Upd01Bridge() {
			p_MB_MBBBL0400_Upd01 = new MCParam(PDef.MB_MBBBL0400_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0400_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0400.CndR.create());
			// Down

			p_MB_MBBBL0400_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0400_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0400_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0400_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0400_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0400.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0400.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBBL0400_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}