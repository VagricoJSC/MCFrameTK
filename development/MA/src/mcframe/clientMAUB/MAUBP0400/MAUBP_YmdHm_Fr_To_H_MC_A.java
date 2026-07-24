package mcframe.clientMAUB.MAUBP0400;

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
 * 画面"MAUBP_YmdHm_Fr_To_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_YmdHm_Fr_To_H_MC_A extends mcframe.clientMAUD.MAUDP1040.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [YmdHmFrTo]ブロック関連のField定義
	public MCPanel YmdHmFrToPanel = null;
	// [YmdHmFrTo]ブロックの項目のField定義
	public MCLabel YmdHmFrTo_ymd_fr_Label = null;
	/**
	 * Date FROM 日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField YmdHmFrTo_ymd_fr = null;
	/**
	 * Time FROM 時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField YmdHmFrTo_hm_fr = null;
	public MCLabel YmdHmFrTo_ymd_to_Label = null;
	/**
	 * Date TO 日付ＴＯ.<p>
	 *
	 */
	public MCDateField YmdHmFrTo_ymd_to = null;
	/**
	 * Time TO 時刻ＴＯ.<p>
	 *
	 */
	public MCDateField YmdHmFrTo_hm_to = null;
	public MCDateField YmdHmFrTo_ymdhm_fr = null;
	public MCDateField YmdHmFrTo_ymdhm_to = null;
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
	
	/** [YmdHmFrTo]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0400.YmdHmFrToR aYmdHmFrToR;

	/**
	 * 項目コピーによってaYmdHmFrToRを設定します。
	 *
	 * aYmdHmFrToRのインスタンスは変更されません。
	 *
	 * @param row YmdHmFrToR
	 */
	public void setYmdHmFrToR(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row) {
		if (row != null) {
			MCRow.copyall(getYmdHmFrToR(), row);
		}
	}

	/**
	 * [YmdHmFrTo]ブロックのコンテナaYmdHmFrToRを返します。
	 *
	 * @return YmdHmFrToR
	 */
	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR getYmdHmFrToR() {
		return aYmdHmFrToR;
	}

	/**
	 * aYmdHmFrToRを作成します。
	 *
	 * @return YmdHmFrToR
	 */
	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR createYmdHmFrToR() {
		return mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getYmdHmFrToR())) ret.add(getYmdHmFrToR());
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
		if(aCnt == getYmdHmFrToR()) return "YmdHmFrTo";
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
		if(bId.equals("YmdHmFrTo")) return getYmdHmFrToR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(YmdHmFrToPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_YmdHm_Fr_To_H_MC_A() {
		aYmdHmFrToR = createYmdHmFrToR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_YmdHm_Fr_To_H_MC_A(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		aYmdHmFrToR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_YmdHm_Fr_To_H_MC.jbCreateYmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);
	}

	/**
	 * [YmdHmFrTo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateYmdHmFrTo(MAUBP_YmdHm_Fr_To_H p) {
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
	public static MAUBP_YmdHm_Fr_To_H create(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		MAUBP_YmdHm_Fr_To_H p = new MAUBP_YmdHm_Fr_To_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_YmdHm_Fr_To_H create(){
		MAUBP_YmdHm_Fr_To_H p = new MAUBP_YmdHm_Fr_To_H();
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
		MAUBP_YmdHm_Fr_To_H_MC.jbfInitYmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);
		MAUBP_YmdHm_Fr_To_H_MC.jbInitYmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);
	}

	/**
	 * [YmdHmFrTo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitYmdHmFrTo(MAUBP_YmdHm_Fr_To_H p) {
		// ブロック関連の初期化
		p.YmdHmFrToPanel = p.beansFactory.createPanel("YmdHmFrTo");
		// ブロックの項目の初期化
		p.YmdHmFrTo_ymd_fr_Label = p.beansFactory.createLabel("YmdHmFrTo.ymd_fr_Label");
		p.YmdHmFrTo_ymd_fr = p.beansFactory.createDateField("YmdHmFrTo.ymd_fr");
		p.YmdHmFrTo_ymd_fr.setLabel(p.YmdHmFrTo_ymd_fr_Label);
		p.YmdHmFrTo_hm_fr = p.beansFactory.createDateField("YmdHmFrTo.hm_fr");
		p.YmdHmFrTo_ymd_to_Label = p.beansFactory.createLabel("YmdHmFrTo.ymd_to_Label");
		p.YmdHmFrTo_ymd_to = p.beansFactory.createDateField("YmdHmFrTo.ymd_to");
		p.YmdHmFrTo_ymd_to.setLabel(p.YmdHmFrTo_ymd_to_Label);
		p.YmdHmFrTo_hm_to = p.beansFactory.createDateField("YmdHmFrTo.hm_to");
		p.YmdHmFrTo_ymdhm_fr = p.beansFactory.createDateField("YmdHmFrTo.ymdhm_fr");
		p.YmdHmFrTo_ymdhm_to = p.beansFactory.createDateField("YmdHmFrTo.ymdhm_to");
	}

	/**
	 * [YmdHmFrTo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitYmdHmFrTo(MAUBP_YmdHm_Fr_To_H p) {
		// ブロック関連の初期化
		p.add(p.YmdHmFrToPanel);
		p.setLastBeans(p.YmdHmFrToPanel);
		// ブロックの項目の初期化
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymd_fr_Label);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymd_fr);
		p.YmdHmFrToPanel.setLastBeans(p.YmdHmFrTo_ymd_fr);
		p.YmdHmFrTo_ymd_fr.setNextBeans(p.YmdHmFrTo_hm_fr);
		p.YmdHmFrTo_ymd_fr.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.ymd_fr_META);
		p.YmdHmFrTo_ymd_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_hm_fr);
		p.YmdHmFrTo_hm_fr.setNextBeans(p.YmdHmFrTo_ymd_to);
		p.YmdHmFrTo_hm_fr.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.hm_fr_META);
		p.YmdHmFrTo_hm_fr.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymd_to_Label);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymd_to);
		p.YmdHmFrTo_ymd_to.setNextBeans(p.YmdHmFrTo_hm_to);
		p.YmdHmFrTo_ymd_to.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.ymd_to_META);
		p.YmdHmFrTo_ymd_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_hm_to);
		p.YmdHmFrTo_hm_to.setNextBeans(p.YmdHmFrTo_ymdhm_fr);
		p.YmdHmFrTo_hm_to.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.hm_to_META);
		p.YmdHmFrTo_hm_to.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymdhm_fr);
		p.YmdHmFrTo_ymdhm_fr.setNextBeans(p.YmdHmFrTo_ymdhm_to);
		p.YmdHmFrTo_ymdhm_fr.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.ymdhm_fr_META);
		p.YmdHmFrTo_ymdhm_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.YmdHmFrToPanel.add(p.YmdHmFrTo_ymdhm_to);
		p.YmdHmFrTo_ymdhm_to.setRow(p.getYmdHmFrToR(), mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.ymdhm_to_META);
		p.YmdHmFrTo_ymdhm_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_YmdHm_Fr_To_H_MC.mcInitYmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_YmdHm_Fr_To_H_MC.statusInitENABLE_YmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_YmdHm_Fr_To_H_MC.statusInitDISABLE_YmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_YmdHm_Fr_To_H_MC.statusInitREAD__ONLY_YmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_YmdHm_Fr_To_H_MC.statusInitREQUIRED_YmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_YmdHm_Fr_To_H_MC.statusInitINVISIBLE_YmdHmFrTo((MAUBP_YmdHm_Fr_To_H)this);

	}

	/**
	 *  [YmdHmFrTo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitYmdHmFrTo(MAUBP_YmdHm_Fr_To_H p) {
		p.YmdHmFrTo_ymd_fr.setListListener(p);
		p.YmdHmFrTo_ymd_fr.addAllListener(p);
		p.YmdHmFrTo_hm_fr.setListListener(p);
		p.YmdHmFrTo_hm_fr.addAllListener(p);
		p.YmdHmFrTo_ymd_to.setListListener(p);
		p.YmdHmFrTo_ymd_to.addAllListener(p);
		p.YmdHmFrTo_hm_to.setListListener(p);
		p.YmdHmFrTo_hm_to.addAllListener(p);
		p.YmdHmFrTo_ymdhm_fr.setListListener(p);
		p.YmdHmFrTo_ymdhm_fr.addAllListener(p);
		p.YmdHmFrTo_ymdhm_to.setListListener(p);
		p.YmdHmFrTo_ymdhm_to.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[YmdHmFrTo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_YmdHmFrTo(MAUBP_YmdHm_Fr_To_H p){
		p.YmdHmFrTo_ymd_fr.putMode(p, ENABLE, MCMode.ENABLE);
		p.YmdHmFrTo_hm_fr.putMode(p, ENABLE, MCMode.ENABLE);
		p.YmdHmFrTo_ymd_to.putMode(p, ENABLE, MCMode.ENABLE);
		p.YmdHmFrTo_hm_to.putMode(p, ENABLE, MCMode.ENABLE);
		p.YmdHmFrTo_ymdhm_fr.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_to.putMode(p, ENABLE, MCMode.INVISIBLE);

	}

	/**
	 * [DISABLE]ステータスの[YmdHmFrTo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_YmdHmFrTo(MAUBP_YmdHm_Fr_To_H p){
		p.YmdHmFrTo_ymd_fr.putMode(p, DISABLE, MCMode.DISABLE);
		p.YmdHmFrTo_hm_fr.putMode(p, DISABLE, MCMode.DISABLE);
		p.YmdHmFrTo_ymd_to.putMode(p, DISABLE, MCMode.DISABLE);
		p.YmdHmFrTo_hm_to.putMode(p, DISABLE, MCMode.DISABLE);
		p.YmdHmFrTo_ymdhm_fr.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_to.putMode(p, DISABLE, MCMode.INVISIBLE);

	}

	/**
	 * [READ_ONLY]ステータスの[YmdHmFrTo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_YmdHmFrTo(MAUBP_YmdHm_Fr_To_H p){
		p.YmdHmFrTo_ymd_fr.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.YmdHmFrTo_hm_fr.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.YmdHmFrTo_ymd_to.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.YmdHmFrTo_hm_to.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.YmdHmFrTo_ymdhm_fr.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_to.putMode(p, READ_ONLY, MCMode.INVISIBLE);

	}

	/**
	 * [REQUIRED]ステータスの[YmdHmFrTo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_YmdHmFrTo(MAUBP_YmdHm_Fr_To_H p){
		p.YmdHmFrTo_ymd_fr.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.YmdHmFrTo_hm_fr.putMode(p, REQUIRED, MCMode.ENABLE);
		p.YmdHmFrTo_ymd_to.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.YmdHmFrTo_hm_to.putMode(p, REQUIRED, MCMode.ENABLE);
		p.YmdHmFrTo_ymdhm_fr.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_to.putMode(p, REQUIRED, MCMode.INVISIBLE);

	}

	/**
	 * [INVISIBLE]ステータスの[YmdHmFrTo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_YmdHmFrTo(MAUBP_YmdHm_Fr_To_H p){
		p.YmdHmFrTo_ymd_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_hm_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymd_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_hm_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_fr.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.YmdHmFrTo_ymdhm_to.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		if (vc == YmdHmFrTo_ymd_fr) return doYmdHmFrTo_ymd_fr_VC(info);
		if (vc == YmdHmFrTo_hm_fr) return doYmdHmFrTo_hm_fr_VC(info);
		if (vc == YmdHmFrTo_ymd_to) return doYmdHmFrTo_ymd_to_VC(info);
		if (vc == YmdHmFrTo_hm_to) return doYmdHmFrTo_hm_to_VC(info);
		if (vc == YmdHmFrTo_ymdhm_fr) return doYmdHmFrTo_ymdhm_fr_VC(info);
		if (vc == YmdHmFrTo_ymdhm_to) return doYmdHmFrTo_ymdhm_to_VC(info);
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_ymd_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_hm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_ymd_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_hm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_ymdhm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doYmdHmFrTo_ymdhm_to_VC(MCEventInfo info){
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
		if (nc == YmdHmFrTo_ymd_fr) doYmdHmFrTo_ymd_fr_NC(info);
		else if (nc == YmdHmFrTo_hm_fr) doYmdHmFrTo_hm_fr_NC(info);
		else if (nc == YmdHmFrTo_ymd_to) doYmdHmFrTo_ymd_to_NC(info);
		else if (nc == YmdHmFrTo_hm_to) doYmdHmFrTo_hm_to_NC(info);
		else if (nc == YmdHmFrTo_ymdhm_fr) doYmdHmFrTo_ymdhm_fr_NC(info);
		else if (nc == YmdHmFrTo_ymdhm_to) doYmdHmFrTo_ymdhm_to_NC(info);
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_fr_NC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_fr_NC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_to_NC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_to_NC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_fr_NC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_to_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == YmdHmFrTo_ymd_fr) doYmdHmFrTo_ymd_fr_NE(info);
		else if (ne == YmdHmFrTo_hm_fr) doYmdHmFrTo_hm_fr_NE(info);
		else if (ne == YmdHmFrTo_ymd_to) doYmdHmFrTo_ymd_to_NE(info);
		else if (ne == YmdHmFrTo_hm_to) doYmdHmFrTo_hm_to_NE(info);
		else if (ne == YmdHmFrTo_ymdhm_fr) doYmdHmFrTo_ymdhm_fr_NE(info);
		else if (ne == YmdHmFrTo_ymdhm_to) doYmdHmFrTo_ymdhm_to_NE(info);
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_fr_NE(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_fr_NE(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_to_NE(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_to_NE(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_fr_NE(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_to_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == YmdHmFrTo_ymd_fr) doYmdHmFrTo_ymd_fr_NX(info);
		else if (nx == YmdHmFrTo_hm_fr) doYmdHmFrTo_hm_fr_NX(info);
		else if (nx == YmdHmFrTo_ymd_to) doYmdHmFrTo_ymd_to_NX(info);
		else if (nx == YmdHmFrTo_hm_to) doYmdHmFrTo_hm_to_NX(info);
		else if (nx == YmdHmFrTo_ymdhm_fr) doYmdHmFrTo_ymdhm_fr_NX(info);
		else if (nx == YmdHmFrTo_ymdhm_to) doYmdHmFrTo_ymdhm_to_NX(info);
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_fr_NX(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_fr_NX(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_to_NX(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_to_NX(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_fr_NX(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_to_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == YmdHmFrTo_ymd_fr) doYmdHmFrTo_ymd_fr_LC(info);
		else if (lc == YmdHmFrTo_hm_fr) doYmdHmFrTo_hm_fr_LC(info);
		else if (lc == YmdHmFrTo_ymd_to) doYmdHmFrTo_ymd_to_LC(info);
		else if (lc == YmdHmFrTo_hm_to) doYmdHmFrTo_hm_to_LC(info);
		else if (lc == YmdHmFrTo_ymdhm_fr) doYmdHmFrTo_ymdhm_fr_LC(info);
		else if (lc == YmdHmFrTo_ymdhm_to) doYmdHmFrTo_ymdhm_to_LC(info);
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_fr_LC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_fr_LC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymd_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymd_to_LC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[hm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_hm_to_LC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_fr_LC(MCEventInfo info){
	}

	/**
	 * [YmdHmFrTo]パネルの[ymdhm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doYmdHmFrTo_ymdhm_to_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}