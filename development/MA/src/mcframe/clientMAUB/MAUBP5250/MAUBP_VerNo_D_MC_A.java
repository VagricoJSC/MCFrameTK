package mcframe.clientMAUB.MAUBP5250;

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
 * 画面"MAUBP_VerNo_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_VerNo_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [VerNo]ブロック関連のField定義
	public MCPanel VerNoPanel = null;
	public MCScrollPane VerNoScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5250.VerNoR> VerNoTable = null;
	// [VerNo]ブロックの項目のField定義
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnVerNo_ver_no = null;
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
	
	/** [VerNo]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5250.VerNoR> aVerNoL;

	/**
	 * コピーによってaVerNoLを設定します。
	 *
	 * aVerNoLのインスタンスは変更されません。
	 *
	 * @param dataset VerNoL
	 */
	public void setVerNoL(MCList<mcframe.clientMAUB.MAUBP5250.VerNoR> aList) {
		if (getVerNoL() != aList) {
			getVerNoL().setAll(aList);
		}
	}

	/**
	 * [VerNo]ブロックのコンテナaVerNoLを返します。
	 *
	 * @return VerNoL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5250.VerNoR> getVerNoL() {
		return aVerNoL;
	}

	/**
	 * aVerNoRを作成します。
	 *
	 * @return VerNoR
	 */
	public mcframe.clientMAUB.MAUBP5250.VerNoR createVerNoR() {
		return mcframe.clientMAUB.MAUBP5250.VerNoR.create();
	}

	/**
	 * aVerNoLを作成します。
	 *
	 * @return VerNoL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5250.VerNoR> createVerNoL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	}

	/**
	 * VerNoTableを初期化します。
	 */
	protected void createVerNoTable(){
		if(VerNoTable == null){
			VerNoTable = beansFactory.createTable2("VerNo.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getVerNoL())) ret.add(getVerNoL());
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
		if(aCnt == getVerNoL()) return "VerNo";
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
		if(bId.equals("VerNo")) return getVerNoL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(VerNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_VerNo_D_MC_A() {
		aVerNoL = createVerNoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_VerNo_D_MC_A(String name) {
		aVerNoL = createVerNoL();
		createVerNoTable();
		VerNoTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_VerNo_D_MC.jbCreateVerNo((MAUBP_VerNo_D)this);
	}

	/**
	 * [VerNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateVerNo(MAUBP_VerNo_D p) {
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

	
	/** [VerNo_ver_no_ListPutter]の定義 */
	private MCListPutter VerNo_ver_no_p = null;

	/**
	 * [VerNo_ver_no_ListPutter]の取得
	 */
	protected MCListPutter getVerNo_ver_no_ListPutter() {
		if (VerNo_ver_no_p == null) {
			VerNo_ver_no_p = createVerNo_ver_no_ListPutter(columnVerNo_ver_no, "ver_no");

		}
		return VerNo_ver_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_VerNo_D create(){
		MAUBP_VerNo_D p = new MAUBP_VerNo_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_VerNo_D create(String name){
		MAUBP_VerNo_D p = new MAUBP_VerNo_D(name);
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
		MAUBP_VerNo_D_MC.jbfInitVerNo((MAUBP_VerNo_D)this);
		MAUBP_VerNo_D_MC.jbInitVerNo((MAUBP_VerNo_D)this);
	}

	/**
	 * [VerNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitVerNo(MAUBP_VerNo_D p) {
		// ブロック関連の初期化
		p.VerNoPanel = p.beansFactory.createPanel("VerNo");
		p.VerNoScrollPane = p.beansFactory.createScrollPane("VerNo.scroll");
		p.createVerNoTable();
		// ブロックの項目の初期化
		p.columnVerNo_ver_no = p.beansFactory.createTableColumn("VerNo.ver_no", MCColumnType.TEXT_COMBO);
	}

	/**
	 * [VerNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitVerNo(MAUBP_VerNo_D p) {
		// ブロック関連の初期化
		p.add(p.VerNoPanel);
		p.setLastBeans(p.VerNoPanel);
		p.VerNoPanel.add(p.VerNoScrollPane);
		p.VerNoPanel.setLastBeans(p.VerNoTable);
		p.VerNoScrollPane.setViewportView(p.VerNoTable);
		p.VerNoTable.setList(p.getVerNoL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_VerNo_D_MC.mcInitVerNo((MAUBP_VerNo_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_VerNo_D_MC.statusInitENABLE_VerNo((MAUBP_VerNo_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_VerNo_D_MC.statusInitDISABLE_VerNo((MAUBP_VerNo_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_VerNo_D_MC.statusInitREAD__ONLY_VerNo((MAUBP_VerNo_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_VerNo_D_MC.statusInitREQUIRED_VerNo((MAUBP_VerNo_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_VerNo_D_MC.statusInitINVISIBLE_VerNo((MAUBP_VerNo_D)this);

	}

	/**
	 *  [VerNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitVerNo(MAUBP_VerNo_D p) {
		p.VerNoTable.addAllListener(p);
		p.columnVerNo_ver_no.addAllListener(p);
		p.columnVerNo_ver_no.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[VerNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_VerNo(MAUBP_VerNo_D p){
		p.columnVerNo_ver_no.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[VerNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_VerNo(MAUBP_VerNo_D p){
		p.columnVerNo_ver_no.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[VerNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_VerNo(MAUBP_VerNo_D p){
		p.columnVerNo_ver_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[VerNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_VerNo(MAUBP_VerNo_D p){
		p.columnVerNo_ver_no.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[VerNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_VerNo(MAUBP_VerNo_D p){
		p.columnVerNo_ver_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_VerNo_D_MC.setTableConfigVerNo((MAUBP_VerNo_D)this);
	}

	/**
	 * [VerNo]ブロックのTableの設定
	 */
	protected static void setTableConfigVerNo(MAUBP_VerNo_D p) {
		p.columnVerNo_ver_no.setMeta(mcframe.clientMAUB.MAUBP5250.VerNoR.ver_no_META);
		p.VerNoTable.addColumnConfig(p.columnVerNo_ver_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnVerNo_ver_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnVerNo_ver_no.getListConfig().setPutter(getVerNo_ver_no_ListPutter());
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
	 * [VerNo_ver_no_ListPutter]の作成
	 */
	protected MCListPutter createVerNo_ver_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmVer");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnVerNo_ver_no) return getVerNo_ver_no(row, info);
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
		if (vc == VerNoTable) return doVerNo_VC(info);
		if (vc == columnVerNo_ver_no) return doVerNo_ver_no_VC(info);
		return true;
	}

	/**
	 * [VerNo]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVerNo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [VerNo]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVerNo_ver_no_VC(MCEventInfo info){
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
		if (nc == VerNoTable) doVerNo_NC(info);
		else if (nc == columnVerNo_ver_no) doVerNo_ver_no_NC(info);
	}

	/**
	 * [VerNo]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_NC(MCEventInfo info){
	}

	/**
	 * [VerNo]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_ver_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == VerNoTable) doVerNo_NE(info);
		else if (ne == columnVerNo_ver_no) doVerNo_ver_no_NE(info);
	}

	/**
	 * [VerNo]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_NE(MCEventInfo info){
	}

	/**
	 * [VerNo]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_ver_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == VerNoTable) doVerNo_NX(info);
		else if (nx == columnVerNo_ver_no) doVerNo_ver_no_NX(info);
	}

	/**
	 * [VerNo]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_NX(MCEventInfo info){
	}

	/**
	 * [VerNo]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_ver_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnVerNo_ver_no) doVerNo_ver_no_LC(info);
	}

	/**
	 * [VerNo]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doVerNo_ver_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}