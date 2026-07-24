package mcframe.clientMGBA.MGBAP0200;

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
import mcframe.clientMGBA.MGBAP0200.MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins01Caller;
import mcframe.clientMGBA.MGBAP0200.MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins02Caller;

/**
 * 画面"MGBAP_ActPlnCopy"パネルクラスです。<p>
 *
 * 実績ＩＦデータを計画データにコピーします。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAP_ActPlnCopy_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBAP0200";

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
	 * MLY,Copy by month;SMR,Aggregate and copy MLY,年月別にコピーする;SMR,集計してコピーする.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_MLY = null;
	public MCRadioButton Cnd_ope_SMR = null;
	public MCLabel Cnd_act_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_calc_ctg_cd = null;
	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_act_calc_ctg_nm = null;
	public MCLabel Cnd_act_ym_fr_Label = null;
	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_act_ym_fr = null;
	public MCLabel Cnd_act_ym_to_Label = null;
	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_act_ym_to = null;
	public MCLabel Cnd_pln_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pln_calc_ctg_cd = null;
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_pln_calc_ctg_nm = null;
	public MCLabel Cnd_pln_ym_fr_Label = null;
	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pln_ym_fr = null;
	public MCLabel Cnd_pln_ym_to_Label = null;
	/**
	 * Month TO (Copy to) コピー先年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pln_ym_to = null;
	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public MCCheckBox Cnd_amt_flg = null;
	/**
	 * BCUR,Base currency;TRD,Transaction currency BCUR,基準通貨;TRD,取引通貨.<p>
	 *
	 */
	public MCButtonGroup Cnd_amt_Group = null;
	public MCRadioButton Cnd_amt_BCUR = null;
	public MCRadioButton Cnd_amt_TRD = null;
	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_flg = null;
	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_flg = null;
	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_flg = null;
	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_wk_flg = null;
	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public MCCheckBox Cnd_other_wk_flg = null;
	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_flg = null;
	// [Src]ブロック関連のField定義
	public MCPanel SrcPanel = null;
	public MCTitledBorder SrcTitledBorder = null;
	// [Src]ブロックの項目のField定義
	// [Dest]ブロック関連のField定義
	public MCPanel DestPanel = null;
	public MCTitledBorder DestTitledBorder = null;
	// [Dest]ブロックの項目のField定義
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	public MCButton Btn_upd_mly = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_smr = null;
	/**
	 * Mfg. plan entry 製造計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0030 = null;
	/**
	 * Purchase plan entry 購買計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0040 = null;
	/**
	 * Input plan entry 投入計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0070 = null;
	/**
	 * Item man-hour plan entry 品目工数計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0050 = null;
	/**
	 * Indirect man-hour plan entry 品目外工数計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0060 = null;
	/**
	 * Sales plan entry 売上計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0010 = null;
	/**
	 * Mfg. result IF 製造実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0300 = null;
	/**
	 * Purchasing result IF 購買実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0310 = null;
	/**
	 * Input result IF 投入実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0320 = null;
	/**
	 * Order direct man-hour result IF 指図工数実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0330 = null;
	/**
	 * Indirect man-hour result IF 指図外工数実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0340 = null;
	/**
	 * Sales result IF 売上実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0370 = null;
	/** [INS_MLY]モードを表す定数 */
	public static final String INS_MLY = "INS_MLY";
	/** [INS_SMR]モードを表す定数 */
	public static final String INS_SMR = "INS_SMR";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS_MLY, INS_SMR, FIX};
	
	/** [MG_MGBAL0200_Ins01]のCallerの作成 */
	protected MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins01Caller createMG_MGBAL0200_Ins01() {
		MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins01Caller<MGBAP_ActPlnCopy, MG_MGBAL0200_Ins01Bridge>
		caller = ((MGBAP_ActPlnCopy_MC)this).new MG_MGBAL0200_Ins01Caller<MGBAP_ActPlnCopy, MG_MGBAL0200_Ins01Bridge>(
					(MGBAP_ActPlnCopy)this, new MG_MGBAL0200_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBAL0200_Ins01]の呼び出し */
	protected void callMG_MGBAL0200_Ins01() {
		MCCaller caller = createMG_MGBAL0200_Ins01();
		caller.exec();
	}
	/** [MG_MGBAL0200_Ins02]のCallerの作成 */
	protected MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins02Caller createMG_MGBAL0200_Ins02() {
		MGBAP_ActPlnCopy_MC.MG_MGBAL0200_Ins02Caller<MGBAP_ActPlnCopy, MG_MGBAL0200_Ins02Bridge>
		caller = ((MGBAP_ActPlnCopy_MC)this).new MG_MGBAL0200_Ins02Caller<MGBAP_ActPlnCopy, MG_MGBAL0200_Ins02Bridge>(
					(MGBAP_ActPlnCopy)this, new MG_MGBAL0200_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBAL0200_Ins02]の呼び出し */
	protected void callMG_MGBAL0200_Ins02() {
		MCCaller caller = createMG_MGBAL0200_Ins02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBA.MGBAP0200.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBA.MGBAP0200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0200.CndR createCndR() {
		return mcframe.clientMGBA.MGBAP0200.CndR.create();
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
		ret.add(SrcPanel);
		ret.add(DestPanel);
		ret.add(TgtPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBAP_ActPlnCopy_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBAP_ActPlnCopy_MC.jbCreateScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbCreateCnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbCreateSrc((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbCreateDest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbCreateTgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbCreateBtn((MGBAP_ActPlnCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBAP_ActPlnCopy p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBAP_ActPlnCopy p) {
	}

	/**
	 * [Src]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrc(MGBAP_ActPlnCopy p) {
	}

	/**
	 * [Dest]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDest(MGBAP_ActPlnCopy p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBAP_ActPlnCopy p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBAP_ActPlnCopy p) {
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

	
	/** [Cnd_act_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_calc_ctg_cd_p = null;

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_calc_ctg_cd_ListPutter() {
		if (Cnd_act_calc_ctg_cd_p == null) {
			Cnd_act_calc_ctg_cd_p = createCnd_act_calc_ctg_cd_ListPutter(Cnd_act_calc_ctg_cd, "act_calc_ctg_cd", "act_calc_ctg_nm");

		}
		return Cnd_act_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_pln_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pln_calc_ctg_cd_p = null;

	/**
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pln_calc_ctg_cd_ListPutter() {
		if (Cnd_pln_calc_ctg_cd_p == null) {
			Cnd_pln_calc_ctg_cd_p = createCnd_pln_calc_ctg_cd_ListPutter(Cnd_pln_calc_ctg_cd, "pln_calc_ctg_cd", "pln_calc_ctg_nm");

		}
		return Cnd_pln_calc_ctg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_ActPlnCopy create(){
		MGBAP_ActPlnCopy p = new MGBAP_ActPlnCopy();
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
		MGBAP_ActPlnCopy_MC.jbfInitScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbfInitCnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbfInitSrc((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbfInitDest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbfInitTgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbfInitBtn((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitCnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitSrc((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitDest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitTgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.jbInitBtn((MGBAP_ActPlnCopy)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_MLY = p.beansFactory.createRadioButton("Cnd.ope_MLY");
		p.Cnd_ope_SMR = p.beansFactory.createRadioButton("Cnd.ope_SMR");
		p.Cnd_act_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.act_calc_ctg_cd_Label");
		p.Cnd_act_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.act_calc_ctg_cd");
		p.Cnd_act_calc_ctg_cd.setLabel(p.Cnd_act_calc_ctg_cd_Label);
		p.Cnd_act_calc_ctg_nm = p.beansFactory.createTextField("Cnd.act_calc_ctg_nm");
		p.Cnd_act_ym_fr_Label = p.beansFactory.createLabel("Cnd.act_ym_fr_Label");
		p.Cnd_act_ym_fr = p.beansFactory.createDateField("Cnd.act_ym_fr");
		p.Cnd_act_ym_fr.setLabel(p.Cnd_act_ym_fr_Label);
		p.Cnd_act_ym_to_Label = p.beansFactory.createLabel("Cnd.act_ym_to_Label");
		p.Cnd_act_ym_to = p.beansFactory.createDateField("Cnd.act_ym_to");
		p.Cnd_act_ym_to.setLabel(p.Cnd_act_ym_to_Label);
		p.Cnd_pln_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.pln_calc_ctg_cd_Label");
		p.Cnd_pln_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.pln_calc_ctg_cd");
		p.Cnd_pln_calc_ctg_cd.setLabel(p.Cnd_pln_calc_ctg_cd_Label);
		p.Cnd_pln_calc_ctg_nm = p.beansFactory.createTextField("Cnd.pln_calc_ctg_nm");
		p.Cnd_pln_ym_fr_Label = p.beansFactory.createLabel("Cnd.pln_ym_fr_Label");
		p.Cnd_pln_ym_fr = p.beansFactory.createDateField("Cnd.pln_ym_fr");
		p.Cnd_pln_ym_fr.setLabel(p.Cnd_pln_ym_fr_Label);
		p.Cnd_pln_ym_to_Label = p.beansFactory.createLabel("Cnd.pln_ym_to_Label");
		p.Cnd_pln_ym_to = p.beansFactory.createDateField("Cnd.pln_ym_to");
		p.Cnd_pln_ym_to.setLabel(p.Cnd_pln_ym_to_Label);
		p.Cnd_amt_flg = p.beansFactory.createCheckBox("Cnd.amt_flg");
		p.Cnd_amt_Group = p.beansFactory.createButtonGroup("Cnd.amt");
		p.Cnd_amt_BCUR = p.beansFactory.createRadioButton("Cnd.amt_BCUR");
		p.Cnd_amt_TRD = p.beansFactory.createRadioButton("Cnd.amt_TRD");
		p.Cnd_mfg_flg = p.beansFactory.createCheckBox("Cnd.mfg_flg");
		p.Cnd_purc_flg = p.beansFactory.createCheckBox("Cnd.purc_flg");
		p.Cnd_inpt_flg = p.beansFactory.createCheckBox("Cnd.inpt_flg");
		p.Cnd_itm_wk_flg = p.beansFactory.createCheckBox("Cnd.itm_wk_flg");
		p.Cnd_other_wk_flg = p.beansFactory.createCheckBox("Cnd.other_wk_flg");
		p.Cnd_sls_flg = p.beansFactory.createCheckBox("Cnd.sls_flg");
	}

	/**
	 * [Src]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrc(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.SrcPanel = p.beansFactory.createPanel("Src");
		p.SrcTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dest]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDest(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.DestPanel = p.beansFactory.createPanel("Dest");
		p.DestTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_mly = p.beansFactory.createButton("Btn.upd_mly", "upd");
		p.Btn_upd_smr = p.beansFactory.createButton("Btn.upd_smr", "upd");
		p.Btn_open_MGBAP0030 = p.beansFactory.createButton("Btn.open_MGBAP0030", "open");
		p.Btn_open_MGBAP0040 = p.beansFactory.createButton("Btn.open_MGBAP0040", "open");
		p.Btn_open_MGBAP0070 = p.beansFactory.createButton("Btn.open_MGBAP0070", "open");
		p.Btn_open_MGBAP0050 = p.beansFactory.createButton("Btn.open_MGBAP0050", "open");
		p.Btn_open_MGBAP0060 = p.beansFactory.createButton("Btn.open_MGBAP0060", "open");
		p.Btn_open_MGBAP0010 = p.beansFactory.createButton("Btn.open_MGBAP0010", "open");
		p.Btn_open_MGBBP0300 = p.beansFactory.createButton("Btn.open_MGBBP0300", "open");
		p.Btn_open_MGBBP0310 = p.beansFactory.createButton("Btn.open_MGBBP0310", "open");
		p.Btn_open_MGBBP0320 = p.beansFactory.createButton("Btn.open_MGBBP0320", "open");
		p.Btn_open_MGBBP0330 = p.beansFactory.createButton("Btn.open_MGBBP0330", "open");
		p.Btn_open_MGBBP0340 = p.beansFactory.createButton("Btn.open_MGBBP0340", "open");
		p.Btn_open_MGBBP0370 = p.beansFactory.createButton("Btn.open_MGBBP0370", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrcPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_MLY);
		p.Cnd_ope_MLY.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_MLY);
		p.ScreenOpePanel.add(p.Cnd_ope_MLY);
		p.Cnd_ope_MLY.setNextBeans(p.Cnd_ope_SMR);
		p.Cnd_ope_SMR.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SMR);
		p.ScreenOpePanel.add(p.Cnd_ope_SMR);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.ope_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_act_calc_ctg_cd, true);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.SrcPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.SrcPanel.add(p.Cnd_act_calc_ctg_cd);
		p.SrcPanel.setLastBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.act_calc_ctg_cd_META);
		p.SrcPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_act_ym_fr);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.act_calc_ctg_nm_META);
		p.SrcPanel.add(p.Cnd_act_ym_fr_Label);
		p.SrcPanel.add(p.Cnd_act_ym_fr);
		p.Cnd_act_ym_fr.setNextBeans(p.Cnd_act_ym_to);
		p.Cnd_act_ym_fr.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.act_ym_fr_META);
		p.Cnd_act_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.SrcPanel.add(p.Cnd_act_ym_to_Label);
		p.SrcPanel.add(p.Cnd_act_ym_to);
		p.Cnd_act_ym_to.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.act_ym_to_META);
		p.Cnd_act_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_pln_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_pln_calc_ctg_cd.setLinkBeans(p.Cnd_pln_calc_ctg_nm);
		p.DestPanel.add(p.Cnd_pln_calc_ctg_cd_Label);
		p.DestPanel.add(p.Cnd_pln_calc_ctg_cd);
		p.DestPanel.setLastBeans(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_cd.setNextBeans(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.pln_calc_ctg_cd_META);
		p.DestPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_pln_ym_fr);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.pln_calc_ctg_nm_META);
		p.DestPanel.add(p.Cnd_pln_ym_fr_Label);
		p.DestPanel.add(p.Cnd_pln_ym_fr);
		p.Cnd_pln_ym_fr.setNextBeans(p.Cnd_pln_ym_to);
		p.Cnd_pln_ym_fr.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.pln_ym_fr_META);
		p.Cnd_pln_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DestPanel.add(p.Cnd_pln_ym_to_Label);
		p.DestPanel.add(p.Cnd_pln_ym_to);
		p.Cnd_pln_ym_to.setNextBeans(p.Cnd_amt_flg);
		p.Cnd_pln_ym_to.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.pln_ym_to_META);
		p.Cnd_pln_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DestPanel.add(p.Cnd_amt_flg);
		p.Cnd_amt_flg.setNextBeans(p.Cnd_amt_Group);
		p.Cnd_amt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.amt_flg_META);
		p.Cnd_amt_Group.setFirstBeans(p.Cnd_amt_BCUR);
		p.Cnd_amt_BCUR.setActionCommand("0");
		p.Cnd_amt_Group.add(p.Cnd_amt_BCUR);
		p.DestPanel.add(p.Cnd_amt_BCUR);
		p.Cnd_amt_BCUR.setNextBeans(p.Cnd_amt_TRD);
		p.Cnd_amt_TRD.setActionCommand("1");
		p.Cnd_amt_Group.add(p.Cnd_amt_TRD);
		p.DestPanel.add(p.Cnd_amt_TRD);
		p.Cnd_amt_Group.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.amt_META);
		p.TgtPanel.add(p.Cnd_mfg_flg);
		p.TgtPanel.setLastBeans(p.Cnd_mfg_flg);
		p.Cnd_mfg_flg.setNextBeans(p.Cnd_purc_flg);
		p.Cnd_mfg_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.mfg_flg_META);
		p.TgtPanel.add(p.Cnd_purc_flg);
		p.Cnd_purc_flg.setNextBeans(p.Cnd_inpt_flg);
		p.Cnd_purc_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.purc_flg_META);
		p.TgtPanel.add(p.Cnd_inpt_flg);
		p.Cnd_inpt_flg.setNextBeans(p.Cnd_itm_wk_flg);
		p.Cnd_inpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.inpt_flg_META);
		p.TgtPanel.add(p.Cnd_itm_wk_flg);
		p.Cnd_itm_wk_flg.setNextBeans(p.Cnd_other_wk_flg);
		p.Cnd_itm_wk_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.itm_wk_flg_META);
		p.TgtPanel.add(p.Cnd_other_wk_flg);
		p.Cnd_other_wk_flg.setNextBeans(p.Cnd_sls_flg);
		p.Cnd_other_wk_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.other_wk_flg_META);
		p.TgtPanel.add(p.Cnd_sls_flg);
		p.Cnd_sls_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0200.CndR.sls_flg_META);
	}

	/**
	 * [Src]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrc(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.SrcPanel.setBorder(p.SrcTitledBorder);
		p.add(p.SrcPanel);
		p.SrcPanel.setNextBeans(p.DestPanel);
		p.SrcPanel.setValueCheck(false);
		p.SrcPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrcPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Dest]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDest(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.DestPanel.setBorder(p.DestTitledBorder);
		p.add(p.DestPanel);
		p.DestPanel.setNextBeans(p.TgtPanel);
		p.DestPanel.setValueCheck(false);
		p.DestPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DestPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.BtnPanel);
		p.TgtPanel.setValueCheck(false);
		p.TgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBAP_ActPlnCopy p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_mly);
		p.Btn_upd_mly.setIcon("REGISTER");
		p.Btn_upd_mly.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_mly);
		p.Btn_upd_mly.setNextBeans(p.Btn_upd_smr);
		p.Btn_upd_smr.setIcon("REGISTER");
		p.Btn_upd_smr.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_smr);
		p.Btn_upd_smr.setNextBeans(p.Btn_open_MGBAP0030);
		p.Btn_open_MGBAP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBAP0030);
		p.Btn_open_MGBAP0030.setNextBeans(p.Btn_open_MGBAP0040);
		p.Btn_open_MGBAP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBAP0040);
		p.Btn_open_MGBAP0040.setNextBeans(p.Btn_open_MGBAP0070);
		p.Btn_open_MGBAP0070.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MGBAP0070);
		p.Btn_open_MGBAP0070.setNextBeans(p.Btn_open_MGBAP0050);
		p.Btn_open_MGBAP0050.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MGBAP0050);
		p.Btn_open_MGBAP0050.setNextBeans(p.Btn_open_MGBAP0060);
		p.Btn_open_MGBAP0060.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MGBAP0060);
		p.Btn_open_MGBAP0060.setNextBeans(p.Btn_open_MGBAP0010);
		p.Btn_open_MGBAP0010.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MGBAP0010);
		p.Btn_open_MGBAP0010.setNextBeans(p.Btn_open_MGBBP0300);
		p.Btn_open_MGBBP0300.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_open_MGBBP0300);
		p.Btn_open_MGBBP0300.setNextBeans(p.Btn_open_MGBBP0310);
		p.Btn_open_MGBBP0310.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_open_MGBBP0310);
		p.Btn_open_MGBBP0310.setNextBeans(p.Btn_open_MGBBP0320);
		p.Btn_open_MGBBP0320.setFunctionKey(MCFunctionKey.F18);
		p.BtnPanel.add(p.Btn_open_MGBBP0320);
		p.Btn_open_MGBBP0320.setNextBeans(p.Btn_open_MGBBP0330);
		p.Btn_open_MGBBP0330.setFunctionKey(MCFunctionKey.F19);
		p.BtnPanel.add(p.Btn_open_MGBBP0330);
		p.Btn_open_MGBBP0330.setNextBeans(p.Btn_open_MGBBP0340);
		p.Btn_open_MGBBP0340.setFunctionKey(MCFunctionKey.F20);
		p.BtnPanel.add(p.Btn_open_MGBBP0340);
		p.Btn_open_MGBBP0340.setNextBeans(p.Btn_open_MGBBP0370);
		p.Btn_open_MGBBP0370.setFunctionKey(MCFunctionKey.F21);
		p.BtnPanel.add(p.Btn_open_MGBBP0370);
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
		MGBAP_ActPlnCopy_MC.mcInitScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.mcInitCnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.mcInitSrc((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.mcInitDest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.mcInitTgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.mcInitBtn((MGBAP_ActPlnCopy)this);

		// [INS_MLY]ステータスのモードの設定
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_ScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_Cnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_Src((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_Dest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_Tgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__MLY_Btn((MGBAP_ActPlnCopy)this);

		// [INS_SMR]ステータスのモードの設定
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_ScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_Cnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_Src((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_Dest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_Tgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitINS__SMR_Btn((MGBAP_ActPlnCopy)this);

		// [FIX]ステータスのモードの設定
		MGBAP_ActPlnCopy_MC.statusInitFIX_ScreenOpe((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitFIX_Cnd((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitFIX_Src((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitFIX_Dest((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitFIX_Tgt((MGBAP_ActPlnCopy)this);
		MGBAP_ActPlnCopy_MC.statusInitFIX_Btn((MGBAP_ActPlnCopy)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBAP_ActPlnCopy p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBAP_ActPlnCopy p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_MLY.addAllListener(p);
		p.Cnd_ope_SMR.addAllListener(p);
		p.Cnd_act_calc_ctg_cd.setListListener(p);
		p.Cnd_act_calc_ctg_cd.addAllListener(p);
		p.Cnd_act_calc_ctg_nm.setListListener(p);
		p.Cnd_act_calc_ctg_nm.addAllListener(p);
		p.Cnd_act_ym_fr.setListListener(p);
		p.Cnd_act_ym_fr.addAllListener(p);
		p.Cnd_act_ym_to.setListListener(p);
		p.Cnd_act_ym_to.addAllListener(p);
		p.Cnd_pln_calc_ctg_cd.setListListener(p);
		p.Cnd_pln_calc_ctg_cd.addAllListener(p);
		p.Cnd_pln_calc_ctg_nm.setListListener(p);
		p.Cnd_pln_calc_ctg_nm.addAllListener(p);
		p.Cnd_pln_ym_fr.setListListener(p);
		p.Cnd_pln_ym_fr.addAllListener(p);
		p.Cnd_pln_ym_to.setListListener(p);
		p.Cnd_pln_ym_to.addAllListener(p);
		p.Cnd_amt_flg.addAllListener(p);
		p.Cnd_amt_Group.addAllListener(p);
		p.Cnd_amt_BCUR.addAllListener(p);
		p.Cnd_amt_TRD.addAllListener(p);
		p.Cnd_mfg_flg.addAllListener(p);
		p.Cnd_purc_flg.addAllListener(p);
		p.Cnd_inpt_flg.addAllListener(p);
		p.Cnd_itm_wk_flg.addAllListener(p);
		p.Cnd_other_wk_flg.addAllListener(p);
		p.Cnd_sls_flg.addAllListener(p);
	}

	/**
	 *  [Src]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrc(MGBAP_ActPlnCopy p) {
	}

	/**
	 *  [Dest]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDest(MGBAP_ActPlnCopy p) {
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBAP_ActPlnCopy p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBAP_ActPlnCopy p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_mly.addAllListener(p);
		p.Btn_upd_mly.setAPMethodName("doBtn_upd_mly");
		p.Btn_upd_smr.addAllListener(p);
		p.Btn_upd_smr.setAPMethodName("doBtn_upd_smr");
		p.Btn_open_MGBAP0030.addAllListener(p);
		p.Btn_open_MGBAP0030.setAPMethodName("doBtn_open_MGBAP0030");
		p.Btn_open_MGBAP0040.addAllListener(p);
		p.Btn_open_MGBAP0040.setAPMethodName("doBtn_open_MGBAP0040");
		p.Btn_open_MGBAP0070.addAllListener(p);
		p.Btn_open_MGBAP0070.setAPMethodName("doBtn_open_MGBAP0070");
		p.Btn_open_MGBAP0050.addAllListener(p);
		p.Btn_open_MGBAP0050.setAPMethodName("doBtn_open_MGBAP0050");
		p.Btn_open_MGBAP0060.addAllListener(p);
		p.Btn_open_MGBAP0060.setAPMethodName("doBtn_open_MGBAP0060");
		p.Btn_open_MGBAP0010.addAllListener(p);
		p.Btn_open_MGBAP0010.setAPMethodName("doBtn_open_MGBAP0010");
		p.Btn_open_MGBBP0300.addAllListener(p);
		p.Btn_open_MGBBP0300.setAPMethodName("doBtn_open_MGBBP0300");
		p.Btn_open_MGBBP0310.addAllListener(p);
		p.Btn_open_MGBBP0310.setAPMethodName("doBtn_open_MGBBP0310");
		p.Btn_open_MGBBP0320.addAllListener(p);
		p.Btn_open_MGBBP0320.setAPMethodName("doBtn_open_MGBBP0320");
		p.Btn_open_MGBBP0330.addAllListener(p);
		p.Btn_open_MGBBP0330.setAPMethodName("doBtn_open_MGBBP0330");
		p.Btn_open_MGBBP0340.addAllListener(p);
		p.Btn_open_MGBBP0340.setAPMethodName("doBtn_open_MGBBP0340");
		p.Btn_open_MGBBP0370.addAllListener(p);
		p.Btn_open_MGBBP0370.setAPMethodName("doBtn_open_MGBBP0370");
	}

	/**
	 * [INS_MLY]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_ScreenOpe(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_MLY]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_Cnd(MGBAP_ActPlnCopy p){
		p.Cnd_ope_Group.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_cd.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, INS_MLY, MCMode.READ_ONLY);
		p.Cnd_act_ym_fr.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_act_ym_to.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_cd.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, INS_MLY, MCMode.READ_ONLY);
		p.Cnd_pln_ym_fr.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_pln_ym_to.putMode(p, INS_MLY, MCMode.READ_ONLY);
		p.Cnd_amt_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_amt_Group.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_mfg_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_inpt_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_itm_wk_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_other_wk_flg.putMode(p, INS_MLY, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, INS_MLY, MCMode.REQUIRED);

	}

	/**
	 * [INS_MLY]ステータスの[Src]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_Src(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_MLY]ステータスの[Dest]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_Dest(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_MLY]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_Tgt(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_MLY]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__MLY_Btn(MGBAP_ActPlnCopy p){
		p.Btn_select_all.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_upd_mly.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_upd_smr.putMode(p, INS_MLY, MCMode.INVISIBLE);
		p.Btn_open_MGBAP0030.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBAP0040.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBAP0070.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBAP0050.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBAP0060.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBAP0010.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0310.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0340.putMode(p, INS_MLY, MCMode.ENABLE);
		p.Btn_open_MGBBP0370.putMode(p, INS_MLY, MCMode.ENABLE);

	}

	/**
	 * [INS_SMR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_ScreenOpe(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_SMR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_Cnd(MGBAP_ActPlnCopy p){
		p.Cnd_ope_Group.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_cd.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, INS_SMR, MCMode.READ_ONLY);
		p.Cnd_act_ym_fr.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_act_ym_to.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_cd.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, INS_SMR, MCMode.READ_ONLY);
		p.Cnd_pln_ym_fr.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_pln_ym_to.putMode(p, INS_SMR, MCMode.READ_ONLY);
		p.Cnd_amt_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_amt_Group.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_mfg_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_inpt_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_itm_wk_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_other_wk_flg.putMode(p, INS_SMR, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, INS_SMR, MCMode.REQUIRED);

	}

	/**
	 * [INS_SMR]ステータスの[Src]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_Src(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_SMR]ステータスの[Dest]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_Dest(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_SMR]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_Tgt(MGBAP_ActPlnCopy p){

	}

	/**
	 * [INS_SMR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SMR_Btn(MGBAP_ActPlnCopy p){
		p.Btn_select_all.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_upd_mly.putMode(p, INS_SMR, MCMode.INVISIBLE);
		p.Btn_upd_smr.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0030.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0040.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0070.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0050.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0060.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBAP0010.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0310.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0340.putMode(p, INS_SMR, MCMode.ENABLE);
		p.Btn_open_MGBBP0370.putMode(p, INS_SMR, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MGBAP_ActPlnCopy p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MGBAP_ActPlnCopy p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_act_ym_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_act_ym_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_pln_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_pln_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_pln_ym_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_pln_ym_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_amt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_amt_Group.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_inpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_itm_wk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_other_wk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Src]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Src(MGBAP_ActPlnCopy p){

	}

	/**
	 * [FIX]ステータスの[Dest]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dest(MGBAP_ActPlnCopy p){

	}

	/**
	 * [FIX]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tgt(MGBAP_ActPlnCopy p){

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MGBAP_ActPlnCopy p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_mly.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_smr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_open_MGBAP0030.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBAP0040.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBAP0070.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBAP0050.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBAP0060.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBAP0010.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0310.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0340.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MGBBP0370.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS_MLY;
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
		Cnd_act_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_calc_ctg_cd.getListConfig().setPutter(getCnd_act_calc_ctg_cd_ListPutter());
		Cnd_pln_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pln_calc_ctg_cd.getListConfig().setPutter(getCnd_pln_calc_ctg_cd_ListPutter());
	}

	/**
	 * この画面を[INS_MLY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_MLYStatus() {
		status = INS_MLY;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_SMR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SMRStatus() {
		status = INS_SMR;
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
		if (INS_MLY.equals(status)) {
			setINS_MLYStatus();
		}
		else if (INS_SMR.equals(status)) {
			setINS_SMRStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pln_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_pln_calc_ctg_cd) return getCnd_pln_calc_ctg_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_mly) doBtn_upd_mly(info);
		else if (ap == Btn_upd_smr) doBtn_upd_smr(info);
		else if (ap == Btn_open_MGBAP0030) doBtn_open_MGBAP0030(info);
		else if (ap == Btn_open_MGBAP0040) doBtn_open_MGBAP0040(info);
		else if (ap == Btn_open_MGBAP0070) doBtn_open_MGBAP0070(info);
		else if (ap == Btn_open_MGBAP0050) doBtn_open_MGBAP0050(info);
		else if (ap == Btn_open_MGBAP0060) doBtn_open_MGBAP0060(info);
		else if (ap == Btn_open_MGBAP0010) doBtn_open_MGBAP0010(info);
		else if (ap == Btn_open_MGBBP0300) doBtn_open_MGBBP0300(info);
		else if (ap == Btn_open_MGBBP0310) doBtn_open_MGBBP0310(info);
		else if (ap == Btn_open_MGBBP0320) doBtn_open_MGBBP0320(info);
		else if (ap == Btn_open_MGBBP0330) doBtn_open_MGBBP0330(info);
		else if (ap == Btn_open_MGBBP0340) doBtn_open_MGBBP0340(info);
		else if (ap == Btn_open_MGBBP0370) doBtn_open_MGBBP0370(info);
	}

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_mly]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_mly(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_smr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_smr(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBAP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0300]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0300(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0310(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0320]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0320(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0330(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0340]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0340(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0370(MCEventInfo info);

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
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_act_ym_fr) return doCnd_act_ym_fr_VC(info);
		if (vc == Cnd_act_ym_to) return doCnd_act_ym_to_VC(info);
		if (vc == Cnd_pln_calc_ctg_cd) return doCnd_pln_calc_ctg_cd_VC(info);
		if (vc == Cnd_pln_calc_ctg_nm) return doCnd_pln_calc_ctg_nm_VC(info);
		if (vc == Cnd_pln_ym_fr) return doCnd_pln_ym_fr_VC(info);
		if (vc == Cnd_pln_ym_to) return doCnd_pln_ym_to_VC(info);
		if (vc == Cnd_amt_flg) return doCnd_amt_flg_VC(info);
		if (vc == Cnd_amt_Group) return doCnd_amt_VC(info);
		if (vc == Cnd_mfg_flg) return doCnd_mfg_flg_VC(info);
		if (vc == Cnd_purc_flg) return doCnd_purc_flg_VC(info);
		if (vc == Cnd_inpt_flg) return doCnd_inpt_flg_VC(info);
		if (vc == Cnd_itm_wk_flg) return doCnd_itm_wk_flg_VC(info);
		if (vc == Cnd_other_wk_flg) return doCnd_other_wk_flg_VC(info);
		if (vc == Cnd_sls_flg) return doCnd_sls_flg_VC(info);
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
	 * [Cnd]パネルの[act_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_wk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_wk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[other_wk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_other_wk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_act_ym_fr) doCnd_act_ym_fr_NC(info);
		else if (nc == Cnd_act_ym_to) doCnd_act_ym_to_NC(info);
		else if (nc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NC(info);
		else if (nc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NC(info);
		else if (nc == Cnd_pln_ym_fr) doCnd_pln_ym_fr_NC(info);
		else if (nc == Cnd_pln_ym_to) doCnd_pln_ym_to_NC(info);
		else if (nc == Cnd_amt_flg) doCnd_amt_flg_NC(info);
		else if (nc == Cnd_amt_Group) doCnd_amt_NC(info);
		else if (nc == Cnd_mfg_flg) doCnd_mfg_flg_NC(info);
		else if (nc == Cnd_purc_flg) doCnd_purc_flg_NC(info);
		else if (nc == Cnd_inpt_flg) doCnd_inpt_flg_NC(info);
		else if (nc == Cnd_itm_wk_flg) doCnd_itm_wk_flg_NC(info);
		else if (nc == Cnd_other_wk_flg) doCnd_other_wk_flg_NC(info);
		else if (nc == Cnd_sls_flg) doCnd_sls_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_wk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_wk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[other_wk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_other_wk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_act_ym_fr) doCnd_act_ym_fr_NE(info);
		else if (ne == Cnd_act_ym_to) doCnd_act_ym_to_NE(info);
		else if (ne == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NE(info);
		else if (ne == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NE(info);
		else if (ne == Cnd_pln_ym_fr) doCnd_pln_ym_fr_NE(info);
		else if (ne == Cnd_pln_ym_to) doCnd_pln_ym_to_NE(info);
		else if (ne == Cnd_amt_flg) doCnd_amt_flg_NE(info);
		else if (ne == Cnd_amt_Group) doCnd_amt_NE(info);
		else if (ne == Cnd_mfg_flg) doCnd_mfg_flg_NE(info);
		else if (ne == Cnd_purc_flg) doCnd_purc_flg_NE(info);
		else if (ne == Cnd_inpt_flg) doCnd_inpt_flg_NE(info);
		else if (ne == Cnd_itm_wk_flg) doCnd_itm_wk_flg_NE(info);
		else if (ne == Cnd_other_wk_flg) doCnd_other_wk_flg_NE(info);
		else if (ne == Cnd_sls_flg) doCnd_sls_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_wk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_wk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[other_wk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_other_wk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_act_ym_fr) doCnd_act_ym_fr_NX(info);
		else if (nx == Cnd_act_ym_to) doCnd_act_ym_to_NX(info);
		else if (nx == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NX(info);
		else if (nx == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NX(info);
		else if (nx == Cnd_pln_ym_fr) doCnd_pln_ym_fr_NX(info);
		else if (nx == Cnd_pln_ym_to) doCnd_pln_ym_to_NX(info);
		else if (nx == Cnd_amt_flg) doCnd_amt_flg_NX(info);
		else if (nx == Cnd_amt_Group) doCnd_amt_NX(info);
		else if (nx == Cnd_mfg_flg) doCnd_mfg_flg_NX(info);
		else if (nx == Cnd_purc_flg) doCnd_purc_flg_NX(info);
		else if (nx == Cnd_inpt_flg) doCnd_inpt_flg_NX(info);
		else if (nx == Cnd_itm_wk_flg) doCnd_itm_wk_flg_NX(info);
		else if (nx == Cnd_other_wk_flg) doCnd_other_wk_flg_NX(info);
		else if (nx == Cnd_sls_flg) doCnd_sls_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_wk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_wk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[other_wk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_other_wk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_LC(info);
		else if (lc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_LC(info);
		else if (lc == Cnd_act_ym_fr) doCnd_act_ym_fr_LC(info);
		else if (lc == Cnd_act_ym_to) doCnd_act_ym_to_LC(info);
		else if (lc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_LC(info);
		else if (lc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_LC(info);
		else if (lc == Cnd_pln_ym_fr) doCnd_pln_ym_fr_LC(info);
		else if (lc == Cnd_pln_ym_to) doCnd_pln_ym_to_LC(info);
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_ym_to_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_act_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pln_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_pln_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBAL0200.Ins01")) {
			return new MG_MGBAL0200_Ins01Bridge();
		}
		if (id.equals("MG.MGBAL0200.Ins02")) {
			return new MG_MGBAL0200_Ins02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBAL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0200_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBAL0200_Ins01;

		/** コンストラクタ */
		protected MG_MGBAL0200_Ins01Bridge() {
			p_MG_MGBAL0200_Ins01 = new MCParam(PDef.MG_MGBAL0200_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBAL0200_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBA.MGBAP0200.CndR.create());
			// Down

			p_MG_MGBAL0200_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBAL0200_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBAL0200_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBAL0200_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBAL0200_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBA.MGBAP0200.CndR up0() {
			return (mcframe.clientMGBA.MGBAP0200.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBAL0200_Ins01;
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
	 * [MG_MGBAL0200_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0200_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBAL0200_Ins02;

		/** コンストラクタ */
		protected MG_MGBAL0200_Ins02Bridge() {
			p_MG_MGBAL0200_Ins02 = new MCParam(PDef.MG_MGBAL0200_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBAL0200_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBA.MGBAP0200.CndR.create());
			// Down

			p_MG_MGBAL0200_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBAL0200_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBAL0200_Ins02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBAL0200_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBAL0200_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBA.MGBAP0200.CndR up0() {
			return (mcframe.clientMGBA.MGBAP0200.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBAL0200_Ins02;
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