package mcframe.clientMAUB.MAUBP5360;

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
 * 画面"MAUBP_Addr_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Addr_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5360";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Addr]ブロック関連のField定義
	public MCPanel AddrPanel = null;
	public MCScrollPane AddrScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5360.AddrR> AddrTable = null;
	// [Addr]ブロックの項目のField定義
	/**
	 * Display address 住所表示.<p>
	 *
	 */
	public MCColumnConfig columnAddr_show_dtl = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAddr_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnAddr_cntry_nm = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnAddr_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnAddr_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnAddr_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnAddr_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnAddr_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnAddr_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnAddr_fax = null;
	/**
	 * Counterpart dept. 相手先部署.<p>
	 *
	 */
	public MCColumnConfig columnAddr_cntct_dpt = null;
	/**
	 * Counterpart PIC 相手先担当者.<p>
	 *
	 */
	public MCColumnConfig columnAddr_cntct_psn = null;
	/** [INVISIBLE]モードを表す定数 */
	public static final String INVISIBLE = "INVISIBLE";
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INVISIBLE, ENABLE, READ_ONLY};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Addr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5360.AddrR> aAddrL;

	/**
	 * コピーによってaAddrLを設定します。
	 *
	 * aAddrLのインスタンスは変更されません。
	 *
	 * @param dataset AddrL
	 */
	public void setAddrL(MCList<mcframe.clientMAUB.MAUBP5360.AddrR> aList) {
		if (getAddrL() != aList) {
			getAddrL().setAll(aList);
		}
	}

	/**
	 * [Addr]ブロックのコンテナaAddrLを返します。
	 *
	 * @return AddrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5360.AddrR> getAddrL() {
		return aAddrL;
	}

	/**
	 * aAddrRを作成します。
	 *
	 * @return AddrR
	 */
	public mcframe.clientMAUB.MAUBP5360.AddrR createAddrR() {
		return mcframe.clientMAUB.MAUBP5360.AddrR.create();
	}

	/**
	 * aAddrLを作成します。
	 *
	 * @return AddrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5360.AddrR> createAddrL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5360.AddrR.class);
	}

	/**
	 * AddrTableを初期化します。
	 */
	protected void createAddrTable(){
		if(AddrTable == null){
			AddrTable = beansFactory.createTable2("Addr.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAddrL())) ret.add(getAddrL());
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
		if(aCnt == getAddrL()) return "Addr";
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
		if(bId.equals("Addr")) return getAddrL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(AddrPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Addr_D_MC_A() {
		aAddrL = createAddrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Addr_D_MC_A(String name) {
		aAddrL = createAddrL();
		createAddrTable();
		AddrTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Addr_D_MC.jbCreateAddr((MAUBP_Addr_D)this);
	}

	/**
	 * [Addr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAddr(MAUBP_Addr_D p) {
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

	
	/** [Addr_cntry_cd_ListPutter]の定義 */
	private MCListPutter Addr_cntry_cd_p = null;

	/**
	 * [Addr_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getAddr_cntry_cd_ListPutter() {
		if (Addr_cntry_cd_p == null) {
			Addr_cntry_cd_p = createAddr_cntry_cd_ListPutter(columnAddr_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Addr_cntry_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Addr_D create(){
		MAUBP_Addr_D p = new MAUBP_Addr_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Addr_D create(String name){
		MAUBP_Addr_D p = new MAUBP_Addr_D(name);
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
		MAUBP_Addr_D_MC.jbfInitAddr((MAUBP_Addr_D)this);
		MAUBP_Addr_D_MC.jbInitAddr((MAUBP_Addr_D)this);
	}

	/**
	 * [Addr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAddr(MAUBP_Addr_D p) {
		// ブロック関連の初期化
		p.AddrPanel = p.beansFactory.createPanel("Addr");
		p.AddrScrollPane = p.beansFactory.createScrollPane("Addr.scroll");
		p.createAddrTable();
		// ブロックの項目の初期化
		p.columnAddr_show_dtl = p.beansFactory.createTableColumn("Addr.show_dtl", MCColumnType.BUTTON);
		p.columnAddr_cntry_cd = p.beansFactory.createTableColumn("Addr.cntry_cd", MCColumnType.TEXT_COMBO);
		p.columnAddr_cntry_nm = p.beansFactory.createTableColumn("Addr.cntry_nm", MCColumnType.TEXT);
		p.columnAddr_zip_cd = p.beansFactory.createTableColumn("Addr.zip_cd", MCColumnType.TEXT);
		p.columnAddr_addr1 = p.beansFactory.createTableColumn("Addr.addr1", MCColumnType.TEXT);
		p.columnAddr_addr2 = p.beansFactory.createTableColumn("Addr.addr2", MCColumnType.TEXT);
		p.columnAddr_addr3 = p.beansFactory.createTableColumn("Addr.addr3", MCColumnType.TEXT);
		p.columnAddr_addr4 = p.beansFactory.createTableColumn("Addr.addr4", MCColumnType.TEXT);
		p.columnAddr_tel = p.beansFactory.createTableColumn("Addr.tel", MCColumnType.TEXT);
		p.columnAddr_fax = p.beansFactory.createTableColumn("Addr.fax", MCColumnType.TEXT);
		p.columnAddr_cntct_dpt = p.beansFactory.createTableColumn("Addr.cntct_dpt", MCColumnType.TEXT);
		p.columnAddr_cntct_psn = p.beansFactory.createTableColumn("Addr.cntct_psn", MCColumnType.TEXT);
	}

	/**
	 * [Addr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAddr(MAUBP_Addr_D p) {
		// ブロック関連の初期化
		p.add(p.AddrPanel);
		p.setLastBeans(p.AddrPanel);
		p.AddrPanel.add(p.AddrScrollPane);
		p.AddrPanel.setLastBeans(p.AddrTable);
		p.AddrScrollPane.setViewportView(p.AddrTable);
		p.AddrTable.setList(p.getAddrL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Addr_D_MC.mcInitAddr((MAUBP_Addr_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Addr_D_MC.statusInitINVISIBLE_Addr((MAUBP_Addr_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Addr_D_MC.statusInitENABLE_Addr((MAUBP_Addr_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Addr_D_MC.statusInitREAD__ONLY_Addr((MAUBP_Addr_D)this);

	}

	/**
	 *  [Addr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAddr(MAUBP_Addr_D p) {
		p.AddrTable.addAllListener(p);
		p.columnAddr_show_dtl.addAllListener(p);
		p.columnAddr_show_dtl.setAPMethodName("doAddr_show_dtl");
		p.columnAddr_cntry_cd.addAllListener(p);
		p.columnAddr_cntry_cd.setListListener(p);
		p.columnAddr_cntry_nm.addAllListener(p);
		p.columnAddr_cntry_nm.setListListener(p);
		p.columnAddr_zip_cd.addAllListener(p);
		p.columnAddr_zip_cd.setListListener(p);
		p.columnAddr_addr1.addAllListener(p);
		p.columnAddr_addr1.setListListener(p);
		p.columnAddr_addr2.addAllListener(p);
		p.columnAddr_addr2.setListListener(p);
		p.columnAddr_addr3.addAllListener(p);
		p.columnAddr_addr3.setListListener(p);
		p.columnAddr_addr4.addAllListener(p);
		p.columnAddr_addr4.setListListener(p);
		p.columnAddr_tel.addAllListener(p);
		p.columnAddr_tel.setListListener(p);
		p.columnAddr_fax.addAllListener(p);
		p.columnAddr_fax.setListListener(p);
		p.columnAddr_cntct_dpt.addAllListener(p);
		p.columnAddr_cntct_dpt.setListListener(p);
		p.columnAddr_cntct_psn.addAllListener(p);
		p.columnAddr_cntct_psn.setListListener(p);
	}

	/**
	 * [INVISIBLE]ステータスの[Addr]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Addr(MAUBP_Addr_D p){
		p.columnAddr_show_dtl.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_cntry_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_cntry_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_zip_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_addr1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_addr2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_addr3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_addr4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_tel.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_fax.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_cntct_dpt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnAddr_cntct_psn.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * [ENABLE]ステータスの[Addr]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Addr(MAUBP_Addr_D p){
		p.columnAddr_show_dtl.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_cntry_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_cntry_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnAddr_zip_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_addr1.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_addr2.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_addr3.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_addr4.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_tel.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_fax.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_cntct_dpt.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnAddr_cntct_psn.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Addr]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Addr(MAUBP_Addr_D p){
		p.columnAddr_show_dtl.putMode(p, READ_ONLY, MCMode.ENABLE);
		p.columnAddr_cntry_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_cntry_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_zip_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_addr1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_addr2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_addr3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_addr4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_tel.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_fax.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_cntct_dpt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnAddr_cntct_psn.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Addr_D_MC.setTableConfigAddr((MAUBP_Addr_D)this);
	}

	/**
	 * [Addr]ブロックのTableの設定
	 */
	protected static void setTableConfigAddr(MAUBP_Addr_D p) {
		p.AddrTable.addColumnConfig(p.columnAddr_show_dtl);
		p.columnAddr_cntry_cd.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.cntry_cd_META);
		p.columnAddr_cntry_cd.addLinkBeans(p.columnAddr_cntry_nm);
		p.AddrTable.addColumnConfig(p.columnAddr_cntry_cd);
		p.columnAddr_cntry_nm.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.cntry_nm_META);
		p.AddrTable.addColumnConfig(p.columnAddr_cntry_nm);
		p.columnAddr_zip_cd.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.zip_cd_META);
		p.AddrTable.addColumnConfig(p.columnAddr_zip_cd);
		p.columnAddr_addr1.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.addr1_META);
		p.AddrTable.addColumnConfig(p.columnAddr_addr1);
		p.columnAddr_addr2.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.addr2_META);
		p.AddrTable.addColumnConfig(p.columnAddr_addr2);
		p.columnAddr_addr3.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.addr3_META);
		p.AddrTable.addColumnConfig(p.columnAddr_addr3);
		p.columnAddr_addr4.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.addr4_META);
		p.AddrTable.addColumnConfig(p.columnAddr_addr4);
		p.columnAddr_tel.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.tel_META);
		p.AddrTable.addColumnConfig(p.columnAddr_tel);
		p.columnAddr_fax.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.fax_META);
		p.AddrTable.addColumnConfig(p.columnAddr_fax);
		p.columnAddr_cntct_dpt.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.cntct_dpt_META);
		p.AddrTable.addColumnConfig(p.columnAddr_cntct_dpt);
		p.columnAddr_cntct_psn.setMeta(mcframe.clientMAUB.MAUBP5360.AddrR.cntct_psn_META);
		p.AddrTable.addColumnConfig(p.columnAddr_cntct_psn);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnAddr_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnAddr_cntry_cd.getListConfig().setPutter(getAddr_cntry_cd_ListPutter());
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
	 * この画面を[ENABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLEStatus() {
		status = ENABLE;
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
		if (INVISIBLE.equals(status)) {
			setINVISIBLEStatus();
		}
		else if (ENABLE.equals(status)) {
			setENABLEStatus();
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
	 * [Addr_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createAddr_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnAddr_cntry_cd) return getAddr_cntry_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == columnAddr_show_dtl) doAddr_show_dtl(info);
	}

	/**
	 * [Addr]パネルの[show_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAddr_show_dtl(MCEventInfo info);

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
		if (vc == AddrTable) return doAddr_VC(info);
		if (vc == columnAddr_cntry_cd) return doAddr_cntry_cd_VC(info);
		if (vc == columnAddr_cntry_nm) return doAddr_cntry_nm_VC(info);
		if (vc == columnAddr_zip_cd) return doAddr_zip_cd_VC(info);
		if (vc == columnAddr_addr1) return doAddr_addr1_VC(info);
		if (vc == columnAddr_addr2) return doAddr_addr2_VC(info);
		if (vc == columnAddr_addr3) return doAddr_addr3_VC(info);
		if (vc == columnAddr_addr4) return doAddr_addr4_VC(info);
		if (vc == columnAddr_tel) return doAddr_tel_VC(info);
		if (vc == columnAddr_fax) return doAddr_fax_VC(info);
		if (vc == columnAddr_cntct_dpt) return doAddr_cntct_dpt_VC(info);
		if (vc == columnAddr_cntct_psn) return doAddr_cntct_psn_VC(info);
		return true;
	}

	/**
	 * [Addr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntct_psn_VC(MCEventInfo info){
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
		if (nc == AddrTable) doAddr_NC(info);
		else if (nc == columnAddr_cntry_cd) doAddr_cntry_cd_NC(info);
		else if (nc == columnAddr_cntry_nm) doAddr_cntry_nm_NC(info);
		else if (nc == columnAddr_zip_cd) doAddr_zip_cd_NC(info);
		else if (nc == columnAddr_addr1) doAddr_addr1_NC(info);
		else if (nc == columnAddr_addr2) doAddr_addr2_NC(info);
		else if (nc == columnAddr_addr3) doAddr_addr3_NC(info);
		else if (nc == columnAddr_addr4) doAddr_addr4_NC(info);
		else if (nc == columnAddr_tel) doAddr_tel_NC(info);
		else if (nc == columnAddr_fax) doAddr_fax_NC(info);
		else if (nc == columnAddr_cntct_dpt) doAddr_cntct_dpt_NC(info);
		else if (nc == columnAddr_cntct_psn) doAddr_cntct_psn_NC(info);
	}

	/**
	 * [Addr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == AddrTable) doAddr_NE(info);
		else if (ne == columnAddr_cntry_cd) doAddr_cntry_cd_NE(info);
		else if (ne == columnAddr_cntry_nm) doAddr_cntry_nm_NE(info);
		else if (ne == columnAddr_zip_cd) doAddr_zip_cd_NE(info);
		else if (ne == columnAddr_addr1) doAddr_addr1_NE(info);
		else if (ne == columnAddr_addr2) doAddr_addr2_NE(info);
		else if (ne == columnAddr_addr3) doAddr_addr3_NE(info);
		else if (ne == columnAddr_addr4) doAddr_addr4_NE(info);
		else if (ne == columnAddr_tel) doAddr_tel_NE(info);
		else if (ne == columnAddr_fax) doAddr_fax_NE(info);
		else if (ne == columnAddr_cntct_dpt) doAddr_cntct_dpt_NE(info);
		else if (ne == columnAddr_cntct_psn) doAddr_cntct_psn_NE(info);
	}

	/**
	 * [Addr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == AddrTable) doAddr_NX(info);
		else if (nx == columnAddr_cntry_cd) doAddr_cntry_cd_NX(info);
		else if (nx == columnAddr_cntry_nm) doAddr_cntry_nm_NX(info);
		else if (nx == columnAddr_zip_cd) doAddr_zip_cd_NX(info);
		else if (nx == columnAddr_addr1) doAddr_addr1_NX(info);
		else if (nx == columnAddr_addr2) doAddr_addr2_NX(info);
		else if (nx == columnAddr_addr3) doAddr_addr3_NX(info);
		else if (nx == columnAddr_addr4) doAddr_addr4_NX(info);
		else if (nx == columnAddr_tel) doAddr_tel_NX(info);
		else if (nx == columnAddr_fax) doAddr_fax_NX(info);
		else if (nx == columnAddr_cntct_dpt) doAddr_cntct_dpt_NX(info);
		else if (nx == columnAddr_cntct_psn) doAddr_cntct_psn_NX(info);
	}

	/**
	 * [Addr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnAddr_cntry_cd) doAddr_cntry_cd_LC(info);
		else if (lc == columnAddr_cntry_nm) doAddr_cntry_nm_LC(info);
		else if (lc == columnAddr_zip_cd) doAddr_zip_cd_LC(info);
		else if (lc == columnAddr_addr1) doAddr_addr1_LC(info);
		else if (lc == columnAddr_addr2) doAddr_addr2_LC(info);
		else if (lc == columnAddr_addr3) doAddr_addr3_LC(info);
		else if (lc == columnAddr_addr4) doAddr_addr4_LC(info);
		else if (lc == columnAddr_tel) doAddr_tel_LC(info);
		else if (lc == columnAddr_fax) doAddr_fax_LC(info);
		else if (lc == columnAddr_cntct_dpt) doAddr_cntct_dpt_LC(info);
		else if (lc == columnAddr_cntct_psn) doAddr_cntct_psn_LC(info);
	}

	/**
	 * [Addr]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnAddr_cntry_cd]の作成メソッド
	 */
	public MCList getAddr_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}