package mcframe.clientMAUB.MAUBP5120;

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
 * 画面"MAUBP_StrLn_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_StrLn_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StrLn]ブロック関連のField定義
	public MCPanel StrLnPanel = null;
	public MCScrollPane StrLnScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5120.StrLnR> StrLnTable = null;
	// [StrLn]ブロックの項目のField定義
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStrLn_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnStrLn_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnStrLn_str_ln_cd_none_flg = null;
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
	
	/** [StrLn]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5120.StrLnR> aStrLnL;

	/**
	 * コピーによってaStrLnLを設定します。
	 *
	 * aStrLnLのインスタンスは変更されません。
	 *
	 * @param dataset StrLnL
	 */
	public void setStrLnL(MCList<mcframe.clientMAUB.MAUBP5120.StrLnR> aList) {
		if (getStrLnL() != aList) {
			getStrLnL().setAll(aList);
		}
	}

	/**
	 * [StrLn]ブロックのコンテナaStrLnLを返します。
	 *
	 * @return StrLnL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5120.StrLnR> getStrLnL() {
		return aStrLnL;
	}

	/**
	 * aStrLnRを作成します。
	 *
	 * @return StrLnR
	 */
	public mcframe.clientMAUB.MAUBP5120.StrLnR createStrLnR() {
		return mcframe.clientMAUB.MAUBP5120.StrLnR.create();
	}

	/**
	 * aStrLnLを作成します。
	 *
	 * @return StrLnL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5120.StrLnR> createStrLnL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	}

	/**
	 * StrLnTableを初期化します。
	 */
	protected void createStrLnTable(){
		if(StrLnTable == null){
			StrLnTable = beansFactory.createTable2("StrLn.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStrLnL())) ret.add(getStrLnL());
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
		if(aCnt == getStrLnL()) return "StrLn";
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
		if(bId.equals("StrLn")) return getStrLnL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StrLnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StrLn_D_MC_A() {
		aStrLnL = createStrLnL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_StrLn_D_MC_A(String name) {
		aStrLnL = createStrLnL();
		createStrLnTable();
		StrLnTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_StrLn_D_MC.jbCreateStrLn((MAUBP_StrLn_D)this);
	}

	/**
	 * [StrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStrLn(MAUBP_StrLn_D p) {
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

	
	/** [StrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter StrLn_str_ln_cd_p = null;

	/**
	 * [StrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getStrLn_str_ln_cd_ListPutter() {
		if (StrLn_str_ln_cd_p == null) {
			StrLn_str_ln_cd_p = createStrLn_str_ln_cd_ListPutter(columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return StrLn_str_ln_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_StrLn_D create(){
		MAUBP_StrLn_D p = new MAUBP_StrLn_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_StrLn_D create(String name){
		MAUBP_StrLn_D p = new MAUBP_StrLn_D(name);
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
		MAUBP_StrLn_D_MC.jbfInitStrLn((MAUBP_StrLn_D)this);
		MAUBP_StrLn_D_MC.jbInitStrLn((MAUBP_StrLn_D)this);
	}

	/**
	 * [StrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStrLn(MAUBP_StrLn_D p) {
		// ブロック関連の初期化
		p.StrLnPanel = p.beansFactory.createPanel("StrLn");
		p.StrLnScrollPane = p.beansFactory.createScrollPane("StrLn.scroll");
		p.createStrLnTable();
		// ブロックの項目の初期化
		p.columnStrLn_str_ln_cd = p.beansFactory.createTableColumn("StrLn.str_ln_cd", MCColumnType.TEXT_COMBO);
		p.columnStrLn_str_ln_nm = p.beansFactory.createTableColumn("StrLn.str_ln_nm", MCColumnType.TEXT);
		p.columnStrLn_str_ln_cd_none_flg = p.beansFactory.createTableColumn("StrLn.str_ln_cd_none_flg", MCColumnType.CHECK);
	}

	/**
	 * [StrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStrLn(MAUBP_StrLn_D p) {
		// ブロック関連の初期化
		p.add(p.StrLnPanel);
		p.setLastBeans(p.StrLnPanel);
		p.StrLnPanel.add(p.StrLnScrollPane);
		p.StrLnPanel.setLastBeans(p.StrLnTable);
		p.StrLnScrollPane.setViewportView(p.StrLnTable);
		p.StrLnTable.setList(p.getStrLnL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_StrLn_D_MC.mcInitStrLn((MAUBP_StrLn_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_StrLn_D_MC.statusInitENABLE_StrLn((MAUBP_StrLn_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_StrLn_D_MC.statusInitDISABLE_StrLn((MAUBP_StrLn_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_StrLn_D_MC.statusInitREAD__ONLY_StrLn((MAUBP_StrLn_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_StrLn_D_MC.statusInitREQUIRED_StrLn((MAUBP_StrLn_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_StrLn_D_MC.statusInitINVISIBLE_StrLn((MAUBP_StrLn_D)this);

	}

	/**
	 *  [StrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStrLn(MAUBP_StrLn_D p) {
		p.StrLnTable.addAllListener(p);
		p.columnStrLn_str_ln_cd.addAllListener(p);
		p.columnStrLn_str_ln_cd.setListListener(p);
		p.columnStrLn_str_ln_nm.addAllListener(p);
		p.columnStrLn_str_ln_nm.setListListener(p);
		p.columnStrLn_str_ln_cd_none_flg.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StrLn(MAUBP_StrLn_D p){
		p.columnStrLn_str_ln_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnStrLn_str_ln_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnStrLn_str_ln_cd_none_flg.putMode(p, ENABLE, MCMode.REQUIRED);

	}

	/**
	 * [DISABLE]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StrLn(MAUBP_StrLn_D p){
		p.columnStrLn_str_ln_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnStrLn_str_ln_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnStrLn_str_ln_cd_none_flg.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StrLn(MAUBP_StrLn_D p){
		p.columnStrLn_str_ln_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnStrLn_str_ln_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnStrLn_str_ln_cd_none_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StrLn(MAUBP_StrLn_D p){
		p.columnStrLn_str_ln_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnStrLn_str_ln_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnStrLn_str_ln_cd_none_flg.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StrLn(MAUBP_StrLn_D p){
		p.columnStrLn_str_ln_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnStrLn_str_ln_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnStrLn_str_ln_cd_none_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_StrLn_D_MC.setTableConfigStrLn((MAUBP_StrLn_D)this);
	}

	/**
	 * [StrLn]ブロックのTableの設定
	 */
	protected static void setTableConfigStrLn(MAUBP_StrLn_D p) {
		p.columnStrLn_str_ln_cd.setMeta(mcframe.clientMAUB.MAUBP5120.StrLnR.str_ln_cd_META);
		p.columnStrLn_str_ln_cd.addLinkBeans(p.columnStrLn_str_ln_nm);
		p.StrLnTable.addColumnConfig(p.columnStrLn_str_ln_cd);
		p.columnStrLn_str_ln_nm.setMeta(mcframe.clientMAUB.MAUBP5120.StrLnR.str_ln_nm_META);
		p.StrLnTable.addColumnConfig(p.columnStrLn_str_ln_nm);
		p.columnStrLn_str_ln_cd_none_flg.setMeta(mcframe.clientMAUB.MAUBP5120.StrLnR.str_ln_cd_none_flg_META);
		p.StrLnTable.addColumnConfig(p.columnStrLn_str_ln_cd_none_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnStrLn_str_ln_cd.getListConfig().setPutter(getStrLn_str_ln_cd_ListPutter());
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
	 * [StrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnStrLn_str_ln_cd) return getStrLn_str_ln_cd(row, info);
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
		if (vc == StrLnTable) return doStrLn_VC(info);
		if (vc == columnStrLn_str_ln_cd) return doStrLn_str_ln_cd_VC(info);
		if (vc == columnStrLn_str_ln_nm) return doStrLn_str_ln_nm_VC(info);
		if (vc == columnStrLn_str_ln_cd_none_flg) return doStrLn_str_ln_cd_none_flg_VC(info);
		return true;
	}

	/**
	 * [StrLn]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStrLn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StrLn]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStrLn_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StrLn]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStrLn_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StrLn]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStrLn_str_ln_cd_none_flg_VC(MCEventInfo info){
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
		if (nc == StrLnTable) doStrLn_NC(info);
		else if (nc == columnStrLn_str_ln_cd) doStrLn_str_ln_cd_NC(info);
		else if (nc == columnStrLn_str_ln_nm) doStrLn_str_ln_nm_NC(info);
		else if (nc == columnStrLn_str_ln_cd_none_flg) doStrLn_str_ln_cd_none_flg_NC(info);
	}

	/**
	 * [StrLn]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_NC(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StrLnTable) doStrLn_NE(info);
		else if (ne == columnStrLn_str_ln_cd) doStrLn_str_ln_cd_NE(info);
		else if (ne == columnStrLn_str_ln_nm) doStrLn_str_ln_nm_NE(info);
		else if (ne == columnStrLn_str_ln_cd_none_flg) doStrLn_str_ln_cd_none_flg_NE(info);
	}

	/**
	 * [StrLn]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_NE(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StrLnTable) doStrLn_NX(info);
		else if (nx == columnStrLn_str_ln_cd) doStrLn_str_ln_cd_NX(info);
		else if (nx == columnStrLn_str_ln_nm) doStrLn_str_ln_nm_NX(info);
		else if (nx == columnStrLn_str_ln_cd_none_flg) doStrLn_str_ln_cd_none_flg_NX(info);
	}

	/**
	 * [StrLn]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_NX(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnStrLn_str_ln_cd) doStrLn_str_ln_cd_LC(info);
		else if (lc == columnStrLn_str_ln_nm) doStrLn_str_ln_nm_LC(info);
	}

	/**
	 * [StrLn]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [StrLn]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStrLn_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}