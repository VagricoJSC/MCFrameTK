package mcframe.clientMAUB.MAUBP5310;

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
 * 画面"MAUBP_RtnMsg_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_RtnMsg_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5310";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [RtnMsg]ブロック関連のField定義
	public MCPanel RtnMsgPanel = null;
	public MCScrollPane RtnMsgScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5310.RtnMsgR> RtnMsgTable = null;
	// [RtnMsg]ブロックの項目のField定義
	public MCColumnConfig columnRtnMsg_rtn_sts_typ = null;
	/**
	 * Result 結果.<p>
	 *
	 */
	public MCColumnConfig columnRtnMsg_rtn_sts_typ_nm = null;
	public MCColumnConfig columnRtnMsg_msg_id = null;
	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public MCColumnConfig columnRtnMsg_msg = null;
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
	
	/** [RtnMsg]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5310.RtnMsgR> aRtnMsgL;

	/**
	 * コピーによってaRtnMsgLを設定します。
	 *
	 * aRtnMsgLのインスタンスは変更されません。
	 *
	 * @param dataset RtnMsgL
	 */
	public void setRtnMsgL(MCList<mcframe.clientMAUB.MAUBP5310.RtnMsgR> aList) {
		if (getRtnMsgL() != aList) {
			getRtnMsgL().setAll(aList);
		}
	}

	/**
	 * [RtnMsg]ブロックのコンテナaRtnMsgLを返します。
	 *
	 * @return RtnMsgL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5310.RtnMsgR> getRtnMsgL() {
		return aRtnMsgL;
	}

	/**
	 * aRtnMsgRを作成します。
	 *
	 * @return RtnMsgR
	 */
	public mcframe.clientMAUB.MAUBP5310.RtnMsgR createRtnMsgR() {
		return mcframe.clientMAUB.MAUBP5310.RtnMsgR.create();
	}

	/**
	 * aRtnMsgLを作成します。
	 *
	 * @return RtnMsgL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5310.RtnMsgR> createRtnMsgL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	}

	/**
	 * RtnMsgTableを初期化します。
	 */
	protected void createRtnMsgTable(){
		if(RtnMsgTable == null){
			RtnMsgTable = beansFactory.createTable2("RtnMsg.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getRtnMsgL())) ret.add(getRtnMsgL());
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
		if(aCnt == getRtnMsgL()) return "RtnMsg";
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
		if(bId.equals("RtnMsg")) return getRtnMsgL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(RtnMsgPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_RtnMsg_D_MC_A() {
		aRtnMsgL = createRtnMsgL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_RtnMsg_D_MC_A(String name) {
		aRtnMsgL = createRtnMsgL();
		createRtnMsgTable();
		RtnMsgTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_RtnMsg_D_MC.jbCreateRtnMsg((MAUBP_RtnMsg_D)this);
	}

	/**
	 * [RtnMsg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRtnMsg(MAUBP_RtnMsg_D p) {
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
	public static MAUBP_RtnMsg_D create(){
		MAUBP_RtnMsg_D p = new MAUBP_RtnMsg_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_RtnMsg_D create(String name){
		MAUBP_RtnMsg_D p = new MAUBP_RtnMsg_D(name);
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
		MAUBP_RtnMsg_D_MC.jbfInitRtnMsg((MAUBP_RtnMsg_D)this);
		MAUBP_RtnMsg_D_MC.jbInitRtnMsg((MAUBP_RtnMsg_D)this);
	}

	/**
	 * [RtnMsg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRtnMsg(MAUBP_RtnMsg_D p) {
		// ブロック関連の初期化
		p.RtnMsgPanel = p.beansFactory.createPanel("RtnMsg");
		p.RtnMsgScrollPane = p.beansFactory.createScrollPane("RtnMsg.scroll");
		p.createRtnMsgTable();
		// ブロックの項目の初期化
		p.columnRtnMsg_rtn_sts_typ = p.beansFactory.createTableColumn("RtnMsg.rtn_sts_typ", MCColumnType.TEXT);
		p.columnRtnMsg_rtn_sts_typ_nm = p.beansFactory.createTableColumn("RtnMsg.rtn_sts_typ_nm", MCColumnType.TEXT);
		p.columnRtnMsg_msg_id = p.beansFactory.createTableColumn("RtnMsg.msg_id", MCColumnType.TEXT);
		p.columnRtnMsg_msg = p.beansFactory.createTableColumn("RtnMsg.msg", MCColumnType.TEXT);
	}

	/**
	 * [RtnMsg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRtnMsg(MAUBP_RtnMsg_D p) {
		// ブロック関連の初期化
		p.add(p.RtnMsgPanel);
		p.setLastBeans(p.RtnMsgPanel);
		p.RtnMsgPanel.add(p.RtnMsgScrollPane);
		p.RtnMsgPanel.setLastBeans(p.RtnMsgTable);
		p.RtnMsgScrollPane.setViewportView(p.RtnMsgTable);
		p.RtnMsgTable.setList(p.getRtnMsgL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_RtnMsg_D_MC.mcInitRtnMsg((MAUBP_RtnMsg_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_RtnMsg_D_MC.statusInitENABLE_RtnMsg((MAUBP_RtnMsg_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_RtnMsg_D_MC.statusInitDISABLE_RtnMsg((MAUBP_RtnMsg_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_RtnMsg_D_MC.statusInitREAD__ONLY_RtnMsg((MAUBP_RtnMsg_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_RtnMsg_D_MC.statusInitREQUIRED_RtnMsg((MAUBP_RtnMsg_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_RtnMsg_D_MC.statusInitINVISIBLE_RtnMsg((MAUBP_RtnMsg_D)this);

	}

	/**
	 *  [RtnMsg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRtnMsg(MAUBP_RtnMsg_D p) {
		p.RtnMsgTable.addAllListener(p);
		p.columnRtnMsg_rtn_sts_typ.addAllListener(p);
		p.columnRtnMsg_rtn_sts_typ.setListListener(p);
		p.columnRtnMsg_rtn_sts_typ_nm.addAllListener(p);
		p.columnRtnMsg_rtn_sts_typ_nm.setListListener(p);
		p.columnRtnMsg_msg_id.addAllListener(p);
		p.columnRtnMsg_msg_id.setListListener(p);
		p.columnRtnMsg_msg.addAllListener(p);
		p.columnRtnMsg_msg.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[RtnMsg]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_RtnMsg(MAUBP_RtnMsg_D p){
		p.columnRtnMsg_rtn_sts_typ.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnRtnMsg_rtn_sts_typ_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnRtnMsg_msg_id.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnRtnMsg_msg.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[RtnMsg]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_RtnMsg(MAUBP_RtnMsg_D p){
		p.columnRtnMsg_rtn_sts_typ.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnRtnMsg_rtn_sts_typ_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnRtnMsg_msg_id.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnRtnMsg_msg.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[RtnMsg]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_RtnMsg(MAUBP_RtnMsg_D p){
		p.columnRtnMsg_rtn_sts_typ.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnRtnMsg_rtn_sts_typ_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnRtnMsg_msg_id.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnRtnMsg_msg.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[RtnMsg]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_RtnMsg(MAUBP_RtnMsg_D p){
		p.columnRtnMsg_rtn_sts_typ.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnRtnMsg_rtn_sts_typ_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnRtnMsg_msg_id.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnRtnMsg_msg.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[RtnMsg]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_RtnMsg(MAUBP_RtnMsg_D p){
		p.columnRtnMsg_rtn_sts_typ.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnRtnMsg_rtn_sts_typ_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnRtnMsg_msg_id.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnRtnMsg_msg.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_RtnMsg_D_MC.setTableConfigRtnMsg((MAUBP_RtnMsg_D)this);
	}

	/**
	 * [RtnMsg]ブロックのTableの設定
	 */
	protected static void setTableConfigRtnMsg(MAUBP_RtnMsg_D p) {
		p.columnRtnMsg_rtn_sts_typ.setMeta(mcframe.clientMAUB.MAUBP5310.RtnMsgR.rtn_sts_typ_META);
		p.RtnMsgTable.addColumnConfig(p.columnRtnMsg_rtn_sts_typ);
		p.columnRtnMsg_rtn_sts_typ_nm.setMeta(mcframe.clientMAUB.MAUBP5310.RtnMsgR.rtn_sts_typ_nm_META);
		p.RtnMsgTable.addColumnConfig(p.columnRtnMsg_rtn_sts_typ_nm);
		p.columnRtnMsg_msg_id.setMeta(mcframe.clientMAUB.MAUBP5310.RtnMsgR.msg_id_META);
		p.RtnMsgTable.addColumnConfig(p.columnRtnMsg_msg_id);
		p.columnRtnMsg_msg.setMeta(mcframe.clientMAUB.MAUBP5310.RtnMsgR.msg_META);
		p.RtnMsgTable.addColumnConfig(p.columnRtnMsg_msg);
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
		if (vc == RtnMsgTable) return doRtnMsg_VC(info);
		if (vc == columnRtnMsg_rtn_sts_typ) return doRtnMsg_rtn_sts_typ_VC(info);
		if (vc == columnRtnMsg_rtn_sts_typ_nm) return doRtnMsg_rtn_sts_typ_nm_VC(info);
		if (vc == columnRtnMsg_msg_id) return doRtnMsg_msg_id_VC(info);
		if (vc == columnRtnMsg_msg) return doRtnMsg_msg_VC(info);
		return true;
	}

	/**
	 * [RtnMsg]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRtnMsg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRtnMsg_rtn_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRtnMsg_rtn_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RtnMsg]パネルの[msg_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRtnMsg_msg_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RtnMsg]パネルの[msg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRtnMsg_msg_VC(MCEventInfo info){
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
		if (nc == RtnMsgTable) doRtnMsg_NC(info);
		else if (nc == columnRtnMsg_rtn_sts_typ) doRtnMsg_rtn_sts_typ_NC(info);
		else if (nc == columnRtnMsg_rtn_sts_typ_nm) doRtnMsg_rtn_sts_typ_nm_NC(info);
		else if (nc == columnRtnMsg_msg_id) doRtnMsg_msg_id_NC(info);
		else if (nc == columnRtnMsg_msg) doRtnMsg_msg_NC(info);
	}

	/**
	 * [RtnMsg]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_NC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_id_NC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RtnMsgTable) doRtnMsg_NE(info);
		else if (ne == columnRtnMsg_rtn_sts_typ) doRtnMsg_rtn_sts_typ_NE(info);
		else if (ne == columnRtnMsg_rtn_sts_typ_nm) doRtnMsg_rtn_sts_typ_nm_NE(info);
		else if (ne == columnRtnMsg_msg_id) doRtnMsg_msg_id_NE(info);
		else if (ne == columnRtnMsg_msg) doRtnMsg_msg_NE(info);
	}

	/**
	 * [RtnMsg]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_NE(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_id_NE(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RtnMsgTable) doRtnMsg_NX(info);
		else if (nx == columnRtnMsg_rtn_sts_typ) doRtnMsg_rtn_sts_typ_NX(info);
		else if (nx == columnRtnMsg_rtn_sts_typ_nm) doRtnMsg_rtn_sts_typ_nm_NX(info);
		else if (nx == columnRtnMsg_msg_id) doRtnMsg_msg_id_NX(info);
		else if (nx == columnRtnMsg_msg) doRtnMsg_msg_NX(info);
	}

	/**
	 * [RtnMsg]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_NX(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_id_NX(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRtnMsg_rtn_sts_typ) doRtnMsg_rtn_sts_typ_LC(info);
		else if (lc == columnRtnMsg_rtn_sts_typ_nm) doRtnMsg_rtn_sts_typ_nm_LC(info);
		else if (lc == columnRtnMsg_msg_id) doRtnMsg_msg_id_LC(info);
		else if (lc == columnRtnMsg_msg) doRtnMsg_msg_LC(info);
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[rtn_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_rtn_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_id_LC(MCEventInfo info){
	}

	/**
	 * [RtnMsg]パネルの[msg]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRtnMsg_msg_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}