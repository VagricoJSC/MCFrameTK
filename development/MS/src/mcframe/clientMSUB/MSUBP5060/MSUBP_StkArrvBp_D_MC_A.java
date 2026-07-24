package mcframe.clientMSUB.MSUBP5060;

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
 * 画面"MSUBP_StkArrvBp_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_StkArrvBp_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MSUBP5060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StkArrvBp]ブロック関連のField定義
	public MCPanel StkArrvBpPanel = null;
	public MCScrollPane StkArrvBpScrollPane = null;
	public MCTable2<mcframe.clientMSUB.MSUBP5060.StkArrvBpR> StkArrvBpTable = null;
	// [StkArrvBp]ブロックの項目のField定義
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStkArrvBp_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnStkArrvBp_stk_arrv_bp_nm = null;
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
	
	/** [StkArrvBp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUB.MSUBP5060.StkArrvBpR> aStkArrvBpL;

	/**
	 * コピーによってaStkArrvBpLを設定します。
	 *
	 * aStkArrvBpLのインスタンスは変更されません。
	 *
	 * @param dataset StkArrvBpL
	 */
	public void setStkArrvBpL(MCList<mcframe.clientMSUB.MSUBP5060.StkArrvBpR> aList) {
		if (getStkArrvBpL() != aList) {
			getStkArrvBpL().setAll(aList);
		}
	}

	/**
	 * [StkArrvBp]ブロックのコンテナaStkArrvBpLを返します。
	 *
	 * @return StkArrvBpL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5060.StkArrvBpR> getStkArrvBpL() {
		return aStkArrvBpL;
	}

	/**
	 * aStkArrvBpRを作成します。
	 *
	 * @return StkArrvBpR
	 */
	public mcframe.clientMSUB.MSUBP5060.StkArrvBpR createStkArrvBpR() {
		return mcframe.clientMSUB.MSUBP5060.StkArrvBpR.create();
	}

	/**
	 * aStkArrvBpLを作成します。
	 *
	 * @return StkArrvBpL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5060.StkArrvBpR> createStkArrvBpL() {
		return MCList.create(mcframe.clientMSUB.MSUBP5060.StkArrvBpR.class);
	}

	/**
	 * StkArrvBpTableを初期化します。
	 */
	protected void createStkArrvBpTable(){
		if(StkArrvBpTable == null){
			StkArrvBpTable = beansFactory.createTable2("StkArrvBp.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStkArrvBpL())) ret.add(getStkArrvBpL());
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
		if(aCnt == getStkArrvBpL()) return "StkArrvBp";
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
		if(bId.equals("StkArrvBp")) return getStkArrvBpL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StkArrvBpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkArrvBp_D_MC_A() {
		aStkArrvBpL = createStkArrvBpL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_StkArrvBp_D_MC_A(String name) {
		aStkArrvBpL = createStkArrvBpL();
		createStkArrvBpTable();
		StkArrvBpTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_StkArrvBp_D_MC.jbCreateStkArrvBp((MSUBP_StkArrvBp_D)this);
	}

	/**
	 * [StkArrvBp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStkArrvBp(MSUBP_StkArrvBp_D p) {
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

	
	/** [StkArrvBp_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter StkArrvBp_stk_arrv_bp_cd_p = null;

	/**
	 * [StkArrvBp_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getStkArrvBp_stk_arrv_bp_cd_ListPutter() {
		if (StkArrvBp_stk_arrv_bp_cd_p == null) {
			StkArrvBp_stk_arrv_bp_cd_p = createStkArrvBp_stk_arrv_bp_cd_ListPutter(columnStkArrvBp_stk_arrv_bp_cd, "stk_arrv_bp_cd", "stk_arrv_bp_nm");

		}
		return StkArrvBp_stk_arrv_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_StkArrvBp_D create(){
		MSUBP_StkArrvBp_D p = new MSUBP_StkArrvBp_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_StkArrvBp_D create(String name){
		MSUBP_StkArrvBp_D p = new MSUBP_StkArrvBp_D(name);
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
		MSUBP_StkArrvBp_D_MC.jbfInitStkArrvBp((MSUBP_StkArrvBp_D)this);
		MSUBP_StkArrvBp_D_MC.jbInitStkArrvBp((MSUBP_StkArrvBp_D)this);
	}

	/**
	 * [StkArrvBp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStkArrvBp(MSUBP_StkArrvBp_D p) {
		// ブロック関連の初期化
		p.StkArrvBpPanel = p.beansFactory.createPanel("StkArrvBp");
		p.StkArrvBpScrollPane = p.beansFactory.createScrollPane("StkArrvBp.scroll");
		p.createStkArrvBpTable();
		// ブロックの項目の初期化
		p.columnStkArrvBp_stk_arrv_bp_cd = p.beansFactory.createTableColumn("StkArrvBp.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnStkArrvBp_stk_arrv_bp_nm = p.beansFactory.createTableColumn("StkArrvBp.stk_arrv_bp_nm", MCColumnType.TEXT);
	}

	/**
	 * [StkArrvBp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStkArrvBp(MSUBP_StkArrvBp_D p) {
		// ブロック関連の初期化
		p.add(p.StkArrvBpPanel);
		p.setLastBeans(p.StkArrvBpPanel);
		p.StkArrvBpPanel.add(p.StkArrvBpScrollPane);
		p.StkArrvBpPanel.setLastBeans(p.StkArrvBpTable);
		p.StkArrvBpScrollPane.setViewportView(p.StkArrvBpTable);
		p.StkArrvBpTable.setList(p.getStkArrvBpL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_StkArrvBp_D_MC.mcInitStkArrvBp((MSUBP_StkArrvBp_D)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_StkArrvBp_D_MC.statusInitENABLE_StkArrvBp((MSUBP_StkArrvBp_D)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_StkArrvBp_D_MC.statusInitDISABLE_StkArrvBp((MSUBP_StkArrvBp_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_StkArrvBp_D_MC.statusInitREAD__ONLY_StkArrvBp((MSUBP_StkArrvBp_D)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_StkArrvBp_D_MC.statusInitREQUIRED_StkArrvBp((MSUBP_StkArrvBp_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_StkArrvBp_D_MC.statusInitINVISIBLE_StkArrvBp((MSUBP_StkArrvBp_D)this);

	}

	/**
	 *  [StkArrvBp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStkArrvBp(MSUBP_StkArrvBp_D p) {
		p.StkArrvBpTable.addAllListener(p);
		p.columnStkArrvBp_stk_arrv_bp_cd.addAllListener(p);
		p.columnStkArrvBp_stk_arrv_bp_cd.setListListener(p);
		p.columnStkArrvBp_stk_arrv_bp_nm.addAllListener(p);
		p.columnStkArrvBp_stk_arrv_bp_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StkArrvBp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StkArrvBp(MSUBP_StkArrvBp_D p){
		p.columnStkArrvBp_stk_arrv_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnStkArrvBp_stk_arrv_bp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[StkArrvBp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StkArrvBp(MSUBP_StkArrvBp_D p){
		p.columnStkArrvBp_stk_arrv_bp_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnStkArrvBp_stk_arrv_bp_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StkArrvBp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StkArrvBp(MSUBP_StkArrvBp_D p){
		p.columnStkArrvBp_stk_arrv_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnStkArrvBp_stk_arrv_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StkArrvBp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StkArrvBp(MSUBP_StkArrvBp_D p){
		p.columnStkArrvBp_stk_arrv_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnStkArrvBp_stk_arrv_bp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[StkArrvBp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StkArrvBp(MSUBP_StkArrvBp_D p){
		p.columnStkArrvBp_stk_arrv_bp_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnStkArrvBp_stk_arrv_bp_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSUBP_StkArrvBp_D_MC.setTableConfigStkArrvBp((MSUBP_StkArrvBp_D)this);
	}

	/**
	 * [StkArrvBp]ブロックのTableの設定
	 */
	protected static void setTableConfigStkArrvBp(MSUBP_StkArrvBp_D p) {
		p.columnStkArrvBp_stk_arrv_bp_cd.setMeta(mcframe.clientMSUB.MSUBP5060.StkArrvBpR.stk_arrv_bp_cd_META);
		p.columnStkArrvBp_stk_arrv_bp_cd.setListType(MCListType.STRICT);
		p.columnStkArrvBp_stk_arrv_bp_cd.addLinkBeans(p.columnStkArrvBp_stk_arrv_bp_nm);
		p.StkArrvBpTable.addColumnConfig(p.columnStkArrvBp_stk_arrv_bp_cd);
		p.columnStkArrvBp_stk_arrv_bp_nm.setMeta(mcframe.clientMSUB.MSUBP5060.StkArrvBpR.stk_arrv_bp_nm_META);
		p.StkArrvBpTable.addColumnConfig(p.columnStkArrvBp_stk_arrv_bp_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnStkArrvBp_stk_arrv_bp_cd.getListConfig().setPutter(getStkArrvBp_stk_arrv_bp_cd_ListPutter());
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
	 * [StkArrvBp_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createStkArrvBp_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnStkArrvBp_stk_arrv_bp_cd) return getStkArrvBp_stk_arrv_bp_cd(row, info);
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
		if (vc == StkArrvBpTable) return doStkArrvBp_VC(info);
		if (vc == columnStkArrvBp_stk_arrv_bp_cd) return doStkArrvBp_stk_arrv_bp_cd_VC(info);
		if (vc == columnStkArrvBp_stk_arrv_bp_nm) return doStkArrvBp_stk_arrv_bp_nm_VC(info);
		return true;
	}

	/**
	 * [StkArrvBp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkArrvBp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkArrvBp_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkArrvBp_stk_arrv_bp_nm_VC(MCEventInfo info){
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
		if (nc == StkArrvBpTable) doStkArrvBp_NC(info);
		else if (nc == columnStkArrvBp_stk_arrv_bp_cd) doStkArrvBp_stk_arrv_bp_cd_NC(info);
		else if (nc == columnStkArrvBp_stk_arrv_bp_nm) doStkArrvBp_stk_arrv_bp_nm_NC(info);
	}

	/**
	 * [StkArrvBp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_NC(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StkArrvBpTable) doStkArrvBp_NE(info);
		else if (ne == columnStkArrvBp_stk_arrv_bp_cd) doStkArrvBp_stk_arrv_bp_cd_NE(info);
		else if (ne == columnStkArrvBp_stk_arrv_bp_nm) doStkArrvBp_stk_arrv_bp_nm_NE(info);
	}

	/**
	 * [StkArrvBp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_NE(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StkArrvBpTable) doStkArrvBp_NX(info);
		else if (nx == columnStkArrvBp_stk_arrv_bp_cd) doStkArrvBp_stk_arrv_bp_cd_NX(info);
		else if (nx == columnStkArrvBp_stk_arrv_bp_nm) doStkArrvBp_stk_arrv_bp_nm_NX(info);
	}

	/**
	 * [StkArrvBp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_NX(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnStkArrvBp_stk_arrv_bp_cd) doStkArrvBp_stk_arrv_bp_cd_LC(info);
		else if (lc == columnStkArrvBp_stk_arrv_bp_nm) doStkArrvBp_stk_arrv_bp_nm_LC(info);
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [StkArrvBp]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkArrvBp_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnStkArrvBp_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getStkArrvBp_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}