package mcframe.clientMSUB.MSUBP0020;

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
 * 画面"MSUBP_SnoWrkNo_S"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_SnoWrkNo_S_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SUBMODULE_ID = "MSUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUBP0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SnoWrkNo]ブロック関連のField定義
	public MCPanel SnoWrkNoPanel = null;
	// [SnoWrkNo]ブロックの項目のField定義
	public MCLabel SnoWrkNo_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField SnoWrkNo_sno1 = null;
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public MCCheckBox SnoWrkNo_sno1_null_flg = null;
	public MCLabel SnoWrkNo_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField SnoWrkNo_sno2 = null;
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public MCCheckBox SnoWrkNo_sno2_null_flg = null;
	public MCLabel SnoWrkNo_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField SnoWrkNo_sno3 = null;
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public MCCheckBox SnoWrkNo_sno3_null_flg = null;
	public MCLabel SnoWrkNo_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField SnoWrkNo_sno4 = null;
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public MCCheckBox SnoWrkNo_sno4_null_flg = null;
	public MCLabel SnoWrkNo_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField SnoWrkNo_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField SnoWrkNo_wrk_nm = null;
	/** [ENABLE_SRCH]モードを表す定数 */
	public static final String ENABLE_SRCH = "ENABLE_SRCH";
	/** [DISABLE]モードを表す定数 */
	public static final String DISABLE = "DISABLE";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";
	/** [REQUIRED]モードを表す定数 */
	public static final String REQUIRED = "REQUIRED";
	/** [INVISIBLE]モードを表す定数 */
	public static final String INVISIBLE = "INVISIBLE";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE_SRCH, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [SnoWrkNo]ブロックのコンテナField定義 */
	private final mcframe.clientMSUB.MSUBP0020.SnoWrkNoR aSnoWrkNoR;

	/**
	 * 項目コピーによってaSnoWrkNoRを設定します。
	 *
	 * aSnoWrkNoRのインスタンスは変更されません。
	 *
	 * @param row SnoWrkNoR
	 */
	public void setSnoWrkNoR(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row) {
		if (row != null) {
			MCRow.copyall(getSnoWrkNoR(), row);
		}
	}

	/**
	 * [SnoWrkNo]ブロックのコンテナaSnoWrkNoRを返します。
	 *
	 * @return SnoWrkNoR
	 */
	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR getSnoWrkNoR() {
		return aSnoWrkNoR;
	}

	/**
	 * aSnoWrkNoRを作成します。
	 *
	 * @return SnoWrkNoR
	 */
	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR createSnoWrkNoR() {
		return mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSnoWrkNoR())) ret.add(getSnoWrkNoR());
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
		if(aCnt == getSnoWrkNoR()) return "SnoWrkNo";
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
		if(bId.equals("SnoWrkNo")) return getSnoWrkNoR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SnoWrkNoPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_SnoWrkNo_S_MC_A() {
		aSnoWrkNoR = createSnoWrkNoR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSUBP_SnoWrkNo_S_MC_A(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		aSnoWrkNoR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_SnoWrkNo_S_MC.jbCreateSnoWrkNo((MSUBP_SnoWrkNo_S)this);
	}

	/**
	 * [SnoWrkNo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSnoWrkNo(MSUBP_SnoWrkNo_S p) {
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

	
	/** [SnoWrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter SnoWrkNo_wrk_no_p = null;

	/**
	 * [SnoWrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getSnoWrkNo_wrk_no_ListPutter() {
		if (SnoWrkNo_wrk_no_p == null) {
			SnoWrkNo_wrk_no_p = createSnoWrkNo_wrk_no_ListPutter(SnoWrkNo_wrk_no, "wrk_no", "wrk_nm");

		}
		return SnoWrkNo_wrk_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MSUBP_SnoWrkNo_S create(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		MSUBP_SnoWrkNo_S p = new MSUBP_SnoWrkNo_S(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_SnoWrkNo_S create(){
		MSUBP_SnoWrkNo_S p = new MSUBP_SnoWrkNo_S();
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
		MSUBP_SnoWrkNo_S_MC.jbfInitSnoWrkNo((MSUBP_SnoWrkNo_S)this);
		MSUBP_SnoWrkNo_S_MC.jbInitSnoWrkNo((MSUBP_SnoWrkNo_S)this);
	}

	/**
	 * [SnoWrkNo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSnoWrkNo(MSUBP_SnoWrkNo_S p) {
		// ブロック関連の初期化
		p.SnoWrkNoPanel = p.beansFactory.createPanel("SnoWrkNo");
		// ブロックの項目の初期化
		p.SnoWrkNo_sno1_Label = p.beansFactory.createLabel("SnoWrkNo.sno1_Label");
		p.SnoWrkNo_sno1 = p.beansFactory.createTextField("SnoWrkNo.sno1");
		p.SnoWrkNo_sno1.setLabel(p.SnoWrkNo_sno1_Label);
		p.SnoWrkNo_sno1_null_flg = p.beansFactory.createCheckBox("SnoWrkNo.sno1_null_flg");
		p.SnoWrkNo_sno2_Label = p.beansFactory.createLabel("SnoWrkNo.sno2_Label");
		p.SnoWrkNo_sno2 = p.beansFactory.createTextField("SnoWrkNo.sno2");
		p.SnoWrkNo_sno2.setLabel(p.SnoWrkNo_sno2_Label);
		p.SnoWrkNo_sno2_null_flg = p.beansFactory.createCheckBox("SnoWrkNo.sno2_null_flg");
		p.SnoWrkNo_sno3_Label = p.beansFactory.createLabel("SnoWrkNo.sno3_Label");
		p.SnoWrkNo_sno3 = p.beansFactory.createTextField("SnoWrkNo.sno3");
		p.SnoWrkNo_sno3.setLabel(p.SnoWrkNo_sno3_Label);
		p.SnoWrkNo_sno3_null_flg = p.beansFactory.createCheckBox("SnoWrkNo.sno3_null_flg");
		p.SnoWrkNo_sno4_Label = p.beansFactory.createLabel("SnoWrkNo.sno4_Label");
		p.SnoWrkNo_sno4 = p.beansFactory.createTextField("SnoWrkNo.sno4");
		p.SnoWrkNo_sno4.setLabel(p.SnoWrkNo_sno4_Label);
		p.SnoWrkNo_sno4_null_flg = p.beansFactory.createCheckBox("SnoWrkNo.sno4_null_flg");
		p.SnoWrkNo_wrk_no_Label = p.beansFactory.createLabel("SnoWrkNo.wrk_no_Label");
		p.SnoWrkNo_wrk_no = p.beansFactory.createTextField("SnoWrkNo.wrk_no");
		p.SnoWrkNo_wrk_no.setLabel(p.SnoWrkNo_wrk_no_Label);
		p.SnoWrkNo_wrk_nm = p.beansFactory.createTextField("SnoWrkNo.wrk_nm");
	}

	/**
	 * [SnoWrkNo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSnoWrkNo(MSUBP_SnoWrkNo_S p) {
		// ブロック関連の初期化
		p.add(p.SnoWrkNoPanel);
		p.setLastBeans(p.SnoWrkNoPanel);
		// ブロックの項目の初期化
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno1_Label);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno1);
		p.SnoWrkNoPanel.setLastBeans(p.SnoWrkNo_sno1);
		p.SnoWrkNo_sno1.setNextBeans(p.SnoWrkNo_sno1_null_flg);
		p.SnoWrkNo_sno1.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno1_META);
		p.setPluralValueEnable(p.SnoWrkNo_sno1, true);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno1_null_flg);
		p.SnoWrkNo_sno1_null_flg.setNextBeans(p.SnoWrkNo_sno2);
		p.SnoWrkNo_sno1_null_flg.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno1_null_flg_META);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno2_Label);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno2);
		p.SnoWrkNo_sno2.setNextBeans(p.SnoWrkNo_sno2_null_flg);
		p.SnoWrkNo_sno2.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno2_META);
		p.setPluralValueEnable(p.SnoWrkNo_sno2, true);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno2_null_flg);
		p.SnoWrkNo_sno2_null_flg.setNextBeans(p.SnoWrkNo_sno3);
		p.SnoWrkNo_sno2_null_flg.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno2_null_flg_META);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno3_Label);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno3);
		p.SnoWrkNo_sno3.setNextBeans(p.SnoWrkNo_sno3_null_flg);
		p.SnoWrkNo_sno3.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno3_META);
		p.setPluralValueEnable(p.SnoWrkNo_sno3, true);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno3_null_flg);
		p.SnoWrkNo_sno3_null_flg.setNextBeans(p.SnoWrkNo_sno4);
		p.SnoWrkNo_sno3_null_flg.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno3_null_flg_META);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno4_Label);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno4);
		p.SnoWrkNo_sno4.setNextBeans(p.SnoWrkNo_sno4_null_flg);
		p.SnoWrkNo_sno4.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno4_META);
		p.setPluralValueEnable(p.SnoWrkNo_sno4, true);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_sno4_null_flg);
		p.SnoWrkNo_sno4_null_flg.setNextBeans(p.SnoWrkNo_wrk_no);
		p.SnoWrkNo_sno4_null_flg.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.sno4_null_flg_META);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_wrk_no_Label);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_wrk_no);
		p.SnoWrkNo_wrk_no.setNextBeans(p.SnoWrkNo_wrk_nm);
		p.SnoWrkNo_wrk_no.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.wrk_no_META);
		p.SnoWrkNo_wrk_no.addLinkBeans(p.SnoWrkNo_wrk_nm);
		p.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.SnoWrkNo_wrk_no, true);
		p.SnoWrkNoPanel.add(p.SnoWrkNo_wrk_nm);
		p.SnoWrkNo_wrk_nm.setRow(p.getSnoWrkNoR(), mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.wrk_nm_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_SnoWrkNo_S_MC.mcInitSnoWrkNo((MSUBP_SnoWrkNo_S)this);

		// [ENABLE_SRCH]ステータスのモードの設定
		MSUBP_SnoWrkNo_S_MC.statusInitENABLE__SRCH_SnoWrkNo((MSUBP_SnoWrkNo_S)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_SnoWrkNo_S_MC.statusInitDISABLE_SnoWrkNo((MSUBP_SnoWrkNo_S)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_SnoWrkNo_S_MC.statusInitREAD__ONLY_SnoWrkNo((MSUBP_SnoWrkNo_S)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_SnoWrkNo_S_MC.statusInitREQUIRED_SnoWrkNo((MSUBP_SnoWrkNo_S)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_SnoWrkNo_S_MC.statusInitINVISIBLE_SnoWrkNo((MSUBP_SnoWrkNo_S)this);

	}

	/**
	 *  [SnoWrkNo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSnoWrkNo(MSUBP_SnoWrkNo_S p) {
		p.SnoWrkNo_sno1.setListListener(p);
		p.SnoWrkNo_sno1.addAllListener(p);
		p.SnoWrkNo_sno1_null_flg.addAllListener(p);
		p.SnoWrkNo_sno2.setListListener(p);
		p.SnoWrkNo_sno2.addAllListener(p);
		p.SnoWrkNo_sno2_null_flg.addAllListener(p);
		p.SnoWrkNo_sno3.setListListener(p);
		p.SnoWrkNo_sno3.addAllListener(p);
		p.SnoWrkNo_sno3_null_flg.addAllListener(p);
		p.SnoWrkNo_sno4.setListListener(p);
		p.SnoWrkNo_sno4.addAllListener(p);
		p.SnoWrkNo_sno4_null_flg.addAllListener(p);
		p.SnoWrkNo_wrk_no.setListListener(p);
		p.SnoWrkNo_wrk_no.addAllListener(p);
		p.SnoWrkNo_wrk_nm.setListListener(p);
		p.SnoWrkNo_wrk_nm.addAllListener(p);
	}

	/**
	 * [ENABLE_SRCH]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitENABLE__SRCH_SnoWrkNo(MSUBP_SnoWrkNo_S p){
		p.SnoWrkNo_sno1.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.SnoWrkNo_sno1_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.SnoWrkNo_sno2.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.SnoWrkNo_sno2_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.SnoWrkNo_sno3.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.SnoWrkNo_sno3_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.SnoWrkNo_sno4.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.SnoWrkNo_sno4_null_flg.putMode(p, ENABLE_SRCH, MCMode.REQUIRED);
		p.SnoWrkNo_wrk_no.putMode(p, ENABLE_SRCH, MCMode.ENABLE);
		p.SnoWrkNo_wrk_nm.putMode(p, ENABLE_SRCH, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_SnoWrkNo(MSUBP_SnoWrkNo_S p){
		p.SnoWrkNo_sno1.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno1_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno2.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno2_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno3.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno3_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno4.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_sno4_null_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_wrk_no.putMode(p, DISABLE, MCMode.DISABLE);
		p.SnoWrkNo_wrk_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_SnoWrkNo(MSUBP_SnoWrkNo_S p){
		p.SnoWrkNo_sno1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno1_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno2_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno3_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_sno4_null_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_wrk_no.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SnoWrkNo_wrk_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_SnoWrkNo(MSUBP_SnoWrkNo_S p){
		p.SnoWrkNo_sno1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno1_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno2_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno3_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_sno4_null_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_wrk_no.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SnoWrkNo_wrk_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[SnoWrkNo]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_SnoWrkNo(MSUBP_SnoWrkNo_S p){
		p.SnoWrkNo_sno1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno1_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno2_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno3_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_sno4_null_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_wrk_no.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.SnoWrkNo_wrk_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		SnoWrkNo_wrk_no.getListConfig().setPutter(getSnoWrkNo_wrk_no_ListPutter());
	}

	/**
	 * この画面を[ENABLE_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLE_SRCHStatus() {
		status = ENABLE_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[DISABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDISABLEStatus() {
		status = DISABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[READ_ONLY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREAD_ONLYStatus() {
		status = READ_ONLY;
		setAllStatus(status);
	}

	/**
	 * この画面を[REQUIRED]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQUIREDStatus() {
		status = REQUIRED;
		setAllStatus(status);
	}

	/**
	 * この画面を[INVISIBLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINVISIBLEStatus() {
		status = INVISIBLE;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (ENABLE_SRCH.equals(status)) {
			setENABLE_SRCHStatus();
		}
		else if (DISABLE.equals(status)) {
			setDISABLEStatus();
		}
		else if (READ_ONLY.equals(status)) {
			setREAD_ONLYStatus();
		}
		else if (REQUIRED.equals(status)) {
			setREQUIREDStatus();
		}
		else if (INVISIBLE.equals(status)) {
			setINVISIBLEStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [SnoWrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createSnoWrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == SnoWrkNo_wrk_no) return getSnoWrkNo_wrk_no(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
	}

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
		if (vc == SnoWrkNo_sno1) return doSnoWrkNo_sno1_VC(info);
		if (vc == SnoWrkNo_sno1_null_flg) return doSnoWrkNo_sno1_null_flg_VC(info);
		if (vc == SnoWrkNo_sno2) return doSnoWrkNo_sno2_VC(info);
		if (vc == SnoWrkNo_sno2_null_flg) return doSnoWrkNo_sno2_null_flg_VC(info);
		if (vc == SnoWrkNo_sno3) return doSnoWrkNo_sno3_VC(info);
		if (vc == SnoWrkNo_sno3_null_flg) return doSnoWrkNo_sno3_null_flg_VC(info);
		if (vc == SnoWrkNo_sno4) return doSnoWrkNo_sno4_VC(info);
		if (vc == SnoWrkNo_sno4_null_flg) return doSnoWrkNo_sno4_null_flg_VC(info);
		if (vc == SnoWrkNo_wrk_no) return doSnoWrkNo_wrk_no_VC(info);
		if (vc == SnoWrkNo_wrk_nm) return doSnoWrkNo_wrk_nm_VC(info);
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno1_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno1_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno2_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno2_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno3_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno3_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[sno4_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_sno4_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSnoWrkNo_wrk_nm_VC(MCEventInfo info){
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
		if (nc == SnoWrkNo_sno1) doSnoWrkNo_sno1_NC(info);
		else if (nc == SnoWrkNo_sno1_null_flg) doSnoWrkNo_sno1_null_flg_NC(info);
		else if (nc == SnoWrkNo_sno2) doSnoWrkNo_sno2_NC(info);
		else if (nc == SnoWrkNo_sno2_null_flg) doSnoWrkNo_sno2_null_flg_NC(info);
		else if (nc == SnoWrkNo_sno3) doSnoWrkNo_sno3_NC(info);
		else if (nc == SnoWrkNo_sno3_null_flg) doSnoWrkNo_sno3_null_flg_NC(info);
		else if (nc == SnoWrkNo_sno4) doSnoWrkNo_sno4_NC(info);
		else if (nc == SnoWrkNo_sno4_null_flg) doSnoWrkNo_sno4_null_flg_NC(info);
		else if (nc == SnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NC(info);
		else if (nc == SnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NC(info);
	}

	/**
	 * [SnoWrkNo]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno1_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SnoWrkNo_sno1) doSnoWrkNo_sno1_NE(info);
		else if (ne == SnoWrkNo_sno1_null_flg) doSnoWrkNo_sno1_null_flg_NE(info);
		else if (ne == SnoWrkNo_sno2) doSnoWrkNo_sno2_NE(info);
		else if (ne == SnoWrkNo_sno2_null_flg) doSnoWrkNo_sno2_null_flg_NE(info);
		else if (ne == SnoWrkNo_sno3) doSnoWrkNo_sno3_NE(info);
		else if (ne == SnoWrkNo_sno3_null_flg) doSnoWrkNo_sno3_null_flg_NE(info);
		else if (ne == SnoWrkNo_sno4) doSnoWrkNo_sno4_NE(info);
		else if (ne == SnoWrkNo_sno4_null_flg) doSnoWrkNo_sno4_null_flg_NE(info);
		else if (ne == SnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NE(info);
		else if (ne == SnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NE(info);
	}

	/**
	 * [SnoWrkNo]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno1_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SnoWrkNo_sno1) doSnoWrkNo_sno1_NX(info);
		else if (nx == SnoWrkNo_sno1_null_flg) doSnoWrkNo_sno1_null_flg_NX(info);
		else if (nx == SnoWrkNo_sno2) doSnoWrkNo_sno2_NX(info);
		else if (nx == SnoWrkNo_sno2_null_flg) doSnoWrkNo_sno2_null_flg_NX(info);
		else if (nx == SnoWrkNo_sno3) doSnoWrkNo_sno3_NX(info);
		else if (nx == SnoWrkNo_sno3_null_flg) doSnoWrkNo_sno3_null_flg_NX(info);
		else if (nx == SnoWrkNo_sno4) doSnoWrkNo_sno4_NX(info);
		else if (nx == SnoWrkNo_sno4_null_flg) doSnoWrkNo_sno4_null_flg_NX(info);
		else if (nx == SnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_NX(info);
		else if (nx == SnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_NX(info);
	}

	/**
	 * [SnoWrkNo]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno1_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == SnoWrkNo_sno1) doSnoWrkNo_sno1_LC(info);
		else if (lc == SnoWrkNo_sno2) doSnoWrkNo_sno2_LC(info);
		else if (lc == SnoWrkNo_sno3) doSnoWrkNo_sno3_LC(info);
		else if (lc == SnoWrkNo_sno4) doSnoWrkNo_sno4_LC(info);
		else if (lc == SnoWrkNo_wrk_no) doSnoWrkNo_wrk_no_LC(info);
		else if (lc == SnoWrkNo_wrk_nm) doSnoWrkNo_wrk_nm_LC(info);
	}

	/**
	 * [SnoWrkNo]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno1_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno2_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno3_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_sno4_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SnoWrkNo]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSnoWrkNo_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[SnoWrkNo_wrk_no]の作成メソッド
	 */
	public MCList getSnoWrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}