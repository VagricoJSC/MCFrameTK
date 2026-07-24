package mcframe.clientMAUB.MAUBP0110;

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
 * 画面"MAUBP_YmdHm_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_YmdHm_H_MC_A extends mcframe.clientMAUD.MAUDP1040.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [YmdHm]ブロック関連のField定義
	public MCPanel YmdHmPanel = null;
	// [YmdHm]ブロックの項目のField定義
	public MCLabel YmdHm_ymd_Label = null;
	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDateField YmdHm_ymd = null;
	/**
	 * Time 時刻.<p>
	 *
	 */
	public MCDateField YmdHm_hm = null;
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
	private final mcframe.clientMAUB.MAUBP0110.YmdHmR aYmdHmR;

	/**
	 * 項目コピーによってaYmdHmRを設定します。
	 *
	 * aYmdHmRのインスタンスは変更されません。
	 *
	 * @param row YmdHmR
	 */
	public void setYmdHmR(mcframe.clientMAUB.MAUBP0110.YmdHmR row) {
		if (row != null) {
			MCRow.copyall(getYmdHmR(), row);
		}
	}

	/**
	 * [YmdHm]ブロックのコンテナaYmdHmRを返します。
	 *
	 * @return YmdHmR
	 */
	public mcframe.clientMAUB.MAUBP0110.YmdHmR getYmdHmR() {
		return aYmdHmR;
	}

	/**
	 * aYmdHmRを作成します。
	 *
	 * @return YmdHmR
	 */
	public mcframe.clientMAUB.MAUBP0110.YmdHmR createYmdHmR() {
		return mcframe.clientMAUB.MAUBP0110.YmdHmR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getYmdHmR())) ret.add(getYmdHmR());
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
		if(aCnt == getYmdHmR()) return "YmdHm";
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
		if(bId.equals("YmdHm")) return getYmdHmR();
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
	public MAUBP_YmdHm_H_MC_A() {
		aYmdHmR = createYmdHmR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_YmdHm_H_MC_A(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		aYmdHmR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_YmdHm_H_MC.jbCreateYmdHm((MAUBP_YmdHm_H)this);
	}

	/**
	 * [YmdHm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateYmdHm(MAUBP_YmdHm_H p) {
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
	public static MAUBP_YmdHm_H create(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		MAUBP_YmdHm_H p = new MAUBP_YmdHm_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_YmdHm_H create(){
		MAUBP_YmdHm_H p = new MAUBP_YmdHm_H();
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
		MAUBP_YmdHm_H_MC.jbfInitYmdHm((MAUBP_YmdHm_H)this);
		MAUBP_YmdHm_H_MC.jbInitYmdHm((MAUBP_YmdHm_H)this);
	}

	/**
	 * [YmdHm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitYmdHm(MAUBP_YmdHm_H p) {
		// ブロック関連の初期化
		p.YmdHmPanel = p.beansFactory.createPanel("YmdHm");
		// ブロックの項目の初期化
		p.YmdHm_ymd_Label = p.beansFactory.createLabel("YmdHm.ymd_Label");
		p.YmdHm_ymd = p.beansFactory.createDateField("YmdHm.ymd");
		p.YmdHm_ymd.setLabel(p.YmdHm_ymd_Label);
		p.YmdHm_hm = p.beansFactory.createDateField("YmdHm.hm");
	}

	/**
	 * [YmdHm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitYmdHm(MAUBP_YmdHm_H p) {
		// ブロック関連の初期化
		p.add(p.YmdHmPanel);
		p.setLastBeans(p.YmdHmPanel);
		// ブロックの項目の初期化
		p.YmdHmPanel.add(p.YmdHm_ymd_Label);
		p.YmdHmPanel.add(p.YmdHm_ymd);
		p.YmdHmPanel.setLastBeans(p.YmdHm_ymd);
		p.YmdHm_ymd.setNextBeans(p.YmdHm_hm);
		p.YmdHm_ymd.setRow(p.getYmdHmR(), mcframe.clientMAUB.MAUBP0110.YmdHmR.ymd_META);
		p.YmdHm_ymd.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.YmdHmPanel.add(p.YmdHm_hm);
		p.YmdHm_hm.setRow(p.getYmdHmR(), mcframe.clientMAUB.MAUBP0110.YmdHmR.hm_META);
		p.YmdHm_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_YmdHm_H_MC.mcInitYmdHm((MAUBP_YmdHm_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_YmdHm_H_MC.statusInitENABLE_YmdHm((MAUBP_YmdHm_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_YmdHm_H_MC.statusInitDISABLE_YmdHm((MAUBP_YmdHm_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_YmdHm_H_MC.statusInitREAD__ONLY_YmdHm((MAUBP_YmdHm_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_YmdHm_H_MC.statusInitREQUIRED_YmdHm((MAUBP_YmdHm_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_YmdHm_H_MC.statusInitINVISIBLE_YmdHm((MAUBP_YmdHm_H)this);

	}

	/**
	 *  [YmdHm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitYmdHm(MAUBP_YmdHm_H p) {
		p.YmdHm_ymd.setListListener(p);
		p.YmdHm_ymd.addAllListener(p);
		p.YmdHm_hm.setListListener(p);
		p.YmdHm_hm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_YmdHm(MAUBP_YmdHm_H p){
		p.YmdHm_ymd.putMode(p, ENABLE, MCMode.ENABLE);
		p.YmdHm_hm.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_YmdHm(MAUBP_YmdHm_H p){
		p.YmdHm_ymd.putMode(p, DISABLE, MCMode.DISABLE);
		p.YmdHm_hm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_YmdHm(MAUBP_YmdHm_H p){
		p.YmdHm_ymd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.YmdHm_hm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_YmdHm(MAUBP_YmdHm_H p){
		p.YmdHm_ymd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.YmdHm_hm.putMode(p, REQUIRED, MCMode.ENABLE);

	}

	/**
	 * [INVISIBLE]ステータスの[YmdHm]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_YmdHm(MAUBP_YmdHm_H p){
		p.YmdHm_ymd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHm_hm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == YmdHm_ymd) return doYmdHm_ymd_VC(info);
		if (vc == YmdHm_hm) return doYmdHm_hm_VC(info);
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
		if (nc == YmdHm_ymd) doYmdHm_ymd_NC(info);
		else if (nc == YmdHm_hm) doYmdHm_hm_NC(info);
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
		if (ne == YmdHm_ymd) doYmdHm_ymd_NE(info);
		else if (ne == YmdHm_hm) doYmdHm_hm_NE(info);
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
		if (nx == YmdHm_ymd) doYmdHm_ymd_NX(info);
		else if (nx == YmdHm_hm) doYmdHm_hm_NX(info);
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
		if (lc == YmdHm_ymd) doYmdHm_ymd_LC(info);
		else if (lc == YmdHm_hm) doYmdHm_hm_LC(info);
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