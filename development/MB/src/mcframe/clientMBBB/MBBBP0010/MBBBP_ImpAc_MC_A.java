package mcframe.clientMBBB.MBBBP0010;

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
import mcframe.clientMBBB.MBBBP0010.MBBBP_ImpAc_MC.MB_MBBBL0010_Ins01Caller;

/**
 * 画面"MBBBP_ImpAc"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_ImpAc_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBBP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_ac_ym_Label = null;
	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym = null;
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public MCCheckBox Cnd_rerun_flg = null;
	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public MCCheckBox Cnd_reget_flg = null;
	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public MCCheckBox Cnd_io_flg = null;
	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_flg = null;
	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_flg = null;
	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_flg = null;
	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public MCCheckBox Cnd_schdpay_flg = null;
	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public MCCheckBox Cnd_note_flg = null;
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Accounting GR/GI info. 会計受払情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0030 = null;
	/**
	 * Accounting inventory info. 会計在庫情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0040 = null;
	/**
	 * Accounting payment received info. 会計入金情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0050 = null;
	/**
	 * Accounting payment info. 会計支払情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0060 = null;
	/**
	 * Accounting payment request info. 会計支払依頼情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0090 = null;
	/**
	 * Notes receivable info. 会計手形情報一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0070 = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS};
	
	/** [MB_MBBBL0010_Ins01]のCallerの作成 */
	protected MBBBP_ImpAc_MC.MB_MBBBL0010_Ins01Caller createMB_MBBBL0010_Ins01() {
		MBBBP_ImpAc_MC.MB_MBBBL0010_Ins01Caller<MBBBP_ImpAc, MB_MBBBL0010_Ins01Bridge>
		caller = ((MBBBP_ImpAc_MC)this).new MB_MBBBL0010_Ins01Caller<MBBBP_ImpAc, MB_MBBBL0010_Ins01Bridge>(
					(MBBBP_ImpAc)this, new MB_MBBBL0010_Ins01Bridge());
		return caller;
	}
	/** [MB_MBBBL0010_Ins01]の呼び出し */
	protected void callMB_MBBBL0010_Ins01() {
		MCCaller caller = createMB_MBBBL0010_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0010.CndR aCndR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0010.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0010.CndR.create();
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
		ret.add(TgtPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_ImpAc_MC_A() {
		aCndR = createCndR();

	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBBP_ImpAc_MC.jbCreateCnd((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbCreateTgt((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbCreateBtn((MBBBP_ImpAc)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_ImpAc p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MBBBP_ImpAc p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBBP_ImpAc p) {
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
	public static MBBBP_ImpAc create(){
		MBBBP_ImpAc p = new MBBBP_ImpAc();
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
		MBBBP_ImpAc_MC.jbfInitCnd((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbfInitTgt((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbfInitBtn((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbInitCnd((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbInitTgt((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.jbInitBtn((MBBBP_ImpAc)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ac_ym_Label = p.beansFactory.createLabel("Cnd.ac_ym_Label");
		p.Cnd_ac_ym = p.beansFactory.createDateField("Cnd.ac_ym");
		p.Cnd_ac_ym.setLabel(p.Cnd_ac_ym_Label);
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_rerun_flg = p.beansFactory.createCheckBox("Cnd.rerun_flg");
		p.Cnd_reget_flg = p.beansFactory.createCheckBox("Cnd.reget_flg");
		p.Cnd_io_flg = p.beansFactory.createCheckBox("Cnd.io_flg");
		p.Cnd_stk_flg = p.beansFactory.createCheckBox("Cnd.stk_flg");
		p.Cnd_rcv_flg = p.beansFactory.createCheckBox("Cnd.rcv_flg");
		p.Cnd_pay_flg = p.beansFactory.createCheckBox("Cnd.pay_flg");
		p.Cnd_schdpay_flg = p.beansFactory.createCheckBox("Cnd.schdpay_flg");
		p.Cnd_note_flg = p.beansFactory.createCheckBox("Cnd.note_flg");
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0030 = p.beansFactory.createButton("Btn.open_MBBBP0030", "open");
		p.Btn_open_MBBBP0040 = p.beansFactory.createButton("Btn.open_MBBBP0040", "open");
		p.Btn_open_MBBBP0050 = p.beansFactory.createButton("Btn.open_MBBBP0050", "open");
		p.Btn_open_MBBBP0060 = p.beansFactory.createButton("Btn.open_MBBBP0060", "open");
		p.Btn_open_MBBBP0090 = p.beansFactory.createButton("Btn.open_MBBBP0090", "open");
		p.Btn_open_MBBBP0070 = p.beansFactory.createButton("Btn.open_MBBBP0070", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.TgtPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ac_ym_Label);
		p.CndPanel.add(p.Cnd_ac_ym);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym);
		p.Cnd_ac_ym.setNextBeans(p.Cnd_dt_fr);
		p.Cnd_ac_ym.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.ac_ym_META);
		p.Cnd_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_rerun_flg);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rerun_flg);
		p.Cnd_rerun_flg.setNextBeans(p.Cnd_reget_flg);
		p.Cnd_rerun_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.rerun_flg_META);
		p.CndPanel.add(p.Cnd_reget_flg);
		p.Cnd_reget_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.reget_flg_META);
		p.TgtPanel.add(p.Cnd_io_flg);
		p.TgtPanel.setLastBeans(p.Cnd_io_flg);
		p.Cnd_io_flg.setNextBeans(p.Cnd_stk_flg);
		p.Cnd_io_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.io_flg_META);
		p.TgtPanel.add(p.Cnd_stk_flg);
		p.Cnd_stk_flg.setNextBeans(p.Cnd_rcv_flg);
		p.Cnd_stk_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.stk_flg_META);
		p.TgtPanel.add(p.Cnd_rcv_flg);
		p.Cnd_rcv_flg.setNextBeans(p.Cnd_pay_flg);
		p.Cnd_rcv_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.rcv_flg_META);
		p.TgtPanel.add(p.Cnd_pay_flg);
		p.Cnd_pay_flg.setNextBeans(p.Cnd_schdpay_flg);
		p.Cnd_pay_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.pay_flg_META);
		p.TgtPanel.add(p.Cnd_schdpay_flg);
		p.Cnd_schdpay_flg.setNextBeans(p.Cnd_note_flg);
		p.Cnd_schdpay_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.schdpay_flg_META);
		p.TgtPanel.add(p.Cnd_note_flg);
		p.Cnd_note_flg.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0010.CndR.note_flg_META);
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.BtnPanel);
		p.TgtPanel.setValueCheck(false);
		p.TgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBBP_ImpAc p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MBBBP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MBBBP0030);
		p.Btn_open_MBBBP0030.setNextBeans(p.Btn_open_MBBBP0040);
		p.Btn_open_MBBBP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MBBBP0040);
		p.Btn_open_MBBBP0040.setNextBeans(p.Btn_open_MBBBP0050);
		p.Btn_open_MBBBP0050.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MBBBP0050);
		p.Btn_open_MBBBP0050.setNextBeans(p.Btn_open_MBBBP0060);
		p.Btn_open_MBBBP0060.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MBBBP0060);
		p.Btn_open_MBBBP0060.setNextBeans(p.Btn_open_MBBBP0090);
		p.Btn_open_MBBBP0090.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MBBBP0090);
		p.Btn_open_MBBBP0090.setNextBeans(p.Btn_open_MBBBP0070);
		p.Btn_open_MBBBP0070.setFunctionKey(MCFunctionKey.F11);
		p.BtnPanel.add(p.Btn_open_MBBBP0070);
		p.Btn_open_MBBBP0070.setNextBeans(p.Btn_upd);
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
		MBBBP_ImpAc_MC.mcInitCnd((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.mcInitTgt((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.mcInitBtn((MBBBP_ImpAc)this);

		// [INS]ステータスのモードの設定
		MBBBP_ImpAc_MC.statusInitINS_Cnd((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.statusInitINS_Tgt((MBBBP_ImpAc)this);
		MBBBP_ImpAc_MC.statusInitINS_Btn((MBBBP_ImpAc)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_ImpAc p) {
		p.Cnd_ac_ym.setListListener(p);
		p.Cnd_ac_ym.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_rerun_flg.addAllListener(p);
		p.Cnd_reget_flg.addAllListener(p);
		p.Cnd_io_flg.addAllListener(p);
		p.Cnd_stk_flg.addAllListener(p);
		p.Cnd_rcv_flg.addAllListener(p);
		p.Cnd_pay_flg.addAllListener(p);
		p.Cnd_schdpay_flg.addAllListener(p);
		p.Cnd_note_flg.addAllListener(p);
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MBBBP_ImpAc p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBBP_ImpAc p) {
		p.Btn_open_MBBBP0030.addAllListener(p);
		p.Btn_open_MBBBP0030.setAPMethodName("doBtn_open_MBBBP0030");
		p.Btn_open_MBBBP0040.addAllListener(p);
		p.Btn_open_MBBBP0040.setAPMethodName("doBtn_open_MBBBP0040");
		p.Btn_open_MBBBP0050.addAllListener(p);
		p.Btn_open_MBBBP0050.setAPMethodName("doBtn_open_MBBBP0050");
		p.Btn_open_MBBBP0060.addAllListener(p);
		p.Btn_open_MBBBP0060.setAPMethodName("doBtn_open_MBBBP0060");
		p.Btn_open_MBBBP0090.addAllListener(p);
		p.Btn_open_MBBBP0090.setAPMethodName("doBtn_open_MBBBP0090");
		p.Btn_open_MBBBP0070.addAllListener(p);
		p.Btn_open_MBBBP0070.setAPMethodName("doBtn_open_MBBBP0070");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MBBBP_ImpAc p){
		p.Cnd_ac_ym.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rerun_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_reget_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_io_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_stk_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_rcv_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_pay_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_schdpay_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_note_flg.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tgt(MBBBP_ImpAc p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MBBBP_ImpAc p){
		p.Btn_open_MBBBP0030.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MBBBP0040.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MBBBP0050.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MBBBP0060.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MBBBP0090.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MBBBP0070.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);

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
		if (ap == Btn_open_MBBBP0030) doBtn_open_MBBBP0030(info);
		else if (ap == Btn_open_MBBBP0040) doBtn_open_MBBBP0040(info);
		else if (ap == Btn_open_MBBBP0050) doBtn_open_MBBBP0050(info);
		else if (ap == Btn_open_MBBBP0060) doBtn_open_MBBBP0060(info);
		else if (ap == Btn_open_MBBBP0090) doBtn_open_MBBBP0090(info);
		else if (ap == Btn_open_MBBBP0070) doBtn_open_MBBBP0070(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Btn]パネルの[open_MBBBP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0070(MCEventInfo info);

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
		if (vc == Cnd_ac_ym) return doCnd_ac_ym_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_rerun_flg) return doCnd_rerun_flg_VC(info);
		if (vc == Cnd_reget_flg) return doCnd_reget_flg_VC(info);
		if (vc == Cnd_io_flg) return doCnd_io_flg_VC(info);
		if (vc == Cnd_stk_flg) return doCnd_stk_flg_VC(info);
		if (vc == Cnd_rcv_flg) return doCnd_rcv_flg_VC(info);
		if (vc == Cnd_pay_flg) return doCnd_pay_flg_VC(info);
		if (vc == Cnd_schdpay_flg) return doCnd_schdpay_flg_VC(info);
		if (vc == Cnd_note_flg) return doCnd_note_flg_VC(info);
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rerun_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rerun_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[reget_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_reget_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schdpay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schdpay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_flg_VC(MCEventInfo info){
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
		if (nc == Cnd_ac_ym) doCnd_ac_ym_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_rerun_flg) doCnd_rerun_flg_NC(info);
		else if (nc == Cnd_reget_flg) doCnd_reget_flg_NC(info);
		else if (nc == Cnd_io_flg) doCnd_io_flg_NC(info);
		else if (nc == Cnd_stk_flg) doCnd_stk_flg_NC(info);
		else if (nc == Cnd_rcv_flg) doCnd_rcv_flg_NC(info);
		else if (nc == Cnd_pay_flg) doCnd_pay_flg_NC(info);
		else if (nc == Cnd_schdpay_flg) doCnd_schdpay_flg_NC(info);
		else if (nc == Cnd_note_flg) doCnd_note_flg_NC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rerun_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reget_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reget_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schdpay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schdpay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd_ac_ym) doCnd_ac_ym_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_rerun_flg) doCnd_rerun_flg_NE(info);
		else if (ne == Cnd_reget_flg) doCnd_reget_flg_NE(info);
		else if (ne == Cnd_io_flg) doCnd_io_flg_NE(info);
		else if (ne == Cnd_stk_flg) doCnd_stk_flg_NE(info);
		else if (ne == Cnd_rcv_flg) doCnd_rcv_flg_NE(info);
		else if (ne == Cnd_pay_flg) doCnd_pay_flg_NE(info);
		else if (ne == Cnd_schdpay_flg) doCnd_schdpay_flg_NE(info);
		else if (ne == Cnd_note_flg) doCnd_note_flg_NE(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rerun_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reget_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reget_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schdpay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schdpay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd_ac_ym) doCnd_ac_ym_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_rerun_flg) doCnd_rerun_flg_NX(info);
		else if (nx == Cnd_reget_flg) doCnd_reget_flg_NX(info);
		else if (nx == Cnd_io_flg) doCnd_io_flg_NX(info);
		else if (nx == Cnd_stk_flg) doCnd_stk_flg_NX(info);
		else if (nx == Cnd_rcv_flg) doCnd_rcv_flg_NX(info);
		else if (nx == Cnd_pay_flg) doCnd_pay_flg_NX(info);
		else if (nx == Cnd_schdpay_flg) doCnd_schdpay_flg_NX(info);
		else if (nx == Cnd_note_flg) doCnd_note_flg_NX(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rerun_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rerun_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reget_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reget_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schdpay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schdpay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_ym) doCnd_ac_ym_LC(info);
		else if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0010.Ins01")) {
			return new MB_MBBBL0010_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0010_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0010_Ins01;

		/** コンストラクタ */
		protected MB_MBBBL0010_Ins01Bridge() {
			p_MB_MBBBL0010_Ins01 = new MCParam(PDef.MB_MBBBL0010_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0010_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0010.CndR.create());
			// Down

			p_MB_MBBBL0010_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0010_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0010_Ins01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0010_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0010_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0010.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0010.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBBL0010_Ins01;
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