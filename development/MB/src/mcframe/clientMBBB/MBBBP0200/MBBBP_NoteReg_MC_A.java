package mcframe.clientMBBB.MBBBP0200;

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
import mcframe.clientMBBB.MBBBP0200.MBBBP_NoteReg_MC.MB_MBBBL0200_Ins01Caller;
import mcframe.clientMBBB.MBBBP0200.MBBBP_NoteReg_MC.MB_MBBBL0200_Del01Caller;

/**
 * 画面"MBBBP_NoteReg"パネルクラスです。<p>
 *
 * 手形情報を送信する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_NoteReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SD,Send;CAN,Cancel sending SD,送信する;CAN,送信を取り消す.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SD = null;
	public MCRadioButton Cnd_ope_CAN = null;
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
	public MCLabel Cnd_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Cnd_note_rsn_nm = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_sd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_can = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD_SD]モードを表す定数 */
	public static final String UPD_SD = "UPD_SD";
	/** [UPD_CAN]モードを表す定数 */
	public static final String UPD_CAN = "UPD_CAN";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD_SD, UPD_CAN};
	
	/** [MB_MBBBL0200_Ins01]のCallerの作成 */
	protected MBBBP_NoteReg_MC.MB_MBBBL0200_Ins01Caller createMB_MBBBL0200_Ins01() {
		MBBBP_NoteReg_MC.MB_MBBBL0200_Ins01Caller<MBBBP_NoteReg, MB_MBBBL0200_Ins01Bridge>
		caller = ((MBBBP_NoteReg_MC)this).new MB_MBBBL0200_Ins01Caller<MBBBP_NoteReg, MB_MBBBL0200_Ins01Bridge>(
					(MBBBP_NoteReg)this, new MB_MBBBL0200_Ins01Bridge());
		return caller;
	}
	/** [MB_MBBBL0200_Ins01]の呼び出し */
	protected void callMB_MBBBL0200_Ins01() {
		MCCaller caller = createMB_MBBBL0200_Ins01();
		caller.exec();
	}
	/** [MB_MBBBL0200_Del01]のCallerの作成 */
	protected MBBBP_NoteReg_MC.MB_MBBBL0200_Del01Caller createMB_MBBBL0200_Del01() {
		MBBBP_NoteReg_MC.MB_MBBBL0200_Del01Caller<MBBBP_NoteReg, MB_MBBBL0200_Del01Bridge>
		caller = ((MBBBP_NoteReg_MC)this).new MB_MBBBL0200_Del01Caller<MBBBP_NoteReg, MB_MBBBL0200_Del01Bridge>(
					(MBBBP_NoteReg)this, new MB_MBBBL0200_Del01Bridge());
		return caller;
	}
	/** [MB_MBBBL0200_Del01]の呼び出し */
	protected void callMB_MBBBL0200_Del01() {
		MCCaller caller = createMB_MBBBL0200_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0200.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0200.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0200.CndR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
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
		if(aCnt == getCndR()) return "Cnd";
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
		if(bId.equals("Cnd")) return getCndR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_NoteReg_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBBP_NoteReg_MC.jbCreateScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbCreateCnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbCreateBtn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbCreateEastBtn((MBBBP_NoteReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBBP_NoteReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_NoteReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBBP_NoteReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MBBBP_NoteReg p) {
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

	
	/** [Cnd_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ext_sys_cd_p = null;

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ext_sys_cd_ListPutter() {
		if (Cnd_ext_sys_cd_p == null) {
			Cnd_ext_sys_cd_p = createCnd_ext_sys_cd_ListPutter(Cnd_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Cnd_ext_sys_cd_p;
	}
	
	
	/** [Cnd_note_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_note_rsn_cd_p = null;

	/**
	 * [Cnd_note_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_note_rsn_cd_ListPutter() {
		if (Cnd_note_rsn_cd_p == null) {
			Cnd_note_rsn_cd_p = createCnd_note_rsn_cd_ListPutter(Cnd_note_rsn_cd, "note_rsn_cd", "note_rsn_nm");

		}
		return Cnd_note_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_NoteReg create(){
		MBBBP_NoteReg p = new MBBBP_NoteReg();
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
		MBBBP_NoteReg_MC.jbfInitScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbfInitCnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbfInitBtn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbfInitEastBtn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbInitScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbInitCnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbInitBtn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.jbInitEastBtn((MBBBP_NoteReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SD = p.beansFactory.createRadioButton("Cnd.ope_SD");
		p.Cnd_ope_CAN = p.beansFactory.createRadioButton("Cnd.ope_CAN");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextComboBox("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_note_rsn_cd_Label = p.beansFactory.createLabel("Cnd.note_rsn_cd_Label");
		p.Cnd_note_rsn_cd = p.beansFactory.createTextComboBox("Cnd.note_rsn_cd");
		p.Cnd_note_rsn_cd.setLabel(p.Cnd_note_rsn_cd_Label);
		p.Cnd_note_rsn_nm = p.beansFactory.createTextField("Cnd.note_rsn_nm");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd_sd = p.beansFactory.createButton("Btn.upd_sd", "upd");
		p.Btn_del_can = p.beansFactory.createButton("Btn.del_can", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BtnPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SD);
		p.Cnd_ope_SD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SD);
		p.ScreenOpePanel.add(p.Cnd_ope_SD);
		p.Cnd_ope_SD.setNextBeans(p.Cnd_ope_CAN);
		p.Cnd_ope_CAN.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_CAN);
		p.ScreenOpePanel.add(p.Cnd_ope_CAN);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.CndPanel.setLastBeans(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_ext_sys_cd.setListType(MCListType.STRICT);
		p.Cnd_ext_sys_cd.setLinkBeans(p.Cnd_ext_sys_nm);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.ext_sys_cd_META);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_note_rsn_cd);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.ext_sys_nm_META);
		p.Cnd_note_rsn_cd.setListType(MCListType.STRICT);
		p.Cnd_note_rsn_cd.setLinkBeans(p.Cnd_note_rsn_nm);
		p.CndPanel.add(p.Cnd_note_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_note_rsn_cd);
		p.Cnd_note_rsn_cd.setNextBeans(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.note_rsn_cd_META);
		p.CndPanel.add(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0200.CndR.note_rsn_nm_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd_sd.setIcon("REGISTER");
		p.Btn_upd_sd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_sd);
		p.BtnPanel.setLastBeans(p.Btn_upd_sd);
		p.Btn_del_can.setIcon("CANCEL");
		p.Btn_del_can.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_can);
		p.EastBtnPanel.add(p.Btn_del_can);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MBBBP_NoteReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MBBBP_NoteReg_MC.mcInitScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.mcInitCnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.mcInitBtn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.mcInitEastBtn((MBBBP_NoteReg)this);

		// [UPD_SD]ステータスのモードの設定
		MBBBP_NoteReg_MC.statusInitUPD__SD_ScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__SD_Cnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__SD_Btn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__SD_EastBtn((MBBBP_NoteReg)this);

		// [UPD_CAN]ステータスのモードの設定
		MBBBP_NoteReg_MC.statusInitUPD__CAN_ScreenOpe((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__CAN_Cnd((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__CAN_Btn((MBBBP_NoteReg)this);
		MBBBP_NoteReg_MC.statusInitUPD__CAN_EastBtn((MBBBP_NoteReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBBP_NoteReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_NoteReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SD.addAllListener(p);
		p.Cnd_ope_CAN.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_note_rsn_cd.setListListener(p);
		p.Cnd_note_rsn_cd.addAllListener(p);
		p.Cnd_note_rsn_nm.setListListener(p);
		p.Cnd_note_rsn_nm.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBBP_NoteReg p) {
		p.Btn_upd_sd.addAllListener(p);
		p.Btn_upd_sd.setAPMethodName("doBtn_upd_sd");
		p.Btn_del_can.addAllListener(p);
		p.Btn_del_can.setAPMethodName("doBtn_del_can");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MBBBP_NoteReg p) {
	}

	/**
	 * [UPD_SD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_ScreenOpe(MBBBP_NoteReg p){

	}

	/**
	 * [UPD_SD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Cnd(MBBBP_NoteReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SD, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, UPD_SD, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, UPD_SD, MCMode.REQUIRED);
		p.Cnd_ext_sys_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.Cnd_note_rsn_cd.putMode(p, UPD_SD, MCMode.REQUIRED);
		p.Cnd_note_rsn_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Btn(MBBBP_NoteReg p){
		p.Btn_upd_sd.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_del_can.putMode(p, UPD_SD, MCMode.DISABLE);

	}

	/**
	 * [UPD_SD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_EastBtn(MBBBP_NoteReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_ScreenOpe(MBBBP_NoteReg p){

	}

	/**
	 * [UPD_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Cnd(MBBBP_NoteReg p){
		p.Cnd_ope_Group.putMode(p, UPD_CAN, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, UPD_CAN, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Cnd_ext_sys_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Cnd_note_rsn_cd.putMode(p, UPD_CAN, MCMode.READ_ONLY);
		p.Cnd_note_rsn_nm.putMode(p, UPD_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_Btn(MBBBP_NoteReg p){
		p.Btn_upd_sd.putMode(p, UPD_CAN, MCMode.DISABLE);
		p.Btn_del_can.putMode(p, UPD_CAN, MCMode.ENABLE);

	}

	/**
	 * [UPD_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CAN_EastBtn(MBBBP_NoteReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD_SD;
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
		Cnd_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ext_sys_cd.getListConfig().setPutter(getCnd_ext_sys_cd_ListPutter());
		Cnd_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_note_rsn_cd.getListConfig().setPutter(getCnd_note_rsn_cd_ListPutter());
	}

	/**
	 * この画面を[UPD_SD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SDStatus() {
		status = UPD_SD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CANStatus() {
		status = UPD_CAN;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD_SD.equals(status)) {
			setUPD_SDStatus();
		}
		else if (UPD_CAN.equals(status)) {
			setUPD_CANStatus();
		}
	}

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
		return lp;
	}
	 
	/**
	 * [Cnd_note_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_note_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ext_sys_cd) return getCnd_ext_sys_cd(row, info);
		if(combo == Cnd_note_rsn_cd) return getCnd_note_rsn_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_upd_sd) doBtn_upd_sd(info);
		else if (ap == Btn_del_can) doBtn_del_can(info);
	}

	/**
	 * [Btn]パネルの[upd_sd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_sd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_can]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_can(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_note_rsn_cd) return doCnd_note_rsn_cd_VC(info);
		if (vc == Cnd_note_rsn_nm) return doCnd_note_rsn_nm_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_nm_VC(MCEventInfo info){
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
		if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NC(info);
		else if (nc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NC(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NE(info);
		else if (ne == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NE(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NX(info);
		else if (nx == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NX(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_LC(info);
		else if (lc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ext_sys_cd]の作成メソッド
	 */
	public MCList getCnd_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_note_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_note_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0200.Ins01")) {
			return new MB_MBBBL0200_Ins01Bridge();
		}
		if (id.equals("MB.MBBBL0200.Del01")) {
			return new MB_MBBBL0200_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0200_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0200_Ins01;

		/** コンストラクタ */
		protected MB_MBBBL0200_Ins01Bridge() {
			p_MB_MBBBL0200_Ins01 = new MCParam(PDef.MB_MBBBL0200_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0200_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0200.CndR.create());
			// Down

			p_MB_MBBBL0200_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0200_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0200_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0200_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0200_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0200.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0200.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBBL0200_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MB_MBBBL0200_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0200_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0200_Del01;

		/** コンストラクタ */
		protected MB_MBBBL0200_Del01Bridge() {
			p_MB_MBBBL0200_Del01 = new MCParam(PDef.MB_MBBBL0200_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0200_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0200.CndR.create());
			// Down

			p_MB_MBBBL0200_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0200_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0200_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0200_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0200_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0200.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0200.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBBL0200_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}