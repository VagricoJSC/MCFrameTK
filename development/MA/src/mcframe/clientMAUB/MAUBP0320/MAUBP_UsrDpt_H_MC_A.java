package mcframe.clientMAUB.MAUBP0320;

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
 * 画面"MAUBP_UsrDpt_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_UsrDpt_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0320";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [UsrDpt]ブロック関連のField定義
	public MCPanel UsrDptPanel = null;
	// [UsrDpt]ブロックの項目のField定義
	public MCLabel UsrDpt_usr_cd_Label = null;
	/**
	 * Worker cd. 作業担当者ＣＤ.<p>
	 *
	 */
	public MCTextField UsrDpt_usr_cd = null;
	/**
	 * Worker name 作業担当者名.<p>
	 *
	 */
	public MCTextField UsrDpt_usr_nm = null;
	public MCTextField UsrDpt_def_dpt_cd = null;
	public MCLabel UsrDpt_dpt_cd_Label = null;
	/**
	 * Work dept. in charge cd. 作業担当部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox UsrDpt_dpt_cd = null;
	/**
	 * Work dept. in charge name 作業担当部門名.<p>
	 *
	 */
	public MCTextField UsrDpt_dpt_nm = null;
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
	
	/** [UsrDpt]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0320.UsrDptR aUsrDptR;

	/**
	 * 項目コピーによってaUsrDptRを設定します。
	 *
	 * aUsrDptRのインスタンスは変更されません。
	 *
	 * @param row UsrDptR
	 */
	public void setUsrDptR(mcframe.clientMAUB.MAUBP0320.UsrDptR row) {
		if (row != null) {
			MCRow.copyall(getUsrDptR(), row);
		}
	}

	/**
	 * [UsrDpt]ブロックのコンテナaUsrDptRを返します。
	 *
	 * @return UsrDptR
	 */
	public mcframe.clientMAUB.MAUBP0320.UsrDptR getUsrDptR() {
		return aUsrDptR;
	}

	/**
	 * aUsrDptRを作成します。
	 *
	 * @return UsrDptR
	 */
	public mcframe.clientMAUB.MAUBP0320.UsrDptR createUsrDptR() {
		return mcframe.clientMAUB.MAUBP0320.UsrDptR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getUsrDptR())) ret.add(getUsrDptR());
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
		if(aCnt == getUsrDptR()) return "UsrDpt";
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
		if(bId.equals("UsrDpt")) return getUsrDptR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(UsrDptPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_UsrDpt_H_MC_A() {
		aUsrDptR = createUsrDptR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_UsrDpt_H_MC_A(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		aUsrDptR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_UsrDpt_H_MC.jbCreateUsrDpt((MAUBP_UsrDpt_H)this);
	}

	/**
	 * [UsrDpt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUsrDpt(MAUBP_UsrDpt_H p) {
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

	
	/** [UsrDpt_usr_cd_ListPutter]の定義 */
	private MCListPutter UsrDpt_usr_cd_p = null;

	/**
	 * [UsrDpt_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getUsrDpt_usr_cd_ListPutter() {
		if (UsrDpt_usr_cd_p == null) {
			UsrDpt_usr_cd_p = createUsrDpt_usr_cd_ListPutter(UsrDpt_usr_cd, "usr_cd", "usr_nm","def_dpt_cd");

		}
		return UsrDpt_usr_cd_p;
	}
	
	
	/** [UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter UsrDpt_dpt_cd_p = null;

	/**
	 * [UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getUsrDpt_dpt_cd_ListPutter() {
		if (UsrDpt_dpt_cd_p == null) {
			UsrDpt_dpt_cd_p = createUsrDpt_dpt_cd_ListPutter(UsrDpt_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return UsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_UsrDpt_H create(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		MAUBP_UsrDpt_H p = new MAUBP_UsrDpt_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_UsrDpt_H create(){
		MAUBP_UsrDpt_H p = new MAUBP_UsrDpt_H();
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
		MAUBP_UsrDpt_H_MC.jbfInitUsrDpt((MAUBP_UsrDpt_H)this);
		MAUBP_UsrDpt_H_MC.jbInitUsrDpt((MAUBP_UsrDpt_H)this);
	}

	/**
	 * [UsrDpt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUsrDpt(MAUBP_UsrDpt_H p) {
		// ブロック関連の初期化
		p.UsrDptPanel = p.beansFactory.createPanel("UsrDpt");
		// ブロックの項目の初期化
		p.UsrDpt_usr_cd_Label = p.beansFactory.createLabel("UsrDpt.usr_cd_Label");
		p.UsrDpt_usr_cd = p.beansFactory.createTextField("UsrDpt.usr_cd");
		p.UsrDpt_usr_cd.setLabel(p.UsrDpt_usr_cd_Label);
		p.UsrDpt_usr_nm = p.beansFactory.createTextField("UsrDpt.usr_nm");
		p.UsrDpt_def_dpt_cd = p.beansFactory.createTextField("UsrDpt.def_dpt_cd");
		p.UsrDpt_dpt_cd_Label = p.beansFactory.createLabel("UsrDpt.dpt_cd_Label");
		p.UsrDpt_dpt_cd = p.beansFactory.createTextComboBox("UsrDpt.dpt_cd");
		p.UsrDpt_dpt_cd.setLabel(p.UsrDpt_dpt_cd_Label);
		p.UsrDpt_dpt_nm = p.beansFactory.createTextField("UsrDpt.dpt_nm");
	}

	/**
	 * [UsrDpt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUsrDpt(MAUBP_UsrDpt_H p) {
		// ブロック関連の初期化
		p.add(p.UsrDptPanel);
		p.setLastBeans(p.UsrDptPanel);
		// ブロックの項目の初期化
		p.UsrDptPanel.add(p.UsrDpt_usr_cd_Label);
		p.UsrDptPanel.add(p.UsrDpt_usr_cd);
		p.UsrDptPanel.setLastBeans(p.UsrDpt_usr_cd);
		p.UsrDpt_usr_cd.setNextBeans(p.UsrDpt_usr_nm);
		p.UsrDpt_usr_cd.setRow(p.getUsrDptR(), mcframe.clientMAUB.MAUBP0320.UsrDptR.usr_cd_META);
		p.UsrDpt_usr_cd.addLinkBeans(p.UsrDpt_usr_nm,p.UsrDpt_def_dpt_cd);
		p.UsrDpt_usr_cd.setListType(MCListType.STRICT);
		p.UsrDptPanel.add(p.UsrDpt_usr_nm);
		p.UsrDpt_usr_nm.setNextBeans(p.UsrDpt_def_dpt_cd);
		p.UsrDpt_usr_nm.setRow(p.getUsrDptR(), mcframe.clientMAUB.MAUBP0320.UsrDptR.usr_nm_META);
		p.UsrDptPanel.add(p.UsrDpt_def_dpt_cd);
		p.UsrDpt_def_dpt_cd.setNextBeans(p.UsrDpt_dpt_cd);
		p.UsrDpt_def_dpt_cd.setRow(p.getUsrDptR(), mcframe.clientMAUB.MAUBP0320.UsrDptR.def_dpt_cd_META);
		p.UsrDpt_dpt_cd.setListType(MCListType.STRICT);
		p.UsrDpt_dpt_cd.setLinkBeans(p.UsrDpt_dpt_nm);
		p.UsrDptPanel.add(p.UsrDpt_dpt_cd_Label);
		p.UsrDptPanel.add(p.UsrDpt_dpt_cd);
		p.UsrDpt_dpt_cd.setNextBeans(p.UsrDpt_dpt_nm);
		p.UsrDpt_dpt_cd.setRow(p.getUsrDptR(), mcframe.clientMAUB.MAUBP0320.UsrDptR.dpt_cd_META);
		p.UsrDptPanel.add(p.UsrDpt_dpt_nm);
		p.UsrDpt_dpt_nm.setRow(p.getUsrDptR(), mcframe.clientMAUB.MAUBP0320.UsrDptR.dpt_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_UsrDpt_H_MC.mcInitUsrDpt((MAUBP_UsrDpt_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_UsrDpt_H_MC.statusInitENABLE_UsrDpt((MAUBP_UsrDpt_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_UsrDpt_H_MC.statusInitDISABLE_UsrDpt((MAUBP_UsrDpt_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_UsrDpt_H_MC.statusInitREAD__ONLY_UsrDpt((MAUBP_UsrDpt_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_UsrDpt_H_MC.statusInitREQUIRED_UsrDpt((MAUBP_UsrDpt_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_UsrDpt_H_MC.statusInitINVISIBLE_UsrDpt((MAUBP_UsrDpt_H)this);

	}

	/**
	 *  [UsrDpt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUsrDpt(MAUBP_UsrDpt_H p) {
		p.UsrDpt_usr_cd.setListListener(p);
		p.UsrDpt_usr_cd.addAllListener(p);
		p.UsrDpt_usr_nm.setListListener(p);
		p.UsrDpt_usr_nm.addAllListener(p);
		p.UsrDpt_def_dpt_cd.setListListener(p);
		p.UsrDpt_def_dpt_cd.addAllListener(p);
		p.UsrDpt_dpt_cd.setListListener(p);
		p.UsrDpt_dpt_cd.addAllListener(p);
		p.UsrDpt_dpt_nm.setListListener(p);
		p.UsrDpt_dpt_nm.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[UsrDpt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_UsrDpt(MAUBP_UsrDpt_H p){
		p.UsrDpt_usr_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.UsrDpt_usr_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.UsrDpt_def_dpt_cd.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.UsrDpt_dpt_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.UsrDpt_dpt_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[UsrDpt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_UsrDpt(MAUBP_UsrDpt_H p){
		p.UsrDpt_usr_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.UsrDpt_usr_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.UsrDpt_def_dpt_cd.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.UsrDpt_dpt_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.UsrDpt_dpt_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[UsrDpt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_UsrDpt(MAUBP_UsrDpt_H p){
		p.UsrDpt_usr_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.UsrDpt_usr_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.UsrDpt_def_dpt_cd.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.UsrDpt_dpt_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.UsrDpt_dpt_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[UsrDpt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_UsrDpt(MAUBP_UsrDpt_H p){
		p.UsrDpt_usr_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.UsrDpt_usr_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.UsrDpt_def_dpt_cd.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.UsrDpt_dpt_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.UsrDpt_dpt_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[UsrDpt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_UsrDpt(MAUBP_UsrDpt_H p){
		p.UsrDpt_usr_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.UsrDpt_usr_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.UsrDpt_def_dpt_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.UsrDpt_dpt_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.UsrDpt_dpt_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		UsrDpt_usr_cd.getListConfig().setPutter(getUsrDpt_usr_cd_ListPutter());
		UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		UsrDpt_dpt_cd.getListConfig().setPutter(getUsrDpt_dpt_cd_ListPutter());
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
	 * [UsrDpt_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createUsrDpt_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == UsrDpt_usr_cd) return getUsrDpt_usr_cd(row, info);
		if(combo == UsrDpt_dpt_cd) return getUsrDpt_dpt_cd(row, info);
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
		if (vc == UsrDpt_usr_cd) return doUsrDpt_usr_cd_VC(info);
		if (vc == UsrDpt_usr_nm) return doUsrDpt_usr_nm_VC(info);
		if (vc == UsrDpt_def_dpt_cd) return doUsrDpt_def_dpt_cd_VC(info);
		if (vc == UsrDpt_dpt_cd) return doUsrDpt_dpt_cd_VC(info);
		if (vc == UsrDpt_dpt_nm) return doUsrDpt_dpt_nm_VC(info);
		return true;
	}

	/**
	 * [UsrDpt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUsrDpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [UsrDpt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUsrDpt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [UsrDpt]パネルの[def_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUsrDpt_def_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [UsrDpt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUsrDpt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [UsrDpt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUsrDpt_dpt_nm_VC(MCEventInfo info){
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
		if (nc == UsrDpt_usr_cd) doUsrDpt_usr_cd_NC(info);
		else if (nc == UsrDpt_usr_nm) doUsrDpt_usr_nm_NC(info);
		else if (nc == UsrDpt_def_dpt_cd) doUsrDpt_def_dpt_cd_NC(info);
		else if (nc == UsrDpt_dpt_cd) doUsrDpt_dpt_cd_NC(info);
		else if (nc == UsrDpt_dpt_nm) doUsrDpt_dpt_nm_NC(info);
	}

	/**
	 * [UsrDpt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[def_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_def_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == UsrDpt_usr_cd) doUsrDpt_usr_cd_NE(info);
		else if (ne == UsrDpt_usr_nm) doUsrDpt_usr_nm_NE(info);
		else if (ne == UsrDpt_def_dpt_cd) doUsrDpt_def_dpt_cd_NE(info);
		else if (ne == UsrDpt_dpt_cd) doUsrDpt_dpt_cd_NE(info);
		else if (ne == UsrDpt_dpt_nm) doUsrDpt_dpt_nm_NE(info);
	}

	/**
	 * [UsrDpt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[def_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_def_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == UsrDpt_usr_cd) doUsrDpt_usr_cd_NX(info);
		else if (nx == UsrDpt_usr_nm) doUsrDpt_usr_nm_NX(info);
		else if (nx == UsrDpt_def_dpt_cd) doUsrDpt_def_dpt_cd_NX(info);
		else if (nx == UsrDpt_dpt_cd) doUsrDpt_dpt_cd_NX(info);
		else if (nx == UsrDpt_dpt_nm) doUsrDpt_dpt_nm_NX(info);
	}

	/**
	 * [UsrDpt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[def_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_def_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == UsrDpt_usr_cd) doUsrDpt_usr_cd_LC(info);
		else if (lc == UsrDpt_usr_nm) doUsrDpt_usr_nm_LC(info);
		else if (lc == UsrDpt_def_dpt_cd) doUsrDpt_def_dpt_cd_LC(info);
		else if (lc == UsrDpt_dpt_cd) doUsrDpt_dpt_cd_LC(info);
		else if (lc == UsrDpt_dpt_nm) doUsrDpt_dpt_nm_LC(info);
	}

	/**
	 * [UsrDpt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[def_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_def_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [UsrDpt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUsrDpt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[UsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getUsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}