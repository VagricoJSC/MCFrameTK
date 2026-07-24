package mcframe.clientMAUB.MAUBP0330;

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
 * 画面"MAUBP_CanAcDt_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_CanAcDt_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0330";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [CanAcDt]ブロック関連のField定義
	public MCPanel CanAcDtPanel = null;
	// [CanAcDt]ブロックの項目のField定義
	public MCLabel CanAcDt_can_ac_dt_for_input_Label = null;
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDateField CanAcDt_can_ac_dt_for_input = null;
	public MCLabel CanAcDt_can_ac_dt_for_call_Label = null;
	/**
	 * Cancellation recording date (For communication) 取消計上日（通信用）.<p>
	 *
	 */
	public MCDateField CanAcDt_can_ac_dt_for_call = null;
	public MCLabel CanAcDt_ac_dt_after_srch_Label = null;
	/**
	 * Recording date (At search) 計上日（検索時）.<p>
	 *
	 */
	public MCDateField CanAcDt_ac_dt_after_srch = null;
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
	
	/** [CanAcDt]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0330.CanAcDtR aCanAcDtR;

	/**
	 * 項目コピーによってaCanAcDtRを設定します。
	 *
	 * aCanAcDtRのインスタンスは変更されません。
	 *
	 * @param row CanAcDtR
	 */
	public void setCanAcDtR(mcframe.clientMAUB.MAUBP0330.CanAcDtR row) {
		if (row != null) {
			MCRow.copyall(getCanAcDtR(), row);
		}
	}

	/**
	 * [CanAcDt]ブロックのコンテナaCanAcDtRを返します。
	 *
	 * @return CanAcDtR
	 */
	public mcframe.clientMAUB.MAUBP0330.CanAcDtR getCanAcDtR() {
		return aCanAcDtR;
	}

	/**
	 * aCanAcDtRを作成します。
	 *
	 * @return CanAcDtR
	 */
	public mcframe.clientMAUB.MAUBP0330.CanAcDtR createCanAcDtR() {
		return mcframe.clientMAUB.MAUBP0330.CanAcDtR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCanAcDtR())) ret.add(getCanAcDtR());
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
		if(aCnt == getCanAcDtR()) return "CanAcDt";
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
		if(bId.equals("CanAcDt")) return getCanAcDtR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CanAcDtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_CanAcDt_H_MC_A() {
		aCanAcDtR = createCanAcDtR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_CanAcDt_H_MC_A(mcframe.clientMAUB.MAUBP0330.CanAcDtR row){
		aCanAcDtR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_CanAcDt_H_MC.jbCreateCanAcDt((MAUBP_CanAcDt_H)this);
	}

	/**
	 * [CanAcDt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCanAcDt(MAUBP_CanAcDt_H p) {
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
	public static MAUBP_CanAcDt_H create(mcframe.clientMAUB.MAUBP0330.CanAcDtR row){
		MAUBP_CanAcDt_H p = new MAUBP_CanAcDt_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_CanAcDt_H create(){
		MAUBP_CanAcDt_H p = new MAUBP_CanAcDt_H();
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
		MAUBP_CanAcDt_H_MC.jbfInitCanAcDt((MAUBP_CanAcDt_H)this);
		MAUBP_CanAcDt_H_MC.jbInitCanAcDt((MAUBP_CanAcDt_H)this);
	}

	/**
	 * [CanAcDt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCanAcDt(MAUBP_CanAcDt_H p) {
		// ブロック関連の初期化
		p.CanAcDtPanel = p.beansFactory.createPanel("CanAcDt");
		// ブロックの項目の初期化
		p.CanAcDt_can_ac_dt_for_input_Label = p.beansFactory.createLabel("CanAcDt.can_ac_dt_for_input_Label");
		p.CanAcDt_can_ac_dt_for_input = p.beansFactory.createDateField("CanAcDt.can_ac_dt_for_input");
		p.CanAcDt_can_ac_dt_for_input.setLabel(p.CanAcDt_can_ac_dt_for_input_Label);
		p.CanAcDt_can_ac_dt_for_call_Label = p.beansFactory.createLabel("CanAcDt.can_ac_dt_for_call_Label");
		p.CanAcDt_can_ac_dt_for_call = p.beansFactory.createDateField("CanAcDt.can_ac_dt_for_call");
		p.CanAcDt_can_ac_dt_for_call.setLabel(p.CanAcDt_can_ac_dt_for_call_Label);
		p.CanAcDt_ac_dt_after_srch_Label = p.beansFactory.createLabel("CanAcDt.ac_dt_after_srch_Label");
		p.CanAcDt_ac_dt_after_srch = p.beansFactory.createDateField("CanAcDt.ac_dt_after_srch");
		p.CanAcDt_ac_dt_after_srch.setLabel(p.CanAcDt_ac_dt_after_srch_Label);
	}

	/**
	 * [CanAcDt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCanAcDt(MAUBP_CanAcDt_H p) {
		// ブロック関連の初期化
		p.add(p.CanAcDtPanel);
		p.setLastBeans(p.CanAcDtPanel);
		// ブロックの項目の初期化
		p.CanAcDtPanel.add(p.CanAcDt_can_ac_dt_for_input_Label);
		p.CanAcDtPanel.add(p.CanAcDt_can_ac_dt_for_input);
		p.CanAcDtPanel.setLastBeans(p.CanAcDt_can_ac_dt_for_input);
		p.CanAcDt_can_ac_dt_for_input.setNextBeans(p.CanAcDt_can_ac_dt_for_call);
		p.CanAcDt_can_ac_dt_for_input.setRow(p.getCanAcDtR(), mcframe.clientMAUB.MAUBP0330.CanAcDtR.can_ac_dt_for_input_META);
		p.CanAcDt_can_ac_dt_for_input.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CanAcDtPanel.add(p.CanAcDt_can_ac_dt_for_call_Label);
		p.CanAcDtPanel.add(p.CanAcDt_can_ac_dt_for_call);
		p.CanAcDt_can_ac_dt_for_call.setNextBeans(p.CanAcDt_ac_dt_after_srch);
		p.CanAcDt_can_ac_dt_for_call.setRow(p.getCanAcDtR(), mcframe.clientMAUB.MAUBP0330.CanAcDtR.can_ac_dt_for_call_META);
		p.CanAcDt_can_ac_dt_for_call.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CanAcDtPanel.add(p.CanAcDt_ac_dt_after_srch_Label);
		p.CanAcDtPanel.add(p.CanAcDt_ac_dt_after_srch);
		p.CanAcDt_ac_dt_after_srch.setRow(p.getCanAcDtR(), mcframe.clientMAUB.MAUBP0330.CanAcDtR.ac_dt_after_srch_META);
		p.CanAcDt_ac_dt_after_srch.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_CanAcDt_H_MC.mcInitCanAcDt((MAUBP_CanAcDt_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_CanAcDt_H_MC.statusInitENABLE_CanAcDt((MAUBP_CanAcDt_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_CanAcDt_H_MC.statusInitDISABLE_CanAcDt((MAUBP_CanAcDt_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_CanAcDt_H_MC.statusInitREAD__ONLY_CanAcDt((MAUBP_CanAcDt_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_CanAcDt_H_MC.statusInitREQUIRED_CanAcDt((MAUBP_CanAcDt_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_CanAcDt_H_MC.statusInitINVISIBLE_CanAcDt((MAUBP_CanAcDt_H)this);

	}

	/**
	 *  [CanAcDt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCanAcDt(MAUBP_CanAcDt_H p) {
		p.CanAcDt_can_ac_dt_for_input.setListListener(p);
		p.CanAcDt_can_ac_dt_for_input.addAllListener(p);
		p.CanAcDt_can_ac_dt_for_call.setListListener(p);
		p.CanAcDt_can_ac_dt_for_call.addAllListener(p);
		p.CanAcDt_ac_dt_after_srch.setListListener(p);
		p.CanAcDt_ac_dt_after_srch.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[CanAcDt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_CanAcDt(MAUBP_CanAcDt_H p){
		p.CanAcDt_can_ac_dt_for_input.putMode(p, ENABLE, MCMode.ENABLE);
		p.CanAcDt_can_ac_dt_for_call.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.CanAcDt_ac_dt_after_srch.putMode(p, ENABLE, MCMode.INVISIBLE);

	}

	/**
	 * [DISABLE]ステータスの[CanAcDt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_CanAcDt(MAUBP_CanAcDt_H p){
		p.CanAcDt_can_ac_dt_for_input.putMode(p, DISABLE, MCMode.DISABLE);
		p.CanAcDt_can_ac_dt_for_call.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.CanAcDt_ac_dt_after_srch.putMode(p, DISABLE, MCMode.INVISIBLE);

	}

	/**
	 * [READ_ONLY]ステータスの[CanAcDt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_CanAcDt(MAUBP_CanAcDt_H p){
		p.CanAcDt_can_ac_dt_for_input.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.CanAcDt_can_ac_dt_for_call.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.CanAcDt_ac_dt_after_srch.putMode(p, READ_ONLY, MCMode.INVISIBLE);

	}

	/**
	 * [REQUIRED]ステータスの[CanAcDt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_CanAcDt(MAUBP_CanAcDt_H p){
		p.CanAcDt_can_ac_dt_for_input.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.CanAcDt_can_ac_dt_for_call.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.CanAcDt_ac_dt_after_srch.putMode(p, REQUIRED, MCMode.INVISIBLE);

	}

	/**
	 * [INVISIBLE]ステータスの[CanAcDt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_CanAcDt(MAUBP_CanAcDt_H p){
		p.CanAcDt_can_ac_dt_for_input.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.CanAcDt_can_ac_dt_for_call.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.CanAcDt_ac_dt_after_srch.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == CanAcDt_can_ac_dt_for_input) return doCanAcDt_can_ac_dt_for_input_VC(info);
		if (vc == CanAcDt_can_ac_dt_for_call) return doCanAcDt_can_ac_dt_for_call_VC(info);
		if (vc == CanAcDt_ac_dt_after_srch) return doCanAcDt_ac_dt_after_srch_VC(info);
		return true;
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_input]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCanAcDt_can_ac_dt_for_input_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_call]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCanAcDt_can_ac_dt_for_call_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CanAcDt]パネルの[ac_dt_after_srch]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCanAcDt_ac_dt_after_srch_VC(MCEventInfo info){
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
		if (nc == CanAcDt_can_ac_dt_for_input) doCanAcDt_can_ac_dt_for_input_NC(info);
		else if (nc == CanAcDt_can_ac_dt_for_call) doCanAcDt_can_ac_dt_for_call_NC(info);
		else if (nc == CanAcDt_ac_dt_after_srch) doCanAcDt_ac_dt_after_srch_NC(info);
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_input]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_input_NC(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_call]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_call_NC(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[ac_dt_after_srch]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_ac_dt_after_srch_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CanAcDt_can_ac_dt_for_input) doCanAcDt_can_ac_dt_for_input_NE(info);
		else if (ne == CanAcDt_can_ac_dt_for_call) doCanAcDt_can_ac_dt_for_call_NE(info);
		else if (ne == CanAcDt_ac_dt_after_srch) doCanAcDt_ac_dt_after_srch_NE(info);
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_input]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_input_NE(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_call]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_call_NE(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[ac_dt_after_srch]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_ac_dt_after_srch_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CanAcDt_can_ac_dt_for_input) doCanAcDt_can_ac_dt_for_input_NX(info);
		else if (nx == CanAcDt_can_ac_dt_for_call) doCanAcDt_can_ac_dt_for_call_NX(info);
		else if (nx == CanAcDt_ac_dt_after_srch) doCanAcDt_ac_dt_after_srch_NX(info);
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_input]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_input_NX(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_call]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_call_NX(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[ac_dt_after_srch]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_ac_dt_after_srch_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == CanAcDt_can_ac_dt_for_input) doCanAcDt_can_ac_dt_for_input_LC(info);
		else if (lc == CanAcDt_can_ac_dt_for_call) doCanAcDt_can_ac_dt_for_call_LC(info);
		else if (lc == CanAcDt_ac_dt_after_srch) doCanAcDt_ac_dt_after_srch_LC(info);
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_input]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_input_LC(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[can_ac_dt_for_call]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_can_ac_dt_for_call_LC(MCEventInfo info){
	}

	/**
	 * [CanAcDt]パネルの[ac_dt_after_srch]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCanAcDt_ac_dt_after_srch_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}