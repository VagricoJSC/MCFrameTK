package mcframe.clientMAUB.MAUBP0080;

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
 * 画面"MAUBP_Sno_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Sno_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Sno]ブロック関連のField定義
	public MCPanel SnoPanel = null;
	// [Sno]ブロックの項目のField定義
	public MCLabel Sno_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Sno_sno1 = null;
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public MCCheckBox Sno_sno1_null_flg = null;
	public MCLabel Sno_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Sno_sno2 = null;
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public MCCheckBox Sno_sno2_null_flg = null;
	public MCLabel Sno_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Sno_sno3 = null;
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public MCCheckBox Sno_sno3_null_flg = null;
	public MCLabel Sno_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Sno_sno4 = null;
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public MCCheckBox Sno_sno4_null_flg = null;
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
	
	/** [Sno]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0080.SnoR aSnoR;

	/**
	 * 項目コピーによってaSnoRを設定します。
	 *
	 * aSnoRのインスタンスは変更されません。
	 *
	 * @param row SnoR
	 */
	public void setSnoR(mcframe.clientMAUB.MAUBP0080.SnoR row) {
		if (row != null) {
			MCRow.copyall(getSnoR(), row);
		}
	}

	/**
	 * [Sno]ブロックのコンテナaSnoRを返します。
	 *
	 * @return SnoR
	 */
	public mcframe.clientMAUB.MAUBP0080.SnoR getSnoR() {
		return aSnoR;
	}

	/**
	 * aSnoRを作成します。
	 *
	 * @return SnoR
	 */
	public mcframe.clientMAUB.MAUBP0080.SnoR createSnoR() {
		return mcframe.clientMAUB.MAUBP0080.SnoR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSnoR())) ret.add(getSnoR());
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
		if(aCnt == getSnoR()) return "Sno";
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
		if(bId.equals("Sno")) return getSnoR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SnoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Sno_H_MC_A() {
		aSnoR = createSnoR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Sno_H_MC_A(mcframe.clientMAUB.MAUBP0080.SnoR row){
		aSnoR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Sno_H_MC.jbCreateSno((MAUBP_Sno_H)this);
	}

	/**
	 * [Sno]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno(MAUBP_Sno_H p) {
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
	public static MAUBP_Sno_H create(mcframe.clientMAUB.MAUBP0080.SnoR row){
		MAUBP_Sno_H p = new MAUBP_Sno_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Sno_H create(){
		MAUBP_Sno_H p = new MAUBP_Sno_H();
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
		MAUBP_Sno_H_MC.jbfInitSno((MAUBP_Sno_H)this);
		MAUBP_Sno_H_MC.jbInitSno((MAUBP_Sno_H)this);
	}

	/**
	 * [Sno]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno(MAUBP_Sno_H p) {
		// ブロック関連の初期化
		p.SnoPanel = p.beansFactory.createPanel("Sno");
		// ブロックの項目の初期化
		p.Sno_sno1_Label = p.beansFactory.createLabel("Sno.sno1_Label");
		p.Sno_sno1 = p.beansFactory.createTextField("Sno.sno1");
		p.Sno_sno1.setLabel(p.Sno_sno1_Label);
		p.Sno_sno1_null_flg = p.beansFactory.createCheckBox("Sno.sno1_null_flg");
		p.Sno_sno2_Label = p.beansFactory.createLabel("Sno.sno2_Label");
		p.Sno_sno2 = p.beansFactory.createTextField("Sno.sno2");
		p.Sno_sno2.setLabel(p.Sno_sno2_Label);
		p.Sno_sno2_null_flg = p.beansFactory.createCheckBox("Sno.sno2_null_flg");
		p.Sno_sno3_Label = p.beansFactory.createLabel("Sno.sno3_Label");
		p.Sno_sno3 = p.beansFactory.createTextField("Sno.sno3");
		p.Sno_sno3.setLabel(p.Sno_sno3_Label);
		p.Sno_sno3_null_flg = p.beansFactory.createCheckBox("Sno.sno3_null_flg");
		p.Sno_sno4_Label = p.beansFactory.createLabel("Sno.sno4_Label");
		p.Sno_sno4 = p.beansFactory.createTextField("Sno.sno4");
		p.Sno_sno4.setLabel(p.Sno_sno4_Label);
		p.Sno_sno4_null_flg = p.beansFactory.createCheckBox("Sno.sno4_null_flg");
	}

	/**
	 * [Sno]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno(MAUBP_Sno_H p) {
		// ブロック関連の初期化
		p.add(p.SnoPanel);
		p.setLastBeans(p.SnoPanel);
		// ブロックの項目の初期化
		p.SnoPanel.add(p.Sno_sno1_Label);
		p.SnoPanel.add(p.Sno_sno1);
		p.SnoPanel.setLastBeans(p.Sno_sno1);
		p.Sno_sno1.setNextBeans(p.Sno_sno1_null_flg);
		p.Sno_sno1.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno1_META);
		p.SnoPanel.add(p.Sno_sno1_null_flg);
		p.Sno_sno1_null_flg.setNextBeans(p.Sno_sno2);
		p.Sno_sno1_null_flg.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno1_null_flg_META);
		p.SnoPanel.add(p.Sno_sno2_Label);
		p.SnoPanel.add(p.Sno_sno2);
		p.Sno_sno2.setNextBeans(p.Sno_sno2_null_flg);
		p.Sno_sno2.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno2_META);
		p.SnoPanel.add(p.Sno_sno2_null_flg);
		p.Sno_sno2_null_flg.setNextBeans(p.Sno_sno3);
		p.Sno_sno2_null_flg.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno2_null_flg_META);
		p.SnoPanel.add(p.Sno_sno3_Label);
		p.SnoPanel.add(p.Sno_sno3);
		p.Sno_sno3.setNextBeans(p.Sno_sno3_null_flg);
		p.Sno_sno3.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno3_META);
		p.SnoPanel.add(p.Sno_sno3_null_flg);
		p.Sno_sno3_null_flg.setNextBeans(p.Sno_sno4);
		p.Sno_sno3_null_flg.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno3_null_flg_META);
		p.SnoPanel.add(p.Sno_sno4_Label);
		p.SnoPanel.add(p.Sno_sno4);
		p.Sno_sno4.setNextBeans(p.Sno_sno4_null_flg);
		p.Sno_sno4.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno4_META);
		p.SnoPanel.add(p.Sno_sno4_null_flg);
		p.Sno_sno4_null_flg.setRow(p.getSnoR(), mcframe.clientMAUB.MAUBP0080.SnoR.sno4_null_flg_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Sno_H_MC.mcInitSno((MAUBP_Sno_H)this);

		// [ENABLE_SRCH]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitENABLE__SRCH_Sno((MAUBP_Sno_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitENABLE_Sno((MAUBP_Sno_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitDISABLE_Sno((MAUBP_Sno_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitREAD__ONLY_Sno((MAUBP_Sno_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitREQUIRED_Sno((MAUBP_Sno_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Sno_H_MC.statusInitINVISIBLE_Sno((MAUBP_Sno_H)this);

	}

	/**
	 *  [Sno]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno(MAUBP_Sno_H p) {
		p.Sno_sno1.setListListener(p);
		p.Sno_sno1.addAllListener(p);
		p.Sno_sno1_null_flg.addAllListener(p);
		p.Sno_sno2.setListListener(p);
		p.Sno_sno2.addAllListener(p);
		p.Sno_sno2_null_flg.addAllListener(p);
		p.Sno_sno3.setListListener(p);
		p.Sno_sno3.addAllListener(p);
		p.Sno_sno3_null_flg.addAllListener(p);
		p.Sno_sno4.setListListener(p);
		p.Sno_sno4.addAllListener(p);
		p.Sno_sno4_null_flg.addAllListener(p);
	}

	/**
	 * [ENABLE_SRCH]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitENABLE__SRCH_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Sno_sno1_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.Sno_sno2.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Sno_sno2_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.Sno_sno3.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Sno_sno3_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.Sno_sno4.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.Sno_sno4_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);

	}

	/**
	 * [ENABLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno1_null_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno2_null_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno3_null_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno4.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Sno_sno4_null_flg.putMode(p, ENABLE, MCMode.REQUIRED);

	}

	/**
	 * [DISABLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno1_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno2.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno2_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno3.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno3_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno4.putMode(p, DISABLE, MCMode.DISABLE);
		p.Sno_sno4_null_flg.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno1_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno2_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno3_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Sno_sno4_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno1_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno2_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno3_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Sno_sno4_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Sno]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Sno(MAUBP_Sno_H p){
		p.Sno_sno1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno1_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno2_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno3_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.Sno_sno4_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == Sno_sno1) return doSno_sno1_VC(info);
		if (vc == Sno_sno1_null_flg) return doSno_sno1_null_flg_VC(info);
		if (vc == Sno_sno2) return doSno_sno2_VC(info);
		if (vc == Sno_sno2_null_flg) return doSno_sno2_null_flg_VC(info);
		if (vc == Sno_sno3) return doSno_sno3_VC(info);
		if (vc == Sno_sno3_null_flg) return doSno_sno3_null_flg_VC(info);
		if (vc == Sno_sno4) return doSno_sno4_VC(info);
		if (vc == Sno_sno4_null_flg) return doSno_sno4_null_flg_VC(info);
		return true;
	}

	/**
	 * [Sno]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno1_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno2_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno3_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSno_sno4_null_flg_VC(MCEventInfo info){
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
		if (nc == Sno_sno1) doSno_sno1_NC(info);
		else if (nc == Sno_sno1_null_flg) doSno_sno1_null_flg_NC(info);
		else if (nc == Sno_sno2) doSno_sno2_NC(info);
		else if (nc == Sno_sno2_null_flg) doSno_sno2_null_flg_NC(info);
		else if (nc == Sno_sno3) doSno_sno3_NC(info);
		else if (nc == Sno_sno3_null_flg) doSno_sno3_null_flg_NC(info);
		else if (nc == Sno_sno4) doSno_sno4_NC(info);
		else if (nc == Sno_sno4_null_flg) doSno_sno4_null_flg_NC(info);
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Sno_sno1) doSno_sno1_NE(info);
		else if (ne == Sno_sno1_null_flg) doSno_sno1_null_flg_NE(info);
		else if (ne == Sno_sno2) doSno_sno2_NE(info);
		else if (ne == Sno_sno2_null_flg) doSno_sno2_null_flg_NE(info);
		else if (ne == Sno_sno3) doSno_sno3_NE(info);
		else if (ne == Sno_sno3_null_flg) doSno_sno3_null_flg_NE(info);
		else if (ne == Sno_sno4) doSno_sno4_NE(info);
		else if (ne == Sno_sno4_null_flg) doSno_sno4_null_flg_NE(info);
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Sno_sno1) doSno_sno1_NX(info);
		else if (nx == Sno_sno1_null_flg) doSno_sno1_null_flg_NX(info);
		else if (nx == Sno_sno2) doSno_sno2_NX(info);
		else if (nx == Sno_sno2_null_flg) doSno_sno2_null_flg_NX(info);
		else if (nx == Sno_sno3) doSno_sno3_NX(info);
		else if (nx == Sno_sno3_null_flg) doSno_sno3_null_flg_NX(info);
		else if (nx == Sno_sno4) doSno_sno4_NX(info);
		else if (nx == Sno_sno4_null_flg) doSno_sno4_null_flg_NX(info);
	}

	/**
	 * [Sno]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno1_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_null_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Sno_sno1) doSno_sno1_LC(info);
		else if (lc == Sno_sno2) doSno_sno2_LC(info);
		else if (lc == Sno_sno3) doSno_sno3_LC(info);
		else if (lc == Sno_sno4) doSno_sno4_LC(info);
	}

	/**
	 * [Sno]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Sno]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSno_sno4_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}