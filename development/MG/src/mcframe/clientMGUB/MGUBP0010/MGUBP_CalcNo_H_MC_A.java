package mcframe.clientMGUB.MGUBP0010;

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
 * 画面"MGUBP_CalcNo_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGUBP_CalcNo_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGUBP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [CalcNo]ブロック関連のField定義
	public MCPanel CalcNoPanel = null;
	// [CalcNo]ブロックの項目のField定義
	public MCLabel CalcNo_calc_no_Label = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCTextComboBox CalcNo_calc_no = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField CalcNo_rmrks = null;
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
	
	/** [CalcNo]ブロックのコンテナField定義 */
	private final mcframe.clientMGUB.MGUBP0010.CalcNoR aCalcNoR;

	/**
	 * 項目コピーによってaCalcNoRを設定します。
	 *
	 * aCalcNoRのインスタンスは変更されません。
	 *
	 * @param row CalcNoR
	 */
	public void setCalcNoR(mcframe.clientMGUB.MGUBP0010.CalcNoR row) {
		if (row != null) {
			MCRow.copyall(getCalcNoR(), row);
		}
	}

	/**
	 * [CalcNo]ブロックのコンテナaCalcNoRを返します。
	 *
	 * @return CalcNoR
	 */
	public mcframe.clientMGUB.MGUBP0010.CalcNoR getCalcNoR() {
		return aCalcNoR;
	}

	/**
	 * aCalcNoRを作成します。
	 *
	 * @return CalcNoR
	 */
	public mcframe.clientMGUB.MGUBP0010.CalcNoR createCalcNoR() {
		return mcframe.clientMGUB.MGUBP0010.CalcNoR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCalcNoR())) ret.add(getCalcNoR());
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
		if(aCnt == getCalcNoR()) return "CalcNo";
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
		if(bId.equals("CalcNo")) return getCalcNoR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CalcNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGUBP_CalcNo_H_MC_A() {
		aCalcNoR = createCalcNoR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MGUBP_CalcNo_H_MC_A(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		aCalcNoR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGUBP_CalcNo_H_MC.jbCreateCalcNo((MGUBP_CalcNo_H)this);
	}

	/**
	 * [CalcNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCalcNo(MGUBP_CalcNo_H p) {
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

	
	/** [CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter CalcNo_calc_no_p = null;

	/**
	 * [CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCalcNo_calc_no_ListPutter() {
		if (CalcNo_calc_no_p == null) {
			CalcNo_calc_no_p = createCalcNo_calc_no_ListPutter(CalcNo_calc_no, "calc_no", "rmrks");

		}
		return CalcNo_calc_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MGUBP_CalcNo_H create(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		MGUBP_CalcNo_H p = new MGUBP_CalcNo_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGUBP_CalcNo_H create(){
		MGUBP_CalcNo_H p = new MGUBP_CalcNo_H();
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
		MGUBP_CalcNo_H_MC.jbfInitCalcNo((MGUBP_CalcNo_H)this);
		MGUBP_CalcNo_H_MC.jbInitCalcNo((MGUBP_CalcNo_H)this);
	}

	/**
	 * [CalcNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCalcNo(MGUBP_CalcNo_H p) {
		// ブロック関連の初期化
		p.CalcNoPanel = p.beansFactory.createPanel("CalcNo");
		// ブロックの項目の初期化
		p.CalcNo_calc_no_Label = p.beansFactory.createLabel("CalcNo.calc_no_Label");
		p.CalcNo_calc_no = p.beansFactory.createTextComboBox("CalcNo.calc_no");
		p.CalcNo_calc_no.setLabel(p.CalcNo_calc_no_Label);
		p.CalcNo_rmrks = p.beansFactory.createTextField("CalcNo.rmrks");
	}

	/**
	 * [CalcNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCalcNo(MGUBP_CalcNo_H p) {
		// ブロック関連の初期化
		p.add(p.CalcNoPanel);
		p.setLastBeans(p.CalcNoPanel);
		// ブロックの項目の初期化
		p.CalcNo_calc_no.setListType(MCListType.STRICT);
		p.CalcNo_calc_no.setLinkBeans(p.CalcNo_rmrks);
		p.CalcNoPanel.add(p.CalcNo_calc_no_Label);
		p.CalcNoPanel.add(p.CalcNo_calc_no);
		p.CalcNoPanel.setLastBeans(p.CalcNo_calc_no);
		p.CalcNo_calc_no.setNextBeans(p.CalcNo_rmrks);
		p.CalcNo_calc_no.setRow(p.getCalcNoR(), mcframe.clientMGUB.MGUBP0010.CalcNoR.calc_no_META);
		p.CalcNoPanel.add(p.CalcNo_rmrks);
		p.CalcNo_rmrks.setRow(p.getCalcNoR(), mcframe.clientMGUB.MGUBP0010.CalcNoR.rmrks_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MGUBP_CalcNo_H_MC.mcInitCalcNo((MGUBP_CalcNo_H)this);

		// [ENABLE]ステータスのモードの設定
		MGUBP_CalcNo_H_MC.statusInitENABLE_CalcNo((MGUBP_CalcNo_H)this);

		// [DISABLE]ステータスのモードの設定
		MGUBP_CalcNo_H_MC.statusInitDISABLE_CalcNo((MGUBP_CalcNo_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MGUBP_CalcNo_H_MC.statusInitREAD__ONLY_CalcNo((MGUBP_CalcNo_H)this);

		// [REQUIRED]ステータスのモードの設定
		MGUBP_CalcNo_H_MC.statusInitREQUIRED_CalcNo((MGUBP_CalcNo_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MGUBP_CalcNo_H_MC.statusInitINVISIBLE_CalcNo((MGUBP_CalcNo_H)this);

	}

	/**
	 *  [CalcNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCalcNo(MGUBP_CalcNo_H p) {
		p.CalcNo_calc_no.setListListener(p);
		p.CalcNo_calc_no.addAllListener(p);
		p.CalcNo_rmrks.setListListener(p);
		p.CalcNo_rmrks.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_CalcNo(MGUBP_CalcNo_H p){
		p.CalcNo_calc_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.CalcNo_rmrks.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_CalcNo(MGUBP_CalcNo_H p){
		p.CalcNo_calc_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.CalcNo_rmrks.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_CalcNo(MGUBP_CalcNo_H p){
		p.CalcNo_calc_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.CalcNo_rmrks.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_CalcNo(MGUBP_CalcNo_H p){
		p.CalcNo_calc_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.CalcNo_rmrks.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[CalcNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_CalcNo(MGUBP_CalcNo_H p){
		p.CalcNo_calc_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.CalcNo_rmrks.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		CalcNo_calc_no.getListConfig().setPutter(getCalcNo_calc_no_ListPutter());
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
	 * [CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == CalcNo_calc_no) return getCalcNo_calc_no(row, info);
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
		if (vc == CalcNo_calc_no) return doCalcNo_calc_no_VC(info);
		if (vc == CalcNo_rmrks) return doCalcNo_rmrks_VC(info);
		return true;
	}

	/**
	 * [CalcNo]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCalcNo_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CalcNo]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCalcNo_rmrks_VC(MCEventInfo info){
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
		if (nc == CalcNo_calc_no) doCalcNo_calc_no_NC(info);
		else if (nc == CalcNo_rmrks) doCalcNo_rmrks_NC(info);
	}

	/**
	 * [CalcNo]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [CalcNo]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_rmrks_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CalcNo_calc_no) doCalcNo_calc_no_NE(info);
		else if (ne == CalcNo_rmrks) doCalcNo_rmrks_NE(info);
	}

	/**
	 * [CalcNo]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [CalcNo]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_rmrks_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CalcNo_calc_no) doCalcNo_calc_no_NX(info);
		else if (nx == CalcNo_rmrks) doCalcNo_rmrks_NX(info);
	}

	/**
	 * [CalcNo]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [CalcNo]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_rmrks_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == CalcNo_calc_no) doCalcNo_calc_no_LC(info);
		else if (lc == CalcNo_rmrks) doCalcNo_rmrks_LC(info);
	}

	/**
	 * [CalcNo]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [CalcNo]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalcNo_rmrks_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}