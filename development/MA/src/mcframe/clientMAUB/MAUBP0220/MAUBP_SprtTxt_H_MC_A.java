package mcframe.clientMAUB.MAUBP0220;

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
 * 画面"MAUBP_SprtTxt_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_SprtTxt_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Txt]ブロック関連のField定義
	public MCPanel TxtPanel = null;
	// [Txt]ブロックの項目のField定義
	public MCLabel Txt_txt_Label = null;
	/**
	 * Dummy name ダミー名称.<p>
	 *
	 */
	public MCTextComboBox Txt_txt = null;
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
	
	/** [Txt]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0220.TxtR aTxtR;

	/**
	 * 項目コピーによってaTxtRを設定します。
	 *
	 * aTxtRのインスタンスは変更されません。
	 *
	 * @param row TxtR
	 */
	public void setTxtR(mcframe.clientMAUB.MAUBP0220.TxtR row) {
		if (row != null) {
			MCRow.copyall(getTxtR(), row);
		}
	}

	/**
	 * [Txt]ブロックのコンテナaTxtRを返します。
	 *
	 * @return TxtR
	 */
	public mcframe.clientMAUB.MAUBP0220.TxtR getTxtR() {
		return aTxtR;
	}

	/**
	 * aTxtRを作成します。
	 *
	 * @return TxtR
	 */
	public mcframe.clientMAUB.MAUBP0220.TxtR createTxtR() {
		return mcframe.clientMAUB.MAUBP0220.TxtR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTxtR())) ret.add(getTxtR());
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
		if(aCnt == getTxtR()) return "Txt";
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
		if(bId.equals("Txt")) return getTxtR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TxtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_SprtTxt_H_MC_A() {
		aTxtR = createTxtR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_SprtTxt_H_MC_A(mcframe.clientMAUB.MAUBP0220.TxtR row){
		aTxtR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_SprtTxt_H_MC.jbCreateTxt((MAUBP_SprtTxt_H)this);
	}

	/**
	 * [Txt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTxt(MAUBP_SprtTxt_H p) {
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

	
	/** [Txt_txt_ListPutter]の定義 */
	private MCListPutter Txt_txt_p = null;

	/**
	 * [Txt_txt_ListPutter]の取得
	 */
	protected MCListPutter getTxt_txt_ListPutter() {
		if (Txt_txt_p == null) {
			Txt_txt_p = createTxt_txt_ListPutter(Txt_txt, "txt");

		}
		return Txt_txt_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_SprtTxt_H create(mcframe.clientMAUB.MAUBP0220.TxtR row){
		MAUBP_SprtTxt_H p = new MAUBP_SprtTxt_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_SprtTxt_H create(){
		MAUBP_SprtTxt_H p = new MAUBP_SprtTxt_H();
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
		MAUBP_SprtTxt_H_MC.jbfInitTxt((MAUBP_SprtTxt_H)this);
		MAUBP_SprtTxt_H_MC.jbInitTxt((MAUBP_SprtTxt_H)this);
	}

	/**
	 * [Txt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTxt(MAUBP_SprtTxt_H p) {
		// ブロック関連の初期化
		p.TxtPanel = p.beansFactory.createPanel("Txt");
		// ブロックの項目の初期化
		p.Txt_txt_Label = p.beansFactory.createLabel("Txt.txt_Label");
		p.Txt_txt = p.beansFactory.createTextComboBox("Txt.txt");
		p.Txt_txt.setLabel(p.Txt_txt_Label);
	}

	/**
	 * [Txt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTxt(MAUBP_SprtTxt_H p) {
		// ブロック関連の初期化
		p.add(p.TxtPanel);
		p.setLastBeans(p.TxtPanel);
		// ブロックの項目の初期化
		p.Txt_txt.setListType(MCListType.FREE);
		p.TxtPanel.add(p.Txt_txt_Label);
		p.TxtPanel.add(p.Txt_txt);
		p.TxtPanel.setLastBeans(p.Txt_txt);
		p.Txt_txt.setRow(p.getTxtR(), mcframe.clientMAUB.MAUBP0220.TxtR.txt_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_SprtTxt_H_MC.mcInitTxt((MAUBP_SprtTxt_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_SprtTxt_H_MC.statusInitENABLE_Txt((MAUBP_SprtTxt_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_SprtTxt_H_MC.statusInitDISABLE_Txt((MAUBP_SprtTxt_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_SprtTxt_H_MC.statusInitREAD__ONLY_Txt((MAUBP_SprtTxt_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_SprtTxt_H_MC.statusInitREQUIRED_Txt((MAUBP_SprtTxt_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_SprtTxt_H_MC.statusInitINVISIBLE_Txt((MAUBP_SprtTxt_H)this);

	}

	/**
	 *  [Txt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTxt(MAUBP_SprtTxt_H p) {
		p.Txt_txt.setListListener(p);
		p.Txt_txt.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Txt(MAUBP_SprtTxt_H p){
		p.Txt_txt.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Txt(MAUBP_SprtTxt_H p){
		p.Txt_txt.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Txt(MAUBP_SprtTxt_H p){
		p.Txt_txt.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Txt(MAUBP_SprtTxt_H p){
		p.Txt_txt.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Txt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Txt(MAUBP_SprtTxt_H p){
		p.Txt_txt.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		Txt_txt.setListVisibleColumn(MCListLogic.getViewColumnName());
		Txt_txt.getListConfig().setPutter(getTxt_txt_ListPutter());
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
	 * [Txt_txt_ListPutter]の作成
	 */
	protected MCListPutter createTxt_txt_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Txt_txt) return getTxt_txt(row, info);
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
		if (vc == Txt_txt) return doTxt_txt_VC(info);
		return true;
	}

	/**
	 * [Txt]パネルの[txt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTxt_txt_VC(MCEventInfo info){
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
		if (nc == Txt_txt) doTxt_txt_NC(info);
	}

	/**
	 * [Txt]パネルの[txt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Txt_txt) doTxt_txt_NE(info);
	}

	/**
	 * [Txt]パネルの[txt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Txt_txt) doTxt_txt_NX(info);
	}

	/**
	 * [Txt]パネルの[txt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Txt_txt) doTxt_txt_LC(info);
	}

	/**
	 * [Txt]パネルの[txt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTxt_txt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Txt_txt]の作成メソッド
	 */
	public MCList getTxt_txt(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}