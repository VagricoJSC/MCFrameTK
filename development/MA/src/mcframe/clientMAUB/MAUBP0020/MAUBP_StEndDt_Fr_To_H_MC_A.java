package mcframe.clientMAUB.MAUBP0020;

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
 * 画面"MAUBP_StEndDt_Fr_To_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_StEndDt_Fr_To_H_MC_A extends mcframe.clientMAUD.MAUDP1040.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StEndDt]ブロック関連のField定義
	public MCPanel StEndDtPanel = null;
	// [StEndDt]ブロックの項目のField定義
	/**
	 * POINT,,;RANGE,,; POINT,,;RANGE,,;.<p>
	 *
	 */
	public MCButtonGroup StEndDt_srch_typ_Group = null;
	public MCRadioButton StEndDt_srch_typ_POINT = null;
	public MCRadioButton StEndDt_srch_typ_RANGE = null;
	public MCLabel StEndDt_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField StEndDt_dt = null;
	public MCLabel StEndDt_st_dt_fr_Label = null;
	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField StEndDt_st_dt_fr = null;
	public MCLabel StEndDt_st_dt_to_Label = null;
	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public MCDateField StEndDt_st_dt_to = null;
	public MCLabel StEndDt_end_dt_fr_Label = null;
	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField StEndDt_end_dt_fr = null;
	public MCLabel StEndDt_end_dt_to_Label = null;
	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public MCDateField StEndDt_end_dt_to = null;
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
	
	/** [StEndDt]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0020.StEndDtR aStEndDtR;

	/**
	 * 項目コピーによってaStEndDtRを設定します。
	 *
	 * aStEndDtRのインスタンスは変更されません。
	 *
	 * @param row StEndDtR
	 */
	public void setStEndDtR(mcframe.clientMAUB.MAUBP0020.StEndDtR row) {
		if (row != null) {
			MCRow.copyall(getStEndDtR(), row);
		}
	}

	/**
	 * [StEndDt]ブロックのコンテナaStEndDtRを返します。
	 *
	 * @return StEndDtR
	 */
	public mcframe.clientMAUB.MAUBP0020.StEndDtR getStEndDtR() {
		return aStEndDtR;
	}

	/**
	 * aStEndDtRを作成します。
	 *
	 * @return StEndDtR
	 */
	public mcframe.clientMAUB.MAUBP0020.StEndDtR createStEndDtR() {
		return mcframe.clientMAUB.MAUBP0020.StEndDtR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStEndDtR())) ret.add(getStEndDtR());
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
		if(aCnt == getStEndDtR()) return "StEndDt";
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
		if(bId.equals("StEndDt")) return getStEndDtR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StEndDtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StEndDt_Fr_To_H_MC_A() {
		aStEndDtR = createStEndDtR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_StEndDt_Fr_To_H_MC_A(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		aStEndDtR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_StEndDt_Fr_To_H_MC.jbCreateStEndDt((MAUBP_StEndDt_Fr_To_H)this);
	}

	/**
	 * [StEndDt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStEndDt(MAUBP_StEndDt_Fr_To_H p) {
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
	public static MAUBP_StEndDt_Fr_To_H create(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		MAUBP_StEndDt_Fr_To_H p = new MAUBP_StEndDt_Fr_To_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_StEndDt_Fr_To_H create(){
		MAUBP_StEndDt_Fr_To_H p = new MAUBP_StEndDt_Fr_To_H();
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
		MAUBP_StEndDt_Fr_To_H_MC.jbfInitStEndDt((MAUBP_StEndDt_Fr_To_H)this);
		MAUBP_StEndDt_Fr_To_H_MC.jbInitStEndDt((MAUBP_StEndDt_Fr_To_H)this);
	}

	/**
	 * [StEndDt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStEndDt(MAUBP_StEndDt_Fr_To_H p) {
		// ブロック関連の初期化
		p.StEndDtPanel = p.beansFactory.createPanel("StEndDt");
		// ブロックの項目の初期化
		p.StEndDt_srch_typ_Group = p.beansFactory.createButtonGroup("StEndDt.srch_typ");
		p.StEndDt_srch_typ_POINT = p.beansFactory.createRadioButton("StEndDt.srch_typ_POINT");
		p.StEndDt_srch_typ_RANGE = p.beansFactory.createRadioButton("StEndDt.srch_typ_RANGE");
		p.StEndDt_dt_Label = p.beansFactory.createLabel("StEndDt.dt_Label");
		p.StEndDt_dt = p.beansFactory.createDateField("StEndDt.dt");
		p.StEndDt_dt.setLabel(p.StEndDt_dt_Label);
		p.StEndDt_st_dt_fr_Label = p.beansFactory.createLabel("StEndDt.st_dt_fr_Label");
		p.StEndDt_st_dt_fr = p.beansFactory.createDateField("StEndDt.st_dt_fr");
		p.StEndDt_st_dt_fr.setLabel(p.StEndDt_st_dt_fr_Label);
		p.StEndDt_st_dt_to_Label = p.beansFactory.createLabel("StEndDt.st_dt_to_Label");
		p.StEndDt_st_dt_to = p.beansFactory.createDateField("StEndDt.st_dt_to");
		p.StEndDt_st_dt_to.setLabel(p.StEndDt_st_dt_to_Label);
		p.StEndDt_end_dt_fr_Label = p.beansFactory.createLabel("StEndDt.end_dt_fr_Label");
		p.StEndDt_end_dt_fr = p.beansFactory.createDateField("StEndDt.end_dt_fr");
		p.StEndDt_end_dt_fr.setLabel(p.StEndDt_end_dt_fr_Label);
		p.StEndDt_end_dt_to_Label = p.beansFactory.createLabel("StEndDt.end_dt_to_Label");
		p.StEndDt_end_dt_to = p.beansFactory.createDateField("StEndDt.end_dt_to");
		p.StEndDt_end_dt_to.setLabel(p.StEndDt_end_dt_to_Label);
	}

	/**
	 * [StEndDt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStEndDt(MAUBP_StEndDt_Fr_To_H p) {
		// ブロック関連の初期化
		p.add(p.StEndDtPanel);
		p.setLastBeans(p.StEndDtPanel);
		// ブロックの項目の初期化
		p.StEndDtPanel.setLastBeans(p.StEndDt_srch_typ_Group);
		p.StEndDt_srch_typ_Group.setFirstBeans(p.StEndDt_srch_typ_POINT);
		p.StEndDt_srch_typ_POINT.setActionCommand("0");
		p.StEndDt_srch_typ_Group.add(p.StEndDt_srch_typ_POINT);
		p.StEndDtPanel.add(p.StEndDt_srch_typ_POINT);
		p.StEndDt_srch_typ_POINT.setNextBeans(p.StEndDt_srch_typ_RANGE);
		p.StEndDt_srch_typ_RANGE.setActionCommand("1");
		p.StEndDt_srch_typ_Group.add(p.StEndDt_srch_typ_RANGE);
		p.StEndDtPanel.add(p.StEndDt_srch_typ_RANGE);
		p.StEndDt_srch_typ_Group.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.srch_typ_META);
		p.StEndDt_srch_typ_Group.setNextBeans(p.StEndDt_dt);
		p.StEndDtPanel.add(p.StEndDt_dt_Label);
		p.StEndDtPanel.add(p.StEndDt_dt);
		p.StEndDt_dt.setNextBeans(p.StEndDt_st_dt_fr);
		p.StEndDt_dt.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.dt_META);
		p.StEndDt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StEndDtPanel.add(p.StEndDt_st_dt_fr_Label);
		p.StEndDtPanel.add(p.StEndDt_st_dt_fr);
		p.StEndDt_st_dt_fr.setNextBeans(p.StEndDt_st_dt_to);
		p.StEndDt_st_dt_fr.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.st_dt_fr_META);
		p.StEndDt_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StEndDtPanel.add(p.StEndDt_st_dt_to_Label);
		p.StEndDtPanel.add(p.StEndDt_st_dt_to);
		p.StEndDt_st_dt_to.setNextBeans(p.StEndDt_end_dt_fr);
		p.StEndDt_st_dt_to.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.st_dt_to_META);
		p.StEndDt_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StEndDtPanel.add(p.StEndDt_end_dt_fr_Label);
		p.StEndDtPanel.add(p.StEndDt_end_dt_fr);
		p.StEndDt_end_dt_fr.setNextBeans(p.StEndDt_end_dt_to);
		p.StEndDt_end_dt_fr.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.end_dt_fr_META);
		p.StEndDt_end_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StEndDtPanel.add(p.StEndDt_end_dt_to_Label);
		p.StEndDtPanel.add(p.StEndDt_end_dt_to);
		p.StEndDt_end_dt_to.setRow(p.getStEndDtR(), mcframe.clientMAUB.MAUBP0020.StEndDtR.end_dt_to_META);
		p.StEndDt_end_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_StEndDt_Fr_To_H_MC.mcInitStEndDt((MAUBP_StEndDt_Fr_To_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_StEndDt_Fr_To_H_MC.statusInitENABLE_StEndDt((MAUBP_StEndDt_Fr_To_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_StEndDt_Fr_To_H_MC.statusInitDISABLE_StEndDt((MAUBP_StEndDt_Fr_To_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_StEndDt_Fr_To_H_MC.statusInitREAD__ONLY_StEndDt((MAUBP_StEndDt_Fr_To_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_StEndDt_Fr_To_H_MC.statusInitREQUIRED_StEndDt((MAUBP_StEndDt_Fr_To_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_StEndDt_Fr_To_H_MC.statusInitINVISIBLE_StEndDt((MAUBP_StEndDt_Fr_To_H)this);

	}

	/**
	 *  [StEndDt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStEndDt(MAUBP_StEndDt_Fr_To_H p) {
		p.StEndDt_srch_typ_Group.addAllListener(p);
		p.StEndDt_srch_typ_POINT.addAllListener(p);
		p.StEndDt_srch_typ_RANGE.addAllListener(p);
		p.StEndDt_dt.setListListener(p);
		p.StEndDt_dt.addAllListener(p);
		p.StEndDt_st_dt_fr.setListListener(p);
		p.StEndDt_st_dt_fr.addAllListener(p);
		p.StEndDt_st_dt_to.setListListener(p);
		p.StEndDt_st_dt_to.addAllListener(p);
		p.StEndDt_end_dt_fr.setListListener(p);
		p.StEndDt_end_dt_fr.addAllListener(p);
		p.StEndDt_end_dt_to.setListListener(p);
		p.StEndDt_end_dt_to.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StEndDt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StEndDt(MAUBP_StEndDt_Fr_To_H p){
		p.StEndDt_srch_typ_Group.putMode(p, ENABLE, MCMode.REQUIRED);
		p.StEndDt_dt.putMode(p, ENABLE, MCMode.ENABLE);
		p.StEndDt_st_dt_fr.putMode(p, ENABLE, MCMode.ENABLE);
		p.StEndDt_st_dt_to.putMode(p, ENABLE, MCMode.ENABLE);
		p.StEndDt_end_dt_fr.putMode(p, ENABLE, MCMode.ENABLE);
		p.StEndDt_end_dt_to.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[StEndDt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StEndDt(MAUBP_StEndDt_Fr_To_H p){
		p.StEndDt_srch_typ_Group.putMode(p, DISABLE, MCMode.DISABLE);
		p.StEndDt_dt.putMode(p, DISABLE, MCMode.DISABLE);
		p.StEndDt_st_dt_fr.putMode(p, DISABLE, MCMode.DISABLE);
		p.StEndDt_st_dt_to.putMode(p, DISABLE, MCMode.DISABLE);
		p.StEndDt_end_dt_fr.putMode(p, DISABLE, MCMode.DISABLE);
		p.StEndDt_end_dt_to.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StEndDt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StEndDt(MAUBP_StEndDt_Fr_To_H p){
		p.StEndDt_srch_typ_Group.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StEndDt_dt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StEndDt_st_dt_fr.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StEndDt_st_dt_to.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StEndDt_end_dt_fr.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.StEndDt_end_dt_to.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StEndDt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StEndDt(MAUBP_StEndDt_Fr_To_H p){
		p.StEndDt_srch_typ_Group.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StEndDt_dt.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StEndDt_st_dt_fr.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StEndDt_st_dt_to.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StEndDt_end_dt_fr.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.StEndDt_end_dt_to.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[StEndDt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StEndDt(MAUBP_StEndDt_Fr_To_H p){
		p.StEndDt_srch_typ_Group.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StEndDt_dt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StEndDt_st_dt_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StEndDt_st_dt_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StEndDt_end_dt_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.StEndDt_end_dt_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == StEndDt_srch_typ_Group) return doStEndDt_srch_typ_VC(info);
		if (vc == StEndDt_dt) return doStEndDt_dt_VC(info);
		if (vc == StEndDt_st_dt_fr) return doStEndDt_st_dt_fr_VC(info);
		if (vc == StEndDt_st_dt_to) return doStEndDt_st_dt_to_VC(info);
		if (vc == StEndDt_end_dt_fr) return doStEndDt_end_dt_fr_VC(info);
		if (vc == StEndDt_end_dt_to) return doStEndDt_end_dt_to_VC(info);
		return true;
	}

	/**
	 * [StEndDt]パネルの[srch_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_srch_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StEndDt]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StEndDt]パネルの[st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StEndDt]パネルの[st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StEndDt]パネルの[end_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_end_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StEndDt]パネルの[end_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStEndDt_end_dt_to_VC(MCEventInfo info){
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
		if (nc == StEndDt_srch_typ_Group) doStEndDt_srch_typ_NC(info);
		else if (nc == StEndDt_dt) doStEndDt_dt_NC(info);
		else if (nc == StEndDt_st_dt_fr) doStEndDt_st_dt_fr_NC(info);
		else if (nc == StEndDt_st_dt_to) doStEndDt_st_dt_to_NC(info);
		else if (nc == StEndDt_end_dt_fr) doStEndDt_end_dt_fr_NC(info);
		else if (nc == StEndDt_end_dt_to) doStEndDt_end_dt_to_NC(info);
	}

	/**
	 * [StEndDt]パネルの[srch_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_srch_typ_NC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_dt_NC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_to_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StEndDt_srch_typ_Group) doStEndDt_srch_typ_NE(info);
		else if (ne == StEndDt_dt) doStEndDt_dt_NE(info);
		else if (ne == StEndDt_st_dt_fr) doStEndDt_st_dt_fr_NE(info);
		else if (ne == StEndDt_st_dt_to) doStEndDt_st_dt_to_NE(info);
		else if (ne == StEndDt_end_dt_fr) doStEndDt_end_dt_fr_NE(info);
		else if (ne == StEndDt_end_dt_to) doStEndDt_end_dt_to_NE(info);
	}

	/**
	 * [StEndDt]パネルの[srch_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_srch_typ_NE(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_dt_NE(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_to_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StEndDt_srch_typ_Group) doStEndDt_srch_typ_NX(info);
		else if (nx == StEndDt_dt) doStEndDt_dt_NX(info);
		else if (nx == StEndDt_st_dt_fr) doStEndDt_st_dt_fr_NX(info);
		else if (nx == StEndDt_st_dt_to) doStEndDt_st_dt_to_NX(info);
		else if (nx == StEndDt_end_dt_fr) doStEndDt_end_dt_fr_NX(info);
		else if (nx == StEndDt_end_dt_to) doStEndDt_end_dt_to_NX(info);
	}

	/**
	 * [StEndDt]パネルの[srch_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_srch_typ_NX(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_dt_NX(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_to_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == StEndDt_dt) doStEndDt_dt_LC(info);
		else if (lc == StEndDt_st_dt_fr) doStEndDt_st_dt_fr_LC(info);
		else if (lc == StEndDt_st_dt_to) doStEndDt_st_dt_to_LC(info);
		else if (lc == StEndDt_end_dt_fr) doStEndDt_end_dt_fr_LC(info);
		else if (lc == StEndDt_end_dt_to) doStEndDt_end_dt_to_LC(info);
	}

	/**
	 * [StEndDt]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_dt_LC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [StEndDt]パネルの[end_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStEndDt_end_dt_to_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}