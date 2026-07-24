package mcframe.clientMAUB.MAUBP5210;

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
 * 画面"MAUBP_Hrrchy_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Hrrchy_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Hrrchy]ブロック関連のField定義
	public MCPanel HrrchyPanel = null;
	public MCScrollPane HrrchyScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5210.HrrchyR> HrrchyTable = null;
	// [Hrrchy]ブロックの項目のField定義
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_hrrchy_str = null;
	/**
	 * Explosion 展開.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_ext = null;
	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_extno = null;
	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_par_extno = null;
	/**
	 * Column for sort ソート用カラム.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_sort_col = null;
	/**
	 * Bottom 最下層.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_bottom_flg = null;
	/**
	 * Loop ループ.<p>
	 *
	 */
	public MCColumnConfig columnHrrchy_loop_flg = null;
	public MCColumnConfig columnHrrchy_leaf_str = null;
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
	
	/** [Hrrchy]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5210.HrrchyR> aHrrchyL;

	/**
	 * コピーによってaHrrchyLを設定します。
	 *
	 * aHrrchyLのインスタンスは変更されません。
	 *
	 * @param dataset HrrchyL
	 */
	public void setHrrchyL(MCList<mcframe.clientMAUB.MAUBP5210.HrrchyR> aList) {
		if (getHrrchyL() != aList) {
			getHrrchyL().setAll(aList);
		}
	}

	/**
	 * [Hrrchy]ブロックのコンテナaHrrchyLを返します。
	 *
	 * @return HrrchyL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5210.HrrchyR> getHrrchyL() {
		return aHrrchyL;
	}

	/**
	 * aHrrchyRを作成します。
	 *
	 * @return HrrchyR
	 */
	public mcframe.clientMAUB.MAUBP5210.HrrchyR createHrrchyR() {
		return mcframe.clientMAUB.MAUBP5210.HrrchyR.create();
	}

	/**
	 * aHrrchyLを作成します。
	 *
	 * @return HrrchyL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5210.HrrchyR> createHrrchyL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5210.HrrchyR.class);
	}

	/**
	 * HrrchyTableを初期化します。
	 */
	protected void createHrrchyTable(){
		if(HrrchyTable == null){
			HrrchyTable = beansFactory.createTable2("Hrrchy.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getHrrchyL())) ret.add(getHrrchyL());
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
		if(aCnt == getHrrchyL()) return "Hrrchy";
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
		if(bId.equals("Hrrchy")) return getHrrchyL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(HrrchyPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Hrrchy_D_MC_A() {
		aHrrchyL = createHrrchyL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Hrrchy_D_MC_A(String name) {
		aHrrchyL = createHrrchyL();
		createHrrchyTable();
		HrrchyTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Hrrchy_D_MC.jbCreateHrrchy((MAUBP_Hrrchy_D)this);
	}

	/**
	 * [Hrrchy]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHrrchy(MAUBP_Hrrchy_D p) {
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
	public static MAUBP_Hrrchy_D create(){
		MAUBP_Hrrchy_D p = new MAUBP_Hrrchy_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Hrrchy_D create(String name){
		MAUBP_Hrrchy_D p = new MAUBP_Hrrchy_D(name);
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
		MAUBP_Hrrchy_D_MC.jbfInitHrrchy((MAUBP_Hrrchy_D)this);
		MAUBP_Hrrchy_D_MC.jbInitHrrchy((MAUBP_Hrrchy_D)this);
	}

	/**
	 * [Hrrchy]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHrrchy(MAUBP_Hrrchy_D p) {
		// ブロック関連の初期化
		p.HrrchyPanel = p.beansFactory.createPanel("Hrrchy");
		p.HrrchyScrollPane = p.beansFactory.createScrollPane("Hrrchy.scroll");
		p.createHrrchyTable();
		// ブロックの項目の初期化
		p.columnHrrchy_hrrchy_str = p.beansFactory.createTableColumn("Hrrchy.hrrchy_str", MCColumnType.TEXT);
		p.columnHrrchy_ext = p.beansFactory.createTableColumn("Hrrchy.ext", MCColumnType.CHECK);
		p.columnHrrchy_extno = p.beansFactory.createTableColumn("Hrrchy.extno", MCColumnType.NUMBER);
		p.columnHrrchy_par_extno = p.beansFactory.createTableColumn("Hrrchy.par_extno", MCColumnType.NUMBER);
		p.columnHrrchy_sort_col = p.beansFactory.createTableColumn("Hrrchy.sort_col", MCColumnType.NUMBER);
		p.columnHrrchy_bottom_flg = p.beansFactory.createTableColumn("Hrrchy.bottom_flg", MCColumnType.CHECK);
		p.columnHrrchy_loop_flg = p.beansFactory.createTableColumn("Hrrchy.loop_flg", MCColumnType.CHECK);
		p.columnHrrchy_leaf_str = p.beansFactory.createTableColumn("Hrrchy.leaf_str", MCColumnType.TEXT);
	}

	/**
	 * [Hrrchy]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHrrchy(MAUBP_Hrrchy_D p) {
		// ブロック関連の初期化
		p.add(p.HrrchyPanel);
		p.setLastBeans(p.HrrchyPanel);
		p.HrrchyPanel.add(p.HrrchyScrollPane);
		p.HrrchyPanel.setLastBeans(p.HrrchyTable);
		p.HrrchyScrollPane.setViewportView(p.HrrchyTable);
		p.HrrchyTable.setList(p.getHrrchyL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Hrrchy_D_MC.mcInitHrrchy((MAUBP_Hrrchy_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Hrrchy_D_MC.statusInitENABLE_Hrrchy((MAUBP_Hrrchy_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Hrrchy_D_MC.statusInitDISABLE_Hrrchy((MAUBP_Hrrchy_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Hrrchy_D_MC.statusInitREAD__ONLY_Hrrchy((MAUBP_Hrrchy_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Hrrchy_D_MC.statusInitREQUIRED_Hrrchy((MAUBP_Hrrchy_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Hrrchy_D_MC.statusInitINVISIBLE_Hrrchy((MAUBP_Hrrchy_D)this);

	}

	/**
	 *  [Hrrchy]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHrrchy(MAUBP_Hrrchy_D p) {
		p.HrrchyTable.addAllListener(p);
		p.columnHrrchy_hrrchy_str.addAllListener(p);
		p.columnHrrchy_hrrchy_str.setListListener(p);
		p.columnHrrchy_ext.addAllListener(p);
		p.columnHrrchy_extno.addAllListener(p);
		p.columnHrrchy_extno.setListListener(p);
		p.columnHrrchy_par_extno.addAllListener(p);
		p.columnHrrchy_par_extno.setListListener(p);
		p.columnHrrchy_sort_col.addAllListener(p);
		p.columnHrrchy_sort_col.setListListener(p);
		p.columnHrrchy_bottom_flg.addAllListener(p);
		p.columnHrrchy_loop_flg.addAllListener(p);
		p.columnHrrchy_leaf_str.addAllListener(p);
		p.columnHrrchy_leaf_str.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Hrrchy]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Hrrchy(MAUBP_Hrrchy_D p){
		p.columnHrrchy_hrrchy_str.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnHrrchy_ext.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnHrrchy_extno.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnHrrchy_par_extno.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnHrrchy_sort_col.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnHrrchy_bottom_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnHrrchy_loop_flg.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnHrrchy_leaf_str.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[Hrrchy]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Hrrchy(MAUBP_Hrrchy_D p){
		p.columnHrrchy_hrrchy_str.putMode(p, DISABLE, MCMode.READ_ONLY);
		p.columnHrrchy_ext.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnHrrchy_extno.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnHrrchy_par_extno.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnHrrchy_sort_col.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnHrrchy_bottom_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnHrrchy_loop_flg.putMode(p, DISABLE, MCMode.READ_ONLY);
		p.columnHrrchy_leaf_str.putMode(p, DISABLE, MCMode.READ_ONLY);

	}

	/**
	 * [READ_ONLY]ステータスの[Hrrchy]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Hrrchy(MAUBP_Hrrchy_D p){
		p.columnHrrchy_hrrchy_str.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnHrrchy_ext.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnHrrchy_extno.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnHrrchy_par_extno.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnHrrchy_sort_col.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnHrrchy_bottom_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnHrrchy_loop_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnHrrchy_leaf_str.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Hrrchy]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Hrrchy(MAUBP_Hrrchy_D p){
		p.columnHrrchy_hrrchy_str.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnHrrchy_ext.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnHrrchy_extno.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnHrrchy_par_extno.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnHrrchy_sort_col.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnHrrchy_bottom_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnHrrchy_loop_flg.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnHrrchy_leaf_str.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[Hrrchy]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Hrrchy(MAUBP_Hrrchy_D p){
		p.columnHrrchy_hrrchy_str.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_ext.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_extno.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_par_extno.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_sort_col.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_bottom_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_loop_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnHrrchy_leaf_str.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Hrrchy_D_MC.setTableConfigHrrchy((MAUBP_Hrrchy_D)this);
	}

	/**
	 * [Hrrchy]ブロックのTableの設定
	 */
	protected static void setTableConfigHrrchy(MAUBP_Hrrchy_D p) {
		p.columnHrrchy_hrrchy_str.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.hrrchy_str_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_hrrchy_str);
		p.columnHrrchy_ext.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.ext_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_ext);
		p.columnHrrchy_extno.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.extno_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_extno);
		p.columnHrrchy_par_extno.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.par_extno_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_par_extno);
		p.columnHrrchy_sort_col.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.sort_col_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_sort_col);
		p.columnHrrchy_bottom_flg.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.bottom_flg_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_bottom_flg);
		p.columnHrrchy_loop_flg.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.loop_flg_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_loop_flg);
		p.columnHrrchy_leaf_str.setMeta(mcframe.clientMAUB.MAUBP5210.HrrchyR.leaf_str_META);
		p.HrrchyTable.addColumnConfig(p.columnHrrchy_leaf_str);
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
		if (vc == HrrchyTable) return doHrrchy_VC(info);
		if (vc == columnHrrchy_hrrchy_str) return doHrrchy_hrrchy_str_VC(info);
		if (vc == columnHrrchy_ext) return doHrrchy_ext_VC(info);
		if (vc == columnHrrchy_extno) return doHrrchy_extno_VC(info);
		if (vc == columnHrrchy_par_extno) return doHrrchy_par_extno_VC(info);
		if (vc == columnHrrchy_sort_col) return doHrrchy_sort_col_VC(info);
		if (vc == columnHrrchy_bottom_flg) return doHrrchy_bottom_flg_VC(info);
		if (vc == columnHrrchy_loop_flg) return doHrrchy_loop_flg_VC(info);
		if (vc == columnHrrchy_leaf_str) return doHrrchy_leaf_str_VC(info);
		return true;
	}

	/**
	 * [Hrrchy]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[hrrchy_str]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_hrrchy_str_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[ext]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_ext_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[extno]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_extno_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[par_extno]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_par_extno_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[bottom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_bottom_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[loop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_loop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hrrchy]パネルの[leaf_str]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHrrchy_leaf_str_VC(MCEventInfo info){
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
		if (nc == HrrchyTable) doHrrchy_NC(info);
		else if (nc == columnHrrchy_hrrchy_str) doHrrchy_hrrchy_str_NC(info);
		else if (nc == columnHrrchy_ext) doHrrchy_ext_NC(info);
		else if (nc == columnHrrchy_extno) doHrrchy_extno_NC(info);
		else if (nc == columnHrrchy_par_extno) doHrrchy_par_extno_NC(info);
		else if (nc == columnHrrchy_sort_col) doHrrchy_sort_col_NC(info);
		else if (nc == columnHrrchy_bottom_flg) doHrrchy_bottom_flg_NC(info);
		else if (nc == columnHrrchy_loop_flg) doHrrchy_loop_flg_NC(info);
		else if (nc == columnHrrchy_leaf_str) doHrrchy_leaf_str_NC(info);
	}

	/**
	 * [Hrrchy]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[hrrchy_str]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_hrrchy_str_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[ext]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_ext_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[extno]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_extno_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[par_extno]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_par_extno_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[bottom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_bottom_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[loop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_loop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[leaf_str]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_leaf_str_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HrrchyTable) doHrrchy_NE(info);
		else if (ne == columnHrrchy_hrrchy_str) doHrrchy_hrrchy_str_NE(info);
		else if (ne == columnHrrchy_ext) doHrrchy_ext_NE(info);
		else if (ne == columnHrrchy_extno) doHrrchy_extno_NE(info);
		else if (ne == columnHrrchy_par_extno) doHrrchy_par_extno_NE(info);
		else if (ne == columnHrrchy_sort_col) doHrrchy_sort_col_NE(info);
		else if (ne == columnHrrchy_bottom_flg) doHrrchy_bottom_flg_NE(info);
		else if (ne == columnHrrchy_loop_flg) doHrrchy_loop_flg_NE(info);
		else if (ne == columnHrrchy_leaf_str) doHrrchy_leaf_str_NE(info);
	}

	/**
	 * [Hrrchy]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[hrrchy_str]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_hrrchy_str_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[ext]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_ext_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[extno]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_extno_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[par_extno]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_par_extno_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[bottom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_bottom_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[loop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_loop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[leaf_str]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_leaf_str_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HrrchyTable) doHrrchy_NX(info);
		else if (nx == columnHrrchy_hrrchy_str) doHrrchy_hrrchy_str_NX(info);
		else if (nx == columnHrrchy_ext) doHrrchy_ext_NX(info);
		else if (nx == columnHrrchy_extno) doHrrchy_extno_NX(info);
		else if (nx == columnHrrchy_par_extno) doHrrchy_par_extno_NX(info);
		else if (nx == columnHrrchy_sort_col) doHrrchy_sort_col_NX(info);
		else if (nx == columnHrrchy_bottom_flg) doHrrchy_bottom_flg_NX(info);
		else if (nx == columnHrrchy_loop_flg) doHrrchy_loop_flg_NX(info);
		else if (nx == columnHrrchy_leaf_str) doHrrchy_leaf_str_NX(info);
	}

	/**
	 * [Hrrchy]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[hrrchy_str]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_hrrchy_str_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[ext]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_ext_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[extno]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_extno_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[par_extno]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_par_extno_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[bottom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_bottom_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[loop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_loop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[leaf_str]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_leaf_str_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnHrrchy_hrrchy_str) doHrrchy_hrrchy_str_LC(info);
		else if (lc == columnHrrchy_extno) doHrrchy_extno_LC(info);
		else if (lc == columnHrrchy_par_extno) doHrrchy_par_extno_LC(info);
		else if (lc == columnHrrchy_sort_col) doHrrchy_sort_col_LC(info);
		else if (lc == columnHrrchy_leaf_str) doHrrchy_leaf_str_LC(info);
	}

	/**
	 * [Hrrchy]パネルの[hrrchy_str]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_hrrchy_str_LC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[extno]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_extno_LC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[par_extno]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_par_extno_LC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [Hrrchy]パネルの[leaf_str]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHrrchy_leaf_str_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}