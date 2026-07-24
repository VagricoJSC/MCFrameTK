package mcframe.clientMSUB.MSUBP0050;

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
 * 画面"MSUBP_StkBp_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_StkBp_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MSUBP0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StkBp]ブロック関連のField定義
	public MCPanel StkBpPanel = null;
	// [StkBp]ブロックの項目のField定義
	public MCLabel StkBp_stk_bp_cd_Label = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCTextField StkBp_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCTextField StkBp_stk_bp_nm = null;
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
	
	/** [StkBp]ブロックのコンテナField定義 */
	private final mcframe.clientMSUB.MSUBP0050.StkBpR aStkBpR;

	/**
	 * 項目コピーによってaStkBpRを設定します。
	 *
	 * aStkBpRのインスタンスは変更されません。
	 *
	 * @param row StkBpR
	 */
	public void setStkBpR(mcframe.clientMSUB.MSUBP0050.StkBpR row) {
		if (row != null) {
			MCRow.copyall(getStkBpR(), row);
		}
	}

	/**
	 * [StkBp]ブロックのコンテナaStkBpRを返します。
	 *
	 * @return StkBpR
	 */
	public mcframe.clientMSUB.MSUBP0050.StkBpR getStkBpR() {
		return aStkBpR;
	}

	/**
	 * aStkBpRを作成します。
	 *
	 * @return StkBpR
	 */
	public mcframe.clientMSUB.MSUBP0050.StkBpR createStkBpR() {
		return mcframe.clientMSUB.MSUBP0050.StkBpR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStkBpR())) ret.add(getStkBpR());
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
		if(aCnt == getStkBpR()) return "StkBp";
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
		if(bId.equals("StkBp")) return getStkBpR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StkBpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkBp_H_MC_A() {
		aStkBpR = createStkBpR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSUBP_StkBp_H_MC_A(mcframe.clientMSUB.MSUBP0050.StkBpR row){
		aStkBpR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_StkBp_H_MC.jbCreateStkBp((MSUBP_StkBp_H)this);
	}

	/**
	 * [StkBp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStkBp(MSUBP_StkBp_H p) {
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

	
	/** [StkBp_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter StkBp_stk_bp_cd_p = null;

	/**
	 * [StkBp_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getStkBp_stk_bp_cd_ListPutter() {
		if (StkBp_stk_bp_cd_p == null) {
			StkBp_stk_bp_cd_p = createStkBp_stk_bp_cd_ListPutter(StkBp_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");

		}
		return StkBp_stk_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MSUBP_StkBp_H create(mcframe.clientMSUB.MSUBP0050.StkBpR row){
		MSUBP_StkBp_H p = new MSUBP_StkBp_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_StkBp_H create(){
		MSUBP_StkBp_H p = new MSUBP_StkBp_H();
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
		MSUBP_StkBp_H_MC.jbfInitStkBp((MSUBP_StkBp_H)this);
		MSUBP_StkBp_H_MC.jbInitStkBp((MSUBP_StkBp_H)this);
	}

	/**
	 * [StkBp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStkBp(MSUBP_StkBp_H p) {
		// ブロック関連の初期化
		p.StkBpPanel = p.beansFactory.createPanel("StkBp");
		// ブロックの項目の初期化
		p.StkBp_stk_bp_cd_Label = p.beansFactory.createLabel("StkBp.stk_bp_cd_Label");
		p.StkBp_stk_bp_cd = p.beansFactory.createTextField("StkBp.stk_bp_cd");
		p.StkBp_stk_bp_cd.setLabel(p.StkBp_stk_bp_cd_Label);
		p.StkBp_stk_bp_nm = p.beansFactory.createTextField("StkBp.stk_bp_nm");
	}

	/**
	 * [StkBp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStkBp(MSUBP_StkBp_H p) {
		// ブロック関連の初期化
		p.add(p.StkBpPanel);
		p.setLastBeans(p.StkBpPanel);
		// ブロックの項目の初期化
		p.StkBpPanel.add(p.StkBp_stk_bp_cd_Label);
		p.StkBpPanel.add(p.StkBp_stk_bp_cd);
		p.StkBpPanel.setLastBeans(p.StkBp_stk_bp_cd);
		p.StkBp_stk_bp_cd.setNextBeans(p.StkBp_stk_bp_nm);
		p.StkBp_stk_bp_cd.setRow(p.getStkBpR(), mcframe.clientMSUB.MSUBP0050.StkBpR.stk_bp_cd_META);
		p.StkBp_stk_bp_cd.addLinkBeans(p.StkBp_stk_bp_nm);
		p.StkBp_stk_bp_cd.setListType(MCListType.STRICT);
		p.StkBpPanel.add(p.StkBp_stk_bp_nm);
		p.StkBp_stk_bp_nm.setRow(p.getStkBpR(), mcframe.clientMSUB.MSUBP0050.StkBpR.stk_bp_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_StkBp_H_MC.mcInitStkBp((MSUBP_StkBp_H)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_StkBp_H_MC.statusInitENABLE_StkBp((MSUBP_StkBp_H)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_StkBp_H_MC.statusInitDISABLE_StkBp((MSUBP_StkBp_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_StkBp_H_MC.statusInitREAD__ONLY_StkBp((MSUBP_StkBp_H)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_StkBp_H_MC.statusInitREQUIRED_StkBp((MSUBP_StkBp_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_StkBp_H_MC.statusInitINVISIBLE_StkBp((MSUBP_StkBp_H)this);

	}

	/**
	 *  [StkBp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStkBp(MSUBP_StkBp_H p) {
		p.StkBp_stk_bp_cd.setListListener(p);
		p.StkBp_stk_bp_cd.addAllListener(p);
		p.StkBp_stk_bp_nm.setListListener(p);
		p.StkBp_stk_bp_nm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StkBp(MSUBP_StkBp_H p){
		p.StkBp_stk_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.StkBp_stk_bp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StkBp(MSUBP_StkBp_H p){
		p.StkBp_stk_bp_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.StkBp_stk_bp_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StkBp(MSUBP_StkBp_H p){
		p.StkBp_stk_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StkBp_stk_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StkBp(MSUBP_StkBp_H p){
		p.StkBp_stk_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StkBp_stk_bp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[StkBp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StkBp(MSUBP_StkBp_H p){
		p.StkBp_stk_bp_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StkBp_stk_bp_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		StkBp_stk_bp_cd.getListConfig().setPutter(getStkBp_stk_bp_cd_ListPutter());
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
	 * [StkBp_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createStkBp_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == StkBp_stk_bp_cd) return getStkBp_stk_bp_cd(row, info);
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
		if (vc == StkBp_stk_bp_cd) return doStkBp_stk_bp_cd_VC(info);
		if (vc == StkBp_stk_bp_nm) return doStkBp_stk_bp_nm_VC(info);
		return true;
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkBp_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStkBp_stk_bp_nm_VC(MCEventInfo info){
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
		if (nc == StkBp_stk_bp_cd) doStkBp_stk_bp_cd_NC(info);
		else if (nc == StkBp_stk_bp_nm) doStkBp_stk_bp_nm_NC(info);
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StkBp_stk_bp_cd) doStkBp_stk_bp_cd_NE(info);
		else if (ne == StkBp_stk_bp_nm) doStkBp_stk_bp_nm_NE(info);
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StkBp_stk_bp_cd) doStkBp_stk_bp_cd_NX(info);
		else if (nx == StkBp_stk_bp_nm) doStkBp_stk_bp_nm_NX(info);
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == StkBp_stk_bp_cd) doStkBp_stk_bp_cd_LC(info);
		else if (lc == StkBp_stk_bp_nm) doStkBp_stk_bp_nm_LC(info);
	}

	/**
	 * [StkBp]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [StkBp]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStkBp_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[StkBp_stk_bp_cd]の作成メソッド
	 */
	public MCList getStkBp_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}