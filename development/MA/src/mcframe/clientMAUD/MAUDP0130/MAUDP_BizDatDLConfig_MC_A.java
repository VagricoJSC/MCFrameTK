package mcframe.clientMAUD.MAUDP0130;

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

/**
 * 画面"MAUDP_BizDatDLConfig"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUDP_BizDatDLConfig_MC_A extends mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase{
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
	public static final String SUBMODULE_ID = "MAUD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUDP0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Def]ブロック関連のField定義
	public MCPanel DefPanel = null;
	public MCTitledBorder DefTitledBorder = null;
	// [Def]ブロックの項目のField定義
	/**
	 * XLSX,xlsx,10;CSV,csv,20 XLSX,xlsx,10;CSV,csv,20.<p>
	 *
	 */
	public MCButtonGroup Def_file_typ_over_cap_Group = null;
	public MCRadioButton Def_file_typ_over_cap_XLSX = null;
	public MCRadioButton Def_file_typ_over_cap_CSV = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Apply 適用.<p>
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

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Def]ブロックのコンテナField定義 */
	private final mcframe.clientMAUD.MAUDP0130.DefR aDefR;

	/**
	 * 項目コピーによってaDefRを設定します。
	 *
	 * aDefRのインスタンスは変更されません。
	 *
	 * @param row DefR
	 */
	public void setDefR(mcframe.clientMAUD.MAUDP0130.DefR row) {
		if (row != null) {
			MCRow.copyall(getDefR(), row);
		}
	}

	/**
	 * [Def]ブロックのコンテナaDefRを返します。
	 *
	 * @return DefR
	 */
	public mcframe.clientMAUD.MAUDP0130.DefR getDefR() {
		return aDefR;
	}

	/**
	 * aDefRを作成します。
	 *
	 * @return DefR
	 */
	public mcframe.clientMAUD.MAUDP0130.DefR createDefR() {
		return mcframe.clientMAUD.MAUDP0130.DefR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getDefR())) ret.add(getDefR());
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
		if(aCnt == getDefR()) return "Def";
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
		if(bId.equals("Def")) return getDefR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(DefPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_BizDatDLConfig_MC_A() {
		aDefR = createDefR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUDP_BizDatDLConfig_MC.jbCreateDef((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.jbCreateBtn((MAUDP_BizDatDLConfig)this);
	}

	/**
	 * [Def]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDef(MAUDP_BizDatDLConfig p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUDP_BizDatDLConfig p) {
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
	public static MAUDP_BizDatDLConfig create(){
		MAUDP_BizDatDLConfig p = new MAUDP_BizDatDLConfig();
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
		MAUDP_BizDatDLConfig_MC.jbfInitDef((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.jbfInitBtn((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.jbInitDef((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.jbInitBtn((MAUDP_BizDatDLConfig)this);
	}

	/**
	 * [Def]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDef(MAUDP_BizDatDLConfig p) {
		// ブロック関連の初期化
		p.DefPanel = p.beansFactory.createPanel("Def");
		p.DefTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Def_file_typ_over_cap_Group = p.beansFactory.createButtonGroup("Def.file_typ_over_cap");
		p.Def_file_typ_over_cap_XLSX = p.beansFactory.createRadioButton("Def.file_typ_over_cap_XLSX");
		p.Def_file_typ_over_cap_CSV = p.beansFactory.createRadioButton("Def.file_typ_over_cap_CSV");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUDP_BizDatDLConfig p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd");
	}

	/**
	 * [Def]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDef(MAUDP_BizDatDLConfig p) {
		// ブロック関連の初期化
		p.DefPanel.setBorder(p.DefTitledBorder);
		p.add(p.DefPanel);
		p.setLastBeans(p.DefPanel);
		p.DefPanel.setNextBeans(p.BtnPanel);
		p.DefPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.DefPanel.setLastBeans(p.Def_file_typ_over_cap_Group);
		p.Def_file_typ_over_cap_Group.setFirstBeans(p.Def_file_typ_over_cap_XLSX);
		p.Def_file_typ_over_cap_XLSX.setActionCommand("10");
		p.Def_file_typ_over_cap_Group.add(p.Def_file_typ_over_cap_XLSX);
		p.DefPanel.add(p.Def_file_typ_over_cap_XLSX);
		p.Def_file_typ_over_cap_XLSX.setNextBeans(p.Def_file_typ_over_cap_CSV);
		p.Def_file_typ_over_cap_CSV.setActionCommand("20");
		p.Def_file_typ_over_cap_Group.add(p.Def_file_typ_over_cap_CSV);
		p.DefPanel.add(p.Def_file_typ_over_cap_CSV);
		p.Def_file_typ_over_cap_Group.setRow(p.getDefR(), mcframe.clientMAUD.MAUDP0130.DefR.file_typ_over_cap_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MAUDP_BizDatDLConfig p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_upd.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "S";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUDP_BizDatDLConfig_MC.mcInitDef((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.mcInitBtn((MAUDP_BizDatDLConfig)this);

		// [UPD]ステータスのモードの設定
		MAUDP_BizDatDLConfig_MC.statusInitUPD_Def((MAUDP_BizDatDLConfig)this);
		MAUDP_BizDatDLConfig_MC.statusInitUPD_Btn((MAUDP_BizDatDLConfig)this);

	}

	/**
	 *  [Def]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDef(MAUDP_BizDatDLConfig p) {
		p.Def_file_typ_over_cap_Group.addAllListener(p);
		p.Def_file_typ_over_cap_XLSX.addAllListener(p);
		p.Def_file_typ_over_cap_CSV.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUDP_BizDatDLConfig p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[Def]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Def(MAUDP_BizDatDLConfig p){
		p.Def_file_typ_over_cap_Group.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MAUDP_BizDatDLConfig p){
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
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
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
		if (ap == Btn_upd) doBtn_upd(info);
	}

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
		if (vc == Def_file_typ_over_cap_Group) return doDef_file_typ_over_cap_VC(info);
		return true;
	}

	/**
	 * [Def]パネルの[file_typ_over_cap]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDef_file_typ_over_cap_VC(MCEventInfo info){
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
		if (nc == Def_file_typ_over_cap_Group) doDef_file_typ_over_cap_NC(info);
	}

	/**
	 * [Def]パネルの[file_typ_over_cap]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDef_file_typ_over_cap_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Def_file_typ_over_cap_Group) doDef_file_typ_over_cap_NE(info);
	}

	/**
	 * [Def]パネルの[file_typ_over_cap]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDef_file_typ_over_cap_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Def_file_typ_over_cap_Group) doDef_file_typ_over_cap_NX(info);
	}

	/**
	 * [Def]パネルの[file_typ_over_cap]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDef_file_typ_over_cap_NX(MCEventInfo info){
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
		return super.createBridge(id);
	}
}