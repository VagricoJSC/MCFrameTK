package mcframe.clientMAUB.MAUBP5030;

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
 * 画面"MAUBP_Itm_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Itm_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Itm]ブロック関連のField定義
	public MCPanel ItmPanel = null;
	public MCScrollPane ItmScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5030.ItmR> ItmTable = null;
	// [Itm]ブロックの項目のField定義
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnItm_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnItm_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnItm_itm_sub3 = null;
	/**
	 * Item name 品名.<p>
	 *
	 */
	public MCColumnConfig columnItm_itm_nm = null;
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
	
	/** [Itm]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5030.ItmR> aItmL;

	/**
	 * コピーによってaItmLを設定します。
	 *
	 * aItmLのインスタンスは変更されません。
	 *
	 * @param dataset ItmL
	 */
	public void setItmL(MCList<mcframe.clientMAUB.MAUBP5030.ItmR> aList) {
		if (getItmL() != aList) {
			getItmL().setAll(aList);
		}
	}

	/**
	 * [Itm]ブロックのコンテナaItmLを返します。
	 *
	 * @return ItmL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5030.ItmR> getItmL() {
		return aItmL;
	}

	/**
	 * aItmRを作成します。
	 *
	 * @return ItmR
	 */
	public mcframe.clientMAUB.MAUBP5030.ItmR createItmR() {
		return mcframe.clientMAUB.MAUBP5030.ItmR.create();
	}

	/**
	 * aItmLを作成します。
	 *
	 * @return ItmL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5030.ItmR> createItmL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5030.ItmR.class);
	}

	/**
	 * ItmTableを初期化します。
	 */
	protected void createItmTable(){
		if(ItmTable == null){
			ItmTable = beansFactory.createTable2("Itm.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getItmL())) ret.add(getItmL());
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
		if(aCnt == getItmL()) return "Itm";
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
		if(bId.equals("Itm")) return getItmL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ItmPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Itm_D_MC_A() {
		aItmL = createItmL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Itm_D_MC_A(String name) {
		aItmL = createItmL();
		createItmTable();
		ItmTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Itm_D_MC.jbCreateItm((MAUBP_Itm_D)this);
	}

	/**
	 * [Itm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItm(MAUBP_Itm_D p) {
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

	
	/** [Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Itm_itm_cd_p = null;

	/**
	 * [Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getItm_itm_cd_ListPutter() {
		if (Itm_itm_cd_p == null) {
			Itm_itm_cd_p = createItm_itm_cd_ListPutter(columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");

		}
		return Itm_itm_cd_p;
	}
	
	
	/** [Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Itm_itm_sub1_p = null;

	/**
	 * [Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getItm_itm_sub1_ListPutter() {
		if (Itm_itm_sub1_p == null) {
			Itm_itm_sub1_p = createItm_itm_sub1_ListPutter(columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");

		}
		return Itm_itm_sub1_p;
	}
	
	
	/** [Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Itm_itm_sub2_p = null;

	/**
	 * [Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getItm_itm_sub2_ListPutter() {
		if (Itm_itm_sub2_p == null) {
			Itm_itm_sub2_p = createItm_itm_sub2_ListPutter(columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");

		}
		return Itm_itm_sub2_p;
	}
	
	
	/** [Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Itm_itm_sub3_p = null;

	/**
	 * [Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getItm_itm_sub3_ListPutter() {
		if (Itm_itm_sub3_p == null) {
			Itm_itm_sub3_p = createItm_itm_sub3_ListPutter(columnItm_itm_sub3, "itm_sub3", "itm_nm");

		}
		return Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Itm_D create(){
		MAUBP_Itm_D p = new MAUBP_Itm_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Itm_D create(String name){
		MAUBP_Itm_D p = new MAUBP_Itm_D(name);
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
		MAUBP_Itm_D_MC.jbfInitItm((MAUBP_Itm_D)this);
		MAUBP_Itm_D_MC.jbInitItm((MAUBP_Itm_D)this);
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItm(MAUBP_Itm_D p) {
		// ブロック関連の初期化
		p.ItmPanel = p.beansFactory.createPanel("Itm");
		p.ItmScrollPane = p.beansFactory.createScrollPane("Itm.scroll");
		p.createItmTable();
		// ブロックの項目の初期化
		p.columnItm_itm_cd = p.beansFactory.createTableColumn("Itm.itm_cd", MCColumnType.TEXT);
		p.columnItm_itm_sub1 = p.beansFactory.createTableColumn("Itm.itm_sub1", MCColumnType.TEXT_COMBO);
		p.columnItm_itm_sub2 = p.beansFactory.createTableColumn("Itm.itm_sub2", MCColumnType.TEXT_COMBO);
		p.columnItm_itm_sub3 = p.beansFactory.createTableColumn("Itm.itm_sub3", MCColumnType.TEXT_COMBO);
		p.columnItm_itm_nm = p.beansFactory.createTableColumn("Itm.itm_nm", MCColumnType.TEXT);
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItm(MAUBP_Itm_D p) {
		// ブロック関連の初期化
		p.add(p.ItmPanel);
		p.setLastBeans(p.ItmPanel);
		p.ItmPanel.add(p.ItmScrollPane);
		p.ItmPanel.setLastBeans(p.ItmTable);
		p.ItmScrollPane.setViewportView(p.ItmTable);
		p.ItmTable.setList(p.getItmL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Itm_D_MC.mcInitItm((MAUBP_Itm_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Itm_D_MC.statusInitENABLE_Itm((MAUBP_Itm_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Itm_D_MC.statusInitDISABLE_Itm((MAUBP_Itm_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Itm_D_MC.statusInitREAD__ONLY_Itm((MAUBP_Itm_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Itm_D_MC.statusInitREQUIRED_Itm((MAUBP_Itm_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Itm_D_MC.statusInitINVISIBLE_Itm((MAUBP_Itm_D)this);

	}

	/**
	 *  [Itm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItm(MAUBP_Itm_D p) {
		p.ItmTable.addAllListener(p);
		p.columnItm_itm_cd.addAllListener(p);
		p.columnItm_itm_cd.setListListener(p);
		p.columnItm_itm_sub1.addAllListener(p);
		p.columnItm_itm_sub1.setListListener(p);
		p.columnItm_itm_sub2.addAllListener(p);
		p.columnItm_itm_sub2.setListListener(p);
		p.columnItm_itm_sub3.addAllListener(p);
		p.columnItm_itm_sub3.setListListener(p);
		p.columnItm_itm_nm.addAllListener(p);
		p.columnItm_itm_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Itm(MAUBP_Itm_D p){
		p.columnItm_itm_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnItm_itm_sub1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnItm_itm_sub2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnItm_itm_sub3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnItm_itm_nm.putMode(p, ENABLE, MCMode.REQUIRED);

	}

	/**
	 * [DISABLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Itm(MAUBP_Itm_D p){
		p.columnItm_itm_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnItm_itm_sub1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnItm_itm_sub2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnItm_itm_sub3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnItm_itm_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Itm(MAUBP_Itm_D p){
		p.columnItm_itm_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnItm_itm_sub1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnItm_itm_sub2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnItm_itm_sub3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnItm_itm_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Itm(MAUBP_Itm_D p){
		p.columnItm_itm_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnItm_itm_sub1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnItm_itm_sub2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnItm_itm_sub3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnItm_itm_nm.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Itm(MAUBP_Itm_D p){
		p.columnItm_itm_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnItm_itm_sub1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnItm_itm_sub2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnItm_itm_sub3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnItm_itm_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Itm_D_MC.setTableConfigItm((MAUBP_Itm_D)this);
	}

	/**
	 * [Itm]ブロックのTableの設定
	 */
	protected static void setTableConfigItm(MAUBP_Itm_D p) {
		p.columnItm_itm_cd.setMeta(mcframe.clientMAUB.MAUBP5030.ItmR.itm_cd_META);
		p.columnItm_itm_cd.setListType(MCListType.STRICT);
		p.columnItm_itm_cd.addLinkBeans(p.columnItm_itm_nm,p.columnItm_itm_sub1,p.columnItm_itm_sub2,p.columnItm_itm_sub3);
		p.ItmTable.addColumnConfig(p.columnItm_itm_cd);
		p.columnItm_itm_sub1.setMeta(mcframe.clientMAUB.MAUBP5030.ItmR.itm_sub1_META);
		p.columnItm_itm_sub1.addLinkBeans(p.columnItm_itm_nm,p.columnItm_itm_sub2,p.columnItm_itm_sub3);
		p.ItmTable.addColumnConfig(p.columnItm_itm_sub1);
		p.columnItm_itm_sub2.setMeta(mcframe.clientMAUB.MAUBP5030.ItmR.itm_sub2_META);
		p.columnItm_itm_sub2.addLinkBeans(p.columnItm_itm_nm,p.columnItm_itm_sub3);
		p.ItmTable.addColumnConfig(p.columnItm_itm_sub2);
		p.columnItm_itm_sub3.setMeta(mcframe.clientMAUB.MAUBP5030.ItmR.itm_sub3_META);
		p.columnItm_itm_sub3.addLinkBeans(p.columnItm_itm_nm);
		p.ItmTable.addColumnConfig(p.columnItm_itm_sub3);
		p.columnItm_itm_nm.setMeta(mcframe.clientMAUB.MAUBP5030.ItmR.itm_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_itm_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnItm_itm_cd.getListConfig().setPutter(getItm_itm_cd_ListPutter());
		columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnItm_itm_sub1.getListConfig().setPutter(getItm_itm_sub1_ListPutter());
		columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnItm_itm_sub2.getListConfig().setPutter(getItm_itm_sub2_ListPutter());
		columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnItm_itm_sub3.getListConfig().setPutter(getItm_itm_sub3_ListPutter());
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
	 * [Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}
	 
	/**
	 * [Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}
	 
	/**
	 * [Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}
	 
	/**
	 * [Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnItm_itm_cd) return getItm_itm_cd(row, info);
		if(combo == columnItm_itm_sub1) return getItm_itm_sub1(row, info);
		if(combo == columnItm_itm_sub2) return getItm_itm_sub2(row, info);
		if(combo == columnItm_itm_sub3) return getItm_itm_sub3(row, info);
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
		if (vc == ItmTable) return doItm_VC(info);
		if (vc == columnItm_itm_cd) return doItm_itm_cd_VC(info);
		if (vc == columnItm_itm_sub1) return doItm_itm_sub1_VC(info);
		if (vc == columnItm_itm_sub2) return doItm_itm_sub2_VC(info);
		if (vc == columnItm_itm_sub3) return doItm_itm_sub3_VC(info);
		if (vc == columnItm_itm_nm) return doItm_itm_nm_VC(info);
		return true;
	}

	/**
	 * [Itm]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_itm_nm_VC(MCEventInfo info){
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
		if (nc == ItmTable) doItm_NC(info);
		else if (nc == columnItm_itm_cd) doItm_itm_cd_NC(info);
		else if (nc == columnItm_itm_sub1) doItm_itm_sub1_NC(info);
		else if (nc == columnItm_itm_sub2) doItm_itm_sub2_NC(info);
		else if (nc == columnItm_itm_sub3) doItm_itm_sub3_NC(info);
		else if (nc == columnItm_itm_nm) doItm_itm_nm_NC(info);
	}

	/**
	 * [Itm]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ItmTable) doItm_NE(info);
		else if (ne == columnItm_itm_cd) doItm_itm_cd_NE(info);
		else if (ne == columnItm_itm_sub1) doItm_itm_sub1_NE(info);
		else if (ne == columnItm_itm_sub2) doItm_itm_sub2_NE(info);
		else if (ne == columnItm_itm_sub3) doItm_itm_sub3_NE(info);
		else if (ne == columnItm_itm_nm) doItm_itm_nm_NE(info);
	}

	/**
	 * [Itm]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ItmTable) doItm_NX(info);
		else if (nx == columnItm_itm_cd) doItm_itm_cd_NX(info);
		else if (nx == columnItm_itm_sub1) doItm_itm_sub1_NX(info);
		else if (nx == columnItm_itm_sub2) doItm_itm_sub2_NX(info);
		else if (nx == columnItm_itm_sub3) doItm_itm_sub3_NX(info);
		else if (nx == columnItm_itm_nm) doItm_itm_nm_NX(info);
	}

	/**
	 * [Itm]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnItm_itm_cd) doItm_itm_cd_LC(info);
		else if (lc == columnItm_itm_sub1) doItm_itm_sub1_LC(info);
		else if (lc == columnItm_itm_sub2) doItm_itm_sub2_LC(info);
		else if (lc == columnItm_itm_sub3) doItm_itm_sub3_LC(info);
		else if (lc == columnItm_itm_nm) doItm_itm_nm_LC(info);
	}

	/**
	 * [Itm]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnItm_itm_cd]の作成メソッド
	 */
	public MCList getItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}