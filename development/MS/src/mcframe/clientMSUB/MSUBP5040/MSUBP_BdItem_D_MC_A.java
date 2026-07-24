package mcframe.clientMSUB.MSUBP5040;

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
 * 画面"MSUBP_BdItem_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_BdItem_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUBP5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [BdItem]ブロック関連のField定義
	public MCPanel BdItemPanel = null;
	public MCScrollPane BdItemScrollPane = null;
	public MCTable2<mcframe.clientMSUB.MSUBP5040.BdItemR> BdItemTable = null;
	// [BdItem]ブロックの項目のField定義
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_dpt_nm = null;
	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_itm_cd = null;
	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_itm_sub1 = null;
	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_itm_sub2 = null;
	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_itm_sub3 = null;
	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_itm_nm = null;
	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_lot_no = null;
	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_sublot_no = null;
	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_sno1 = null;
	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_sno2 = null;
	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_sno3 = null;
	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_sno4 = null;
	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_bp_cd = null;
	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_bp_nm = null;
	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_loc_cd = null;
	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_loc_nm = null;
	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_ctg_cd = null;
	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_ctg_nm = null;
	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_oper_cd = null;
	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_oper_nm = null;
	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_iv_no = null;
	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_slo_no = null;
	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnBdItem_bd_po_no = null;
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
	
	/** [BdItem]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUB.MSUBP5040.BdItemR> aBdItemL;

	/**
	 * コピーによってaBdItemLを設定します。
	 *
	 * aBdItemLのインスタンスは変更されません。
	 *
	 * @param dataset BdItemL
	 */
	public void setBdItemL(MCList<mcframe.clientMSUB.MSUBP5040.BdItemR> aList) {
		if (getBdItemL() != aList) {
			getBdItemL().setAll(aList);
		}
	}

	/**
	 * [BdItem]ブロックのコンテナaBdItemLを返します。
	 *
	 * @return BdItemL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5040.BdItemR> getBdItemL() {
		return aBdItemL;
	}

	/**
	 * aBdItemRを作成します。
	 *
	 * @return BdItemR
	 */
	public mcframe.clientMSUB.MSUBP5040.BdItemR createBdItemR() {
		return mcframe.clientMSUB.MSUBP5040.BdItemR.create();
	}

	/**
	 * aBdItemLを作成します。
	 *
	 * @return BdItemL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5040.BdItemR> createBdItemL() {
		return MCList.create(mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	}

	/**
	 * BdItemTableを初期化します。
	 */
	protected void createBdItemTable(){
		if(BdItemTable == null){
			BdItemTable = beansFactory.createTable2("BdItem.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getBdItemL())) ret.add(getBdItemL());
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
		if(aCnt == getBdItemL()) return "BdItem";
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
		if(bId.equals("BdItem")) return getBdItemL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(BdItemPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_BdItem_D_MC_A() {
		aBdItemL = createBdItemL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_BdItem_D_MC_A(String name) {
		aBdItemL = createBdItemL();
		createBdItemTable();
		BdItemTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_BdItem_D_MC.jbCreateBdItem((MSUBP_BdItem_D)this);
	}

	/**
	 * [BdItem]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBdItem(MSUBP_BdItem_D p) {
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

	
	/** [BdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_dpt_cd_p = null;

	/**
	 * [BdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_dpt_cd_ListPutter() {
		if (BdItem_bd_dpt_cd_p == null) {
			BdItem_bd_dpt_cd_p = createBdItem_bd_dpt_cd_ListPutter(columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return BdItem_bd_dpt_cd_p;
	}
	
	
	/** [BdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_itm_cd_p = null;

	/**
	 * [BdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_itm_cd_ListPutter() {
		if (BdItem_bd_itm_cd_p == null) {
			BdItem_bd_itm_cd_p = createBdItem_bd_itm_cd_ListPutter(columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_nm","bd_itm_sub1","bd_itm_sub2","bd_itm_sub3");

		}
		return BdItem_bd_itm_cd_p;
	}
	
	
	/** [BdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter BdItem_bd_itm_sub1_p = null;

	/**
	 * [BdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_itm_sub1_ListPutter() {
		if (BdItem_bd_itm_sub1_p == null) {
			BdItem_bd_itm_sub1_p = createBdItem_bd_itm_sub1_ListPutter(columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_nm","bd_itm_sub2","bd_itm_sub3");

		}
		return BdItem_bd_itm_sub1_p;
	}
	
	
	/** [BdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter BdItem_bd_itm_sub2_p = null;

	/**
	 * [BdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_itm_sub2_ListPutter() {
		if (BdItem_bd_itm_sub2_p == null) {
			BdItem_bd_itm_sub2_p = createBdItem_bd_itm_sub2_ListPutter(columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_nm","bd_itm_sub3");

		}
		return BdItem_bd_itm_sub2_p;
	}
	
	
	/** [BdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter BdItem_bd_itm_sub3_p = null;

	/**
	 * [BdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_itm_sub3_ListPutter() {
		if (BdItem_bd_itm_sub3_p == null) {
			BdItem_bd_itm_sub3_p = createBdItem_bd_itm_sub3_ListPutter(columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm");

		}
		return BdItem_bd_itm_sub3_p;
	}
	
	
	/** [BdItem_bd_lot_no_ListPutter]の定義 */
	private MCListPutter BdItem_bd_lot_no_p = null;

	/**
	 * [BdItem_bd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_lot_no_ListPutter() {
		if (BdItem_bd_lot_no_p == null) {
			BdItem_bd_lot_no_p = createBdItem_bd_lot_no_ListPutter(columnBdItem_bd_lot_no, "bd_lot_no", "bd_sublot_no");

		}
		return BdItem_bd_lot_no_p;
	}
	
	
	/** [BdItem_bd_sublot_no_ListPutter]の定義 */
	private MCListPutter BdItem_bd_sublot_no_p = null;

	/**
	 * [BdItem_bd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_sublot_no_ListPutter() {
		if (BdItem_bd_sublot_no_p == null) {
			BdItem_bd_sublot_no_p = createBdItem_bd_sublot_no_ListPutter(columnBdItem_bd_sublot_no, "bd_sublot_no");

		}
		return BdItem_bd_sublot_no_p;
	}
	
	
	/** [BdItem_bd_bp_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_bp_cd_p = null;

	/**
	 * [BdItem_bd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_bp_cd_ListPutter() {
		if (BdItem_bd_bp_cd_p == null) {
			BdItem_bd_bp_cd_p = createBdItem_bd_bp_cd_ListPutter(columnBdItem_bd_bp_cd, "bd_bp_cd", "bd_bp_nm");

		}
		return BdItem_bd_bp_cd_p;
	}
	
	
	/** [BdItem_bd_loc_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_loc_cd_p = null;

	/**
	 * [BdItem_bd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_loc_cd_ListPutter() {
		if (BdItem_bd_loc_cd_p == null) {
			BdItem_bd_loc_cd_p = createBdItem_bd_loc_cd_ListPutter(columnBdItem_bd_loc_cd, "bd_loc_cd", "bd_loc_nm");

		}
		return BdItem_bd_loc_cd_p;
	}
	
	
	/** [BdItem_bd_ctg_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_ctg_cd_p = null;

	/**
	 * [BdItem_bd_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_ctg_cd_ListPutter() {
		if (BdItem_bd_ctg_cd_p == null) {
			BdItem_bd_ctg_cd_p = createBdItem_bd_ctg_cd_ListPutter(columnBdItem_bd_ctg_cd, "bd_ctg_cd", "bd_ctg_nm");

		}
		return BdItem_bd_ctg_cd_p;
	}
	
	
	/** [BdItem_bd_oper_cd_ListPutter]の定義 */
	private MCListPutter BdItem_bd_oper_cd_p = null;

	/**
	 * [BdItem_bd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getBdItem_bd_oper_cd_ListPutter() {
		if (BdItem_bd_oper_cd_p == null) {
			BdItem_bd_oper_cd_p = createBdItem_bd_oper_cd_ListPutter(columnBdItem_bd_oper_cd, "bd_oper_cd", "bd_oper_nm");

		}
		return BdItem_bd_oper_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_BdItem_D create(){
		MSUBP_BdItem_D p = new MSUBP_BdItem_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_BdItem_D create(String name){
		MSUBP_BdItem_D p = new MSUBP_BdItem_D(name);
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
		MSUBP_BdItem_D_MC.jbfInitBdItem((MSUBP_BdItem_D)this);
		MSUBP_BdItem_D_MC.jbInitBdItem((MSUBP_BdItem_D)this);
	}

	/**
	 * [BdItem]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBdItem(MSUBP_BdItem_D p) {
		// ブロック関連の初期化
		p.BdItemPanel = p.beansFactory.createPanel("BdItem");
		p.BdItemScrollPane = p.beansFactory.createScrollPane("BdItem.scroll");
		p.createBdItemTable();
		// ブロックの項目の初期化
		p.columnBdItem_bd_dpt_cd = p.beansFactory.createTableColumn("BdItem.bd_dpt_cd", MCColumnType.TEXT);
		p.columnBdItem_bd_dpt_nm = p.beansFactory.createTableColumn("BdItem.bd_dpt_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_itm_cd = p.beansFactory.createTableColumn("BdItem.bd_itm_cd", MCColumnType.TEXT);
		p.columnBdItem_bd_itm_sub1 = p.beansFactory.createTableColumn("BdItem.bd_itm_sub1", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_itm_sub2 = p.beansFactory.createTableColumn("BdItem.bd_itm_sub2", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_itm_sub3 = p.beansFactory.createTableColumn("BdItem.bd_itm_sub3", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_itm_nm = p.beansFactory.createTableColumn("BdItem.bd_itm_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_lot_no = p.beansFactory.createTableColumn("BdItem.bd_lot_no", MCColumnType.TEXT);
		p.columnBdItem_bd_sublot_no = p.beansFactory.createTableColumn("BdItem.bd_sublot_no", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_sno1 = p.beansFactory.createTableColumn("BdItem.bd_sno1", MCColumnType.TEXT);
		p.columnBdItem_bd_sno2 = p.beansFactory.createTableColumn("BdItem.bd_sno2", MCColumnType.TEXT);
		p.columnBdItem_bd_sno3 = p.beansFactory.createTableColumn("BdItem.bd_sno3", MCColumnType.TEXT);
		p.columnBdItem_bd_sno4 = p.beansFactory.createTableColumn("BdItem.bd_sno4", MCColumnType.TEXT);
		p.columnBdItem_bd_bp_cd = p.beansFactory.createTableColumn("BdItem.bd_bp_cd", MCColumnType.TEXT);
		p.columnBdItem_bd_bp_nm = p.beansFactory.createTableColumn("BdItem.bd_bp_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_loc_cd = p.beansFactory.createTableColumn("BdItem.bd_loc_cd", MCColumnType.TEXT);
		p.columnBdItem_bd_loc_nm = p.beansFactory.createTableColumn("BdItem.bd_loc_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_ctg_cd = p.beansFactory.createTableColumn("BdItem.bd_ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_ctg_nm = p.beansFactory.createTableColumn("BdItem.bd_ctg_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_oper_cd = p.beansFactory.createTableColumn("BdItem.bd_oper_cd", MCColumnType.TEXT_COMBO);
		p.columnBdItem_bd_oper_nm = p.beansFactory.createTableColumn("BdItem.bd_oper_nm", MCColumnType.TEXT);
		p.columnBdItem_bd_iv_no = p.beansFactory.createTableColumn("BdItem.bd_iv_no", MCColumnType.TEXT);
		p.columnBdItem_bd_slo_no = p.beansFactory.createTableColumn("BdItem.bd_slo_no", MCColumnType.TEXT);
		p.columnBdItem_bd_po_no = p.beansFactory.createTableColumn("BdItem.bd_po_no", MCColumnType.TEXT);
	}

	/**
	 * [BdItem]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBdItem(MSUBP_BdItem_D p) {
		// ブロック関連の初期化
		p.add(p.BdItemPanel);
		p.setLastBeans(p.BdItemPanel);
		p.BdItemPanel.add(p.BdItemScrollPane);
		p.BdItemPanel.setLastBeans(p.BdItemTable);
		p.BdItemScrollPane.setViewportView(p.BdItemTable);
		p.BdItemTable.setList(p.getBdItemL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_BdItem_D_MC.mcInitBdItem((MSUBP_BdItem_D)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_BdItem_D_MC.statusInitENABLE_BdItem((MSUBP_BdItem_D)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_BdItem_D_MC.statusInitDISABLE_BdItem((MSUBP_BdItem_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_BdItem_D_MC.statusInitREAD__ONLY_BdItem((MSUBP_BdItem_D)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_BdItem_D_MC.statusInitREQUIRED_BdItem((MSUBP_BdItem_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_BdItem_D_MC.statusInitINVISIBLE_BdItem((MSUBP_BdItem_D)this);

	}

	/**
	 *  [BdItem]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBdItem(MSUBP_BdItem_D p) {
		p.BdItemTable.addAllListener(p);
		p.columnBdItem_bd_dpt_cd.addAllListener(p);
		p.columnBdItem_bd_dpt_cd.setListListener(p);
		p.columnBdItem_bd_dpt_nm.addAllListener(p);
		p.columnBdItem_bd_dpt_nm.setListListener(p);
		p.columnBdItem_bd_itm_cd.addAllListener(p);
		p.columnBdItem_bd_itm_cd.setListListener(p);
		p.columnBdItem_bd_itm_sub1.addAllListener(p);
		p.columnBdItem_bd_itm_sub1.setListListener(p);
		p.columnBdItem_bd_itm_sub2.addAllListener(p);
		p.columnBdItem_bd_itm_sub2.setListListener(p);
		p.columnBdItem_bd_itm_sub3.addAllListener(p);
		p.columnBdItem_bd_itm_sub3.setListListener(p);
		p.columnBdItem_bd_itm_nm.addAllListener(p);
		p.columnBdItem_bd_itm_nm.setListListener(p);
		p.columnBdItem_bd_lot_no.addAllListener(p);
		p.columnBdItem_bd_lot_no.setListListener(p);
		p.columnBdItem_bd_sublot_no.addAllListener(p);
		p.columnBdItem_bd_sublot_no.setListListener(p);
		p.columnBdItem_bd_sno1.addAllListener(p);
		p.columnBdItem_bd_sno1.setListListener(p);
		p.columnBdItem_bd_sno2.addAllListener(p);
		p.columnBdItem_bd_sno2.setListListener(p);
		p.columnBdItem_bd_sno3.addAllListener(p);
		p.columnBdItem_bd_sno3.setListListener(p);
		p.columnBdItem_bd_sno4.addAllListener(p);
		p.columnBdItem_bd_sno4.setListListener(p);
		p.columnBdItem_bd_bp_cd.addAllListener(p);
		p.columnBdItem_bd_bp_cd.setListListener(p);
		p.columnBdItem_bd_bp_nm.addAllListener(p);
		p.columnBdItem_bd_bp_nm.setListListener(p);
		p.columnBdItem_bd_loc_cd.addAllListener(p);
		p.columnBdItem_bd_loc_cd.setListListener(p);
		p.columnBdItem_bd_loc_nm.addAllListener(p);
		p.columnBdItem_bd_loc_nm.setListListener(p);
		p.columnBdItem_bd_ctg_cd.addAllListener(p);
		p.columnBdItem_bd_ctg_cd.setListListener(p);
		p.columnBdItem_bd_ctg_nm.addAllListener(p);
		p.columnBdItem_bd_ctg_nm.setListListener(p);
		p.columnBdItem_bd_oper_cd.addAllListener(p);
		p.columnBdItem_bd_oper_cd.setListListener(p);
		p.columnBdItem_bd_oper_nm.addAllListener(p);
		p.columnBdItem_bd_oper_nm.setListListener(p);
		p.columnBdItem_bd_iv_no.addAllListener(p);
		p.columnBdItem_bd_iv_no.setListListener(p);
		p.columnBdItem_bd_slo_no.addAllListener(p);
		p.columnBdItem_bd_slo_no.setListListener(p);
		p.columnBdItem_bd_po_no.addAllListener(p);
		p.columnBdItem_bd_po_no.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[BdItem]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_BdItem(MSUBP_BdItem_D p){
		p.columnBdItem_bd_dpt_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_dpt_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_itm_sub1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_sub2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_sub3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_lot_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_sublot_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_sno1.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_sno2.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_sno3.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_sno4.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_bp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_loc_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_loc_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_ctg_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_ctg_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_oper_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_oper_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnBdItem_bd_iv_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_slo_no.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnBdItem_bd_po_no.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[BdItem]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_BdItem(MSUBP_BdItem_D p){
		p.columnBdItem_bd_dpt_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_dpt_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_itm_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_itm_sub1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_itm_sub2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_itm_sub3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_itm_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_lot_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_sublot_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_sno1.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_sno2.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_sno3.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_sno4.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_bp_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_bp_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_loc_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_loc_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_ctg_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_ctg_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_oper_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_oper_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_iv_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_slo_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnBdItem_bd_po_no.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[BdItem]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_BdItem(MSUBP_BdItem_D p){
		p.columnBdItem_bd_dpt_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_dpt_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_sub1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_sub2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_sub3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_lot_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_sublot_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_sno1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_sno2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_sno3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_sno4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_loc_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_loc_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_ctg_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_ctg_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_oper_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_oper_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_iv_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_slo_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnBdItem_bd_po_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[BdItem]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_BdItem(MSUBP_BdItem_D p){
		p.columnBdItem_bd_dpt_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_dpt_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_itm_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_sub1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_sub2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_sub3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_itm_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_lot_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_sublot_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_sno1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_sno2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_sno3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_sno4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_bp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_loc_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_loc_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_ctg_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_ctg_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_oper_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_oper_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnBdItem_bd_iv_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_slo_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnBdItem_bd_po_no.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[BdItem]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_BdItem(MSUBP_BdItem_D p){
		p.columnBdItem_bd_dpt_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_dpt_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_itm_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_itm_sub1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_itm_sub2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_itm_sub3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_itm_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_lot_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_sublot_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_sno1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_sno2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_sno3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_sno4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_bp_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_bp_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_loc_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_loc_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_ctg_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_ctg_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_oper_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_oper_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_iv_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_slo_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnBdItem_bd_po_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSUBP_BdItem_D_MC.setTableConfigBdItem((MSUBP_BdItem_D)this);
	}

	/**
	 * [BdItem]ブロックのTableの設定
	 */
	protected static void setTableConfigBdItem(MSUBP_BdItem_D p) {
		p.columnBdItem_bd_dpt_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_dpt_cd_META);
		p.columnBdItem_bd_dpt_cd.setListType(MCListType.STRICT);
		p.columnBdItem_bd_dpt_cd.addLinkBeans(p.columnBdItem_bd_dpt_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_dpt_cd);
		p.columnBdItem_bd_dpt_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_dpt_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_dpt_nm);
		p.columnBdItem_bd_itm_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_itm_cd_META);
		p.columnBdItem_bd_itm_cd.setListType(MCListType.STRICT);
		p.columnBdItem_bd_itm_cd.addLinkBeans(p.columnBdItem_bd_itm_nm,p.columnBdItem_bd_itm_sub1,p.columnBdItem_bd_itm_sub2,p.columnBdItem_bd_itm_sub3);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_itm_cd);
		p.columnBdItem_bd_itm_sub1.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_itm_sub1_META);
		p.columnBdItem_bd_itm_sub1.addLinkBeans(p.columnBdItem_bd_itm_nm,p.columnBdItem_bd_itm_sub2,p.columnBdItem_bd_itm_sub3);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_itm_sub1);
		p.columnBdItem_bd_itm_sub2.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_itm_sub2_META);
		p.columnBdItem_bd_itm_sub2.addLinkBeans(p.columnBdItem_bd_itm_nm,p.columnBdItem_bd_itm_sub3);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_itm_sub2);
		p.columnBdItem_bd_itm_sub3.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_itm_sub3_META);
		p.columnBdItem_bd_itm_sub3.addLinkBeans(p.columnBdItem_bd_itm_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_itm_sub3);
		p.columnBdItem_bd_itm_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_itm_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_itm_nm);
		p.columnBdItem_bd_lot_no.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_lot_no_META);
		p.columnBdItem_bd_lot_no.setListType(MCListType.STRICT);
		p.columnBdItem_bd_lot_no.addLinkBeans(p.columnBdItem_bd_sublot_no);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_lot_no);
		p.columnBdItem_bd_sublot_no.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_sublot_no_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_sublot_no);
		p.columnBdItem_bd_sno1.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_sno1_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_sno1);
		p.columnBdItem_bd_sno2.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_sno2_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_sno2);
		p.columnBdItem_bd_sno3.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_sno3_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_sno3);
		p.columnBdItem_bd_sno4.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_sno4_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_sno4);
		p.columnBdItem_bd_bp_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_bp_cd_META);
		p.columnBdItem_bd_bp_cd.setListType(MCListType.STRICT);
		p.columnBdItem_bd_bp_cd.addLinkBeans(p.columnBdItem_bd_bp_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_bp_cd);
		p.columnBdItem_bd_bp_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_bp_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_bp_nm);
		p.columnBdItem_bd_loc_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_loc_cd_META);
		p.columnBdItem_bd_loc_cd.setListType(MCListType.STRICT);
		p.columnBdItem_bd_loc_cd.addLinkBeans(p.columnBdItem_bd_loc_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_loc_cd);
		p.columnBdItem_bd_loc_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_loc_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_loc_nm);
		p.columnBdItem_bd_ctg_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_ctg_cd_META);
		p.columnBdItem_bd_ctg_cd.addLinkBeans(p.columnBdItem_bd_ctg_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_ctg_cd);
		p.columnBdItem_bd_ctg_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_ctg_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_ctg_nm);
		p.columnBdItem_bd_oper_cd.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_oper_cd_META);
		p.columnBdItem_bd_oper_cd.addLinkBeans(p.columnBdItem_bd_oper_nm);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_oper_cd);
		p.columnBdItem_bd_oper_nm.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_oper_nm_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_oper_nm);
		p.columnBdItem_bd_iv_no.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_iv_no_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_iv_no);
		p.columnBdItem_bd_slo_no.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_slo_no_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_slo_no);
		p.columnBdItem_bd_po_no.setMeta(mcframe.clientMSUB.MSUBP5040.BdItemR.bd_po_no_META);
		p.BdItemTable.addColumnConfig(p.columnBdItem_bd_po_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnBdItem_bd_dpt_cd.getListConfig().setPutter(getBdItem_bd_dpt_cd_ListPutter());
		columnBdItem_bd_itm_cd.getListConfig().setPutter(getBdItem_bd_itm_cd_ListPutter());
		columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_itm_sub1.getListConfig().setPutter(getBdItem_bd_itm_sub1_ListPutter());
		columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_itm_sub2.getListConfig().setPutter(getBdItem_bd_itm_sub2_ListPutter());
		columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_itm_sub3.getListConfig().setPutter(getBdItem_bd_itm_sub3_ListPutter());
		columnBdItem_bd_lot_no.getListConfig().setPutter(getBdItem_bd_lot_no_ListPutter());
		columnBdItem_bd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_sublot_no.getListConfig().setPutter(getBdItem_bd_sublot_no_ListPutter());
		columnBdItem_bd_bp_cd.getListConfig().setPutter(getBdItem_bd_bp_cd_ListPutter());
		columnBdItem_bd_loc_cd.getListConfig().setPutter(getBdItem_bd_loc_cd_ListPutter());
		columnBdItem_bd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_ctg_cd.getListConfig().setPutter(getBdItem_bd_ctg_cd_ListPutter());
		columnBdItem_bd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnBdItem_bd_oper_cd.getListConfig().setPutter(getBdItem_bd_oper_cd_ListPutter());
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
	 * [BdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
		return lp;
	}
	 
	/**
	 * [BdItem_bd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createBdItem_bd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnBdItem_bd_dpt_cd) return getBdItem_bd_dpt_cd(row, info);
		if(combo == columnBdItem_bd_itm_cd) return getBdItem_bd_itm_cd(row, info);
		if(combo == columnBdItem_bd_itm_sub1) return getBdItem_bd_itm_sub1(row, info);
		if(combo == columnBdItem_bd_itm_sub2) return getBdItem_bd_itm_sub2(row, info);
		if(combo == columnBdItem_bd_itm_sub3) return getBdItem_bd_itm_sub3(row, info);
		if(combo == columnBdItem_bd_lot_no) return getBdItem_bd_lot_no(row, info);
		if(combo == columnBdItem_bd_sublot_no) return getBdItem_bd_sublot_no(row, info);
		if(combo == columnBdItem_bd_bp_cd) return getBdItem_bd_bp_cd(row, info);
		if(combo == columnBdItem_bd_loc_cd) return getBdItem_bd_loc_cd(row, info);
		if(combo == columnBdItem_bd_ctg_cd) return getBdItem_bd_ctg_cd(row, info);
		if(combo == columnBdItem_bd_oper_cd) return getBdItem_bd_oper_cd(row, info);
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
		if (vc == BdItemTable) return doBdItem_VC(info);
		if (vc == columnBdItem_bd_dpt_cd) return doBdItem_bd_dpt_cd_VC(info);
		if (vc == columnBdItem_bd_dpt_nm) return doBdItem_bd_dpt_nm_VC(info);
		if (vc == columnBdItem_bd_itm_cd) return doBdItem_bd_itm_cd_VC(info);
		if (vc == columnBdItem_bd_itm_sub1) return doBdItem_bd_itm_sub1_VC(info);
		if (vc == columnBdItem_bd_itm_sub2) return doBdItem_bd_itm_sub2_VC(info);
		if (vc == columnBdItem_bd_itm_sub3) return doBdItem_bd_itm_sub3_VC(info);
		if (vc == columnBdItem_bd_itm_nm) return doBdItem_bd_itm_nm_VC(info);
		if (vc == columnBdItem_bd_lot_no) return doBdItem_bd_lot_no_VC(info);
		if (vc == columnBdItem_bd_sublot_no) return doBdItem_bd_sublot_no_VC(info);
		if (vc == columnBdItem_bd_sno1) return doBdItem_bd_sno1_VC(info);
		if (vc == columnBdItem_bd_sno2) return doBdItem_bd_sno2_VC(info);
		if (vc == columnBdItem_bd_sno3) return doBdItem_bd_sno3_VC(info);
		if (vc == columnBdItem_bd_sno4) return doBdItem_bd_sno4_VC(info);
		if (vc == columnBdItem_bd_bp_cd) return doBdItem_bd_bp_cd_VC(info);
		if (vc == columnBdItem_bd_bp_nm) return doBdItem_bd_bp_nm_VC(info);
		if (vc == columnBdItem_bd_loc_cd) return doBdItem_bd_loc_cd_VC(info);
		if (vc == columnBdItem_bd_loc_nm) return doBdItem_bd_loc_nm_VC(info);
		if (vc == columnBdItem_bd_ctg_cd) return doBdItem_bd_ctg_cd_VC(info);
		if (vc == columnBdItem_bd_ctg_nm) return doBdItem_bd_ctg_nm_VC(info);
		if (vc == columnBdItem_bd_oper_cd) return doBdItem_bd_oper_cd_VC(info);
		if (vc == columnBdItem_bd_oper_nm) return doBdItem_bd_oper_nm_VC(info);
		if (vc == columnBdItem_bd_iv_no) return doBdItem_bd_iv_no_VC(info);
		if (vc == columnBdItem_bd_slo_no) return doBdItem_bd_slo_no_VC(info);
		if (vc == columnBdItem_bd_po_no) return doBdItem_bd_po_no_VC(info);
		return true;
	}

	/**
	 * [BdItem]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BdItem]パネルの[bd_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBdItem_bd_po_no_VC(MCEventInfo info){
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
		if (nc == BdItemTable) doBdItem_NC(info);
		else if (nc == columnBdItem_bd_dpt_cd) doBdItem_bd_dpt_cd_NC(info);
		else if (nc == columnBdItem_bd_dpt_nm) doBdItem_bd_dpt_nm_NC(info);
		else if (nc == columnBdItem_bd_itm_cd) doBdItem_bd_itm_cd_NC(info);
		else if (nc == columnBdItem_bd_itm_sub1) doBdItem_bd_itm_sub1_NC(info);
		else if (nc == columnBdItem_bd_itm_sub2) doBdItem_bd_itm_sub2_NC(info);
		else if (nc == columnBdItem_bd_itm_sub3) doBdItem_bd_itm_sub3_NC(info);
		else if (nc == columnBdItem_bd_itm_nm) doBdItem_bd_itm_nm_NC(info);
		else if (nc == columnBdItem_bd_lot_no) doBdItem_bd_lot_no_NC(info);
		else if (nc == columnBdItem_bd_sublot_no) doBdItem_bd_sublot_no_NC(info);
		else if (nc == columnBdItem_bd_sno1) doBdItem_bd_sno1_NC(info);
		else if (nc == columnBdItem_bd_sno2) doBdItem_bd_sno2_NC(info);
		else if (nc == columnBdItem_bd_sno3) doBdItem_bd_sno3_NC(info);
		else if (nc == columnBdItem_bd_sno4) doBdItem_bd_sno4_NC(info);
		else if (nc == columnBdItem_bd_bp_cd) doBdItem_bd_bp_cd_NC(info);
		else if (nc == columnBdItem_bd_bp_nm) doBdItem_bd_bp_nm_NC(info);
		else if (nc == columnBdItem_bd_loc_cd) doBdItem_bd_loc_cd_NC(info);
		else if (nc == columnBdItem_bd_loc_nm) doBdItem_bd_loc_nm_NC(info);
		else if (nc == columnBdItem_bd_ctg_cd) doBdItem_bd_ctg_cd_NC(info);
		else if (nc == columnBdItem_bd_ctg_nm) doBdItem_bd_ctg_nm_NC(info);
		else if (nc == columnBdItem_bd_oper_cd) doBdItem_bd_oper_cd_NC(info);
		else if (nc == columnBdItem_bd_oper_nm) doBdItem_bd_oper_nm_NC(info);
		else if (nc == columnBdItem_bd_iv_no) doBdItem_bd_iv_no_NC(info);
		else if (nc == columnBdItem_bd_slo_no) doBdItem_bd_slo_no_NC(info);
		else if (nc == columnBdItem_bd_po_no) doBdItem_bd_po_no_NC(info);
	}

	/**
	 * [BdItem]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno4_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_po_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == BdItemTable) doBdItem_NE(info);
		else if (ne == columnBdItem_bd_dpt_cd) doBdItem_bd_dpt_cd_NE(info);
		else if (ne == columnBdItem_bd_dpt_nm) doBdItem_bd_dpt_nm_NE(info);
		else if (ne == columnBdItem_bd_itm_cd) doBdItem_bd_itm_cd_NE(info);
		else if (ne == columnBdItem_bd_itm_sub1) doBdItem_bd_itm_sub1_NE(info);
		else if (ne == columnBdItem_bd_itm_sub2) doBdItem_bd_itm_sub2_NE(info);
		else if (ne == columnBdItem_bd_itm_sub3) doBdItem_bd_itm_sub3_NE(info);
		else if (ne == columnBdItem_bd_itm_nm) doBdItem_bd_itm_nm_NE(info);
		else if (ne == columnBdItem_bd_lot_no) doBdItem_bd_lot_no_NE(info);
		else if (ne == columnBdItem_bd_sublot_no) doBdItem_bd_sublot_no_NE(info);
		else if (ne == columnBdItem_bd_sno1) doBdItem_bd_sno1_NE(info);
		else if (ne == columnBdItem_bd_sno2) doBdItem_bd_sno2_NE(info);
		else if (ne == columnBdItem_bd_sno3) doBdItem_bd_sno3_NE(info);
		else if (ne == columnBdItem_bd_sno4) doBdItem_bd_sno4_NE(info);
		else if (ne == columnBdItem_bd_bp_cd) doBdItem_bd_bp_cd_NE(info);
		else if (ne == columnBdItem_bd_bp_nm) doBdItem_bd_bp_nm_NE(info);
		else if (ne == columnBdItem_bd_loc_cd) doBdItem_bd_loc_cd_NE(info);
		else if (ne == columnBdItem_bd_loc_nm) doBdItem_bd_loc_nm_NE(info);
		else if (ne == columnBdItem_bd_ctg_cd) doBdItem_bd_ctg_cd_NE(info);
		else if (ne == columnBdItem_bd_ctg_nm) doBdItem_bd_ctg_nm_NE(info);
		else if (ne == columnBdItem_bd_oper_cd) doBdItem_bd_oper_cd_NE(info);
		else if (ne == columnBdItem_bd_oper_nm) doBdItem_bd_oper_nm_NE(info);
		else if (ne == columnBdItem_bd_iv_no) doBdItem_bd_iv_no_NE(info);
		else if (ne == columnBdItem_bd_slo_no) doBdItem_bd_slo_no_NE(info);
		else if (ne == columnBdItem_bd_po_no) doBdItem_bd_po_no_NE(info);
	}

	/**
	 * [BdItem]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno4_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_po_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == BdItemTable) doBdItem_NX(info);
		else if (nx == columnBdItem_bd_dpt_cd) doBdItem_bd_dpt_cd_NX(info);
		else if (nx == columnBdItem_bd_dpt_nm) doBdItem_bd_dpt_nm_NX(info);
		else if (nx == columnBdItem_bd_itm_cd) doBdItem_bd_itm_cd_NX(info);
		else if (nx == columnBdItem_bd_itm_sub1) doBdItem_bd_itm_sub1_NX(info);
		else if (nx == columnBdItem_bd_itm_sub2) doBdItem_bd_itm_sub2_NX(info);
		else if (nx == columnBdItem_bd_itm_sub3) doBdItem_bd_itm_sub3_NX(info);
		else if (nx == columnBdItem_bd_itm_nm) doBdItem_bd_itm_nm_NX(info);
		else if (nx == columnBdItem_bd_lot_no) doBdItem_bd_lot_no_NX(info);
		else if (nx == columnBdItem_bd_sublot_no) doBdItem_bd_sublot_no_NX(info);
		else if (nx == columnBdItem_bd_sno1) doBdItem_bd_sno1_NX(info);
		else if (nx == columnBdItem_bd_sno2) doBdItem_bd_sno2_NX(info);
		else if (nx == columnBdItem_bd_sno3) doBdItem_bd_sno3_NX(info);
		else if (nx == columnBdItem_bd_sno4) doBdItem_bd_sno4_NX(info);
		else if (nx == columnBdItem_bd_bp_cd) doBdItem_bd_bp_cd_NX(info);
		else if (nx == columnBdItem_bd_bp_nm) doBdItem_bd_bp_nm_NX(info);
		else if (nx == columnBdItem_bd_loc_cd) doBdItem_bd_loc_cd_NX(info);
		else if (nx == columnBdItem_bd_loc_nm) doBdItem_bd_loc_nm_NX(info);
		else if (nx == columnBdItem_bd_ctg_cd) doBdItem_bd_ctg_cd_NX(info);
		else if (nx == columnBdItem_bd_ctg_nm) doBdItem_bd_ctg_nm_NX(info);
		else if (nx == columnBdItem_bd_oper_cd) doBdItem_bd_oper_cd_NX(info);
		else if (nx == columnBdItem_bd_oper_nm) doBdItem_bd_oper_nm_NX(info);
		else if (nx == columnBdItem_bd_iv_no) doBdItem_bd_iv_no_NX(info);
		else if (nx == columnBdItem_bd_slo_no) doBdItem_bd_slo_no_NX(info);
		else if (nx == columnBdItem_bd_po_no) doBdItem_bd_po_no_NX(info);
	}

	/**
	 * [BdItem]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno4_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_po_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnBdItem_bd_dpt_cd) doBdItem_bd_dpt_cd_LC(info);
		else if (lc == columnBdItem_bd_dpt_nm) doBdItem_bd_dpt_nm_LC(info);
		else if (lc == columnBdItem_bd_itm_cd) doBdItem_bd_itm_cd_LC(info);
		else if (lc == columnBdItem_bd_itm_sub1) doBdItem_bd_itm_sub1_LC(info);
		else if (lc == columnBdItem_bd_itm_sub2) doBdItem_bd_itm_sub2_LC(info);
		else if (lc == columnBdItem_bd_itm_sub3) doBdItem_bd_itm_sub3_LC(info);
		else if (lc == columnBdItem_bd_itm_nm) doBdItem_bd_itm_nm_LC(info);
		else if (lc == columnBdItem_bd_lot_no) doBdItem_bd_lot_no_LC(info);
		else if (lc == columnBdItem_bd_sublot_no) doBdItem_bd_sublot_no_LC(info);
		else if (lc == columnBdItem_bd_sno1) doBdItem_bd_sno1_LC(info);
		else if (lc == columnBdItem_bd_sno2) doBdItem_bd_sno2_LC(info);
		else if (lc == columnBdItem_bd_sno3) doBdItem_bd_sno3_LC(info);
		else if (lc == columnBdItem_bd_sno4) doBdItem_bd_sno4_LC(info);
		else if (lc == columnBdItem_bd_bp_cd) doBdItem_bd_bp_cd_LC(info);
		else if (lc == columnBdItem_bd_bp_nm) doBdItem_bd_bp_nm_LC(info);
		else if (lc == columnBdItem_bd_loc_cd) doBdItem_bd_loc_cd_LC(info);
		else if (lc == columnBdItem_bd_loc_nm) doBdItem_bd_loc_nm_LC(info);
		else if (lc == columnBdItem_bd_ctg_cd) doBdItem_bd_ctg_cd_LC(info);
		else if (lc == columnBdItem_bd_ctg_nm) doBdItem_bd_ctg_nm_LC(info);
		else if (lc == columnBdItem_bd_oper_cd) doBdItem_bd_oper_cd_LC(info);
		else if (lc == columnBdItem_bd_oper_nm) doBdItem_bd_oper_nm_LC(info);
		else if (lc == columnBdItem_bd_iv_no) doBdItem_bd_iv_no_LC(info);
		else if (lc == columnBdItem_bd_slo_no) doBdItem_bd_slo_no_LC(info);
		else if (lc == columnBdItem_bd_po_no) doBdItem_bd_po_no_LC(info);
	}

	/**
	 * [BdItem]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_sno4_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [BdItem]パネルの[bd_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBdItem_bd_po_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_lot_no]の作成メソッド
	 */
	public MCList getBdItem_bd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_sublot_no]の作成メソッド
	 */
	public MCList getBdItem_bd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_bp_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_loc_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_ctg_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnBdItem_bd_oper_cd]の作成メソッド
	 */
	public MCList getBdItem_bd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}