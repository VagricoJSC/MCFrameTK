package mcframe.clientMSBF.MSBFP0020;

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
import mcframe.clientMSBF.MSBFP0020.MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Srch01Caller;
import mcframe.clientMSBF.MSBFP0020.MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Ins01Caller;
import mcframe.clientMSBF.MSBFP0020.MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Del01Caller;

/**
 * 画面"MSBFP_PrcdLotInspReg"パネルクラスです。<p>
 *
 * 先行検査予定の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_PrcdLotInspReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBFP0020";

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
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;DEL,Cancel INS,登録する;DEL,取り消す.<p>
	 *
	 */
	public MCButtonGroup Cnd_ins_typ_Group = null;
	public MCRadioButton Cnd_ins_typ_INS = null;
	public MCRadioButton Cnd_ins_typ_DEL = null;
	public MCLabel Cnd_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Cnd_master_dt = null;
	public MCLabel Cnd_insp_schd_no_Label = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_schd_no = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Inspection location cd. 検査場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Inspection location name 検査場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_lot_no = null;
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Cnd_st_tm_p_PPanel;
	public MCDateField Cnd_st_dt;	// [Cnd]の[st_tm_p.ymd]を[Cnd_st_dt]としてエイリアス定義。
	public MCDateField Cnd_st_tm;	// [Cnd]の[st_tm_p.hm]を[Cnd_st_tm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Cnd_end_tm_p_PPanel;
	public MCDateField Cnd_end_dt;	// [Cnd]の[end_tm_p.ymd]を[Cnd_end_dt]としてエイリアス定義。
	public MCDateField Cnd_end_tm;	// [Cnd]の[end_tm_p.hm]を[Cnd_end_tm]としてエイリアス定義。
	public MCLabel Cnd_insp_cnt_rmrks_Label = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_insp_cnt_rmrks = null;
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
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public MCCheckBox Cnd_pre_insp_valid_flg = null;
	/**
	 * Without sampling specific inspection 抜取規格検査なし.<p>
	 *
	 */
	public MCCheckBox Cnd_no_spec_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, DEL, FIX};
	
	/** [MS_MSBFL0020_Srch01]のCallerの作成 */
	protected MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Srch01Caller createMS_MSBFL0020_Srch01() {
		MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Srch01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Srch01Bridge>
		caller = ((MSBFP_PrcdLotInspReg_MC)this).new MS_MSBFL0020_Srch01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Srch01Bridge>(
					(MSBFP_PrcdLotInspReg)this, new MS_MSBFL0020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0020_Srch01]の呼び出し */
	protected void callMS_MSBFL0020_Srch01() {
		MCCaller caller = createMS_MSBFL0020_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0020_Ins01]のCallerの作成 */
	protected MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Ins01Caller createMS_MSBFL0020_Ins01() {
		MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Ins01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Ins01Bridge>
		caller = ((MSBFP_PrcdLotInspReg_MC)this).new MS_MSBFL0020_Ins01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Ins01Bridge>(
					(MSBFP_PrcdLotInspReg)this, new MS_MSBFL0020_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBFL0020_Ins01]の呼び出し */
	protected void callMS_MSBFL0020_Ins01() {
		MCCaller caller = createMS_MSBFL0020_Ins01();
		caller.exec();
	}
	/** [MS_MSBFL0020_Del01]のCallerの作成 */
	protected MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Del01Caller createMS_MSBFL0020_Del01() {
		MSBFP_PrcdLotInspReg_MC.MS_MSBFL0020_Del01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Del01Bridge>
		caller = ((MSBFP_PrcdLotInspReg_MC)this).new MS_MSBFL0020_Del01Caller<MSBFP_PrcdLotInspReg, MS_MSBFL0020_Del01Bridge>(
					(MSBFP_PrcdLotInspReg)this, new MS_MSBFL0020_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0020_Del01]の呼び出し */
	protected void callMS_MSBFL0020_Del01() {
		MCCaller caller = createMS_MSBFL0020_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0020.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0020.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0020.CndR.create();
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
	public MSBFP_PrcdLotInspReg_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_PrcdLotInspReg_MC.jbCreateScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbCreateCnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbCreateBtn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbCreateEastBtn((MSBFP_PrcdLotInspReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_PrcdLotInspReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_PrcdLotInspReg p) {
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_st_tm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getCndR().st_tm_p());
		p.Cnd_st_tm_p_PPanel.setName("Cnd.st_tm_p");
		p.Cnd_st_dt = p.Cnd_st_tm_p_PPanel.YmdHm_ymd;
		p.Cnd_st_dt.addAliasName("Cnd.st_dt", p);
		p.Cnd_st_tm = p.Cnd_st_tm_p_PPanel.YmdHm_hm;
		p.Cnd_st_tm.addAliasName("Cnd.st_tm", p);
		p.Cnd_end_tm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getCndR().end_tm_p());
		p.Cnd_end_tm_p_PPanel.setName("Cnd.end_tm_p");
		p.Cnd_end_dt = p.Cnd_end_tm_p_PPanel.YmdHm_ymd;
		p.Cnd_end_dt.addAliasName("Cnd.end_dt", p);
		p.Cnd_end_tm = p.Cnd_end_tm_p_PPanel.YmdHm_hm;
		p.Cnd_end_tm.addAliasName("Cnd.end_tm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBFP_PrcdLotInspReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_PrcdLotInspReg p) {
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

	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_PrcdLotInspReg create(){
		MSBFP_PrcdLotInspReg p = new MSBFP_PrcdLotInspReg();
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
		MSBFP_PrcdLotInspReg_MC.jbfInitScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbfInitCnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbfInitBtn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbfInitEastBtn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbInitScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbInitCnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbInitBtn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.jbInitEastBtn((MSBFP_PrcdLotInspReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ins_typ_Group = p.beansFactory.createButtonGroup("Cnd.ins_typ");
		p.Cnd_ins_typ_INS = p.beansFactory.createRadioButton("Cnd.ins_typ_INS");
		p.Cnd_ins_typ_DEL = p.beansFactory.createRadioButton("Cnd.ins_typ_DEL");
		p.Cnd_master_dt_Label = p.beansFactory.createLabel("Cnd.master_dt_Label");
		p.Cnd_master_dt = p.beansFactory.createDateField("Cnd.master_dt");
		p.Cnd_master_dt.setLabel(p.Cnd_master_dt_Label);
		p.Cnd_insp_schd_no_Label = p.beansFactory.createLabel("Cnd.insp_schd_no_Label");
		p.Cnd_insp_schd_no = p.beansFactory.createTextField("Cnd.insp_schd_no");
		p.Cnd_insp_schd_no.setLabel(p.Cnd_insp_schd_no_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_insp_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.insp_cnt_rmrks_Label");
		p.Cnd_insp_cnt_rmrks = p.beansFactory.createTextField("Cnd.insp_cnt_rmrks");
		p.Cnd_insp_cnt_rmrks.setLabel(p.Cnd_insp_cnt_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_pre_insp_valid_flg = p.beansFactory.createCheckBox("Cnd.pre_insp_valid_flg");
		p.Cnd_no_spec_flg = p.beansFactory.createCheckBox("Cnd.no_spec_flg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BtnPanel);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ins_typ_Group);
		p.Cnd_ins_typ_Group.setFirstBeans(p.Cnd_ins_typ_INS);
		p.Cnd_ins_typ_INS.setActionCommand("0");
		p.Cnd_ins_typ_Group.add(p.Cnd_ins_typ_INS);
		p.ScreenOpePanel.add(p.Cnd_ins_typ_INS);
		p.Cnd_ins_typ_INS.setNextBeans(p.Cnd_ins_typ_DEL);
		p.Cnd_ins_typ_DEL.setActionCommand("1");
		p.Cnd_ins_typ_Group.add(p.Cnd_ins_typ_DEL);
		p.ScreenOpePanel.add(p.Cnd_ins_typ_DEL);
		p.Cnd_ins_typ_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.ins_typ_META);
		p.CndPanel.add(p.Cnd_master_dt_Label);
		p.CndPanel.add(p.Cnd_master_dt);
		p.CndPanel.setLastBeans(p.Cnd_master_dt);
		p.Cnd_master_dt.setNextBeans(p.Cnd_insp_schd_no);
		p.Cnd_master_dt.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.master_dt_META);
		p.Cnd_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_insp_schd_no_Label);
		p.CndPanel.add(p.Cnd_insp_schd_no);
		p.Cnd_insp_schd_no.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_insp_schd_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.insp_schd_no_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.loc_nm_META);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.sppl_nm_META);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.maker_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_st_tm_p_PPanel);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.bp_lot_no_META);
		p.CndPanel.add(p.Cnd_st_tm_p_PPanel);
		p.Cnd_st_tm_p_PPanel.setNextBeans(p.Cnd_end_tm_p_PPanel);
		p.CndPanel.add(p.Cnd_end_tm_p_PPanel);
		p.Cnd_end_tm_p_PPanel.setNextBeans(p.Cnd_insp_cnt_rmrks);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks);
		p.Cnd_insp_cnt_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_insp_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.insp_cnt_rmrks_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_pre_insp_valid_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.sub_char3_META);
		p.CndPanel.add(p.Cnd_pre_insp_valid_flg);
		p.Cnd_pre_insp_valid_flg.setNextBeans(p.Cnd_no_spec_flg);
		p.Cnd_pre_insp_valid_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.pre_insp_valid_flg_META);
		p.CndPanel.add(p.Cnd_no_spec_flg);
		p.Cnd_no_spec_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0020.CndR.no_spec_flg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBFP_PrcdLotInspReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.BtnPanel.setLastBeans(p.Btn_ins);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_PrcdLotInspReg p) {
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
		MSBFP_PrcdLotInspReg_MC.mcInitScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.mcInitCnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.mcInitBtn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.mcInitEastBtn((MSBFP_PrcdLotInspReg)this);

		// [INS]ステータスのモードの設定
		MSBFP_PrcdLotInspReg_MC.statusInitINS_ScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitINS_Cnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitINS_Btn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitINS_EastBtn((MSBFP_PrcdLotInspReg)this);

		// [DEL]ステータスのモードの設定
		MSBFP_PrcdLotInspReg_MC.statusInitDEL_ScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitDEL_Cnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitDEL_Btn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitDEL_EastBtn((MSBFP_PrcdLotInspReg)this);

		// [FIX]ステータスのモードの設定
		MSBFP_PrcdLotInspReg_MC.statusInitFIX_ScreenOpe((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitFIX_Cnd((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitFIX_Btn((MSBFP_PrcdLotInspReg)this);
		MSBFP_PrcdLotInspReg_MC.statusInitFIX_EastBtn((MSBFP_PrcdLotInspReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_PrcdLotInspReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_PrcdLotInspReg p) {
		p.Cnd_ins_typ_Group.addAllListener(p);
		p.Cnd_ins_typ_INS.addAllListener(p);
		p.Cnd_ins_typ_DEL.addAllListener(p);
		p.Cnd_master_dt.setListListener(p);
		p.Cnd_master_dt.addAllListener(p);
		p.Cnd_insp_schd_no.setListListener(p);
		p.Cnd_insp_schd_no.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_insp_cnt_rmrks.setListListener(p);
		p.Cnd_insp_cnt_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_pre_insp_valid_flg.addAllListener(p);
		p.Cnd_no_spec_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_PrcdLotInspReg p) {
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_PrcdLotInspReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBFP_PrcdLotInspReg p){
		p.Cnd_ins_typ_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_master_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_insp_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bp_lot_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_st_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.Cnd_end_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pre_insp_valid_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_no_spec_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBFP_PrcdLotInspReg p){
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_PrcdLotInspReg p){
		p.Cnd_ins_typ_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_master_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_insp_schd_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_st_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Cnd_end_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pre_insp_valid_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_no_spec_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBFP_PrcdLotInspReg p){
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MSBFP_PrcdLotInspReg p){
		p.Cnd_ins_typ_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_master_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_insp_schd_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_bp_lot_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_st_tm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Cnd_end_tm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_pre_insp_valid_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_no_spec_flg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MSBFP_PrcdLotInspReg p){
		p.Btn_ins.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MSBFP_PrcdLotInspReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
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
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_ins_typ_Group) return doCnd_ins_typ_VC(info);
		if (vc == Cnd_master_dt) return doCnd_master_dt_VC(info);
		if (vc == Cnd_insp_schd_no) return doCnd_insp_schd_no_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_insp_cnt_rmrks) return doCnd_insp_cnt_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_pre_insp_valid_flg) return doCnd_pre_insp_valid_flg_VC(info);
		if (vc == Cnd_no_spec_flg) return doCnd_no_spec_flg_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_insp_valid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_insp_valid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_spec_flg_VC(MCEventInfo info){
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
		if (nc == Cnd_ins_typ_Group) doCnd_ins_typ_NC(info);
		else if (nc == Cnd_master_dt) doCnd_master_dt_NC(info);
		else if (nc == Cnd_insp_schd_no) doCnd_insp_schd_no_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_pre_insp_valid_flg) doCnd_pre_insp_valid_flg_NC(info);
		else if (nc == Cnd_no_spec_flg) doCnd_no_spec_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[ins_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_insp_valid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_insp_valid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_ins_typ_Group) doCnd_ins_typ_NE(info);
		else if (ne == Cnd_master_dt) doCnd_master_dt_NE(info);
		else if (ne == Cnd_insp_schd_no) doCnd_insp_schd_no_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_pre_insp_valid_flg) doCnd_pre_insp_valid_flg_NE(info);
		else if (ne == Cnd_no_spec_flg) doCnd_no_spec_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[ins_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_insp_valid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_insp_valid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_ins_typ_Group) doCnd_ins_typ_NX(info);
		else if (nx == Cnd_master_dt) doCnd_master_dt_NX(info);
		else if (nx == Cnd_insp_schd_no) doCnd_insp_schd_no_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_pre_insp_valid_flg) doCnd_pre_insp_valid_flg_NX(info);
		else if (nx == Cnd_no_spec_flg) doCnd_no_spec_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[ins_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_insp_valid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_insp_valid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_master_dt) doCnd_master_dt_LC(info);
		else if (lc == Cnd_insp_schd_no) doCnd_insp_schd_no_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
	}

	/**
	 * [Cnd]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0020.Srch01")) {
			return new MS_MSBFL0020_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0020.Ins01")) {
			return new MS_MSBFL0020_Ins01Bridge();
		}
		if (id.equals("MS.MSBFL0020.Del01")) {
			return new MS_MSBFL0020_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0020_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0020_Srch01Bridge() {
			p_MS_MSBFL0020_Srch01 = new MCParam(PDef.MS_MSBFL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());

			p_MS_MSBFL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0020.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0020.CndR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0020.CndR down0() {
			return (mcframe.clientMSBF.MSBFP0020.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0020_Srch01.addDownBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0020_Srch01;
		}

		protected void show() {
			setCndR((mcframe.clientMSBF.MSBFP0020.CndR)p_MS_MSBFL0020_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0020_Ins01;

		/** コンストラクタ */
		protected MS_MSBFL0020_Ins01Bridge() {
			p_MS_MSBFL0020_Ins01 = new MCParam(PDef.MS_MSBFL0020_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0020_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());

			p_MS_MSBFL0020_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0020_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0020_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0020_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0020_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0020.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0020.CndR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0020.CndR down0() {
			return (mcframe.clientMSBF.MSBFP0020.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0020_Ins01.addDownBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0020_Ins01;
		}

		protected void show() {
			setCndR((mcframe.clientMSBF.MSBFP0020.CndR)p_MS_MSBFL0020_Ins01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0020_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0020_Del01Bridge() {
			p_MS_MSBFL0020_Del01 = new MCParam(PDef.MS_MSBFL0020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0020.CndR.create());
			// Down

			p_MS_MSBFL0020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0020_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0020.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0020.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBFL0020_Del01;
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