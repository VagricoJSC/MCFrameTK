package mcframe.clientMAUB.MAUBP0240;

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
 * 画面"MAUBP_Term_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Term_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Term]ブロック関連のField定義
	public MCPanel TermPanel = null;
	// [Term]ブロックの項目のField定義
	public MCLabel Term_term_fr_Label = null;
	/**
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Term_term_fr = null;
	/**
	 * Term FROM name 期ＦＲＯＭ名称.<p>
	 *
	 */
	public MCTextField Term_term_fr_nm = null;
	public MCLabel Term_term_to_Label = null;
	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Term_term_to = null;
	/**
	 * Term TO name 期ＴＯ名称.<p>
	 *
	 */
	public MCTextField Term_term_to_nm = null;
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
	
	/** [Term]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0240.TermR aTermR;

	/**
	 * 項目コピーによってaTermRを設定します。
	 *
	 * aTermRのインスタンスは変更されません。
	 *
	 * @param row TermR
	 */
	public void setTermR(mcframe.clientMAUB.MAUBP0240.TermR row) {
		if (row != null) {
			MCRow.copyall(getTermR(), row);
		}
	}

	/**
	 * [Term]ブロックのコンテナaTermRを返します。
	 *
	 * @return TermR
	 */
	public mcframe.clientMAUB.MAUBP0240.TermR getTermR() {
		return aTermR;
	}

	/**
	 * aTermRを作成します。
	 *
	 * @return TermR
	 */
	public mcframe.clientMAUB.MAUBP0240.TermR createTermR() {
		return mcframe.clientMAUB.MAUBP0240.TermR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTermR())) ret.add(getTermR());
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
		if(aCnt == getTermR()) return "Term";
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
		if(bId.equals("Term")) return getTermR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TermPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Term_H_MC_A() {
		aTermR = createTermR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Term_H_MC_A(mcframe.clientMAUB.MAUBP0240.TermR row){
		aTermR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Term_H_MC.jbCreateTerm((MAUBP_Term_H)this);
	}

	/**
	 * [Term]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTerm(MAUBP_Term_H p) {
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

	
	/** [Term_term_fr_ListPutter]の定義 */
	private MCListPutter Term_term_fr_p = null;

	/**
	 * [Term_term_fr_ListPutter]の取得
	 */
	protected MCListPutter getTerm_term_fr_ListPutter() {
		if (Term_term_fr_p == null) {
			Term_term_fr_p = createTerm_term_fr_ListPutter(Term_term_fr, "term_fr", "term_fr_nm");

		}
		return Term_term_fr_p;
	}
	
	
	/** [Term_term_to_ListPutter]の定義 */
	private MCListPutter Term_term_to_p = null;

	/**
	 * [Term_term_to_ListPutter]の取得
	 */
	protected MCListPutter getTerm_term_to_ListPutter() {
		if (Term_term_to_p == null) {
			Term_term_to_p = createTerm_term_to_ListPutter(Term_term_to, "term_to", "term_to_nm");

		}
		return Term_term_to_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_Term_H create(mcframe.clientMAUB.MAUBP0240.TermR row){
		MAUBP_Term_H p = new MAUBP_Term_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Term_H create(){
		MAUBP_Term_H p = new MAUBP_Term_H();
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
		MAUBP_Term_H_MC.jbfInitTerm((MAUBP_Term_H)this);
		MAUBP_Term_H_MC.jbInitTerm((MAUBP_Term_H)this);
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTerm(MAUBP_Term_H p) {
		// ブロック関連の初期化
		p.TermPanel = p.beansFactory.createPanel("Term");
		// ブロックの項目の初期化
		p.Term_term_fr_Label = p.beansFactory.createLabel("Term.term_fr_Label");
		p.Term_term_fr = p.beansFactory.createDateComboBox("Term.term_fr");
		p.Term_term_fr.setLabel(p.Term_term_fr_Label);
		p.Term_term_fr_nm = p.beansFactory.createTextField("Term.term_fr_nm");
		p.Term_term_to_Label = p.beansFactory.createLabel("Term.term_to_Label");
		p.Term_term_to = p.beansFactory.createDateComboBox("Term.term_to");
		p.Term_term_to.setLabel(p.Term_term_to_Label);
		p.Term_term_to_nm = p.beansFactory.createTextField("Term.term_to_nm");
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTerm(MAUBP_Term_H p) {
		// ブロック関連の初期化
		p.add(p.TermPanel);
		p.setLastBeans(p.TermPanel);
		// ブロックの項目の初期化
		p.Term_term_fr.setListType(MCListType.STRICT);
		p.Term_term_fr.setLinkBeans(p.Term_term_fr_nm);
		p.TermPanel.add(p.Term_term_fr_Label);
		p.TermPanel.add(p.Term_term_fr);
		p.TermPanel.setLastBeans(p.Term_term_fr);
		p.Term_term_fr.setNextBeans(p.Term_term_fr_nm);
		p.Term_term_fr.setRow(p.getTermR(), mcframe.clientMAUB.MAUBP0240.TermR.term_fr_META);
		p.Term_term_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.TermPanel.add(p.Term_term_fr_nm);
		p.Term_term_fr_nm.setNextBeans(p.Term_term_to);
		p.Term_term_fr_nm.setRow(p.getTermR(), mcframe.clientMAUB.MAUBP0240.TermR.term_fr_nm_META);
		p.Term_term_to.setListType(MCListType.STRICT);
		p.Term_term_to.setLinkBeans(p.Term_term_to_nm);
		p.TermPanel.add(p.Term_term_to_Label);
		p.TermPanel.add(p.Term_term_to);
		p.Term_term_to.setNextBeans(p.Term_term_to_nm);
		p.Term_term_to.setRow(p.getTermR(), mcframe.clientMAUB.MAUBP0240.TermR.term_to_META);
		p.Term_term_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.TermPanel.add(p.Term_term_to_nm);
		p.Term_term_to_nm.setRow(p.getTermR(), mcframe.clientMAUB.MAUBP0240.TermR.term_to_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Term_H_MC.mcInitTerm((MAUBP_Term_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Term_H_MC.statusInitENABLE_Term((MAUBP_Term_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Term_H_MC.statusInitDISABLE_Term((MAUBP_Term_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Term_H_MC.statusInitREAD__ONLY_Term((MAUBP_Term_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Term_H_MC.statusInitREQUIRED_Term((MAUBP_Term_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Term_H_MC.statusInitINVISIBLE_Term((MAUBP_Term_H)this);

	}

	/**
	 *  [Term]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTerm(MAUBP_Term_H p) {
		p.Term_term_fr.setListListener(p);
		p.Term_term_fr.addAllListener(p);
		p.Term_term_fr_nm.setListListener(p);
		p.Term_term_fr_nm.addAllListener(p);
		p.Term_term_to.setListListener(p);
		p.Term_term_to.addAllListener(p);
		p.Term_term_to_nm.setListListener(p);
		p.Term_term_to_nm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Term(MAUBP_Term_H p){
		p.Term_term_fr.putMode(p, ENABLE, MCMode.ENABLE);
		p.Term_term_fr_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Term_term_to.putMode(p, ENABLE, MCMode.ENABLE);
		p.Term_term_to_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Term(MAUBP_Term_H p){
		p.Term_term_fr.putMode(p, DISABLE, MCMode.DISABLE);
		p.Term_term_fr_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.Term_term_to.putMode(p, DISABLE, MCMode.DISABLE);
		p.Term_term_to_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Term(MAUBP_Term_H p){
		p.Term_term_fr.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Term_term_fr_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Term_term_to.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Term_term_to_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Term(MAUBP_Term_H p){
		p.Term_term_fr.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Term_term_fr_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.Term_term_to.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Term_term_to_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Term(MAUBP_Term_H p){
		p.Term_term_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Term_term_fr_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Term_term_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Term_term_to_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		Term_term_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Term_term_fr.getListConfig().setPutter(getTerm_term_fr_ListPutter());
		Term_term_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Term_term_to.getListConfig().setPutter(getTerm_term_to_ListPutter());
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
	 * [Term_term_fr_ListPutter]の作成
	 */
	protected MCListPutter createTerm_term_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Term");
		return lp;
	}
	 
	/**
	 * [Term_term_to_ListPutter]の作成
	 */
	protected MCListPutter createTerm_term_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Term");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Term_term_fr) return getTerm_term_fr(row, info);
		if(combo == Term_term_to) return getTerm_term_to(row, info);
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
		if (vc == Term_term_fr) return doTerm_term_fr_VC(info);
		if (vc == Term_term_fr_nm) return doTerm_term_fr_nm_VC(info);
		if (vc == Term_term_to) return doTerm_term_to_VC(info);
		if (vc == Term_term_to_nm) return doTerm_term_to_nm_VC(info);
		return true;
	}

	/**
	 * [Term]パネルの[term_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Term]パネルの[term_fr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_fr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Term]パネルの[term_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Term]パネルの[term_to_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_to_nm_VC(MCEventInfo info){
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
		if (nc == Term_term_fr) doTerm_term_fr_NC(info);
		else if (nc == Term_term_fr_nm) doTerm_term_fr_nm_NC(info);
		else if (nc == Term_term_to) doTerm_term_to_NC(info);
		else if (nc == Term_term_to_nm) doTerm_term_to_nm_NC(info);
	}

	/**
	 * [Term]パネルの[term_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_NC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_fr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_NC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Term_term_fr) doTerm_term_fr_NE(info);
		else if (ne == Term_term_fr_nm) doTerm_term_fr_nm_NE(info);
		else if (ne == Term_term_to) doTerm_term_to_NE(info);
		else if (ne == Term_term_to_nm) doTerm_term_to_nm_NE(info);
	}

	/**
	 * [Term]パネルの[term_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_NE(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_fr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_NE(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Term_term_fr) doTerm_term_fr_NX(info);
		else if (nx == Term_term_fr_nm) doTerm_term_fr_nm_NX(info);
		else if (nx == Term_term_to) doTerm_term_to_NX(info);
		else if (nx == Term_term_to_nm) doTerm_term_to_nm_NX(info);
	}

	/**
	 * [Term]パネルの[term_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_NX(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_fr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_NX(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Term_term_fr) doTerm_term_fr_LC(info);
		else if (lc == Term_term_fr_nm) doTerm_term_fr_nm_LC(info);
		else if (lc == Term_term_to) doTerm_term_to_LC(info);
		else if (lc == Term_term_to_nm) doTerm_term_to_nm_LC(info);
	}

	/**
	 * [Term]パネルの[term_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_LC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_fr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_fr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_LC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_to_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_to_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Term_term_fr]の作成メソッド
	 */
	public MCList getTerm_term_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Term_term_to]の作成メソッド
	 */
	public MCList getTerm_term_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTerm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}