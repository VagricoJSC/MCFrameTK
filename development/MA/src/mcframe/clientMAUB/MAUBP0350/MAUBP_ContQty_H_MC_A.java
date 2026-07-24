package mcframe.clientMAUB.MAUBP0350;

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
 * 画面"MAUBP_ContQty_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ContQty_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0350";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ContQty]ブロック関連のField定義
	public MCPanel ContQtyPanel = null;
	// [ContQty]ブロックの項目のField定義
	public MCLabel ContQty_cont_qty_Label = null;
	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumberField ContQty_cont_qty = null;
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
	
	/** [ContQty]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0350.ContQtyR aContQtyR;

	/**
	 * 項目コピーによってaContQtyRを設定します。
	 *
	 * aContQtyRのインスタンスは変更されません。
	 *
	 * @param row ContQtyR
	 */
	public void setContQtyR(mcframe.clientMAUB.MAUBP0350.ContQtyR row) {
		if (row != null) {
			MCRow.copyall(getContQtyR(), row);
		}
	}

	/**
	 * [ContQty]ブロックのコンテナaContQtyRを返します。
	 *
	 * @return ContQtyR
	 */
	public mcframe.clientMAUB.MAUBP0350.ContQtyR getContQtyR() {
		return aContQtyR;
	}

	/**
	 * aContQtyRを作成します。
	 *
	 * @return ContQtyR
	 */
	public mcframe.clientMAUB.MAUBP0350.ContQtyR createContQtyR() {
		return mcframe.clientMAUB.MAUBP0350.ContQtyR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getContQtyR())) ret.add(getContQtyR());
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
		if(aCnt == getContQtyR()) return "ContQty";
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
		if(bId.equals("ContQty")) return getContQtyR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ContQtyPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ContQty_H_MC_A() {
		aContQtyR = createContQtyR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_ContQty_H_MC_A(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		aContQtyR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ContQty_H_MC.jbCreateContQty((MAUBP_ContQty_H)this);
	}

	/**
	 * [ContQty]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateContQty(MAUBP_ContQty_H p) {
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
	public static MAUBP_ContQty_H create(mcframe.clientMAUB.MAUBP0350.ContQtyR row){
		MAUBP_ContQty_H p = new MAUBP_ContQty_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ContQty_H create(){
		MAUBP_ContQty_H p = new MAUBP_ContQty_H();
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
		MAUBP_ContQty_H_MC.jbfInitContQty((MAUBP_ContQty_H)this);
		MAUBP_ContQty_H_MC.jbInitContQty((MAUBP_ContQty_H)this);
	}

	/**
	 * [ContQty]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitContQty(MAUBP_ContQty_H p) {
		// ブロック関連の初期化
		p.ContQtyPanel = p.beansFactory.createPanel("ContQty");
		// ブロックの項目の初期化
		p.ContQty_cont_qty_Label = p.beansFactory.createLabel("ContQty.cont_qty_Label");
		p.ContQty_cont_qty = p.beansFactory.createNumberField("ContQty.cont_qty");
		p.ContQty_cont_qty.setLabel(p.ContQty_cont_qty_Label);
	}

	/**
	 * [ContQty]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitContQty(MAUBP_ContQty_H p) {
		// ブロック関連の初期化
		p.add(p.ContQtyPanel);
		p.setLastBeans(p.ContQtyPanel);
		// ブロックの項目の初期化
		p.ContQtyPanel.add(p.ContQty_cont_qty_Label);
		p.ContQtyPanel.add(p.ContQty_cont_qty);
		p.ContQtyPanel.setLastBeans(p.ContQty_cont_qty);
		p.ContQty_cont_qty.setRow(p.getContQtyR(), mcframe.clientMAUB.MAUBP0350.ContQtyR.cont_qty_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ContQty_H_MC.mcInitContQty((MAUBP_ContQty_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ContQty_H_MC.statusInitENABLE_ContQty((MAUBP_ContQty_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ContQty_H_MC.statusInitDISABLE_ContQty((MAUBP_ContQty_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ContQty_H_MC.statusInitREAD__ONLY_ContQty((MAUBP_ContQty_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ContQty_H_MC.statusInitREQUIRED_ContQty((MAUBP_ContQty_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ContQty_H_MC.statusInitINVISIBLE_ContQty((MAUBP_ContQty_H)this);

	}

	/**
	 *  [ContQty]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitContQty(MAUBP_ContQty_H p) {
		p.ContQty_cont_qty.setListListener(p);
		p.ContQty_cont_qty.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ContQty]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ContQty(MAUBP_ContQty_H p){
		p.ContQty_cont_qty.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[ContQty]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ContQty(MAUBP_ContQty_H p){
		p.ContQty_cont_qty.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ContQty]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ContQty(MAUBP_ContQty_H p){
		p.ContQty_cont_qty.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ContQty]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ContQty(MAUBP_ContQty_H p){
		p.ContQty_cont_qty.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[ContQty]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ContQty(MAUBP_ContQty_H p){
		p.ContQty_cont_qty.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == ContQty_cont_qty) return doContQty_cont_qty_VC(info);
		return true;
	}

	/**
	 * [ContQty]パネルの[cont_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContQty_cont_qty_VC(MCEventInfo info){
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
		if (nc == ContQty_cont_qty) doContQty_cont_qty_NC(info);
	}

	/**
	 * [ContQty]パネルの[cont_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContQty_cont_qty_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ContQty_cont_qty) doContQty_cont_qty_NE(info);
	}

	/**
	 * [ContQty]パネルの[cont_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContQty_cont_qty_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ContQty_cont_qty) doContQty_cont_qty_NX(info);
	}

	/**
	 * [ContQty]パネルの[cont_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContQty_cont_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == ContQty_cont_qty) doContQty_cont_qty_LC(info);
	}

	/**
	 * [ContQty]パネルの[cont_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContQty_cont_qty_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}