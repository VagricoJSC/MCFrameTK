package mcframe.clientMSUB.MSUBP5020;

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
 * 画面"MSUBP_SnoWrkNo_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_SnoWrkNo_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MSUBP5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SnoWrkNo]ブロック関連のField定義
	public MCPanel SnoWrkNoPanel = null;
	public MCScrollPane SnoWrkNoScrollPane = null;
	public MCTable2<mcframe.clientMSUB.MSUBP5020.SnoWrkNoR> SnoWrkNoTable = null;
	// [SnoWrkNo]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D SnoWrkNo_sno_p_PPanel;
	public MCColumnConfig columnSnoWrkNo_sno1;// [SnoWrkNo]の[sno_p.sno1]を[columnSnoWrkNo_sno1]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno1_null_flg;// [SnoWrkNo]の[sno_p.sno1_null_flg]を[columnSnoWrkNo_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno2;// [SnoWrkNo]の[sno_p.sno2]を[columnSnoWrkNo_sno2]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno2_null_flg;// [SnoWrkNo]の[sno_p.sno2_null_flg]を[columnSnoWrkNo_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno3;// [SnoWrkNo]の[sno_p.sno3]を[columnSnoWrkNo_sno3]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno3_null_flg;// [SnoWrkNo]の[sno_p.sno3_null_flg]を[columnSnoWrkNo_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno4;// [SnoWrkNo]の[sno_p.sno4]を[columnSnoWrkNo_sno4]としてエイリアス定義。
	public MCColumnConfig columnSnoWrkNo_sno4_null_flg;// [SnoWrkNo]の[sno_p.sno4_null_flg]を[columnSnoWrkNo_sno4_null_flg]としてエイリアス定義。
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSnoWrkNo_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnSnoWrkNo_wrk_nm = null;
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
	
	/** [SnoWrkNo]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUB.MSUBP5020.SnoWrkNoR> aSnoWrkNoL;

	/**
	 * コピーによってaSnoWrkNoLを設定します。
	 *
	 * aSnoWrkNoLのインスタンスは変更されません。
	 *
	 * @param dataset SnoWrkNoL
	 */
	public void setSnoWrkNoL(MCList<mcframe.clientMSUB.MSUBP5020.SnoWrkNoR> aList) {
		if (getSnoWrkNoL() != aList) {
			getSnoWrkNoL().setAll(aList);
		}
	}

	/**
	 * [SnoWrkNo]ブロックのコンテナaSnoWrkNoLを返します。
	 *
	 * @return SnoWrkNoL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5020.SnoWrkNoR> getSnoWrkNoL() {
		return aSnoWrkNoL;
	}

	/**
	 * aSnoWrkNoRを作成します。
	 *
	 * @return SnoWrkNoR
	 */
	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR createSnoWrkNoR() {
		return mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.create();
	}

	/**
	 * aSnoWrkNoLを作成します。
	 *
	 * @return SnoWrkNoL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5020.SnoWrkNoR> createSnoWrkNoL() {
		return MCList.create(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	}

	/**
	 * SnoWrkNoTableを初期化します。
	 */
	protected void createSnoWrkNoTable(){
		if(SnoWrkNoTable == null){
			SnoWrkNoTable = beansFactory.createTable2("SnoWrkNo.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSnoWrkNoL())) ret.add(getSnoWrkNoL());
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
		if(aCnt == getSnoWrkNoL()) return "SnoWrkNo";
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
		if(bId.equals("SnoWrkNo")) return getSnoWrkNoL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SnoWrkNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_SnoWrkNo_D_MC_A() {
		aSnoWrkNoL = createSnoWrkNoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_SnoWrkNo_D_MC_A(String name) {
		aSnoWrkNoL = createSnoWrkNoL();
		createSnoWrkNoTable();
		SnoWrkNoTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_SnoWrkNo_D_MC.jbCreateSnoWrkNo((MSUBP_SnoWrkNo_D)this);
	}

	/**
	 * [SnoWrkNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSnoWrkNo(MSUBP_SnoWrkNo_D p) {
		p.SnoWrkNo_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno_p);
		p.SnoWrkNo_sno_p_PPanel.setName("SnoWrkNo.sno_p");
		p.columnSnoWrkNo_sno1 = p.SnoWrkNo_sno_p_PPanel.columnSno_sno1;
		p.columnSnoWrkNo_sno1.addAliasName("SnoWrkNo.sno1", p);
		p.columnSnoWrkNo_sno1_null_flg = p.SnoWrkNo_sno_p_PPanel.columnSno_sno1_null_flg;
		p.columnSnoWrkNo_sno1_null_flg.addAliasName("SnoWrkNo.sno1_null_flg", p);
		p.columnSnoWrkNo_sno2 = p.SnoWrkNo_sno_p_PPanel.columnSno_sno2;
		p.columnSnoWrkNo_sno2.addAliasName("SnoWrkNo.sno2", p);
		p.columnSnoWrkNo_sno2_null_flg = p.SnoWrkNo_sno_p_PPanel.columnSno_sno2_null_flg;
		p.columnSnoWrkNo_sno2_null_flg.addAliasName("SnoWrkNo.sno2_null_flg", p);
		p.columnSnoWrkNo_sno3 = p.SnoWrkNo_sno_p_PPanel.columnSno_sno3;
		p.columnSnoWrkNo_sno3.addAliasName("SnoWrkNo.sno3", p);
		p.columnSnoWrkNo_sno3_null_flg = p.SnoWrkNo_sno_p_PPanel.columnSno_sno3_null_flg;
		p.columnSnoWrkNo_sno3_null_flg.addAliasName("SnoWrkNo.sno3_null_flg", p);
		p.columnSnoWrkNo_sno4 = p.SnoWrkNo_sno_p_PPanel.columnSno_sno4;
		p.columnSnoWrkNo_sno4.addAliasName("SnoWrkNo.sno4", p);
		p.columnSnoWrkNo_sno4_null_flg = p.SnoWrkNo_sno_p_PPanel.columnSno_sno4_null_flg;
		p.columnSnoWrkNo_sno4_null_flg.addAliasName("SnoWrkNo.sno4_null_flg", p);
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
	public static MSUBP_SnoWrkNo_D create(){
		MSUBP_SnoWrkNo_D p = new MSUBP_SnoWrkNo_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_SnoWrkNo_D create(String name){
		MSUBP_SnoWrkNo_D p = new MSUBP_SnoWrkNo_D(name);
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
		MSUBP_SnoWrkNo_D_MC.jbfInitSnoWrkNo((MSUBP_SnoWrkNo_D)this);
		MSUBP_SnoWrkNo_D_MC.jbInitSnoWrkNo((MSUBP_SnoWrkNo_D)this);
	}

	/**
	 * [SnoWrkNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSnoWrkNo(MSUBP_SnoWrkNo_D p) {
		// ブロック関連の初期化
		p.SnoWrkNoPanel = p.beansFactory.createPanel("SnoWrkNo");
		p.SnoWrkNoScrollPane = p.beansFactory.createScrollPane("SnoWrkNo.scroll");
		p.createSnoWrkNoTable();
		// ブロックの項目の初期化
		p.columnSnoWrkNo_wrk_no = p.beansFactory.createTableColumn("SnoWrkNo.wrk_no", MCColumnType.TEXT);
		p.columnSnoWrkNo_wrk_nm = p.beansFactory.createTableColumn("SnoWrkNo.wrk_nm", MCColumnType.TEXT);
	}

	/**
	 * [SnoWrkNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSnoWrkNo(MSUBP_SnoWrkNo_D p) {
		// ブロック関連の初期化
		p.add(p.SnoWrkNoPanel);
		p.setLastBeans(p.SnoWrkNoPanel);
		p.SnoWrkNoPanel.add(p.SnoWrkNoScrollPane);
		p.SnoWrkNoPanel.setLastBeans(p.SnoWrkNoTable);
		p.SnoWrkNoScrollPane.setViewportView(p.SnoWrkNoTable);
		p.SnoWrkNoTable.setList(p.getSnoWrkNoL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_SnoWrkNo_D_MC.mcInitSnoWrkNo((MSUBP_SnoWrkNo_D)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_SnoWrkNo_D_MC.statusInitENABLE_SnoWrkNo((MSUBP_SnoWrkNo_D)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_SnoWrkNo_D_MC.statusInitDISABLE_SnoWrkNo((MSUBP_SnoWrkNo_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_SnoWrkNo_D_MC.statusInitREAD__ONLY_SnoWrkNo((MSUBP_SnoWrkNo_D)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_SnoWrkNo_D_MC.statusInitREQUIRED_SnoWrkNo((MSUBP_SnoWrkNo_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_SnoWrkNo_D_MC.statusInitINVISIBLE_SnoWrkNo((MSUBP_SnoWrkNo_D)this);

	}

	/**
	 *  [SnoWrkNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSnoWrkNo(MSUBP_SnoWrkNo_D p) {
		p.SnoWrkNoTable.addAllListener(p);
		p.columnSnoWrkNo_wrk_no.addAllListener(p);
		p.columnSnoWrkNo_wrk_no.setListListener(p);
		p.columnSnoWrkNo_wrk_nm.addAllListener(p);
		p.columnSnoWrkNo_wrk_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_SnoWrkNo(MSUBP_SnoWrkNo_D p){
		p.SnoWrkNo_sno_p_PPanel.putStatus(ENABLE, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.columnSnoWrkNo_wrk_no.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnSnoWrkNo_wrk_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_SnoWrkNo(MSUBP_SnoWrkNo_D p){
		p.SnoWrkNo_sno_p_PPanel.putStatus(DISABLE, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.DISABLE);
		p.columnSnoWrkNo_wrk_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnSnoWrkNo_wrk_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_SnoWrkNo(MSUBP_SnoWrkNo_D p){
		p.SnoWrkNo_sno_p_PPanel.putStatus(READ_ONLY, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnSnoWrkNo_wrk_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnSnoWrkNo_wrk_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_SnoWrkNo(MSUBP_SnoWrkNo_D p){
		p.SnoWrkNo_sno_p_PPanel.putStatus(REQUIRED, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.REQUIRED);
		p.columnSnoWrkNo_wrk_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnSnoWrkNo_wrk_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_SnoWrkNo(MSUBP_SnoWrkNo_D p){
		p.SnoWrkNo_sno_p_PPanel.putStatus(INVISIBLE, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnSnoWrkNo_wrk_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnSnoWrkNo_wrk_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSUBP_SnoWrkNo_D_MC.setTableConfigSnoWrkNo((MSUBP_SnoWrkNo_D)this);
	}

	/**
	 * [SnoWrkNo]ブロックのTableの設定
	 */
	protected static void setTableConfigSnoWrkNo(MSUBP_SnoWrkNo_D p) {
		p.SnoWrkNoTable.addTable(p.SnoWrkNo_sno_p_PPanel.SnoTable);
		p.SnoWrkNo_sno_p_PPanel.columnSno_sno1.setListType(MCListType.FREE);
		p.SnoWrkNo_sno_p_PPanel.columnSno_sno1.setLinkBeans(p.columnSnoWrkNo_wrk_no, p.columnSnoWrkNo_wrk_nm);
		p.columnSnoWrkNo_wrk_no.setMeta(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.wrk_no_META);
		p.SnoWrkNoTable.addColumnConfig(p.columnSnoWrkNo_wrk_no);
		p.columnSnoWrkNo_wrk_nm.setMeta(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.wrk_nm_META);
		p.SnoWrkNoTable.addColumnConfig(p.columnSnoWrkNo_wrk_nm);
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
		if (vc == SnoWrkNoTable) return doSnoWrkNo_VC(info);
		if (vc == columnSnoWrkNo_wrk_no) return doSnoWrkNo_wrk_no_VC(info);
		if (vc == columnSnoWrkNo_wrk_nm) return doSnoWrkNo_wrk_nm_VC(info);
		return true;
	}

	/**
	 * [SnoWrkNo]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_wrk_nm_VC(MCEventInfo info){
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
		if (nc == SnoWrkNoTable) doSnoWrkNo_NC(info);
		else if (nc == columnSnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NC(info);
		else if (nc == columnSnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NC(info);
	}

	/**
	 * [SnoWrkNo]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SnoWrkNoTable) doSnoWrkNo_NE(info);
		else if (ne == columnSnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NE(info);
		else if (ne == columnSnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NE(info);
	}

	/**
	 * [SnoWrkNo]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SnoWrkNoTable) doSnoWrkNo_NX(info);
		else if (nx == columnSnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NX(info);
		else if (nx == columnSnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NX(info);
	}

	/**
	 * [SnoWrkNo]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnSnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_LC(info);
		else if (lc == columnSnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_LC(info);
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}