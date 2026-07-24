package mcframe.clientMABG.MABGP0800;

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
 * 画面"MABGP_LoginStsCng"パネルクラスです。<p>
 *
 * 原価会社パラメータマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_LoginStsCng_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0800";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Hdr_term_p_PPanel;
	public MCDateComboBox Hdr_term;	// [Hdr]の[term_p.term]を[Hdr_term]としてエイリアス定義。
	public MCTextField Hdr_term_nm;	// [Hdr]の[term_p.term_nm]を[Hdr_term_nm]としてエイリアス定義。
	public MCLabel Hdr_std_disp_digit_Label = null;
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumberField Hdr_std_disp_digit = null;
	public MCLabel Hdr_amt_disp_digit_Label = null;
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumberField Hdr_amt_disp_digit = null;
	public MCLabel Hdr_unit_disp_digit_Label = null;
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumberField Hdr_unit_disp_digit = null;
	public MCLabel Hdr_rate_disp_digit_Label = null;
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumberField Hdr_rate_disp_digit = null;
	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Hdr_excel_pln_flg = null;
	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Hdr_excel_act_flg = null;
	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Hdr_excel_alc_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Reacquire default info. デフォルト情報再取得.<p>
	 *
	 */
	public MCButton Btn_dflt = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};
	
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0800.HdrR aHdrR;

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABG.MABGP0800.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0800.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0800.HdrR createHdrR() {
		return mcframe.clientMABG.MABGP0800.HdrR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
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
		if(aCnt == getHdrR()) return "Hdr";
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
		if(bId.equals("Hdr")) return getHdrR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(HdrPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_LoginStsCng_MC_A() {
		aHdrR = createHdrR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_LoginStsCng_MC.jbCreateHdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.jbCreateBtn((MABGP_LoginStsCng)this);
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABGP_LoginStsCng p) {
		p.Hdr_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getHdrR().term_p());
		p.Hdr_term_p_PPanel.setName("Hdr.term_p");
		p.Hdr_term = p.Hdr_term_p_PPanel.Term_term;
		p.Hdr_term.addAliasName("Hdr.term", p);
		p.Hdr_term_nm = p.Hdr_term_p_PPanel.Term_term_nm;
		p.Hdr_term_nm.addAliasName("Hdr.term_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_LoginStsCng p) {
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
	public static MABGP_LoginStsCng create(){
		MABGP_LoginStsCng p = new MABGP_LoginStsCng();
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
		MABGP_LoginStsCng_MC.jbfInitHdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.jbfInitBtn((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.jbInitHdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.jbInitBtn((MABGP_LoginStsCng)this);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABGP_LoginStsCng p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_std_disp_digit_Label = p.beansFactory.createLabel("Hdr.std_disp_digit_Label");
		p.Hdr_std_disp_digit = p.beansFactory.createNumberField("Hdr.std_disp_digit");
		p.Hdr_std_disp_digit.setLabel(p.Hdr_std_disp_digit_Label);
		p.Hdr_amt_disp_digit_Label = p.beansFactory.createLabel("Hdr.amt_disp_digit_Label");
		p.Hdr_amt_disp_digit = p.beansFactory.createNumberField("Hdr.amt_disp_digit");
		p.Hdr_amt_disp_digit.setLabel(p.Hdr_amt_disp_digit_Label);
		p.Hdr_unit_disp_digit_Label = p.beansFactory.createLabel("Hdr.unit_disp_digit_Label");
		p.Hdr_unit_disp_digit = p.beansFactory.createNumberField("Hdr.unit_disp_digit");
		p.Hdr_unit_disp_digit.setLabel(p.Hdr_unit_disp_digit_Label);
		p.Hdr_rate_disp_digit_Label = p.beansFactory.createLabel("Hdr.rate_disp_digit_Label");
		p.Hdr_rate_disp_digit = p.beansFactory.createNumberField("Hdr.rate_disp_digit");
		p.Hdr_rate_disp_digit.setLabel(p.Hdr_rate_disp_digit_Label);
		p.Hdr_excel_pln_flg = p.beansFactory.createCheckBox("Hdr.excel_pln_flg");
		p.Hdr_excel_act_flg = p.beansFactory.createCheckBox("Hdr.excel_act_flg");
		p.Hdr_excel_alc_flg = p.beansFactory.createCheckBox("Hdr.excel_alc_flg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_LoginStsCng p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_dflt = p.beansFactory.createButton("Btn.dflt");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABGP_LoginStsCng p) {
		// ブロック関連の初期化
		p.add(p.HdrPanel);
		p.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.BtnPanel);
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_term_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_term_p_PPanel);
		p.Hdr_term_p_PPanel.setNextBeans(p.Hdr_std_disp_digit);
		p.HdrPanel.add(p.Hdr_std_disp_digit_Label);
		p.HdrPanel.add(p.Hdr_std_disp_digit);
		p.Hdr_std_disp_digit.setNextBeans(p.Hdr_amt_disp_digit);
		p.Hdr_std_disp_digit.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.std_disp_digit_META);
		p.HdrPanel.add(p.Hdr_amt_disp_digit_Label);
		p.HdrPanel.add(p.Hdr_amt_disp_digit);
		p.Hdr_amt_disp_digit.setNextBeans(p.Hdr_unit_disp_digit);
		p.Hdr_amt_disp_digit.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.amt_disp_digit_META);
		p.HdrPanel.add(p.Hdr_unit_disp_digit_Label);
		p.HdrPanel.add(p.Hdr_unit_disp_digit);
		p.Hdr_unit_disp_digit.setNextBeans(p.Hdr_rate_disp_digit);
		p.Hdr_unit_disp_digit.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.unit_disp_digit_META);
		p.HdrPanel.add(p.Hdr_rate_disp_digit_Label);
		p.HdrPanel.add(p.Hdr_rate_disp_digit);
		p.Hdr_rate_disp_digit.setNextBeans(p.Hdr_excel_pln_flg);
		p.Hdr_rate_disp_digit.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.rate_disp_digit_META);
		p.HdrPanel.add(p.Hdr_excel_pln_flg);
		p.Hdr_excel_pln_flg.setNextBeans(p.Hdr_excel_act_flg);
		p.Hdr_excel_pln_flg.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.excel_pln_flg_META);
		p.HdrPanel.add(p.Hdr_excel_act_flg);
		p.Hdr_excel_act_flg.setNextBeans(p.Hdr_excel_alc_flg);
		p.Hdr_excel_act_flg.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.excel_act_flg_META);
		p.HdrPanel.add(p.Hdr_excel_alc_flg);
		p.Hdr_excel_alc_flg.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0800.HdrR.excel_alc_flg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_LoginStsCng p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_dflt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_dflt);
		p.BtnPanel.setLastBeans(p.Btn_dflt);
		p.Btn_dflt.setNextBeans(p.Btn_upd);
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABGP_LoginStsCng_MC.mcInitHdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.mcInitBtn((MABGP_LoginStsCng)this);

		// [UPD]ステータスのモードの設定
		MABGP_LoginStsCng_MC.statusInitUPD_Hdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.statusInitUPD_Btn((MABGP_LoginStsCng)this);

		// [FIX]ステータスのモードの設定
		MABGP_LoginStsCng_MC.statusInitFIX_Hdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.statusInitFIX_Btn((MABGP_LoginStsCng)this);

		// [DEL]ステータスのモードの設定
		MABGP_LoginStsCng_MC.statusInitDEL_Hdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.statusInitDEL_Btn((MABGP_LoginStsCng)this);

		// [REF]ステータスのモードの設定
		MABGP_LoginStsCng_MC.statusInitREF_Hdr((MABGP_LoginStsCng)this);
		MABGP_LoginStsCng_MC.statusInitREF_Btn((MABGP_LoginStsCng)this);

	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABGP_LoginStsCng p) {
		p.Hdr_std_disp_digit.setListListener(p);
		p.Hdr_std_disp_digit.addAllListener(p);
		p.Hdr_amt_disp_digit.setListListener(p);
		p.Hdr_amt_disp_digit.addAllListener(p);
		p.Hdr_unit_disp_digit.setListListener(p);
		p.Hdr_unit_disp_digit.addAllListener(p);
		p.Hdr_rate_disp_digit.setListListener(p);
		p.Hdr_rate_disp_digit.addAllListener(p);
		p.Hdr_excel_pln_flg.addAllListener(p);
		p.Hdr_excel_act_flg.addAllListener(p);
		p.Hdr_excel_alc_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_LoginStsCng p) {
		p.Btn_dflt.addAllListener(p);
		p.Btn_dflt.setAPMethodName("doBtn_dflt");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABGP_LoginStsCng p){
		p.Hdr_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Hdr_std_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_amt_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_unit_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rate_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_excel_pln_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_excel_act_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_excel_alc_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_LoginStsCng p){
		p.Btn_dflt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABGP_LoginStsCng p){
		p.Hdr_term_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_std_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_amt_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_unit_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rate_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_excel_pln_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_excel_act_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_excel_alc_flg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_LoginStsCng p){
		p.Btn_dflt.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABGP_LoginStsCng p){
		p.Hdr_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_std_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_amt_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_unit_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rate_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_excel_pln_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_excel_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_excel_alc_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_LoginStsCng p){
		p.Btn_dflt.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABGP_LoginStsCng p){
		p.Hdr_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_std_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_amt_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_unit_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rate_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_excel_pln_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_excel_act_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_excel_alc_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_LoginStsCng p){
		p.Btn_dflt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
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
		if (ap == Btn_dflt) doBtn_dflt(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Btn]パネルの[dflt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dflt(MCEventInfo info);

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
		if (vc == Hdr_std_disp_digit) return doHdr_std_disp_digit_VC(info);
		if (vc == Hdr_amt_disp_digit) return doHdr_amt_disp_digit_VC(info);
		if (vc == Hdr_unit_disp_digit) return doHdr_unit_disp_digit_VC(info);
		if (vc == Hdr_rate_disp_digit) return doHdr_rate_disp_digit_VC(info);
		if (vc == Hdr_excel_pln_flg) return doHdr_excel_pln_flg_VC(info);
		if (vc == Hdr_excel_act_flg) return doHdr_excel_act_flg_VC(info);
		if (vc == Hdr_excel_alc_flg) return doHdr_excel_alc_flg_VC(info);
		return true;
	}

	/**
	 * [Hdr]パネルの[std_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[amt_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rate_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rate_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[excel_pln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_excel_pln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[excel_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_excel_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[excel_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_excel_alc_flg_VC(MCEventInfo info){
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
		if (nc == Hdr_std_disp_digit) doHdr_std_disp_digit_NC(info);
		else if (nc == Hdr_amt_disp_digit) doHdr_amt_disp_digit_NC(info);
		else if (nc == Hdr_unit_disp_digit) doHdr_unit_disp_digit_NC(info);
		else if (nc == Hdr_rate_disp_digit) doHdr_rate_disp_digit_NC(info);
		else if (nc == Hdr_excel_pln_flg) doHdr_excel_pln_flg_NC(info);
		else if (nc == Hdr_excel_act_flg) doHdr_excel_act_flg_NC(info);
		else if (nc == Hdr_excel_alc_flg) doHdr_excel_alc_flg_NC(info);
	}

	/**
	 * [Hdr]パネルの[std_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rate_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rate_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_pln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_pln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Hdr_std_disp_digit) doHdr_std_disp_digit_NE(info);
		else if (ne == Hdr_amt_disp_digit) doHdr_amt_disp_digit_NE(info);
		else if (ne == Hdr_unit_disp_digit) doHdr_unit_disp_digit_NE(info);
		else if (ne == Hdr_rate_disp_digit) doHdr_rate_disp_digit_NE(info);
		else if (ne == Hdr_excel_pln_flg) doHdr_excel_pln_flg_NE(info);
		else if (ne == Hdr_excel_act_flg) doHdr_excel_act_flg_NE(info);
		else if (ne == Hdr_excel_alc_flg) doHdr_excel_alc_flg_NE(info);
	}

	/**
	 * [Hdr]パネルの[std_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rate_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rate_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_pln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_pln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Hdr_std_disp_digit) doHdr_std_disp_digit_NX(info);
		else if (nx == Hdr_amt_disp_digit) doHdr_amt_disp_digit_NX(info);
		else if (nx == Hdr_unit_disp_digit) doHdr_unit_disp_digit_NX(info);
		else if (nx == Hdr_rate_disp_digit) doHdr_rate_disp_digit_NX(info);
		else if (nx == Hdr_excel_pln_flg) doHdr_excel_pln_flg_NX(info);
		else if (nx == Hdr_excel_act_flg) doHdr_excel_act_flg_NX(info);
		else if (nx == Hdr_excel_alc_flg) doHdr_excel_alc_flg_NX(info);
	}

	/**
	 * [Hdr]パネルの[std_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rate_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rate_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_pln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_pln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[excel_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_excel_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_std_disp_digit) doHdr_std_disp_digit_LC(info);
		else if (lc == Hdr_amt_disp_digit) doHdr_amt_disp_digit_LC(info);
		else if (lc == Hdr_unit_disp_digit) doHdr_unit_disp_digit_LC(info);
		else if (lc == Hdr_rate_disp_digit) doHdr_rate_disp_digit_LC(info);
	}

	/**
	 * [Hdr]パネルの[std_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rate_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rate_disp_digit_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}