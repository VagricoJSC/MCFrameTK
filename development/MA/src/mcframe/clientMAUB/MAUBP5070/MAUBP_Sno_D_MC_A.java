package mcframe.clientMAUB.MAUBP5070;

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
 * 画面"MAUBP_Sno_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Sno_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Sno]ブロック関連のField定義
	public MCPanel SnoPanel = null;
	public MCScrollPane SnoScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5070.SnoR> SnoTable = null;
	// [Sno]ブロックの項目のField定義
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno1 = null;
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno1_null_flg = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno2 = null;
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno2_null_flg = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno3 = null;
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno3_null_flg = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno4 = null;
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public MCColumnConfig columnSno_sno4_null_flg = null;
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
	
	/** [Sno]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5070.SnoR> aSnoL;

	/**
	 * コピーによってaSnoLを設定します。
	 *
	 * aSnoLのインスタンスは変更されません。
	 *
	 * @param dataset SnoL
	 */
	public void setSnoL(MCList<mcframe.clientMAUB.MAUBP5070.SnoR> aList) {
		if (getSnoL() != aList) {
			getSnoL().setAll(aList);
		}
	}

	/**
	 * [Sno]ブロックのコンテナaSnoLを返します。
	 *
	 * @return SnoL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5070.SnoR> getSnoL() {
		return aSnoL;
	}

	/**
	 * aSnoRを作成します。
	 *
	 * @return SnoR
	 */
	public mcframe.clientMAUB.MAUBP5070.SnoR createSnoR() {
		return mcframe.clientMAUB.MAUBP5070.SnoR.create();
	}

	/**
	 * aSnoLを作成します。
	 *
	 * @return SnoL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5070.SnoR> createSnoL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5070.SnoR.class);
	}

	/**
	 * SnoTableを初期化します。
	 */
	protected void createSnoTable(){
		if(SnoTable == null){
			SnoTable = beansFactory.createTable2("Sno.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSnoL())) ret.add(getSnoL());
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
		if(aCnt == getSnoL()) return "Sno";
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
		if(bId.equals("Sno")) return getSnoL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SnoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Sno_D_MC_A() {
		aSnoL = createSnoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Sno_D_MC_A(String name) {
		aSnoL = createSnoL();
		createSnoTable();
		SnoTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Sno_D_MC.jbCreateSno((MAUBP_Sno_D)this);
	}

	/**
	 * [Sno]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno(MAUBP_Sno_D p) {
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
	public static MAUBP_Sno_D create(){
		MAUBP_Sno_D p = new MAUBP_Sno_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Sno_D create(String name){
		MAUBP_Sno_D p = new MAUBP_Sno_D(name);
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
		MAUBP_Sno_D_MC.jbfInitSno((MAUBP_Sno_D)this);
		MAUBP_Sno_D_MC.jbInitSno((MAUBP_Sno_D)this);
	}

	/**
	 * [Sno]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno(MAUBP_Sno_D p) {
		// ブロック関連の初期化
		p.SnoPanel = p.beansFactory.createPanel("Sno");
		p.SnoScrollPane = p.beansFactory.createScrollPane("Sno.scroll");
		p.createSnoTable();
		// ブロックの項目の初期化
		p.columnSno_sno1 = p.beansFactory.createTableColumn("Sno.sno1", MCColumnType.TEXT);
		p.columnSno_sno1_null_flg = p.beansFactory.createTableColumn("Sno.sno1_null_flg", MCColumnType.CHECK);
		p.columnSno_sno2 = p.beansFactory.createTableColumn("Sno.sno2", MCColumnType.TEXT);
		p.columnSno_sno2_null_flg = p.beansFactory.createTableColumn("Sno.sno2_null_flg", MCColumnType.CHECK);
		p.columnSno_sno3 = p.beansFactory.createTableColumn("Sno.sno3", MCColumnType.TEXT);
		p.columnSno_sno3_null_flg = p.beansFactory.createTableColumn("Sno.sno3_null_flg", MCColumnType.CHECK);
		p.columnSno_sno4 = p.beansFactory.createTableColumn("Sno.sno4", MCColumnType.TEXT);
		p.columnSno_sno4_null_flg = p.beansFactory.createTableColumn("Sno.sno4_null_flg", MCColumnType.CHECK);
	}

	/**
	 * [Sno]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno(MAUBP_Sno_D p) {
		// ブロック関連の初期化
		p.add(p.SnoPanel);
		p.setLastBeans(p.SnoPanel);
		p.SnoPanel.add(p.SnoScrollPane);
		p.SnoPanel.setLastBeans(p.SnoTable);
		p.SnoScrollPane.setViewportView(p.SnoTable);
		p.SnoTable.setList(p.getSnoL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Sno_D_MC.mcInitSno((MAUBP_Sno_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Sno_D_MC.statusInitENABLE_Sno((MAUBP_Sno_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Sno_D_MC.statusInitDISABLE_Sno((MAUBP_Sno_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Sno_D_MC.statusInitREAD__ONLY_Sno((MAUBP_Sno_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Sno_D_MC.statusInitREQUIRED_Sno((MAUBP_Sno_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Sno_D_MC.statusInitINVISIBLE_Sno((MAUBP_Sno_D)this);

	}

	/**
	 *  [Sno]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno(MAUBP_Sno_D p) {
		p.SnoTable.addAllListener(p);
		p.columnSno_sno1.addAllListener(p);
		p.columnSno_sno1.setListListener(p);
		p.columnSno_sno1_null_flg.addAllListener(p);
		p.columnSno_sno2.addAllListener(p);
		p.columnSno_sno2.setListListener(p);
		p.columnSno_sno2_null_flg.addAllListener(p);
		p.columnSno_sno3.addAllListener(p);
		p.columnSno_sno3.setListListener(p);
		p.columnSno_sno3_null_flg.addAllListener(p);
		p.columnSno_sno4.addAllListener(p);
		p.columnSno_sno4.setListListener(p);
		p.columnSno_sno4_null_flg.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Sno(MAUBP_Sno_D p){
		p.columnSno_sno1.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnSno_sno1_null_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnSno_sno2.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnSno_sno2_null_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnSno_sno3.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnSno_sno3_null_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnSno_sno4.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnSno_sno4_null_flg.putMode(p, ENABLE, MCMode.INVISIBLE);

	}

	/**
	 * [DISABLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Sno(MAUBP_Sno_D p){
		p.columnSno_sno1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnSno_sno1_null_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnSno_sno2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnSno_sno2_null_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnSno_sno3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnSno_sno3_null_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnSno_sno4.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnSno_sno4_null_flg.putMode(p, DISABLE, MCMode.INVISIBLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Sno(MAUBP_Sno_D p){
		p.columnSno_sno1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnSno_sno1_null_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnSno_sno2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnSno_sno2_null_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnSno_sno3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnSno_sno3_null_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnSno_sno4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnSno_sno4_null_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);

	}

	/**
	 * [REQUIRED]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Sno(MAUBP_Sno_D p){
		p.columnSno_sno1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnSno_sno1_null_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnSno_sno2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnSno_sno2_null_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnSno_sno3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnSno_sno3_null_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnSno_sno4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnSno_sno4_null_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);

	}

	/**
	 * [INVISIBLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Sno(MAUBP_Sno_D p){
		p.columnSno_sno1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno1_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno2_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno3_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSno_sno4_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Sno_D_MC.setTableConfigSno((MAUBP_Sno_D)this);
	}

	/**
	 * [Sno]ブロックのTableの設定
	 */
	protected static void setTableConfigSno(MAUBP_Sno_D p) {
		p.columnSno_sno1.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno1_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno1);
		p.columnSno_sno1_null_flg.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno1_null_flg_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno1_null_flg);
		p.columnSno_sno2.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno2_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno2);
		p.columnSno_sno2_null_flg.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno2_null_flg_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno2_null_flg);
		p.columnSno_sno3.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno3_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno3);
		p.columnSno_sno3_null_flg.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno3_null_flg_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno3_null_flg);
		p.columnSno_sno4.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno4_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno4);
		p.columnSno_sno4_null_flg.setMeta(mcframe.clientMAUB.MAUBP5070.SnoR.sno4_null_flg_META);
		p.SnoTable.addColumnConfig(p.columnSno_sno4_null_flg);
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
		if (vc == SnoTable) return doSno_VC(info);
		if (vc == columnSno_sno1) return doSno_sno1_VC(info);
		if (vc == columnSno_sno1_null_flg) return doSno_sno1_null_flg_VC(info);
		if (vc == columnSno_sno2) return doSno_sno2_VC(info);
		if (vc == columnSno_sno2_null_flg) return doSno_sno2_null_flg_VC(info);
		if (vc == columnSno_sno3) return doSno_sno3_VC(info);
		if (vc == columnSno_sno3_null_flg) return doSno_sno3_null_flg_VC(info);
		if (vc == columnSno_sno4) return doSno_sno4_VC(info);
		if (vc == columnSno_sno4_null_flg) return doSno_sno4_null_flg_VC(info);
		return true;
	}

	/**
	 * [Sno]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno1_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno2_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno3_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno4_null_flg_VC(MCEventInfo info){
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
		if (nc == SnoTable) doSno_NC(info);
		else if (nc == columnSno_sno1) doSno_sno1_NC(info);
		else if (nc == columnSno_sno1_null_flg) doSno_sno1_null_flg_NC(info);
		else if (nc == columnSno_sno2) doSno_sno2_NC(info);
		else if (nc == columnSno_sno2_null_flg) doSno_sno2_null_flg_NC(info);
		else if (nc == columnSno_sno3) doSno_sno3_NC(info);
		else if (nc == columnSno_sno3_null_flg) doSno_sno3_null_flg_NC(info);
		else if (nc == columnSno_sno4) doSno_sno4_NC(info);
		else if (nc == columnSno_sno4_null_flg) doSno_sno4_null_flg_NC(info);
	}

	/**
	 * [Sno]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SnoTable) doSno_NE(info);
		else if (ne == columnSno_sno1) doSno_sno1_NE(info);
		else if (ne == columnSno_sno1_null_flg) doSno_sno1_null_flg_NE(info);
		else if (ne == columnSno_sno2) doSno_sno2_NE(info);
		else if (ne == columnSno_sno2_null_flg) doSno_sno2_null_flg_NE(info);
		else if (ne == columnSno_sno3) doSno_sno3_NE(info);
		else if (ne == columnSno_sno3_null_flg) doSno_sno3_null_flg_NE(info);
		else if (ne == columnSno_sno4) doSno_sno4_NE(info);
		else if (ne == columnSno_sno4_null_flg) doSno_sno4_null_flg_NE(info);
	}

	/**
	 * [Sno]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SnoTable) doSno_NX(info);
		else if (nx == columnSno_sno1) doSno_sno1_NX(info);
		else if (nx == columnSno_sno1_null_flg) doSno_sno1_null_flg_NX(info);
		else if (nx == columnSno_sno2) doSno_sno2_NX(info);
		else if (nx == columnSno_sno2_null_flg) doSno_sno2_null_flg_NX(info);
		else if (nx == columnSno_sno3) doSno_sno3_NX(info);
		else if (nx == columnSno_sno3_null_flg) doSno_sno3_null_flg_NX(info);
		else if (nx == columnSno_sno4) doSno_sno4_NX(info);
		else if (nx == columnSno_sno4_null_flg) doSno_sno4_null_flg_NX(info);
	}

	/**
	 * [Sno]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnSno_sno1) doSno_sno1_LC(info);
		else if (lc == columnSno_sno2) doSno_sno2_LC(info);
		else if (lc == columnSno_sno3) doSno_sno3_LC(info);
		else if (lc == columnSno_sno4) doSno_sno4_LC(info);
	}

	/**
	 * [Sno]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}