package mcframe.clientMAUB.MAUBP5010;

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
 * 画面"MAUBP_StDt_EndDt_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_StDt_EndDt_D_MC_A extends mcframe.clientMAUD.MAUDP1050.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Dt]ブロック関連のField定義
	public MCPanel DtPanel = null;
	public MCScrollPane DtScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5010.DtR> DtTable = null;
	// [Dt]ブロックの項目のField定義
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCColumnConfig columnDt_st_dt_key = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnDt_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnDt_end_dt = null;
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
	
	/** [Dt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5010.DtR> aDtL;

	/**
	 * コピーによってaDtLを設定します。
	 *
	 * aDtLのインスタンスは変更されません。
	 *
	 * @param dataset DtL
	 */
	public void setDtL(MCList<mcframe.clientMAUB.MAUBP5010.DtR> aList) {
		if (getDtL() != aList) {
			getDtL().setAll(aList);
		}
	}

	/**
	 * [Dt]ブロックのコンテナaDtLを返します。
	 *
	 * @return DtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5010.DtR> getDtL() {
		return aDtL;
	}

	/**
	 * aDtRを作成します。
	 *
	 * @return DtR
	 */
	public mcframe.clientMAUB.MAUBP5010.DtR createDtR() {
		return mcframe.clientMAUB.MAUBP5010.DtR.create();
	}

	/**
	 * aDtLを作成します。
	 *
	 * @return DtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5010.DtR> createDtL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5010.DtR.class);
	}

	/**
	 * DtTableを初期化します。
	 */
	protected void createDtTable(){
		if(DtTable == null){
			DtTable = beansFactory.createTable2("Dt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getDtL())) ret.add(getDtL());
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
		if(aCnt == getDtL()) return "Dt";
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
		if(bId.equals("Dt")) return getDtL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(DtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StDt_EndDt_D_MC_A() {
		aDtL = createDtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_StDt_EndDt_D_MC_A(String name) {
		aDtL = createDtL();
		createDtTable();
		DtTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_StDt_EndDt_D_MC.jbCreateDt((MAUBP_StDt_EndDt_D)this);
	}

	/**
	 * [Dt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDt(MAUBP_StDt_EndDt_D p) {
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
	public static MAUBP_StDt_EndDt_D create(){
		MAUBP_StDt_EndDt_D p = new MAUBP_StDt_EndDt_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_StDt_EndDt_D create(String name){
		MAUBP_StDt_EndDt_D p = new MAUBP_StDt_EndDt_D(name);
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
		MAUBP_StDt_EndDt_D_MC.jbfInitDt((MAUBP_StDt_EndDt_D)this);
		MAUBP_StDt_EndDt_D_MC.jbInitDt((MAUBP_StDt_EndDt_D)this);
	}

	/**
	 * [Dt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDt(MAUBP_StDt_EndDt_D p) {
		// ブロック関連の初期化
		p.DtPanel = p.beansFactory.createPanel("Dt");
		p.DtScrollPane = p.beansFactory.createScrollPane("Dt.scroll");
		p.createDtTable();
		// ブロックの項目の初期化
		p.columnDt_st_dt_key = p.beansFactory.createTableColumn("Dt.st_dt_key", MCColumnType.DATE);
		p.columnDt_st_dt = p.beansFactory.createTableColumn("Dt.st_dt", MCColumnType.DATE);
		p.columnDt_end_dt = p.beansFactory.createTableColumn("Dt.end_dt", MCColumnType.DATE);
	}

	/**
	 * [Dt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDt(MAUBP_StDt_EndDt_D p) {
		// ブロック関連の初期化
		p.add(p.DtPanel);
		p.setLastBeans(p.DtPanel);
		p.DtPanel.add(p.DtScrollPane);
		p.DtPanel.setLastBeans(p.DtTable);
		p.DtScrollPane.setViewportView(p.DtTable);
		p.DtTable.setList(p.getDtL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_StDt_EndDt_D_MC.mcInitDt((MAUBP_StDt_EndDt_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_StDt_EndDt_D_MC.statusInitENABLE_Dt((MAUBP_StDt_EndDt_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_StDt_EndDt_D_MC.statusInitDISABLE_Dt((MAUBP_StDt_EndDt_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_StDt_EndDt_D_MC.statusInitREAD__ONLY_Dt((MAUBP_StDt_EndDt_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_StDt_EndDt_D_MC.statusInitREQUIRED_Dt((MAUBP_StDt_EndDt_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_StDt_EndDt_D_MC.statusInitINVISIBLE_Dt((MAUBP_StDt_EndDt_D)this);

	}

	/**
	 *  [Dt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDt(MAUBP_StDt_EndDt_D p) {
		p.DtTable.addAllListener(p);
		p.columnDt_st_dt_key.addAllListener(p);
		p.columnDt_st_dt_key.setListListener(p);
		p.columnDt_st_dt.addAllListener(p);
		p.columnDt_st_dt.setListListener(p);
		p.columnDt_end_dt.addAllListener(p);
		p.columnDt_end_dt.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Dt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Dt(MAUBP_StDt_EndDt_D p){
		p.columnDt_st_dt_key.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnDt_st_dt.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnDt_end_dt.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Dt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Dt(MAUBP_StDt_EndDt_D p){
		p.columnDt_st_dt_key.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnDt_st_dt.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnDt_end_dt.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Dt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Dt(MAUBP_StDt_EndDt_D p){
		p.columnDt_st_dt_key.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnDt_st_dt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnDt_end_dt.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Dt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Dt(MAUBP_StDt_EndDt_D p){
		p.columnDt_st_dt_key.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnDt_st_dt.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnDt_end_dt.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Dt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Dt(MAUBP_StDt_EndDt_D p){
		p.columnDt_st_dt_key.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnDt_st_dt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnDt_end_dt.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_StDt_EndDt_D_MC.setTableConfigDt((MAUBP_StDt_EndDt_D)this);
	}

	/**
	 * [Dt]ブロックのTableの設定
	 */
	protected static void setTableConfigDt(MAUBP_StDt_EndDt_D p) {
		p.columnDt_st_dt_key.setMeta(mcframe.clientMAUB.MAUBP5010.DtR.st_dt_key_META);
		p.columnDt_st_dt_key.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtTable.addColumnConfig(p.columnDt_st_dt_key);
		p.columnDt_st_dt.setMeta(mcframe.clientMAUB.MAUBP5010.DtR.st_dt_META);
		p.columnDt_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtTable.addColumnConfig(p.columnDt_st_dt);
		p.columnDt_end_dt.setMeta(mcframe.clientMAUB.MAUBP5010.DtR.end_dt_META);
		p.columnDt_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtTable.addColumnConfig(p.columnDt_end_dt);
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
		if (vc == DtTable) return doDt_VC(info);
		if (vc == columnDt_st_dt_key) return doDt_st_dt_key_VC(info);
		if (vc == columnDt_st_dt) return doDt_st_dt_VC(info);
		if (vc == columnDt_end_dt) return doDt_end_dt_VC(info);
		return true;
	}

	/**
	 * [Dt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dt]パネルの[st_dt_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDt_st_dt_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dt]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDt_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dt]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDt_end_dt_VC(MCEventInfo info){
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
		if (nc == DtTable) doDt_NC(info);
		else if (nc == columnDt_st_dt_key) doDt_st_dt_key_NC(info);
		else if (nc == columnDt_st_dt) doDt_st_dt_NC(info);
		else if (nc == columnDt_end_dt) doDt_end_dt_NC(info);
	}

	/**
	 * [Dt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_NC(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_key_NC(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_end_dt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtTable) doDt_NE(info);
		else if (ne == columnDt_st_dt_key) doDt_st_dt_key_NE(info);
		else if (ne == columnDt_st_dt) doDt_st_dt_NE(info);
		else if (ne == columnDt_end_dt) doDt_end_dt_NE(info);
	}

	/**
	 * [Dt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_NE(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_key_NE(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_end_dt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtTable) doDt_NX(info);
		else if (nx == columnDt_st_dt_key) doDt_st_dt_key_NX(info);
		else if (nx == columnDt_st_dt) doDt_st_dt_NX(info);
		else if (nx == columnDt_end_dt) doDt_end_dt_NX(info);
	}

	/**
	 * [Dt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_NX(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_key_NX(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_end_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDt_st_dt_key) doDt_st_dt_key_LC(info);
		else if (lc == columnDt_st_dt) doDt_st_dt_LC(info);
		else if (lc == columnDt_end_dt) doDt_end_dt_LC(info);
	}

	/**
	 * [Dt]パネルの[st_dt_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_key_LC(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dt]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDt_end_dt_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}