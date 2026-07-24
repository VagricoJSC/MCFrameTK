package mcframe.clientMGBB.MGBBP0020;

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
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch01Caller;
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch02Caller;
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins01Caller;
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins02Caller;
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins03Caller;
import mcframe.clientMGBB.MGBBP0020.MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Del01Caller;

/**
 * 画面"MGBBP_InsMgtIf2Mgt"パネルクラスです。<p>
 *
 * 原価実績データを作成する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_InsMgtIf2Mgt_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBBP0020";

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
	 * INS,Create data,1;LUMP_INS,Create data in bulk,2;LUMP_RERUN_INS,Create data in bulk (Re-import),3;DEL,Delete data,4 INS,データを作成する,1;LUMP_INS,一括でデータを作成する,2;LUMP_RERUN_INS,一括でデータを作成する（再取込）,3;DEL,データを削除する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_LUMP_INS = null;
	public MCRadioButton Cnd_ope_LUMP_RERUN_INS = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
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
	 * Non-moving inventory calculation 滞留在庫計算.<p>
	 *
	 */
	public MCCheckBox Cnd_non_mov_flg = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBB.MGBBP0020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * IF data classification type ＩＦデータ種類区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_data_typ = null;
	/**
	 * IF data classification type name ＩＦデータ種類区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_data_typ_nm = null;
	/**
	 * Cost result classification type 原価実績種類区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_act_typ = null;
	/**
	 * Cost result classification type name 原価実績種類区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_act_typ_nm = null;
	/**
	 * Cost result classification sort order 原価実績種類ソート順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_list_sort = null;
	/**
	 * Selectable 選択可能.<p>
	 *
	 */
	public MCColumnConfig columnRslt_is_enable = null;
	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_last_upd_dt = null;
	/**
	 * Last update date and time (Result data) 原価実績データ最終更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_upd_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * IF data ＩＦデータ.<p>
	 *
	 */
	public MCButton Btn_open_act_if = null;
	/**
	 * Cost result 原価実績.<p>
	 *
	 */
	public MCButton Btn_open_act = null;
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
	 * Create data データを作成する.<p>
	 *
	 */
	public MCButton Btn_ins1 = null;
	/**
	 * Create data in bulk 一括でデータを作成する.<p>
	 *
	 */
	public MCButton Btn_ins2 = null;
	/**
	 * Create data in bulk (re-import) 一括でデータを作成する（再取込）.<p>
	 *
	 */
	public MCButton Btn_ins3 = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [LUMP_INS]モードを表す定数 */
	public static final String LUMP_INS = "LUMP_INS";
	/** [LUMP_RERUN_INS]モードを表す定数 */
	public static final String LUMP_RERUN_INS = "LUMP_RERUN_INS";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, LUMP_INS, LUMP_RERUN_INS, DEL};
	
	/** [MG_MGBBL0020_Srch01]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch01Caller createMG_MGBBL0020_Srch01() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Srch01Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Srch01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Srch01Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Srch01]の呼び出し */
	protected void callMG_MGBBL0020_Srch01() {
		MCCaller caller = createMG_MGBBL0020_Srch01();
		caller.exec();
	}
	/** [MG_MGBBL0020_Srch02]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch02Caller createMG_MGBBL0020_Srch02() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Srch02Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Srch02Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Srch02Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Srch02Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Srch02]の呼び出し */
	protected void callMG_MGBBL0020_Srch02() {
		MCCaller caller = createMG_MGBBL0020_Srch02();
		caller.exec();
	}
	/** [MG_MGBBL0020_Ins01]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins01Caller createMG_MGBBL0020_Ins01() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins01Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Ins01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins01Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Ins01]の呼び出し */
	protected void callMG_MGBBL0020_Ins01() {
		MCCaller caller = createMG_MGBBL0020_Ins01();
		caller.exec();
	}
	/** [MG_MGBBL0020_Ins02]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins02Caller createMG_MGBBL0020_Ins02() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins02Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins02Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Ins02Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins02Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Ins02]の呼び出し */
	protected void callMG_MGBBL0020_Ins02() {
		MCCaller caller = createMG_MGBBL0020_Ins02();
		caller.exec();
	}
	/** [MG_MGBBL0020_Ins03]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins03Caller createMG_MGBBL0020_Ins03() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Ins03Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins03Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Ins03Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Ins03Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Ins03Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Ins03]の呼び出し */
	protected void callMG_MGBBL0020_Ins03() {
		MCCaller caller = createMG_MGBBL0020_Ins03();
		caller.exec();
	}
	/** [MG_MGBBL0020_Del01]のCallerの作成 */
	protected MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Del01Caller createMG_MGBBL0020_Del01() {
		MGBBP_InsMgtIf2Mgt_MC.MG_MGBBL0020_Del01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Del01Bridge>
		caller = ((MGBBP_InsMgtIf2Mgt_MC)this).new MG_MGBBL0020_Del01Caller<MGBBP_InsMgtIf2Mgt, MG_MGBBL0020_Del01Bridge>(
					(MGBBP_InsMgtIf2Mgt)this, new MG_MGBBL0020_Del01Bridge());
		return caller;
	}
	/** [MG_MGBBL0020_Del01]の呼び出し */
	protected void callMG_MGBBL0020_Del01() {
		MCCaller caller = createMG_MGBBL0020_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0020.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0020.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0020.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0020.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0020.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InsMgtIf2Mgt_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_InsMgtIf2Mgt_MC_A(String name) {
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
		MGBBP_InsMgtIf2Mgt_MC.jbCreateScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbCreateCnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbCreateRslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbCreateBtn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbCreateEastBtn((MGBBP_InsMgtIf2Mgt)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBBP_InsMgtIf2Mgt p) {
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
	
	
	/** [Rslt_if_data_typ_ListPutter]の定義 */
	private MCListPutter Rslt_if_data_typ_p = null;

	/**
	 * [Rslt_if_data_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_if_data_typ_ListPutter() {
		if (Rslt_if_data_typ_p == null) {
			Rslt_if_data_typ_p = createRslt_if_data_typ_ListPutter(columnRslt_if_data_typ, "if_data_typ", "if_data_typ_nm");

		}
		return Rslt_if_data_typ_p;
	}
	
	
	/** [Rslt_cost_act_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cost_act_typ_p = null;

	/**
	 * [Rslt_cost_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cost_act_typ_ListPutter() {
		if (Rslt_cost_act_typ_p == null) {
			Rslt_cost_act_typ_p = createRslt_cost_act_typ_ListPutter(columnRslt_cost_act_typ, "cost_act_typ", "cost_act_typ_nm");

		}
		return Rslt_cost_act_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_InsMgtIf2Mgt create(){
		MGBBP_InsMgtIf2Mgt p = new MGBBP_InsMgtIf2Mgt();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_InsMgtIf2Mgt create(String name){
		MGBBP_InsMgtIf2Mgt p = new MGBBP_InsMgtIf2Mgt(name);
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
		MGBBP_InsMgtIf2Mgt_MC.jbfInitScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbfInitCnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbfInitRslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbfInitBtn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbfInitEastBtn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbInitScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbInitCnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbInitRslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbInitBtn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.jbInitEastBtn((MGBBP_InsMgtIf2Mgt)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_LUMP_INS = p.beansFactory.createRadioButton("Cnd.ope_LUMP_INS");
		p.Cnd_ope_LUMP_RERUN_INS = p.beansFactory.createRadioButton("Cnd.ope_LUMP_RERUN_INS");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_non_mov_flg = p.beansFactory.createCheckBox("Cnd.non_mov_flg");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_if_data_typ = p.beansFactory.createTableColumn("Rslt.if_data_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_if_data_typ_nm = p.beansFactory.createTableColumn("Rslt.if_data_typ_nm", MCColumnType.TEXT);
		p.columnRslt_cost_act_typ = p.beansFactory.createTableColumn("Rslt.cost_act_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_cost_act_typ_nm = p.beansFactory.createTableColumn("Rslt.cost_act_typ_nm", MCColumnType.TEXT);
		p.columnRslt_list_sort = p.beansFactory.createTableColumn("Rslt.list_sort", MCColumnType.NUMBER);
		p.columnRslt_is_enable = p.beansFactory.createTableColumn("Rslt.is_enable", MCColumnType.CHECK);
		p.columnRslt_if_last_upd_dt = p.beansFactory.createTableColumn("Rslt.if_last_upd_dt", MCColumnType.TIMESTAMP);
		p.columnRslt_last_upd_dt = p.beansFactory.createTableColumn("Rslt.last_upd_dt", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_act_if = p.beansFactory.createButton("Btn.open_act_if", "open");
		p.Btn_open_act = p.beansFactory.createButton("Btn.open_act", "open");
		p.Btn_srch = p.beansFactory.createButton("Btn.srch");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins1 = p.beansFactory.createButton("Btn.ins1", "upd");
		p.Btn_ins2 = p.beansFactory.createButton("Btn.ins2", "upd");
		p.Btn_ins3 = p.beansFactory.createButton("Btn.ins3", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_LUMP_INS);
		p.Cnd_ope_LUMP_INS.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_LUMP_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_LUMP_INS);
		p.Cnd_ope_LUMP_INS.setNextBeans(p.Cnd_ope_LUMP_RERUN_INS);
		p.Cnd_ope_LUMP_RERUN_INS.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_LUMP_RERUN_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_LUMP_RERUN_INS);
		p.Cnd_ope_LUMP_RERUN_INS.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.CndPanel.setLastBeans(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.wg_nm_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_non_mov_flg);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_non_mov_flg);
		p.Cnd_non_mov_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0020.CndR.non_mov_flg_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBBP_InsMgtIf2Mgt p) {
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
	protected static void jbInitBtn(MGBBP_InsMgtIf2Mgt p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_act_if.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_act_if);
		p.BtnPanel.setLastBeans(p.Btn_open_act_if);
		p.Btn_open_act_if.setNextBeans(p.Btn_open_act);
		p.Btn_open_act.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_act);
		p.Btn_open_act.setNextBeans(p.Btn_srch);
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
		p.Btn_deselect_all.setNextBeans(p.Btn_ins1);
		p.Btn_ins1.setIcon("REGISTER");
		p.Btn_ins1.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins1);
		p.Btn_ins1.setNextBeans(p.Btn_ins2);
		p.Btn_ins2.setIcon("REGISTER");
		p.Btn_ins2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins2);
		p.Btn_ins2.setNextBeans(p.Btn_ins3);
		p.Btn_ins3.setIcon("REGISTER");
		p.Btn_ins3.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins3);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBBP_InsMgtIf2Mgt p) {
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
		MGBBP_InsMgtIf2Mgt_MC.mcInitScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.mcInitCnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.mcInitRslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.mcInitBtn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.mcInitEastBtn((MGBBP_InsMgtIf2Mgt)this);

		// [INS]ステータスのモードの設定
		MGBBP_InsMgtIf2Mgt_MC.statusInitINS_ScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitINS_Cnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitINS_Rslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitINS_Btn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitINS_EastBtn((MGBBP_InsMgtIf2Mgt)this);

		// [LUMP_INS]ステータスのモードの設定
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__INS_ScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__INS_Cnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__INS_Rslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__INS_Btn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__INS_EastBtn((MGBBP_InsMgtIf2Mgt)this);

		// [LUMP_RERUN_INS]ステータスのモードの設定
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__RERUN__INS_ScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__RERUN__INS_Cnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__RERUN__INS_Rslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__RERUN__INS_Btn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitLUMP__RERUN__INS_EastBtn((MGBBP_InsMgtIf2Mgt)this);

		// [DEL]ステータスのモードの設定
		MGBBP_InsMgtIf2Mgt_MC.statusInitDEL_ScreenOpe((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitDEL_Cnd((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitDEL_Rslt((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitDEL_Btn((MGBBP_InsMgtIf2Mgt)this);
		MGBBP_InsMgtIf2Mgt_MC.statusInitDEL_EastBtn((MGBBP_InsMgtIf2Mgt)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_InsMgtIf2Mgt p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_LUMP_INS.addAllListener(p);
		p.Cnd_ope_LUMP_RERUN_INS.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_non_mov_flg.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_InsMgtIf2Mgt p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_if_data_typ.addAllListener(p);
		p.columnRslt_if_data_typ.setListListener(p);
		p.columnRslt_if_data_typ_nm.addAllListener(p);
		p.columnRslt_if_data_typ_nm.setListListener(p);
		p.columnRslt_cost_act_typ.addAllListener(p);
		p.columnRslt_cost_act_typ.setListListener(p);
		p.columnRslt_cost_act_typ_nm.addAllListener(p);
		p.columnRslt_cost_act_typ_nm.setListListener(p);
		p.columnRslt_list_sort.addAllListener(p);
		p.columnRslt_list_sort.setListListener(p);
		p.columnRslt_is_enable.addAllListener(p);
		p.columnRslt_if_last_upd_dt.addAllListener(p);
		p.columnRslt_if_last_upd_dt.setListListener(p);
		p.columnRslt_last_upd_dt.addAllListener(p);
		p.columnRslt_last_upd_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_InsMgtIf2Mgt p) {
		p.Btn_open_act_if.addAllListener(p);
		p.Btn_open_act_if.setAPMethodName("doBtn_open_act_if");
		p.Btn_open_act.addAllListener(p);
		p.Btn_open_act.setAPMethodName("doBtn_open_act");
		p.Btn_srch.addAllListener(p);
		p.Btn_srch.setAPMethodName("doBtn_srch");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins1.addAllListener(p);
		p.Btn_ins1.setAPMethodName("doBtn_ins1");
		p.Btn_ins2.addAllListener(p);
		p.Btn_ins2.setAPMethodName("doBtn_ins2");
		p.Btn_ins3.addAllListener(p);
		p.Btn_ins3.setAPMethodName("doBtn_ins3");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBBP_InsMgtIf2Mgt p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBBP_InsMgtIf2Mgt p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_non_mov_flg.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBBP_InsMgtIf2Mgt p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_if_data_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_if_data_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cost_act_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_cost_act_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_list_sort.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_is_enable.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_if_last_upd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_last_upd_dt.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBBP_InsMgtIf2Mgt p){
		p.Btn_open_act_if.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_act.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins1.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins2.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins3.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [LUMP_INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__INS_ScreenOpe(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [LUMP_INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__INS_Cnd(MGBBP_InsMgtIf2Mgt p){
		p.Cnd_ope_Group.putMode(p, LUMP_INS, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, LUMP_INS, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, LUMP_INS, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, LUMP_INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.Cnd_non_mov_flg.putMode(p, LUMP_INS, MCMode.REQUIRED);

	}

	/**
	 * [LUMP_INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__INS_Rslt(MGBBP_InsMgtIf2Mgt p){
		p.columnRslt_check.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.columnRslt_if_data_typ.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.columnRslt_if_data_typ_nm.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.columnRslt_cost_act_typ.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.columnRslt_cost_act_typ_nm.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.columnRslt_list_sort.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.columnRslt_is_enable.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.columnRslt_if_last_upd_dt.putMode(p, LUMP_INS, MCMode.READ_ONLY);
		p.columnRslt_last_upd_dt.putMode(p, LUMP_INS, MCMode.READ_ONLY);

	}

	/**
	 * [LUMP_INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__INS_Btn(MGBBP_InsMgtIf2Mgt p){
		p.Btn_open_act_if.putMode(p, LUMP_INS, MCMode.ENABLE);
		p.Btn_open_act.putMode(p, LUMP_INS, MCMode.ENABLE);
		p.Btn_srch.putMode(p, LUMP_INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, LUMP_INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, LUMP_INS, MCMode.DISABLE);
		p.Btn_ins1.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.Btn_ins2.putMode(p, LUMP_INS, MCMode.ENABLE);
		p.Btn_ins3.putMode(p, LUMP_INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, LUMP_INS, MCMode.DISABLE);

	}

	/**
	 * [LUMP_INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__INS_EastBtn(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [LUMP_RERUN_INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__RERUN__INS_ScreenOpe(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [LUMP_RERUN_INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__RERUN__INS_Cnd(MGBBP_InsMgtIf2Mgt p){
		p.Cnd_ope_Group.putMode(p, LUMP_RERUN_INS, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, LUMP_RERUN_INS, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, LUMP_RERUN_INS, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, LUMP_RERUN_INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.Cnd_non_mov_flg.putMode(p, LUMP_RERUN_INS, MCMode.REQUIRED);

	}

	/**
	 * [LUMP_RERUN_INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__RERUN__INS_Rslt(MGBBP_InsMgtIf2Mgt p){
		p.columnRslt_check.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.columnRslt_if_data_typ.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.columnRslt_if_data_typ_nm.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.columnRslt_cost_act_typ.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.columnRslt_cost_act_typ_nm.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.columnRslt_list_sort.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.columnRslt_is_enable.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.columnRslt_if_last_upd_dt.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);
		p.columnRslt_last_upd_dt.putMode(p, LUMP_RERUN_INS, MCMode.READ_ONLY);

	}

	/**
	 * [LUMP_RERUN_INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__RERUN__INS_Btn(MGBBP_InsMgtIf2Mgt p){
		p.Btn_open_act_if.putMode(p, LUMP_RERUN_INS, MCMode.ENABLE);
		p.Btn_open_act.putMode(p, LUMP_RERUN_INS, MCMode.ENABLE);
		p.Btn_srch.putMode(p, LUMP_RERUN_INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, LUMP_RERUN_INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, LUMP_RERUN_INS, MCMode.DISABLE);
		p.Btn_ins1.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.Btn_ins2.putMode(p, LUMP_RERUN_INS, MCMode.INVISIBLE);
		p.Btn_ins3.putMode(p, LUMP_RERUN_INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, LUMP_RERUN_INS, MCMode.DISABLE);

	}

	/**
	 * [LUMP_RERUN_INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitLUMP__RERUN__INS_EastBtn(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBBP_InsMgtIf2Mgt p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBBP_InsMgtIf2Mgt p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBBP_InsMgtIf2Mgt p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_if_data_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_if_data_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cost_act_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cost_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_list_sort.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_is_enable.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_if_last_upd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_last_upd_dt.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBBP_InsMgtIf2Mgt p){
		p.Btn_open_act_if.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_act.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_srch.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins1.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_ins3.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBBP_InsMgtIf2Mgt p){

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
		MGBBP_InsMgtIf2Mgt_MC.setTableConfigRslt((MGBBP_InsMgtIf2Mgt)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_InsMgtIf2Mgt p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_if_data_typ.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.if_data_typ_META);
		p.columnRslt_if_data_typ.addLinkBeans(p.columnRslt_if_data_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_if_data_typ);
		p.columnRslt_if_data_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.if_data_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_if_data_typ_nm);
		p.columnRslt_cost_act_typ.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.cost_act_typ_META);
		p.columnRslt_cost_act_typ.addLinkBeans(p.columnRslt_cost_act_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_act_typ);
		p.columnRslt_cost_act_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.cost_act_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_act_typ_nm);
		p.columnRslt_list_sort.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.list_sort_META);
		p.RsltTable.addColumnConfig(p.columnRslt_list_sort);
		p.columnRslt_is_enable.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.is_enable_META);
		p.RsltTable.addColumnConfig(p.columnRslt_is_enable);
		p.columnRslt_if_last_upd_dt.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.if_last_upd_dt_META);
		p.columnRslt_if_last_upd_dt.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_if_last_upd_dt);
		p.columnRslt_last_upd_dt.setMeta(mcframe.clientMGBB.MGBBP0020.RsltR.last_upd_dt_META);
		p.columnRslt_last_upd_dt.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_last_upd_dt);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		columnRslt_if_data_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_if_data_typ.getListConfig().setPutter(getRslt_if_data_typ_ListPutter());
		columnRslt_cost_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_cost_act_typ.getListConfig().setPutter(getRslt_cost_act_typ_ListPutter());
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
	 * この画面を[LUMP_INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setLUMP_INSStatus() {
		status = LUMP_INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[LUMP_RERUN_INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setLUMP_RERUN_INSStatus() {
		status = LUMP_RERUN_INS;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (LUMP_INS.equals(status)) {
			setLUMP_INSStatus();
		}
		else if (LUMP_RERUN_INS.equals(status)) {
			setLUMP_RERUN_INSStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
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
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Rslt_if_data_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_if_data_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.IfDataTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cost_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cost_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CostActTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == columnRslt_if_data_typ) return getRslt_if_data_typ(row, info);
		if(combo == columnRslt_cost_act_typ) return getRslt_cost_act_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_open_act_if) doBtn_open_act_if(info);
		else if (ap == Btn_open_act) doBtn_open_act(info);
		else if (ap == Btn_srch) doBtn_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins1) doBtn_ins1(info);
		else if (ap == Btn_ins2) doBtn_ins2(info);
		else if (ap == Btn_ins3) doBtn_ins3(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Btn]パネルの[open_act_if]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_act_if(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_act(MCEventInfo info);

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
	 * [Btn]パネルの[ins1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins1(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins2(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins3]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins3(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_non_mov_flg) return doCnd_non_mov_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_if_data_typ) return doRslt_if_data_typ_VC(info);
		if (vc == columnRslt_if_data_typ_nm) return doRslt_if_data_typ_nm_VC(info);
		if (vc == columnRslt_cost_act_typ) return doRslt_cost_act_typ_VC(info);
		if (vc == columnRslt_cost_act_typ_nm) return doRslt_cost_act_typ_nm_VC(info);
		if (vc == columnRslt_list_sort) return doRslt_list_sort_VC(info);
		if (vc == columnRslt_is_enable) return doRslt_is_enable_VC(info);
		if (vc == columnRslt_if_last_upd_dt) return doRslt_if_last_upd_dt_VC(info);
		if (vc == columnRslt_last_upd_dt) return doRslt_last_upd_dt_VC(info);
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
	 * [Cnd]パネルの[non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_mov_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[if_data_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_data_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[if_data_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_data_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_act_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[if_last_upd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_last_upd_dt_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_non_mov_flg) doCnd_non_mov_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_if_data_typ) doRslt_if_data_typ_NC(info);
		else if (nc == columnRslt_if_data_typ_nm) doRslt_if_data_typ_nm_NC(info);
		else if (nc == columnRslt_cost_act_typ) doRslt_cost_act_typ_NC(info);
		else if (nc == columnRslt_cost_act_typ_nm) doRslt_cost_act_typ_nm_NC(info);
		else if (nc == columnRslt_list_sort) doRslt_list_sort_NC(info);
		else if (nc == columnRslt_is_enable) doRslt_is_enable_NC(info);
		else if (nc == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NC(info);
		else if (nc == columnRslt_last_upd_dt) doRslt_last_upd_dt_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_non_mov_flg) doCnd_non_mov_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_if_data_typ) doRslt_if_data_typ_NE(info);
		else if (ne == columnRslt_if_data_typ_nm) doRslt_if_data_typ_nm_NE(info);
		else if (ne == columnRslt_cost_act_typ) doRslt_cost_act_typ_NE(info);
		else if (ne == columnRslt_cost_act_typ_nm) doRslt_cost_act_typ_nm_NE(info);
		else if (ne == columnRslt_list_sort) doRslt_list_sort_NE(info);
		else if (ne == columnRslt_is_enable) doRslt_is_enable_NE(info);
		else if (ne == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NE(info);
		else if (ne == columnRslt_last_upd_dt) doRslt_last_upd_dt_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_non_mov_flg) doCnd_non_mov_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_if_data_typ) doRslt_if_data_typ_NX(info);
		else if (nx == columnRslt_if_data_typ_nm) doRslt_if_data_typ_nm_NX(info);
		else if (nx == columnRslt_cost_act_typ) doRslt_cost_act_typ_NX(info);
		else if (nx == columnRslt_cost_act_typ_nm) doRslt_cost_act_typ_nm_NX(info);
		else if (nx == columnRslt_list_sort) doRslt_list_sort_NX(info);
		else if (nx == columnRslt_is_enable) doRslt_is_enable_NX(info);
		else if (nx == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_NX(info);
		else if (nx == columnRslt_last_upd_dt) doRslt_last_upd_dt_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[if_last_upd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_NX(MCEventInfo info){
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
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_if_data_typ) doRslt_if_data_typ_LC(info);
		else if (lc == columnRslt_if_data_typ_nm) doRslt_if_data_typ_nm_LC(info);
		else if (lc == columnRslt_cost_act_typ) doRslt_cost_act_typ_LC(info);
		else if (lc == columnRslt_cost_act_typ_nm) doRslt_cost_act_typ_nm_LC(info);
		else if (lc == columnRslt_list_sort) doRslt_list_sort_LC(info);
		else if (lc == columnRslt_if_last_upd_dt) doRslt_if_last_upd_dt_LC(info);
		else if (lc == columnRslt_last_upd_dt) doRslt_last_upd_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[if_data_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_data_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_data_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[list_sort]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_list_sort_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_last_upd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_last_upd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_upd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_upd_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_if_data_typ]の作成メソッド
	 */
	public MCList getRslt_if_data_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getIfDataTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_cost_act_typ]の作成メソッド
	 */
	public MCList getRslt_cost_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCostActTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0020.Srch01")) {
			return new MG_MGBBL0020_Srch01Bridge();
		}
		if (id.equals("MG.MGBBL0020.Srch02")) {
			return new MG_MGBBL0020_Srch02Bridge();
		}
		if (id.equals("MG.MGBBL0020.Ins01")) {
			return new MG_MGBBL0020_Ins01Bridge();
		}
		if (id.equals("MG.MGBBL0020.Ins02")) {
			return new MG_MGBBL0020_Ins02Bridge();
		}
		if (id.equals("MG.MGBBL0020.Ins03")) {
			return new MG_MGBBL0020_Ins03Bridge();
		}
		if (id.equals("MG.MGBBL0020.Del01")) {
			return new MG_MGBBL0020_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0020_Srch01Bridge() {
			p_MG_MGBBL0020_Srch01 = new MCParam(PDef.MG_MGBBL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));

			p_MG_MGBBL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0020_Srch01.addUpBlock(getCndR());
			p_MG_MGBBL0020_Srch01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0020.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)up(1);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)p_MG_MGBBL0020_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBBL0020_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Srch02;

		/** コンストラクタ */
		protected MG_MGBBL0020_Srch02Bridge() {
			p_MG_MGBBL0020_Srch02 = new MCParam(PDef.MG_MGBBL0020_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			// Down
			param.addDownBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());

			p_MG_MGBBL0020_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Srch02.getContainerParam().getDownBlock(i);
		}
		

		protected mcframe.clientMGBB.MGBBP0020.CndR down0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0020_Srch02.addDownBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Srch02;
		}

		protected void show() {
			setCndR((mcframe.clientMGBB.MGBBP0020.CndR)p_MG_MGBBL0020_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBBL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Ins01;

		/** コンストラクタ */
		protected MG_MGBBL0020_Ins01Bridge() {
			p_MG_MGBBL0020_Ins01 = new MCParam(PDef.MG_MGBBL0020_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
			// Down

			p_MG_MGBBL0020_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0020_Ins01.addUpBlock(getCndR());
			p_MG_MGBBL0020_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0020.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Ins01;
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
	/**
	 * [MG_MGBBL0020_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Ins02;

		/** コンストラクタ */
		protected MG_MGBBL0020_Ins02Bridge() {
			p_MG_MGBBL0020_Ins02 = new MCParam(PDef.MG_MGBBL0020_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
			// Down

			p_MG_MGBBL0020_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0020_Ins02.addUpBlock(getCndR());
			p_MG_MGBBL0020_Ins02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0020.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Ins02;
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
	/**
	 * [MG_MGBBL0020_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Ins03;

		/** コンストラクタ */
		protected MG_MGBBL0020_Ins03Bridge() {
			p_MG_MGBBL0020_Ins03 = new MCParam(PDef.MG_MGBBL0020_Ins03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Ins03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
			// Down

			p_MG_MGBBL0020_Ins03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Ins03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0020_Ins03.addUpBlock(getCndR());
			p_MG_MGBBL0020_Ins03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Ins03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Ins03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0020.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Ins03;
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
	/**
	 * [MG_MGBBL0020_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0020_Del01;

		/** コンストラクタ */
		protected MG_MGBBL0020_Del01Bridge() {
			p_MG_MGBBL0020_Del01 = new MCParam(PDef.MG_MGBBL0020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0020.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0020.RsltR.class));
			// Down

			p_MG_MGBBL0020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0020_Del01.addUpBlock(getCndR());
			p_MG_MGBBL0020_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0020.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0020.CndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0020.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0020.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0020_Del01;
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