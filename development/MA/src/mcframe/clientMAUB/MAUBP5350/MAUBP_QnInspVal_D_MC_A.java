package mcframe.clientMAUB.MAUBP5350;

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
 * 画面"MAUBP_QnInspVal_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_QnInspVal_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5350";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [QnInspVal]ブロック関連のField定義
	public MCPanel QnInspValPanel = null;
	public MCScrollPane QnInspValScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5350.QnInspValR> QnInspValTable = null;
	// [QnInspVal]ブロックの項目のField定義
	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public MCColumnConfig columnQnInspVal_qn_insp_val = null;
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
	
	/** [QnInspVal]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5350.QnInspValR> aQnInspValL;

	/**
	 * コピーによってaQnInspValLを設定します。
	 *
	 * aQnInspValLのインスタンスは変更されません。
	 *
	 * @param dataset QnInspValL
	 */
	public void setQnInspValL(MCList<mcframe.clientMAUB.MAUBP5350.QnInspValR> aList) {
		if (getQnInspValL() != aList) {
			getQnInspValL().setAll(aList);
		}
	}

	/**
	 * [QnInspVal]ブロックのコンテナaQnInspValLを返します。
	 *
	 * @return QnInspValL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5350.QnInspValR> getQnInspValL() {
		return aQnInspValL;
	}

	/**
	 * aQnInspValRを作成します。
	 *
	 * @return QnInspValR
	 */
	public mcframe.clientMAUB.MAUBP5350.QnInspValR createQnInspValR() {
		return mcframe.clientMAUB.MAUBP5350.QnInspValR.create();
	}

	/**
	 * aQnInspValLを作成します。
	 *
	 * @return QnInspValL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5350.QnInspValR> createQnInspValL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	}

	/**
	 * QnInspValTableを初期化します。
	 */
	protected void createQnInspValTable(){
		if(QnInspValTable == null){
			QnInspValTable = beansFactory.createTable2("QnInspVal.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getQnInspValL())) ret.add(getQnInspValL());
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
		if(aCnt == getQnInspValL()) return "QnInspVal";
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
		if(bId.equals("QnInspVal")) return getQnInspValL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(QnInspValPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_QnInspVal_D_MC_A() {
		aQnInspValL = createQnInspValL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_QnInspVal_D_MC_A(String name) {
		aQnInspValL = createQnInspValL();
		createQnInspValTable();
		QnInspValTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_QnInspVal_D_MC.jbCreateQnInspVal((MAUBP_QnInspVal_D)this);
	}

	/**
	 * [QnInspVal]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateQnInspVal(MAUBP_QnInspVal_D p) {
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
	public static MAUBP_QnInspVal_D create(){
		MAUBP_QnInspVal_D p = new MAUBP_QnInspVal_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_QnInspVal_D create(String name){
		MAUBP_QnInspVal_D p = new MAUBP_QnInspVal_D(name);
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
		MAUBP_QnInspVal_D_MC.jbfInitQnInspVal((MAUBP_QnInspVal_D)this);
		MAUBP_QnInspVal_D_MC.jbInitQnInspVal((MAUBP_QnInspVal_D)this);
	}

	/**
	 * [QnInspVal]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitQnInspVal(MAUBP_QnInspVal_D p) {
		// ブロック関連の初期化
		p.QnInspValPanel = p.beansFactory.createPanel("QnInspVal");
		p.QnInspValScrollPane = p.beansFactory.createScrollPane("QnInspVal.scroll");
		p.createQnInspValTable();
		// ブロックの項目の初期化
		p.columnQnInspVal_qn_insp_val = p.beansFactory.createTableColumn("QnInspVal.qn_insp_val", MCColumnType.NUMBER);
	}

	/**
	 * [QnInspVal]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitQnInspVal(MAUBP_QnInspVal_D p) {
		// ブロック関連の初期化
		p.add(p.QnInspValPanel);
		p.setLastBeans(p.QnInspValPanel);
		p.QnInspValPanel.add(p.QnInspValScrollPane);
		p.QnInspValPanel.setLastBeans(p.QnInspValTable);
		p.QnInspValScrollPane.setViewportView(p.QnInspValTable);
		p.QnInspValTable.setList(p.getQnInspValL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_QnInspVal_D_MC.mcInitQnInspVal((MAUBP_QnInspVal_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_QnInspVal_D_MC.statusInitENABLE_QnInspVal((MAUBP_QnInspVal_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_QnInspVal_D_MC.statusInitDISABLE_QnInspVal((MAUBP_QnInspVal_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_QnInspVal_D_MC.statusInitREAD__ONLY_QnInspVal((MAUBP_QnInspVal_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_QnInspVal_D_MC.statusInitREQUIRED_QnInspVal((MAUBP_QnInspVal_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_QnInspVal_D_MC.statusInitINVISIBLE_QnInspVal((MAUBP_QnInspVal_D)this);

	}

	/**
	 *  [QnInspVal]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitQnInspVal(MAUBP_QnInspVal_D p) {
		p.QnInspValTable.addAllListener(p);
		p.columnQnInspVal_qn_insp_val.addAllListener(p);
		p.columnQnInspVal_qn_insp_val.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[QnInspVal]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_QnInspVal(MAUBP_QnInspVal_D p){
		p.columnQnInspVal_qn_insp_val.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[QnInspVal]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_QnInspVal(MAUBP_QnInspVal_D p){
		p.columnQnInspVal_qn_insp_val.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[QnInspVal]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_QnInspVal(MAUBP_QnInspVal_D p){
		p.columnQnInspVal_qn_insp_val.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[QnInspVal]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_QnInspVal(MAUBP_QnInspVal_D p){
		p.columnQnInspVal_qn_insp_val.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[QnInspVal]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_QnInspVal(MAUBP_QnInspVal_D p){
		p.columnQnInspVal_qn_insp_val.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_QnInspVal_D_MC.setTableConfigQnInspVal((MAUBP_QnInspVal_D)this);
	}

	/**
	 * [QnInspVal]ブロックのTableの設定
	 */
	protected static void setTableConfigQnInspVal(MAUBP_QnInspVal_D p) {
		p.columnQnInspVal_qn_insp_val.setMeta(mcframe.clientMAUB.MAUBP5350.QnInspValR.qn_insp_val_META);
		p.columnQnInspVal_qn_insp_val.setFormatID(mcframe.commonMA.meta.MA_META.QN_INSP_VAL_FORMAT);
		p.QnInspValTable.addColumnConfig(p.columnQnInspVal_qn_insp_val);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
		if (vc == QnInspValTable) return doQnInspVal_VC(info);
		if (vc == columnQnInspVal_qn_insp_val) return doQnInspVal_qn_insp_val_VC(info);
		return true;
	}

	/**
	 * [QnInspVal]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doQnInspVal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [QnInspVal]パネルの[qn_insp_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doQnInspVal_qn_insp_val_VC(MCEventInfo info){
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
		if (nc == QnInspValTable) doQnInspVal_NC(info);
		else if (nc == columnQnInspVal_qn_insp_val) doQnInspVal_qn_insp_val_NC(info);
	}

	/**
	 * [QnInspVal]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_NC(MCEventInfo info){
	}

	/**
	 * [QnInspVal]パネルの[qn_insp_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_qn_insp_val_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == QnInspValTable) doQnInspVal_NE(info);
		else if (ne == columnQnInspVal_qn_insp_val) doQnInspVal_qn_insp_val_NE(info);
	}

	/**
	 * [QnInspVal]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_NE(MCEventInfo info){
	}

	/**
	 * [QnInspVal]パネルの[qn_insp_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_qn_insp_val_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == QnInspValTable) doQnInspVal_NX(info);
		else if (nx == columnQnInspVal_qn_insp_val) doQnInspVal_qn_insp_val_NX(info);
	}

	/**
	 * [QnInspVal]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_NX(MCEventInfo info){
	}

	/**
	 * [QnInspVal]パネルの[qn_insp_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_qn_insp_val_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnQnInspVal_qn_insp_val) doQnInspVal_qn_insp_val_LC(info);
	}

	/**
	 * [QnInspVal]パネルの[qn_insp_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQnInspVal_qn_insp_val_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}