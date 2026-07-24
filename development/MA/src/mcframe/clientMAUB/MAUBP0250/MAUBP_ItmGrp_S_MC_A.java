package mcframe.clientMAUB.MAUBP0250;

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
 * 画面"MAUBP_ItmGrp_S"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ItmGrp_S_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	public MCLabel ItmGrp_itm_grp_lab1 = null;
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg1 = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm1 = null;
	public MCLabel ItmGrp_itm_grp_lab2 = null;
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg2 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm2 = null;
	public MCLabel ItmGrp_itm_grp_lab3 = null;
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg3 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm3 = null;
	public MCLabel ItmGrp_itm_grp_lab4 = null;
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg4 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm4 = null;
	public MCLabel ItmGrp_itm_grp_lab5 = null;
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg5 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm5 = null;
	public MCLabel ItmGrp_itm_grp_lab6 = null;
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg6 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm6 = null;
	public MCLabel ItmGrp_itm_grp_lab7 = null;
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg7 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm7 = null;
	public MCLabel ItmGrp_itm_grp_lab8 = null;
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg8 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm8 = null;
	public MCLabel ItmGrp_itm_grp_lab9 = null;
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg9 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm9 = null;
	public MCLabel ItmGrp_itm_grp_lab10 = null;
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public MCCheckBox ItmGrp_itm_grp_flg10 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox ItmGrp_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField ItmGrp_itm_grp_nm10 = null;
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
	
	/** [ItmGrp]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0250.ItmGrpR aItmGrpR;

	/**
	 * 項目コピーによってaItmGrpRを設定します。
	 *
	 * aItmGrpRのインスタンスは変更されません。
	 *
	 * @param row ItmGrpR
	 */
	public void setItmGrpR(mcframe.clientMAUB.MAUBP0250.ItmGrpR row) {
		if (row != null) {
			MCRow.copyall(getItmGrpR(), row);
		}
	}

	/**
	 * [ItmGrp]ブロックのコンテナaItmGrpRを返します。
	 *
	 * @return ItmGrpR
	 */
	public mcframe.clientMAUB.MAUBP0250.ItmGrpR getItmGrpR() {
		return aItmGrpR;
	}

	/**
	 * aItmGrpRを作成します。
	 *
	 * @return ItmGrpR
	 */
	public mcframe.clientMAUB.MAUBP0250.ItmGrpR createItmGrpR() {
		return mcframe.clientMAUB.MAUBP0250.ItmGrpR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getItmGrpR())) ret.add(getItmGrpR());
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
		if(aCnt == getItmGrpR()) return "ItmGrp";
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
		if(bId.equals("ItmGrp")) return getItmGrpR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ItmGrpPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ItmGrp_S_MC_A() {
		aItmGrpR = createItmGrpR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_ItmGrp_S_MC_A(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		aItmGrpR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ItmGrp_S_MC.jbCreateItmGrp((MAUBP_ItmGrp_S)this);
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MAUBP_ItmGrp_S p) {
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

	
	/** [ItmGrp_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd1_p = null;

	/**
	 * [ItmGrp_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd1_ListPutter() {
		if (ItmGrp_itm_grp_cd1_p == null) {
			ItmGrp_itm_grp_cd1_p = createItmGrp_itm_grp_cd1_ListPutter(ItmGrp_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return ItmGrp_itm_grp_cd1_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd2_p = null;

	/**
	 * [ItmGrp_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd2_ListPutter() {
		if (ItmGrp_itm_grp_cd2_p == null) {
			ItmGrp_itm_grp_cd2_p = createItmGrp_itm_grp_cd2_ListPutter(ItmGrp_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return ItmGrp_itm_grp_cd2_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd3_p = null;

	/**
	 * [ItmGrp_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd3_ListPutter() {
		if (ItmGrp_itm_grp_cd3_p == null) {
			ItmGrp_itm_grp_cd3_p = createItmGrp_itm_grp_cd3_ListPutter(ItmGrp_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return ItmGrp_itm_grp_cd3_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd4_p = null;

	/**
	 * [ItmGrp_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd4_ListPutter() {
		if (ItmGrp_itm_grp_cd4_p == null) {
			ItmGrp_itm_grp_cd4_p = createItmGrp_itm_grp_cd4_ListPutter(ItmGrp_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return ItmGrp_itm_grp_cd4_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd5_p = null;

	/**
	 * [ItmGrp_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd5_ListPutter() {
		if (ItmGrp_itm_grp_cd5_p == null) {
			ItmGrp_itm_grp_cd5_p = createItmGrp_itm_grp_cd5_ListPutter(ItmGrp_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return ItmGrp_itm_grp_cd5_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd6_p = null;

	/**
	 * [ItmGrp_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd6_ListPutter() {
		if (ItmGrp_itm_grp_cd6_p == null) {
			ItmGrp_itm_grp_cd6_p = createItmGrp_itm_grp_cd6_ListPutter(ItmGrp_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return ItmGrp_itm_grp_cd6_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd7_p = null;

	/**
	 * [ItmGrp_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd7_ListPutter() {
		if (ItmGrp_itm_grp_cd7_p == null) {
			ItmGrp_itm_grp_cd7_p = createItmGrp_itm_grp_cd7_ListPutter(ItmGrp_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return ItmGrp_itm_grp_cd7_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd8_p = null;

	/**
	 * [ItmGrp_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd8_ListPutter() {
		if (ItmGrp_itm_grp_cd8_p == null) {
			ItmGrp_itm_grp_cd8_p = createItmGrp_itm_grp_cd8_ListPutter(ItmGrp_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return ItmGrp_itm_grp_cd8_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd9_p = null;

	/**
	 * [ItmGrp_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd9_ListPutter() {
		if (ItmGrp_itm_grp_cd9_p == null) {
			ItmGrp_itm_grp_cd9_p = createItmGrp_itm_grp_cd9_ListPutter(ItmGrp_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return ItmGrp_itm_grp_cd9_p;
	}
	
	
	/** [ItmGrp_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter ItmGrp_itm_grp_cd10_p = null;

	/**
	 * [ItmGrp_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getItmGrp_itm_grp_cd10_ListPutter() {
		if (ItmGrp_itm_grp_cd10_p == null) {
			ItmGrp_itm_grp_cd10_p = createItmGrp_itm_grp_cd10_ListPutter(ItmGrp_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return ItmGrp_itm_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_ItmGrp_S create(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		MAUBP_ItmGrp_S p = new MAUBP_ItmGrp_S(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ItmGrp_S create(){
		MAUBP_ItmGrp_S p = new MAUBP_ItmGrp_S();
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
		MAUBP_ItmGrp_S_MC.jbfInitItmGrp((MAUBP_ItmGrp_S)this);
		MAUBP_ItmGrp_S_MC.jbInitItmGrp((MAUBP_ItmGrp_S)this);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MAUBP_ItmGrp_S p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
		p.ItmGrp_itm_grp_lab1 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab1");
		p.ItmGrp_itm_grp_flg1 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg1");
		p.ItmGrp_itm_grp_cd1 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd1");
		p.ItmGrp_itm_grp_nm1 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm1");
		p.ItmGrp_itm_grp_lab2 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab2");
		p.ItmGrp_itm_grp_flg2 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg2");
		p.ItmGrp_itm_grp_cd2 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd2");
		p.ItmGrp_itm_grp_nm2 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm2");
		p.ItmGrp_itm_grp_lab3 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab3");
		p.ItmGrp_itm_grp_flg3 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg3");
		p.ItmGrp_itm_grp_cd3 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd3");
		p.ItmGrp_itm_grp_nm3 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm3");
		p.ItmGrp_itm_grp_lab4 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab4");
		p.ItmGrp_itm_grp_flg4 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg4");
		p.ItmGrp_itm_grp_cd4 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd4");
		p.ItmGrp_itm_grp_nm4 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm4");
		p.ItmGrp_itm_grp_lab5 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab5");
		p.ItmGrp_itm_grp_flg5 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg5");
		p.ItmGrp_itm_grp_cd5 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd5");
		p.ItmGrp_itm_grp_nm5 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm5");
		p.ItmGrp_itm_grp_lab6 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab6");
		p.ItmGrp_itm_grp_flg6 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg6");
		p.ItmGrp_itm_grp_cd6 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd6");
		p.ItmGrp_itm_grp_nm6 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm6");
		p.ItmGrp_itm_grp_lab7 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab7");
		p.ItmGrp_itm_grp_flg7 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg7");
		p.ItmGrp_itm_grp_cd7 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd7");
		p.ItmGrp_itm_grp_nm7 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm7");
		p.ItmGrp_itm_grp_lab8 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab8");
		p.ItmGrp_itm_grp_flg8 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg8");
		p.ItmGrp_itm_grp_cd8 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd8");
		p.ItmGrp_itm_grp_nm8 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm8");
		p.ItmGrp_itm_grp_lab9 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab9");
		p.ItmGrp_itm_grp_flg9 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg9");
		p.ItmGrp_itm_grp_cd9 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd9");
		p.ItmGrp_itm_grp_nm9 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm9");
		p.ItmGrp_itm_grp_lab10 = p.beansFactory.createLabel("ItmGrp.itm_grp_lab10");
		p.ItmGrp_itm_grp_flg10 = p.beansFactory.createCheckBox("ItmGrp.itm_grp_flg10");
		p.ItmGrp_itm_grp_cd10 = p.beansFactory.createTextComboBox("ItmGrp.itm_grp_cd10");
		p.ItmGrp_itm_grp_nm10 = p.beansFactory.createTextField("ItmGrp.itm_grp_nm10");
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MAUBP_ItmGrp_S p) {
		// ブロック関連の初期化
		p.add(p.ItmGrpPanel);
		p.setLastBeans(p.ItmGrpPanel);
		// ブロックの項目の初期化
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab1);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg1);
		p.ItmGrpPanel.setLastBeans(p.ItmGrp_itm_grp_flg1);
		p.ItmGrp_itm_grp_flg1.setNextBeans(p.ItmGrp_itm_grp_cd1);
		p.ItmGrp_itm_grp_flg1.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg1_META);
		p.ItmGrp_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd1, true);
		p.ItmGrp_itm_grp_cd1.setLinkBeans(p.ItmGrp_itm_grp_nm1);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd1);
		p.ItmGrp_itm_grp_cd1.setNextBeans(p.ItmGrp_itm_grp_nm1);
		p.ItmGrp_itm_grp_cd1.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd1_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm1);
		p.ItmGrp_itm_grp_nm1.setNextBeans(p.ItmGrp_itm_grp_flg2);
		p.ItmGrp_itm_grp_nm1.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm1, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab2);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg2);
		p.ItmGrp_itm_grp_flg2.setNextBeans(p.ItmGrp_itm_grp_cd2);
		p.ItmGrp_itm_grp_flg2.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg2_META);
		p.ItmGrp_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd2, true);
		p.ItmGrp_itm_grp_cd2.setLinkBeans(p.ItmGrp_itm_grp_nm2);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd2);
		p.ItmGrp_itm_grp_cd2.setNextBeans(p.ItmGrp_itm_grp_nm2);
		p.ItmGrp_itm_grp_cd2.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd2_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm2);
		p.ItmGrp_itm_grp_nm2.setNextBeans(p.ItmGrp_itm_grp_flg3);
		p.ItmGrp_itm_grp_nm2.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm2, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab3);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg3);
		p.ItmGrp_itm_grp_flg3.setNextBeans(p.ItmGrp_itm_grp_cd3);
		p.ItmGrp_itm_grp_flg3.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg3_META);
		p.ItmGrp_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd3, true);
		p.ItmGrp_itm_grp_cd3.setLinkBeans(p.ItmGrp_itm_grp_nm3);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd3);
		p.ItmGrp_itm_grp_cd3.setNextBeans(p.ItmGrp_itm_grp_nm3);
		p.ItmGrp_itm_grp_cd3.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd3_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm3);
		p.ItmGrp_itm_grp_nm3.setNextBeans(p.ItmGrp_itm_grp_flg4);
		p.ItmGrp_itm_grp_nm3.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm3, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab4);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg4);
		p.ItmGrp_itm_grp_flg4.setNextBeans(p.ItmGrp_itm_grp_cd4);
		p.ItmGrp_itm_grp_flg4.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg4_META);
		p.ItmGrp_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd4, true);
		p.ItmGrp_itm_grp_cd4.setLinkBeans(p.ItmGrp_itm_grp_nm4);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd4);
		p.ItmGrp_itm_grp_cd4.setNextBeans(p.ItmGrp_itm_grp_nm4);
		p.ItmGrp_itm_grp_cd4.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd4_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm4);
		p.ItmGrp_itm_grp_nm4.setNextBeans(p.ItmGrp_itm_grp_flg5);
		p.ItmGrp_itm_grp_nm4.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm4, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab5);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg5);
		p.ItmGrp_itm_grp_flg5.setNextBeans(p.ItmGrp_itm_grp_cd5);
		p.ItmGrp_itm_grp_flg5.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg5_META);
		p.ItmGrp_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd5, true);
		p.ItmGrp_itm_grp_cd5.setLinkBeans(p.ItmGrp_itm_grp_nm5);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd5);
		p.ItmGrp_itm_grp_cd5.setNextBeans(p.ItmGrp_itm_grp_nm5);
		p.ItmGrp_itm_grp_cd5.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd5_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm5);
		p.ItmGrp_itm_grp_nm5.setNextBeans(p.ItmGrp_itm_grp_flg6);
		p.ItmGrp_itm_grp_nm5.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm5, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab6);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg6);
		p.ItmGrp_itm_grp_flg6.setNextBeans(p.ItmGrp_itm_grp_cd6);
		p.ItmGrp_itm_grp_flg6.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg6_META);
		p.ItmGrp_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd6, true);
		p.ItmGrp_itm_grp_cd6.setLinkBeans(p.ItmGrp_itm_grp_nm6);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd6);
		p.ItmGrp_itm_grp_cd6.setNextBeans(p.ItmGrp_itm_grp_nm6);
		p.ItmGrp_itm_grp_cd6.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd6_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm6);
		p.ItmGrp_itm_grp_nm6.setNextBeans(p.ItmGrp_itm_grp_flg7);
		p.ItmGrp_itm_grp_nm6.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm6, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab7);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg7);
		p.ItmGrp_itm_grp_flg7.setNextBeans(p.ItmGrp_itm_grp_cd7);
		p.ItmGrp_itm_grp_flg7.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg7_META);
		p.ItmGrp_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd7, true);
		p.ItmGrp_itm_grp_cd7.setLinkBeans(p.ItmGrp_itm_grp_nm7);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd7);
		p.ItmGrp_itm_grp_cd7.setNextBeans(p.ItmGrp_itm_grp_nm7);
		p.ItmGrp_itm_grp_cd7.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd7_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm7);
		p.ItmGrp_itm_grp_nm7.setNextBeans(p.ItmGrp_itm_grp_flg8);
		p.ItmGrp_itm_grp_nm7.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm7, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab8);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg8);
		p.ItmGrp_itm_grp_flg8.setNextBeans(p.ItmGrp_itm_grp_cd8);
		p.ItmGrp_itm_grp_flg8.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg8_META);
		p.ItmGrp_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd8, true);
		p.ItmGrp_itm_grp_cd8.setLinkBeans(p.ItmGrp_itm_grp_nm8);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd8);
		p.ItmGrp_itm_grp_cd8.setNextBeans(p.ItmGrp_itm_grp_nm8);
		p.ItmGrp_itm_grp_cd8.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd8_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm8);
		p.ItmGrp_itm_grp_nm8.setNextBeans(p.ItmGrp_itm_grp_flg9);
		p.ItmGrp_itm_grp_nm8.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm8, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab9);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg9);
		p.ItmGrp_itm_grp_flg9.setNextBeans(p.ItmGrp_itm_grp_cd9);
		p.ItmGrp_itm_grp_flg9.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg9_META);
		p.ItmGrp_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd9, true);
		p.ItmGrp_itm_grp_cd9.setLinkBeans(p.ItmGrp_itm_grp_nm9);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd9);
		p.ItmGrp_itm_grp_cd9.setNextBeans(p.ItmGrp_itm_grp_nm9);
		p.ItmGrp_itm_grp_cd9.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd9_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm9);
		p.ItmGrp_itm_grp_nm9.setNextBeans(p.ItmGrp_itm_grp_flg10);
		p.ItmGrp_itm_grp_nm9.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm9, true);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_lab10);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_flg10);
		p.ItmGrp_itm_grp_flg10.setNextBeans(p.ItmGrp_itm_grp_cd10);
		p.ItmGrp_itm_grp_flg10.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_flg10_META);
		p.ItmGrp_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_cd10, true);
		p.ItmGrp_itm_grp_cd10.setLinkBeans(p.ItmGrp_itm_grp_nm10);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_cd10);
		p.ItmGrp_itm_grp_cd10.setNextBeans(p.ItmGrp_itm_grp_nm10);
		p.ItmGrp_itm_grp_cd10.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_cd10_META);
		p.ItmGrpPanel.add(p.ItmGrp_itm_grp_nm10);
		p.ItmGrp_itm_grp_nm10.setRow(p.getItmGrpR(), mcframe.clientMAUB.MAUBP0250.ItmGrpR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.ItmGrp_itm_grp_nm10, true);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ItmGrp_S_MC.mcInitItmGrp((MAUBP_ItmGrp_S)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ItmGrp_S_MC.statusInitENABLE_ItmGrp((MAUBP_ItmGrp_S)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ItmGrp_S_MC.statusInitDISABLE_ItmGrp((MAUBP_ItmGrp_S)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ItmGrp_S_MC.statusInitREAD__ONLY_ItmGrp((MAUBP_ItmGrp_S)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ItmGrp_S_MC.statusInitREQUIRED_ItmGrp((MAUBP_ItmGrp_S)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ItmGrp_S_MC.statusInitINVISIBLE_ItmGrp((MAUBP_ItmGrp_S)this);

	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MAUBP_ItmGrp_S p) {
		p.ItmGrp_itm_grp_flg1.addAllListener(p);
		p.ItmGrp_itm_grp_cd1.setListListener(p);
		p.ItmGrp_itm_grp_cd1.addAllListener(p);
		p.ItmGrp_itm_grp_nm1.setListListener(p);
		p.ItmGrp_itm_grp_nm1.addAllListener(p);
		p.ItmGrp_itm_grp_flg2.addAllListener(p);
		p.ItmGrp_itm_grp_cd2.setListListener(p);
		p.ItmGrp_itm_grp_cd2.addAllListener(p);
		p.ItmGrp_itm_grp_nm2.setListListener(p);
		p.ItmGrp_itm_grp_nm2.addAllListener(p);
		p.ItmGrp_itm_grp_flg3.addAllListener(p);
		p.ItmGrp_itm_grp_cd3.setListListener(p);
		p.ItmGrp_itm_grp_cd3.addAllListener(p);
		p.ItmGrp_itm_grp_nm3.setListListener(p);
		p.ItmGrp_itm_grp_nm3.addAllListener(p);
		p.ItmGrp_itm_grp_flg4.addAllListener(p);
		p.ItmGrp_itm_grp_cd4.setListListener(p);
		p.ItmGrp_itm_grp_cd4.addAllListener(p);
		p.ItmGrp_itm_grp_nm4.setListListener(p);
		p.ItmGrp_itm_grp_nm4.addAllListener(p);
		p.ItmGrp_itm_grp_flg5.addAllListener(p);
		p.ItmGrp_itm_grp_cd5.setListListener(p);
		p.ItmGrp_itm_grp_cd5.addAllListener(p);
		p.ItmGrp_itm_grp_nm5.setListListener(p);
		p.ItmGrp_itm_grp_nm5.addAllListener(p);
		p.ItmGrp_itm_grp_flg6.addAllListener(p);
		p.ItmGrp_itm_grp_cd6.setListListener(p);
		p.ItmGrp_itm_grp_cd6.addAllListener(p);
		p.ItmGrp_itm_grp_nm6.setListListener(p);
		p.ItmGrp_itm_grp_nm6.addAllListener(p);
		p.ItmGrp_itm_grp_flg7.addAllListener(p);
		p.ItmGrp_itm_grp_cd7.setListListener(p);
		p.ItmGrp_itm_grp_cd7.addAllListener(p);
		p.ItmGrp_itm_grp_nm7.setListListener(p);
		p.ItmGrp_itm_grp_nm7.addAllListener(p);
		p.ItmGrp_itm_grp_flg8.addAllListener(p);
		p.ItmGrp_itm_grp_cd8.setListListener(p);
		p.ItmGrp_itm_grp_cd8.addAllListener(p);
		p.ItmGrp_itm_grp_nm8.setListListener(p);
		p.ItmGrp_itm_grp_nm8.addAllListener(p);
		p.ItmGrp_itm_grp_flg9.addAllListener(p);
		p.ItmGrp_itm_grp_cd9.setListListener(p);
		p.ItmGrp_itm_grp_cd9.addAllListener(p);
		p.ItmGrp_itm_grp_nm9.setListListener(p);
		p.ItmGrp_itm_grp_nm9.addAllListener(p);
		p.ItmGrp_itm_grp_flg10.addAllListener(p);
		p.ItmGrp_itm_grp_cd10.setListListener(p);
		p.ItmGrp_itm_grp_cd10.addAllListener(p);
		p.ItmGrp_itm_grp_nm10.setListListener(p);
		p.ItmGrp_itm_grp_nm10.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ItmGrp(MAUBP_ItmGrp_S p){
		p.ItmGrp_itm_grp_lab1.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg1.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd1.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm1.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab2.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg2.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd2.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm2.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab3.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg3.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd3.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm3.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab4.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg4.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd4.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm4.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab5.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg5.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd5.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm5.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab6.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg6.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd6.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm6.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab7.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg7.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd7.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm7.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab8.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg8.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd8.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm8.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab9.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg9.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd9.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm9.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_lab10.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_flg10.putMode(p, ENABLE, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd10.putMode(p, ENABLE, MCMode.ENABLE);
		p.ItmGrp_itm_grp_nm10.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ItmGrp(MAUBP_ItmGrp_S p){
		p.ItmGrp_itm_grp_lab1.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg1.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd1.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm1.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab2.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg2.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd2.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm2.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab3.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg3.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd3.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm3.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab4.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg4.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd4.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm4.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab5.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg5.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd5.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm5.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab6.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg6.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd6.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm6.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab7.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg7.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd7.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm7.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab8.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg8.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd8.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm8.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab9.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg9.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd9.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm9.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_lab10.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_flg10.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_cd10.putMode(p, DISABLE, MCMode.DISABLE);
		p.ItmGrp_itm_grp_nm10.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ItmGrp(MAUBP_ItmGrp_S p){
		p.ItmGrp_itm_grp_lab1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm5.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm6.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm7.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm8.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm9.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_flg10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_cd10.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_nm10.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ItmGrp(MAUBP_ItmGrp_S p){
		p.ItmGrp_itm_grp_lab1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd1.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm1.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd2.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm2.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd3.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm3.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd4.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm4.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd5.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm5.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd6.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm6.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd7.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm7.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd8.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm8.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd9.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm9.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.ItmGrp_itm_grp_lab10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_flg10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_cd10.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.ItmGrp_itm_grp_nm10.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ItmGrp(MAUBP_ItmGrp_S p){
		p.ItmGrp_itm_grp_lab1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm1.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm2.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm3.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm4.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm5.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm6.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm7.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm8.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm9.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_lab10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_flg10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_cd10.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.ItmGrp_itm_grp_nm10.putMode(p, INVISIBLE, MCMode.INVISIBLE);

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
		ItmGrp_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd1.getListConfig().setPutter(getItmGrp_itm_grp_cd1_ListPutter());
		ItmGrp_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd2.getListConfig().setPutter(getItmGrp_itm_grp_cd2_ListPutter());
		ItmGrp_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd3.getListConfig().setPutter(getItmGrp_itm_grp_cd3_ListPutter());
		ItmGrp_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd4.getListConfig().setPutter(getItmGrp_itm_grp_cd4_ListPutter());
		ItmGrp_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd5.getListConfig().setPutter(getItmGrp_itm_grp_cd5_ListPutter());
		ItmGrp_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd6.getListConfig().setPutter(getItmGrp_itm_grp_cd6_ListPutter());
		ItmGrp_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd7.getListConfig().setPutter(getItmGrp_itm_grp_cd7_ListPutter());
		ItmGrp_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd8.getListConfig().setPutter(getItmGrp_itm_grp_cd8_ListPutter());
		ItmGrp_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd9.getListConfig().setPutter(getItmGrp_itm_grp_cd9_ListPutter());
		ItmGrp_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrp_itm_grp_cd10.getListConfig().setPutter(getItmGrp_itm_grp_cd10_ListPutter());
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
	 * [ItmGrp_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [ItmGrp_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createItmGrp_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == ItmGrp_itm_grp_cd1) return getItmGrp_itm_grp_cd1(row, info);
		if(combo == ItmGrp_itm_grp_cd2) return getItmGrp_itm_grp_cd2(row, info);
		if(combo == ItmGrp_itm_grp_cd3) return getItmGrp_itm_grp_cd3(row, info);
		if(combo == ItmGrp_itm_grp_cd4) return getItmGrp_itm_grp_cd4(row, info);
		if(combo == ItmGrp_itm_grp_cd5) return getItmGrp_itm_grp_cd5(row, info);
		if(combo == ItmGrp_itm_grp_cd6) return getItmGrp_itm_grp_cd6(row, info);
		if(combo == ItmGrp_itm_grp_cd7) return getItmGrp_itm_grp_cd7(row, info);
		if(combo == ItmGrp_itm_grp_cd8) return getItmGrp_itm_grp_cd8(row, info);
		if(combo == ItmGrp_itm_grp_cd9) return getItmGrp_itm_grp_cd9(row, info);
		if(combo == ItmGrp_itm_grp_cd10) return getItmGrp_itm_grp_cd10(row, info);
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
		if (vc == ItmGrp_itm_grp_flg1) return doItmGrp_itm_grp_flg1_VC(info);
		if (vc == ItmGrp_itm_grp_cd1) return doItmGrp_itm_grp_cd1_VC(info);
		if (vc == ItmGrp_itm_grp_nm1) return doItmGrp_itm_grp_nm1_VC(info);
		if (vc == ItmGrp_itm_grp_flg2) return doItmGrp_itm_grp_flg2_VC(info);
		if (vc == ItmGrp_itm_grp_cd2) return doItmGrp_itm_grp_cd2_VC(info);
		if (vc == ItmGrp_itm_grp_nm2) return doItmGrp_itm_grp_nm2_VC(info);
		if (vc == ItmGrp_itm_grp_flg3) return doItmGrp_itm_grp_flg3_VC(info);
		if (vc == ItmGrp_itm_grp_cd3) return doItmGrp_itm_grp_cd3_VC(info);
		if (vc == ItmGrp_itm_grp_nm3) return doItmGrp_itm_grp_nm3_VC(info);
		if (vc == ItmGrp_itm_grp_flg4) return doItmGrp_itm_grp_flg4_VC(info);
		if (vc == ItmGrp_itm_grp_cd4) return doItmGrp_itm_grp_cd4_VC(info);
		if (vc == ItmGrp_itm_grp_nm4) return doItmGrp_itm_grp_nm4_VC(info);
		if (vc == ItmGrp_itm_grp_flg5) return doItmGrp_itm_grp_flg5_VC(info);
		if (vc == ItmGrp_itm_grp_cd5) return doItmGrp_itm_grp_cd5_VC(info);
		if (vc == ItmGrp_itm_grp_nm5) return doItmGrp_itm_grp_nm5_VC(info);
		if (vc == ItmGrp_itm_grp_flg6) return doItmGrp_itm_grp_flg6_VC(info);
		if (vc == ItmGrp_itm_grp_cd6) return doItmGrp_itm_grp_cd6_VC(info);
		if (vc == ItmGrp_itm_grp_nm6) return doItmGrp_itm_grp_nm6_VC(info);
		if (vc == ItmGrp_itm_grp_flg7) return doItmGrp_itm_grp_flg7_VC(info);
		if (vc == ItmGrp_itm_grp_cd7) return doItmGrp_itm_grp_cd7_VC(info);
		if (vc == ItmGrp_itm_grp_nm7) return doItmGrp_itm_grp_nm7_VC(info);
		if (vc == ItmGrp_itm_grp_flg8) return doItmGrp_itm_grp_flg8_VC(info);
		if (vc == ItmGrp_itm_grp_cd8) return doItmGrp_itm_grp_cd8_VC(info);
		if (vc == ItmGrp_itm_grp_nm8) return doItmGrp_itm_grp_nm8_VC(info);
		if (vc == ItmGrp_itm_grp_flg9) return doItmGrp_itm_grp_flg9_VC(info);
		if (vc == ItmGrp_itm_grp_cd9) return doItmGrp_itm_grp_cd9_VC(info);
		if (vc == ItmGrp_itm_grp_nm9) return doItmGrp_itm_grp_nm9_VC(info);
		if (vc == ItmGrp_itm_grp_flg10) return doItmGrp_itm_grp_flg10_VC(info);
		if (vc == ItmGrp_itm_grp_cd10) return doItmGrp_itm_grp_cd10_VC(info);
		if (vc == ItmGrp_itm_grp_nm10) return doItmGrp_itm_grp_nm10_VC(info);
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrp_itm_grp_nm10_VC(MCEventInfo info){
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
		if (nc == ItmGrp_itm_grp_flg1) doItmGrp_itm_grp_flg1_NC(info);
		else if (nc == ItmGrp_itm_grp_cd1) doItmGrp_itm_grp_cd1_NC(info);
		else if (nc == ItmGrp_itm_grp_nm1) doItmGrp_itm_grp_nm1_NC(info);
		else if (nc == ItmGrp_itm_grp_flg2) doItmGrp_itm_grp_flg2_NC(info);
		else if (nc == ItmGrp_itm_grp_cd2) doItmGrp_itm_grp_cd2_NC(info);
		else if (nc == ItmGrp_itm_grp_nm2) doItmGrp_itm_grp_nm2_NC(info);
		else if (nc == ItmGrp_itm_grp_flg3) doItmGrp_itm_grp_flg3_NC(info);
		else if (nc == ItmGrp_itm_grp_cd3) doItmGrp_itm_grp_cd3_NC(info);
		else if (nc == ItmGrp_itm_grp_nm3) doItmGrp_itm_grp_nm3_NC(info);
		else if (nc == ItmGrp_itm_grp_flg4) doItmGrp_itm_grp_flg4_NC(info);
		else if (nc == ItmGrp_itm_grp_cd4) doItmGrp_itm_grp_cd4_NC(info);
		else if (nc == ItmGrp_itm_grp_nm4) doItmGrp_itm_grp_nm4_NC(info);
		else if (nc == ItmGrp_itm_grp_flg5) doItmGrp_itm_grp_flg5_NC(info);
		else if (nc == ItmGrp_itm_grp_cd5) doItmGrp_itm_grp_cd5_NC(info);
		else if (nc == ItmGrp_itm_grp_nm5) doItmGrp_itm_grp_nm5_NC(info);
		else if (nc == ItmGrp_itm_grp_flg6) doItmGrp_itm_grp_flg6_NC(info);
		else if (nc == ItmGrp_itm_grp_cd6) doItmGrp_itm_grp_cd6_NC(info);
		else if (nc == ItmGrp_itm_grp_nm6) doItmGrp_itm_grp_nm6_NC(info);
		else if (nc == ItmGrp_itm_grp_flg7) doItmGrp_itm_grp_flg7_NC(info);
		else if (nc == ItmGrp_itm_grp_cd7) doItmGrp_itm_grp_cd7_NC(info);
		else if (nc == ItmGrp_itm_grp_nm7) doItmGrp_itm_grp_nm7_NC(info);
		else if (nc == ItmGrp_itm_grp_flg8) doItmGrp_itm_grp_flg8_NC(info);
		else if (nc == ItmGrp_itm_grp_cd8) doItmGrp_itm_grp_cd8_NC(info);
		else if (nc == ItmGrp_itm_grp_nm8) doItmGrp_itm_grp_nm8_NC(info);
		else if (nc == ItmGrp_itm_grp_flg9) doItmGrp_itm_grp_flg9_NC(info);
		else if (nc == ItmGrp_itm_grp_cd9) doItmGrp_itm_grp_cd9_NC(info);
		else if (nc == ItmGrp_itm_grp_nm9) doItmGrp_itm_grp_nm9_NC(info);
		else if (nc == ItmGrp_itm_grp_flg10) doItmGrp_itm_grp_flg10_NC(info);
		else if (nc == ItmGrp_itm_grp_cd10) doItmGrp_itm_grp_cd10_NC(info);
		else if (nc == ItmGrp_itm_grp_nm10) doItmGrp_itm_grp_nm10_NC(info);
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ItmGrp_itm_grp_flg1) doItmGrp_itm_grp_flg1_NE(info);
		else if (ne == ItmGrp_itm_grp_cd1) doItmGrp_itm_grp_cd1_NE(info);
		else if (ne == ItmGrp_itm_grp_nm1) doItmGrp_itm_grp_nm1_NE(info);
		else if (ne == ItmGrp_itm_grp_flg2) doItmGrp_itm_grp_flg2_NE(info);
		else if (ne == ItmGrp_itm_grp_cd2) doItmGrp_itm_grp_cd2_NE(info);
		else if (ne == ItmGrp_itm_grp_nm2) doItmGrp_itm_grp_nm2_NE(info);
		else if (ne == ItmGrp_itm_grp_flg3) doItmGrp_itm_grp_flg3_NE(info);
		else if (ne == ItmGrp_itm_grp_cd3) doItmGrp_itm_grp_cd3_NE(info);
		else if (ne == ItmGrp_itm_grp_nm3) doItmGrp_itm_grp_nm3_NE(info);
		else if (ne == ItmGrp_itm_grp_flg4) doItmGrp_itm_grp_flg4_NE(info);
		else if (ne == ItmGrp_itm_grp_cd4) doItmGrp_itm_grp_cd4_NE(info);
		else if (ne == ItmGrp_itm_grp_nm4) doItmGrp_itm_grp_nm4_NE(info);
		else if (ne == ItmGrp_itm_grp_flg5) doItmGrp_itm_grp_flg5_NE(info);
		else if (ne == ItmGrp_itm_grp_cd5) doItmGrp_itm_grp_cd5_NE(info);
		else if (ne == ItmGrp_itm_grp_nm5) doItmGrp_itm_grp_nm5_NE(info);
		else if (ne == ItmGrp_itm_grp_flg6) doItmGrp_itm_grp_flg6_NE(info);
		else if (ne == ItmGrp_itm_grp_cd6) doItmGrp_itm_grp_cd6_NE(info);
		else if (ne == ItmGrp_itm_grp_nm6) doItmGrp_itm_grp_nm6_NE(info);
		else if (ne == ItmGrp_itm_grp_flg7) doItmGrp_itm_grp_flg7_NE(info);
		else if (ne == ItmGrp_itm_grp_cd7) doItmGrp_itm_grp_cd7_NE(info);
		else if (ne == ItmGrp_itm_grp_nm7) doItmGrp_itm_grp_nm7_NE(info);
		else if (ne == ItmGrp_itm_grp_flg8) doItmGrp_itm_grp_flg8_NE(info);
		else if (ne == ItmGrp_itm_grp_cd8) doItmGrp_itm_grp_cd8_NE(info);
		else if (ne == ItmGrp_itm_grp_nm8) doItmGrp_itm_grp_nm8_NE(info);
		else if (ne == ItmGrp_itm_grp_flg9) doItmGrp_itm_grp_flg9_NE(info);
		else if (ne == ItmGrp_itm_grp_cd9) doItmGrp_itm_grp_cd9_NE(info);
		else if (ne == ItmGrp_itm_grp_nm9) doItmGrp_itm_grp_nm9_NE(info);
		else if (ne == ItmGrp_itm_grp_flg10) doItmGrp_itm_grp_flg10_NE(info);
		else if (ne == ItmGrp_itm_grp_cd10) doItmGrp_itm_grp_cd10_NE(info);
		else if (ne == ItmGrp_itm_grp_nm10) doItmGrp_itm_grp_nm10_NE(info);
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ItmGrp_itm_grp_flg1) doItmGrp_itm_grp_flg1_NX(info);
		else if (nx == ItmGrp_itm_grp_cd1) doItmGrp_itm_grp_cd1_NX(info);
		else if (nx == ItmGrp_itm_grp_nm1) doItmGrp_itm_grp_nm1_NX(info);
		else if (nx == ItmGrp_itm_grp_flg2) doItmGrp_itm_grp_flg2_NX(info);
		else if (nx == ItmGrp_itm_grp_cd2) doItmGrp_itm_grp_cd2_NX(info);
		else if (nx == ItmGrp_itm_grp_nm2) doItmGrp_itm_grp_nm2_NX(info);
		else if (nx == ItmGrp_itm_grp_flg3) doItmGrp_itm_grp_flg3_NX(info);
		else if (nx == ItmGrp_itm_grp_cd3) doItmGrp_itm_grp_cd3_NX(info);
		else if (nx == ItmGrp_itm_grp_nm3) doItmGrp_itm_grp_nm3_NX(info);
		else if (nx == ItmGrp_itm_grp_flg4) doItmGrp_itm_grp_flg4_NX(info);
		else if (nx == ItmGrp_itm_grp_cd4) doItmGrp_itm_grp_cd4_NX(info);
		else if (nx == ItmGrp_itm_grp_nm4) doItmGrp_itm_grp_nm4_NX(info);
		else if (nx == ItmGrp_itm_grp_flg5) doItmGrp_itm_grp_flg5_NX(info);
		else if (nx == ItmGrp_itm_grp_cd5) doItmGrp_itm_grp_cd5_NX(info);
		else if (nx == ItmGrp_itm_grp_nm5) doItmGrp_itm_grp_nm5_NX(info);
		else if (nx == ItmGrp_itm_grp_flg6) doItmGrp_itm_grp_flg6_NX(info);
		else if (nx == ItmGrp_itm_grp_cd6) doItmGrp_itm_grp_cd6_NX(info);
		else if (nx == ItmGrp_itm_grp_nm6) doItmGrp_itm_grp_nm6_NX(info);
		else if (nx == ItmGrp_itm_grp_flg7) doItmGrp_itm_grp_flg7_NX(info);
		else if (nx == ItmGrp_itm_grp_cd7) doItmGrp_itm_grp_cd7_NX(info);
		else if (nx == ItmGrp_itm_grp_nm7) doItmGrp_itm_grp_nm7_NX(info);
		else if (nx == ItmGrp_itm_grp_flg8) doItmGrp_itm_grp_flg8_NX(info);
		else if (nx == ItmGrp_itm_grp_cd8) doItmGrp_itm_grp_cd8_NX(info);
		else if (nx == ItmGrp_itm_grp_nm8) doItmGrp_itm_grp_nm8_NX(info);
		else if (nx == ItmGrp_itm_grp_flg9) doItmGrp_itm_grp_flg9_NX(info);
		else if (nx == ItmGrp_itm_grp_cd9) doItmGrp_itm_grp_cd9_NX(info);
		else if (nx == ItmGrp_itm_grp_nm9) doItmGrp_itm_grp_nm9_NX(info);
		else if (nx == ItmGrp_itm_grp_flg10) doItmGrp_itm_grp_flg10_NX(info);
		else if (nx == ItmGrp_itm_grp_cd10) doItmGrp_itm_grp_cd10_NX(info);
		else if (nx == ItmGrp_itm_grp_nm10) doItmGrp_itm_grp_nm10_NX(info);
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == ItmGrp_itm_grp_cd1) doItmGrp_itm_grp_cd1_LC(info);
		else if (lc == ItmGrp_itm_grp_nm1) doItmGrp_itm_grp_nm1_LC(info);
		else if (lc == ItmGrp_itm_grp_cd2) doItmGrp_itm_grp_cd2_LC(info);
		else if (lc == ItmGrp_itm_grp_nm2) doItmGrp_itm_grp_nm2_LC(info);
		else if (lc == ItmGrp_itm_grp_cd3) doItmGrp_itm_grp_cd3_LC(info);
		else if (lc == ItmGrp_itm_grp_nm3) doItmGrp_itm_grp_nm3_LC(info);
		else if (lc == ItmGrp_itm_grp_cd4) doItmGrp_itm_grp_cd4_LC(info);
		else if (lc == ItmGrp_itm_grp_nm4) doItmGrp_itm_grp_nm4_LC(info);
		else if (lc == ItmGrp_itm_grp_cd5) doItmGrp_itm_grp_cd5_LC(info);
		else if (lc == ItmGrp_itm_grp_nm5) doItmGrp_itm_grp_nm5_LC(info);
		else if (lc == ItmGrp_itm_grp_cd6) doItmGrp_itm_grp_cd6_LC(info);
		else if (lc == ItmGrp_itm_grp_nm6) doItmGrp_itm_grp_nm6_LC(info);
		else if (lc == ItmGrp_itm_grp_cd7) doItmGrp_itm_grp_cd7_LC(info);
		else if (lc == ItmGrp_itm_grp_nm7) doItmGrp_itm_grp_nm7_LC(info);
		else if (lc == ItmGrp_itm_grp_cd8) doItmGrp_itm_grp_cd8_LC(info);
		else if (lc == ItmGrp_itm_grp_nm8) doItmGrp_itm_grp_nm8_LC(info);
		else if (lc == ItmGrp_itm_grp_cd9) doItmGrp_itm_grp_cd9_LC(info);
		else if (lc == ItmGrp_itm_grp_nm9) doItmGrp_itm_grp_nm9_LC(info);
		else if (lc == ItmGrp_itm_grp_cd10) doItmGrp_itm_grp_cd10_LC(info);
		else if (lc == ItmGrp_itm_grp_nm10) doItmGrp_itm_grp_nm10_LC(info);
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrp]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrp_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd1]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd2]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd3]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd4]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd5]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd6]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd7]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd8]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd9]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrp_itm_grp_cd10]の作成メソッド
	 */
	public MCList getItmGrp_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}