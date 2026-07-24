package mcframe.clientMSUB.MSUBP0010;

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
 * 画面"MSUBP_WrkNo_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_WrkNo_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MSUBP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [WrkNo]ブロック関連のField定義
	public MCPanel WrkNoPanel = null;
	// [WrkNo]ブロックの項目のField定義
	public MCLabel WrkNo_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField WrkNo_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField WrkNo_wrk_nm = null;
	/** [ENABLE_SRCH]モードを表す定数 */
	public static final String ENABLE_SRCH = "ENABLE_SRCH";
	/** [ENABLE_FREE]モードを表す定数 */
	public static final String ENABLE_FREE = "ENABLE_FREE";
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
	public static final String[] statusArray = new String[]{ENABLE_SRCH, ENABLE_FREE, ENABLE, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [WrkNo]ブロックのコンテナField定義 */
	private final mcframe.clientMSUB.MSUBP0010.WrkNoR aWrkNoR;

	/**
	 * 項目コピーによってaWrkNoRを設定します。
	 *
	 * aWrkNoRのインスタンスは変更されません。
	 *
	 * @param row WrkNoR
	 */
	public void setWrkNoR(mcframe.clientMSUB.MSUBP0010.WrkNoR row) {
		if (row != null) {
			MCRow.copyall(getWrkNoR(), row);
		}
	}

	/**
	 * [WrkNo]ブロックのコンテナaWrkNoRを返します。
	 *
	 * @return WrkNoR
	 */
	public mcframe.clientMSUB.MSUBP0010.WrkNoR getWrkNoR() {
		return aWrkNoR;
	}

	/**
	 * aWrkNoRを作成します。
	 *
	 * @return WrkNoR
	 */
	public mcframe.clientMSUB.MSUBP0010.WrkNoR createWrkNoR() {
		return mcframe.clientMSUB.MSUBP0010.WrkNoR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getWrkNoR())) ret.add(getWrkNoR());
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
		if(aCnt == getWrkNoR()) return "WrkNo";
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
		if(bId.equals("WrkNo")) return getWrkNoR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(WrkNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_WrkNo_H_MC_A() {
		aWrkNoR = createWrkNoR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSUBP_WrkNo_H_MC_A(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		aWrkNoR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_WrkNo_H_MC.jbCreateWrkNo((MSUBP_WrkNo_H)this);
	}

	/**
	 * [WrkNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrkNo(MSUBP_WrkNo_H p) {
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

	
	/** [WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter WrkNo_wrk_no_p = null;

	/**
	 * [WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getWrkNo_wrk_no_ListPutter() {
		if (WrkNo_wrk_no_p == null) {
			WrkNo_wrk_no_p = createWrkNo_wrk_no_ListPutter(WrkNo_wrk_no, "wrk_no", "wrk_nm");

		}
		return WrkNo_wrk_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MSUBP_WrkNo_H create(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		MSUBP_WrkNo_H p = new MSUBP_WrkNo_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_WrkNo_H create(){
		MSUBP_WrkNo_H p = new MSUBP_WrkNo_H();
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
		MSUBP_WrkNo_H_MC.jbfInitWrkNo((MSUBP_WrkNo_H)this);
		MSUBP_WrkNo_H_MC.jbInitWrkNo((MSUBP_WrkNo_H)this);
	}

	/**
	 * [WrkNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrkNo(MSUBP_WrkNo_H p) {
		// ブロック関連の初期化
		p.WrkNoPanel = p.beansFactory.createPanel("WrkNo");
		// ブロックの項目の初期化
		p.WrkNo_wrk_no_Label = p.beansFactory.createLabel("WrkNo.wrk_no_Label");
		p.WrkNo_wrk_no = p.beansFactory.createTextField("WrkNo.wrk_no");
		p.WrkNo_wrk_no.setLabel(p.WrkNo_wrk_no_Label);
		p.WrkNo_wrk_nm = p.beansFactory.createTextField("WrkNo.wrk_nm");
	}

	/**
	 * [WrkNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrkNo(MSUBP_WrkNo_H p) {
		// ブロック関連の初期化
		p.add(p.WrkNoPanel);
		p.setLastBeans(p.WrkNoPanel);
		// ブロックの項目の初期化
		p.WrkNoPanel.add(p.WrkNo_wrk_no_Label);
		p.WrkNoPanel.add(p.WrkNo_wrk_no);
		p.WrkNoPanel.setLastBeans(p.WrkNo_wrk_no);
		p.WrkNo_wrk_no.setNextBeans(p.WrkNo_wrk_nm);
		p.WrkNo_wrk_no.setRow(p.getWrkNoR(), mcframe.clientMSUB.MSUBP0010.WrkNoR.wrk_no_META);
		p.WrkNo_wrk_no.addLinkBeans(p.WrkNo_wrk_nm);
		p.WrkNo_wrk_no.setListType(MCListType.STRICT);
		p.WrkNoPanel.add(p.WrkNo_wrk_nm);
		p.WrkNo_wrk_nm.setRow(p.getWrkNoR(), mcframe.clientMSUB.MSUBP0010.WrkNoR.wrk_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_WrkNo_H_MC.mcInitWrkNo((MSUBP_WrkNo_H)this);

		// [ENABLE_SRCH]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitENABLE__SRCH_WrkNo((MSUBP_WrkNo_H)this);

		// [ENABLE_FREE]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitENABLE__FREE_WrkNo((MSUBP_WrkNo_H)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitENABLE_WrkNo((MSUBP_WrkNo_H)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitDISABLE_WrkNo((MSUBP_WrkNo_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitREAD__ONLY_WrkNo((MSUBP_WrkNo_H)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitREQUIRED_WrkNo((MSUBP_WrkNo_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_WrkNo_H_MC.statusInitINVISIBLE_WrkNo((MSUBP_WrkNo_H)this);

	}

	/**
	 *  [WrkNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrkNo(MSUBP_WrkNo_H p) {
		p.WrkNo_wrk_no.setListListener(p);
		p.WrkNo_wrk_no.addAllListener(p);
		p.WrkNo_wrk_nm.setListListener(p);
		p.WrkNo_wrk_nm.addAllListener(p);
	}

	/**
	 * [ENABLE_SRCH]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE__SRCH_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.WrkNo_wrk_nm.putMode(p, ENABLE_SRCH, MCMode.ENABLE);

	}

	/**
	 * [ENABLE_FREE]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE__FREE_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, ENABLE_FREE, MCMode.ENABLE);
		p.WrkNo_wrk_nm.putMode(p, ENABLE_FREE, MCMode.READ_ONLY);

	}

	/**
	 * [ENABLE]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.WrkNo_wrk_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.WrkNo_wrk_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.WrkNo_wrk_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.WrkNo_wrk_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[WrkNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_WrkNo(MSUBP_WrkNo_H p){
		p.WrkNo_wrk_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.WrkNo_wrk_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		WrkNo_wrk_no.getListConfig().setPutter(getWrkNo_wrk_no_ListPutter());
	}

	/**
	 * この画面を[ENABLE_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLE_SRCHStatus() {
		status = ENABLE_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[ENABLE_FREE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLE_FREEStatus() {
		status = ENABLE_FREE;
		setAllStatus(status);
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
		if (ENABLE_SRCH.equals(status)) {
			setENABLE_SRCHStatus();
		}
		else if (ENABLE_FREE.equals(status)) {
			setENABLE_FREEStatus();
		}
		else if (ENABLE.equals(status)) {
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
	 * [WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createWrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == WrkNo_wrk_no) return getWrkNo_wrk_no(row, info);
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
		if (vc == WrkNo_wrk_no) return doWrkNo_wrk_no_VC(info);
		if (vc == WrkNo_wrk_nm) return doWrkNo_wrk_nm_VC(info);
		return true;
	}

	/**
	 * [WrkNo]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrkNo_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [WrkNo]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrkNo_wrk_nm_VC(MCEventInfo info){
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
		if (nc == WrkNo_wrk_no) doWrkNo_wrk_no_NC(info);
		else if (nc == WrkNo_wrk_nm) doWrkNo_wrk_nm_NC(info);
	}

	/**
	 * [WrkNo]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [WrkNo]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == WrkNo_wrk_no) doWrkNo_wrk_no_NE(info);
		else if (ne == WrkNo_wrk_nm) doWrkNo_wrk_nm_NE(info);
	}

	/**
	 * [WrkNo]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [WrkNo]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == WrkNo_wrk_no) doWrkNo_wrk_no_NX(info);
		else if (nx == WrkNo_wrk_nm) doWrkNo_wrk_nm_NX(info);
	}

	/**
	 * [WrkNo]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [WrkNo]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == WrkNo_wrk_no) doWrkNo_wrk_no_LC(info);
		else if (lc == WrkNo_wrk_nm) doWrkNo_wrk_nm_LC(info);
	}

	/**
	 * [WrkNo]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [WrkNo]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrkNo_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getWrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}