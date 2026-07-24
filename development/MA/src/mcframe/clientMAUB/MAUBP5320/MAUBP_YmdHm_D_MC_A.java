package mcframe.clientMAUB.MAUBP5320;

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
 * 画面"MAUBP_YmdHm_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_YmdHm_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5320";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [YmdHm]ブロック関連のField定義
	public MCPanel YmdHmPanel = null;
	public MCScrollPane YmdHmScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5320.YmdHmR> YmdHmTable = null;
	// [YmdHm]ブロックの項目のField定義
	/**
	 * Date 日付.<p>
	 *
	 */
	public MCColumnConfig columnYmdHm_ymd = null;
	/**
	 * Time 時刻.<p>
	 *
	 */
	public MCColumnConfig columnYmdHm_hm = null;
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
	
	/** [YmdHm]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5320.YmdHmR> aYmdHmL;

	/**
	 * コピーによってaYmdHmLを設定します。
	 *
	 * aYmdHmLのインスタンスは変更されません。
	 *
	 * @param dataset YmdHmL
	 */
	public void setYmdHmL(MCList<mcframe.clientMAUB.MAUBP5320.YmdHmR> aList) {
		if (getYmdHmL() != aList) {
			getYmdHmL().setAll(aList);
		}
	}

	/**
	 * [YmdHm]ブロックのコンテナaYmdHmLを返します。
	 *
	 * @return YmdHmL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5320.YmdHmR> getYmdHmL() {
		return aYmdHmL;
	}

	/**
	 * aYmdHmRを作成します。
	 *
	 * @return YmdHmR
	 */
	public mcframe.clientMAUB.MAUBP5320.YmdHmR createYmdHmR() {
		return mcframe.clientMAUB.MAUBP5320.YmdHmR.create();
	}

	/**
	 * aYmdHmLを作成します。
	 *
	 * @return YmdHmL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5320.YmdHmR> createYmdHmL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	}

	/**
	 * YmdHmTableを初期化します。
	 */
	protected void createYmdHmTable(){
		if(YmdHmTable == null){
			YmdHmTable = beansFactory.createTable2("YmdHm.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getYmdHmL())) ret.add(getYmdHmL());
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
		if(aCnt == getYmdHmL()) return "YmdHm";
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
		if(bId.equals("YmdHm")) return getYmdHmL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(YmdHmPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_YmdHm_D_MC_A() {
		aYmdHmL = createYmdHmL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_YmdHm_D_MC_A(String name) {
		aYmdHmL = createYmdHmL();
		createYmdHmTable();
		YmdHmTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_YmdHm_D_MC.jbCreateYmdHm((MAUBP_YmdHm_D)this);
	}

	/**
	 * [YmdHm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateYmdHm(MAUBP_YmdHm_D p) {
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
	public static MAUBP_YmdHm_D create(){
		MAUBP_YmdHm_D p = new MAUBP_YmdHm_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_YmdHm_D create(String name){
		MAUBP_YmdHm_D p = new MAUBP_YmdHm_D(name);
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
		MAUBP_YmdHm_D_MC.jbfInitYmdHm((MAUBP_YmdHm_D)this);
		MAUBP_YmdHm_D_MC.jbInitYmdHm((MAUBP_YmdHm_D)this);
	}

	/**
	 * [YmdHm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitYmdHm(MAUBP_YmdHm_D p) {
		// ブロック関連の初期化
		p.YmdHmPanel = p.beansFactory.createPanel("YmdHm");
		p.YmdHmScrollPane = p.beansFactory.createScrollPane("YmdHm.scroll");
		p.createYmdHmTable();
		// ブロックの項目の初期化
		p.columnYmdHm_ymd = p.beansFactory.createTableColumn("YmdHm.ymd", MCColumnType.DATE);
		p.columnYmdHm_hm = p.beansFactory.createTableColumn("YmdHm.hm", MCColumnType.DATE);
	}

	/**
	 * [YmdHm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitYmdHm(MAUBP_YmdHm_D p) {
		// ブロック関連の初期化
		p.add(p.YmdHmPanel);
		p.setLastBeans(p.YmdHmPanel);
		p.YmdHmPanel.add(p.YmdHmScrollPane);
		p.YmdHmPanel.setLastBeans(p.YmdHmTable);
		p.YmdHmScrollPane.setViewportView(p.YmdHmTable);
		p.YmdHmTable.setList(p.getYmdHmL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_YmdHm_D_MC.mcInitYmdHm((MAUBP_YmdHm_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_YmdHm_D_MC.statusInitENABLE_YmdHm((MAUBP_YmdHm_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_YmdHm_D_MC.statusInitDISABLE_YmdHm((MAUBP_YmdHm_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_YmdHm_D_MC.statusInitREAD__ONLY_YmdHm((MAUBP_YmdHm_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_YmdHm_D_MC.statusInitREQUIRED_YmdHm((MAUBP_YmdHm_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_YmdHm_D_MC.statusInitINVISIBLE_YmdHm((MAUBP_YmdHm_D)this);

	}

	/**
	 *  [YmdHm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitYmdHm(MAUBP_YmdHm_D p) {
		p.YmdHmTable.addAllListener(p);
		p.columnYmdHm_ymd.addAllListener(p);
		p.columnYmdHm_ymd.setListListener(p);
		p.columnYmdHm_hm.addAllListener(p);
		p.columnYmdHm_hm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_YmdHm(MAUBP_YmdHm_D p){
		p.columnYmdHm_ymd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnYmdHm_hm.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_YmdHm(MAUBP_YmdHm_D p){
		p.columnYmdHm_ymd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnYmdHm_hm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_YmdHm(MAUBP_YmdHm_D p){
		p.columnYmdHm_ymd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnYmdHm_hm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_YmdHm(MAUBP_YmdHm_D p){
		p.columnYmdHm_ymd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnYmdHm_hm.putMode(p, REQUIRED, MCMode.ENABLE);

	}

	/**
	 * [INVISIBLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_YmdHm(MAUBP_YmdHm_D p){
		p.columnYmdHm_ymd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnYmdHm_hm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_YmdHm_D_MC.setTableConfigYmdHm((MAUBP_YmdHm_D)this);
	}

	/**
	 * [YmdHm]ブロックのTableの設定
	 */
	protected static void setTableConfigYmdHm(MAUBP_YmdHm_D p) {
		p.columnYmdHm_ymd.setMeta(mcframe.clientMAUB.MAUBP5320.YmdHmR.ymd_META);
		p.columnYmdHm_ymd.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.YmdHmTable.addColumnConfig(p.columnYmdHm_ymd);
		p.columnYmdHm_hm.setMeta(mcframe.clientMAUB.MAUBP5320.YmdHmR.hm_META);
		p.columnYmdHm_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.YmdHmTable.addColumnConfig(p.columnYmdHm_hm);
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
		if (vc == YmdHmTable) return doYmdHm_VC(info);
		if (vc == columnYmdHm_ymd) return doYmdHm_ymd_VC(info);
		if (vc == columnYmdHm_hm) return doYmdHm_hm_VC(info);
		return true;
	}

	/**
	 * [YmdHm]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHm]パネルの[ymd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHm_ymd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHm]パネルの[hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHm_hm_VC(MCEventInfo info){
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
		if (nc == YmdHmTable) doYmdHm_NC(info);
		else if (nc == columnYmdHm_ymd) doYmdHm_ymd_NC(info);
		else if (nc == columnYmdHm_hm) doYmdHm_hm_NC(info);
	}

	/**
	 * [YmdHm]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_NC(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[ymd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_ymd_NC(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_hm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == YmdHmTable) doYmdHm_NE(info);
		else if (ne == columnYmdHm_ymd) doYmdHm_ymd_NE(info);
		else if (ne == columnYmdHm_hm) doYmdHm_hm_NE(info);
	}

	/**
	 * [YmdHm]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_NE(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[ymd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_ymd_NE(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_hm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == YmdHmTable) doYmdHm_NX(info);
		else if (nx == columnYmdHm_ymd) doYmdHm_ymd_NX(info);
		else if (nx == columnYmdHm_hm) doYmdHm_hm_NX(info);
	}

	/**
	 * [YmdHm]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_NX(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[ymd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_ymd_NX(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_hm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnYmdHm_ymd) doYmdHm_ymd_LC(info);
		else if (lc == columnYmdHm_hm) doYmdHm_hm_LC(info);
	}

	/**
	 * [YmdHm]パネルの[ymd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_ymd_LC(MCEventInfo info){
	}

	/**
	 * [YmdHm]パネルの[hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHm_hm_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}