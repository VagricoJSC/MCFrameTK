package mcframe.clientMAUB.MAUBP0260;

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
 * 画面"MAUBP_BpGrp_S"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_BpGrp_S_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SUBMODULE_ID = "MAUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUBP0260";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [BpGrp]ブロック関連のField定義
	public MCPanel BpGrpPanel = null;
	// [BpGrp]ブロックの項目のField定義
	public MCLabel BpGrp_bp_grp_lab1 = null;
	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg1 = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm1 = null;
	public MCLabel BpGrp_bp_grp_lab2 = null;
	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg2 = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm2 = null;
	public MCLabel BpGrp_bp_grp_lab3 = null;
	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg3 = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm3 = null;
	public MCLabel BpGrp_bp_grp_lab4 = null;
	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg4 = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm4 = null;
	public MCLabel BpGrp_bp_grp_lab5 = null;
	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg5 = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm5 = null;
	public MCLabel BpGrp_bp_grp_lab6 = null;
	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg6 = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm6 = null;
	public MCLabel BpGrp_bp_grp_lab7 = null;
	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg7 = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm7 = null;
	public MCLabel BpGrp_bp_grp_lab8 = null;
	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg8 = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm8 = null;
	public MCLabel BpGrp_bp_grp_lab9 = null;
	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg9 = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm9 = null;
	public MCLabel BpGrp_bp_grp_lab10 = null;
	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public MCCheckBox BpGrp_bp_grp_flg10 = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox BpGrp_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField BpGrp_bp_grp_nm10 = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
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
	public static final String[] statusArray = new String[]{ENABLE, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [BpGrp]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0260.BpGrpR aBpGrpR;

	/**
	 * 項目コピーによってaBpGrpRを設定します。
	 *
	 * aBpGrpRのインスタンスは変更されません。
	 *
	 * @param row BpGrpR
	 */
	public void setBpGrpR(mcframe.clientMAUB.MAUBP0260.BpGrpR row) {
		if (row != null) {
			MCRow.copyall(getBpGrpR(), row);
		}
	}

	/**
	 * [BpGrp]ブロックのコンテナaBpGrpRを返します。
	 *
	 * @return BpGrpR
	 */
	public mcframe.clientMAUB.MAUBP0260.BpGrpR getBpGrpR() {
		return aBpGrpR;
	}

	/**
	 * aBpGrpRを作成します。
	 *
	 * @return BpGrpR
	 */
	public mcframe.clientMAUB.MAUBP0260.BpGrpR createBpGrpR() {
		return mcframe.clientMAUB.MAUBP0260.BpGrpR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getBpGrpR())) ret.add(getBpGrpR());
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
		if(aCnt == getBpGrpR()) return "BpGrp";
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
		if(bId.equals("BpGrp")) return getBpGrpR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(BpGrpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_BpGrp_S_MC_A() {
		aBpGrpR = createBpGrpR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_BpGrp_S_MC_A(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		aBpGrpR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_BpGrp_S_MC.jbCreateBpGrp((MAUBP_BpGrp_S)this);
	}

	/**
	 * [BpGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBpGrp(MAUBP_BpGrp_S p) {
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

	
	/** [BpGrp_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd1_p = null;

	/**
	 * [BpGrp_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd1_ListPutter() {
		if (BpGrp_bp_grp_cd1_p == null) {
			BpGrp_bp_grp_cd1_p = createBpGrp_bp_grp_cd1_ListPutter(BpGrp_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return BpGrp_bp_grp_cd1_p;
	}
	
	
	/** [BpGrp_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd2_p = null;

	/**
	 * [BpGrp_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd2_ListPutter() {
		if (BpGrp_bp_grp_cd2_p == null) {
			BpGrp_bp_grp_cd2_p = createBpGrp_bp_grp_cd2_ListPutter(BpGrp_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return BpGrp_bp_grp_cd2_p;
	}
	
	
	/** [BpGrp_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd3_p = null;

	/**
	 * [BpGrp_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd3_ListPutter() {
		if (BpGrp_bp_grp_cd3_p == null) {
			BpGrp_bp_grp_cd3_p = createBpGrp_bp_grp_cd3_ListPutter(BpGrp_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return BpGrp_bp_grp_cd3_p;
	}
	
	
	/** [BpGrp_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd4_p = null;

	/**
	 * [BpGrp_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd4_ListPutter() {
		if (BpGrp_bp_grp_cd4_p == null) {
			BpGrp_bp_grp_cd4_p = createBpGrp_bp_grp_cd4_ListPutter(BpGrp_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return BpGrp_bp_grp_cd4_p;
	}
	
	
	/** [BpGrp_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd5_p = null;

	/**
	 * [BpGrp_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd5_ListPutter() {
		if (BpGrp_bp_grp_cd5_p == null) {
			BpGrp_bp_grp_cd5_p = createBpGrp_bp_grp_cd5_ListPutter(BpGrp_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return BpGrp_bp_grp_cd5_p;
	}
	
	
	/** [BpGrp_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd6_p = null;

	/**
	 * [BpGrp_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd6_ListPutter() {
		if (BpGrp_bp_grp_cd6_p == null) {
			BpGrp_bp_grp_cd6_p = createBpGrp_bp_grp_cd6_ListPutter(BpGrp_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return BpGrp_bp_grp_cd6_p;
	}
	
	
	/** [BpGrp_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd7_p = null;

	/**
	 * [BpGrp_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd7_ListPutter() {
		if (BpGrp_bp_grp_cd7_p == null) {
			BpGrp_bp_grp_cd7_p = createBpGrp_bp_grp_cd7_ListPutter(BpGrp_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return BpGrp_bp_grp_cd7_p;
	}
	
	
	/** [BpGrp_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd8_p = null;

	/**
	 * [BpGrp_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd8_ListPutter() {
		if (BpGrp_bp_grp_cd8_p == null) {
			BpGrp_bp_grp_cd8_p = createBpGrp_bp_grp_cd8_ListPutter(BpGrp_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return BpGrp_bp_grp_cd8_p;
	}
	
	
	/** [BpGrp_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd9_p = null;

	/**
	 * [BpGrp_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd9_ListPutter() {
		if (BpGrp_bp_grp_cd9_p == null) {
			BpGrp_bp_grp_cd9_p = createBpGrp_bp_grp_cd9_ListPutter(BpGrp_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return BpGrp_bp_grp_cd9_p;
	}
	
	
	/** [BpGrp_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter BpGrp_bp_grp_cd10_p = null;

	/**
	 * [BpGrp_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getBpGrp_bp_grp_cd10_ListPutter() {
		if (BpGrp_bp_grp_cd10_p == null) {
			BpGrp_bp_grp_cd10_p = createBpGrp_bp_grp_cd10_ListPutter(BpGrp_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return BpGrp_bp_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_BpGrp_S create(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		MAUBP_BpGrp_S p = new MAUBP_BpGrp_S(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_BpGrp_S create(){
		MAUBP_BpGrp_S p = new MAUBP_BpGrp_S();
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
		MAUBP_BpGrp_S_MC.jbfInitBpGrp((MAUBP_BpGrp_S)this);
		MAUBP_BpGrp_S_MC.jbInitBpGrp((MAUBP_BpGrp_S)this);
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBpGrp(MAUBP_BpGrp_S p) {
		// ブロック関連の初期化
		p.BpGrpPanel = p.beansFactory.createPanel("BpGrp");
		// ブロックの項目の初期化
		p.BpGrp_bp_grp_lab1 = p.beansFactory.createLabel("BpGrp.bp_grp_lab1");
		p.BpGrp_bp_grp_flg1 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg1");
		p.BpGrp_bp_grp_cd1 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd1");
		p.BpGrp_bp_grp_nm1 = p.beansFactory.createTextField("BpGrp.bp_grp_nm1");
		p.BpGrp_bp_grp_lab2 = p.beansFactory.createLabel("BpGrp.bp_grp_lab2");
		p.BpGrp_bp_grp_flg2 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg2");
		p.BpGrp_bp_grp_cd2 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd2");
		p.BpGrp_bp_grp_nm2 = p.beansFactory.createTextField("BpGrp.bp_grp_nm2");
		p.BpGrp_bp_grp_lab3 = p.beansFactory.createLabel("BpGrp.bp_grp_lab3");
		p.BpGrp_bp_grp_flg3 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg3");
		p.BpGrp_bp_grp_cd3 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd3");
		p.BpGrp_bp_grp_nm3 = p.beansFactory.createTextField("BpGrp.bp_grp_nm3");
		p.BpGrp_bp_grp_lab4 = p.beansFactory.createLabel("BpGrp.bp_grp_lab4");
		p.BpGrp_bp_grp_flg4 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg4");
		p.BpGrp_bp_grp_cd4 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd4");
		p.BpGrp_bp_grp_nm4 = p.beansFactory.createTextField("BpGrp.bp_grp_nm4");
		p.BpGrp_bp_grp_lab5 = p.beansFactory.createLabel("BpGrp.bp_grp_lab5");
		p.BpGrp_bp_grp_flg5 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg5");
		p.BpGrp_bp_grp_cd5 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd5");
		p.BpGrp_bp_grp_nm5 = p.beansFactory.createTextField("BpGrp.bp_grp_nm5");
		p.BpGrp_bp_grp_lab6 = p.beansFactory.createLabel("BpGrp.bp_grp_lab6");
		p.BpGrp_bp_grp_flg6 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg6");
		p.BpGrp_bp_grp_cd6 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd6");
		p.BpGrp_bp_grp_nm6 = p.beansFactory.createTextField("BpGrp.bp_grp_nm6");
		p.BpGrp_bp_grp_lab7 = p.beansFactory.createLabel("BpGrp.bp_grp_lab7");
		p.BpGrp_bp_grp_flg7 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg7");
		p.BpGrp_bp_grp_cd7 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd7");
		p.BpGrp_bp_grp_nm7 = p.beansFactory.createTextField("BpGrp.bp_grp_nm7");
		p.BpGrp_bp_grp_lab8 = p.beansFactory.createLabel("BpGrp.bp_grp_lab8");
		p.BpGrp_bp_grp_flg8 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg8");
		p.BpGrp_bp_grp_cd8 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd8");
		p.BpGrp_bp_grp_nm8 = p.beansFactory.createTextField("BpGrp.bp_grp_nm8");
		p.BpGrp_bp_grp_lab9 = p.beansFactory.createLabel("BpGrp.bp_grp_lab9");
		p.BpGrp_bp_grp_flg9 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg9");
		p.BpGrp_bp_grp_cd9 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd9");
		p.BpGrp_bp_grp_nm9 = p.beansFactory.createTextField("BpGrp.bp_grp_nm9");
		p.BpGrp_bp_grp_lab10 = p.beansFactory.createLabel("BpGrp.bp_grp_lab10");
		p.BpGrp_bp_grp_flg10 = p.beansFactory.createCheckBox("BpGrp.bp_grp_flg10");
		p.BpGrp_bp_grp_cd10 = p.beansFactory.createTextComboBox("BpGrp.bp_grp_cd10");
		p.BpGrp_bp_grp_nm10 = p.beansFactory.createTextField("BpGrp.bp_grp_nm10");
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBpGrp(MAUBP_BpGrp_S p) {
		// ブロック関連の初期化
		p.add(p.BpGrpPanel);
		p.setLastBeans(p.BpGrpPanel);
		// ブロックの項目の初期化
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab1);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg1);
		p.BpGrpPanel.setLastBeans(p.BpGrp_bp_grp_flg1);
		p.BpGrp_bp_grp_flg1.setNextBeans(p.BpGrp_bp_grp_cd1);
		p.BpGrp_bp_grp_flg1.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg1_META);
		p.BpGrp_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd1, true);
		p.BpGrp_bp_grp_cd1.setLinkBeans(p.BpGrp_bp_grp_nm1);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd1);
		p.BpGrp_bp_grp_cd1.setNextBeans(p.BpGrp_bp_grp_nm1);
		p.BpGrp_bp_grp_cd1.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd1_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm1);
		p.BpGrp_bp_grp_nm1.setNextBeans(p.BpGrp_bp_grp_flg2);
		p.BpGrp_bp_grp_nm1.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm1, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab2);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg2);
		p.BpGrp_bp_grp_flg2.setNextBeans(p.BpGrp_bp_grp_cd2);
		p.BpGrp_bp_grp_flg2.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg2_META);
		p.BpGrp_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd2, true);
		p.BpGrp_bp_grp_cd2.setLinkBeans(p.BpGrp_bp_grp_nm2);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd2);
		p.BpGrp_bp_grp_cd2.setNextBeans(p.BpGrp_bp_grp_nm2);
		p.BpGrp_bp_grp_cd2.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd2_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm2);
		p.BpGrp_bp_grp_nm2.setNextBeans(p.BpGrp_bp_grp_flg3);
		p.BpGrp_bp_grp_nm2.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm2, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab3);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg3);
		p.BpGrp_bp_grp_flg3.setNextBeans(p.BpGrp_bp_grp_cd3);
		p.BpGrp_bp_grp_flg3.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg3_META);
		p.BpGrp_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd3, true);
		p.BpGrp_bp_grp_cd3.setLinkBeans(p.BpGrp_bp_grp_nm3);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd3);
		p.BpGrp_bp_grp_cd3.setNextBeans(p.BpGrp_bp_grp_nm3);
		p.BpGrp_bp_grp_cd3.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd3_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm3);
		p.BpGrp_bp_grp_nm3.setNextBeans(p.BpGrp_bp_grp_flg4);
		p.BpGrp_bp_grp_nm3.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm3, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab4);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg4);
		p.BpGrp_bp_grp_flg4.setNextBeans(p.BpGrp_bp_grp_cd4);
		p.BpGrp_bp_grp_flg4.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg4_META);
		p.BpGrp_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd4, true);
		p.BpGrp_bp_grp_cd4.setLinkBeans(p.BpGrp_bp_grp_nm4);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd4);
		p.BpGrp_bp_grp_cd4.setNextBeans(p.BpGrp_bp_grp_nm4);
		p.BpGrp_bp_grp_cd4.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd4_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm4);
		p.BpGrp_bp_grp_nm4.setNextBeans(p.BpGrp_bp_grp_flg5);
		p.BpGrp_bp_grp_nm4.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm4, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab5);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg5);
		p.BpGrp_bp_grp_flg5.setNextBeans(p.BpGrp_bp_grp_cd5);
		p.BpGrp_bp_grp_flg5.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg5_META);
		p.BpGrp_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd5, true);
		p.BpGrp_bp_grp_cd5.setLinkBeans(p.BpGrp_bp_grp_nm5);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd5);
		p.BpGrp_bp_grp_cd5.setNextBeans(p.BpGrp_bp_grp_nm5);
		p.BpGrp_bp_grp_cd5.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd5_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm5);
		p.BpGrp_bp_grp_nm5.setNextBeans(p.BpGrp_bp_grp_flg6);
		p.BpGrp_bp_grp_nm5.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm5, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab6);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg6);
		p.BpGrp_bp_grp_flg6.setNextBeans(p.BpGrp_bp_grp_cd6);
		p.BpGrp_bp_grp_flg6.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg6_META);
		p.BpGrp_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd6, true);
		p.BpGrp_bp_grp_cd6.setLinkBeans(p.BpGrp_bp_grp_nm6);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd6);
		p.BpGrp_bp_grp_cd6.setNextBeans(p.BpGrp_bp_grp_nm6);
		p.BpGrp_bp_grp_cd6.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd6_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm6);
		p.BpGrp_bp_grp_nm6.setNextBeans(p.BpGrp_bp_grp_flg7);
		p.BpGrp_bp_grp_nm6.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm6, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab7);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg7);
		p.BpGrp_bp_grp_flg7.setNextBeans(p.BpGrp_bp_grp_cd7);
		p.BpGrp_bp_grp_flg7.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg7_META);
		p.BpGrp_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd7, true);
		p.BpGrp_bp_grp_cd7.setLinkBeans(p.BpGrp_bp_grp_nm7);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd7);
		p.BpGrp_bp_grp_cd7.setNextBeans(p.BpGrp_bp_grp_nm7);
		p.BpGrp_bp_grp_cd7.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd7_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm7);
		p.BpGrp_bp_grp_nm7.setNextBeans(p.BpGrp_bp_grp_flg8);
		p.BpGrp_bp_grp_nm7.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm7, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab8);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg8);
		p.BpGrp_bp_grp_flg8.setNextBeans(p.BpGrp_bp_grp_cd8);
		p.BpGrp_bp_grp_flg8.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg8_META);
		p.BpGrp_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd8, true);
		p.BpGrp_bp_grp_cd8.setLinkBeans(p.BpGrp_bp_grp_nm8);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd8);
		p.BpGrp_bp_grp_cd8.setNextBeans(p.BpGrp_bp_grp_nm8);
		p.BpGrp_bp_grp_cd8.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd8_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm8);
		p.BpGrp_bp_grp_nm8.setNextBeans(p.BpGrp_bp_grp_flg9);
		p.BpGrp_bp_grp_nm8.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm8, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab9);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg9);
		p.BpGrp_bp_grp_flg9.setNextBeans(p.BpGrp_bp_grp_cd9);
		p.BpGrp_bp_grp_flg9.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg9_META);
		p.BpGrp_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd9, true);
		p.BpGrp_bp_grp_cd9.setLinkBeans(p.BpGrp_bp_grp_nm9);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd9);
		p.BpGrp_bp_grp_cd9.setNextBeans(p.BpGrp_bp_grp_nm9);
		p.BpGrp_bp_grp_cd9.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd9_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm9);
		p.BpGrp_bp_grp_nm9.setNextBeans(p.BpGrp_bp_grp_flg10);
		p.BpGrp_bp_grp_nm9.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm9, true);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_lab10);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_flg10);
		p.BpGrp_bp_grp_flg10.setNextBeans(p.BpGrp_bp_grp_cd10);
		p.BpGrp_bp_grp_flg10.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_flg10_META);
		p.BpGrp_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.BpGrp_bp_grp_cd10, true);
		p.BpGrp_bp_grp_cd10.setLinkBeans(p.BpGrp_bp_grp_nm10);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_cd10);
		p.BpGrp_bp_grp_cd10.setNextBeans(p.BpGrp_bp_grp_nm10);
		p.BpGrp_bp_grp_cd10.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_cd10_META);
		p.BpGrpPanel.add(p.BpGrp_bp_grp_nm10);
		p.BpGrp_bp_grp_nm10.setRow(p.getBpGrpR(), mcframe.clientMAUB.MAUBP0260.BpGrpR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.BpGrp_bp_grp_nm10, true);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_BpGrp_S_MC.mcInitBpGrp((MAUBP_BpGrp_S)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_BpGrp_S_MC.statusInitENABLE_BpGrp((MAUBP_BpGrp_S)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_BpGrp_S_MC.statusInitDISABLE_BpGrp((MAUBP_BpGrp_S)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_BpGrp_S_MC.statusInitREAD__ONLY_BpGrp((MAUBP_BpGrp_S)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_BpGrp_S_MC.statusInitREQUIRED_BpGrp((MAUBP_BpGrp_S)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_BpGrp_S_MC.statusInitINVISIBLE_BpGrp((MAUBP_BpGrp_S)this);

	}

	/**
	 *  [BpGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBpGrp(MAUBP_BpGrp_S p) {
		p.BpGrp_bp_grp_flg1.addAllListener(p);
		p.BpGrp_bp_grp_cd1.setListListener(p);
		p.BpGrp_bp_grp_cd1.addAllListener(p);
		p.BpGrp_bp_grp_nm1.setListListener(p);
		p.BpGrp_bp_grp_nm1.addAllListener(p);
		p.BpGrp_bp_grp_flg2.addAllListener(p);
		p.BpGrp_bp_grp_cd2.setListListener(p);
		p.BpGrp_bp_grp_cd2.addAllListener(p);
		p.BpGrp_bp_grp_nm2.setListListener(p);
		p.BpGrp_bp_grp_nm2.addAllListener(p);
		p.BpGrp_bp_grp_flg3.addAllListener(p);
		p.BpGrp_bp_grp_cd3.setListListener(p);
		p.BpGrp_bp_grp_cd3.addAllListener(p);
		p.BpGrp_bp_grp_nm3.setListListener(p);
		p.BpGrp_bp_grp_nm3.addAllListener(p);
		p.BpGrp_bp_grp_flg4.addAllListener(p);
		p.BpGrp_bp_grp_cd4.setListListener(p);
		p.BpGrp_bp_grp_cd4.addAllListener(p);
		p.BpGrp_bp_grp_nm4.setListListener(p);
		p.BpGrp_bp_grp_nm4.addAllListener(p);
		p.BpGrp_bp_grp_flg5.addAllListener(p);
		p.BpGrp_bp_grp_cd5.setListListener(p);
		p.BpGrp_bp_grp_cd5.addAllListener(p);
		p.BpGrp_bp_grp_nm5.setListListener(p);
		p.BpGrp_bp_grp_nm5.addAllListener(p);
		p.BpGrp_bp_grp_flg6.addAllListener(p);
		p.BpGrp_bp_grp_cd6.setListListener(p);
		p.BpGrp_bp_grp_cd6.addAllListener(p);
		p.BpGrp_bp_grp_nm6.setListListener(p);
		p.BpGrp_bp_grp_nm6.addAllListener(p);
		p.BpGrp_bp_grp_flg7.addAllListener(p);
		p.BpGrp_bp_grp_cd7.setListListener(p);
		p.BpGrp_bp_grp_cd7.addAllListener(p);
		p.BpGrp_bp_grp_nm7.setListListener(p);
		p.BpGrp_bp_grp_nm7.addAllListener(p);
		p.BpGrp_bp_grp_flg8.addAllListener(p);
		p.BpGrp_bp_grp_cd8.setListListener(p);
		p.BpGrp_bp_grp_cd8.addAllListener(p);
		p.BpGrp_bp_grp_nm8.setListListener(p);
		p.BpGrp_bp_grp_nm8.addAllListener(p);
		p.BpGrp_bp_grp_flg9.addAllListener(p);
		p.BpGrp_bp_grp_cd9.setListListener(p);
		p.BpGrp_bp_grp_cd9.addAllListener(p);
		p.BpGrp_bp_grp_nm9.setListListener(p);
		p.BpGrp_bp_grp_nm9.addAllListener(p);
		p.BpGrp_bp_grp_flg10.addAllListener(p);
		p.BpGrp_bp_grp_cd10.setListListener(p);
		p.BpGrp_bp_grp_cd10.addAllListener(p);
		p.BpGrp_bp_grp_nm10.setListListener(p);
		p.BpGrp_bp_grp_nm10.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_BpGrp(MAUBP_BpGrp_S p){
		p.BpGrp_bp_grp_lab1.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd1.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm1.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab2.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd2.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm2.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab3.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd3.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm3.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab4.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg4.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd4.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm4.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab5.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg5.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd5.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm5.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab6.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg6.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd6.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm6.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab7.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg7.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd7.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm7.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab8.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg8.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd8.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm8.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab9.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg9.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd9.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm9.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_lab10.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_flg10.putMode(p, ENABLE, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd10.putMode(p, ENABLE, MCMode.ENABLE);
		p.BpGrp_bp_grp_nm10.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_BpGrp(MAUBP_BpGrp_S p){
		p.BpGrp_bp_grp_lab1.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg1.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd1.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm1.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab2.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg2.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd2.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm2.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab3.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg3.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd3.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm3.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab4.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg4.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd4.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm4.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab5.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg5.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd5.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm5.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab6.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg6.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd6.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm6.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab7.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg7.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd7.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm7.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab8.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg8.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd8.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm8.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab9.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg9.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd9.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm9.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_lab10.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_flg10.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_cd10.putMode(p, DISABLE, MCMode.DISABLE);
		p.BpGrp_bp_grp_nm10.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_BpGrp(MAUBP_BpGrp_S p){
		p.BpGrp_bp_grp_lab1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_lab10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_flg10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_cd10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.BpGrp_bp_grp_nm10.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_BpGrp(MAUBP_BpGrp_S p){
		p.BpGrp_bp_grp_lab1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_lab10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_flg10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_cd10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.BpGrp_bp_grp_nm10.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_BpGrp(MAUBP_BpGrp_S p){
		p.BpGrp_bp_grp_lab1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_lab10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_flg10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_cd10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.BpGrp_bp_grp_nm10.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		BpGrp_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd1.getListConfig().setPutter(getBpGrp_bp_grp_cd1_ListPutter());
		BpGrp_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd2.getListConfig().setPutter(getBpGrp_bp_grp_cd2_ListPutter());
		BpGrp_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd3.getListConfig().setPutter(getBpGrp_bp_grp_cd3_ListPutter());
		BpGrp_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd4.getListConfig().setPutter(getBpGrp_bp_grp_cd4_ListPutter());
		BpGrp_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd5.getListConfig().setPutter(getBpGrp_bp_grp_cd5_ListPutter());
		BpGrp_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd6.getListConfig().setPutter(getBpGrp_bp_grp_cd6_ListPutter());
		BpGrp_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd7.getListConfig().setPutter(getBpGrp_bp_grp_cd7_ListPutter());
		BpGrp_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd8.getListConfig().setPutter(getBpGrp_bp_grp_cd8_ListPutter());
		BpGrp_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd9.getListConfig().setPutter(getBpGrp_bp_grp_cd9_ListPutter());
		BpGrp_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		BpGrp_bp_grp_cd10.getListConfig().setPutter(getBpGrp_bp_grp_cd10_ListPutter());
	}

	/**
	 * この画面を[ENABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLEStatus() {
		status = ENABLE;
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
		if (ENABLE.equals(status)) {
			setENABLEStatus();
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
	 * [BpGrp_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [BpGrp_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createBpGrp_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == BpGrp_bp_grp_cd1) return getBpGrp_bp_grp_cd1(row, info);
		if(combo == BpGrp_bp_grp_cd2) return getBpGrp_bp_grp_cd2(row, info);
		if(combo == BpGrp_bp_grp_cd3) return getBpGrp_bp_grp_cd3(row, info);
		if(combo == BpGrp_bp_grp_cd4) return getBpGrp_bp_grp_cd4(row, info);
		if(combo == BpGrp_bp_grp_cd5) return getBpGrp_bp_grp_cd5(row, info);
		if(combo == BpGrp_bp_grp_cd6) return getBpGrp_bp_grp_cd6(row, info);
		if(combo == BpGrp_bp_grp_cd7) return getBpGrp_bp_grp_cd7(row, info);
		if(combo == BpGrp_bp_grp_cd8) return getBpGrp_bp_grp_cd8(row, info);
		if(combo == BpGrp_bp_grp_cd9) return getBpGrp_bp_grp_cd9(row, info);
		if(combo == BpGrp_bp_grp_cd10) return getBpGrp_bp_grp_cd10(row, info);
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
		if (vc == BpGrp_bp_grp_flg1) return doBpGrp_bp_grp_flg1_VC(info);
		if (vc == BpGrp_bp_grp_cd1) return doBpGrp_bp_grp_cd1_VC(info);
		if (vc == BpGrp_bp_grp_nm1) return doBpGrp_bp_grp_nm1_VC(info);
		if (vc == BpGrp_bp_grp_flg2) return doBpGrp_bp_grp_flg2_VC(info);
		if (vc == BpGrp_bp_grp_cd2) return doBpGrp_bp_grp_cd2_VC(info);
		if (vc == BpGrp_bp_grp_nm2) return doBpGrp_bp_grp_nm2_VC(info);
		if (vc == BpGrp_bp_grp_flg3) return doBpGrp_bp_grp_flg3_VC(info);
		if (vc == BpGrp_bp_grp_cd3) return doBpGrp_bp_grp_cd3_VC(info);
		if (vc == BpGrp_bp_grp_nm3) return doBpGrp_bp_grp_nm3_VC(info);
		if (vc == BpGrp_bp_grp_flg4) return doBpGrp_bp_grp_flg4_VC(info);
		if (vc == BpGrp_bp_grp_cd4) return doBpGrp_bp_grp_cd4_VC(info);
		if (vc == BpGrp_bp_grp_nm4) return doBpGrp_bp_grp_nm4_VC(info);
		if (vc == BpGrp_bp_grp_flg5) return doBpGrp_bp_grp_flg5_VC(info);
		if (vc == BpGrp_bp_grp_cd5) return doBpGrp_bp_grp_cd5_VC(info);
		if (vc == BpGrp_bp_grp_nm5) return doBpGrp_bp_grp_nm5_VC(info);
		if (vc == BpGrp_bp_grp_flg6) return doBpGrp_bp_grp_flg6_VC(info);
		if (vc == BpGrp_bp_grp_cd6) return doBpGrp_bp_grp_cd6_VC(info);
		if (vc == BpGrp_bp_grp_nm6) return doBpGrp_bp_grp_nm6_VC(info);
		if (vc == BpGrp_bp_grp_flg7) return doBpGrp_bp_grp_flg7_VC(info);
		if (vc == BpGrp_bp_grp_cd7) return doBpGrp_bp_grp_cd7_VC(info);
		if (vc == BpGrp_bp_grp_nm7) return doBpGrp_bp_grp_nm7_VC(info);
		if (vc == BpGrp_bp_grp_flg8) return doBpGrp_bp_grp_flg8_VC(info);
		if (vc == BpGrp_bp_grp_cd8) return doBpGrp_bp_grp_cd8_VC(info);
		if (vc == BpGrp_bp_grp_nm8) return doBpGrp_bp_grp_nm8_VC(info);
		if (vc == BpGrp_bp_grp_flg9) return doBpGrp_bp_grp_flg9_VC(info);
		if (vc == BpGrp_bp_grp_cd9) return doBpGrp_bp_grp_cd9_VC(info);
		if (vc == BpGrp_bp_grp_nm9) return doBpGrp_bp_grp_nm9_VC(info);
		if (vc == BpGrp_bp_grp_flg10) return doBpGrp_bp_grp_flg10_VC(info);
		if (vc == BpGrp_bp_grp_cd10) return doBpGrp_bp_grp_cd10_VC(info);
		if (vc == BpGrp_bp_grp_nm10) return doBpGrp_bp_grp_nm10_VC(info);
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBpGrp_bp_grp_nm10_VC(MCEventInfo info){
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
		if (nc == BpGrp_bp_grp_flg1) doBpGrp_bp_grp_flg1_NC(info);
		else if (nc == BpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NC(info);
		else if (nc == BpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NC(info);
		else if (nc == BpGrp_bp_grp_flg2) doBpGrp_bp_grp_flg2_NC(info);
		else if (nc == BpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NC(info);
		else if (nc == BpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NC(info);
		else if (nc == BpGrp_bp_grp_flg3) doBpGrp_bp_grp_flg3_NC(info);
		else if (nc == BpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NC(info);
		else if (nc == BpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NC(info);
		else if (nc == BpGrp_bp_grp_flg4) doBpGrp_bp_grp_flg4_NC(info);
		else if (nc == BpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NC(info);
		else if (nc == BpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NC(info);
		else if (nc == BpGrp_bp_grp_flg5) doBpGrp_bp_grp_flg5_NC(info);
		else if (nc == BpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NC(info);
		else if (nc == BpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NC(info);
		else if (nc == BpGrp_bp_grp_flg6) doBpGrp_bp_grp_flg6_NC(info);
		else if (nc == BpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NC(info);
		else if (nc == BpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NC(info);
		else if (nc == BpGrp_bp_grp_flg7) doBpGrp_bp_grp_flg7_NC(info);
		else if (nc == BpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NC(info);
		else if (nc == BpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NC(info);
		else if (nc == BpGrp_bp_grp_flg8) doBpGrp_bp_grp_flg8_NC(info);
		else if (nc == BpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NC(info);
		else if (nc == BpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NC(info);
		else if (nc == BpGrp_bp_grp_flg9) doBpGrp_bp_grp_flg9_NC(info);
		else if (nc == BpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NC(info);
		else if (nc == BpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NC(info);
		else if (nc == BpGrp_bp_grp_flg10) doBpGrp_bp_grp_flg10_NC(info);
		else if (nc == BpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NC(info);
		else if (nc == BpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NC(info);
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == BpGrp_bp_grp_flg1) doBpGrp_bp_grp_flg1_NE(info);
		else if (ne == BpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NE(info);
		else if (ne == BpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NE(info);
		else if (ne == BpGrp_bp_grp_flg2) doBpGrp_bp_grp_flg2_NE(info);
		else if (ne == BpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NE(info);
		else if (ne == BpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NE(info);
		else if (ne == BpGrp_bp_grp_flg3) doBpGrp_bp_grp_flg3_NE(info);
		else if (ne == BpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NE(info);
		else if (ne == BpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NE(info);
		else if (ne == BpGrp_bp_grp_flg4) doBpGrp_bp_grp_flg4_NE(info);
		else if (ne == BpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NE(info);
		else if (ne == BpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NE(info);
		else if (ne == BpGrp_bp_grp_flg5) doBpGrp_bp_grp_flg5_NE(info);
		else if (ne == BpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NE(info);
		else if (ne == BpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NE(info);
		else if (ne == BpGrp_bp_grp_flg6) doBpGrp_bp_grp_flg6_NE(info);
		else if (ne == BpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NE(info);
		else if (ne == BpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NE(info);
		else if (ne == BpGrp_bp_grp_flg7) doBpGrp_bp_grp_flg7_NE(info);
		else if (ne == BpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NE(info);
		else if (ne == BpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NE(info);
		else if (ne == BpGrp_bp_grp_flg8) doBpGrp_bp_grp_flg8_NE(info);
		else if (ne == BpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NE(info);
		else if (ne == BpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NE(info);
		else if (ne == BpGrp_bp_grp_flg9) doBpGrp_bp_grp_flg9_NE(info);
		else if (ne == BpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NE(info);
		else if (ne == BpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NE(info);
		else if (ne == BpGrp_bp_grp_flg10) doBpGrp_bp_grp_flg10_NE(info);
		else if (ne == BpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NE(info);
		else if (ne == BpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NE(info);
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == BpGrp_bp_grp_flg1) doBpGrp_bp_grp_flg1_NX(info);
		else if (nx == BpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_NX(info);
		else if (nx == BpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_NX(info);
		else if (nx == BpGrp_bp_grp_flg2) doBpGrp_bp_grp_flg2_NX(info);
		else if (nx == BpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_NX(info);
		else if (nx == BpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_NX(info);
		else if (nx == BpGrp_bp_grp_flg3) doBpGrp_bp_grp_flg3_NX(info);
		else if (nx == BpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_NX(info);
		else if (nx == BpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_NX(info);
		else if (nx == BpGrp_bp_grp_flg4) doBpGrp_bp_grp_flg4_NX(info);
		else if (nx == BpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_NX(info);
		else if (nx == BpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_NX(info);
		else if (nx == BpGrp_bp_grp_flg5) doBpGrp_bp_grp_flg5_NX(info);
		else if (nx == BpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_NX(info);
		else if (nx == BpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_NX(info);
		else if (nx == BpGrp_bp_grp_flg6) doBpGrp_bp_grp_flg6_NX(info);
		else if (nx == BpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_NX(info);
		else if (nx == BpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_NX(info);
		else if (nx == BpGrp_bp_grp_flg7) doBpGrp_bp_grp_flg7_NX(info);
		else if (nx == BpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_NX(info);
		else if (nx == BpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_NX(info);
		else if (nx == BpGrp_bp_grp_flg8) doBpGrp_bp_grp_flg8_NX(info);
		else if (nx == BpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_NX(info);
		else if (nx == BpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_NX(info);
		else if (nx == BpGrp_bp_grp_flg9) doBpGrp_bp_grp_flg9_NX(info);
		else if (nx == BpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_NX(info);
		else if (nx == BpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_NX(info);
		else if (nx == BpGrp_bp_grp_flg10) doBpGrp_bp_grp_flg10_NX(info);
		else if (nx == BpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_NX(info);
		else if (nx == BpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_NX(info);
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BpGrp_bp_grp_cd1) doBpGrp_bp_grp_cd1_LC(info);
		else if (lc == BpGrp_bp_grp_nm1) doBpGrp_bp_grp_nm1_LC(info);
		else if (lc == BpGrp_bp_grp_cd2) doBpGrp_bp_grp_cd2_LC(info);
		else if (lc == BpGrp_bp_grp_nm2) doBpGrp_bp_grp_nm2_LC(info);
		else if (lc == BpGrp_bp_grp_cd3) doBpGrp_bp_grp_cd3_LC(info);
		else if (lc == BpGrp_bp_grp_nm3) doBpGrp_bp_grp_nm3_LC(info);
		else if (lc == BpGrp_bp_grp_cd4) doBpGrp_bp_grp_cd4_LC(info);
		else if (lc == BpGrp_bp_grp_nm4) doBpGrp_bp_grp_nm4_LC(info);
		else if (lc == BpGrp_bp_grp_cd5) doBpGrp_bp_grp_cd5_LC(info);
		else if (lc == BpGrp_bp_grp_nm5) doBpGrp_bp_grp_nm5_LC(info);
		else if (lc == BpGrp_bp_grp_cd6) doBpGrp_bp_grp_cd6_LC(info);
		else if (lc == BpGrp_bp_grp_nm6) doBpGrp_bp_grp_nm6_LC(info);
		else if (lc == BpGrp_bp_grp_cd7) doBpGrp_bp_grp_cd7_LC(info);
		else if (lc == BpGrp_bp_grp_nm7) doBpGrp_bp_grp_nm7_LC(info);
		else if (lc == BpGrp_bp_grp_cd8) doBpGrp_bp_grp_cd8_LC(info);
		else if (lc == BpGrp_bp_grp_nm8) doBpGrp_bp_grp_nm8_LC(info);
		else if (lc == BpGrp_bp_grp_cd9) doBpGrp_bp_grp_cd9_LC(info);
		else if (lc == BpGrp_bp_grp_nm9) doBpGrp_bp_grp_nm9_LC(info);
		else if (lc == BpGrp_bp_grp_cd10) doBpGrp_bp_grp_cd10_LC(info);
		else if (lc == BpGrp_bp_grp_nm10) doBpGrp_bp_grp_nm10_LC(info);
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [BpGrp]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBpGrp_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd1]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd2]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd3]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd4]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd5]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd6]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd7]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd8]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd9]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[BpGrp_bp_grp_cd10]の作成メソッド
	 */
	public MCList getBpGrp_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}