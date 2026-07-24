package mcframe.clientMSUB.MSUBP0030;

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
 * 画面"MSUBP_LotNo_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_LotNo_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MSUBP0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [LotNo]ブロック関連のField定義
	public MCPanel LotNoPanel = null;
	// [LotNo]ブロックの項目のField定義
	public MCLabel LotNo_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField LotNo_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox LotNo_sublot_no = null;
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
	
	/** [LotNo]ブロックのコンテナField定義 */
	private final mcframe.clientMSUB.MSUBP0030.LotNoR aLotNoR;

	/**
	 * 項目コピーによってaLotNoRを設定します。
	 *
	 * aLotNoRのインスタンスは変更されません。
	 *
	 * @param row LotNoR
	 */
	public void setLotNoR(mcframe.clientMSUB.MSUBP0030.LotNoR row) {
		if (row != null) {
			MCRow.copyall(getLotNoR(), row);
		}
	}

	/**
	 * [LotNo]ブロックのコンテナaLotNoRを返します。
	 *
	 * @return LotNoR
	 */
	public mcframe.clientMSUB.MSUBP0030.LotNoR getLotNoR() {
		return aLotNoR;
	}

	/**
	 * aLotNoRを作成します。
	 *
	 * @return LotNoR
	 */
	public mcframe.clientMSUB.MSUBP0030.LotNoR createLotNoR() {
		return mcframe.clientMSUB.MSUBP0030.LotNoR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getLotNoR())) ret.add(getLotNoR());
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
		if(aCnt == getLotNoR()) return "LotNo";
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
		if(bId.equals("LotNo")) return getLotNoR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(LotNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_LotNo_H_MC_A() {
		aLotNoR = createLotNoR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSUBP_LotNo_H_MC_A(mcframe.clientMSUB.MSUBP0030.LotNoR row){
		aLotNoR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_LotNo_H_MC.jbCreateLotNo((MSUBP_LotNo_H)this);
	}

	/**
	 * [LotNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotNo(MSUBP_LotNo_H p) {
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

	
	/** [LotNo_lot_no_ListPutter]の定義 */
	private MCListPutter LotNo_lot_no_p = null;

	/**
	 * [LotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getLotNo_lot_no_ListPutter() {
		if (LotNo_lot_no_p == null) {
			LotNo_lot_no_p = createLotNo_lot_no_ListPutter(LotNo_lot_no, "lot_no", "sublot_no");

		}
		return LotNo_lot_no_p;
	}
	
	
	/** [LotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter LotNo_sublot_no_p = null;

	/**
	 * [LotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getLotNo_sublot_no_ListPutter() {
		if (LotNo_sublot_no_p == null) {
			LotNo_sublot_no_p = createLotNo_sublot_no_ListPutter(LotNo_sublot_no, "sublot_no");

		}
		return LotNo_sublot_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MSUBP_LotNo_H create(mcframe.clientMSUB.MSUBP0030.LotNoR row){
		MSUBP_LotNo_H p = new MSUBP_LotNo_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_LotNo_H create(){
		MSUBP_LotNo_H p = new MSUBP_LotNo_H();
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
		MSUBP_LotNo_H_MC.jbfInitLotNo((MSUBP_LotNo_H)this);
		MSUBP_LotNo_H_MC.jbInitLotNo((MSUBP_LotNo_H)this);
	}

	/**
	 * [LotNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotNo(MSUBP_LotNo_H p) {
		// ブロック関連の初期化
		p.LotNoPanel = p.beansFactory.createPanel("LotNo");
		// ブロックの項目の初期化
		p.LotNo_lot_no_Label = p.beansFactory.createLabel("LotNo.lot_no_Label");
		p.LotNo_lot_no = p.beansFactory.createTextField("LotNo.lot_no");
		p.LotNo_lot_no.setLabel(p.LotNo_lot_no_Label);
		p.LotNo_sublot_no = p.beansFactory.createTextComboBox("LotNo.sublot_no");
	}

	/**
	 * [LotNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotNo(MSUBP_LotNo_H p) {
		// ブロック関連の初期化
		p.add(p.LotNoPanel);
		p.setLastBeans(p.LotNoPanel);
		// ブロックの項目の初期化
		p.LotNoPanel.add(p.LotNo_lot_no_Label);
		p.LotNoPanel.add(p.LotNo_lot_no);
		p.LotNoPanel.setLastBeans(p.LotNo_lot_no);
		p.LotNo_lot_no.setNextBeans(p.LotNo_sublot_no);
		p.LotNo_lot_no.setRow(p.getLotNoR(), mcframe.clientMSUB.MSUBP0030.LotNoR.lot_no_META);
		p.LotNo_lot_no.addLinkBeans(p.LotNo_sublot_no);
		p.LotNo_lot_no.setListType(MCListType.STRICT);
		p.LotNo_sublot_no.setListType(MCListType.STRICT);
		p.LotNoPanel.add(p.LotNo_sublot_no);
		p.LotNo_sublot_no.setRow(p.getLotNoR(), mcframe.clientMSUB.MSUBP0030.LotNoR.sublot_no_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_LotNo_H_MC.mcInitLotNo((MSUBP_LotNo_H)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_LotNo_H_MC.statusInitENABLE_LotNo((MSUBP_LotNo_H)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_LotNo_H_MC.statusInitDISABLE_LotNo((MSUBP_LotNo_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_LotNo_H_MC.statusInitREAD__ONLY_LotNo((MSUBP_LotNo_H)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_LotNo_H_MC.statusInitREQUIRED_LotNo((MSUBP_LotNo_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_LotNo_H_MC.statusInitINVISIBLE_LotNo((MSUBP_LotNo_H)this);

	}

	/**
	 *  [LotNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotNo(MSUBP_LotNo_H p) {
		p.LotNo_lot_no.setListListener(p);
		p.LotNo_lot_no.addAllListener(p);
		p.LotNo_sublot_no.setListListener(p);
		p.LotNo_sublot_no.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[LotNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_LotNo(MSUBP_LotNo_H p){
		p.LotNo_lot_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.LotNo_sublot_no.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[LotNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_LotNo(MSUBP_LotNo_H p){
		p.LotNo_lot_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.LotNo_sublot_no.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[LotNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_LotNo(MSUBP_LotNo_H p){
		p.LotNo_lot_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.LotNo_sublot_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[LotNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_LotNo(MSUBP_LotNo_H p){
		p.LotNo_lot_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.LotNo_sublot_no.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[LotNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_LotNo(MSUBP_LotNo_H p){
		p.LotNo_lot_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.LotNo_sublot_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		LotNo_lot_no.getListConfig().setPutter(getLotNo_lot_no_ListPutter());
		LotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		LotNo_sublot_no.getListConfig().setPutter(getLotNo_sublot_no_ListPutter());
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
	 * [LotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [LotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == LotNo_lot_no) return getLotNo_lot_no(row, info);
		if(combo == LotNo_sublot_no) return getLotNo_sublot_no(row, info);
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
		if (vc == LotNo_lot_no) return doLotNo_lot_no_VC(info);
		if (vc == LotNo_sublot_no) return doLotNo_sublot_no_VC(info);
		return true;
	}

	/**
	 * [LotNo]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLotNo_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LotNo]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLotNo_sublot_no_VC(MCEventInfo info){
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
		if (nc == LotNo_lot_no) doLotNo_lot_no_NC(info);
		else if (nc == LotNo_sublot_no) doLotNo_sublot_no_NC(info);
	}

	/**
	 * [LotNo]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [LotNo]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == LotNo_lot_no) doLotNo_lot_no_NE(info);
		else if (ne == LotNo_sublot_no) doLotNo_sublot_no_NE(info);
	}

	/**
	 * [LotNo]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [LotNo]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == LotNo_lot_no) doLotNo_lot_no_NX(info);
		else if (nx == LotNo_sublot_no) doLotNo_sublot_no_NX(info);
	}

	/**
	 * [LotNo]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [LotNo]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == LotNo_lot_no) doLotNo_lot_no_LC(info);
		else if (lc == LotNo_sublot_no) doLotNo_sublot_no_LC(info);
	}

	/**
	 * [LotNo]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [LotNo]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLotNo_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[LotNo_lot_no]の作成メソッド
	 */
	public MCList getLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[LotNo_sublot_no]の作成メソッド
	 */
	public MCList getLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}