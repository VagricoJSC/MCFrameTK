package mcframe.clientMSUB.MSUBP5050;

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
 * 画面"MSUBP_StkBp_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_StkBp_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SUBMODULE_ID = "MSUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUBP5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StkBp]ブロック関連のField定義
	public MCPanel StkBpPanel = null;
	public MCScrollPane StkBpScrollPane = null;
	public MCTable2<mcframe.clientMSUB.MSUBP5050.StkBpR> StkBpTable = null;
	// [StkBp]ブロックの項目のField定義
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStkBp_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnStkBp_stk_bp_nm = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [DISABLE]モードを表す定数 */
	public static final String DISABLE = "DISABLE";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";
	/** [REQUIRED]モードを表す定数 */
	public static final String REQUIRED = "REQUIRED";
	/** [INVISIBLE]モードを表す定数 */
	public static final String INVISIBLE = "INVISIBLE";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [StkBp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUB.MSUBP5050.StkBpR> aStkBpL;

	/**
	 * コピーによってaStkBpLを設定します。
	 *
	 * aStkBpLのインスタンスは変更されません。
	 *
	 * @param dataset StkBpL
	 */
	public void setStkBpL(MCList<mcframe.clientMSUB.MSUBP5050.StkBpR> aList) {
		if (getStkBpL() != aList) {
			getStkBpL().setAll(aList);
		}
	}

	/**
	 * [StkBp]ブロックのコンテナaStkBpLを返します。
	 *
	 * @return StkBpL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5050.StkBpR> getStkBpL() {
		return aStkBpL;
	}

	/**
	 * aStkBpRを作成します。
	 *
	 * @return StkBpR
	 */
	public mcframe.clientMSUB.MSUBP5050.StkBpR createStkBpR() {
		return mcframe.clientMSUB.MSUBP5050.StkBpR.create();
	}

	/**
	 * aStkBpLを作成します。
	 *
	 * @return StkBpL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5050.StkBpR> createStkBpL() {
		return MCList.create(mcframe.clientMSUB.MSUBP5050.StkBpR.class);
	}

	/**
	 * StkBpTableを初期化します。
	 */
	protected void createStkBpTable(){
		if(StkBpTable == null){
			StkBpTable = beansFactory.createTable2("StkBp.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStkBpL())) ret.add(getStkBpL());
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
		if(aCnt == getStkBpL()) return "StkBp";
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
		if(bId.equals("StkBp")) return getStkBpL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StkBpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkBp_D_MC_A() {
		aStkBpL = createStkBpL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_StkBp_D_MC_A(String name) {
		aStkBpL = createStkBpL();
		createStkBpTable();
		StkBpTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_StkBp_D_MC.jbCreateStkBp((MSUBP_StkBp_D)this);
	}

	/**
	 * [StkBp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStkBp(MSUBP_StkBp_D p) {
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

	
	/** [StkBp_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter StkBp_stk_bp_cd_p = null;

	/**
	 * [StkBp_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getStkBp_stk_bp_cd_ListPutter() {
		if (StkBp_stk_bp_cd_p == null) {
			StkBp_stk_bp_cd_p = createStkBp_stk_bp_cd_ListPutter(columnStkBp_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");

		}
		return StkBp_stk_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_StkBp_D create(){
		MSUBP_StkBp_D p = new MSUBP_StkBp_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_StkBp_D create(String name){
		MSUBP_StkBp_D p = new MSUBP_StkBp_D(name);
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
		MSUBP_StkBp_D_MC.jbfInitStkBp((MSUBP_StkBp_D)this);
		MSUBP_StkBp_D_MC.jbInitStkBp((MSUBP_StkBp_D)this);
	}

	/**
	 * [StkBp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStkBp(MSUBP_StkBp_D p) {
		// ブロック関連の初期化
		p.StkBpPanel = p.beansFactory.createPanel("StkBp");
		p.StkBpScrollPane = p.beansFactory.createScrollPane("StkBp.scroll");
		p.createStkBpTable();
		// ブロックの項目の初期化
		p.columnStkBp_stk_bp_cd = p.beansFactory.createTableColumn("StkBp.stk_bp_cd", MCColumnType.TEXT);
		p.columnStkBp_stk_bp_nm = p.beansFactory.createTableColumn("StkBp.stk_bp_nm", MCColumnType.TEXT);
	}

	/**
	 * [StkBp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStkBp(MSUBP_StkBp_D p) {
		// ブロック関連の初期化
		p.add(p.StkBpPanel);
		p.setLastBeans(p.StkBpPanel);
		p.StkBpPanel.add(p.StkBpScrollPane);
		p.StkBpPanel.setLastBeans(p.StkBpTable);
		p.StkBpScrollPane.setViewportView(p.StkBpTable);
		p.StkBpTable.setList(p.getStkBpL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_StkBp_D_MC.mcInitStkBp((MSUBP_StkBp_D)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_StkBp_D_MC.statusInitENABLE_StkBp((MSUBP_StkBp_D)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_StkBp_D_MC.statusInitDISABLE_StkBp((MSUBP_StkBp_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_StkBp_D_MC.statusInitREAD__ONLY_StkBp((MSUBP_StkBp_D)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_StkBp_D_MC.statusInitREQUIRED_StkBp((MSUBP_StkBp_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_StkBp_D_MC.statusInitINVISIBLE_StkBp((MSUBP_StkBp_D)this);

	}

	/**
	 *  [StkBp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStkBp(MSUBP_StkBp_D p) {
		p.StkBpTable.addAllListener(p);
		p.columnStkBp_stk_bp_cd.addAllListener(p);
		p.columnStkBp_stk_bp_cd.setListListener(p);
		p.columnStkBp_stk_bp_nm.addAllListener(p);
		p.columnStkBp_stk_bp_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StkBp(MSUBP_StkBp_D p){
		p.columnStkBp_stk_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnStkBp_stk_bp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StkBp(MSUBP_StkBp_D p){
		p.columnStkBp_stk_bp_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnStkBp_stk_bp_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StkBp(MSUBP_StkBp_D p){
		p.columnStkBp_stk_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnStkBp_stk_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StkBp(MSUBP_StkBp_D p){
		p.columnStkBp_stk_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnStkBp_stk_bp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StkBp(MSUBP_StkBp_D p){
		p.columnStkBp_stk_bp_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnStkBp_stk_bp_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSUBP_StkBp_D_MC.setTableConfigStkBp((MSUBP_StkBp_D)this);
	}

	/**
	 * [StkBp]ブロックのTableの設定
	 */
	protected static void setTableConfigStkBp(MSUBP_StkBp_D p) {
		p.columnStkBp_stk_bp_cd.setMeta(mcframe.clientMSUB.MSUBP5050.StkBpR.stk_bp_cd_META);
		p.columnStkBp_stk_bp_cd.setListType(MCListType.STRICT);
		p.columnStkBp_stk_bp_cd.addLinkBeans(p.columnStkBp_stk_bp_nm);
		p.StkBpTable.addColumnConfig(p.columnStkBp_stk_bp_cd);
		p.columnStkBp_stk_bp_nm.setMeta(mcframe.clientMSUB.MSUBP5050.StkBpR.stk_bp_nm_META);
		p.StkBpTable.addColumnConfig(p.columnStkBp_stk_bp_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnStkBp_stk_bp_cd.getListConfig().setPutter(getStkBp_stk_bp_cd_ListPutter());
	}

	/**
	 * この画面を[ENABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLEStatus() {
		status = ENABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[DISABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDISABLEStatus() {
		status = DISABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[READ_ONLY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREAD_ONLYStatus() {
		status = READ_ONLY;
		setAllStatus(status);
	}

	/**
	 * この画面を[REQUIRED]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQUIREDStatus() {
		status = REQUIRED;
		setAllStatus(status);
	}

	/**
	 * この画面を[INVISIBLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINVISIBLEStatus() {
		status = INVISIBLE;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (ENABLE.equals(status)) {
			setENABLEStatus();
		}
		else if (DISABLE.equals(status)) {
			setDISABLEStatus();
		}
		else if (READ_ONLY.equals(status)) {
			setREAD_ONLYStatus();
		}
		else if (REQUIRED.equals(status)) {
			setREQUIREDStatus();
		}
		else if (INVISIBLE.equals(status)) {
			setINVISIBLEStatus();
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
	 * [StkBp_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createStkBp_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnStkBp_stk_bp_cd) return getStkBp_stk_bp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
	}

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
		if (vc == StkBpTable) return doStkBp_VC(info);
		if (vc == columnStkBp_stk_bp_cd) return doStkBp_stk_bp_cd_VC(info);
		if (vc == columnStkBp_stk_bp_nm) return doStkBp_stk_bp_nm_VC(info);
		return true;
	}

	/**
	 * [StkBp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkBp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkBp_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkBp_stk_bp_nm_VC(MCEventInfo info){
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
		if (nc == StkBpTable) doStkBp_NC(info);
		else if (nc == columnStkBp_stk_bp_cd) doStkBp_stk_bp_cd_NC(info);
		else if (nc == columnStkBp_stk_bp_nm) doStkBp_stk_bp_nm_NC(info);
	}

	/**
	 * [StkBp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_NC(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StkBpTable) doStkBp_NE(info);
		else if (ne == columnStkBp_stk_bp_cd) doStkBp_stk_bp_cd_NE(info);
		else if (ne == columnStkBp_stk_bp_nm) doStkBp_stk_bp_nm_NE(info);
	}

	/**
	 * [StkBp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_NE(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StkBpTable) doStkBp_NX(info);
		else if (nx == columnStkBp_stk_bp_cd) doStkBp_stk_bp_cd_NX(info);
		else if (nx == columnStkBp_stk_bp_nm) doStkBp_stk_bp_nm_NX(info);
	}

	/**
	 * [StkBp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_NX(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnStkBp_stk_bp_cd) doStkBp_stk_bp_cd_LC(info);
		else if (lc == columnStkBp_stk_bp_nm) doStkBp_stk_bp_nm_LC(info);
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnStkBp_stk_bp_cd]の作成メソッド
	 */
	public MCList getStkBp_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}