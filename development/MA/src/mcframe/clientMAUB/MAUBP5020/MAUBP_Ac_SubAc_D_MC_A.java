package mcframe.clientMAUB.MAUBP5020;

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
 * 画面"MAUBP_Ac_SubAc_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Ac_SubAc_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Ac_SubAc]ブロック関連のField定義
	public MCPanel Ac_SubAcPanel = null;
	public MCScrollPane Ac_SubAcScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5020.Ac_SubAcR> Ac_SubAcTable = null;
	// [Ac_SubAc]ブロックの項目のField定義
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAc_SubAc_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnAc_SubAc_ac_nm = null;
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public MCColumnConfig columnAc_SubAc_sub_flg = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAc_SubAc_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnAc_SubAc_sub_ac_nm = null;
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
	
	/** [Ac_SubAc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5020.Ac_SubAcR> aAc_SubAcL;

	/**
	 * コピーによってaAc_SubAcLを設定します。
	 *
	 * aAc_SubAcLのインスタンスは変更されません。
	 *
	 * @param dataset Ac_SubAcL
	 */
	public void setAc_SubAcL(MCList<mcframe.clientMAUB.MAUBP5020.Ac_SubAcR> aList) {
		if (getAc_SubAcL() != aList) {
			getAc_SubAcL().setAll(aList);
		}
	}

	/**
	 * [Ac_SubAc]ブロックのコンテナaAc_SubAcLを返します。
	 *
	 * @return Ac_SubAcL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5020.Ac_SubAcR> getAc_SubAcL() {
		return aAc_SubAcL;
	}

	/**
	 * aAc_SubAcRを作成します。
	 *
	 * @return Ac_SubAcR
	 */
	public mcframe.clientMAUB.MAUBP5020.Ac_SubAcR createAc_SubAcR() {
		return mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.create();
	}

	/**
	 * aAc_SubAcLを作成します。
	 *
	 * @return Ac_SubAcL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5020.Ac_SubAcR> createAc_SubAcL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.class);
	}

	/**
	 * Ac_SubAcTableを初期化します。
	 */
	protected void createAc_SubAcTable(){
		if(Ac_SubAcTable == null){
			Ac_SubAcTable = beansFactory.createTable2("Ac_SubAc.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAc_SubAcL())) ret.add(getAc_SubAcL());
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
		if(aCnt == getAc_SubAcL()) return "Ac_SubAc";
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
		if(bId.equals("Ac_SubAc")) return getAc_SubAcL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(Ac_SubAcPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Ac_SubAc_D_MC_A() {
		aAc_SubAcL = createAc_SubAcL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Ac_SubAc_D_MC_A(String name) {
		aAc_SubAcL = createAc_SubAcL();
		createAc_SubAcTable();
		Ac_SubAcTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Ac_SubAc_D_MC.jbCreateAc_SubAc((MAUBP_Ac_SubAc_D)this);
	}

	/**
	 * [Ac_SubAc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAc_SubAc(MAUBP_Ac_SubAc_D p) {
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

	
	/** [Ac_SubAc_ac_cd_ListPutter]の定義 */
	private MCListPutter Ac_SubAc_ac_cd_p = null;

	/**
	 * [Ac_SubAc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getAc_SubAc_ac_cd_ListPutter() {
		if (Ac_SubAc_ac_cd_p == null) {
			Ac_SubAc_ac_cd_p = createAc_SubAc_ac_cd_ListPutter(columnAc_SubAc_ac_cd, "ac_cd");

		}
		return Ac_SubAc_ac_cd_p;
	}
	
	
	/** [Ac_SubAc_sub_ac_cd_ListPutter]の定義 */
	private MCListPutter Ac_SubAc_sub_ac_cd_p = null;

	/**
	 * [Ac_SubAc_sub_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getAc_SubAc_sub_ac_cd_ListPutter() {
		if (Ac_SubAc_sub_ac_cd_p == null) {
			Ac_SubAc_sub_ac_cd_p = createAc_SubAc_sub_ac_cd_ListPutter(columnAc_SubAc_sub_ac_cd, "sub_ac_cd", "sub_ac_nm");

		}
		return Ac_SubAc_sub_ac_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Ac_SubAc_D create(){
		MAUBP_Ac_SubAc_D p = new MAUBP_Ac_SubAc_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Ac_SubAc_D create(String name){
		MAUBP_Ac_SubAc_D p = new MAUBP_Ac_SubAc_D(name);
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
		MAUBP_Ac_SubAc_D_MC.jbfInitAc_SubAc((MAUBP_Ac_SubAc_D)this);
		MAUBP_Ac_SubAc_D_MC.jbInitAc_SubAc((MAUBP_Ac_SubAc_D)this);
	}

	/**
	 * [Ac_SubAc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAc_SubAc(MAUBP_Ac_SubAc_D p) {
		// ブロック関連の初期化
		p.Ac_SubAcPanel = p.beansFactory.createPanel("Ac_SubAc");
		p.Ac_SubAcScrollPane = p.beansFactory.createScrollPane("Ac_SubAc.scroll");
		p.createAc_SubAcTable();
		// ブロックの項目の初期化
		p.columnAc_SubAc_ac_cd = p.beansFactory.createTableColumn("Ac_SubAc.ac_cd", MCColumnType.TEXT);
		p.columnAc_SubAc_ac_nm = p.beansFactory.createTableColumn("Ac_SubAc.ac_nm", MCColumnType.TEXT);
		p.columnAc_SubAc_sub_flg = p.beansFactory.createTableColumn("Ac_SubAc.sub_flg", MCColumnType.CHECK);
		p.columnAc_SubAc_sub_ac_cd = p.beansFactory.createTableColumn("Ac_SubAc.sub_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnAc_SubAc_sub_ac_nm = p.beansFactory.createTableColumn("Ac_SubAc.sub_ac_nm", MCColumnType.TEXT);
	}

	/**
	 * [Ac_SubAc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAc_SubAc(MAUBP_Ac_SubAc_D p) {
		// ブロック関連の初期化
		p.add(p.Ac_SubAcPanel);
		p.setLastBeans(p.Ac_SubAcPanel);
		p.Ac_SubAcPanel.add(p.Ac_SubAcScrollPane);
		p.Ac_SubAcPanel.setLastBeans(p.Ac_SubAcTable);
		p.Ac_SubAcScrollPane.setViewportView(p.Ac_SubAcTable);
		p.Ac_SubAcTable.setList(p.getAc_SubAcL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Ac_SubAc_D_MC.mcInitAc_SubAc((MAUBP_Ac_SubAc_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Ac_SubAc_D_MC.statusInitENABLE_Ac__SubAc((MAUBP_Ac_SubAc_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Ac_SubAc_D_MC.statusInitDISABLE_Ac__SubAc((MAUBP_Ac_SubAc_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Ac_SubAc_D_MC.statusInitREAD__ONLY_Ac__SubAc((MAUBP_Ac_SubAc_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Ac_SubAc_D_MC.statusInitREQUIRED_Ac__SubAc((MAUBP_Ac_SubAc_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Ac_SubAc_D_MC.statusInitINVISIBLE_Ac__SubAc((MAUBP_Ac_SubAc_D)this);

	}

	/**
	 *  [Ac_SubAc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAc_SubAc(MAUBP_Ac_SubAc_D p) {
		p.Ac_SubAcTable.addAllListener(p);
		p.columnAc_SubAc_ac_cd.addAllListener(p);
		p.columnAc_SubAc_ac_cd.setListListener(p);
		p.columnAc_SubAc_ac_nm.addAllListener(p);
		p.columnAc_SubAc_ac_nm.setListListener(p);
		p.columnAc_SubAc_sub_flg.addAllListener(p);
		p.columnAc_SubAc_sub_ac_cd.addAllListener(p);
		p.columnAc_SubAc_sub_ac_cd.setListListener(p);
		p.columnAc_SubAc_sub_ac_nm.addAllListener(p);
		p.columnAc_SubAc_sub_ac_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Ac_SubAc]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Ac__SubAc(MAUBP_Ac_SubAc_D p){
		p.columnAc_SubAc_ac_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAc_SubAc_ac_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnAc_SubAc_sub_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAc_SubAc_sub_ac_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[Ac_SubAc]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Ac__SubAc(MAUBP_Ac_SubAc_D p){
		p.columnAc_SubAc_ac_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnAc_SubAc_ac_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnAc_SubAc_sub_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnAc_SubAc_sub_ac_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Ac_SubAc]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Ac__SubAc(MAUBP_Ac_SubAc_D p){
		p.columnAc_SubAc_ac_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAc_SubAc_ac_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAc_SubAc_sub_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAc_SubAc_sub_ac_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Ac_SubAc]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Ac__SubAc(MAUBP_Ac_SubAc_D p){
		p.columnAc_SubAc_ac_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnAc_SubAc_ac_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnAc_SubAc_sub_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnAc_SubAc_sub_ac_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[Ac_SubAc]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Ac__SubAc(MAUBP_Ac_SubAc_D p){
		p.columnAc_SubAc_ac_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_ac_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAc_SubAc_sub_ac_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Ac_SubAc_D_MC.setTableConfigAc_SubAc((MAUBP_Ac_SubAc_D)this);
	}

	/**
	 * [Ac_SubAc]ブロックのTableの設定
	 */
	protected static void setTableConfigAc_SubAc(MAUBP_Ac_SubAc_D p) {
		p.columnAc_SubAc_ac_cd.setMeta(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.ac_cd_META);
		p.columnAc_SubAc_ac_cd.setListType(MCListType.STRICT);
		p.Ac_SubAcTable.addColumnConfig(p.columnAc_SubAc_ac_cd);
		p.columnAc_SubAc_ac_nm.setMeta(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.ac_nm_META);
		p.Ac_SubAcTable.addColumnConfig(p.columnAc_SubAc_ac_nm);
		p.columnAc_SubAc_sub_flg.setMeta(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.sub_flg_META);
		p.Ac_SubAcTable.addColumnConfig(p.columnAc_SubAc_sub_flg);
		p.columnAc_SubAc_sub_ac_cd.setMeta(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.sub_ac_cd_META);
		p.columnAc_SubAc_sub_ac_cd.addLinkBeans(p.columnAc_SubAc_sub_ac_nm);
		p.Ac_SubAcTable.addColumnConfig(p.columnAc_SubAc_sub_ac_cd);
		p.columnAc_SubAc_sub_ac_nm.setMeta(mcframe.clientMAUB.MAUBP5020.Ac_SubAcR.sub_ac_nm_META);
		p.Ac_SubAcTable.addColumnConfig(p.columnAc_SubAc_sub_ac_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnAc_SubAc_ac_cd.getListConfig().setPutter(getAc_SubAc_ac_cd_ListPutter());
		columnAc_SubAc_sub_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnAc_SubAc_sub_ac_cd.getListConfig().setPutter(getAc_SubAc_sub_ac_cd_ListPutter());
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
	 * [Ac_SubAc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createAc_SubAc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Account");
		return lp;
	}
	 
	/**
	 * [Ac_SubAc_sub_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createAc_SubAc_sub_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SubAccount");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnAc_SubAc_ac_cd) return getAc_SubAc_ac_cd(row, info);
		if(combo == columnAc_SubAc_sub_ac_cd) return getAc_SubAc_sub_ac_cd(row, info);
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
		if (vc == Ac_SubAcTable) return doAc_SubAc_VC(info);
		if (vc == columnAc_SubAc_ac_cd) return doAc_SubAc_ac_cd_VC(info);
		if (vc == columnAc_SubAc_ac_nm) return doAc_SubAc_ac_nm_VC(info);
		if (vc == columnAc_SubAc_sub_flg) return doAc_SubAc_sub_flg_VC(info);
		if (vc == columnAc_SubAc_sub_ac_cd) return doAc_SubAc_sub_ac_cd_VC(info);
		if (vc == columnAc_SubAc_sub_ac_nm) return doAc_SubAc_sub_ac_nm_VC(info);
		return true;
	}

	/**
	 * [Ac_SubAc]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ac_SubAc]パネルの[ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ac_SubAc]パネルの[ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ac_SubAc]パネルの[sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAc_SubAc_sub_ac_nm_VC(MCEventInfo info){
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
		if (nc == Ac_SubAcTable) doAc_SubAc_NC(info);
		else if (nc == columnAc_SubAc_ac_cd) doAc_SubAc_ac_cd_NC(info);
		else if (nc == columnAc_SubAc_ac_nm) doAc_SubAc_ac_nm_NC(info);
		else if (nc == columnAc_SubAc_sub_flg) doAc_SubAc_sub_flg_NC(info);
		else if (nc == columnAc_SubAc_sub_ac_cd) doAc_SubAc_sub_ac_cd_NC(info);
		else if (nc == columnAc_SubAc_sub_ac_nm) doAc_SubAc_sub_ac_nm_NC(info);
	}

	/**
	 * [Ac_SubAc]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_NC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Ac_SubAcTable) doAc_SubAc_NE(info);
		else if (ne == columnAc_SubAc_ac_cd) doAc_SubAc_ac_cd_NE(info);
		else if (ne == columnAc_SubAc_ac_nm) doAc_SubAc_ac_nm_NE(info);
		else if (ne == columnAc_SubAc_sub_flg) doAc_SubAc_sub_flg_NE(info);
		else if (ne == columnAc_SubAc_sub_ac_cd) doAc_SubAc_sub_ac_cd_NE(info);
		else if (ne == columnAc_SubAc_sub_ac_nm) doAc_SubAc_sub_ac_nm_NE(info);
	}

	/**
	 * [Ac_SubAc]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_NE(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Ac_SubAcTable) doAc_SubAc_NX(info);
		else if (nx == columnAc_SubAc_ac_cd) doAc_SubAc_ac_cd_NX(info);
		else if (nx == columnAc_SubAc_ac_nm) doAc_SubAc_ac_nm_NX(info);
		else if (nx == columnAc_SubAc_sub_flg) doAc_SubAc_sub_flg_NX(info);
		else if (nx == columnAc_SubAc_sub_ac_cd) doAc_SubAc_sub_ac_cd_NX(info);
		else if (nx == columnAc_SubAc_sub_ac_nm) doAc_SubAc_sub_ac_nm_NX(info);
	}

	/**
	 * [Ac_SubAc]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_NX(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnAc_SubAc_ac_cd) doAc_SubAc_ac_cd_LC(info);
		else if (lc == columnAc_SubAc_ac_nm) doAc_SubAc_ac_nm_LC(info);
		else if (lc == columnAc_SubAc_sub_ac_cd) doAc_SubAc_sub_ac_cd_LC(info);
		else if (lc == columnAc_SubAc_sub_ac_nm) doAc_SubAc_sub_ac_nm_LC(info);
	}

	/**
	 * [Ac_SubAc]パネルの[ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Ac_SubAc]パネルの[sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAc_SubAc_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnAc_SubAc_ac_cd]の作成メソッド
	 */
	public MCList getAc_SubAc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnAc_SubAc_sub_ac_cd]の作成メソッド
	 */
	public MCList getAc_SubAc_sub_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSubAccount(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}