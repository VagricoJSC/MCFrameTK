package mcframe.clientMAUB.MAUBP0440;

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
 * 画面"MAUBP_SnoFlg_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_SnoFlg_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0440";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SnoFlg]ブロック関連のField定義
	public MCPanel SnoFlgPanel = null;
	// [SnoFlg]ブロックの項目のField定義
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox SnoFlg_sno1_flg = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox SnoFlg_sno2_flg = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox SnoFlg_sno3_flg = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox SnoFlg_sno4_flg = null;
	/** [REQUIRED]モードを表す定数 */
	public static final String REQUIRED = "REQUIRED";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{REQUIRED, READ_ONLY};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [SnoFlg]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0440.SnoFlgR aSnoFlgR;

	/**
	 * 項目コピーによってaSnoFlgRを設定します。
	 *
	 * aSnoFlgRのインスタンスは変更されません。
	 *
	 * @param row SnoFlgR
	 */
	public void setSnoFlgR(mcframe.clientMAUB.MAUBP0440.SnoFlgR row) {
		if (row != null) {
			MCRow.copyall(getSnoFlgR(), row);
		}
	}

	/**
	 * [SnoFlg]ブロックのコンテナaSnoFlgRを返します。
	 *
	 * @return SnoFlgR
	 */
	public mcframe.clientMAUB.MAUBP0440.SnoFlgR getSnoFlgR() {
		return aSnoFlgR;
	}

	/**
	 * aSnoFlgRを作成します。
	 *
	 * @return SnoFlgR
	 */
	public mcframe.clientMAUB.MAUBP0440.SnoFlgR createSnoFlgR() {
		return mcframe.clientMAUB.MAUBP0440.SnoFlgR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSnoFlgR())) ret.add(getSnoFlgR());
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
		if(aCnt == getSnoFlgR()) return "SnoFlg";
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
		if(bId.equals("SnoFlg")) return getSnoFlgR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SnoFlgPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_SnoFlg_H_MC_A() {
		aSnoFlgR = createSnoFlgR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_SnoFlg_H_MC_A(mcframe.clientMAUB.MAUBP0440.SnoFlgR row){
		aSnoFlgR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_SnoFlg_H_MC.jbCreateSnoFlg((MAUBP_SnoFlg_H)this);
	}

	/**
	 * [SnoFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSnoFlg(MAUBP_SnoFlg_H p) {
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
	public static MAUBP_SnoFlg_H create(mcframe.clientMAUB.MAUBP0440.SnoFlgR row){
		MAUBP_SnoFlg_H p = new MAUBP_SnoFlg_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_SnoFlg_H create(){
		MAUBP_SnoFlg_H p = new MAUBP_SnoFlg_H();
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
		MAUBP_SnoFlg_H_MC.jbfInitSnoFlg((MAUBP_SnoFlg_H)this);
		MAUBP_SnoFlg_H_MC.jbInitSnoFlg((MAUBP_SnoFlg_H)this);
	}

	/**
	 * [SnoFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSnoFlg(MAUBP_SnoFlg_H p) {
		// ブロック関連の初期化
		p.SnoFlgPanel = p.beansFactory.createPanel("SnoFlg");
		// ブロックの項目の初期化
		p.SnoFlg_sno1_flg = p.beansFactory.createCheckBox("SnoFlg.sno1_flg");
		p.SnoFlg_sno2_flg = p.beansFactory.createCheckBox("SnoFlg.sno2_flg");
		p.SnoFlg_sno3_flg = p.beansFactory.createCheckBox("SnoFlg.sno3_flg");
		p.SnoFlg_sno4_flg = p.beansFactory.createCheckBox("SnoFlg.sno4_flg");
	}

	/**
	 * [SnoFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSnoFlg(MAUBP_SnoFlg_H p) {
		// ブロック関連の初期化
		p.add(p.SnoFlgPanel);
		p.setLastBeans(p.SnoFlgPanel);
		// ブロックの項目の初期化
		p.SnoFlgPanel.add(p.SnoFlg_sno1_flg);
		p.SnoFlgPanel.setLastBeans(p.SnoFlg_sno1_flg);
		p.SnoFlg_sno1_flg.setNextBeans(p.SnoFlg_sno2_flg);
		p.SnoFlg_sno1_flg.setRow(p.getSnoFlgR(), mcframe.clientMAUB.MAUBP0440.SnoFlgR.sno1_flg_META);
		p.SnoFlgPanel.add(p.SnoFlg_sno2_flg);
		p.SnoFlg_sno2_flg.setNextBeans(p.SnoFlg_sno3_flg);
		p.SnoFlg_sno2_flg.setRow(p.getSnoFlgR(), mcframe.clientMAUB.MAUBP0440.SnoFlgR.sno2_flg_META);
		p.SnoFlgPanel.add(p.SnoFlg_sno3_flg);
		p.SnoFlg_sno3_flg.setNextBeans(p.SnoFlg_sno4_flg);
		p.SnoFlg_sno3_flg.setRow(p.getSnoFlgR(), mcframe.clientMAUB.MAUBP0440.SnoFlgR.sno3_flg_META);
		p.SnoFlgPanel.add(p.SnoFlg_sno4_flg);
		p.SnoFlg_sno4_flg.setRow(p.getSnoFlgR(), mcframe.clientMAUB.MAUBP0440.SnoFlgR.sno4_flg_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_SnoFlg_H_MC.mcInitSnoFlg((MAUBP_SnoFlg_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_SnoFlg_H_MC.statusInitREQUIRED_SnoFlg((MAUBP_SnoFlg_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_SnoFlg_H_MC.statusInitREAD__ONLY_SnoFlg((MAUBP_SnoFlg_H)this);

	}

	/**
	 *  [SnoFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSnoFlg(MAUBP_SnoFlg_H p) {
		p.SnoFlg_sno1_flg.addAllListener(p);
		p.SnoFlg_sno2_flg.addAllListener(p);
		p.SnoFlg_sno3_flg.addAllListener(p);
		p.SnoFlg_sno4_flg.addAllListener(p);
	}

	/**
	 * [REQUIRED]ステータスの[SnoFlg]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_SnoFlg(MAUBP_SnoFlg_H p){
		p.SnoFlg_sno1_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoFlg_sno2_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoFlg_sno3_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoFlg_sno4_flg.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [READ_ONLY]ステータスの[SnoFlg]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_SnoFlg(MAUBP_SnoFlg_H p){
		p.SnoFlg_sno1_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoFlg_sno2_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoFlg_sno3_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoFlg_sno4_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);

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
	 * この画面を[REQUIRED]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQUIREDStatus() {
		status = REQUIRED;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (REQUIRED.equals(status)) {
			setREQUIREDStatus();
		}
		else if (READ_ONLY.equals(status)) {
			setREAD_ONLYStatus();
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
		if (vc == SnoFlg_sno1_flg) return doSnoFlg_sno1_flg_VC(info);
		if (vc == SnoFlg_sno2_flg) return doSnoFlg_sno2_flg_VC(info);
		if (vc == SnoFlg_sno3_flg) return doSnoFlg_sno3_flg_VC(info);
		if (vc == SnoFlg_sno4_flg) return doSnoFlg_sno4_flg_VC(info);
		return true;
	}

	/**
	 * [SnoFlg]パネルの[sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoFlg_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoFlg]パネルの[sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoFlg_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoFlg]パネルの[sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoFlg_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoFlg]パネルの[sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoFlg_sno4_flg_VC(MCEventInfo info){
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
		if (nc == SnoFlg_sno1_flg) doSnoFlg_sno1_flg_NC(info);
		else if (nc == SnoFlg_sno2_flg) doSnoFlg_sno2_flg_NC(info);
		else if (nc == SnoFlg_sno3_flg) doSnoFlg_sno3_flg_NC(info);
		else if (nc == SnoFlg_sno4_flg) doSnoFlg_sno4_flg_NC(info);
	}

	/**
	 * [SnoFlg]パネルの[sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SnoFlg_sno1_flg) doSnoFlg_sno1_flg_NE(info);
		else if (ne == SnoFlg_sno2_flg) doSnoFlg_sno2_flg_NE(info);
		else if (ne == SnoFlg_sno3_flg) doSnoFlg_sno3_flg_NE(info);
		else if (ne == SnoFlg_sno4_flg) doSnoFlg_sno4_flg_NE(info);
	}

	/**
	 * [SnoFlg]パネルの[sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SnoFlg_sno1_flg) doSnoFlg_sno1_flg_NX(info);
		else if (nx == SnoFlg_sno2_flg) doSnoFlg_sno2_flg_NX(info);
		else if (nx == SnoFlg_sno3_flg) doSnoFlg_sno3_flg_NX(info);
		else if (nx == SnoFlg_sno4_flg) doSnoFlg_sno4_flg_NX(info);
	}

	/**
	 * [SnoFlg]パネルの[sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoFlg]パネルの[sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoFlg_sno4_flg_NX(MCEventInfo info){
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