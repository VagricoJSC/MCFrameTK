package mcframe.clientMAUB.MAUBP0390;

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
 * 画面"MAUBP_PurcContQty_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_PurcContQty_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0390";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [PurcContQty]ブロック関連のField定義
	public MCPanel PurcContQtyPanel = null;
	// [PurcContQty]ブロックの項目のField定義
	public MCLabel PurcContQty_purc_cont_qty_Label = null;
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumberField PurcContQty_purc_cont_qty = null;
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
	
	/** [PurcContQty]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0390.PurcContQtyR aPurcContQtyR;

	/**
	 * 項目コピーによってaPurcContQtyRを設定します。
	 *
	 * aPurcContQtyRのインスタンスは変更されません。
	 *
	 * @param row PurcContQtyR
	 */
	public void setPurcContQtyR(mcframe.clientMAUB.MAUBP0390.PurcContQtyR row) {
		if (row != null) {
			MCRow.copyall(getPurcContQtyR(), row);
		}
	}

	/**
	 * [PurcContQty]ブロックのコンテナaPurcContQtyRを返します。
	 *
	 * @return PurcContQtyR
	 */
	public mcframe.clientMAUB.MAUBP0390.PurcContQtyR getPurcContQtyR() {
		return aPurcContQtyR;
	}

	/**
	 * aPurcContQtyRを作成します。
	 *
	 * @return PurcContQtyR
	 */
	public mcframe.clientMAUB.MAUBP0390.PurcContQtyR createPurcContQtyR() {
		return mcframe.clientMAUB.MAUBP0390.PurcContQtyR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getPurcContQtyR())) ret.add(getPurcContQtyR());
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
		if(aCnt == getPurcContQtyR()) return "PurcContQty";
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
		if(bId.equals("PurcContQty")) return getPurcContQtyR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(PurcContQtyPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_PurcContQty_H_MC_A() {
		aPurcContQtyR = createPurcContQtyR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_PurcContQty_H_MC_A(mcframe.clientMAUB.MAUBP0390.PurcContQtyR row){
		aPurcContQtyR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_PurcContQty_H_MC.jbCreatePurcContQty((MAUBP_PurcContQty_H)this);
	}

	/**
	 * [PurcContQty]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePurcContQty(MAUBP_PurcContQty_H p) {
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
	public static MAUBP_PurcContQty_H create(mcframe.clientMAUB.MAUBP0390.PurcContQtyR row){
		MAUBP_PurcContQty_H p = new MAUBP_PurcContQty_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_PurcContQty_H create(){
		MAUBP_PurcContQty_H p = new MAUBP_PurcContQty_H();
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
		MAUBP_PurcContQty_H_MC.jbfInitPurcContQty((MAUBP_PurcContQty_H)this);
		MAUBP_PurcContQty_H_MC.jbInitPurcContQty((MAUBP_PurcContQty_H)this);
	}

	/**
	 * [PurcContQty]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPurcContQty(MAUBP_PurcContQty_H p) {
		// ブロック関連の初期化
		p.PurcContQtyPanel = p.beansFactory.createPanel("PurcContQty");
		// ブロックの項目の初期化
		p.PurcContQty_purc_cont_qty_Label = p.beansFactory.createLabel("PurcContQty.purc_cont_qty_Label");
		p.PurcContQty_purc_cont_qty = p.beansFactory.createNumberField("PurcContQty.purc_cont_qty");
		p.PurcContQty_purc_cont_qty.setLabel(p.PurcContQty_purc_cont_qty_Label);
	}

	/**
	 * [PurcContQty]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPurcContQty(MAUBP_PurcContQty_H p) {
		// ブロック関連の初期化
		p.add(p.PurcContQtyPanel);
		p.setLastBeans(p.PurcContQtyPanel);
		// ブロックの項目の初期化
		p.PurcContQtyPanel.add(p.PurcContQty_purc_cont_qty_Label);
		p.PurcContQtyPanel.add(p.PurcContQty_purc_cont_qty);
		p.PurcContQtyPanel.setLastBeans(p.PurcContQty_purc_cont_qty);
		p.PurcContQty_purc_cont_qty.setRow(p.getPurcContQtyR(), mcframe.clientMAUB.MAUBP0390.PurcContQtyR.purc_cont_qty_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_PurcContQty_H_MC.mcInitPurcContQty((MAUBP_PurcContQty_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_PurcContQty_H_MC.statusInitENABLE_PurcContQty((MAUBP_PurcContQty_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_PurcContQty_H_MC.statusInitDISABLE_PurcContQty((MAUBP_PurcContQty_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_PurcContQty_H_MC.statusInitREAD__ONLY_PurcContQty((MAUBP_PurcContQty_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_PurcContQty_H_MC.statusInitREQUIRED_PurcContQty((MAUBP_PurcContQty_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_PurcContQty_H_MC.statusInitINVISIBLE_PurcContQty((MAUBP_PurcContQty_H)this);

	}

	/**
	 *  [PurcContQty]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPurcContQty(MAUBP_PurcContQty_H p) {
		p.PurcContQty_purc_cont_qty.setListListener(p);
		p.PurcContQty_purc_cont_qty.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[PurcContQty]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_PurcContQty(MAUBP_PurcContQty_H p){
		p.PurcContQty_purc_cont_qty.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[PurcContQty]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_PurcContQty(MAUBP_PurcContQty_H p){
		p.PurcContQty_purc_cont_qty.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[PurcContQty]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_PurcContQty(MAUBP_PurcContQty_H p){
		p.PurcContQty_purc_cont_qty.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[PurcContQty]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_PurcContQty(MAUBP_PurcContQty_H p){
		p.PurcContQty_purc_cont_qty.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[PurcContQty]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_PurcContQty(MAUBP_PurcContQty_H p){
		p.PurcContQty_purc_cont_qty.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == PurcContQty_purc_cont_qty) return doPurcContQty_purc_cont_qty_VC(info);
		return true;
	}

	/**
	 * [PurcContQty]パネルの[purc_cont_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPurcContQty_purc_cont_qty_VC(MCEventInfo info){
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
		if (nc == PurcContQty_purc_cont_qty) doPurcContQty_purc_cont_qty_NC(info);
	}

	/**
	 * [PurcContQty]パネルの[purc_cont_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPurcContQty_purc_cont_qty_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == PurcContQty_purc_cont_qty) doPurcContQty_purc_cont_qty_NE(info);
	}

	/**
	 * [PurcContQty]パネルの[purc_cont_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPurcContQty_purc_cont_qty_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == PurcContQty_purc_cont_qty) doPurcContQty_purc_cont_qty_NX(info);
	}

	/**
	 * [PurcContQty]パネルの[purc_cont_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPurcContQty_purc_cont_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == PurcContQty_purc_cont_qty) doPurcContQty_purc_cont_qty_LC(info);
	}

	/**
	 * [PurcContQty]パネルの[purc_cont_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPurcContQty_purc_cont_qty_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}