package mcframe.clientMAUB.MAUBP0100;

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
 * 画面"MAUBP_ItmTyp_S"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ItmTyp_S_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ItmTyp]ブロック関連のField定義
	public MCPanel ItmTypPanel = null;
	// [ItmTyp]ブロックの項目のField定義
	public MCLabel ItmTyp_itm_typ_Label = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCTextComboBox ItmTyp_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCTextField ItmTyp_itm_typ_nm = null;
	public MCLabel ItmTyp_itm_typ_d_cd_Label = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCTextComboBox ItmTyp_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCTextField ItmTyp_itm_typ_d_nm = null;
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
	
	/** [ItmTyp]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0100.ItmTypR aItmTypR;

	/**
	 * 項目コピーによってaItmTypRを設定します。
	 *
	 * aItmTypRのインスタンスは変更されません。
	 *
	 * @param row ItmTypR
	 */
	public void setItmTypR(mcframe.clientMAUB.MAUBP0100.ItmTypR row) {
		if (row != null) {
			MCRow.copyall(getItmTypR(), row);
		}
	}

	/**
	 * [ItmTyp]ブロックのコンテナaItmTypRを返します。
	 *
	 * @return ItmTypR
	 */
	public mcframe.clientMAUB.MAUBP0100.ItmTypR getItmTypR() {
		return aItmTypR;
	}

	/**
	 * aItmTypRを作成します。
	 *
	 * @return ItmTypR
	 */
	public mcframe.clientMAUB.MAUBP0100.ItmTypR createItmTypR() {
		return mcframe.clientMAUB.MAUBP0100.ItmTypR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getItmTypR())) ret.add(getItmTypR());
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
		if(aCnt == getItmTypR()) return "ItmTyp";
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
		if(bId.equals("ItmTyp")) return getItmTypR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ItmTypPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ItmTyp_S_MC_A() {
		aItmTypR = createItmTypR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_ItmTyp_S_MC_A(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		aItmTypR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ItmTyp_S_MC.jbCreateItmTyp((MAUBP_ItmTyp_S)this);
	}

	/**
	 * [ItmTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmTyp(MAUBP_ItmTyp_S p) {
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

	
	/** [ItmTyp_itm_typ_ListPutter]の定義 */
	private MCListPutter ItmTyp_itm_typ_p = null;

	/**
	 * [ItmTyp_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getItmTyp_itm_typ_ListPutter() {
		if (ItmTyp_itm_typ_p == null) {
			ItmTyp_itm_typ_p = createItmTyp_itm_typ_ListPutter(ItmTyp_itm_typ, "itm_typ", "itm_typ_nm");

		}
		return ItmTyp_itm_typ_p;
	}
	
	
	/** [ItmTyp_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter ItmTyp_itm_typ_d_cd_p = null;

	/**
	 * [ItmTyp_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getItmTyp_itm_typ_d_cd_ListPutter() {
		if (ItmTyp_itm_typ_d_cd_p == null) {
			ItmTyp_itm_typ_d_cd_p = createItmTyp_itm_typ_d_cd_ListPutter(ItmTyp_itm_typ_d_cd, "itm_typ_d_cd", "itm_typ_d_nm");

		}
		return ItmTyp_itm_typ_d_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_ItmTyp_S create(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		MAUBP_ItmTyp_S p = new MAUBP_ItmTyp_S(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ItmTyp_S create(){
		MAUBP_ItmTyp_S p = new MAUBP_ItmTyp_S();
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
		MAUBP_ItmTyp_S_MC.jbfInitItmTyp((MAUBP_ItmTyp_S)this);
		MAUBP_ItmTyp_S_MC.jbInitItmTyp((MAUBP_ItmTyp_S)this);
	}

	/**
	 * [ItmTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmTyp(MAUBP_ItmTyp_S p) {
		// ブロック関連の初期化
		p.ItmTypPanel = p.beansFactory.createPanel("ItmTyp");
		// ブロックの項目の初期化
		p.ItmTyp_itm_typ_Label = p.beansFactory.createLabel("ItmTyp.itm_typ_Label");
		p.ItmTyp_itm_typ = p.beansFactory.createTextComboBox("ItmTyp.itm_typ");
		p.ItmTyp_itm_typ.setLabel(p.ItmTyp_itm_typ_Label);
		p.ItmTyp_itm_typ_nm = p.beansFactory.createTextField("ItmTyp.itm_typ_nm");
		p.ItmTyp_itm_typ_d_cd_Label = p.beansFactory.createLabel("ItmTyp.itm_typ_d_cd_Label");
		p.ItmTyp_itm_typ_d_cd = p.beansFactory.createTextComboBox("ItmTyp.itm_typ_d_cd");
		p.ItmTyp_itm_typ_d_cd.setLabel(p.ItmTyp_itm_typ_d_cd_Label);
		p.ItmTyp_itm_typ_d_nm = p.beansFactory.createTextField("ItmTyp.itm_typ_d_nm");
	}

	/**
	 * [ItmTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmTyp(MAUBP_ItmTyp_S p) {
		// ブロック関連の初期化
		p.add(p.ItmTypPanel);
		p.setLastBeans(p.ItmTypPanel);
		// ブロックの項目の初期化
		p.ItmTyp_itm_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmTyp_itm_typ, true);
		p.ItmTyp_itm_typ.setLinkBeans(p.ItmTyp_itm_typ_nm);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ_Label);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ);
		p.ItmTypPanel.setLastBeans(p.ItmTyp_itm_typ);
		p.ItmTyp_itm_typ.setNextBeans(p.ItmTyp_itm_typ_nm);
		p.ItmTyp_itm_typ.setRow(p.getItmTypR(), mcframe.clientMAUB.MAUBP0100.ItmTypR.itm_typ_META);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ_nm);
		p.ItmTyp_itm_typ_nm.setNextBeans(p.ItmTyp_itm_typ_d_cd);
		p.ItmTyp_itm_typ_nm.setRow(p.getItmTypR(), mcframe.clientMAUB.MAUBP0100.ItmTypR.itm_typ_nm_META);
		p.ItmTyp_itm_typ_d_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmTyp_itm_typ_d_cd, true);
		p.ItmTyp_itm_typ_d_cd.setLinkBeans(p.ItmTyp_itm_typ_d_nm);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ_d_cd_Label);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ_d_cd);
		p.ItmTyp_itm_typ_d_cd.setNextBeans(p.ItmTyp_itm_typ_d_nm);
		p.ItmTyp_itm_typ_d_cd.setRow(p.getItmTypR(), mcframe.clientMAUB.MAUBP0100.ItmTypR.itm_typ_d_cd_META);
		p.ItmTypPanel.add(p.ItmTyp_itm_typ_d_nm);
		p.ItmTyp_itm_typ_d_nm.setRow(p.getItmTypR(), mcframe.clientMAUB.MAUBP0100.ItmTypR.itm_typ_d_nm_META);
		p.setPluralValueEnable(p.ItmTyp_itm_typ_d_nm, true);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ItmTyp_S_MC.mcInitItmTyp((MAUBP_ItmTyp_S)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ItmTyp_S_MC.statusInitENABLE_ItmTyp((MAUBP_ItmTyp_S)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ItmTyp_S_MC.statusInitDISABLE_ItmTyp((MAUBP_ItmTyp_S)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ItmTyp_S_MC.statusInitREAD__ONLY_ItmTyp((MAUBP_ItmTyp_S)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ItmTyp_S_MC.statusInitREQUIRED_ItmTyp((MAUBP_ItmTyp_S)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ItmTyp_S_MC.statusInitINVISIBLE_ItmTyp((MAUBP_ItmTyp_S)this);

	}

	/**
	 *  [ItmTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmTyp(MAUBP_ItmTyp_S p) {
		p.ItmTyp_itm_typ.setListListener(p);
		p.ItmTyp_itm_typ.addAllListener(p);
		p.ItmTyp_itm_typ_nm.setListListener(p);
		p.ItmTyp_itm_typ_nm.addAllListener(p);
		p.ItmTyp_itm_typ_d_cd.setListListener(p);
		p.ItmTyp_itm_typ_d_cd.addAllListener(p);
		p.ItmTyp_itm_typ_d_nm.setListListener(p);
		p.ItmTyp_itm_typ_d_nm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ItmTyp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ItmTyp(MAUBP_ItmTyp_S p){
		p.ItmTyp_itm_typ.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmTyp_itm_typ_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.ItmTyp_itm_typ_d_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmTyp_itm_typ_d_nm.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[ItmTyp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ItmTyp(MAUBP_ItmTyp_S p){
		p.ItmTyp_itm_typ.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmTyp_itm_typ_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmTyp_itm_typ_d_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmTyp_itm_typ_d_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ItmTyp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ItmTyp(MAUBP_ItmTyp_S p){
		p.ItmTyp_itm_typ.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmTyp_itm_typ_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmTyp_itm_typ_d_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmTyp_itm_typ_d_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ItmTyp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ItmTyp(MAUBP_ItmTyp_S p){
		p.ItmTyp_itm_typ.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmTyp_itm_typ_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmTyp_itm_typ_d_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmTyp_itm_typ_d_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[ItmTyp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ItmTyp(MAUBP_ItmTyp_S p){
		p.ItmTyp_itm_typ.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmTyp_itm_typ_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmTyp_itm_typ_d_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmTyp_itm_typ_d_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		ItmTyp_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmTyp_itm_typ.getListConfig().setPutter(getItmTyp_itm_typ_ListPutter());
		ItmTyp_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmTyp_itm_typ_d_cd.getListConfig().setPutter(getItmTyp_itm_typ_d_cd_ListPutter());
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
	 * [ItmTyp_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createItmTyp_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTyp");
		return lp;
	}
	 
	/**
	 * [ItmTyp_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createItmTyp_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTypD");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == ItmTyp_itm_typ) return getItmTyp_itm_typ(row, info);
		if(combo == ItmTyp_itm_typ_d_cd) return getItmTyp_itm_typ_d_cd(row, info);
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
		if (vc == ItmTyp_itm_typ) return doItmTyp_itm_typ_VC(info);
		if (vc == ItmTyp_itm_typ_nm) return doItmTyp_itm_typ_nm_VC(info);
		if (vc == ItmTyp_itm_typ_d_cd) return doItmTyp_itm_typ_d_cd_VC(info);
		if (vc == ItmTyp_itm_typ_d_nm) return doItmTyp_itm_typ_d_nm_VC(info);
		return true;
	}

	/**
	 * [ItmTyp]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmTyp_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmTyp_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmTyp_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmTyp_itm_typ_d_nm_VC(MCEventInfo info){
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
		if (nc == ItmTyp_itm_typ) doItmTyp_itm_typ_NC(info);
		else if (nc == ItmTyp_itm_typ_nm) doItmTyp_itm_typ_nm_NC(info);
		else if (nc == ItmTyp_itm_typ_d_cd) doItmTyp_itm_typ_d_cd_NC(info);
		else if (nc == ItmTyp_itm_typ_d_nm) doItmTyp_itm_typ_d_nm_NC(info);
	}

	/**
	 * [ItmTyp]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ItmTyp_itm_typ) doItmTyp_itm_typ_NE(info);
		else if (ne == ItmTyp_itm_typ_nm) doItmTyp_itm_typ_nm_NE(info);
		else if (ne == ItmTyp_itm_typ_d_cd) doItmTyp_itm_typ_d_cd_NE(info);
		else if (ne == ItmTyp_itm_typ_d_nm) doItmTyp_itm_typ_d_nm_NE(info);
	}

	/**
	 * [ItmTyp]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ItmTyp_itm_typ) doItmTyp_itm_typ_NX(info);
		else if (nx == ItmTyp_itm_typ_nm) doItmTyp_itm_typ_nm_NX(info);
		else if (nx == ItmTyp_itm_typ_d_cd) doItmTyp_itm_typ_d_cd_NX(info);
		else if (nx == ItmTyp_itm_typ_d_nm) doItmTyp_itm_typ_d_nm_NX(info);
	}

	/**
	 * [ItmTyp]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == ItmTyp_itm_typ) doItmTyp_itm_typ_LC(info);
		else if (lc == ItmTyp_itm_typ_nm) doItmTyp_itm_typ_nm_LC(info);
		else if (lc == ItmTyp_itm_typ_d_cd) doItmTyp_itm_typ_d_cd_LC(info);
		else if (lc == ItmTyp_itm_typ_d_nm) doItmTyp_itm_typ_d_nm_LC(info);
	}

	/**
	 * [ItmTyp]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmTyp]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmTyp_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[ItmTyp_itm_typ]の作成メソッド
	 */
	public MCList getItmTyp_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmTyp_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getItmTyp_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTypD(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}