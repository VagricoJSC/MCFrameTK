package mcframe.clientMAUB.MAUBP5190;

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
 * 画面"MAUBP_BpGrp_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_BpGrp_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5190";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [BpGrp]ブロック関連のField定義
	public MCPanel BpGrpPanel = null;
	public MCScrollPane BpGrpScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5190.BpGrpR> BpGrpTable = null;
	// [BpGrp]ブロックの項目のField定義
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm1 = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm2 = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm3 = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm4 = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm5 = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm6 = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm7 = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm8 = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm9 = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnBpGrp_bp_grp_nm10 = null;
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
	
	/** [BpGrp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5190.BpGrpR> aBpGrpL;

	/**
	 * コピーによってaBpGrpLを設定します。
	 *
	 * aBpGrpLのインスタンスは変更されません。
	 *
	 * @param dataset BpGrpL
	 */
	public void setBpGrpL(MCList<mcframe.clientMAUB.MAUBP5190.BpGrpR> aList) {
		if (getBpGrpL() != aList) {
			getBpGrpL().setAll(aList);
		}
	}

	/**
	 * [BpGrp]ブロックのコンテナaBpGrpLを返します。
	 *
	 * @return BpGrpL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5190.BpGrpR> getBpGrpL() {
		return aBpGrpL;
	}

	/**
	 * aBpGrpRを作成します。
	 *
	 * @return BpGrpR
	 */
	public mcframe.clientMAUB.MAUBP5190.BpGrpR createBpGrpR() {
		return mcframe.clientMAUB.MAUBP5190.BpGrpR.create();
	}

	/**
	 * aBpGrpLを作成します。
	 *
	 * @return BpGrpL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5190.BpGrpR> createBpGrpL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	}

	/**
	 * BpGrpTableを初期化します。
	 */
	protected void createBpGrpTable(){
		if(BpGrpTable == null){
			BpGrpTable = beansFactory.createTable2("BpGrp.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getBpGrpL())) ret.add(getBpGrpL());
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
		if(aCnt == getBpGrpL()) return "BpGrp";
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
		if(bId.equals("BpGrp")) return getBpGrpL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(BpGrpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_BpGrp_D_MC_A() {
		aBpGrpL = createBpGrpL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_BpGrp_D_MC_A(String name) {
		aBpGrpL = createBpGrpL();
		createBpGrpTable();
		BpGrpTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_BpGrp_D_MC.jbCreateBpGrp((MAUBP_BpGrp_D)this);
	}

	/**
	 * [BpGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBpGrp(MAUBP_BpGrp_D p) {
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
	public static MAUBP_BpGrp_D create(){
		MAUBP_BpGrp_D p = new MAUBP_BpGrp_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_BpGrp_D create(String name){
		MAUBP_BpGrp_D p = new MAUBP_BpGrp_D(name);
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
		MAUBP_BpGrp_D_MC.jbfInitBpGrp((MAUBP_BpGrp_D)this);
		MAUBP_BpGrp_D_MC.jbInitBpGrp((MAUBP_BpGrp_D)this);
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBpGrp(MAUBP_BpGrp_D p) {
		// ブロック関連の初期化
		p.BpGrpPanel = p.beansFactory.createPanel("BpGrp");
		p.BpGrpScrollPane = p.beansFactory.createScrollPane("BpGrp.scroll");
		p.createBpGrpTable();
		// ブロックの項目の初期化
		p.columnBpGrp_bp_grp_cd1 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd1", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm1 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm1", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd2 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd2", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm2 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm2", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd3 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd3", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm3 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm3", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd4 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd4", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm4 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm4", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd5 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd5", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm5 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm5", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd6 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd6", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm6 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm6", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd7 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd7", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm7 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm7", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd8 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd8", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm8 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm8", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd9 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd9", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm9 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm9", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_cd10 = p.beansFactory.createTableColumn("BpGrp.bp_grp_cd10", MCColumnType.TEXT);
		p.columnBpGrp_bp_grp_nm10 = p.beansFactory.createTableColumn("BpGrp.bp_grp_nm10", MCColumnType.TEXT);
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBpGrp(MAUBP_BpGrp_D p) {
		// ブロック関連の初期化
		p.add(p.BpGrpPanel);
		p.setLastBeans(p.BpGrpPanel);
		p.BpGrpPanel.add(p.BpGrpScrollPane);
		p.BpGrpPanel.setLastBeans(p.BpGrpTable);
		p.BpGrpScrollPane.setViewportView(p.BpGrpTable);
		p.BpGrpTable.setList(p.getBpGrpL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_BpGrp_D_MC.mcInitBpGrp((MAUBP_BpGrp_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_BpGrp_D_MC.statusInitENABLE_BpGrp((MAUBP_BpGrp_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_BpGrp_D_MC.statusInitDISABLE_BpGrp((MAUBP_BpGrp_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_BpGrp_D_MC.statusInitREAD__ONLY_BpGrp((MAUBP_BpGrp_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_BpGrp_D_MC.statusInitREQUIRED_BpGrp((MAUBP_BpGrp_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_BpGrp_D_MC.statusInitINVISIBLE_BpGrp((MAUBP_BpGrp_D)this);

	}

	/**
	 *  [BpGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBpGrp(MAUBP_BpGrp_D p) {
		p.BpGrpTable.addAllListener(p);
		p.columnBpGrp_bp_grp_cd1.addAllListener(p);
		p.columnBpGrp_bp_grp_cd1.setListListener(p);
		p.columnBpGrp_bp_grp_nm1.addAllListener(p);
		p.columnBpGrp_bp_grp_nm1.setListListener(p);
		p.columnBpGrp_bp_grp_cd2.addAllListener(p);
		p.columnBpGrp_bp_grp_cd2.setListListener(p);
		p.columnBpGrp_bp_grp_nm2.addAllListener(p);
		p.columnBpGrp_bp_grp_nm2.setListListener(p);
		p.columnBpGrp_bp_grp_cd3.addAllListener(p);
		p.columnBpGrp_bp_grp_cd3.setListListener(p);
		p.columnBpGrp_bp_grp_nm3.addAllListener(p);
		p.columnBpGrp_bp_grp_nm3.setListListener(p);
		p.columnBpGrp_bp_grp_cd4.addAllListener(p);
		p.columnBpGrp_bp_grp_cd4.setListListener(p);
		p.columnBpGrp_bp_grp_nm4.addAllListener(p);
		p.columnBpGrp_bp_grp_nm4.setListListener(p);
		p.columnBpGrp_bp_grp_cd5.addAllListener(p);
		p.columnBpGrp_bp_grp_cd5.setListListener(p);
		p.columnBpGrp_bp_grp_nm5.addAllListener(p);
		p.columnBpGrp_bp_grp_nm5.setListListener(p);
		p.columnBpGrp_bp_grp_cd6.addAllListener(p);
		p.columnBpGrp_bp_grp_cd6.setListListener(p);
		p.columnBpGrp_bp_grp_nm6.addAllListener(p);
		p.columnBpGrp_bp_grp_nm6.setListListener(p);
		p.columnBpGrp_bp_grp_cd7.addAllListener(p);
		p.columnBpGrp_bp_grp_cd7.setListListener(p);
		p.columnBpGrp_bp_grp_nm7.addAllListener(p);
		p.columnBpGrp_bp_grp_nm7.setListListener(p);
		p.columnBpGrp_bp_grp_cd8.addAllListener(p);
		p.columnBpGrp_bp_grp_cd8.setListListener(p);
		p.columnBpGrp_bp_grp_nm8.addAllListener(p);
		p.columnBpGrp_bp_grp_nm8.setListListener(p);
		p.columnBpGrp_bp_grp_cd9.addAllListener(p);
		p.columnBpGrp_bp_grp_cd9.setListListener(p);
		p.columnBpGrp_bp_grp_nm9.addAllListener(p);
		p.columnBpGrp_bp_grp_nm9.setListListener(p);
		p.columnBpGrp_bp_grp_cd10.addAllListener(p);
		p.columnBpGrp_bp_grp_cd10.setListListener(p);
		p.columnBpGrp_bp_grp_nm10.addAllListener(p);
		p.columnBpGrp_bp_grp_nm10.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_BpGrp(MAUBP_BpGrp_D p){
		p.columnBpGrp_bp_grp_cd1.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm1.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd2.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm2.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd3.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm3.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd4.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm4.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd5.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm5.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd6.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm6.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd7.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm7.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd8.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm8.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd9.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm9.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd10.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBpGrp_bp_grp_nm10.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_BpGrp(MAUBP_BpGrp_D p){
		p.columnBpGrp_bp_grp_cd1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd4.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm4.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd5.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm5.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd6.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm6.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd7.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm7.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd8.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm8.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd9.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm9.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_cd10.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBpGrp_bp_grp_nm10.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_BpGrp(MAUBP_BpGrp_D p){
		p.columnBpGrp_bp_grp_cd1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_nm10.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_BpGrp(MAUBP_BpGrp_D p){
		p.columnBpGrp_bp_grp_cd1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm1.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm2.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm3.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm4.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm5.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm6.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm7.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm8.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm9.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBpGrp_bp_grp_cd10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBpGrp_bp_grp_nm10.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_BpGrp(MAUBP_BpGrp_D p){
		p.columnBpGrp_bp_grp_cd1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_cd10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBpGrp_bp_grp_nm10.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_BpGrp_D_MC.setTableConfigBpGrp((MAUBP_BpGrp_D)this);
	}

	/**
	 * [BpGrp]ブロックのTableの設定
	 */
	protected static void setTableConfigBpGrp(MAUBP_BpGrp_D p) {
		p.columnBpGrp_bp_grp_cd1.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd1_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd1);
		p.columnBpGrp_bp_grp_nm1.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm1_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm1);
		p.columnBpGrp_bp_grp_cd2.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd2_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd2);
		p.columnBpGrp_bp_grp_nm2.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm2_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm2);
		p.columnBpGrp_bp_grp_cd3.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd3_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd3);
		p.columnBpGrp_bp_grp_nm3.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm3_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm3);
		p.columnBpGrp_bp_grp_cd4.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd4_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd4);
		p.columnBpGrp_bp_grp_nm4.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm4_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm4);
		p.columnBpGrp_bp_grp_cd5.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd5_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd5);
		p.columnBpGrp_bp_grp_nm5.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm5_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm5);
		p.columnBpGrp_bp_grp_cd6.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd6_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd6);
		p.columnBpGrp_bp_grp_nm6.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm6_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm6);
		p.columnBpGrp_bp_grp_cd7.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd7_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd7);
		p.columnBpGrp_bp_grp_nm7.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm7_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm7);
		p.columnBpGrp_bp_grp_cd8.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd8_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd8);
		p.columnBpGrp_bp_grp_nm8.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm8_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm8);
		p.columnBpGrp_bp_grp_cd9.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd9_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd9);
		p.columnBpGrp_bp_grp_nm9.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm9_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm9);
		p.columnBpGrp_bp_grp_cd10.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_cd10_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_cd10);
		p.columnBpGrp_bp_grp_nm10.setMeta(mcframe.clientMAUB.MAUBP5190.BpGrpR.bp_grp_nm10_META);
		p.BpGrpTable.addColumnConfig(p.columnBpGrp_bp_grp_nm10);
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
		if (vc == BpGrpTable) return doBpGrp_VC(info);
		if (vc == columnBpGrp_bp_grp_cd1) return doBpGrp_bp_grp_cd1_VC(info);
		if (vc == columnBpGrp_bp_grp_nm1) return doBpGrp_bp_grp_nm1_VC(info);
		if (vc == columnBpGrp_bp_grp_cd2) return doBpGrp_bp_grp_cd2_VC(info);
		if (vc == columnBpGrp_bp_grp_nm2) return doBpGrp_bp_grp_nm2_VC(info);
		if (vc == columnBpGrp_bp_grp_cd3) return doBpGrp_bp_grp_cd3_VC(info);
		if (vc == columnBpGrp_bp_grp_nm3) return doBpGrp_bp_grp_nm3_VC(info);
		if (vc == columnBpGrp_bp_grp_cd4) return doBpGrp_bp_grp_cd4_VC(info);
		if (vc == columnBpGrp_bp_grp_nm4) return doBpGrp_bp_grp_nm4_VC(info);
		if (vc == columnBpGrp_bp_grp_cd5) return doBpGrp_bp_grp_cd5_VC(info);
		if (vc == columnBpGrp_bp_grp_nm5) return doBpGrp_bp_grp_nm5_VC(info);
		if (vc == columnBpGrp_bp_grp_cd6) return doBpGrp_bp_grp_cd6_VC(info);
		if (vc == columnBpGrp_bp_grp_nm6) return doBpGrp_bp_grp_nm6_VC(info);
		if (vc == columnBpGrp_bp_grp_cd7) return doBpGrp_bp_grp_cd7_VC(info);
		if (vc == columnBpGrp_bp_grp_nm7) return doBpGrp_bp_grp_nm7_VC(info);
		if (vc == columnBpGrp_bp_grp_cd8) return doBpGrp_bp_grp_cd8_VC(info);
		if (vc == columnBpGrp_bp_grp_nm8) return doBpGrp_bp_grp_nm8_VC(info);
		if (vc == columnBpGrp_bp_grp_cd9) return doBpGrp_bp_grp_cd9_VC(info);
		if (vc == columnBpGrp_bp_grp_nm9) return doBpGrp_bp_grp_nm9_VC(info);
		if (vc == columnBpGrp_bp_grp_cd10) return doBpGrp_bp_grp_cd10_VC(info);
		if (vc == columnBpGrp_bp_grp_nm10) return doBpGrp_bp_grp_nm10_VC(info);
		return true;
	}

	/**
	 * [BpGrp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm10_VC(MCEventInfo info){
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
		if (nc == BpGrpTable) doBpGrp_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NC(info);
		else if (nc == columnBpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NC(info);
		else if (nc == columnBpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NC(info);
	}

	/**
	 * [BpGrp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == BpGrpTable) doBpGrp_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NE(info);
		else if (ne == columnBpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NE(info);
		else if (ne == columnBpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NE(info);
	}

	/**
	 * [BpGrp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == BpGrpTable) doBpGrp_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NX(info);
		else if (nx == columnBpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NX(info);
		else if (nx == columnBpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NX(info);
	}

	/**
	 * [BpGrp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnBpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_LC(info);
		else if (lc == columnBpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_LC(info);
		else if (lc == columnBpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_LC(info);
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}