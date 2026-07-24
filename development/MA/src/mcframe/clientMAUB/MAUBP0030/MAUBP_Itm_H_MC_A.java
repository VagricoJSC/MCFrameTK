package mcframe.clientMAUB.MAUBP0030;

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
 * 画面"MAUBP_Itm_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Itm_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Itm]ブロック関連のField定義
	public MCPanel ItmPanel = null;
	// [Itm]ブロックの項目のField定義
	public MCLabel Itm_itm_cd_Label = null;
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCTextField Itm_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCTextComboBox Itm_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCTextComboBox Itm_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCTextComboBox Itm_itm_sub3 = null;
	/**
	 * Item name 品名.<p>
	 *
	 */
	public MCTextField Itm_itm_nm = null;
	/** [ENABLE_SRCH]モードを表す定数 */
	public static final String ENABLE_SRCH = "ENABLE_SRCH";
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
	public static final String[] statusArray = new String[]{ENABLE_SRCH, ENABLE, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Itm]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0030.ItmR aItmR;

	/**
	 * 項目コピーによってaItmRを設定します。
	 *
	 * aItmRのインスタンスは変更されません。
	 *
	 * @param row ItmR
	 */
	public void setItmR(mcframe.clientMAUB.MAUBP0030.ItmR row) {
		if (row != null) {
			MCRow.copyall(getItmR(), row);
		}
	}

	/**
	 * [Itm]ブロックのコンテナaItmRを返します。
	 *
	 * @return ItmR
	 */
	public mcframe.clientMAUB.MAUBP0030.ItmR getItmR() {
		return aItmR;
	}

	/**
	 * aItmRを作成します。
	 *
	 * @return ItmR
	 */
	public mcframe.clientMAUB.MAUBP0030.ItmR createItmR() {
		return mcframe.clientMAUB.MAUBP0030.ItmR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getItmR())) ret.add(getItmR());
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
		if(aCnt == getItmR()) return "Itm";
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
		if(bId.equals("Itm")) return getItmR();
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
	public MAUBP_Itm_H_MC_A() {
		aItmR = createItmR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Itm_H_MC_A(mcframe.clientMAUB.MAUBP0030.ItmR row){
		aItmR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Itm_H_MC.jbCreateItm((MAUBP_Itm_H)this);
	}

	/**
	 * [Itm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItm(MAUBP_Itm_H p) {
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
			Itm_itm_cd_p = createItm_itm_cd_ListPutter(Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");

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
			Itm_itm_sub1_p = createItm_itm_sub1_ListPutter(Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");

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
			Itm_itm_sub2_p = createItm_itm_sub2_ListPutter(Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");

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
			Itm_itm_sub3_p = createItm_itm_sub3_ListPutter(Itm_itm_sub3, "itm_sub3", "itm_nm");

		}
		return Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_Itm_H create(mcframe.clientMAUB.MAUBP0030.ItmR row){
		MAUBP_Itm_H p = new MAUBP_Itm_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Itm_H create(){
		MAUBP_Itm_H p = new MAUBP_Itm_H();
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
		MAUBP_Itm_H_MC.jbfInitItm((MAUBP_Itm_H)this);
		MAUBP_Itm_H_MC.jbInitItm((MAUBP_Itm_H)this);
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItm(MAUBP_Itm_H p) {
		// ブロック関連の初期化
		p.ItmPanel = p.beansFactory.createPanel("Itm");
		// ブロックの項目の初期化
		p.Itm_itm_cd_Label = p.beansFactory.createLabel("Itm.itm_cd_Label");
		p.Itm_itm_cd = p.beansFactory.createTextField("Itm.itm_cd");
		p.Itm_itm_cd.setLabel(p.Itm_itm_cd_Label);
		p.Itm_itm_sub1 = p.beansFactory.createTextComboBox("Itm.itm_sub1");
		p.Itm_itm_sub2 = p.beansFactory.createTextComboBox("Itm.itm_sub2");
		p.Itm_itm_sub3 = p.beansFactory.createTextComboBox("Itm.itm_sub3");
		p.Itm_itm_nm = p.beansFactory.createTextField("Itm.itm_nm");
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItm(MAUBP_Itm_H p) {
		// ブロック関連の初期化
		p.add(p.ItmPanel);
		p.setLastBeans(p.ItmPanel);
		// ブロックの項目の初期化
		p.ItmPanel.add(p.Itm_itm_cd_Label);
		p.ItmPanel.add(p.Itm_itm_cd);
		p.ItmPanel.setLastBeans(p.Itm_itm_cd);
		p.Itm_itm_cd.setNextBeans(p.Itm_itm_sub1);
		p.Itm_itm_cd.setRow(p.getItmR(), mcframe.clientMAUB.MAUBP0030.ItmR.itm_cd_META);
		p.Itm_itm_cd.addLinkBeans(p.Itm_itm_nm,p.Itm_itm_sub1,p.Itm_itm_sub2,p.Itm_itm_sub3);
		p.Itm_itm_cd.setListType(MCListType.STRICT);
		p.Itm_itm_sub1.setListType(MCListType.STRICT);
		p.Itm_itm_sub1.setLinkBeans(p.Itm_itm_nm,p.Itm_itm_sub2,p.Itm_itm_sub3);
		p.ItmPanel.add(p.Itm_itm_sub1);
		p.Itm_itm_sub1.setNextBeans(p.Itm_itm_sub2);
		p.Itm_itm_sub1.setRow(p.getItmR(), mcframe.clientMAUB.MAUBP0030.ItmR.itm_sub1_META);
		p.Itm_itm_sub2.setListType(MCListType.STRICT);
		p.Itm_itm_sub2.setLinkBeans(p.Itm_itm_nm,p.Itm_itm_sub3);
		p.ItmPanel.add(p.Itm_itm_sub2);
		p.Itm_itm_sub2.setNextBeans(p.Itm_itm_sub3);
		p.Itm_itm_sub2.setRow(p.getItmR(), mcframe.clientMAUB.MAUBP0030.ItmR.itm_sub2_META);
		p.Itm_itm_sub3.setListType(MCListType.STRICT);
		p.Itm_itm_sub3.setLinkBeans(p.Itm_itm_nm);
		p.ItmPanel.add(p.Itm_itm_sub3);
		p.Itm_itm_sub3.setNextBeans(p.Itm_itm_nm);
		p.Itm_itm_sub3.setRow(p.getItmR(), mcframe.clientMAUB.MAUBP0030.ItmR.itm_sub3_META);
		p.ItmPanel.add(p.Itm_itm_nm);
		p.Itm_itm_nm.setRow(p.getItmR(), mcframe.clientMAUB.MAUBP0030.ItmR.itm_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Itm_H_MC.mcInitItm((MAUBP_Itm_H)this);

		// [ENABLE_SRCH]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitENABLE__SRCH_Itm((MAUBP_Itm_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitENABLE_Itm((MAUBP_Itm_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitDISABLE_Itm((MAUBP_Itm_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitREAD__ONLY_Itm((MAUBP_Itm_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitREQUIRED_Itm((MAUBP_Itm_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Itm_H_MC.statusInitINVISIBLE_Itm((MAUBP_Itm_H)this);

	}

	/**
	 *  [Itm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItm(MAUBP_Itm_H p) {
		p.Itm_itm_cd.setListListener(p);
		p.Itm_itm_cd.addAllListener(p);
		p.Itm_itm_sub1.setListListener(p);
		p.Itm_itm_sub1.addAllListener(p);
		p.Itm_itm_sub2.setListListener(p);
		p.Itm_itm_sub2.addAllListener(p);
		p.Itm_itm_sub3.setListListener(p);
		p.Itm_itm_sub3.addAllListener(p);
		p.Itm_itm_nm.setListListener(p);
		p.Itm_itm_nm.addAllListener(p);
	}

	/**
	 * [ENABLE_SRCH]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitENABLE__SRCH_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Itm_itm_sub1.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Itm_itm_sub2.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Itm_itm_sub3.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Itm_itm_nm.putMode(p, ENABLE_SRCH, MCMode.ENABLE);

	}

	/**
	 * [ENABLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Itm_itm_sub1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Itm_itm_sub2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Itm_itm_sub3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Itm_itm_nm.putMode(p, ENABLE, MCMode.REQUIRED);

	}

	/**
	 * [DISABLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.Itm_itm_sub1.putMode(p, DISABLE, MCMode.DISABLE);
		p.Itm_itm_sub2.putMode(p, DISABLE, MCMode.DISABLE);
		p.Itm_itm_sub3.putMode(p, DISABLE, MCMode.DISABLE);
		p.Itm_itm_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Itm_itm_sub1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Itm_itm_sub2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Itm_itm_sub3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Itm_itm_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Itm_itm_sub1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Itm_itm_sub2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Itm_itm_sub3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Itm_itm_nm.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Itm(MAUBP_Itm_H p){
		p.Itm_itm_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Itm_itm_sub1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Itm_itm_sub2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Itm_itm_sub3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Itm_itm_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		Itm_itm_cd.getListConfig().setPutter(getItm_itm_cd_ListPutter());
		Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Itm_itm_sub1.getListConfig().setPutter(getItm_itm_sub1_ListPutter());
		Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Itm_itm_sub2.getListConfig().setPutter(getItm_itm_sub2_ListPutter());
		Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Itm_itm_sub3.getListConfig().setPutter(getItm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[ENABLE_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLE_SRCHStatus() {
		status = ENABLE_SRCH;
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
		if (ENABLE_SRCH.equals(status)) {
			setENABLE_SRCHStatus();
		}
		else if (ENABLE.equals(status)) {
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
		if(combo == Itm_itm_cd) return getItm_itm_cd(row, info);
		if(combo == Itm_itm_sub1) return getItm_itm_sub1(row, info);
		if(combo == Itm_itm_sub2) return getItm_itm_sub2(row, info);
		if(combo == Itm_itm_sub3) return getItm_itm_sub3(row, info);
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
		if (vc == Itm_itm_cd) return doItm_itm_cd_VC(info);
		if (vc == Itm_itm_sub1) return doItm_itm_sub1_VC(info);
		if (vc == Itm_itm_sub2) return doItm_itm_sub2_VC(info);
		if (vc == Itm_itm_sub3) return doItm_itm_sub3_VC(info);
		if (vc == Itm_itm_nm) return doItm_itm_nm_VC(info);
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
		if (nc == Itm_itm_cd) doItm_itm_cd_NC(info);
		else if (nc == Itm_itm_sub1) doItm_itm_sub1_NC(info);
		else if (nc == Itm_itm_sub2) doItm_itm_sub2_NC(info);
		else if (nc == Itm_itm_sub3) doItm_itm_sub3_NC(info);
		else if (nc == Itm_itm_nm) doItm_itm_nm_NC(info);
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
		if (ne == Itm_itm_cd) doItm_itm_cd_NE(info);
		else if (ne == Itm_itm_sub1) doItm_itm_sub1_NE(info);
		else if (ne == Itm_itm_sub2) doItm_itm_sub2_NE(info);
		else if (ne == Itm_itm_sub3) doItm_itm_sub3_NE(info);
		else if (ne == Itm_itm_nm) doItm_itm_nm_NE(info);
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
		if (nx == Itm_itm_cd) doItm_itm_cd_NX(info);
		else if (nx == Itm_itm_sub1) doItm_itm_sub1_NX(info);
		else if (nx == Itm_itm_sub2) doItm_itm_sub2_NX(info);
		else if (nx == Itm_itm_sub3) doItm_itm_sub3_NX(info);
		else if (nx == Itm_itm_nm) doItm_itm_nm_NX(info);
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
		if (lc == Itm_itm_cd) doItm_itm_cd_LC(info);
		else if (lc == Itm_itm_sub1) doItm_itm_sub1_LC(info);
		else if (lc == Itm_itm_sub2) doItm_itm_sub2_LC(info);
		else if (lc == Itm_itm_sub3) doItm_itm_sub3_LC(info);
		else if (lc == Itm_itm_nm) doItm_itm_nm_LC(info);
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
	 * コンボ／リストのリスト[Itm_itm_cd]の作成メソッド
	 */
	public MCList getItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Itm_itm_sub1]の作成メソッド
	 */
	public MCList getItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Itm_itm_sub2]の作成メソッド
	 */
	public MCList getItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Itm_itm_sub3]の作成メソッド
	 */
	public MCList getItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}