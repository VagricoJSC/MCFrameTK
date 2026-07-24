package mcframe.clientMAUB.MAUBP0360;

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
 * 画面"MAUBP_ContFctrUnit_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ContFctrUnit_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0360";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ContFctrUnit]ブロック関連のField定義
	public MCPanel ContFctrUnitPanel = null;
	// [ContFctrUnit]ブロックの項目のField定義
	public MCLabel ContFctrUnit_cont_fctr_unit_cd_Label = null;
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public MCTextField ContFctrUnit_cont_fctr_unit_cd = null;
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public MCTextField ContFctrUnit_cont_fctr_unit_nm = null;
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
	
	/** [ContFctrUnit]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0360.ContFctrUnitR aContFctrUnitR;

	/**
	 * 項目コピーによってaContFctrUnitRを設定します。
	 *
	 * aContFctrUnitRのインスタンスは変更されません。
	 *
	 * @param row ContFctrUnitR
	 */
	public void setContFctrUnitR(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR row) {
		if (row != null) {
			MCRow.copyall(getContFctrUnitR(), row);
		}
	}

	/**
	 * [ContFctrUnit]ブロックのコンテナaContFctrUnitRを返します。
	 *
	 * @return ContFctrUnitR
	 */
	public mcframe.clientMAUB.MAUBP0360.ContFctrUnitR getContFctrUnitR() {
		return aContFctrUnitR;
	}

	/**
	 * aContFctrUnitRを作成します。
	 *
	 * @return ContFctrUnitR
	 */
	public mcframe.clientMAUB.MAUBP0360.ContFctrUnitR createContFctrUnitR() {
		return mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getContFctrUnitR())) ret.add(getContFctrUnitR());
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
		if(aCnt == getContFctrUnitR()) return "ContFctrUnit";
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
		if(bId.equals("ContFctrUnit")) return getContFctrUnitR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ContFctrUnitPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ContFctrUnit_H_MC_A() {
		aContFctrUnitR = createContFctrUnitR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_ContFctrUnit_H_MC_A(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR row){
		aContFctrUnitR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ContFctrUnit_H_MC.jbCreateContFctrUnit((MAUBP_ContFctrUnit_H)this);
	}

	/**
	 * [ContFctrUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateContFctrUnit(MAUBP_ContFctrUnit_H p) {
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
	public static MAUBP_ContFctrUnit_H create(mcframe.clientMAUB.MAUBP0360.ContFctrUnitR row){
		MAUBP_ContFctrUnit_H p = new MAUBP_ContFctrUnit_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ContFctrUnit_H create(){
		MAUBP_ContFctrUnit_H p = new MAUBP_ContFctrUnit_H();
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
		MAUBP_ContFctrUnit_H_MC.jbfInitContFctrUnit((MAUBP_ContFctrUnit_H)this);
		MAUBP_ContFctrUnit_H_MC.jbInitContFctrUnit((MAUBP_ContFctrUnit_H)this);
	}

	/**
	 * [ContFctrUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitContFctrUnit(MAUBP_ContFctrUnit_H p) {
		// ブロック関連の初期化
		p.ContFctrUnitPanel = p.beansFactory.createPanel("ContFctrUnit");
		// ブロックの項目の初期化
		p.ContFctrUnit_cont_fctr_unit_cd_Label = p.beansFactory.createLabel("ContFctrUnit.cont_fctr_unit_cd_Label");
		p.ContFctrUnit_cont_fctr_unit_cd = p.beansFactory.createTextField("ContFctrUnit.cont_fctr_unit_cd");
		p.ContFctrUnit_cont_fctr_unit_cd.setLabel(p.ContFctrUnit_cont_fctr_unit_cd_Label);
		p.ContFctrUnit_cont_fctr_unit_nm = p.beansFactory.createTextField("ContFctrUnit.cont_fctr_unit_nm");
	}

	/**
	 * [ContFctrUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitContFctrUnit(MAUBP_ContFctrUnit_H p) {
		// ブロック関連の初期化
		p.add(p.ContFctrUnitPanel);
		p.setLastBeans(p.ContFctrUnitPanel);
		// ブロックの項目の初期化
		p.ContFctrUnitPanel.add(p.ContFctrUnit_cont_fctr_unit_cd_Label);
		p.ContFctrUnitPanel.add(p.ContFctrUnit_cont_fctr_unit_cd);
		p.ContFctrUnitPanel.setLastBeans(p.ContFctrUnit_cont_fctr_unit_cd);
		p.ContFctrUnit_cont_fctr_unit_cd.setNextBeans(p.ContFctrUnit_cont_fctr_unit_nm);
		p.ContFctrUnit_cont_fctr_unit_cd.setRow(p.getContFctrUnitR(), mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.cont_fctr_unit_cd_META);
		p.ContFctrUnitPanel.add(p.ContFctrUnit_cont_fctr_unit_nm);
		p.ContFctrUnit_cont_fctr_unit_nm.setRow(p.getContFctrUnitR(), mcframe.clientMAUB.MAUBP0360.ContFctrUnitR.cont_fctr_unit_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ContFctrUnit_H_MC.mcInitContFctrUnit((MAUBP_ContFctrUnit_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_H_MC.statusInitENABLE_ContFctrUnit((MAUBP_ContFctrUnit_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_H_MC.statusInitDISABLE_ContFctrUnit((MAUBP_ContFctrUnit_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ContFctrUnit_H_MC.statusInitREAD__ONLY_ContFctrUnit((MAUBP_ContFctrUnit_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ContFctrUnit_H_MC.statusInitREQUIRED_ContFctrUnit((MAUBP_ContFctrUnit_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_H_MC.statusInitINVISIBLE_ContFctrUnit((MAUBP_ContFctrUnit_H)this);

	}

	/**
	 *  [ContFctrUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitContFctrUnit(MAUBP_ContFctrUnit_H p) {
		p.ContFctrUnit_cont_fctr_unit_cd.setListListener(p);
		p.ContFctrUnit_cont_fctr_unit_cd.addAllListener(p);
		p.ContFctrUnit_cont_fctr_unit_nm.setListListener(p);
		p.ContFctrUnit_cont_fctr_unit_nm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ContFctrUnit(MAUBP_ContFctrUnit_H p){
		p.ContFctrUnit_cont_fctr_unit_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.ContFctrUnit_cont_fctr_unit_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ContFctrUnit(MAUBP_ContFctrUnit_H p){
		p.ContFctrUnit_cont_fctr_unit_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.ContFctrUnit_cont_fctr_unit_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ContFctrUnit(MAUBP_ContFctrUnit_H p){
		p.ContFctrUnit_cont_fctr_unit_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ContFctrUnit_cont_fctr_unit_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ContFctrUnit(MAUBP_ContFctrUnit_H p){
		p.ContFctrUnit_cont_fctr_unit_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ContFctrUnit_cont_fctr_unit_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ContFctrUnit(MAUBP_ContFctrUnit_H p){
		p.ContFctrUnit_cont_fctr_unit_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ContFctrUnit_cont_fctr_unit_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == ContFctrUnit_cont_fctr_unit_cd) return doContFctrUnit_cont_fctr_unit_cd_VC(info);
		if (vc == ContFctrUnit_cont_fctr_unit_nm) return doContFctrUnit_cont_fctr_unit_nm_VC(info);
		return true;
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContFctrUnit_cont_fctr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContFctrUnit_cont_fctr_unit_nm_VC(MCEventInfo info){
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
		if (nc == ContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NC(info);
		else if (nc == ContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NC(info);
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NE(info);
		else if (ne == ContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NE(info);
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NX(info);
		else if (nx == ContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NX(info);
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == ContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_LC(info);
		else if (lc == ContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_LC(info);
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}