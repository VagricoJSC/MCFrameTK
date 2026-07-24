package mcframe.clientMSUB.MSUBP0080;

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
 * 画面"MSUBP_InptTrgtSel_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_InptTrgtSel_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MSUBP0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [InptTrgtSel]ブロック関連のField定義
	public MCPanel InptTrgtSelPanel = null;
	// [InptTrgtSel]ブロックの項目のField定義
	/**
	 * Select input target 投入対象選択.<p>
	 *
	 */
	public MCButton InptTrgtSel_open_MSBCP1060 = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [DISABLE]モードを表す定数 */
	public static final String DISABLE = "DISABLE";
	/** [INVISIBLE]モードを表す定数 */
	public static final String INVISIBLE = "INVISIBLE";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE, DISABLE, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
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
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(InptTrgtSelPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_InptTrgtSel_H_MC_A() {

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_InptTrgtSel_H_MC.jbCreateInptTrgtSel((MSUBP_InptTrgtSel_H)this);
	}

	/**
	 * [InptTrgtSel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInptTrgtSel(MSUBP_InptTrgtSel_H p) {
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
	public static MSUBP_InptTrgtSel_H create(){
		MSUBP_InptTrgtSel_H p = new MSUBP_InptTrgtSel_H();
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
		MSUBP_InptTrgtSel_H_MC.jbfInitInptTrgtSel((MSUBP_InptTrgtSel_H)this);
		MSUBP_InptTrgtSel_H_MC.jbInitInptTrgtSel((MSUBP_InptTrgtSel_H)this);
	}

	/**
	 * [InptTrgtSel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInptTrgtSel(MSUBP_InptTrgtSel_H p) {
		// ブロック関連の初期化
		p.InptTrgtSelPanel = p.beansFactory.createPanel("InptTrgtSel");
		// ブロックの項目の初期化
		p.InptTrgtSel_open_MSBCP1060 = p.beansFactory.createButton("InptTrgtSel.open_MSBCP1060", "open");
	}

	/**
	 * [InptTrgtSel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInptTrgtSel(MSUBP_InptTrgtSel_H p) {
		// ブロック関連の初期化
		p.add(p.InptTrgtSelPanel);
		p.setLastBeans(p.InptTrgtSelPanel);
		// ブロックの項目の初期化
		p.InptTrgtSelPanel.add(p.InptTrgtSel_open_MSBCP1060);
		p.InptTrgtSelPanel.setLastBeans(p.InptTrgtSel_open_MSBCP1060);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_InptTrgtSel_H_MC.mcInitInptTrgtSel((MSUBP_InptTrgtSel_H)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_InptTrgtSel_H_MC.statusInitENABLE_InptTrgtSel((MSUBP_InptTrgtSel_H)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_InptTrgtSel_H_MC.statusInitDISABLE_InptTrgtSel((MSUBP_InptTrgtSel_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_InptTrgtSel_H_MC.statusInitINVISIBLE_InptTrgtSel((MSUBP_InptTrgtSel_H)this);

	}

	/**
	 *  [InptTrgtSel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInptTrgtSel(MSUBP_InptTrgtSel_H p) {
		p.InptTrgtSel_open_MSBCP1060.addAllListener(p);
		p.InptTrgtSel_open_MSBCP1060.setAPMethodName("doInptTrgtSel_open_MSBCP1060");
	}

	/**
	 * [ENABLE]ステータスの[InptTrgtSel]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_InptTrgtSel(MSUBP_InptTrgtSel_H p){
		p.InptTrgtSel_open_MSBCP1060.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[InptTrgtSel]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_InptTrgtSel(MSUBP_InptTrgtSel_H p){
		p.InptTrgtSel_open_MSBCP1060.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [INVISIBLE]ステータスの[InptTrgtSel]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_InptTrgtSel(MSUBP_InptTrgtSel_H p){
		p.InptTrgtSel_open_MSBCP1060.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (ap == InptTrgtSel_open_MSBCP1060) doInptTrgtSel_open_MSBCP1060(info);
	}

	/**
	 * [InptTrgtSel]パネルの[open_MSBCP1060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doInptTrgtSel_open_MSBCP1060(MCEventInfo info);

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
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}