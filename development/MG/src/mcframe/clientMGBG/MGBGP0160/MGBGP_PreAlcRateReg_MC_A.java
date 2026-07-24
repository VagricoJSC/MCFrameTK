package mcframe.clientMGBG.MGBGP0160;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMGBG.MGBGP0160.MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Srch01Caller;
import mcframe.clientMGBG.MGBGP0160.MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Ins01Caller;

/**
 * 画面"MGBGP_PreAlcRateReg"パネルクラスです。<p>
 *
 * 一次配賦期間比率を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_PreAlcRateReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBGP0160";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PLN,Create plan ratio;ACT,Create result ratio; PLN,計画比率を作成する;ACT,実績比率を作成する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PLN = null;
	public MCRadioButton Cnd_ope_ACT = null;
	public MCLabel Cnd_tgt_ym_fr_Label = null;
	/**
	 * Month to create FROM 作成対象年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_tgt_ym_fr = null;
	public MCLabel Cnd_tgt_ym_to_Label = null;
	/**
	 * Month to create TO 作成対象年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_tgt_ym_to = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名称.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_rate_nm = null;
	public MCLabel Cnd_pre_alc_set_typ_Label = null;
	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_set_typ = null;
	/**
	 * Ratio setting type name 比率設定区分名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_set_typ_nm = null;
	/**
	 * Non-entry only 未登録のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_no_exist_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_ym_fr_Label = null;
	/**
	 * Acquisition month FROM 取得先対象年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField BulkSet_ym_fr = null;
	public MCLabel BulkSet_ym_to_Label = null;
	/**
	 * Acquisition month TO 取得先対象年月ＴＯ.<p>
	 *
	 */
	public MCDateField BulkSet_ym_to = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBG.MGBGP0160.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Entry 登録.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exist_flg = null;
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sa_typ = null;
	/**
	 * Month to create 作成対象年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ym = null;
	/**
	 * Acquisition month FROM 取得先対象年月ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ym_fr = null;
	/**
	 * Acquisition month TO 取得先対象年月ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ym_to = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_rate_nm = null;
	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_set_typ = null;
	/**
	 * Ratio setting type name 比率設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_set_typ_nm = null;
	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pln_mly_flg = null;
	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_mly_flg = null;
	/**
	 * Plan based 計画基準.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pln_rule_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Departmental alloc. variable ratio entry 一次配賦月次比率登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBGP0120 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX_U};
	
	/** [MG_MGBGL0160_Srch01]のCallerの作成 */
	protected MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Srch01Caller createMG_MGBGL0160_Srch01() {
		MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Srch01Caller<MGBGP_PreAlcRateReg, MG_MGBGL0160_Srch01Bridge>
		caller = ((MGBGP_PreAlcRateReg_MC)this).new MG_MGBGL0160_Srch01Caller<MGBGP_PreAlcRateReg, MG_MGBGL0160_Srch01Bridge>(
					(MGBGP_PreAlcRateReg)this, new MG_MGBGL0160_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0160_Srch01]の呼び出し */
	protected void callMG_MGBGL0160_Srch01() {
		MCCaller caller = createMG_MGBGL0160_Srch01();
		caller.exec();
	}
	/** [MG_MGBGL0160_Ins01]のCallerの作成 */
	protected MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Ins01Caller createMG_MGBGL0160_Ins01() {
		MGBGP_PreAlcRateReg_MC.MG_MGBGL0160_Ins01Caller<MGBGP_PreAlcRateReg, MG_MGBGL0160_Ins01Bridge>
		caller = ((MGBGP_PreAlcRateReg_MC)this).new MG_MGBGL0160_Ins01Caller<MGBGP_PreAlcRateReg, MG_MGBGL0160_Ins01Bridge>(
					(MGBGP_PreAlcRateReg)this, new MG_MGBGL0160_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBGL0160_Ins01]の呼び出し */
	protected void callMG_MGBGL0160_Ins01() {
		MCCaller caller = createMG_MGBGL0160_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0160.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0160.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0160.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0160.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0160.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMGBG.MGBGP0160.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMGBG.MGBGP0160.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMGBG.MGBGP0160.BulkSetR createBulkSetR() {
		return mcframe.clientMGBG.MGBGP0160.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBG.MGBGP0160.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0160.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBG.MGBGP0160.DtlR createDtlR() {
		return mcframe.clientMGBG.MGBGP0160.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0160.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0160.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_PreAlcRateReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBGP_PreAlcRateReg_MC.jbCreateScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateTop((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateCnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateCtrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateBulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateDtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbCreateBtn((MGBGP_PreAlcRateReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBGP_PreAlcRateReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_PreAlcRateReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_PreAlcRateReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_PreAlcRateReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MGBGP_PreAlcRateReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBGP_PreAlcRateReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBGP_PreAlcRateReg p) {
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

	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_rate_cd_p = null;

	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_rate_cd_ListPutter() {
		if (Cnd_pre_alc_rate_cd_p == null) {
			Cnd_pre_alc_rate_cd_p = createCnd_pre_alc_rate_cd_ListPutter(Cnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm");

		}
		return Cnd_pre_alc_rate_cd_p;
	}
	
	
	/** [Cnd_pre_alc_set_typ_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_set_typ_p = null;

	/**
	 * [Cnd_pre_alc_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_set_typ_ListPutter() {
		if (Cnd_pre_alc_set_typ_p == null) {
			Cnd_pre_alc_set_typ_p = createCnd_pre_alc_set_typ_ListPutter(Cnd_pre_alc_set_typ, "pre_alc_set_typ", "pre_alc_set_typ_nm");

		}
		return Cnd_pre_alc_set_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateReg create(){
		MGBGP_PreAlcRateReg p = new MGBGP_PreAlcRateReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateReg create(String name){
		MGBGP_PreAlcRateReg p = new MGBGP_PreAlcRateReg(name);
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
		MGBGP_PreAlcRateReg_MC.jbfInitScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitTop((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitCnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitCtrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitBulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitDtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbfInitBtn((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitTop((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitCnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitCtrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitBulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitDtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.jbInitBtn((MGBGP_PreAlcRateReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PLN = p.beansFactory.createRadioButton("Cnd.ope_PLN");
		p.Cnd_ope_ACT = p.beansFactory.createRadioButton("Cnd.ope_ACT");
		p.Cnd_tgt_ym_fr_Label = p.beansFactory.createLabel("Cnd.tgt_ym_fr_Label");
		p.Cnd_tgt_ym_fr = p.beansFactory.createDateField("Cnd.tgt_ym_fr");
		p.Cnd_tgt_ym_fr.setLabel(p.Cnd_tgt_ym_fr_Label);
		p.Cnd_tgt_ym_to_Label = p.beansFactory.createLabel("Cnd.tgt_ym_to_Label");
		p.Cnd_tgt_ym_to = p.beansFactory.createDateField("Cnd.tgt_ym_to");
		p.Cnd_tgt_ym_to.setLabel(p.Cnd_tgt_ym_to_Label);
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_rate_cd_Label");
		p.Cnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_rate_cd");
		p.Cnd_pre_alc_rate_cd.setLabel(p.Cnd_pre_alc_rate_cd_Label);
		p.Cnd_pre_alc_rate_nm = p.beansFactory.createTextField("Cnd.pre_alc_rate_nm");
		p.Cnd_pre_alc_set_typ_Label = p.beansFactory.createLabel("Cnd.pre_alc_set_typ_Label");
		p.Cnd_pre_alc_set_typ = p.beansFactory.createTextComboBox("Cnd.pre_alc_set_typ");
		p.Cnd_pre_alc_set_typ.setLabel(p.Cnd_pre_alc_set_typ_Label);
		p.Cnd_pre_alc_set_typ_nm = p.beansFactory.createTextField("Cnd.pre_alc_set_typ_nm");
		p.Cnd_no_exist_flg = p.beansFactory.createCheckBox("Cnd.no_exist_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_ym_fr_Label = p.beansFactory.createLabel("BulkSet.ym_fr_Label");
		p.BulkSet_ym_fr = p.beansFactory.createDateField("BulkSet.ym_fr");
		p.BulkSet_ym_fr.setLabel(p.BulkSet_ym_fr_Label);
		p.BulkSet_ym_to_Label = p.beansFactory.createLabel("BulkSet.ym_to_Label");
		p.BulkSet_ym_to = p.beansFactory.createDateField("BulkSet.ym_to");
		p.BulkSet_ym_to.setLabel(p.BulkSet_ym_to_Label);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_exist_flg = p.beansFactory.createTableColumn("Dtl.exist_flg", MCColumnType.CHECK);
		p.columnDtl_sa_typ = p.beansFactory.createTableColumn("Dtl.sa_typ", MCColumnType.TEXT);
		p.columnDtl_ym = p.beansFactory.createTableColumn("Dtl.ym", MCColumnType.DATE);
		p.columnDtl_ym_fr = p.beansFactory.createTableColumn("Dtl.ym_fr", MCColumnType.DATE);
		p.columnDtl_ym_to = p.beansFactory.createTableColumn("Dtl.ym_to", MCColumnType.DATE);
		p.columnDtl_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_pre_alc_rate_cd = p.beansFactory.createTableColumn("Dtl.pre_alc_rate_cd", MCColumnType.TEXT);
		p.columnDtl_pre_alc_rate_nm = p.beansFactory.createTableColumn("Dtl.pre_alc_rate_nm", MCColumnType.TEXT);
		p.columnDtl_pre_alc_set_typ = p.beansFactory.createTableColumn("Dtl.pre_alc_set_typ", MCColumnType.TEXT);
		p.columnDtl_pre_alc_set_typ_nm = p.beansFactory.createTableColumn("Dtl.pre_alc_set_typ_nm", MCColumnType.TEXT);
		p.columnDtl_pln_mly_flg = p.beansFactory.createTableColumn("Dtl.pln_mly_flg", MCColumnType.CHECK);
		p.columnDtl_act_mly_flg = p.beansFactory.createTableColumn("Dtl.act_mly_flg", MCColumnType.CHECK);
		p.columnDtl_pln_rule_flg = p.beansFactory.createTableColumn("Dtl.pln_rule_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0120 = p.beansFactory.createButton("Btn.open_MGBGP0120", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PLN);
		p.Cnd_ope_PLN.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_PLN);
		p.ScreenOpePanel.add(p.Cnd_ope_PLN);
		p.Cnd_ope_PLN.setNextBeans(p.Cnd_ope_ACT);
		p.Cnd_ope_ACT.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_ACT);
		p.ScreenOpePanel.add(p.Cnd_ope_ACT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.ope_META);
		p.CndPanel.add(p.Cnd_tgt_ym_fr_Label);
		p.CndPanel.add(p.Cnd_tgt_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_tgt_ym_fr);
		p.Cnd_tgt_ym_fr.setNextBeans(p.Cnd_tgt_ym_to);
		p.Cnd_tgt_ym_fr.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.tgt_ym_fr_META);
		p.Cnd_tgt_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_tgt_ym_to_Label);
		p.CndPanel.add(p.Cnd_tgt_ym_to);
		p.Cnd_tgt_ym_to.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_tgt_ym_to.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.tgt_ym_to_META);
		p.Cnd_tgt_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_pre_alc_rate_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_cd, true);
		p.Cnd_pre_alc_rate_cd.setLinkBeans(p.Cnd_pre_alc_rate_nm);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd);
		p.Cnd_pre_alc_rate_cd.setNextBeans(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.pre_alc_rate_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_nm.setNextBeans(p.Cnd_pre_alc_set_typ);
		p.Cnd_pre_alc_rate_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.pre_alc_rate_nm_META);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_nm, true);
		p.Cnd_pre_alc_set_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pre_alc_set_typ, true);
		p.Cnd_pre_alc_set_typ.setLinkBeans(p.Cnd_pre_alc_set_typ_nm);
		p.CndPanel.add(p.Cnd_pre_alc_set_typ_Label);
		p.CndPanel.add(p.Cnd_pre_alc_set_typ);
		p.Cnd_pre_alc_set_typ.setNextBeans(p.Cnd_pre_alc_set_typ_nm);
		p.Cnd_pre_alc_set_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.pre_alc_set_typ_META);
		p.CndPanel.add(p.Cnd_pre_alc_set_typ_nm);
		p.Cnd_pre_alc_set_typ_nm.setNextBeans(p.Cnd_no_exist_flg);
		p.Cnd_pre_alc_set_typ_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.pre_alc_set_typ_nm_META);
		p.CndPanel.add(p.Cnd_no_exist_flg);
		p.Cnd_no_exist_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0160.CndR.no_exist_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_ym_fr_Label);
		p.BulkSetPanel.add(p.BulkSet_ym_fr);
		p.BulkSetPanel.setLastBeans(p.BulkSet_ym_fr);
		p.BulkSet_ym_fr.setNextBeans(p.BulkSet_ym_to);
		p.BulkSet_ym_fr.setRow(p.getBulkSetR(), mcframe.clientMGBG.MGBGP0160.BulkSetR.ym_fr_META);
		p.BulkSet_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_ym_to_Label);
		p.BulkSetPanel.add(p.BulkSet_ym_to);
		p.BulkSet_ym_to.setRow(p.getBulkSetR(), mcframe.clientMGBG.MGBGP0160.BulkSetR.ym_to_META);
		p.BulkSet_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBGP_PreAlcRateReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBGP0120);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBGP0120);
		p.Btn_open_MGBGP0120.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MGBGP_PreAlcRateReg_MC.mcInitScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitTop((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitCnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitCtrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitBulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitDtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.mcInitBtn((MGBGP_PreAlcRateReg)this);

		// [SRCH]ステータスのモードの設定
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_ScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_Top((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_Cnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_Ctrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_BulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_Dtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitSRCH_Btn((MGBGP_PreAlcRateReg)this);

		// [UPD]ステータスのモードの設定
		MGBGP_PreAlcRateReg_MC.statusInitUPD_ScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_Top((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_Cnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_Ctrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_BulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_Dtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitUPD_Btn((MGBGP_PreAlcRateReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_ScreenOpe((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_Top((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_Cnd((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_Ctrl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_BulkSet((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_Dtl((MGBGP_PreAlcRateReg)this);
		MGBGP_PreAlcRateReg_MC.statusInitFIX__U_Btn((MGBGP_PreAlcRateReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBGP_PreAlcRateReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_PreAlcRateReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_PreAlcRateReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PLN.addAllListener(p);
		p.Cnd_ope_ACT.addAllListener(p);
		p.Cnd_tgt_ym_fr.setListListener(p);
		p.Cnd_tgt_ym_fr.addAllListener(p);
		p.Cnd_tgt_ym_to.setListListener(p);
		p.Cnd_tgt_ym_to.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_pre_alc_rate_cd.setListListener(p);
		p.Cnd_pre_alc_rate_cd.addAllListener(p);
		p.Cnd_pre_alc_rate_nm.setListListener(p);
		p.Cnd_pre_alc_rate_nm.addAllListener(p);
		p.Cnd_pre_alc_set_typ.setListListener(p);
		p.Cnd_pre_alc_set_typ.addAllListener(p);
		p.Cnd_pre_alc_set_typ_nm.setListListener(p);
		p.Cnd_pre_alc_set_typ_nm.addAllListener(p);
		p.Cnd_no_exist_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_PreAlcRateReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MGBGP_PreAlcRateReg p) {
		p.BulkSet_ym_fr.setListListener(p);
		p.BulkSet_ym_fr.addAllListener(p);
		p.BulkSet_ym_to.setListListener(p);
		p.BulkSet_ym_to.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBGP_PreAlcRateReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_exist_flg.addAllListener(p);
		p.columnDtl_sa_typ.addAllListener(p);
		p.columnDtl_sa_typ.setListListener(p);
		p.columnDtl_ym.addAllListener(p);
		p.columnDtl_ym.setListListener(p);
		p.columnDtl_ym_fr.addAllListener(p);
		p.columnDtl_ym_fr.setListListener(p);
		p.columnDtl_ym_to.addAllListener(p);
		p.columnDtl_ym_to.setListListener(p);
		p.columnDtl_calc_ctg_cd.addAllListener(p);
		p.columnDtl_calc_ctg_cd.setListListener(p);
		p.columnDtl_calc_ctg_nm.addAllListener(p);
		p.columnDtl_calc_ctg_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_pre_alc_rate_cd.addAllListener(p);
		p.columnDtl_pre_alc_rate_cd.setListListener(p);
		p.columnDtl_pre_alc_rate_nm.addAllListener(p);
		p.columnDtl_pre_alc_rate_nm.setListListener(p);
		p.columnDtl_pre_alc_set_typ.addAllListener(p);
		p.columnDtl_pre_alc_set_typ.setListListener(p);
		p.columnDtl_pre_alc_set_typ_nm.addAllListener(p);
		p.columnDtl_pre_alc_set_typ_nm.setListListener(p);
		p.columnDtl_pln_mly_flg.addAllListener(p);
		p.columnDtl_act_mly_flg.addAllListener(p);
		p.columnDtl_pln_rule_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBGP_PreAlcRateReg p) {
		p.Btn_open_MGBGP0120.addAllListener(p);
		p.Btn_open_MGBGP0120.setAPMethodName("doBtn_open_MGBGP0120");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBGP_PreAlcRateReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_tgt_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_tgt_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_no_exist_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBGP_PreAlcRateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MGBGP_PreAlcRateReg p){
		p.BulkSet_ym_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_ym_to.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBGP_PreAlcRateReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_exist_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sa_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ym_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ym_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pln_mly_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_mly_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pln_rule_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBGP_PreAlcRateReg p){
		p.Btn_open_MGBGP0120.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBGP_PreAlcRateReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tgt_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tgt_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_no_exist_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBGP_PreAlcRateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MGBGP_PreAlcRateReg p){
		p.BulkSet_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_ym_to.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MGBGP_PreAlcRateReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_exist_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sa_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pln_mly_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_mly_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pln_rule_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBGP_PreAlcRateReg p){
		p.Btn_open_MGBGP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBGP_PreAlcRateReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBGP_PreAlcRateReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_tgt_ym_fr.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_tgt_ym_to.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pre_alc_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_no_exist_flg.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBGP_PreAlcRateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MGBGP_PreAlcRateReg p){
		p.BulkSet_ym_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_ym_to.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MGBGP_PreAlcRateReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_exist_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sa_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ym_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ym_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_rate_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pln_mly_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_mly_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pln_rule_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBGP_PreAlcRateReg p){
		p.Btn_open_MGBGP0120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBGP_PreAlcRateReg_MC.setTableConfigDtl((MGBGP_PreAlcRateReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBGP_PreAlcRateReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_exist_flg.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.exist_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_exist_flg);
		p.columnDtl_sa_typ.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.sa_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sa_typ);
		p.columnDtl_ym.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.ym_META);
		p.columnDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ym);
		p.columnDtl_ym_fr.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.ym_fr_META);
		p.columnDtl_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ym_fr);
		p.columnDtl_ym_to.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.ym_to_META);
		p.columnDtl_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ym_to);
		p.columnDtl_calc_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_cd);
		p.columnDtl_calc_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_pre_alc_rate_cd.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pre_alc_rate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_rate_cd);
		p.columnDtl_pre_alc_rate_nm.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pre_alc_rate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_rate_nm);
		p.columnDtl_pre_alc_set_typ.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pre_alc_set_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_set_typ);
		p.columnDtl_pre_alc_set_typ_nm.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pre_alc_set_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_set_typ_nm);
		p.columnDtl_pln_mly_flg.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pln_mly_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pln_mly_flg);
		p.columnDtl_act_mly_flg.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.act_mly_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_mly_flg);
		p.columnDtl_pln_rule_flg.setMeta(mcframe.clientMGBG.MGBGP0160.DtlR.pln_rule_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pln_rule_flg);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_rate_cd.getListConfig().setPutter(getCnd_pre_alc_rate_cd_ListPutter());
		Cnd_pre_alc_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_set_typ.getListConfig().setPutter(getCnd_pre_alc_set_typ_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
	}

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_pre_alc_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcSetTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_pre_alc_rate_cd) return getCnd_pre_alc_rate_cd(row, info);
		if(combo == Cnd_pre_alc_set_typ) return getCnd_pre_alc_set_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_open_MGBGP0120) doBtn_open_MGBGP0120(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBGP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBGP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_tgt_ym_fr) return doCnd_tgt_ym_fr_VC(info);
		if (vc == Cnd_tgt_ym_to) return doCnd_tgt_ym_to_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_pre_alc_rate_cd) return doCnd_pre_alc_rate_cd_VC(info);
		if (vc == Cnd_pre_alc_rate_nm) return doCnd_pre_alc_rate_nm_VC(info);
		if (vc == Cnd_pre_alc_set_typ) return doCnd_pre_alc_set_typ_VC(info);
		if (vc == Cnd_pre_alc_set_typ_nm) return doCnd_pre_alc_set_typ_nm_VC(info);
		if (vc == Cnd_no_exist_flg) return doCnd_no_exist_flg_VC(info);
		if (vc == BulkSet_ym_fr) return doBulkSet_ym_fr_VC(info);
		if (vc == BulkSet_ym_to) return doBulkSet_ym_to_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_exist_flg) return doDtl_exist_flg_VC(info);
		if (vc == columnDtl_sa_typ) return doDtl_sa_typ_VC(info);
		if (vc == columnDtl_ym) return doDtl_ym_VC(info);
		if (vc == columnDtl_ym_fr) return doDtl_ym_fr_VC(info);
		if (vc == columnDtl_ym_to) return doDtl_ym_to_VC(info);
		if (vc == columnDtl_calc_ctg_cd) return doDtl_calc_ctg_cd_VC(info);
		if (vc == columnDtl_calc_ctg_nm) return doDtl_calc_ctg_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_pre_alc_rate_cd) return doDtl_pre_alc_rate_cd_VC(info);
		if (vc == columnDtl_pre_alc_rate_nm) return doDtl_pre_alc_rate_nm_VC(info);
		if (vc == columnDtl_pre_alc_set_typ) return doDtl_pre_alc_set_typ_VC(info);
		if (vc == columnDtl_pre_alc_set_typ_nm) return doDtl_pre_alc_set_typ_nm_VC(info);
		if (vc == columnDtl_pln_mly_flg) return doDtl_pln_mly_flg_VC(info);
		if (vc == columnDtl_act_mly_flg) return doDtl_act_mly_flg_VC(info);
		if (vc == columnDtl_pln_rule_flg) return doDtl_pln_rule_flg_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[tgt_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tgt_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_exist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sa_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sa_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pln_mly_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pln_mly_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_mly_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_mly_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pln_rule_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pln_rule_flg_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_tgt_ym_fr) doCnd_tgt_ym_fr_NC(info);
		else if (nc == Cnd_tgt_ym_to) doCnd_tgt_ym_to_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NC(info);
		else if (nc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NC(info);
		else if (nc == Cnd_pre_alc_set_typ) doCnd_pre_alc_set_typ_NC(info);
		else if (nc == Cnd_pre_alc_set_typ_nm) doCnd_pre_alc_set_typ_nm_NC(info);
		else if (nc == Cnd_no_exist_flg) doCnd_no_exist_flg_NC(info);
		else if (nc == BulkSet_ym_fr) doBulkSet_ym_fr_NC(info);
		else if (nc == BulkSet_ym_to) doBulkSet_ym_to_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_exist_flg) doDtl_exist_flg_NC(info);
		else if (nc == columnDtl_sa_typ) doDtl_sa_typ_NC(info);
		else if (nc == columnDtl_ym) doDtl_ym_NC(info);
		else if (nc == columnDtl_ym_fr) doDtl_ym_fr_NC(info);
		else if (nc == columnDtl_ym_to) doDtl_ym_to_NC(info);
		else if (nc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_pre_alc_rate_cd) doDtl_pre_alc_rate_cd_NC(info);
		else if (nc == columnDtl_pre_alc_rate_nm) doDtl_pre_alc_rate_nm_NC(info);
		else if (nc == columnDtl_pre_alc_set_typ) doDtl_pre_alc_set_typ_NC(info);
		else if (nc == columnDtl_pre_alc_set_typ_nm) doDtl_pre_alc_set_typ_nm_NC(info);
		else if (nc == columnDtl_pln_mly_flg) doDtl_pln_mly_flg_NC(info);
		else if (nc == columnDtl_act_mly_flg) doDtl_act_mly_flg_NC(info);
		else if (nc == columnDtl_pln_rule_flg) doDtl_pln_rule_flg_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sa_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sa_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_mly_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_mly_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_mly_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_mly_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_rule_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_rule_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_tgt_ym_fr) doCnd_tgt_ym_fr_NE(info);
		else if (ne == Cnd_tgt_ym_to) doCnd_tgt_ym_to_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NE(info);
		else if (ne == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NE(info);
		else if (ne == Cnd_pre_alc_set_typ) doCnd_pre_alc_set_typ_NE(info);
		else if (ne == Cnd_pre_alc_set_typ_nm) doCnd_pre_alc_set_typ_nm_NE(info);
		else if (ne == Cnd_no_exist_flg) doCnd_no_exist_flg_NE(info);
		else if (ne == BulkSet_ym_fr) doBulkSet_ym_fr_NE(info);
		else if (ne == BulkSet_ym_to) doBulkSet_ym_to_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_exist_flg) doDtl_exist_flg_NE(info);
		else if (ne == columnDtl_sa_typ) doDtl_sa_typ_NE(info);
		else if (ne == columnDtl_ym) doDtl_ym_NE(info);
		else if (ne == columnDtl_ym_fr) doDtl_ym_fr_NE(info);
		else if (ne == columnDtl_ym_to) doDtl_ym_to_NE(info);
		else if (ne == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_pre_alc_rate_cd) doDtl_pre_alc_rate_cd_NE(info);
		else if (ne == columnDtl_pre_alc_rate_nm) doDtl_pre_alc_rate_nm_NE(info);
		else if (ne == columnDtl_pre_alc_set_typ) doDtl_pre_alc_set_typ_NE(info);
		else if (ne == columnDtl_pre_alc_set_typ_nm) doDtl_pre_alc_set_typ_nm_NE(info);
		else if (ne == columnDtl_pln_mly_flg) doDtl_pln_mly_flg_NE(info);
		else if (ne == columnDtl_act_mly_flg) doDtl_act_mly_flg_NE(info);
		else if (ne == columnDtl_pln_rule_flg) doDtl_pln_rule_flg_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sa_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sa_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_mly_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_mly_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_mly_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_mly_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_rule_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_rule_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_tgt_ym_fr) doCnd_tgt_ym_fr_NX(info);
		else if (nx == Cnd_tgt_ym_to) doCnd_tgt_ym_to_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NX(info);
		else if (nx == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NX(info);
		else if (nx == Cnd_pre_alc_set_typ) doCnd_pre_alc_set_typ_NX(info);
		else if (nx == Cnd_pre_alc_set_typ_nm) doCnd_pre_alc_set_typ_nm_NX(info);
		else if (nx == Cnd_no_exist_flg) doCnd_no_exist_flg_NX(info);
		else if (nx == BulkSet_ym_fr) doBulkSet_ym_fr_NX(info);
		else if (nx == BulkSet_ym_to) doBulkSet_ym_to_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_exist_flg) doDtl_exist_flg_NX(info);
		else if (nx == columnDtl_sa_typ) doDtl_sa_typ_NX(info);
		else if (nx == columnDtl_ym) doDtl_ym_NX(info);
		else if (nx == columnDtl_ym_fr) doDtl_ym_fr_NX(info);
		else if (nx == columnDtl_ym_to) doDtl_ym_to_NX(info);
		else if (nx == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_pre_alc_rate_cd) doDtl_pre_alc_rate_cd_NX(info);
		else if (nx == columnDtl_pre_alc_rate_nm) doDtl_pre_alc_rate_nm_NX(info);
		else if (nx == columnDtl_pre_alc_set_typ) doDtl_pre_alc_set_typ_NX(info);
		else if (nx == columnDtl_pre_alc_set_typ_nm) doDtl_pre_alc_set_typ_nm_NX(info);
		else if (nx == columnDtl_pln_mly_flg) doDtl_pln_mly_flg_NX(info);
		else if (nx == columnDtl_act_mly_flg) doDtl_act_mly_flg_NX(info);
		else if (nx == columnDtl_pln_rule_flg) doDtl_pln_rule_flg_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sa_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sa_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_mly_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_mly_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_mly_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_mly_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pln_rule_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pln_rule_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_tgt_ym_fr) doCnd_tgt_ym_fr_LC(info);
		else if (lc == Cnd_tgt_ym_to) doCnd_tgt_ym_to_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_LC(info);
		else if (lc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_LC(info);
		else if (lc == Cnd_pre_alc_set_typ) doCnd_pre_alc_set_typ_LC(info);
		else if (lc == Cnd_pre_alc_set_typ_nm) doCnd_pre_alc_set_typ_nm_LC(info);
		else if (lc == BulkSet_ym_fr) doBulkSet_ym_fr_LC(info);
		else if (lc == BulkSet_ym_to) doBulkSet_ym_to_LC(info);
		else if (lc == columnDtl_sa_typ) doDtl_sa_typ_LC(info);
		else if (lc == columnDtl_ym) doDtl_ym_LC(info);
		else if (lc == columnDtl_ym_fr) doDtl_ym_fr_LC(info);
		else if (lc == columnDtl_ym_to) doDtl_ym_to_LC(info);
		else if (lc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_pre_alc_rate_cd) doDtl_pre_alc_rate_cd_LC(info);
		else if (lc == columnDtl_pre_alc_rate_nm) doDtl_pre_alc_rate_nm_LC(info);
		else if (lc == columnDtl_pre_alc_set_typ) doDtl_pre_alc_set_typ_LC(info);
		else if (lc == columnDtl_pre_alc_set_typ_nm) doDtl_pre_alc_set_typ_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[tgt_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sa_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sa_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_set_typ]の作成メソッド
	 */
	public MCList getCnd_pre_alc_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcSetTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0160.Srch01")) {
			return new MG_MGBGL0160_Srch01Bridge();
		}
		if (id.equals("MG.MGBGL0160.Ins01")) {
			return new MG_MGBGL0160_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0160_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0160_Srch01Bridge() {
			p_MG_MGBGL0160_Srch01 = new MCParam(PDef.MG_MGBGL0160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0160.DtlR.class));

			p_MG_MGBGL0160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0160.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0160.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0160.DtlR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0160.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0160_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0160.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0160_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBG.MGBGP0160.DtlR>)p_MG_MGBGL0160_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBGL0160_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0160_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0160_Ins01;

		/** コンストラクタ */
		protected MG_MGBGL0160_Ins01Bridge() {
			p_MG_MGBGL0160_Ins01 = new MCParam(PDef.MG_MGBGL0160_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0160_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0160.DtlR.class));
			// Down

			p_MG_MGBGL0160_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0160_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0160_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0160_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0160_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0160.DtlR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0160.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0160_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}