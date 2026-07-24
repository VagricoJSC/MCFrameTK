package mcframe.clientMGBB.MGBBP0010;

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
import mcframe.clientMGBB.MGBBP0010.MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch01Caller;
import mcframe.clientMGBB.MGBBP0010.MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch02Caller;
import mcframe.clientMGBB.MGBBP0010.MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Ins01Caller;

/**
 * 画面"MGBBP_InsScm2MgtIf"パネルクラスです。<p>
 *
 * 原価ＩＦデータを取り込みます。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_InsScm2MgtIf_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
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
	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public MCCheckBox Cnd_rerun = null;
	/**
	 * Non-moving inventory calculation 滞留在庫計算.<p>
	 *
	 */
	public MCCheckBox Cnd_non_mov = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBB.MGBBP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	public MCColumnConfig columnRslt_ct_data_typ = null;
	/**
	 * Data types データ種類.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ct_data_typ_nm = null;
	/**
	 * Last update date and time 最終更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_upd_dt = null;
	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_no_imp_cnt = null;
	public MCColumnConfig columnRslt_if_dtl_typ = null;
	/**
	 * IF data details ＩＦデータ詳細.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_dtl_typ_nm = null;
	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_last_upd_dt = null;
	public MCColumnConfig columnRslt_list_sort = null;
	public MCColumnConfig columnRslt_is_enable = null;
	public MCColumnConfig columnRslt_is_visible = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * IF data ＩＦデータ.<p>
	 *
	 */
	public MCButton Btn_open_g = null;
	/**
	 * Check 確認する.<p>
	 *
	 */
	public MCButton Btn_srch = null;
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
	public MCButton Btn_ins = null;
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS};
	
	/** [MG_MGBBL0010_Srch01]のCallerの作成 */
	protected MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch01Caller createMG_MGBBL0010_Srch01() {
		MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch01Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Srch01Bridge>
		caller = ((MGBBP_InsScm2MgtIf_MC)this).new MG_MGBBL0010_Srch01Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Srch01Bridge>(
					(MGBBP_InsScm2MgtIf)this, new MG_MGBBL0010_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0010_Srch01]の呼び出し */
	protected void callMG_MGBBL0010_Srch01() {
		MCCaller caller = createMG_MGBBL0010_Srch01();
		caller.exec();
	}
	/** [MG_MGBBL0010_Srch02]のCallerの作成 */
	protected MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch02Caller createMG_MGBBL0010_Srch02() {
		MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Srch02Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Srch02Bridge>
		caller = ((MGBBP_InsScm2MgtIf_MC)this).new MG_MGBBL0010_Srch02Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Srch02Bridge>(
					(MGBBP_InsScm2MgtIf)this, new MG_MGBBL0010_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBBL0010_Srch02]の呼び出し */
	protected void callMG_MGBBL0010_Srch02() {
		MCCaller caller = createMG_MGBBL0010_Srch02();
		caller.exec();
	}
	/** [MG_MGBBL0010_Ins01]のCallerの作成 */
	protected MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Ins01Caller createMG_MGBBL0010_Ins01() {
		MGBBP_InsScm2MgtIf_MC.MG_MGBBL0010_Ins01Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Ins01Bridge>
		caller = ((MGBBP_InsScm2MgtIf_MC)this).new MG_MGBBL0010_Ins01Caller<MGBBP_InsScm2MgtIf, MG_MGBBL0010_Ins01Bridge>(
					(MGBBP_InsScm2MgtIf)this, new MG_MGBBL0010_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBBL0010_Ins01]の呼び出し */
	protected void callMG_MGBBL0010_Ins01() {
		MCCaller caller = createMG_MGBBL0010_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0010.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0010.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0010.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InsScm2MgtIf_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_InsScm2MgtIf_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_InsScm2MgtIf_MC.jbCreateCnd((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbCreateRslt((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbCreateBtn((MGBBP_InsScm2MgtIf)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_InsScm2MgtIf p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_InsScm2MgtIf p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_InsScm2MgtIf p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_InsScm2MgtIf create(){
		MGBBP_InsScm2MgtIf p = new MGBBP_InsScm2MgtIf();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_InsScm2MgtIf create(String name){
		MGBBP_InsScm2MgtIf p = new MGBBP_InsScm2MgtIf(name);
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
		MGBBP_InsScm2MgtIf_MC.jbfInitCnd((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbfInitRslt((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbfInitBtn((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbInitCnd((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbInitRslt((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.jbInitBtn((MGBBP_InsScm2MgtIf)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_rerun = p.beansFactory.createCheckBox("Cnd.rerun");
		p.Cnd_non_mov = p.beansFactory.createCheckBox("Cnd.non_mov");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_ct_data_typ = p.beansFactory.createTableColumn("Rslt.ct_data_typ", MCColumnType.TEXT);
		p.columnRslt_ct_data_typ_nm = p.beansFactory.createTableColumn("Rslt.ct_data_typ_nm", MCColumnType.TEXT);
		p.columnRslt_last_upd_dt = p.beansFactory.createTableColumn("Rslt.last_upd_dt", MCColumnType.TIMESTAMP);
		p.columnRslt_no_imp_cnt = p.beansFactory.createTableColumn("Rslt.no_imp_cnt", MCColumnType.NUMBER);
		p.columnRslt_if_dtl_typ = p.beansFactory.createTableColumn("Rslt.if_dtl_typ", MCColumnType.TEXT);
		p.columnRslt_if_dtl_typ_nm = p.beansFactory.createTableColumn("Rslt.if_dtl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_if_last_upd_dt = p.beansFactory.createTableColumn("Rslt.if_last_upd_dt", MCColumnType.TIMESTAMP);
		p.columnRslt_list_sort = p.beansFactory.createTableColumn("Rslt.list_sort", MCColumnType.NUMBER);
		p.columnRslt_is_enable = p.beansFactory.createTableColumn("Rslt.is_enable", MCColumnType.CHECK);
		p.columnRslt_is_visible = p.beansFactory.createTableColumn("Rslt.is_visible", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_g = p.beansFactory.createButton("Btn.open_g", "open");
		p.Btn_srch = p.beansFactory.createButton("Btn.srch");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.CndPanel.setLastBeans(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0010.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0010.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_rerun);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0010.CndR.calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_rerun);
		p.Cnd_rerun.setNextBeans(p.Cnd_non_mov);
		p.Cnd_rerun.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0010.CndR.rerun_META);
		p.CndPanel.add(p.Cnd_non_mov);
		p.Cnd_non_mov.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0010.CndR.non_mov_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBBP_InsScm2MgtIf p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_g.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_g);
		p.BtnPanel.setLastBeans(p.Btn_open_g);
		p.Btn_open_g.setNextBeans(p.Btn_srch);
		p.Btn_srch.setFunctionKey(MCFunctionKey.F1);
		p.BtnPanel.add(p.Btn_srch);
		p.Btn_srch.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
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
		MGBBP_InsScm2MgtIf_MC.mcInitCnd((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.mcInitRslt((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.mcInitBtn((MGBBP_InsScm2MgtIf)this);

		// [INS]ステータスのモードの設定
		MGBBP_InsScm2MgtIf_MC.statusInitINS_Cnd((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.statusInitINS_Rslt((MGBBP_InsScm2MgtIf)this);
		MGBBP_InsScm2MgtIf_MC.statusInitINS_Btn((MGBBP_InsScm2MgtIf)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_InsScm2MgtIf p) {
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_rerun.addAllListener(p);
		p.Cnd_non_mov.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_InsScm2MgtIf p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_ct_data_typ.addAllListener(p);
		p.columnRslt_ct_data_typ.setListListener(p);
		p.columnRslt_ct_data_typ_nm.addAllListener(p);
		p.columnRslt_ct_data_typ_nm.setListListener(p);
		p.columnRslt_last_upd_dt.addAllListener(p);
		p.columnRslt_last_upd_dt.setListListener(p);
		p.columnRslt_no_imp_cnt.addAllListener(p);
		p.columnRslt_no_imp_cnt.setListListener(p);
		p.columnRslt_if_dtl_typ.addAllListener(p);
		p.columnRslt_if_dtl_typ.setListListener(p);
		p.columnRslt_if_dtl_typ_nm.addAllListener(p);
		p.columnRslt_if_dtl_typ_nm.setListListener(p);
		p.columnRslt_if_last_upd_dt.addAllListener(p);
		p.columnRslt_if_last_upd_dt.setListListener(p);
		p.columnRslt_list_sort.addAllListener(p);
		p.columnRslt_list_sort.setListListener(p);
		p.columnRslt_is_enable.addAllListener(p);
		p.columnRslt_is_visible.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_InsScm2MgtIf p) {
		p.Btn_open_g.addAllListener(p);
		p.Btn_open_g.setAPMethodName("doBtn_open_g");
		p.Btn_srch.addAllListener(p);
		p.Btn_srch.setAPMethodName("doBtn_srch");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBBP_InsScm2MgtIf p){
		p.Cnd_ym.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rerun.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_non_mov.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBBP_InsScm2MgtIf p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_ct_data_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ct_data_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_last_upd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_no_imp_cnt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_if_dtl_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_if_dtl_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_if_last_upd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_list_sort.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_is_enable.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_is_visible.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBBP_InsScm2MgtIf p){
		p.Btn_open_g.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);

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
		MGBBP_InsScm2MgtIf_MC.setTableConfigRslt((MGBBP_InsScm2MgtIf)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_InsScm2MgtIf p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_ct_data_typ.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.ct_data_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ct_data_typ);
		p.columnRslt_ct_data_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.ct_data_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ct_data_typ_nm);
		p.columnRslt_last_upd_dt.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.last_upd_dt_META);
		p.columnRslt_last_upd_dt.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_last_upd_dt);
		p.columnRslt_no_imp_cnt.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.no_imp_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_no_imp_cnt);
		p.columnRslt_if_dtl_typ.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.if_dtl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_if_dtl_typ);
		p.columnRslt_if_dtl_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.if_dtl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_if_dtl_typ_nm);
		p.columnRslt_if_last_upd_dt.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.if_last_upd_dt_META);
		p.columnRslt_if_last_upd_dt.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_if_last_upd_dt);
		p.columnRslt_list_sort.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.list_sort_META);
		p.RsltTable.addColumnConfig(p.columnRslt_list_sort);
		p.columnRslt_is_enable.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.is_enable_META);
		p.RsltTable.addColumnConfig(p.columnRslt_is_enable);
		p.columnRslt_is_visible.setMeta(mcframe.clientMGBB.MGBBP0010.RsltR.is_visible_META);
		p.RsltTable.addColumnConfig(p.columnRslt_is_visible);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_open_g) doBtn_open_g(info);
		else if (ap == Btn_srch) doBtn_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins) doBtn_ins(info);
	}

	/**
	 * [Btn]パネルの[open_g]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_g(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_rerun) return doCnd_rerun_VC(info);
		if (vc == Cnd_non_mov) return doCnd_non_mov_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_ct_data_typ) return doRslt_ct_data_typ_VC(info);
		if (vc == columnRslt_ct_data_typ_nm) return doRslt_ct_data_typ_nm_VC(info);
		if (vc == columnRslt_last_upd_dt) return doRslt_last_upd_dt_VC(info);
		if (vc == columnRslt_no_imp_cnt) return doRslt_no_imp_cnt_VC(info);
		if (vc == columnRslt_if_dtl_typ) return doRslt_if_dtl_typ_VC(info);
		if (vc == columnRslt_if_dtl_typ_nm) return doRslt_if_dtl_typ_nm_VC(info);
		if (vc == columnRslt_if_last_upd_dt) return doRslt_if_last_upd_dt_VC(info);
		if (vc == columnRslt_list_sort) return doRslt_list_sort_VC(info);
		if (vc == columnRslt_is_enable) return doRslt_is_enable_VC(info);
		if (vc == columnRslt_is_visible) return doRslt_is_visible_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rerun]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rerun_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_mov]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_mov_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ct_data_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ct_data_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ct_data_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ct_data_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_upd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[no_imp_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_no_imp_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_dtl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_dtl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_last_upd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[list_sort]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_list_sort_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[is_enable]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_is_enable_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[is_visible]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_is_visible_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_rerun) doCnd_rerun_NC(info);
		else if (nc == Cnd_non_mov) doCnd_non_mov_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_ct_data_typ) doRslt_ct_data_typ_NC(info);
		else if (nc == columnRslt_ct_data_typ_nm) doRslt_ct_data_typ_nm_NC(info);
		else if (nc == columnRslt_last_upd_dt) doRslt_last_upd_dt_NC(info);
		else if (nc == columnRslt_no_imp_cnt) doRslt_no_imp_cnt_NC(info);
		else if (nc == columnRslt_if_dtl_typ) doRslt_if_dtl_typ_NC(info);
		else if (nc == columnRslt_if_dtl_typ_nm) doRslt_if_dtl_typ_nm_NC(info);
		else if (nc == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NC(info);
		else if (nc == columnRslt_list_sort) doRslt_list_sort_NC(info);
		else if (nc == columnRslt_is_enable) doRslt_is_enable_NC(info);
		else if (nc == columnRslt_is_visible) doRslt_is_visible_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rerun]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_mov]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_imp_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_imp_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[list_sort]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_sort_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_enable]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_enable_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_visible]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_visible_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_rerun) doCnd_rerun_NE(info);
		else if (ne == Cnd_non_mov) doCnd_non_mov_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_ct_data_typ) doRslt_ct_data_typ_NE(info);
		else if (ne == columnRslt_ct_data_typ_nm) doRslt_ct_data_typ_nm_NE(info);
		else if (ne == columnRslt_last_upd_dt) doRslt_last_upd_dt_NE(info);
		else if (ne == columnRslt_no_imp_cnt) doRslt_no_imp_cnt_NE(info);
		else if (ne == columnRslt_if_dtl_typ) doRslt_if_dtl_typ_NE(info);
		else if (ne == columnRslt_if_dtl_typ_nm) doRslt_if_dtl_typ_nm_NE(info);
		else if (ne == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NE(info);
		else if (ne == columnRslt_list_sort) doRslt_list_sort_NE(info);
		else if (ne == columnRslt_is_enable) doRslt_is_enable_NE(info);
		else if (ne == columnRslt_is_visible) doRslt_is_visible_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rerun]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_mov]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_imp_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_imp_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[list_sort]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_sort_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_enable]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_enable_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_visible]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_visible_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_rerun) doCnd_rerun_NX(info);
		else if (nx == Cnd_non_mov) doCnd_non_mov_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_ct_data_typ) doRslt_ct_data_typ_NX(info);
		else if (nx == columnRslt_ct_data_typ_nm) doRslt_ct_data_typ_nm_NX(info);
		else if (nx == columnRslt_last_upd_dt) doRslt_last_upd_dt_NX(info);
		else if (nx == columnRslt_no_imp_cnt) doRslt_no_imp_cnt_NX(info);
		else if (nx == columnRslt_if_dtl_typ) doRslt_if_dtl_typ_NX(info);
		else if (nx == columnRslt_if_dtl_typ_nm) doRslt_if_dtl_typ_nm_NX(info);
		else if (nx == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NX(info);
		else if (nx == columnRslt_list_sort) doRslt_list_sort_NX(info);
		else if (nx == columnRslt_is_enable) doRslt_is_enable_NX(info);
		else if (nx == columnRslt_is_visible) doRslt_is_visible_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rerun]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_mov]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_imp_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_imp_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[list_sort]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_sort_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_enable]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_enable_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[is_visible]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_is_visible_NX(MCEventInfo info){
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
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_ct_data_typ) doRslt_ct_data_typ_LC(info);
		else if (lc == columnRslt_ct_data_typ_nm) doRslt_ct_data_typ_nm_LC(info);
		else if (lc == columnRslt_last_upd_dt) doRslt_last_upd_dt_LC(info);
		else if (lc == columnRslt_no_imp_cnt) doRslt_no_imp_cnt_LC(info);
		else if (lc == columnRslt_if_dtl_typ) doRslt_if_dtl_typ_LC(info);
		else if (lc == columnRslt_if_dtl_typ_nm) doRslt_if_dtl_typ_nm_LC(info);
		else if (lc == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_LC(info);
		else if (lc == columnRslt_list_sort) doRslt_list_sort_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ct_data_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ct_data_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ct_data_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_imp_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_imp_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_dtl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_dtl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[list_sort]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_sort_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0010.Srch01")) {
			return new MG_MGBBL0010_Srch01Bridge();
		}
		if (id.equals("MG.MGBBL0010.Srch02")) {
			return new MG_MGBBL0010_Srch02Bridge();
		}
		if (id.equals("MG.MGBBL0010.Ins01")) {
			return new MG_MGBBL0010_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0010_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0010_Srch01Bridge() {
			p_MG_MGBBL0010_Srch01 = new MCParam(PDef.MG_MGBBL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0010.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0010.RsltR.class));

			p_MG_MGBBL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0010_Srch01.addUpBlock(getCndR());
			p_MG_MGBBL0010_Srch01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0010.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0010.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0010.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0010.RsltR>)up(1);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0010.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0010.RsltR>)p_MG_MGBBL0010_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0010_Srch02;

		/** コンストラクタ */
		protected MG_MGBBL0010_Srch02Bridge() {
			p_MG_MGBBL0010_Srch02 = new MCParam(PDef.MG_MGBBL0010_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0010_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			// Down
			param.addDownBlock(mcframe.clientMGBB.MGBBP0010.CndR.create());

			p_MG_MGBBL0010_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0010_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0010_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0010_Srch02.getContainerParam().getDownBlock(i);
		}
		

		protected mcframe.clientMGBB.MGBBP0010.CndR down0() {
			return (mcframe.clientMGBB.MGBBP0010.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0010_Srch02.addDownBlock(mcframe.clientMGBB.MGBBP0010.CndR.create());
		}
		protected MCParam param() {
			return p_MG_MGBBL0010_Srch02;
		}

		protected void show() {
			setCndR((mcframe.clientMGBB.MGBBP0010.CndR)p_MG_MGBBL0010_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0010_Ins01;

		/** コンストラクタ */
		protected MG_MGBBL0010_Ins01Bridge() {
			p_MG_MGBBL0010_Ins01 = new MCParam(PDef.MG_MGBBL0010_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0010_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0010.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0010.RsltR.class));
			// Down

			p_MG_MGBBL0010_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0010_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0010_Ins01.addUpBlock(getCndR());
			p_MG_MGBBL0010_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0010_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0010_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0010.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0010.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0010.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0010.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0010_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}