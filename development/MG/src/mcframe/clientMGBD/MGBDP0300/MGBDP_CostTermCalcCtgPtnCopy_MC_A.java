package mcframe.clientMGBD.MGBDP0300;

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
import mcframe.clientMGBD.MGBDP0300.MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins01Caller;
import mcframe.clientMGBD.MGBDP0300.MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins02Caller;
import mcframe.clientMGBD.MGBDP0300.MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins03Caller;
import mcframe.clientMGBD.MGBDP0300.MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins04Caller;
import mcframe.clientMGBD.MGBDP0300.MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Srch01Caller;

/**
 * 画面"MGBDP_CostTermCalcCtgPtnCopy"パネルクラスです。<p>
 *
 * 原価データをコピーする。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CostTermCalcCtgPtnCopy_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0300";

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
	 * CALC_CTG,Copy to other calculation category,tgt_ctg;TERM,Copy to other term,tgt_term;PLN,Copy plan,trg_pln;ACT,Copy result,tgt_act CALC_CTG,別の計算カテゴリにコピーする,tgt_ctg;TERM,別の期にコピーする,tgt_term;PLN,計画をコピーする,trg_pln;ACT,実績をコピーする,tgt_act.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_CALC_CTG = null;
	public MCRadioButton Cnd_ope_TERM = null;
	public MCRadioButton Cnd_ope_PLN = null;
	public MCRadioButton Cnd_ope_ACT = null;
	public MCLabel Cnd_tab_ctg_typ_Label = null;
	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_tab_ctg_typ = null;
	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public MCTextField Cnd_tab_ctg_typ_nm = null;
	public MCLabel Cnd_cost_copy_typ_Label = null;
	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_copy_typ = null;
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public MCTextField Cnd_cost_copy_typ_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Fr]ブロック関連のField定義
	public MCPanel FrPanel = null;
	public MCTitledBorder FrTitledBorder = null;
	// [Fr]ブロックの項目のField定義
	public MCLabel Fr_calc_ctg_cd_fr_Label = null;
	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Fr_calc_ctg_cd_fr = null;
	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Fr_calc_ctg_nm_fr = null;
	public MCLabel Fr_calc_ctg_cd_to_Label = null;
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Fr_calc_ctg_cd_to = null;
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Fr_calc_ctg_nm_to = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Fr_term_fr_p_PPanel;
	public MCDateComboBox Fr_term_fr;	// [Fr]の[term_fr_p.term]を[Fr_term_fr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Fr_term_to_p_PPanel;
	public MCDateComboBox Fr_term_to;	// [Fr]の[term_to_p.term]を[Fr_term_to]としてエイリアス定義。
	public MCLabel Fr_ym_fr_Label = null;
	/**
	 * Month (Copy from) コピー元年月.<p>
	 *
	 */
	public MCDateField Fr_ym_fr = null;
	public MCLabel Fr_ym_to_Label = null;
	/**
	 * Month (Copy to) コピー先年月.<p>
	 *
	 */
	public MCDateField Fr_ym_to = null;
	// [To]ブロック関連のField定義
	public MCPanel ToPanel = null;
	public MCTitledBorder ToTitledBorder = null;
	// [To]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0300.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tab_ctg_typ = null;
	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tab_ctg_typ_nm = null;
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_list_sort = null;
	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_copy_typ = null;
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_copy_typ_nm = null;
	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_copy_typ_key = null;
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_module_id = null;
	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_screen_id = null;
	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cnt_fr = null;
	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cnt_to = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Screen transition 画面遷移.<p>
	 *
	 */
	public MCButton Btn_open = null;
	/**
	 * Count numbers 件数カウントする.<p>
	 *
	 */
	public MCButton Btn_srch_cnt = null;
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
	public MCButton Btn_upd_c = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_t = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_pln = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_act = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD_C]モードを表す定数 */
	public static final String UPD_C = "UPD_C";
	/** [UPD_T]モードを表す定数 */
	public static final String UPD_T = "UPD_T";
	/** [UPD_P]モードを表す定数 */
	public static final String UPD_P = "UPD_P";
	/** [UPD_A]モードを表す定数 */
	public static final String UPD_A = "UPD_A";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD_C, UPD_T, UPD_P, UPD_A};
	
	/** [MG_MGBDL0300_Ins01]のCallerの作成 */
	protected MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins01Caller createMG_MGBDL0300_Ins01() {
		MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins01Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins01Bridge>
		caller = ((MGBDP_CostTermCalcCtgPtnCopy_MC)this).new MG_MGBDL0300_Ins01Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins01Bridge>(
					(MGBDP_CostTermCalcCtgPtnCopy)this, new MG_MGBDL0300_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0300_Ins01]の呼び出し */
	protected void callMG_MGBDL0300_Ins01() {
		MCCaller caller = createMG_MGBDL0300_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0300_Ins02]のCallerの作成 */
	protected MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins02Caller createMG_MGBDL0300_Ins02() {
		MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins02Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins02Bridge>
		caller = ((MGBDP_CostTermCalcCtgPtnCopy_MC)this).new MG_MGBDL0300_Ins02Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins02Bridge>(
					(MGBDP_CostTermCalcCtgPtnCopy)this, new MG_MGBDL0300_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBDL0300_Ins02]の呼び出し */
	protected void callMG_MGBDL0300_Ins02() {
		MCCaller caller = createMG_MGBDL0300_Ins02();
		caller.exec();
	}
	/** [MG_MGBDL0300_Ins03]のCallerの作成 */
	protected MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins03Caller createMG_MGBDL0300_Ins03() {
		MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins03Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins03Bridge>
		caller = ((MGBDP_CostTermCalcCtgPtnCopy_MC)this).new MG_MGBDL0300_Ins03Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins03Bridge>(
					(MGBDP_CostTermCalcCtgPtnCopy)this, new MG_MGBDL0300_Ins03Bridge());
		return caller;
	}
	/** [MG_MGBDL0300_Ins03]の呼び出し */
	protected void callMG_MGBDL0300_Ins03() {
		MCCaller caller = createMG_MGBDL0300_Ins03();
		caller.exec();
	}
	/** [MG_MGBDL0300_Ins04]のCallerの作成 */
	protected MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins04Caller createMG_MGBDL0300_Ins04() {
		MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Ins04Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins04Bridge>
		caller = ((MGBDP_CostTermCalcCtgPtnCopy_MC)this).new MG_MGBDL0300_Ins04Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Ins04Bridge>(
					(MGBDP_CostTermCalcCtgPtnCopy)this, new MG_MGBDL0300_Ins04Bridge());
		return caller;
	}
	/** [MG_MGBDL0300_Ins04]の呼び出し */
	protected void callMG_MGBDL0300_Ins04() {
		MCCaller caller = createMG_MGBDL0300_Ins04();
		caller.exec();
	}
	/** [MG_MGBDL0300_Srch01]のCallerの作成 */
	protected MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Srch01Caller createMG_MGBDL0300_Srch01() {
		MGBDP_CostTermCalcCtgPtnCopy_MC.MG_MGBDL0300_Srch01Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Srch01Bridge>
		caller = ((MGBDP_CostTermCalcCtgPtnCopy_MC)this).new MG_MGBDL0300_Srch01Caller<MGBDP_CostTermCalcCtgPtnCopy, MG_MGBDL0300_Srch01Bridge>(
					(MGBDP_CostTermCalcCtgPtnCopy)this, new MG_MGBDL0300_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0300_Srch01]の呼び出し */
	protected void callMG_MGBDL0300_Srch01() {
		MCCaller caller = createMG_MGBDL0300_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0300.CndR aCndR;
	/** [Fr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0300.FrR aFrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0300.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0300.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0300.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0300.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0300.CndR.create();
	}

	/**
	 * 項目コピーによってaFrRを設定します。
	 *
	 * aFrRのインスタンスは変更されません。
	 *
	 * @param row FrR
	 */
	public void setFrR(mcframe.clientMGBD.MGBDP0300.FrR row) {
		if (row != null) {
			MCRow.copyall(getFrR(), row);
		}
	}

	/**
	 * [Fr]ブロックのコンテナaFrRを返します。
	 *
	 * @return FrR
	 */
	public mcframe.clientMGBD.MGBDP0300.FrR getFrR() {
		return aFrR;
	}

	/**
	 * aFrRを作成します。
	 *
	 * @return FrR
	 */
	public mcframe.clientMGBD.MGBDP0300.FrR createFrR() {
		return mcframe.clientMGBD.MGBDP0300.FrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0300.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0300.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0300.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0300.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0300.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getFrR())) ret.add(getFrR());
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
		if(aCnt == getFrR()) return "Fr";
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
		if(bId.equals("Fr")) return getFrR();
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
		ret.add(CndPanel);
		ret.add(FrPanel);
		ret.add(ToPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostTermCalcCtgPtnCopy_MC_A() {
		aCndR = createCndR();
		aFrR = createFrR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CostTermCalcCtgPtnCopy_MC_A(String name) {
		aCndR = createCndR();
		aFrR = createFrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateCnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateFr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateTo((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateDtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbCreateBtn((MGBDP_CostTermCalcCtgPtnCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 * [Fr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFr(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.Fr_term_fr_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getFrR().term_fr_p());
		p.Fr_term_fr_p_PPanel.setName("Fr.term_fr_p");
		p.Fr_term_fr = p.Fr_term_fr_p_PPanel.Term_term;
		p.Fr_term_fr.addAliasName("Fr.term_fr", p);
		p.Fr_term_to_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getFrR().term_to_p());
		p.Fr_term_to_p_PPanel.setName("Fr.term_to_p");
		p.Fr_term_to = p.Fr_term_to_p_PPanel.Term_term;
		p.Fr_term_to.addAliasName("Fr.term_to", p);
	}

	/**
	 * [To]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTo(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CostTermCalcCtgPtnCopy p) {
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

	
	/** [Cnd_tab_ctg_typ_ListPutter]の定義 */
	private MCListPutter Cnd_tab_ctg_typ_p = null;

	/**
	 * [Cnd_tab_ctg_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tab_ctg_typ_ListPutter() {
		if (Cnd_tab_ctg_typ_p == null) {
			Cnd_tab_ctg_typ_p = createCnd_tab_ctg_typ_ListPutter(Cnd_tab_ctg_typ, "tab_ctg_typ", "tab_ctg_typ_nm");

		}
		return Cnd_tab_ctg_typ_p;
	}
	
	
	/** [Cnd_cost_copy_typ_ListPutter]の定義 */
	private MCListPutter Cnd_cost_copy_typ_p = null;

	/**
	 * [Cnd_cost_copy_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_copy_typ_ListPutter() {
		if (Cnd_cost_copy_typ_p == null) {
			Cnd_cost_copy_typ_p = createCnd_cost_copy_typ_ListPutter(Cnd_cost_copy_typ, "cost_copy_typ", "cost_copy_typ_nm");

		}
		return Cnd_cost_copy_typ_p;
	}
	
	
	/** [Fr_calc_ctg_cd_fr_ListPutter]の定義 */
	private MCListPutter Fr_calc_ctg_cd_fr_p = null;

	/**
	 * [Fr_calc_ctg_cd_fr_ListPutter]の取得
	 */
	protected MCListPutter getFr_calc_ctg_cd_fr_ListPutter() {
		if (Fr_calc_ctg_cd_fr_p == null) {
			Fr_calc_ctg_cd_fr_p = createFr_calc_ctg_cd_fr_ListPutter(Fr_calc_ctg_cd_fr, "calc_ctg_cd_fr", "calc_ctg_nm_fr");

		}
		return Fr_calc_ctg_cd_fr_p;
	}
	
	
	/** [Fr_calc_ctg_cd_to_ListPutter]の定義 */
	private MCListPutter Fr_calc_ctg_cd_to_p = null;

	/**
	 * [Fr_calc_ctg_cd_to_ListPutter]の取得
	 */
	protected MCListPutter getFr_calc_ctg_cd_to_ListPutter() {
		if (Fr_calc_ctg_cd_to_p == null) {
			Fr_calc_ctg_cd_to_p = createFr_calc_ctg_cd_to_ListPutter(Fr_calc_ctg_cd_to, "calc_ctg_cd_to", "calc_ctg_nm_to");

		}
		return Fr_calc_ctg_cd_to_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CostTermCalcCtgPtnCopy create(){
		MGBDP_CostTermCalcCtgPtnCopy p = new MGBDP_CostTermCalcCtgPtnCopy();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CostTermCalcCtgPtnCopy create(String name){
		MGBDP_CostTermCalcCtgPtnCopy p = new MGBDP_CostTermCalcCtgPtnCopy(name);
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
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitCnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitFr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitTo((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitDtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbfInitBtn((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitCnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitFr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitTo((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitDtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.jbInitBtn((MGBDP_CostTermCalcCtgPtnCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_CALC_CTG = p.beansFactory.createRadioButton("Cnd.ope_CALC_CTG");
		p.Cnd_ope_TERM = p.beansFactory.createRadioButton("Cnd.ope_TERM");
		p.Cnd_ope_PLN = p.beansFactory.createRadioButton("Cnd.ope_PLN");
		p.Cnd_ope_ACT = p.beansFactory.createRadioButton("Cnd.ope_ACT");
		p.Cnd_tab_ctg_typ_Label = p.beansFactory.createLabel("Cnd.tab_ctg_typ_Label");
		p.Cnd_tab_ctg_typ = p.beansFactory.createTextComboBox("Cnd.tab_ctg_typ");
		p.Cnd_tab_ctg_typ.setLabel(p.Cnd_tab_ctg_typ_Label);
		p.Cnd_tab_ctg_typ_nm = p.beansFactory.createTextField("Cnd.tab_ctg_typ_nm");
		p.Cnd_cost_copy_typ_Label = p.beansFactory.createLabel("Cnd.cost_copy_typ_Label");
		p.Cnd_cost_copy_typ = p.beansFactory.createTextComboBox("Cnd.cost_copy_typ");
		p.Cnd_cost_copy_typ.setLabel(p.Cnd_cost_copy_typ_Label);
		p.Cnd_cost_copy_typ_nm = p.beansFactory.createTextField("Cnd.cost_copy_typ_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Fr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFr(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.FrPanel = p.beansFactory.createPanel("Fr");
		p.FrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Fr_calc_ctg_cd_fr_Label = p.beansFactory.createLabel("Fr.calc_ctg_cd_fr_Label");
		p.Fr_calc_ctg_cd_fr = p.beansFactory.createTextComboBox("Fr.calc_ctg_cd_fr");
		p.Fr_calc_ctg_cd_fr.setLabel(p.Fr_calc_ctg_cd_fr_Label);
		p.Fr_calc_ctg_nm_fr = p.beansFactory.createTextField("Fr.calc_ctg_nm_fr");
		p.Fr_calc_ctg_cd_to_Label = p.beansFactory.createLabel("Fr.calc_ctg_cd_to_Label");
		p.Fr_calc_ctg_cd_to = p.beansFactory.createTextComboBox("Fr.calc_ctg_cd_to");
		p.Fr_calc_ctg_cd_to.setLabel(p.Fr_calc_ctg_cd_to_Label);
		p.Fr_calc_ctg_nm_to = p.beansFactory.createTextField("Fr.calc_ctg_nm_to");
		p.Fr_ym_fr_Label = p.beansFactory.createLabel("Fr.ym_fr_Label");
		p.Fr_ym_fr = p.beansFactory.createDateField("Fr.ym_fr");
		p.Fr_ym_fr.setLabel(p.Fr_ym_fr_Label);
		p.Fr_ym_to_Label = p.beansFactory.createLabel("Fr.ym_to_Label");
		p.Fr_ym_to = p.beansFactory.createDateField("Fr.ym_to");
		p.Fr_ym_to.setLabel(p.Fr_ym_to_Label);
	}

	/**
	 * [To]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTo(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.ToPanel = p.beansFactory.createPanel("To");
		p.ToTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_tab_ctg_typ = p.beansFactory.createTableColumn("Dtl.tab_ctg_typ", MCColumnType.TEXT);
		p.columnDtl_tab_ctg_typ_nm = p.beansFactory.createTableColumn("Dtl.tab_ctg_typ_nm", MCColumnType.TEXT);
		p.columnDtl_list_sort = p.beansFactory.createTableColumn("Dtl.list_sort", MCColumnType.NUMBER);
		p.columnDtl_cost_copy_typ = p.beansFactory.createTableColumn("Dtl.cost_copy_typ", MCColumnType.TEXT);
		p.columnDtl_cost_copy_typ_nm = p.beansFactory.createTableColumn("Dtl.cost_copy_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cost_copy_typ_key = p.beansFactory.createTableColumn("Dtl.cost_copy_typ_key", MCColumnType.TEXT);
		p.columnDtl_module_id = p.beansFactory.createTableColumn("Dtl.module_id", MCColumnType.TEXT);
		p.columnDtl_screen_id = p.beansFactory.createTableColumn("Dtl.screen_id", MCColumnType.TEXT);
		p.columnDtl_cnt_fr = p.beansFactory.createTableColumn("Dtl.cnt_fr", MCColumnType.NUMBER);
		p.columnDtl_cnt_to = p.beansFactory.createTableColumn("Dtl.cnt_to", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open = p.beansFactory.createButton("Btn.open", "open");
		p.Btn_srch_cnt = p.beansFactory.createButton("Btn.srch_cnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_c = p.beansFactory.createButton("Btn.upd_c", "upd");
		p.Btn_upd_t = p.beansFactory.createButton("Btn.upd_t", "upd");
		p.Btn_upd_pln = p.beansFactory.createButton("Btn.upd_pln", "upd");
		p.Btn_upd_act = p.beansFactory.createButton("Btn.upd_act", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p) {
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
	protected static void jbInitCnd(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.FrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_CALC_CTG);
		p.Cnd_ope_CALC_CTG.setActionCommand("tgt_ctg");
		p.Cnd_ope_Group.add(p.Cnd_ope_CALC_CTG);
		p.ScreenOpePanel.add(p.Cnd_ope_CALC_CTG);
		p.Cnd_ope_CALC_CTG.setNextBeans(p.Cnd_ope_TERM);
		p.Cnd_ope_TERM.setActionCommand("tgt_term");
		p.Cnd_ope_Group.add(p.Cnd_ope_TERM);
		p.ScreenOpePanel.add(p.Cnd_ope_TERM);
		p.Cnd_ope_TERM.setNextBeans(p.Cnd_ope_PLN);
		p.Cnd_ope_PLN.setActionCommand("trg_pln");
		p.Cnd_ope_Group.add(p.Cnd_ope_PLN);
		p.ScreenOpePanel.add(p.Cnd_ope_PLN);
		p.Cnd_ope_PLN.setNextBeans(p.Cnd_ope_ACT);
		p.Cnd_ope_ACT.setActionCommand("tgt_act");
		p.Cnd_ope_Group.add(p.Cnd_ope_ACT);
		p.ScreenOpePanel.add(p.Cnd_ope_ACT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0300.CndR.ope_META);
		p.Cnd_tab_ctg_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tab_ctg_typ, true);
		p.Cnd_tab_ctg_typ.setLinkBeans(p.Cnd_tab_ctg_typ_nm);
		p.CndPanel.add(p.Cnd_tab_ctg_typ_Label);
		p.CndPanel.add(p.Cnd_tab_ctg_typ);
		p.CndPanel.setLastBeans(p.Cnd_tab_ctg_typ);
		p.Cnd_tab_ctg_typ.setNextBeans(p.Cnd_tab_ctg_typ_nm);
		p.Cnd_tab_ctg_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0300.CndR.tab_ctg_typ_META);
		p.CndPanel.add(p.Cnd_tab_ctg_typ_nm);
		p.Cnd_tab_ctg_typ_nm.setNextBeans(p.Cnd_cost_copy_typ);
		p.Cnd_tab_ctg_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0300.CndR.tab_ctg_typ_nm_META);
		p.Cnd_cost_copy_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_copy_typ, true);
		p.Cnd_cost_copy_typ.setLinkBeans(p.Cnd_cost_copy_typ_nm);
		p.CndPanel.add(p.Cnd_cost_copy_typ_Label);
		p.CndPanel.add(p.Cnd_cost_copy_typ);
		p.Cnd_cost_copy_typ.setNextBeans(p.Cnd_cost_copy_typ_nm);
		p.Cnd_cost_copy_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0300.CndR.cost_copy_typ_META);
		p.CndPanel.add(p.Cnd_cost_copy_typ_nm);
		p.Cnd_cost_copy_typ_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_cost_copy_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0300.CndR.cost_copy_typ_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Fr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFr(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.FrPanel.setBorder(p.FrTitledBorder);
		p.add(p.FrPanel);
		p.FrPanel.setNextBeans(p.ToPanel);
		p.FrPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
		p.Fr_calc_ctg_cd_fr.setListType(MCListType.STRICT);
		p.Fr_calc_ctg_cd_fr.setLinkBeans(p.Fr_calc_ctg_nm_fr);
		p.FrPanel.add(p.Fr_calc_ctg_cd_fr_Label);
		p.FrPanel.add(p.Fr_calc_ctg_cd_fr);
		p.FrPanel.setLastBeans(p.Fr_calc_ctg_cd_fr);
		p.Fr_calc_ctg_cd_fr.setNextBeans(p.Fr_calc_ctg_nm_fr);
		p.Fr_calc_ctg_cd_fr.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.calc_ctg_cd_fr_META);
		p.FrPanel.add(p.Fr_calc_ctg_nm_fr);
		p.Fr_calc_ctg_nm_fr.setNextBeans(p.Fr_term_fr_p_PPanel);
		p.Fr_calc_ctg_nm_fr.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.calc_ctg_nm_fr_META);
		p.Fr_calc_ctg_cd_to.setListType(MCListType.STRICT);
		p.Fr_calc_ctg_cd_to.setLinkBeans(p.Fr_calc_ctg_nm_to);
		p.ToPanel.add(p.Fr_calc_ctg_cd_to_Label);
		p.ToPanel.add(p.Fr_calc_ctg_cd_to);
		p.ToPanel.setLastBeans(p.Fr_calc_ctg_cd_to);
		p.Fr_calc_ctg_cd_to.setNextBeans(p.Fr_calc_ctg_nm_to);
		p.Fr_calc_ctg_cd_to.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.calc_ctg_cd_to_META);
		p.ToPanel.add(p.Fr_calc_ctg_nm_to);
		p.Fr_calc_ctg_nm_to.setNextBeans(p.Fr_term_to_p_PPanel);
		p.Fr_calc_ctg_nm_to.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.calc_ctg_nm_to_META);
		p.FrPanel.add(p.Fr_term_fr_p_PPanel);
		p.Fr_term_fr_p_PPanel.setNextBeans(p.Fr_ym_fr);
		p.ToPanel.add(p.Fr_term_to_p_PPanel);
		p.Fr_term_to_p_PPanel.setNextBeans(p.Fr_ym_to);
		p.FrPanel.add(p.Fr_ym_fr_Label);
		p.FrPanel.add(p.Fr_ym_fr);
		p.Fr_ym_fr.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.ym_fr_META);
		p.Fr_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.ToPanel.add(p.Fr_ym_to_Label);
		p.ToPanel.add(p.Fr_ym_to);
		p.Fr_ym_to.setRow(p.getFrR(), mcframe.clientMGBD.MGBDP0300.FrR.ym_to_META);
		p.Fr_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
	}

	/**
	 * [To]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTo(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.ToPanel.setBorder(p.ToTitledBorder);
		p.add(p.ToPanel);
		p.ToPanel.setNextBeans(p.DtlPanel);
		p.ToPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CostTermCalcCtgPtnCopy p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open);
		p.BtnPanel.setLastBeans(p.Btn_open);
		p.Btn_open.setNextBeans(p.Btn_srch_cnt);
		p.Btn_srch_cnt.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_srch_cnt);
		p.Btn_srch_cnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_c);
		p.Btn_upd_c.setIcon("REGISTER");
		p.Btn_upd_c.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_c);
		p.Btn_upd_c.setNextBeans(p.Btn_upd_t);
		p.Btn_upd_t.setIcon("REGISTER");
		p.Btn_upd_t.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_t);
		p.Btn_upd_t.setNextBeans(p.Btn_upd_pln);
		p.Btn_upd_pln.setIcon("REGISTER");
		p.Btn_upd_pln.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_pln);
		p.Btn_upd_pln.setNextBeans(p.Btn_upd_act);
		p.Btn_upd_act.setIcon("REGISTER");
		p.Btn_upd_act.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_act);
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
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitCnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitFr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitTo((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitDtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.mcInitBtn((MGBDP_CostTermCalcCtgPtnCopy)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_ScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_Cnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_Fr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_To((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_Dtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitSRCH_Btn((MGBDP_CostTermCalcCtgPtnCopy)this);

		// [UPD_C]ステータスのモードの設定
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_ScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_Cnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_Fr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_To((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_Dtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__C_Btn((MGBDP_CostTermCalcCtgPtnCopy)this);

		// [UPD_T]ステータスのモードの設定
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_ScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_Cnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_Fr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_To((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_Dtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__T_Btn((MGBDP_CostTermCalcCtgPtnCopy)this);

		// [UPD_P]ステータスのモードの設定
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_ScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_Cnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_Fr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_To((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_Dtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__P_Btn((MGBDP_CostTermCalcCtgPtnCopy)this);

		// [UPD_A]ステータスのモードの設定
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_ScreenOpe((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_Cnd((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_Fr((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_To((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_Dtl((MGBDP_CostTermCalcCtgPtnCopy)this);
		MGBDP_CostTermCalcCtgPtnCopy_MC.statusInitUPD__A_Btn((MGBDP_CostTermCalcCtgPtnCopy)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_CALC_CTG.addAllListener(p);
		p.Cnd_ope_TERM.addAllListener(p);
		p.Cnd_ope_PLN.addAllListener(p);
		p.Cnd_ope_ACT.addAllListener(p);
		p.Cnd_tab_ctg_typ.setListListener(p);
		p.Cnd_tab_ctg_typ.addAllListener(p);
		p.Cnd_tab_ctg_typ_nm.setListListener(p);
		p.Cnd_tab_ctg_typ_nm.addAllListener(p);
		p.Cnd_cost_copy_typ.setListListener(p);
		p.Cnd_cost_copy_typ.addAllListener(p);
		p.Cnd_cost_copy_typ_nm.setListListener(p);
		p.Cnd_cost_copy_typ_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Fr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFr(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.Fr_calc_ctg_cd_fr.setListListener(p);
		p.Fr_calc_ctg_cd_fr.addAllListener(p);
		p.Fr_calc_ctg_nm_fr.setListListener(p);
		p.Fr_calc_ctg_nm_fr.addAllListener(p);
		p.Fr_calc_ctg_cd_to.setListListener(p);
		p.Fr_calc_ctg_cd_to.addAllListener(p);
		p.Fr_calc_ctg_nm_to.setListListener(p);
		p.Fr_calc_ctg_nm_to.addAllListener(p);
		p.Fr_ym_fr.setListListener(p);
		p.Fr_ym_fr.addAllListener(p);
		p.Fr_ym_to.setListListener(p);
		p.Fr_ym_to.addAllListener(p);
	}

	/**
	 *  [To]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTo(MGBDP_CostTermCalcCtgPtnCopy p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_tab_ctg_typ.addAllListener(p);
		p.columnDtl_tab_ctg_typ.setListListener(p);
		p.columnDtl_tab_ctg_typ_nm.addAllListener(p);
		p.columnDtl_tab_ctg_typ_nm.setListListener(p);
		p.columnDtl_list_sort.addAllListener(p);
		p.columnDtl_list_sort.setListListener(p);
		p.columnDtl_cost_copy_typ.addAllListener(p);
		p.columnDtl_cost_copy_typ.setListListener(p);
		p.columnDtl_cost_copy_typ_nm.addAllListener(p);
		p.columnDtl_cost_copy_typ_nm.setListListener(p);
		p.columnDtl_cost_copy_typ_key.addAllListener(p);
		p.columnDtl_cost_copy_typ_key.setListListener(p);
		p.columnDtl_module_id.addAllListener(p);
		p.columnDtl_module_id.setListListener(p);
		p.columnDtl_screen_id.addAllListener(p);
		p.columnDtl_screen_id.setListListener(p);
		p.columnDtl_cnt_fr.addAllListener(p);
		p.columnDtl_cnt_fr.setListListener(p);
		p.columnDtl_cnt_to.addAllListener(p);
		p.columnDtl_cnt_to.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.Btn_open.addAllListener(p);
		p.Btn_open.setAPMethodName("doBtn_open");
		p.Btn_srch_cnt.addAllListener(p);
		p.Btn_srch_cnt.setAPMethodName("doBtn_srch_cnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_c.addAllListener(p);
		p.Btn_upd_c.setAPMethodName("doBtn_upd_c");
		p.Btn_upd_t.addAllListener(p);
		p.Btn_upd_t.setAPMethodName("doBtn_upd_t");
		p.Btn_upd_pln.addAllListener(p);
		p.Btn_upd_pln.setAPMethodName("doBtn_upd_pln");
		p.Btn_upd_act.addAllListener(p);
		p.Btn_upd_act.setAPMethodName("doBtn_upd_act");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Cnd_tab_ctg_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tab_ctg_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_cost_copy_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_copy_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Fr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fr(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Fr_calc_ctg_cd_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Fr_calc_ctg_nm_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Fr_calc_ctg_cd_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Fr_calc_ctg_nm_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Fr_term_fr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_term_to_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_ym_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Fr_ym_to.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_To(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_CostTermCalcCtgPtnCopy p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_list_sort.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cost_copy_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_key.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_module_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_screen_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cnt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cnt_to.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Btn_open.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_srch_cnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_c.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_t.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_pln.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_act.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD_C]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_ScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_C]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_Cnd(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Cnd_tab_ctg_typ.putMode(p, UPD_C, MCMode.ENABLE);
		p.Cnd_tab_ctg_typ_nm.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.Cnd_cost_copy_typ.putMode(p, UPD_C, MCMode.ENABLE);
		p.Cnd_cost_copy_typ_nm.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_C, MCMode.ENABLE);

	}

	/**
	 * [UPD_C]ステータスの[Fr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_Fr(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Fr_calc_ctg_cd_fr.putMode(p, UPD_C, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_fr.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.Fr_calc_ctg_cd_to.putMode(p, UPD_C, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_to.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.Fr_term_fr_p_PPanel.putStatus(UPD_C, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Fr_term_to_p_PPanel.putStatus(UPD_C, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_ym_fr.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.Fr_ym_to.putMode(p, UPD_C, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_C]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_To(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_C]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_Dtl(MGBDP_CostTermCalcCtgPtnCopy p){
		p.columnDtl_check.putMode(p, UPD_C, MCMode.REQUIRED);
		p.columnDtl_tab_ctg_typ.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ_nm.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.columnDtl_list_sort.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.columnDtl_cost_copy_typ.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_nm.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_key.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.columnDtl_module_id.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.columnDtl_screen_id.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.columnDtl_cnt_fr.putMode(p, UPD_C, MCMode.READ_ONLY);
		p.columnDtl_cnt_to.putMode(p, UPD_C, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_C]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__C_Btn(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Btn_open.putMode(p, UPD_C, MCMode.ENABLE);
		p.Btn_srch_cnt.putMode(p, UPD_C, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_C, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_C, MCMode.ENABLE);
		p.Btn_upd_c.putMode(p, UPD_C, MCMode.ENABLE);
		p.Btn_upd_t.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.Btn_upd_pln.putMode(p, UPD_C, MCMode.INVISIBLE);
		p.Btn_upd_act.putMode(p, UPD_C, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_T]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_ScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_T]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_Cnd(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Cnd_tab_ctg_typ.putMode(p, UPD_T, MCMode.ENABLE);
		p.Cnd_tab_ctg_typ_nm.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Cnd_cost_copy_typ.putMode(p, UPD_T, MCMode.ENABLE);
		p.Cnd_cost_copy_typ_nm.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_T, MCMode.ENABLE);

	}

	/**
	 * [UPD_T]ステータスの[Fr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_Fr(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Fr_calc_ctg_cd_fr.putMode(p, UPD_T, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_fr.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Fr_calc_ctg_cd_to.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Fr_calc_ctg_nm_to.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Fr_term_fr_p_PPanel.putStatus(UPD_T, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Fr_term_to_p_PPanel.putStatus(UPD_T, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Fr_ym_fr.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.Fr_ym_to.putMode(p, UPD_T, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_T]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_To(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_T]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_Dtl(MGBDP_CostTermCalcCtgPtnCopy p){
		p.columnDtl_check.putMode(p, UPD_T, MCMode.REQUIRED);
		p.columnDtl_tab_ctg_typ.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ_nm.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.columnDtl_list_sort.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.columnDtl_cost_copy_typ.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_nm.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_key.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.columnDtl_module_id.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.columnDtl_screen_id.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.columnDtl_cnt_fr.putMode(p, UPD_T, MCMode.READ_ONLY);
		p.columnDtl_cnt_to.putMode(p, UPD_T, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_T]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__T_Btn(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Btn_open.putMode(p, UPD_T, MCMode.ENABLE);
		p.Btn_srch_cnt.putMode(p, UPD_T, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_T, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_T, MCMode.ENABLE);
		p.Btn_upd_c.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.Btn_upd_t.putMode(p, UPD_T, MCMode.ENABLE);
		p.Btn_upd_pln.putMode(p, UPD_T, MCMode.INVISIBLE);
		p.Btn_upd_act.putMode(p, UPD_T, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_P]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_ScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_P]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_Cnd(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Cnd_tab_ctg_typ.putMode(p, UPD_P, MCMode.ENABLE);
		p.Cnd_tab_ctg_typ_nm.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.Cnd_cost_copy_typ.putMode(p, UPD_P, MCMode.ENABLE);
		p.Cnd_cost_copy_typ_nm.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_P, MCMode.ENABLE);

	}

	/**
	 * [UPD_P]ステータスの[Fr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_Fr(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Fr_calc_ctg_cd_fr.putMode(p, UPD_P, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_fr.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.Fr_calc_ctg_cd_to.putMode(p, UPD_P, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_to.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.Fr_term_fr_p_PPanel.putStatus(UPD_P, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_term_to_p_PPanel.putStatus(UPD_P, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_ym_fr.putMode(p, UPD_P, MCMode.REQUIRED);
		p.Fr_ym_to.putMode(p, UPD_P, MCMode.REQUIRED);

	}

	/**
	 * [UPD_P]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_To(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_P]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_Dtl(MGBDP_CostTermCalcCtgPtnCopy p){
		p.columnDtl_check.putMode(p, UPD_P, MCMode.REQUIRED);
		p.columnDtl_tab_ctg_typ.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ_nm.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.columnDtl_list_sort.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.columnDtl_cost_copy_typ.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_nm.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_key.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.columnDtl_module_id.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.columnDtl_screen_id.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.columnDtl_cnt_fr.putMode(p, UPD_P, MCMode.READ_ONLY);
		p.columnDtl_cnt_to.putMode(p, UPD_P, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_P]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__P_Btn(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Btn_open.putMode(p, UPD_P, MCMode.ENABLE);
		p.Btn_srch_cnt.putMode(p, UPD_P, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_P, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_P, MCMode.ENABLE);
		p.Btn_upd_c.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.Btn_upd_t.putMode(p, UPD_P, MCMode.INVISIBLE);
		p.Btn_upd_pln.putMode(p, UPD_P, MCMode.ENABLE);
		p.Btn_upd_act.putMode(p, UPD_P, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_A]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_ScreenOpe(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_A]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_Cnd(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Cnd_tab_ctg_typ.putMode(p, UPD_A, MCMode.ENABLE);
		p.Cnd_tab_ctg_typ_nm.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.Cnd_cost_copy_typ.putMode(p, UPD_A, MCMode.ENABLE);
		p.Cnd_cost_copy_typ_nm.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_A, MCMode.ENABLE);

	}

	/**
	 * [UPD_A]ステータスの[Fr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_Fr(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Fr_calc_ctg_cd_fr.putMode(p, UPD_A, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_fr.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.Fr_calc_ctg_cd_to.putMode(p, UPD_A, MCMode.REQUIRED);
		p.Fr_calc_ctg_nm_to.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.Fr_term_fr_p_PPanel.putStatus(UPD_A, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_term_to_p_PPanel.putStatus(UPD_A, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Fr_ym_fr.putMode(p, UPD_A, MCMode.REQUIRED);
		p.Fr_ym_to.putMode(p, UPD_A, MCMode.REQUIRED);

	}

	/**
	 * [UPD_A]ステータスの[To]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_To(MGBDP_CostTermCalcCtgPtnCopy p){

	}

	/**
	 * [UPD_A]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_Dtl(MGBDP_CostTermCalcCtgPtnCopy p){
		p.columnDtl_check.putMode(p, UPD_A, MCMode.REQUIRED);
		p.columnDtl_tab_ctg_typ.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.columnDtl_tab_ctg_typ_nm.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.columnDtl_list_sort.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.columnDtl_cost_copy_typ.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_nm.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.columnDtl_cost_copy_typ_key.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.columnDtl_module_id.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.columnDtl_screen_id.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.columnDtl_cnt_fr.putMode(p, UPD_A, MCMode.READ_ONLY);
		p.columnDtl_cnt_to.putMode(p, UPD_A, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_A]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__A_Btn(MGBDP_CostTermCalcCtgPtnCopy p){
		p.Btn_open.putMode(p, UPD_A, MCMode.ENABLE);
		p.Btn_srch_cnt.putMode(p, UPD_A, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_A, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_A, MCMode.ENABLE);
		p.Btn_upd_c.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.Btn_upd_t.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.Btn_upd_pln.putMode(p, UPD_A, MCMode.INVISIBLE);
		p.Btn_upd_act.putMode(p, UPD_A, MCMode.ENABLE);

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
		MGBDP_CostTermCalcCtgPtnCopy_MC.setTableConfigDtl((MGBDP_CostTermCalcCtgPtnCopy)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_CostTermCalcCtgPtnCopy p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_tab_ctg_typ.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.tab_ctg_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tab_ctg_typ);
		p.columnDtl_tab_ctg_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.tab_ctg_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tab_ctg_typ_nm);
		p.columnDtl_list_sort.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.list_sort_META);
		p.DtlTable.addColumnConfig(p.columnDtl_list_sort);
		p.columnDtl_cost_copy_typ.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.cost_copy_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_copy_typ);
		p.columnDtl_cost_copy_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.cost_copy_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_copy_typ_nm);
		p.columnDtl_cost_copy_typ_key.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.cost_copy_typ_key_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_copy_typ_key);
		p.columnDtl_module_id.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.module_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_module_id);
		p.columnDtl_screen_id.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.screen_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_screen_id);
		p.columnDtl_cnt_fr.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.cnt_fr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cnt_fr);
		p.columnDtl_cnt_to.setMeta(mcframe.clientMGBD.MGBDP0300.DtlR.cnt_to_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cnt_to);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_tab_ctg_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tab_ctg_typ.getListConfig().setPutter(getCnd_tab_ctg_typ_ListPutter());
		Cnd_cost_copy_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_copy_typ.getListConfig().setPutter(getCnd_cost_copy_typ_ListPutter());
		Fr_calc_ctg_cd_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Fr_calc_ctg_cd_fr.getListConfig().setPutter(getFr_calc_ctg_cd_fr_ListPutter());
		Fr_calc_ctg_cd_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Fr_calc_ctg_cd_to.getListConfig().setPutter(getFr_calc_ctg_cd_to_ListPutter());
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
	 * この画面を[UPD_C]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CStatus() {
		status = UPD_C;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_T]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_TStatus() {
		status = UPD_T;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_P]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_PStatus() {
		status = UPD_P;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_A]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_AStatus() {
		status = UPD_A;
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
		else if (UPD_C.equals(status)) {
			setUPD_CStatus();
		}
		else if (UPD_T.equals(status)) {
			setUPD_TStatus();
		}
		else if (UPD_P.equals(status)) {
			setUPD_PStatus();
		}
		else if (UPD_A.equals(status)) {
			setUPD_AStatus();
		}
	}

	/**
	 * [Cnd_tab_ctg_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tab_ctg_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.TabCtgTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_copy_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_copy_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CostCopyTyp");
		return lp;
	}
	 
	/**
	 * [Fr_calc_ctg_cd_fr_ListPutter]の作成
	 */
	protected MCListPutter createFr_calc_ctg_cd_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Fr_calc_ctg_cd_to_ListPutter]の作成
	 */
	protected MCListPutter createFr_calc_ctg_cd_to_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_tab_ctg_typ) return getCnd_tab_ctg_typ(row, info);
		if(combo == Cnd_cost_copy_typ) return getCnd_cost_copy_typ(row, info);
		if(combo == Fr_calc_ctg_cd_fr) return getFr_calc_ctg_cd_fr(row, info);
		if(combo == Fr_calc_ctg_cd_to) return getFr_calc_ctg_cd_to(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_open) doBtn_open(info);
		else if (ap == Btn_srch_cnt) doBtn_srch_cnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_c) doBtn_upd_c(info);
		else if (ap == Btn_upd_t) doBtn_upd_t(info);
		else if (ap == Btn_upd_pln) doBtn_upd_pln(info);
		else if (ap == Btn_upd_act) doBtn_upd_act(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_cnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_cnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_c]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_c(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_t]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_t(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_pln]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_pln(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_act(MCEventInfo info);

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
		if (vc == Cnd_tab_ctg_typ) return doCnd_tab_ctg_typ_VC(info);
		if (vc == Cnd_tab_ctg_typ_nm) return doCnd_tab_ctg_typ_nm_VC(info);
		if (vc == Cnd_cost_copy_typ) return doCnd_cost_copy_typ_VC(info);
		if (vc == Cnd_cost_copy_typ_nm) return doCnd_cost_copy_typ_nm_VC(info);
		if (vc == Fr_calc_ctg_cd_fr) return doFr_calc_ctg_cd_fr_VC(info);
		if (vc == Fr_calc_ctg_nm_fr) return doFr_calc_ctg_nm_fr_VC(info);
		if (vc == Fr_calc_ctg_cd_to) return doFr_calc_ctg_cd_to_VC(info);
		if (vc == Fr_calc_ctg_nm_to) return doFr_calc_ctg_nm_to_VC(info);
		if (vc == Fr_ym_fr) return doFr_ym_fr_VC(info);
		if (vc == Fr_ym_to) return doFr_ym_to_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_tab_ctg_typ) return doDtl_tab_ctg_typ_VC(info);
		if (vc == columnDtl_tab_ctg_typ_nm) return doDtl_tab_ctg_typ_nm_VC(info);
		if (vc == columnDtl_list_sort) return doDtl_list_sort_VC(info);
		if (vc == columnDtl_cost_copy_typ) return doDtl_cost_copy_typ_VC(info);
		if (vc == columnDtl_cost_copy_typ_nm) return doDtl_cost_copy_typ_nm_VC(info);
		if (vc == columnDtl_cost_copy_typ_key) return doDtl_cost_copy_typ_key_VC(info);
		if (vc == columnDtl_module_id) return doDtl_module_id_VC(info);
		if (vc == columnDtl_screen_id) return doDtl_screen_id_VC(info);
		if (vc == columnDtl_cnt_fr) return doDtl_cnt_fr_VC(info);
		if (vc == columnDtl_cnt_to) return doDtl_cnt_to_VC(info);
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
	 * [Cnd]パネルの[tab_ctg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tab_ctg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tab_ctg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_copy_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_copy_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_calc_ctg_cd_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_calc_ctg_nm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_calc_ctg_cd_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_calc_ctg_nm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Fr]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFr_ym_to_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[tab_ctg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tab_ctg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tab_ctg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[list_sort]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_list_sort_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_copy_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_copy_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_copy_typ_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[module_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_module_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[screen_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_screen_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cnt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cnt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cnt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cnt_to_VC(MCEventInfo info){
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
		else if (nc == Cnd_tab_ctg_typ) doCnd_tab_ctg_typ_NC(info);
		else if (nc == Cnd_tab_ctg_typ_nm) doCnd_tab_ctg_typ_nm_NC(info);
		else if (nc == Cnd_cost_copy_typ) doCnd_cost_copy_typ_NC(info);
		else if (nc == Cnd_cost_copy_typ_nm) doCnd_cost_copy_typ_nm_NC(info);
		else if (nc == Fr_calc_ctg_cd_fr) doFr_calc_ctg_cd_fr_NC(info);
		else if (nc == Fr_calc_ctg_nm_fr) doFr_calc_ctg_nm_fr_NC(info);
		else if (nc == Fr_calc_ctg_cd_to) doFr_calc_ctg_cd_to_NC(info);
		else if (nc == Fr_calc_ctg_nm_to) doFr_calc_ctg_nm_to_NC(info);
		else if (nc == Fr_ym_fr) doFr_ym_fr_NC(info);
		else if (nc == Fr_ym_to) doFr_ym_to_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_tab_ctg_typ) doDtl_tab_ctg_typ_NC(info);
		else if (nc == columnDtl_tab_ctg_typ_nm) doDtl_tab_ctg_typ_nm_NC(info);
		else if (nc == columnDtl_list_sort) doDtl_list_sort_NC(info);
		else if (nc == columnDtl_cost_copy_typ) doDtl_cost_copy_typ_NC(info);
		else if (nc == columnDtl_cost_copy_typ_nm) doDtl_cost_copy_typ_nm_NC(info);
		else if (nc == columnDtl_cost_copy_typ_key) doDtl_cost_copy_typ_key_NC(info);
		else if (nc == columnDtl_module_id) doDtl_module_id_NC(info);
		else if (nc == columnDtl_screen_id) doDtl_screen_id_NC(info);
		else if (nc == columnDtl_cnt_fr) doDtl_cnt_fr_NC(info);
		else if (nc == columnDtl_cnt_to) doDtl_cnt_to_NC(info);
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
	 * [Cnd]パネルの[tab_ctg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_fr_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_to_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_to_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_sort]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_sort_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_key_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[screen_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_screen_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_to_NC(MCEventInfo info){
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
		else if (ne == Cnd_tab_ctg_typ) doCnd_tab_ctg_typ_NE(info);
		else if (ne == Cnd_tab_ctg_typ_nm) doCnd_tab_ctg_typ_nm_NE(info);
		else if (ne == Cnd_cost_copy_typ) doCnd_cost_copy_typ_NE(info);
		else if (ne == Cnd_cost_copy_typ_nm) doCnd_cost_copy_typ_nm_NE(info);
		else if (ne == Fr_calc_ctg_cd_fr) doFr_calc_ctg_cd_fr_NE(info);
		else if (ne == Fr_calc_ctg_nm_fr) doFr_calc_ctg_nm_fr_NE(info);
		else if (ne == Fr_calc_ctg_cd_to) doFr_calc_ctg_cd_to_NE(info);
		else if (ne == Fr_calc_ctg_nm_to) doFr_calc_ctg_nm_to_NE(info);
		else if (ne == Fr_ym_fr) doFr_ym_fr_NE(info);
		else if (ne == Fr_ym_to) doFr_ym_to_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_tab_ctg_typ) doDtl_tab_ctg_typ_NE(info);
		else if (ne == columnDtl_tab_ctg_typ_nm) doDtl_tab_ctg_typ_nm_NE(info);
		else if (ne == columnDtl_list_sort) doDtl_list_sort_NE(info);
		else if (ne == columnDtl_cost_copy_typ) doDtl_cost_copy_typ_NE(info);
		else if (ne == columnDtl_cost_copy_typ_nm) doDtl_cost_copy_typ_nm_NE(info);
		else if (ne == columnDtl_cost_copy_typ_key) doDtl_cost_copy_typ_key_NE(info);
		else if (ne == columnDtl_module_id) doDtl_module_id_NE(info);
		else if (ne == columnDtl_screen_id) doDtl_screen_id_NE(info);
		else if (ne == columnDtl_cnt_fr) doDtl_cnt_fr_NE(info);
		else if (ne == columnDtl_cnt_to) doDtl_cnt_to_NE(info);
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
	 * [Cnd]パネルの[tab_ctg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_fr_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_to_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_to_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_sort]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_sort_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_key_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[screen_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_screen_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_to_NE(MCEventInfo info){
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
		else if (nx == Cnd_tab_ctg_typ) doCnd_tab_ctg_typ_NX(info);
		else if (nx == Cnd_tab_ctg_typ_nm) doCnd_tab_ctg_typ_nm_NX(info);
		else if (nx == Cnd_cost_copy_typ) doCnd_cost_copy_typ_NX(info);
		else if (nx == Cnd_cost_copy_typ_nm) doCnd_cost_copy_typ_nm_NX(info);
		else if (nx == Fr_calc_ctg_cd_fr) doFr_calc_ctg_cd_fr_NX(info);
		else if (nx == Fr_calc_ctg_nm_fr) doFr_calc_ctg_nm_fr_NX(info);
		else if (nx == Fr_calc_ctg_cd_to) doFr_calc_ctg_cd_to_NX(info);
		else if (nx == Fr_calc_ctg_nm_to) doFr_calc_ctg_nm_to_NX(info);
		else if (nx == Fr_ym_fr) doFr_ym_fr_NX(info);
		else if (nx == Fr_ym_to) doFr_ym_to_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_tab_ctg_typ) doDtl_tab_ctg_typ_NX(info);
		else if (nx == columnDtl_tab_ctg_typ_nm) doDtl_tab_ctg_typ_nm_NX(info);
		else if (nx == columnDtl_list_sort) doDtl_list_sort_NX(info);
		else if (nx == columnDtl_cost_copy_typ) doDtl_cost_copy_typ_NX(info);
		else if (nx == columnDtl_cost_copy_typ_nm) doDtl_cost_copy_typ_nm_NX(info);
		else if (nx == columnDtl_cost_copy_typ_key) doDtl_cost_copy_typ_key_NX(info);
		else if (nx == columnDtl_module_id) doDtl_module_id_NX(info);
		else if (nx == columnDtl_screen_id) doDtl_screen_id_NX(info);
		else if (nx == columnDtl_cnt_fr) doDtl_cnt_fr_NX(info);
		else if (nx == columnDtl_cnt_to) doDtl_cnt_to_NX(info);
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
	 * [Cnd]パネルの[tab_ctg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_fr_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_to_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_to_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_sort]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_sort_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_key_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[screen_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_screen_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_to_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_tab_ctg_typ) doCnd_tab_ctg_typ_LC(info);
		else if (lc == Cnd_tab_ctg_typ_nm) doCnd_tab_ctg_typ_nm_LC(info);
		else if (lc == Cnd_cost_copy_typ) doCnd_cost_copy_typ_LC(info);
		else if (lc == Cnd_cost_copy_typ_nm) doCnd_cost_copy_typ_nm_LC(info);
		else if (lc == Fr_calc_ctg_cd_fr) doFr_calc_ctg_cd_fr_LC(info);
		else if (lc == Fr_calc_ctg_nm_fr) doFr_calc_ctg_nm_fr_LC(info);
		else if (lc == Fr_calc_ctg_cd_to) doFr_calc_ctg_cd_to_LC(info);
		else if (lc == Fr_calc_ctg_nm_to) doFr_calc_ctg_nm_to_LC(info);
		else if (lc == Fr_ym_fr) doFr_ym_fr_LC(info);
		else if (lc == Fr_ym_to) doFr_ym_to_LC(info);
		else if (lc == columnDtl_tab_ctg_typ) doDtl_tab_ctg_typ_LC(info);
		else if (lc == columnDtl_tab_ctg_typ_nm) doDtl_tab_ctg_typ_nm_LC(info);
		else if (lc == columnDtl_list_sort) doDtl_list_sort_LC(info);
		else if (lc == columnDtl_cost_copy_typ) doDtl_cost_copy_typ_LC(info);
		else if (lc == columnDtl_cost_copy_typ_nm) doDtl_cost_copy_typ_nm_LC(info);
		else if (lc == columnDtl_cost_copy_typ_key) doDtl_cost_copy_typ_key_LC(info);
		else if (lc == columnDtl_module_id) doDtl_module_id_LC(info);
		else if (lc == columnDtl_screen_id) doDtl_screen_id_LC(info);
		else if (lc == columnDtl_cnt_fr) doDtl_cnt_fr_LC(info);
		else if (lc == columnDtl_cnt_to) doDtl_cnt_to_LC(info);
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tab_ctg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tab_ctg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_copy_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_copy_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_fr_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_cd_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_cd_to_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[calc_ctg_nm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_calc_ctg_nm_to_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Fr]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFr_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tab_ctg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tab_ctg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[list_sort]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_list_sort_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_copy_typ_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_copy_typ_key_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[screen_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_screen_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnt_to_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_tab_ctg_typ]の作成メソッド
	 */
	public MCList getCnd_tab_ctg_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getTabCtgTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_copy_typ]の作成メソッド
	 */
	public MCList getCnd_cost_copy_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCostCopyTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Fr_calc_ctg_cd_fr]の作成メソッド
	 */
	public MCList getFr_calc_ctg_cd_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Fr_calc_ctg_cd_to]の作成メソッド
	 */
	public MCList getFr_calc_ctg_cd_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0300.Ins01")) {
			return new MG_MGBDL0300_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0300.Ins02")) {
			return new MG_MGBDL0300_Ins02Bridge();
		}
		if (id.equals("MG.MGBDL0300.Ins03")) {
			return new MG_MGBDL0300_Ins03Bridge();
		}
		if (id.equals("MG.MGBDL0300.Ins04")) {
			return new MG_MGBDL0300_Ins04Bridge();
		}
		if (id.equals("MG.MGBDL0300.Srch01")) {
			return new MG_MGBDL0300_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0300_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0300_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0300_Ins01Bridge() {
			p_MG_MGBDL0300_Ins01 = new MCParam(PDef.MG_MGBDL0300_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0300_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0300.FrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
			// Down

			p_MG_MGBDL0300_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0300_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0300_Ins01.addUpBlock(getFrR());
			p_MG_MGBDL0300_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0300_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0300_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0300.FrR up0() {
			return (mcframe.clientMGBD.MGBDP0300.FrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0300_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getFrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0300_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0300_Ins02;

		/** コンストラクタ */
		protected MG_MGBDL0300_Ins02Bridge() {
			p_MG_MGBDL0300_Ins02 = new MCParam(PDef.MG_MGBDL0300_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0300_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0300.FrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
			// Down

			p_MG_MGBDL0300_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0300_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0300_Ins02.addUpBlock(getFrR());
			p_MG_MGBDL0300_Ins02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0300_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0300_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0300.FrR up0() {
			return (mcframe.clientMGBD.MGBDP0300.FrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0300_Ins02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getFrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0300_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0300_Ins03;

		/** コンストラクタ */
		protected MG_MGBDL0300_Ins03Bridge() {
			p_MG_MGBDL0300_Ins03 = new MCParam(PDef.MG_MGBDL0300_Ins03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0300_Ins03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0300.FrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
			// Down

			p_MG_MGBDL0300_Ins03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0300_Ins03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0300_Ins03.addUpBlock(getFrR());
			p_MG_MGBDL0300_Ins03.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0300_Ins03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0300_Ins03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0300.FrR up0() {
			return (mcframe.clientMGBD.MGBDP0300.FrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0300_Ins03;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getFrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0300_Ins04]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0300_Ins04;

		/** コンストラクタ */
		protected MG_MGBDL0300_Ins04Bridge() {
			p_MG_MGBDL0300_Ins04 = new MCParam(PDef.MG_MGBDL0300_Ins04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0300_Ins04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0300.FrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
			// Down

			p_MG_MGBDL0300_Ins04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0300_Ins04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0300_Ins04.addUpBlock(getFrR());
			p_MG_MGBDL0300_Ins04.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0300_Ins04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0300_Ins04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0300.FrR up0() {
			return (mcframe.clientMGBD.MGBDP0300.FrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0300_Ins04;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getFrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0300_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0300_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0300_Srch01Bridge() {
			p_MG_MGBDL0300_Srch01 = new MCParam(PDef.MG_MGBDL0300_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0300_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0300.FrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));

			p_MG_MGBDL0300_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0300_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0300_Srch01.addUpBlock(getFrR());
			p_MG_MGBDL0300_Srch01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0300_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0300_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0300.FrR up0() {
			return (mcframe.clientMGBD.MGBDP0300.FrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0300.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0300_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0300.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0300_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0300.DtlR>)p_MG_MGBDL0300_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getFrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}