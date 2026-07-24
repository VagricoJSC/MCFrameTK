package mcframe.clientMGBB.MGBBP0240;

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
import mcframe.clientMGBB.MGBBP0240.MGBBP_StInfoCopyReg_MC.MG_MGBBL0240_Ins01Caller;

/**
 * 画面"MGBBP_StInfoCopyReg"パネルクラスです。<p>
 *
 * 月初情報に関して計算グループ・年月単位のデータをコピーする。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_StInfoCopyReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_calc_grp_cd_fr_Label = null;
	/**
	 * Calculation group cd. (Copy from) コピー元計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd_fr = null;
	/**
	 * Calculation group name (Copy from) コピー元計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm_fr = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_calc_grp_cd_to_Label = null;
	/**
	 * Calculation group cd. (Copy to) コピー先計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd_to = null;
	/**
	 * Calculation group name (Copy to) コピー先計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm_to = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_flg = null;
	/**
	 * WIP 仕掛.<p>
	 *
	 */
	public MCCheckBox Cnd_wip_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_no_flg = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_no_flg = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_flg = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_flg = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_flg = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_flg = null;
	/**
	 * BP 取引先.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_flg = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_flg = null;
	/**
	 * Process after deletion 削除後に処理する.<p>
	 *
	 */
	public MCCheckBox Cnd_del_flg = null;
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [Stk]ブロック関連のField定義
	public MCPanel StkPanel = null;
	public MCTitledBorder StkTitledBorder = null;
	// [Stk]ブロックの項目のField定義
	// [ExecTyp]ブロック関連のField定義
	public MCPanel ExecTypPanel = null;
	public MCTitledBorder ExecTypTitledBorder = null;
	// [ExecTyp]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Beginning inventory entry 月初在庫登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0210 = null;
	/**
	 * Beginning WIP entry 月初仕掛登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0220 = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD};
	
	/** [MG_MGBBL0240_Ins01]のCallerの作成 */
	protected MGBBP_StInfoCopyReg_MC.MG_MGBBL0240_Ins01Caller createMG_MGBBL0240_Ins01() {
		MGBBP_StInfoCopyReg_MC.MG_MGBBL0240_Ins01Caller<MGBBP_StInfoCopyReg, MG_MGBBL0240_Ins01Bridge>
		caller = ((MGBBP_StInfoCopyReg_MC)this).new MG_MGBBL0240_Ins01Caller<MGBBP_StInfoCopyReg, MG_MGBBL0240_Ins01Bridge>(
					(MGBBP_StInfoCopyReg)this, new MG_MGBBL0240_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBBL0240_Ins01]の呼び出し */
	protected void callMG_MGBBL0240_Ins01() {
		MCCaller caller = createMG_MGBBL0240_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0240.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0240.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0240.CndR.create();
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
		ret.add(CndPanel);
		ret.add(TgtPanel);
		ret.add(StkPanel);
		ret.add(ExecTypPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_StInfoCopyReg_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_StInfoCopyReg_MC.jbCreateCnd((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbCreateTgt((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbCreateStk((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbCreateExecTyp((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbCreateBtn((MGBBP_StInfoCopyReg)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_StInfoCopyReg p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBBP_StInfoCopyReg p) {
	}

	/**
	 * [Stk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStk(MGBBP_StInfoCopyReg p) {
	}

	/**
	 * [ExecTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExecTyp(MGBBP_StInfoCopyReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_StInfoCopyReg p) {
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

	
	/** [Cnd_calc_grp_cd_fr_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_fr_p = null;

	/**
	 * [Cnd_calc_grp_cd_fr_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_fr_ListPutter() {
		if (Cnd_calc_grp_cd_fr_p == null) {
			Cnd_calc_grp_cd_fr_p = createCnd_calc_grp_cd_fr_ListPutter(Cnd_calc_grp_cd_fr, "calc_grp_cd_fr", "calc_grp_nm_fr");

		}
		return Cnd_calc_grp_cd_fr_p;
	}
	
	
	/** [Cnd_calc_grp_cd_to_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_to_p = null;

	/**
	 * [Cnd_calc_grp_cd_to_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_to_ListPutter() {
		if (Cnd_calc_grp_cd_to_p == null) {
			Cnd_calc_grp_cd_to_p = createCnd_calc_grp_cd_to_ListPutter(Cnd_calc_grp_cd_to, "calc_grp_cd_to", "calc_grp_nm_to");

		}
		return Cnd_calc_grp_cd_to_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_StInfoCopyReg create(){
		MGBBP_StInfoCopyReg p = new MGBBP_StInfoCopyReg();
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
		MGBBP_StInfoCopyReg_MC.jbfInitCnd((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbfInitTgt((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbfInitStk((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbfInitExecTyp((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbfInitBtn((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbInitCnd((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbInitTgt((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbInitStk((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbInitExecTyp((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.jbInitBtn((MGBBP_StInfoCopyReg)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_fr_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_fr_Label");
		p.Cnd_calc_grp_cd_fr = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd_fr");
		p.Cnd_calc_grp_cd_fr.setLabel(p.Cnd_calc_grp_cd_fr_Label);
		p.Cnd_calc_grp_nm_fr = p.beansFactory.createTextField("Cnd.calc_grp_nm_fr");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_calc_grp_cd_to_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_to_Label");
		p.Cnd_calc_grp_cd_to = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd_to");
		p.Cnd_calc_grp_cd_to.setLabel(p.Cnd_calc_grp_cd_to_Label);
		p.Cnd_calc_grp_nm_to = p.beansFactory.createTextField("Cnd.calc_grp_nm_to");
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_stk_flg = p.beansFactory.createCheckBox("Cnd.stk_flg");
		p.Cnd_wip_flg = p.beansFactory.createCheckBox("Cnd.wip_flg");
		p.Cnd_lot_no_flg = p.beansFactory.createCheckBox("Cnd.lot_no_flg");
		p.Cnd_sublot_no_flg = p.beansFactory.createCheckBox("Cnd.sublot_no_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_bp_flg = p.beansFactory.createCheckBox("Cnd.bp_flg");
		p.Cnd_asst_flg = p.beansFactory.createCheckBox("Cnd.asst_flg");
		p.Cnd_del_flg = p.beansFactory.createCheckBox("Cnd.del_flg");
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Stk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStk(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.StkPanel = p.beansFactory.createPanel("Stk");
		p.StkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ExecTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExecTyp(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.ExecTypPanel = p.beansFactory.createPanel("ExecTyp");
		p.ExecTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_open_MGBBP0210 = p.beansFactory.createButton("Btn.open_MGBBP0210", "open");
		p.Btn_open_MGBBP0220 = p.beansFactory.createButton("Btn.open_MGBBP0220", "open");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.TgtPanel);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_fr.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd_fr.setLinkBeans(p.Cnd_calc_grp_nm_fr);
		p.CndPanel.add(p.Cnd_calc_grp_cd_fr_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd_fr);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd_fr);
		p.Cnd_calc_grp_cd_fr.setNextBeans(p.Cnd_calc_grp_nm_fr);
		p.Cnd_calc_grp_cd_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.calc_grp_cd_fr_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm_fr);
		p.Cnd_calc_grp_nm_fr.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.calc_grp_nm_fr_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_calc_grp_cd_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_grp_cd_to.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd_to.setLinkBeans(p.Cnd_calc_grp_nm_to);
		p.CndPanel.add(p.Cnd_calc_grp_cd_to_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd_to);
		p.Cnd_calc_grp_cd_to.setNextBeans(p.Cnd_calc_grp_nm_to);
		p.Cnd_calc_grp_cd_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.calc_grp_cd_to_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm_to);
		p.Cnd_calc_grp_nm_to.setNextBeans(p.Cnd_ym_to);
		p.Cnd_calc_grp_nm_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.calc_grp_nm_to_META);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.TgtPanel.add(p.Cnd_stk_flg);
		p.TgtPanel.setLastBeans(p.Cnd_stk_flg);
		p.Cnd_stk_flg.setNextBeans(p.Cnd_wip_flg);
		p.Cnd_stk_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.stk_flg_META);
		p.TgtPanel.add(p.Cnd_wip_flg);
		p.Cnd_wip_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.wip_flg_META);
		p.StkPanel.add(p.Cnd_lot_no_flg);
		p.StkPanel.setLastBeans(p.Cnd_lot_no_flg);
		p.Cnd_lot_no_flg.setNextBeans(p.Cnd_sublot_no_flg);
		p.Cnd_lot_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.lot_no_flg_META);
		p.StkPanel.add(p.Cnd_sublot_no_flg);
		p.Cnd_sublot_no_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.sublot_no_flg_META);
		p.StkPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.sno1_flg_META);
		p.StkPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.sno2_flg_META);
		p.StkPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.sno3_flg_META);
		p.StkPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.sno4_flg_META);
		p.StkPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_asst_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.bp_flg_META);
		p.StkPanel.add(p.Cnd_asst_flg);
		p.Cnd_asst_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.asst_flg_META);
		p.ExecTypPanel.add(p.Cnd_del_flg);
		p.ExecTypPanel.setLastBeans(p.Cnd_del_flg);
		p.Cnd_del_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0240.CndR.del_flg_META);
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.StkPanel);
		p.TgtPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Stk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStk(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.StkPanel.setBorder(p.StkTitledBorder);
		p.add(p.StkPanel);
		p.StkPanel.setNextBeans(p.ExecTypPanel);
		p.StkPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ExecTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExecTyp(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.ExecTypPanel.setBorder(p.ExecTypTitledBorder);
		p.add(p.ExecTypPanel);
		p.ExecTypPanel.setNextBeans(p.BtnPanel);
		p.ExecTypPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBBP_StInfoCopyReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.BtnPanel.setLastBeans(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_open_MGBBP0210);
		p.Btn_open_MGBBP0210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBBP0210);
		p.Btn_open_MGBBP0210.setNextBeans(p.Btn_open_MGBBP0220);
		p.Btn_open_MGBBP0220.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBBP0220);
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
		MGBBP_StInfoCopyReg_MC.mcInitCnd((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.mcInitTgt((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.mcInitStk((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.mcInitExecTyp((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.mcInitBtn((MGBBP_StInfoCopyReg)this);

		// [UPD]ステータスのモードの設定
		MGBBP_StInfoCopyReg_MC.statusInitUPD_Cnd((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.statusInitUPD_Tgt((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.statusInitUPD_Stk((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.statusInitUPD_ExecTyp((MGBBP_StInfoCopyReg)this);
		MGBBP_StInfoCopyReg_MC.statusInitUPD_Btn((MGBBP_StInfoCopyReg)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_StInfoCopyReg p) {
		p.Cnd_calc_grp_cd_fr.setListListener(p);
		p.Cnd_calc_grp_cd_fr.addAllListener(p);
		p.Cnd_calc_grp_nm_fr.setListListener(p);
		p.Cnd_calc_grp_nm_fr.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_calc_grp_cd_to.setListListener(p);
		p.Cnd_calc_grp_cd_to.addAllListener(p);
		p.Cnd_calc_grp_nm_to.setListListener(p);
		p.Cnd_calc_grp_nm_to.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_stk_flg.addAllListener(p);
		p.Cnd_wip_flg.addAllListener(p);
		p.Cnd_lot_no_flg.addAllListener(p);
		p.Cnd_sublot_no_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_bp_flg.addAllListener(p);
		p.Cnd_asst_flg.addAllListener(p);
		p.Cnd_del_flg.addAllListener(p);
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBBP_StInfoCopyReg p) {
	}

	/**
	 *  [Stk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStk(MGBBP_StInfoCopyReg p) {
	}

	/**
	 *  [ExecTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExecTyp(MGBBP_StInfoCopyReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_StInfoCopyReg p) {
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_open_MGBBP0210.addAllListener(p);
		p.Btn_open_MGBBP0210.setAPMethodName("doBtn_open_MGBBP0210");
		p.Btn_open_MGBBP0220.addAllListener(p);
		p.Btn_open_MGBBP0220.setAPMethodName("doBtn_open_MGBBP0220");
	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBBP_StInfoCopyReg p){
		p.Cnd_calc_grp_cd_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_stk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wip_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_lot_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sublot_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_asst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_del_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tgt(MGBBP_StInfoCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Stk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Stk(MGBBP_StInfoCopyReg p){

	}

	/**
	 * [UPD]ステータスの[ExecTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExecTyp(MGBBP_StInfoCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBBP_StInfoCopyReg p){
		p.Btn_ins.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0210.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0220.putMode(p, UPD, MCMode.ENABLE);

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
		Cnd_calc_grp_cd_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd_fr.getListConfig().setPutter(getCnd_calc_grp_cd_fr_ListPutter());
		Cnd_calc_grp_cd_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd_to.getListConfig().setPutter(getCnd_calc_grp_cd_to_ListPutter());
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
	 * [Cnd_calc_grp_cd_fr_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_grp_cd_to_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd_fr) return getCnd_calc_grp_cd_fr(row, info);
		if(combo == Cnd_calc_grp_cd_to) return getCnd_calc_grp_cd_to(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_open_MGBBP0210) doBtn_open_MGBBP0210(info);
		else if (ap == Btn_open_MGBBP0220) doBtn_open_MGBBP0220(info);
	}

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0220]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0220(MCEventInfo info);

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
		if (vc == Cnd_calc_grp_cd_fr) return doCnd_calc_grp_cd_fr_VC(info);
		if (vc == Cnd_calc_grp_nm_fr) return doCnd_calc_grp_nm_fr_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_calc_grp_cd_to) return doCnd_calc_grp_cd_to_VC(info);
		if (vc == Cnd_calc_grp_nm_to) return doCnd_calc_grp_nm_to_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_stk_flg) return doCnd_stk_flg_VC(info);
		if (vc == Cnd_wip_flg) return doCnd_wip_flg_VC(info);
		if (vc == Cnd_lot_no_flg) return doCnd_lot_no_flg_VC(info);
		if (vc == Cnd_sublot_no_flg) return doCnd_sublot_no_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_bp_flg) return doCnd_bp_flg_VC(info);
		if (vc == Cnd_asst_flg) return doCnd_asst_flg_VC(info);
		if (vc == Cnd_del_flg) return doCnd_del_flg_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_flg_VC(MCEventInfo info){
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
		if (nc == Cnd_calc_grp_cd_fr) doCnd_calc_grp_cd_fr_NC(info);
		else if (nc == Cnd_calc_grp_nm_fr) doCnd_calc_grp_nm_fr_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_calc_grp_cd_to) doCnd_calc_grp_cd_to_NC(info);
		else if (nc == Cnd_calc_grp_nm_to) doCnd_calc_grp_nm_to_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_stk_flg) doCnd_stk_flg_NC(info);
		else if (nc == Cnd_wip_flg) doCnd_wip_flg_NC(info);
		else if (nc == Cnd_lot_no_flg) doCnd_lot_no_flg_NC(info);
		else if (nc == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_bp_flg) doCnd_bp_flg_NC(info);
		else if (nc == Cnd_asst_flg) doCnd_asst_flg_NC(info);
		else if (nc == Cnd_del_flg) doCnd_del_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_calc_grp_cd_fr) doCnd_calc_grp_cd_fr_NE(info);
		else if (ne == Cnd_calc_grp_nm_fr) doCnd_calc_grp_nm_fr_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_calc_grp_cd_to) doCnd_calc_grp_cd_to_NE(info);
		else if (ne == Cnd_calc_grp_nm_to) doCnd_calc_grp_nm_to_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_stk_flg) doCnd_stk_flg_NE(info);
		else if (ne == Cnd_wip_flg) doCnd_wip_flg_NE(info);
		else if (ne == Cnd_lot_no_flg) doCnd_lot_no_flg_NE(info);
		else if (ne == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_bp_flg) doCnd_bp_flg_NE(info);
		else if (ne == Cnd_asst_flg) doCnd_asst_flg_NE(info);
		else if (ne == Cnd_del_flg) doCnd_del_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_calc_grp_cd_fr) doCnd_calc_grp_cd_fr_NX(info);
		else if (nx == Cnd_calc_grp_nm_fr) doCnd_calc_grp_nm_fr_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_calc_grp_cd_to) doCnd_calc_grp_cd_to_NX(info);
		else if (nx == Cnd_calc_grp_nm_to) doCnd_calc_grp_nm_to_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_stk_flg) doCnd_stk_flg_NX(info);
		else if (nx == Cnd_wip_flg) doCnd_wip_flg_NX(info);
		else if (nx == Cnd_lot_no_flg) doCnd_lot_no_flg_NX(info);
		else if (nx == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_bp_flg) doCnd_bp_flg_NX(info);
		else if (nx == Cnd_asst_flg) doCnd_asst_flg_NX(info);
		else if (nx == Cnd_del_flg) doCnd_del_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd_fr) doCnd_calc_grp_cd_fr_LC(info);
		else if (lc == Cnd_calc_grp_nm_fr) doCnd_calc_grp_nm_fr_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_calc_grp_cd_to) doCnd_calc_grp_cd_to_LC(info);
		else if (lc == Cnd_calc_grp_nm_to) doCnd_calc_grp_nm_to_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd_fr]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd_to]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0240.Ins01")) {
			return new MG_MGBBL0240_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0240_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0240_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0240_Ins01;

		/** コンストラクタ */
		protected MG_MGBBL0240_Ins01Bridge() {
			p_MG_MGBBL0240_Ins01 = new MCParam(PDef.MG_MGBBL0240_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0240_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0240.CndR.create());
			// Down

			p_MG_MGBBL0240_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0240_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0240_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0240_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0240_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0240.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0240.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0240_Ins01;
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