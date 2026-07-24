package mcframe.clientMAUB.MAUBP0060;

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
 * 画面"MAUBP_Amt_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Amt_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Amt]ブロック関連のField定義
	public MCPanel AmtPanel = null;
	// [Amt]ブロックの項目のField定義
	public MCLabel Amt_amt_Label = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumberField Amt_amt = null;
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
	
	/** [Amt]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0060.AmtR aAmtR;

	/**
	 * 項目コピーによってaAmtRを設定します。
	 *
	 * aAmtRのインスタンスは変更されません。
	 *
	 * @param row AmtR
	 */
	public void setAmtR(mcframe.clientMAUB.MAUBP0060.AmtR row) {
		if (row != null) {
			MCRow.copyall(getAmtR(), row);
		}
	}

	/**
	 * [Amt]ブロックのコンテナaAmtRを返します。
	 *
	 * @return AmtR
	 */
	public mcframe.clientMAUB.MAUBP0060.AmtR getAmtR() {
		return aAmtR;
	}

	/**
	 * aAmtRを作成します。
	 *
	 * @return AmtR
	 */
	public mcframe.clientMAUB.MAUBP0060.AmtR createAmtR() {
		return mcframe.clientMAUB.MAUBP0060.AmtR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAmtR())) ret.add(getAmtR());
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
		if(aCnt == getAmtR()) return "Amt";
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
		if(bId.equals("Amt")) return getAmtR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(AmtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Amt_H_MC_A() {
		aAmtR = createAmtR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Amt_H_MC_A(mcframe.clientMAUB.MAUBP0060.AmtR row){
		aAmtR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Amt_H_MC.jbCreateAmt((MAUBP_Amt_H)this);
	}

	/**
	 * [Amt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAmt(MAUBP_Amt_H p) {
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
	public static MAUBP_Amt_H create(mcframe.clientMAUB.MAUBP0060.AmtR row){
		MAUBP_Amt_H p = new MAUBP_Amt_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Amt_H create(){
		MAUBP_Amt_H p = new MAUBP_Amt_H();
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
		MAUBP_Amt_H_MC.jbfInitAmt((MAUBP_Amt_H)this);
		MAUBP_Amt_H_MC.jbInitAmt((MAUBP_Amt_H)this);
	}

	/**
	 * [Amt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAmt(MAUBP_Amt_H p) {
		// ブロック関連の初期化
		p.AmtPanel = p.beansFactory.createPanel("Amt");
		// ブロックの項目の初期化
		p.Amt_amt_Label = p.beansFactory.createLabel("Amt.amt_Label");
		p.Amt_amt = p.beansFactory.createNumberField("Amt.amt");
		p.Amt_amt.setLabel(p.Amt_amt_Label);
	}

	/**
	 * [Amt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAmt(MAUBP_Amt_H p) {
		// ブロック関連の初期化
		p.add(p.AmtPanel);
		p.setLastBeans(p.AmtPanel);
		// ブロックの項目の初期化
		p.AmtPanel.add(p.Amt_amt_Label);
		p.AmtPanel.add(p.Amt_amt);
		p.AmtPanel.setLastBeans(p.Amt_amt);
		p.Amt_amt.setRow(p.getAmtR(), mcframe.clientMAUB.MAUBP0060.AmtR.amt_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Amt_H_MC.mcInitAmt((MAUBP_Amt_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Amt_H_MC.statusInitENABLE_Amt((MAUBP_Amt_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Amt_H_MC.statusInitDISABLE_Amt((MAUBP_Amt_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Amt_H_MC.statusInitREAD__ONLY_Amt((MAUBP_Amt_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Amt_H_MC.statusInitREQUIRED_Amt((MAUBP_Amt_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Amt_H_MC.statusInitINVISIBLE_Amt((MAUBP_Amt_H)this);

	}

	/**
	 *  [Amt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAmt(MAUBP_Amt_H p) {
		p.Amt_amt.setListListener(p);
		p.Amt_amt.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Amt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Amt(MAUBP_Amt_H p){
		p.Amt_amt.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Amt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Amt(MAUBP_Amt_H p){
		p.Amt_amt.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Amt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Amt(MAUBP_Amt_H p){
		p.Amt_amt.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Amt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Amt(MAUBP_Amt_H p){
		p.Amt_amt.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Amt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Amt(MAUBP_Amt_H p){
		p.Amt_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == Amt_amt) return doAmt_amt_VC(info);
		return true;
	}

	/**
	 * [Amt]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAmt_amt_VC(MCEventInfo info){
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
		if (nc == Amt_amt) doAmt_amt_NC(info);
	}

	/**
	 * [Amt]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAmt_amt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Amt_amt) doAmt_amt_NE(info);
	}

	/**
	 * [Amt]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAmt_amt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Amt_amt) doAmt_amt_NX(info);
	}

	/**
	 * [Amt]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAmt_amt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Amt_amt) doAmt_amt_LC(info);
	}

	/**
	 * [Amt]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAmt_amt_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}