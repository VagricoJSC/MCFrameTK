package mcframe.clientMGBD.MGBDP0010;

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
import mcframe.clientMGBD.MGBDP0010.MGBDP_CalcCost_MC.MG_MGBDL0010_Ins01Caller;
import mcframe.clientMGBD.MGBDP0010.MGBDP_CalcCost_MC.MG_MGBDL0010_Srch01Caller;

/**
 * 画面"MGBDP_CalcCost"パネルクラスです。<p>
 *
 * 原価計算を実行する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CalcCost_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym;	// [Cnd]の[term_p.term_end_ym]を[Cnd_term_end_ym]としてエイリアス定義。
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public MCTextField Cnd_cost_calc_typ = null;
	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public MCNumberField Cnd_max_mons = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym_to = null;
	public MCLabel Cnd_xrate_cd_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCTextField Cnd_xrate_nm = null;
	/**
	 * Item specified calculation 品目指定計算.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_limit_flg = null;
	/**
	 * Calculation for data check データ確認計算.<p>
	 *
	 */
	public MCCheckBox Cnd_data_check_flg = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Cnd_ins = null;
	/**
	 * Cost calculation results 原価計算結果確認.<p>
	 *
	 */
	public MCButton Cnd_open_MGBDP0030 = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD};
	
	/** [MG_MGBDL0010_Ins01]のCallerの作成 */
	protected MGBDP_CalcCost_MC.MG_MGBDL0010_Ins01Caller createMG_MGBDL0010_Ins01() {
		MGBDP_CalcCost_MC.MG_MGBDL0010_Ins01Caller<MGBDP_CalcCost, MG_MGBDL0010_Ins01Bridge>
		caller = ((MGBDP_CalcCost_MC)this).new MG_MGBDL0010_Ins01Caller<MGBDP_CalcCost, MG_MGBDL0010_Ins01Bridge>(
					(MGBDP_CalcCost)this, new MG_MGBDL0010_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0010_Ins01]の呼び出し */
	protected void callMG_MGBDL0010_Ins01() {
		MCCaller caller = createMG_MGBDL0010_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0010_Srch01]のCallerの作成 */
	protected MGBDP_CalcCost_MC.MG_MGBDL0010_Srch01Caller createMG_MGBDL0010_Srch01() {
		MGBDP_CalcCost_MC.MG_MGBDL0010_Srch01Caller<MGBDP_CalcCost, MG_MGBDL0010_Srch01Bridge>
		caller = ((MGBDP_CalcCost_MC)this).new MG_MGBDL0010_Srch01Caller<MGBDP_CalcCost, MG_MGBDL0010_Srch01Bridge>(
					(MGBDP_CalcCost)this, new MG_MGBDL0010_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0010_Srch01]の呼び出し */
	protected void callMG_MGBDL0010_Srch01() {
		MCCaller caller = createMG_MGBDL0010_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0010.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0010.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0010.CndR.create();
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
		ret.add(CndPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcCost_MC_A() {
		aCndR = createCndR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MGBDP_CalcCost_MC_A(mcframe.clientMGBD.MGBDP0010.CndR row){
		aCndR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CalcCost_MC.jbCreateCnd((MGBDP_CalcCost)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CalcCost p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_end_ym = p.Cnd_term_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym.addAliasName("Cnd.term_end_ym", p);
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm","cost_calc_typ","max_mons","xrate_cd");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_ym_fr_ListPutter]の定義 */
	private MCListPutter Cnd_ym_fr_p = null;

	/**
	 * [Cnd_ym_fr_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_fr_ListPutter() {
		if (Cnd_ym_fr_p == null) {
			Cnd_ym_fr_p = createCnd_ym_fr_ListPutter(Cnd_ym_fr, "ym_fr");

		}
		return Cnd_ym_fr_p;
	}
	
	
	/** [Cnd_ym_to_ListPutter]の定義 */
	private MCListPutter Cnd_ym_to_p = null;

	/**
	 * [Cnd_ym_to_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_to_ListPutter() {
		if (Cnd_ym_to_p == null) {
			Cnd_ym_to_p = createCnd_ym_to_ListPutter(Cnd_ym_to, "ym_to");

		}
		return Cnd_ym_to_p;
	}
	
	
	/** [Cnd_xrate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_xrate_cd_p = null;

	/**
	 * [Cnd_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_xrate_cd_ListPutter() {
		if (Cnd_xrate_cd_p == null) {
			Cnd_xrate_cd_p = createCnd_xrate_cd_ListPutter(Cnd_xrate_cd, "xrate_cd", "xrate_nm");

		}
		return Cnd_xrate_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MGBDP_CalcCost create(mcframe.clientMGBD.MGBDP0010.CndR row){
		MGBDP_CalcCost p = new MGBDP_CalcCost(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CalcCost create(){
		MGBDP_CalcCost p = new MGBDP_CalcCost();
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
		MGBDP_CalcCost_MC.jbfInitCnd((MGBDP_CalcCost)this);
		MGBDP_CalcCost_MC.jbInitCnd((MGBDP_CalcCost)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CalcCost p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_cost_calc_typ = p.beansFactory.createTextField("Cnd.cost_calc_typ");
		p.Cnd_max_mons = p.beansFactory.createNumberField("Cnd.max_mons");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateComboBox("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateComboBox("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_xrate_cd_Label = p.beansFactory.createLabel("Cnd.xrate_cd_Label");
		p.Cnd_xrate_cd = p.beansFactory.createTextComboBox("Cnd.xrate_cd");
		p.Cnd_xrate_cd.setLabel(p.Cnd_xrate_cd_Label);
		p.Cnd_xrate_nm = p.beansFactory.createTextField("Cnd.xrate_nm");
		p.Cnd_itm_limit_flg = p.beansFactory.createCheckBox("Cnd.itm_limit_flg");
		p.Cnd_data_check_flg = p.beansFactory.createCheckBox("Cnd.data_check_flg");
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_ins = p.beansFactory.createButton("Cnd.ins", "upd");
		p.Cnd_open_MGBDP0030 = p.beansFactory.createButton("Cnd.open_MGBDP0030", "open");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_CalcCost p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm,p.Cnd_cost_calc_typ,p.Cnd_max_mons,p.Cnd_xrate_cd);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_cost_calc_typ);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_cost_calc_typ);
		p.Cnd_cost_calc_typ.setNextBeans(p.Cnd_max_mons);
		p.Cnd_cost_calc_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.cost_calc_typ_META);
		p.CndPanel.add(p.Cnd_max_mons);
		p.Cnd_max_mons.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_max_mons.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.max_mons_META);
		p.Cnd_ym_fr.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_ym_to.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_xrate_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_xrate_cd.setListType(MCListType.STRICT);
		p.Cnd_xrate_cd.setLinkBeans(p.Cnd_xrate_nm);
		p.CndPanel.add(p.Cnd_xrate_cd_Label);
		p.CndPanel.add(p.Cnd_xrate_cd);
		p.Cnd_xrate_cd.setNextBeans(p.Cnd_xrate_nm);
		p.Cnd_xrate_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.xrate_cd_META);
		p.CndPanel.add(p.Cnd_xrate_nm);
		p.Cnd_xrate_nm.setNextBeans(p.Cnd_itm_limit_flg);
		p.Cnd_xrate_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.xrate_nm_META);
		p.CndPanel.add(p.Cnd_itm_limit_flg);
		p.Cnd_itm_limit_flg.setNextBeans(p.Cnd_data_check_flg);
		p.Cnd_itm_limit_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.itm_limit_flg_META);
		p.CndPanel.add(p.Cnd_data_check_flg);
		p.Cnd_data_check_flg.setNextBeans(p.Cnd_rmrks);
		p.Cnd_data_check_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.data_check_flg_META);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.rmrks_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_ins);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0010.CndR.sub_char3_META);
		p.Cnd_ins.setIcon("REGISTER");
		p.Cnd_ins.setFunctionKey(MCFunctionKey.F9);
		p.CndPanel.add(p.Cnd_ins);
		p.Cnd_ins.setNextBeans(p.Cnd_open_MGBDP0030);
		p.Cnd_open_MGBDP0030.setFunctionKey(MCFunctionKey.F3);
		p.CndPanel.add(p.Cnd_open_MGBDP0030);
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
		MGBDP_CalcCost_MC.mcInitCnd((MGBDP_CalcCost)this);

		// [UPD]ステータスのモードの設定
		MGBDP_CalcCost_MC.statusInitUPD_Cnd((MGBDP_CalcCost)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CalcCost p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_cost_calc_typ.setListListener(p);
		p.Cnd_cost_calc_typ.addAllListener(p);
		p.Cnd_max_mons.setListListener(p);
		p.Cnd_max_mons.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_xrate_cd.setListListener(p);
		p.Cnd_xrate_cd.addAllListener(p);
		p.Cnd_xrate_nm.setListListener(p);
		p.Cnd_xrate_nm.addAllListener(p);
		p.Cnd_itm_limit_flg.addAllListener(p);
		p.Cnd_data_check_flg.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_ins.addAllListener(p);
		p.Cnd_ins.setAPMethodName("doCnd_ins");
		p.Cnd_open_MGBDP0030.addAllListener(p);
		p.Cnd_open_MGBDP0030.setAPMethodName("doCnd_open_MGBDP0030");
	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_CalcCost p){
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cost_calc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_max_mons.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_xrate_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_limit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_data_check_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_open_MGBDP0030.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
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
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_ym_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym_fr.getListConfig().setPutter(getCnd_ym_fr_ListPutter());
		Cnd_ym_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym_to.getListConfig().setPutter(getCnd_ym_to_ListPutter());
		Cnd_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_xrate_cd.getListConfig().setPutter(getCnd_xrate_cd_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_ym_fr_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_ym_to_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_ym_fr) return getCnd_ym_fr(row, info);
		if(combo == Cnd_ym_to) return getCnd_ym_to(row, info);
		if(combo == Cnd_xrate_cd) return getCnd_xrate_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_ins) doCnd_ins(info);
		else if (ap == Cnd_open_MGBDP0030) doCnd_open_MGBDP0030(info);
	}

	/**
	 * [Cnd]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_ins(MCEventInfo info);

	/**
	 * [Cnd]パネルの[open_MGBDP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_open_MGBDP0030(MCEventInfo info);

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
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_cost_calc_typ) return doCnd_cost_calc_typ_VC(info);
		if (vc == Cnd_max_mons) return doCnd_max_mons_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_xrate_cd) return doCnd_xrate_cd_VC(info);
		if (vc == Cnd_xrate_nm) return doCnd_xrate_nm_VC(info);
		if (vc == Cnd_itm_limit_flg) return doCnd_itm_limit_flg_VC(info);
		if (vc == Cnd_data_check_flg) return doCnd_data_check_flg_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[max_mons]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_max_mons_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_limit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_limit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_check_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_check_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
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
		if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_cost_calc_typ) doCnd_cost_calc_typ_NC(info);
		else if (nc == Cnd_max_mons) doCnd_max_mons_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_xrate_cd) doCnd_xrate_cd_NC(info);
		else if (nc == Cnd_xrate_nm) doCnd_xrate_nm_NC(info);
		else if (nc == Cnd_itm_limit_flg) doCnd_itm_limit_flg_NC(info);
		else if (nc == Cnd_data_check_flg) doCnd_data_check_flg_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_mons]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_limit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_limit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_check_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_check_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_cost_calc_typ) doCnd_cost_calc_typ_NE(info);
		else if (ne == Cnd_max_mons) doCnd_max_mons_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_xrate_cd) doCnd_xrate_cd_NE(info);
		else if (ne == Cnd_xrate_nm) doCnd_xrate_nm_NE(info);
		else if (ne == Cnd_itm_limit_flg) doCnd_itm_limit_flg_NE(info);
		else if (ne == Cnd_data_check_flg) doCnd_data_check_flg_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_mons]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_limit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_limit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_check_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_check_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_cost_calc_typ) doCnd_cost_calc_typ_NX(info);
		else if (nx == Cnd_max_mons) doCnd_max_mons_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_xrate_cd) doCnd_xrate_cd_NX(info);
		else if (nx == Cnd_xrate_nm) doCnd_xrate_nm_NX(info);
		else if (nx == Cnd_itm_limit_flg) doCnd_itm_limit_flg_NX(info);
		else if (nx == Cnd_data_check_flg) doCnd_data_check_flg_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_mons]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_limit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_limit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_check_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_check_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_cost_calc_typ) doCnd_cost_calc_typ_LC(info);
		else if (lc == Cnd_max_mons) doCnd_max_mons_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_xrate_cd) doCnd_xrate_cd_LC(info);
		else if (lc == Cnd_xrate_nm) doCnd_xrate_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_mons]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_mons_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym_fr]の作成メソッド
	 */
	public MCList getCnd_ym_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym_to]の作成メソッド
	 */
	public MCList getCnd_ym_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_xrate_cd]の作成メソッド
	 */
	public MCList getCnd_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0010.Ins01")) {
			return new MG_MGBDL0010_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0010.Srch01")) {
			return new MG_MGBDL0010_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0010_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0010_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0010_Ins01Bridge() {
			p_MG_MGBDL0010_Ins01 = new MCParam(PDef.MG_MGBDL0010_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0010_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());

			p_MG_MGBDL0010_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0010_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0010_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0010_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0010_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0010.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0010.CndR)up(0);
		}

		protected mcframe.clientMGBD.MGBDP0010.CndR down0() {
			return (mcframe.clientMGBD.MGBDP0010.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0010_Ins01.addDownBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());
		}
		protected MCParam param() {
			return p_MG_MGBDL0010_Ins01;
		}

		protected void show() {
			setCndR((mcframe.clientMGBD.MGBDP0010.CndR)p_MG_MGBDL0010_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0010_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0010_Srch01Bridge() {
			p_MG_MGBDL0010_Srch01 = new MCParam(PDef.MG_MGBDL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());

			p_MG_MGBDL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0010.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0010.CndR)up(0);
		}

		protected mcframe.clientMGBD.MGBDP0010.CndR down0() {
			return (mcframe.clientMGBD.MGBDP0010.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0010_Srch01.addDownBlock(mcframe.clientMGBD.MGBDP0010.CndR.create());
		}
		protected MCParam param() {
			return p_MG_MGBDL0010_Srch01;
		}

		protected void show() {
			setCndR((mcframe.clientMGBD.MGBDP0010.CndR)p_MG_MGBDL0010_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
	}
}