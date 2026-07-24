package mcframe.clientMAUB.MAUBP0050;

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
 * 画面"MAUBP_Qty_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Qty_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Qty]ブロック関連のField定義
	public MCPanel QtyPanel = null;
	// [Qty]ブロックの項目のField定義
	public MCLabel Qty_qty_Label = null;
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumberField Qty_qty = null;
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
	
	/** [Qty]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0050.QtyR aQtyR;

	/**
	 * 項目コピーによってaQtyRを設定します。
	 *
	 * aQtyRのインスタンスは変更されません。
	 *
	 * @param row QtyR
	 */
	public void setQtyR(mcframe.clientMAUB.MAUBP0050.QtyR row) {
		if (row != null) {
			MCRow.copyall(getQtyR(), row);
		}
	}

	/**
	 * [Qty]ブロックのコンテナaQtyRを返します。
	 *
	 * @return QtyR
	 */
	public mcframe.clientMAUB.MAUBP0050.QtyR getQtyR() {
		return aQtyR;
	}

	/**
	 * aQtyRを作成します。
	 *
	 * @return QtyR
	 */
	public mcframe.clientMAUB.MAUBP0050.QtyR createQtyR() {
		return mcframe.clientMAUB.MAUBP0050.QtyR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getQtyR())) ret.add(getQtyR());
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
		if(aCnt == getQtyR()) return "Qty";
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
		if(bId.equals("Qty")) return getQtyR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(QtyPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Qty_H_MC_A() {
		aQtyR = createQtyR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Qty_H_MC_A(mcframe.clientMAUB.MAUBP0050.QtyR row){
		aQtyR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Qty_H_MC.jbCreateQty((MAUBP_Qty_H)this);
	}

	/**
	 * [Qty]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateQty(MAUBP_Qty_H p) {
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
	public static MAUBP_Qty_H create(mcframe.clientMAUB.MAUBP0050.QtyR row){
		MAUBP_Qty_H p = new MAUBP_Qty_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Qty_H create(){
		MAUBP_Qty_H p = new MAUBP_Qty_H();
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
		MAUBP_Qty_H_MC.jbfInitQty((MAUBP_Qty_H)this);
		MAUBP_Qty_H_MC.jbInitQty((MAUBP_Qty_H)this);
	}

	/**
	 * [Qty]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitQty(MAUBP_Qty_H p) {
		// ブロック関連の初期化
		p.QtyPanel = p.beansFactory.createPanel("Qty");
		// ブロックの項目の初期化
		p.Qty_qty_Label = p.beansFactory.createLabel("Qty.qty_Label");
		p.Qty_qty = p.beansFactory.createNumberField("Qty.qty");
		p.Qty_qty.setLabel(p.Qty_qty_Label);
	}

	/**
	 * [Qty]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitQty(MAUBP_Qty_H p) {
		// ブロック関連の初期化
		p.add(p.QtyPanel);
		p.setLastBeans(p.QtyPanel);
		// ブロックの項目の初期化
		p.QtyPanel.add(p.Qty_qty_Label);
		p.QtyPanel.add(p.Qty_qty);
		p.QtyPanel.setLastBeans(p.Qty_qty);
		p.Qty_qty.setRow(p.getQtyR(), mcframe.clientMAUB.MAUBP0050.QtyR.qty_META);
		p.Qty_qty.setMinusEnable(true);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Qty_H_MC.mcInitQty((MAUBP_Qty_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Qty_H_MC.statusInitENABLE_Qty((MAUBP_Qty_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Qty_H_MC.statusInitDISABLE_Qty((MAUBP_Qty_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Qty_H_MC.statusInitREAD__ONLY_Qty((MAUBP_Qty_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Qty_H_MC.statusInitREQUIRED_Qty((MAUBP_Qty_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Qty_H_MC.statusInitINVISIBLE_Qty((MAUBP_Qty_H)this);

	}

	/**
	 *  [Qty]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitQty(MAUBP_Qty_H p) {
		p.Qty_qty.setListListener(p);
		p.Qty_qty.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Qty]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Qty(MAUBP_Qty_H p){
		p.Qty_qty.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Qty]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Qty(MAUBP_Qty_H p){
		p.Qty_qty.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Qty]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Qty(MAUBP_Qty_H p){
		p.Qty_qty.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Qty]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Qty(MAUBP_Qty_H p){
		p.Qty_qty.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Qty]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Qty(MAUBP_Qty_H p){
		p.Qty_qty.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == Qty_qty) return doQty_qty_VC(info);
		return true;
	}

	/**
	 * [Qty]パネルの[qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doQty_qty_VC(MCEventInfo info){
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
		if (nc == Qty_qty) doQty_qty_NC(info);
	}

	/**
	 * [Qty]パネルの[qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQty_qty_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Qty_qty) doQty_qty_NE(info);
	}

	/**
	 * [Qty]パネルの[qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQty_qty_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Qty_qty) doQty_qty_NX(info);
	}

	/**
	 * [Qty]パネルの[qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQty_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Qty_qty) doQty_qty_LC(info);
	}

	/**
	 * [Qty]パネルの[qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doQty_qty_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}