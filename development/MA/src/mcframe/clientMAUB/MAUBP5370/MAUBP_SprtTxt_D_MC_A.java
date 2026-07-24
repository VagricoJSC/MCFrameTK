package mcframe.clientMAUB.MAUBP5370;

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
 * 画面"MAUBP_SprtTxt_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_SprtTxt_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SUBMODULE_ID = "MAUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUBP5370";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Txt]ブロック関連のField定義
	public MCPanel TxtPanel = null;
	public MCScrollPane TxtScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5370.TxtR> TxtTable = null;
	// [Txt]ブロックの項目のField定義
	/**
	 * Dummy name ダミー名称.<p>
	 *
	 */
	public MCColumnConfig columnTxt_txt = null;
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
	
	/** [Txt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5370.TxtR> aTxtL;

	/**
	 * コピーによってaTxtLを設定します。
	 *
	 * aTxtLのインスタンスは変更されません。
	 *
	 * @param dataset TxtL
	 */
	public void setTxtL(MCList<mcframe.clientMAUB.MAUBP5370.TxtR> aList) {
		if (getTxtL() != aList) {
			getTxtL().setAll(aList);
		}
	}

	/**
	 * [Txt]ブロックのコンテナaTxtLを返します。
	 *
	 * @return TxtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5370.TxtR> getTxtL() {
		return aTxtL;
	}

	/**
	 * aTxtRを作成します。
	 *
	 * @return TxtR
	 */
	public mcframe.clientMAUB.MAUBP5370.TxtR createTxtR() {
		return mcframe.clientMAUB.MAUBP5370.TxtR.create();
	}

	/**
	 * aTxtLを作成します。
	 *
	 * @return TxtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5370.TxtR> createTxtL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5370.TxtR.class);
	}

	/**
	 * TxtTableを初期化します。
	 */
	protected void createTxtTable(){
		if(TxtTable == null){
			TxtTable = beansFactory.createTable2("Txt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTxtL())) ret.add(getTxtL());
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
		if(aCnt == getTxtL()) return "Txt";
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
		if(bId.equals("Txt")) return getTxtL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TxtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_SprtTxt_D_MC_A() {
		aTxtL = createTxtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_SprtTxt_D_MC_A(String name) {
		aTxtL = createTxtL();
		createTxtTable();
		TxtTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_SprtTxt_D_MC.jbCreateTxt((MAUBP_SprtTxt_D)this);
	}

	/**
	 * [Txt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTxt(MAUBP_SprtTxt_D p) {
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

	
	/** [Txt_txt_ListPutter]の定義 */
	private MCListPutter Txt_txt_p = null;

	/**
	 * [Txt_txt_ListPutter]の取得
	 */
	protected MCListPutter getTxt_txt_ListPutter() {
		if (Txt_txt_p == null) {
			Txt_txt_p = createTxt_txt_ListPutter(columnTxt_txt, "txt");

		}
		return Txt_txt_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_SprtTxt_D create(){
		MAUBP_SprtTxt_D p = new MAUBP_SprtTxt_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_SprtTxt_D create(String name){
		MAUBP_SprtTxt_D p = new MAUBP_SprtTxt_D(name);
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
		MAUBP_SprtTxt_D_MC.jbfInitTxt((MAUBP_SprtTxt_D)this);
		MAUBP_SprtTxt_D_MC.jbInitTxt((MAUBP_SprtTxt_D)this);
	}

	/**
	 * [Txt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTxt(MAUBP_SprtTxt_D p) {
		// ブロック関連の初期化
		p.TxtPanel = p.beansFactory.createPanel("Txt");
		p.TxtScrollPane = p.beansFactory.createScrollPane("Txt.scroll");
		p.createTxtTable();
		// ブロックの項目の初期化
		p.columnTxt_txt = p.beansFactory.createTableColumn("Txt.txt", MCColumnType.TEXT_COMBO_FREE);
	}

	/**
	 * [Txt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTxt(MAUBP_SprtTxt_D p) {
		// ブロック関連の初期化
		p.add(p.TxtPanel);
		p.setLastBeans(p.TxtPanel);
		p.TxtPanel.add(p.TxtScrollPane);
		p.TxtPanel.setLastBeans(p.TxtTable);
		p.TxtScrollPane.setViewportView(p.TxtTable);
		p.TxtTable.setList(p.getTxtL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_SprtTxt_D_MC.mcInitTxt((MAUBP_SprtTxt_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_SprtTxt_D_MC.statusInitENABLE_Txt((MAUBP_SprtTxt_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_SprtTxt_D_MC.statusInitDISABLE_Txt((MAUBP_SprtTxt_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_SprtTxt_D_MC.statusInitREAD__ONLY_Txt((MAUBP_SprtTxt_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_SprtTxt_D_MC.statusInitREQUIRED_Txt((MAUBP_SprtTxt_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_SprtTxt_D_MC.statusInitINVISIBLE_Txt((MAUBP_SprtTxt_D)this);

	}

	/**
	 *  [Txt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTxt(MAUBP_SprtTxt_D p) {
		p.TxtTable.addAllListener(p);
		p.columnTxt_txt.addAllListener(p);
		p.columnTxt_txt.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Txt(MAUBP_SprtTxt_D p){
		p.columnTxt_txt.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Txt(MAUBP_SprtTxt_D p){
		p.columnTxt_txt.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Txt(MAUBP_SprtTxt_D p){
		p.columnTxt_txt.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Txt(MAUBP_SprtTxt_D p){
		p.columnTxt_txt.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Txt(MAUBP_SprtTxt_D p){
		p.columnTxt_txt.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_SprtTxt_D_MC.setTableConfigTxt((MAUBP_SprtTxt_D)this);
	}

	/**
	 * [Txt]ブロックのTableの設定
	 */
	protected static void setTableConfigTxt(MAUBP_SprtTxt_D p) {
		p.columnTxt_txt.setMeta(mcframe.clientMAUB.MAUBP5370.TxtR.txt_META);
		p.TxtTable.addColumnConfig(p.columnTxt_txt);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnTxt_txt.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnTxt_txt.getListConfig().setPutter(getTxt_txt_ListPutter());
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
	 * [Txt_txt_ListPutter]の作成
	 */
	protected MCListPutter createTxt_txt_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnTxt_txt) return getTxt_txt(row, info);
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
		if (vc == TxtTable) return doTxt_VC(info);
		if (vc == columnTxt_txt) return doTxt_txt_VC(info);
		return true;
	}

	/**
	 * [Txt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTxt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Txt]パネルの[txt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTxt_txt_VC(MCEventInfo info){
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
		if (nc == TxtTable) doTxt_NC(info);
		else if (nc == columnTxt_txt) doTxt_txt_NC(info);
	}

	/**
	 * [Txt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_NC(MCEventInfo info){
	}

	/**
	 * [Txt]パネルの[txt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TxtTable) doTxt_NE(info);
		else if (ne == columnTxt_txt) doTxt_txt_NE(info);
	}

	/**
	 * [Txt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_NE(MCEventInfo info){
	}

	/**
	 * [Txt]パネルの[txt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TxtTable) doTxt_NX(info);
		else if (nx == columnTxt_txt) doTxt_txt_NX(info);
	}

	/**
	 * [Txt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_NX(MCEventInfo info){
	}

	/**
	 * [Txt]パネルの[txt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnTxt_txt) doTxt_txt_LC(info);
	}

	/**
	 * [Txt]パネルの[txt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnTxt_txt]の作成メソッド
	 */
	public MCList getTxt_txt(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}