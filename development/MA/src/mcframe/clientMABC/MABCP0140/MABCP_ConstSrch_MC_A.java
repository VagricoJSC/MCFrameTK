package mcframe.clientMABC.MABCP0140;

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
 * 画面"MABCP_ConstSrch"パネルクラスです。<p>
 *
 * 定数定義の検索を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ConstSrch_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0140";

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
	public MCLabel Cnd_module_id_Label = null;
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_module_id = null;
	/**
	 * Module name モジュール名.<p>
	 *
	 */
	public MCTextField Cnd_module_nm = null;
	public MCLabel Cnd_const_grp_Label = null;
	/**
	 * Constant group 定数グループ.<p>
	 *
	 */
	public MCTextComboBox Cnd_const_grp = null;
	/**
	 * Constant group name 定数グループ名.<p>
	 *
	 */
	public MCTextField Cnd_const_grp_nm = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public MCCheckBox SrchBtn_partial_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton SrchBtn_srch = null;
	// [Bottom]ブロック関連のField定義
	public MCPanel BottomPanel = null;
	// [Bottom]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0140.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_module_id = null;
	/**
	 * Module name モジュール名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_module_nm = null;
	/**
	 * Constant group 定数グループ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_const_grp = null;
	/**
	 * Constant group name 定数グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_const_grp_nm = null;
	// [DtlSub]ブロック関連のField定義
	public MCPanel DtlSubPanel = null;
	public MCScrollPane DtlSubScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0140.DtlSubR> DtlSubTable = null;
	// [DtlSub]ブロックの項目のField定義
	/**
	 * Key キー.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_const_key = null;
	/**
	 * Value 値.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_const_value = null;
	/**
	 * Name 名称.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_const_name = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_const_rmrks = null;
	/**
	 * Attribute 1 属性１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col1 = null;
	/**
	 * Attribute 2 属性２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col2 = null;
	/**
	 * Attribute 3 属性３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col3 = null;
	/**
	 * Attribute 4 属性４.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col4 = null;
	/**
	 * Attribute 5 属性５.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col5 = null;
	/**
	 * Attribute 6 属性６.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col6 = null;
	/**
	 * Attribute 7 属性７.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col7 = null;
	/**
	 * Attribute 8 属性８.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col8 = null;
	/**
	 * Attribute 9 属性９.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col9 = null;
	/**
	 * Attribute 10 属性１０.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col10 = null;
	/**
	 * Attribute 11 属性１１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col11 = null;
	/**
	 * Attribute 12 属性１２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col12 = null;
	/**
	 * Attribute 13 属性１３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col13 = null;
	/**
	 * Attribute 14 属性１４.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col14 = null;
	/**
	 * Attribute 15 属性１５.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col15 = null;
	/**
	 * Attribute 16 属性１６.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col16 = null;
	/**
	 * Attribute 17 属性１７.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col17 = null;
	/**
	 * Attribute 18 属性１８.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col18 = null;
	/**
	 * Attribute 19 属性１９.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col19 = null;
	/**
	 * Attribute 20 属性２０.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col20 = null;
	/**
	 * Attribute 21 属性２１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col21 = null;
	/**
	 * Attribute 22 属性２２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col22 = null;
	/**
	 * Attribute 23 属性２３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col23 = null;
	/**
	 * Attribute 24 属性２４.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col24 = null;
	/**
	 * Attribute 25 属性２５.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col25 = null;
	/**
	 * Attribute 26 属性２６.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col26 = null;
	/**
	 * Attribute 27 属性２７.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col27 = null;
	/**
	 * Attribute 28 属性２８.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col28 = null;
	/**
	 * Attribute 29 属性２９.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col29 = null;
	/**
	 * Attribute 30 属性３０.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_col30 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0140.CndR aCndR;
	/** [SrchBtn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0140.SrchBtnR aSrchBtnR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0140.DtlR> aDtlL;
	/** [DtlSub]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0140.DtlSubR> aDtlSubL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0140.CndR createCndR() {
		return mcframe.clientMABC.MABCP0140.CndR.create();
	}

	/**
	 * 項目コピーによってaSrchBtnRを設定します。
	 *
	 * aSrchBtnRのインスタンスは変更されません。
	 *
	 * @param row SrchBtnR
	 */
	public void setSrchBtnR(mcframe.clientMABC.MABCP0140.SrchBtnR row) {
		if (row != null) {
			MCRow.copyall(getSrchBtnR(), row);
		}
	}

	/**
	 * [SrchBtn]ブロックのコンテナaSrchBtnRを返します。
	 *
	 * @return SrchBtnR
	 */
	public mcframe.clientMABC.MABCP0140.SrchBtnR getSrchBtnR() {
		return aSrchBtnR;
	}

	/**
	 * aSrchBtnRを作成します。
	 *
	 * @return SrchBtnR
	 */
	public mcframe.clientMABC.MABCP0140.SrchBtnR createSrchBtnR() {
		return mcframe.clientMABC.MABCP0140.SrchBtnR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0140.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0140.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0140.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0140.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0140.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0140.DtlR.class);
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
	 * コピーによってaDtlSubLを設定します。
	 *
	 * aDtlSubLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSubL
	 */
	public void setDtlSubL(MCList<mcframe.clientMABC.MABCP0140.DtlSubR> aList) {
		if (getDtlSubL() != aList) {
			getDtlSubL().setAll(aList);
		}
	}

	/**
	 * [DtlSub]ブロックのコンテナaDtlSubLを返します。
	 *
	 * @return DtlSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0140.DtlSubR> getDtlSubL() {
		return aDtlSubL;
	}

	/**
	 * aDtlSubRを作成します。
	 *
	 * @return DtlSubR
	 */
	public mcframe.clientMABC.MABCP0140.DtlSubR createDtlSubR() {
		return mcframe.clientMABC.MABCP0140.DtlSubR.create();
	}

	/**
	 * aDtlSubLを作成します。
	 *
	 * @return DtlSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0140.DtlSubR> createDtlSubL() {
		return MCList.create(mcframe.clientMABC.MABCP0140.DtlSubR.class);
	}

	/**
	 * DtlSubTableを初期化します。
	 */
	protected void createDtlSubTable(){
		if(DtlSubTable == null){
			DtlSubTable = beansFactory.createTable2("DtlSub.table");
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
		if(!MCCollectionUtil.contains(ret, getSrchBtnR())) ret.add(getSrchBtnR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlSubL())) ret.add(getDtlSubL());
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
		if(aCnt == getSrchBtnR()) return "SrchBtn";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlSubL()) return "DtlSub";
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
		if(bId.equals("SrchBtn")) return getSrchBtnR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlSub")) return getDtlSubL();
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
		ret.add(SrchBtnPanel);
		ret.add(BottomPanel);
		ret.add(DtlPanel);
		ret.add(DtlSubPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ConstSrch_MC_A() {
		aCndR = createCndR();
		aSrchBtnR = createSrchBtnR();
		aDtlL = createDtlL();
		aDtlSubL = createDtlSubL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ConstSrch_MC_A(String name) {
		aCndR = createCndR();
		aSrchBtnR = createSrchBtnR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlSubL = createDtlSubL();
		createDtlSubTable();
		DtlSubTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_ConstSrch_MC.jbCreateCnd((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbCreateSrchBtn((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbCreateBottom((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbCreateDtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbCreateDtlSub((MABCP_ConstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ConstSrch p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MABCP_ConstSrch p) {
	}

	/**
	 * [Bottom]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBottom(MABCP_ConstSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ConstSrch p) {
	}

	/**
	 * [DtlSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSub(MABCP_ConstSrch p) {
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

	
	/** [Cnd_module_id_ListPutter]の定義 */
	private MCListPutter Cnd_module_id_p = null;

	/**
	 * [Cnd_module_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_module_id_ListPutter() {
		if (Cnd_module_id_p == null) {
			Cnd_module_id_p = createCnd_module_id_ListPutter(Cnd_module_id, "module_id", "module_nm");

		}
		return Cnd_module_id_p;
	}
	
	
	/** [Cnd_const_grp_ListPutter]の定義 */
	private MCListPutter Cnd_const_grp_p = null;

	/**
	 * [Cnd_const_grp_ListPutter]の取得
	 */
	protected MCListPutter getCnd_const_grp_ListPutter() {
		if (Cnd_const_grp_p == null) {
			Cnd_const_grp_p = createCnd_const_grp_ListPutter(Cnd_const_grp, "const_grp", "const_grp_nm");

		}
		return Cnd_const_grp_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ConstSrch create(){
		MABCP_ConstSrch p = new MABCP_ConstSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ConstSrch create(String name){
		MABCP_ConstSrch p = new MABCP_ConstSrch(name);
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
		MABCP_ConstSrch_MC.jbfInitCnd((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbfInitSrchBtn((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbfInitBottom((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbfInitDtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbfInitDtlSub((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbInitCnd((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbInitSrchBtn((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbInitBottom((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbInitDtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.jbInitDtlSub((MABCP_ConstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_module_id_Label = p.beansFactory.createLabel("Cnd.module_id_Label");
		p.Cnd_module_id = p.beansFactory.createTextComboBox("Cnd.module_id");
		p.Cnd_module_id.setLabel(p.Cnd_module_id_Label);
		p.Cnd_module_nm = p.beansFactory.createTextField("Cnd.module_nm");
		p.Cnd_const_grp_Label = p.beansFactory.createLabel("Cnd.const_grp_Label");
		p.Cnd_const_grp = p.beansFactory.createTextComboBox("Cnd.const_grp");
		p.Cnd_const_grp.setLabel(p.Cnd_const_grp_Label);
		p.Cnd_const_grp_nm = p.beansFactory.createTextField("Cnd.const_grp_nm");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
		p.SrchBtn_partial_flg = p.beansFactory.createCheckBox("SrchBtn.partial_flg");
		p.SrchBtn_srch = p.beansFactory.createButton("SrchBtn.srch", "srch");
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBottom(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.BottomPanel = p.beansFactory.createPanel("Bottom");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_module_id = p.beansFactory.createTableColumn("Dtl.module_id", MCColumnType.TEXT);
		p.columnDtl_module_nm = p.beansFactory.createTableColumn("Dtl.module_nm", MCColumnType.TEXT);
		p.columnDtl_const_grp = p.beansFactory.createTableColumn("Dtl.const_grp", MCColumnType.TEXT);
		p.columnDtl_const_grp_nm = p.beansFactory.createTableColumn("Dtl.const_grp_nm", MCColumnType.TEXT);
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSub(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.DtlSubPanel = p.beansFactory.createPanel("DtlSub");
		p.DtlSubScrollPane = p.beansFactory.createScrollPane("DtlSub.scroll");
		p.createDtlSubTable();
		// ブロックの項目の初期化
		p.columnDtlSub_const_key = p.beansFactory.createTableColumn("DtlSub.const_key", MCColumnType.TEXT);
		p.columnDtlSub_const_value = p.beansFactory.createTableColumn("DtlSub.const_value", MCColumnType.TEXT);
		p.columnDtlSub_const_name = p.beansFactory.createTableColumn("DtlSub.const_name", MCColumnType.TEXT);
		p.columnDtlSub_const_rmrks = p.beansFactory.createTableColumn("DtlSub.const_rmrks", MCColumnType.TEXT);
		p.columnDtlSub_col1 = p.beansFactory.createTableColumn("DtlSub.col1", MCColumnType.TEXT);
		p.columnDtlSub_col2 = p.beansFactory.createTableColumn("DtlSub.col2", MCColumnType.TEXT);
		p.columnDtlSub_col3 = p.beansFactory.createTableColumn("DtlSub.col3", MCColumnType.TEXT);
		p.columnDtlSub_col4 = p.beansFactory.createTableColumn("DtlSub.col4", MCColumnType.TEXT);
		p.columnDtlSub_col5 = p.beansFactory.createTableColumn("DtlSub.col5", MCColumnType.TEXT);
		p.columnDtlSub_col6 = p.beansFactory.createTableColumn("DtlSub.col6", MCColumnType.TEXT);
		p.columnDtlSub_col7 = p.beansFactory.createTableColumn("DtlSub.col7", MCColumnType.TEXT);
		p.columnDtlSub_col8 = p.beansFactory.createTableColumn("DtlSub.col8", MCColumnType.TEXT);
		p.columnDtlSub_col9 = p.beansFactory.createTableColumn("DtlSub.col9", MCColumnType.TEXT);
		p.columnDtlSub_col10 = p.beansFactory.createTableColumn("DtlSub.col10", MCColumnType.TEXT);
		p.columnDtlSub_col11 = p.beansFactory.createTableColumn("DtlSub.col11", MCColumnType.TEXT);
		p.columnDtlSub_col12 = p.beansFactory.createTableColumn("DtlSub.col12", MCColumnType.TEXT);
		p.columnDtlSub_col13 = p.beansFactory.createTableColumn("DtlSub.col13", MCColumnType.TEXT);
		p.columnDtlSub_col14 = p.beansFactory.createTableColumn("DtlSub.col14", MCColumnType.TEXT);
		p.columnDtlSub_col15 = p.beansFactory.createTableColumn("DtlSub.col15", MCColumnType.TEXT);
		p.columnDtlSub_col16 = p.beansFactory.createTableColumn("DtlSub.col16", MCColumnType.TEXT);
		p.columnDtlSub_col17 = p.beansFactory.createTableColumn("DtlSub.col17", MCColumnType.TEXT);
		p.columnDtlSub_col18 = p.beansFactory.createTableColumn("DtlSub.col18", MCColumnType.TEXT);
		p.columnDtlSub_col19 = p.beansFactory.createTableColumn("DtlSub.col19", MCColumnType.TEXT);
		p.columnDtlSub_col20 = p.beansFactory.createTableColumn("DtlSub.col20", MCColumnType.TEXT);
		p.columnDtlSub_col21 = p.beansFactory.createTableColumn("DtlSub.col21", MCColumnType.TEXT);
		p.columnDtlSub_col22 = p.beansFactory.createTableColumn("DtlSub.col22", MCColumnType.TEXT);
		p.columnDtlSub_col23 = p.beansFactory.createTableColumn("DtlSub.col23", MCColumnType.TEXT);
		p.columnDtlSub_col24 = p.beansFactory.createTableColumn("DtlSub.col24", MCColumnType.TEXT);
		p.columnDtlSub_col25 = p.beansFactory.createTableColumn("DtlSub.col25", MCColumnType.TEXT);
		p.columnDtlSub_col26 = p.beansFactory.createTableColumn("DtlSub.col26", MCColumnType.TEXT);
		p.columnDtlSub_col27 = p.beansFactory.createTableColumn("DtlSub.col27", MCColumnType.TEXT);
		p.columnDtlSub_col28 = p.beansFactory.createTableColumn("DtlSub.col28", MCColumnType.TEXT);
		p.columnDtlSub_col29 = p.beansFactory.createTableColumn("DtlSub.col29", MCColumnType.TEXT);
		p.columnDtlSub_col30 = p.beansFactory.createTableColumn("DtlSub.col30", MCColumnType.TEXT);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
		p.Cnd_module_id.setListType(MCListType.FREE);
		p.Cnd_module_id.setLinkBeans(p.Cnd_module_nm);
		p.CndPanel.add(p.Cnd_module_id_Label);
		p.CndPanel.add(p.Cnd_module_id);
		p.CndPanel.setLastBeans(p.Cnd_module_id);
		p.Cnd_module_id.setNextBeans(p.Cnd_module_nm);
		p.Cnd_module_id.setRow(p.getCndR(), mcframe.clientMABC.MABCP0140.CndR.module_id_META);
		p.CndPanel.add(p.Cnd_module_nm);
		p.Cnd_module_nm.setNextBeans(p.Cnd_const_grp);
		p.Cnd_module_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0140.CndR.module_nm_META);
		p.Cnd_const_grp.setListType(MCListType.FREE);
		p.Cnd_const_grp.setLinkBeans(p.Cnd_const_grp_nm);
		p.CndPanel.add(p.Cnd_const_grp_Label);
		p.CndPanel.add(p.Cnd_const_grp);
		p.Cnd_const_grp.setNextBeans(p.Cnd_const_grp_nm);
		p.Cnd_const_grp.setRow(p.getCndR(), mcframe.clientMABC.MABCP0140.CndR.const_grp_META);
		p.CndPanel.add(p.Cnd_const_grp_nm);
		p.Cnd_const_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0140.CndR.const_grp_nm_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.add(p.SrchBtnPanel);
		p.SrchBtnPanel.setNextBeans(p.BottomPanel);
		p.SrchBtnPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.SrchBtnPanel.add(p.SrchBtn_partial_flg);
		p.SrchBtnPanel.setLastBeans(p.SrchBtn_partial_flg);
		p.SrchBtn_partial_flg.setNextBeans(p.SrchBtn_srch);
		p.SrchBtn_partial_flg.setRow(p.getSrchBtnR(), mcframe.clientMABC.MABCP0140.SrchBtnR.partial_flg_META);
		p.SrchBtn_srch.setIcon("SEARCH");
		p.SrchBtn_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtnPanel.add(p.SrchBtn_srch);
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBottom(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.add(p.BottomPanel);
		p.BottomPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.BottomPanel.add(p.DtlPanel, null);
		p.BottomPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlSubPanel);
		p.BottomPanel.add(p.DtlSubPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CLW");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSub(MABCP_ConstSrch p) {
		// ブロック関連の初期化
		p.DtlSubPanel.add(p.DtlSubScrollPane);
		p.DtlSubPanel.setLastBeans(p.DtlSubTable);
		p.DtlSubScrollPane.setViewportView(p.DtlSubTable);
		p.DtlSubTable.setList(p.getDtlSubL());
		p.DtlSubTable.setStatusColumnVisible(false);
		p.DtlSubPanel.setLayoutPosition("CRE");
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
		MABCP_ConstSrch_MC.mcInitCnd((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.mcInitSrchBtn((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.mcInitBottom((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.mcInitDtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.mcInitDtlSub((MABCP_ConstSrch)this);

		// [SRCH]ステータスのモードの設定
		MABCP_ConstSrch_MC.statusInitSRCH_Cnd((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.statusInitSRCH_SrchBtn((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.statusInitSRCH_Bottom((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.statusInitSRCH_Dtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.statusInitSRCH_DtlSub((MABCP_ConstSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ConstSrch p) {
		p.Cnd_module_id.setListListener(p);
		p.Cnd_module_id.addAllListener(p);
		p.Cnd_module_nm.setListListener(p);
		p.Cnd_module_nm.addAllListener(p);
		p.Cnd_const_grp.setListListener(p);
		p.Cnd_const_grp.addAllListener(p);
		p.Cnd_const_grp_nm.setListListener(p);
		p.Cnd_const_grp_nm.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MABCP_ConstSrch p) {
		p.SrchBtn_partial_flg.addAllListener(p);
		p.SrchBtn_srch.addAllListener(p);
		p.SrchBtn_srch.setAPMethodName("doSrchBtn_srch");
	}

	/**
	 *  [Bottom]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBottom(MABCP_ConstSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ConstSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_module_id.addAllListener(p);
		p.columnDtl_module_id.setListListener(p);
		p.columnDtl_module_nm.addAllListener(p);
		p.columnDtl_module_nm.setListListener(p);
		p.columnDtl_const_grp.addAllListener(p);
		p.columnDtl_const_grp.setListListener(p);
		p.columnDtl_const_grp_nm.addAllListener(p);
		p.columnDtl_const_grp_nm.setListListener(p);
	}

	/**
	 *  [DtlSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSub(MABCP_ConstSrch p) {
		p.DtlSubTable.addAllListener(p);
		p.columnDtlSub_const_key.addAllListener(p);
		p.columnDtlSub_const_key.setListListener(p);
		p.columnDtlSub_const_value.addAllListener(p);
		p.columnDtlSub_const_value.setListListener(p);
		p.columnDtlSub_const_name.addAllListener(p);
		p.columnDtlSub_const_name.setListListener(p);
		p.columnDtlSub_const_rmrks.addAllListener(p);
		p.columnDtlSub_const_rmrks.setListListener(p);
		p.columnDtlSub_col1.addAllListener(p);
		p.columnDtlSub_col1.setListListener(p);
		p.columnDtlSub_col2.addAllListener(p);
		p.columnDtlSub_col2.setListListener(p);
		p.columnDtlSub_col3.addAllListener(p);
		p.columnDtlSub_col3.setListListener(p);
		p.columnDtlSub_col4.addAllListener(p);
		p.columnDtlSub_col4.setListListener(p);
		p.columnDtlSub_col5.addAllListener(p);
		p.columnDtlSub_col5.setListListener(p);
		p.columnDtlSub_col6.addAllListener(p);
		p.columnDtlSub_col6.setListListener(p);
		p.columnDtlSub_col7.addAllListener(p);
		p.columnDtlSub_col7.setListListener(p);
		p.columnDtlSub_col8.addAllListener(p);
		p.columnDtlSub_col8.setListListener(p);
		p.columnDtlSub_col9.addAllListener(p);
		p.columnDtlSub_col9.setListListener(p);
		p.columnDtlSub_col10.addAllListener(p);
		p.columnDtlSub_col10.setListListener(p);
		p.columnDtlSub_col11.addAllListener(p);
		p.columnDtlSub_col11.setListListener(p);
		p.columnDtlSub_col12.addAllListener(p);
		p.columnDtlSub_col12.setListListener(p);
		p.columnDtlSub_col13.addAllListener(p);
		p.columnDtlSub_col13.setListListener(p);
		p.columnDtlSub_col14.addAllListener(p);
		p.columnDtlSub_col14.setListListener(p);
		p.columnDtlSub_col15.addAllListener(p);
		p.columnDtlSub_col15.setListListener(p);
		p.columnDtlSub_col16.addAllListener(p);
		p.columnDtlSub_col16.setListListener(p);
		p.columnDtlSub_col17.addAllListener(p);
		p.columnDtlSub_col17.setListListener(p);
		p.columnDtlSub_col18.addAllListener(p);
		p.columnDtlSub_col18.setListListener(p);
		p.columnDtlSub_col19.addAllListener(p);
		p.columnDtlSub_col19.setListListener(p);
		p.columnDtlSub_col20.addAllListener(p);
		p.columnDtlSub_col20.setListListener(p);
		p.columnDtlSub_col21.addAllListener(p);
		p.columnDtlSub_col21.setListListener(p);
		p.columnDtlSub_col22.addAllListener(p);
		p.columnDtlSub_col22.setListListener(p);
		p.columnDtlSub_col23.addAllListener(p);
		p.columnDtlSub_col23.setListListener(p);
		p.columnDtlSub_col24.addAllListener(p);
		p.columnDtlSub_col24.setListListener(p);
		p.columnDtlSub_col25.addAllListener(p);
		p.columnDtlSub_col25.setListListener(p);
		p.columnDtlSub_col26.addAllListener(p);
		p.columnDtlSub_col26.setListListener(p);
		p.columnDtlSub_col27.addAllListener(p);
		p.columnDtlSub_col27.setListListener(p);
		p.columnDtlSub_col28.addAllListener(p);
		p.columnDtlSub_col28.setListListener(p);
		p.columnDtlSub_col29.addAllListener(p);
		p.columnDtlSub_col29.setListListener(p);
		p.columnDtlSub_col30.addAllListener(p);
		p.columnDtlSub_col30.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_ConstSrch p){
		p.Cnd_module_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_module_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_const_grp.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_const_grp_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MABCP_ConstSrch p){
		p.SrchBtn_partial_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.SrchBtn_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bottom(MABCP_ConstSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABCP_ConstSrch p){
		p.columnDtl_module_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_module_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_const_grp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_const_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSub(MABCP_ConstSrch p){
		p.columnDtlSub_const_key.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_const_value.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_const_name.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_const_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSub_col30.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MABCP_ConstSrch_MC.setTableConfigDtl((MABCP_ConstSrch)this);
		MABCP_ConstSrch_MC.setTableConfigDtlSub((MABCP_ConstSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ConstSrch p) {
		p.columnDtl_module_id.setMeta(mcframe.clientMABC.MABCP0140.DtlR.module_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_module_id);
		p.columnDtl_module_nm.setMeta(mcframe.clientMABC.MABCP0140.DtlR.module_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_module_nm);
		p.columnDtl_const_grp.setMeta(mcframe.clientMABC.MABCP0140.DtlR.const_grp_META);
		p.DtlTable.addColumnConfig(p.columnDtl_const_grp);
		p.columnDtl_const_grp_nm.setMeta(mcframe.clientMABC.MABCP0140.DtlR.const_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_const_grp_nm);
	}

	/**
	 * [DtlSub]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSub(MABCP_ConstSrch p) {
		p.columnDtlSub_const_key.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.const_key_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_const_key);
		p.columnDtlSub_const_value.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.const_value_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_const_value);
		p.columnDtlSub_const_name.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.const_name_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_const_name);
		p.columnDtlSub_const_rmrks.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.const_rmrks_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_const_rmrks);
		p.columnDtlSub_col1.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col1_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col1);
		p.columnDtlSub_col2.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col2_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col2);
		p.columnDtlSub_col3.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col3_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col3);
		p.columnDtlSub_col4.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col4_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col4);
		p.columnDtlSub_col5.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col5_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col5);
		p.columnDtlSub_col6.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col6_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col6);
		p.columnDtlSub_col7.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col7_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col7);
		p.columnDtlSub_col8.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col8_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col8);
		p.columnDtlSub_col9.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col9_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col9);
		p.columnDtlSub_col10.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col10_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col10);
		p.columnDtlSub_col11.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col11_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col11);
		p.columnDtlSub_col12.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col12_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col12);
		p.columnDtlSub_col13.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col13_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col13);
		p.columnDtlSub_col14.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col14_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col14);
		p.columnDtlSub_col15.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col15_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col15);
		p.columnDtlSub_col16.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col16_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col16);
		p.columnDtlSub_col17.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col17_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col17);
		p.columnDtlSub_col18.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col18_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col18);
		p.columnDtlSub_col19.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col19_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col19);
		p.columnDtlSub_col20.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col20_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col20);
		p.columnDtlSub_col21.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col21_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col21);
		p.columnDtlSub_col22.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col22_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col22);
		p.columnDtlSub_col23.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col23_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col23);
		p.columnDtlSub_col24.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col24_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col24);
		p.columnDtlSub_col25.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col25_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col25);
		p.columnDtlSub_col26.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col26_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col26);
		p.columnDtlSub_col27.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col27_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col27);
		p.columnDtlSub_col28.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col28_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col28);
		p.columnDtlSub_col29.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col29_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col29);
		p.columnDtlSub_col30.setMeta(mcframe.clientMABC.MABCP0140.DtlSubR.col30_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_col30);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_module_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_module_id.getListConfig().setPutter(getCnd_module_id_ListPutter());
		Cnd_const_grp.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_const_grp.getListConfig().setPutter(getCnd_const_grp_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [Cnd_module_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_module_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_const_grp_ListPutter]の作成
	 */
	protected MCListPutter createCnd_const_grp_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_module_id) return getCnd_module_id(row, info);
		if(combo == Cnd_const_grp) return getCnd_const_grp(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == SrchBtn_srch) doSrchBtn_srch(info);
	}

	/**
	 * [SrchBtn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchBtn_srch(MCEventInfo info);

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
		if (vc == DtlSubTable) return doDtlSub_VC(info);
		if (vc == Cnd_module_id) return doCnd_module_id_VC(info);
		if (vc == Cnd_module_nm) return doCnd_module_nm_VC(info);
		if (vc == Cnd_const_grp) return doCnd_const_grp_VC(info);
		if (vc == Cnd_const_grp_nm) return doCnd_const_grp_nm_VC(info);
		if (vc == SrchBtn_partial_flg) return doSrchBtn_partial_flg_VC(info);
		if (vc == columnDtl_module_id) return doDtl_module_id_VC(info);
		if (vc == columnDtl_module_nm) return doDtl_module_nm_VC(info);
		if (vc == columnDtl_const_grp) return doDtl_const_grp_VC(info);
		if (vc == columnDtl_const_grp_nm) return doDtl_const_grp_nm_VC(info);
		if (vc == columnDtlSub_const_key) return doDtlSub_const_key_VC(info);
		if (vc == columnDtlSub_const_value) return doDtlSub_const_value_VC(info);
		if (vc == columnDtlSub_const_name) return doDtlSub_const_name_VC(info);
		if (vc == columnDtlSub_const_rmrks) return doDtlSub_const_rmrks_VC(info);
		if (vc == columnDtlSub_col1) return doDtlSub_col1_VC(info);
		if (vc == columnDtlSub_col2) return doDtlSub_col2_VC(info);
		if (vc == columnDtlSub_col3) return doDtlSub_col3_VC(info);
		if (vc == columnDtlSub_col4) return doDtlSub_col4_VC(info);
		if (vc == columnDtlSub_col5) return doDtlSub_col5_VC(info);
		if (vc == columnDtlSub_col6) return doDtlSub_col6_VC(info);
		if (vc == columnDtlSub_col7) return doDtlSub_col7_VC(info);
		if (vc == columnDtlSub_col8) return doDtlSub_col8_VC(info);
		if (vc == columnDtlSub_col9) return doDtlSub_col9_VC(info);
		if (vc == columnDtlSub_col10) return doDtlSub_col10_VC(info);
		if (vc == columnDtlSub_col11) return doDtlSub_col11_VC(info);
		if (vc == columnDtlSub_col12) return doDtlSub_col12_VC(info);
		if (vc == columnDtlSub_col13) return doDtlSub_col13_VC(info);
		if (vc == columnDtlSub_col14) return doDtlSub_col14_VC(info);
		if (vc == columnDtlSub_col15) return doDtlSub_col15_VC(info);
		if (vc == columnDtlSub_col16) return doDtlSub_col16_VC(info);
		if (vc == columnDtlSub_col17) return doDtlSub_col17_VC(info);
		if (vc == columnDtlSub_col18) return doDtlSub_col18_VC(info);
		if (vc == columnDtlSub_col19) return doDtlSub_col19_VC(info);
		if (vc == columnDtlSub_col20) return doDtlSub_col20_VC(info);
		if (vc == columnDtlSub_col21) return doDtlSub_col21_VC(info);
		if (vc == columnDtlSub_col22) return doDtlSub_col22_VC(info);
		if (vc == columnDtlSub_col23) return doDtlSub_col23_VC(info);
		if (vc == columnDtlSub_col24) return doDtlSub_col24_VC(info);
		if (vc == columnDtlSub_col25) return doDtlSub_col25_VC(info);
		if (vc == columnDtlSub_col26) return doDtlSub_col26_VC(info);
		if (vc == columnDtlSub_col27) return doDtlSub_col27_VC(info);
		if (vc == columnDtlSub_col28) return doDtlSub_col28_VC(info);
		if (vc == columnDtlSub_col29) return doDtlSub_col29_VC(info);
		if (vc == columnDtlSub_col30) return doDtlSub_col30_VC(info);
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
	 * [DtlSub]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[module_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_module_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[module_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_module_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[const_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_const_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[const_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_const_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SrchBtn]パネルの[partial_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSrchBtn_partial_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[module_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_module_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[const_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_const_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[const_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_const_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[const_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_const_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[const_value]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_const_value_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[const_name]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_const_name_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[const_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_const_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[col30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_col30_VC(MCEventInfo info){
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
		else if (nc == DtlSubTable) doDtlSub_NC(info);
		else if (nc == Cnd_module_id) doCnd_module_id_NC(info);
		else if (nc == Cnd_module_nm) doCnd_module_nm_NC(info);
		else if (nc == Cnd_const_grp) doCnd_const_grp_NC(info);
		else if (nc == Cnd_const_grp_nm) doCnd_const_grp_nm_NC(info);
		else if (nc == SrchBtn_partial_flg) doSrchBtn_partial_flg_NC(info);
		else if (nc == columnDtl_module_id) doDtl_module_id_NC(info);
		else if (nc == columnDtl_module_nm) doDtl_module_nm_NC(info);
		else if (nc == columnDtl_const_grp) doDtl_const_grp_NC(info);
		else if (nc == columnDtl_const_grp_nm) doDtl_const_grp_nm_NC(info);
		else if (nc == columnDtlSub_const_key) doDtlSub_const_key_NC(info);
		else if (nc == columnDtlSub_const_value) doDtlSub_const_value_NC(info);
		else if (nc == columnDtlSub_const_name) doDtlSub_const_name_NC(info);
		else if (nc == columnDtlSub_const_rmrks) doDtlSub_const_rmrks_NC(info);
		else if (nc == columnDtlSub_col1) doDtlSub_col1_NC(info);
		else if (nc == columnDtlSub_col2) doDtlSub_col2_NC(info);
		else if (nc == columnDtlSub_col3) doDtlSub_col3_NC(info);
		else if (nc == columnDtlSub_col4) doDtlSub_col4_NC(info);
		else if (nc == columnDtlSub_col5) doDtlSub_col5_NC(info);
		else if (nc == columnDtlSub_col6) doDtlSub_col6_NC(info);
		else if (nc == columnDtlSub_col7) doDtlSub_col7_NC(info);
		else if (nc == columnDtlSub_col8) doDtlSub_col8_NC(info);
		else if (nc == columnDtlSub_col9) doDtlSub_col9_NC(info);
		else if (nc == columnDtlSub_col10) doDtlSub_col10_NC(info);
		else if (nc == columnDtlSub_col11) doDtlSub_col11_NC(info);
		else if (nc == columnDtlSub_col12) doDtlSub_col12_NC(info);
		else if (nc == columnDtlSub_col13) doDtlSub_col13_NC(info);
		else if (nc == columnDtlSub_col14) doDtlSub_col14_NC(info);
		else if (nc == columnDtlSub_col15) doDtlSub_col15_NC(info);
		else if (nc == columnDtlSub_col16) doDtlSub_col16_NC(info);
		else if (nc == columnDtlSub_col17) doDtlSub_col17_NC(info);
		else if (nc == columnDtlSub_col18) doDtlSub_col18_NC(info);
		else if (nc == columnDtlSub_col19) doDtlSub_col19_NC(info);
		else if (nc == columnDtlSub_col20) doDtlSub_col20_NC(info);
		else if (nc == columnDtlSub_col21) doDtlSub_col21_NC(info);
		else if (nc == columnDtlSub_col22) doDtlSub_col22_NC(info);
		else if (nc == columnDtlSub_col23) doDtlSub_col23_NC(info);
		else if (nc == columnDtlSub_col24) doDtlSub_col24_NC(info);
		else if (nc == columnDtlSub_col25) doDtlSub_col25_NC(info);
		else if (nc == columnDtlSub_col26) doDtlSub_col26_NC(info);
		else if (nc == columnDtlSub_col27) doDtlSub_col27_NC(info);
		else if (nc == columnDtlSub_col28) doDtlSub_col28_NC(info);
		else if (nc == columnDtlSub_col29) doDtlSub_col29_NC(info);
		else if (nc == columnDtlSub_col30) doDtlSub_col30_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [SrchBtn]パネルの[partial_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSrchBtn_partial_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_key_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_value]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_value_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_name]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_name_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col4_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col5_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col6_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col7_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col8_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col9_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col10_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col11_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col12_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col13_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col14_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col15_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col16_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col17_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col18_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col19_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col20_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col21_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col22_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col23_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col24_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col25_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col26_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col27_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col28_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col29_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col30_NC(MCEventInfo info){
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
		else if (ne == DtlSubTable) doDtlSub_NE(info);
		else if (ne == Cnd_module_id) doCnd_module_id_NE(info);
		else if (ne == Cnd_module_nm) doCnd_module_nm_NE(info);
		else if (ne == Cnd_const_grp) doCnd_const_grp_NE(info);
		else if (ne == Cnd_const_grp_nm) doCnd_const_grp_nm_NE(info);
		else if (ne == SrchBtn_partial_flg) doSrchBtn_partial_flg_NE(info);
		else if (ne == columnDtl_module_id) doDtl_module_id_NE(info);
		else if (ne == columnDtl_module_nm) doDtl_module_nm_NE(info);
		else if (ne == columnDtl_const_grp) doDtl_const_grp_NE(info);
		else if (ne == columnDtl_const_grp_nm) doDtl_const_grp_nm_NE(info);
		else if (ne == columnDtlSub_const_key) doDtlSub_const_key_NE(info);
		else if (ne == columnDtlSub_const_value) doDtlSub_const_value_NE(info);
		else if (ne == columnDtlSub_const_name) doDtlSub_const_name_NE(info);
		else if (ne == columnDtlSub_const_rmrks) doDtlSub_const_rmrks_NE(info);
		else if (ne == columnDtlSub_col1) doDtlSub_col1_NE(info);
		else if (ne == columnDtlSub_col2) doDtlSub_col2_NE(info);
		else if (ne == columnDtlSub_col3) doDtlSub_col3_NE(info);
		else if (ne == columnDtlSub_col4) doDtlSub_col4_NE(info);
		else if (ne == columnDtlSub_col5) doDtlSub_col5_NE(info);
		else if (ne == columnDtlSub_col6) doDtlSub_col6_NE(info);
		else if (ne == columnDtlSub_col7) doDtlSub_col7_NE(info);
		else if (ne == columnDtlSub_col8) doDtlSub_col8_NE(info);
		else if (ne == columnDtlSub_col9) doDtlSub_col9_NE(info);
		else if (ne == columnDtlSub_col10) doDtlSub_col10_NE(info);
		else if (ne == columnDtlSub_col11) doDtlSub_col11_NE(info);
		else if (ne == columnDtlSub_col12) doDtlSub_col12_NE(info);
		else if (ne == columnDtlSub_col13) doDtlSub_col13_NE(info);
		else if (ne == columnDtlSub_col14) doDtlSub_col14_NE(info);
		else if (ne == columnDtlSub_col15) doDtlSub_col15_NE(info);
		else if (ne == columnDtlSub_col16) doDtlSub_col16_NE(info);
		else if (ne == columnDtlSub_col17) doDtlSub_col17_NE(info);
		else if (ne == columnDtlSub_col18) doDtlSub_col18_NE(info);
		else if (ne == columnDtlSub_col19) doDtlSub_col19_NE(info);
		else if (ne == columnDtlSub_col20) doDtlSub_col20_NE(info);
		else if (ne == columnDtlSub_col21) doDtlSub_col21_NE(info);
		else if (ne == columnDtlSub_col22) doDtlSub_col22_NE(info);
		else if (ne == columnDtlSub_col23) doDtlSub_col23_NE(info);
		else if (ne == columnDtlSub_col24) doDtlSub_col24_NE(info);
		else if (ne == columnDtlSub_col25) doDtlSub_col25_NE(info);
		else if (ne == columnDtlSub_col26) doDtlSub_col26_NE(info);
		else if (ne == columnDtlSub_col27) doDtlSub_col27_NE(info);
		else if (ne == columnDtlSub_col28) doDtlSub_col28_NE(info);
		else if (ne == columnDtlSub_col29) doDtlSub_col29_NE(info);
		else if (ne == columnDtlSub_col30) doDtlSub_col30_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [SrchBtn]パネルの[partial_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSrchBtn_partial_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_key_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_value]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_value_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_name]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_name_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col4_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col5_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col6_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col7_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col8_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col9_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col10_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col11_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col12_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col13_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col14_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col15_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col16_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col17_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col18_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col19_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col20_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col21_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col22_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col23_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col24_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col25_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col26_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col27_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col28_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col29_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col30_NE(MCEventInfo info){
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
		else if (nx == DtlSubTable) doDtlSub_NX(info);
		else if (nx == Cnd_module_id) doCnd_module_id_NX(info);
		else if (nx == Cnd_module_nm) doCnd_module_nm_NX(info);
		else if (nx == Cnd_const_grp) doCnd_const_grp_NX(info);
		else if (nx == Cnd_const_grp_nm) doCnd_const_grp_nm_NX(info);
		else if (nx == SrchBtn_partial_flg) doSrchBtn_partial_flg_NX(info);
		else if (nx == columnDtl_module_id) doDtl_module_id_NX(info);
		else if (nx == columnDtl_module_nm) doDtl_module_nm_NX(info);
		else if (nx == columnDtl_const_grp) doDtl_const_grp_NX(info);
		else if (nx == columnDtl_const_grp_nm) doDtl_const_grp_nm_NX(info);
		else if (nx == columnDtlSub_const_key) doDtlSub_const_key_NX(info);
		else if (nx == columnDtlSub_const_value) doDtlSub_const_value_NX(info);
		else if (nx == columnDtlSub_const_name) doDtlSub_const_name_NX(info);
		else if (nx == columnDtlSub_const_rmrks) doDtlSub_const_rmrks_NX(info);
		else if (nx == columnDtlSub_col1) doDtlSub_col1_NX(info);
		else if (nx == columnDtlSub_col2) doDtlSub_col2_NX(info);
		else if (nx == columnDtlSub_col3) doDtlSub_col3_NX(info);
		else if (nx == columnDtlSub_col4) doDtlSub_col4_NX(info);
		else if (nx == columnDtlSub_col5) doDtlSub_col5_NX(info);
		else if (nx == columnDtlSub_col6) doDtlSub_col6_NX(info);
		else if (nx == columnDtlSub_col7) doDtlSub_col7_NX(info);
		else if (nx == columnDtlSub_col8) doDtlSub_col8_NX(info);
		else if (nx == columnDtlSub_col9) doDtlSub_col9_NX(info);
		else if (nx == columnDtlSub_col10) doDtlSub_col10_NX(info);
		else if (nx == columnDtlSub_col11) doDtlSub_col11_NX(info);
		else if (nx == columnDtlSub_col12) doDtlSub_col12_NX(info);
		else if (nx == columnDtlSub_col13) doDtlSub_col13_NX(info);
		else if (nx == columnDtlSub_col14) doDtlSub_col14_NX(info);
		else if (nx == columnDtlSub_col15) doDtlSub_col15_NX(info);
		else if (nx == columnDtlSub_col16) doDtlSub_col16_NX(info);
		else if (nx == columnDtlSub_col17) doDtlSub_col17_NX(info);
		else if (nx == columnDtlSub_col18) doDtlSub_col18_NX(info);
		else if (nx == columnDtlSub_col19) doDtlSub_col19_NX(info);
		else if (nx == columnDtlSub_col20) doDtlSub_col20_NX(info);
		else if (nx == columnDtlSub_col21) doDtlSub_col21_NX(info);
		else if (nx == columnDtlSub_col22) doDtlSub_col22_NX(info);
		else if (nx == columnDtlSub_col23) doDtlSub_col23_NX(info);
		else if (nx == columnDtlSub_col24) doDtlSub_col24_NX(info);
		else if (nx == columnDtlSub_col25) doDtlSub_col25_NX(info);
		else if (nx == columnDtlSub_col26) doDtlSub_col26_NX(info);
		else if (nx == columnDtlSub_col27) doDtlSub_col27_NX(info);
		else if (nx == columnDtlSub_col28) doDtlSub_col28_NX(info);
		else if (nx == columnDtlSub_col29) doDtlSub_col29_NX(info);
		else if (nx == columnDtlSub_col30) doDtlSub_col30_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [SrchBtn]パネルの[partial_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSrchBtn_partial_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_key_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_value]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_value_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_name]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_name_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col4_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col5_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col6_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col7_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col8_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col9_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col10_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col11_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col12_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col13_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col14_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col15_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col16_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col17_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col18_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col19_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col20_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col21_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col22_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col23_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col24_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col25_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col26_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col27_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col28_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col29_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col30_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_module_id) doCnd_module_id_LC(info);
		else if (lc == Cnd_module_nm) doCnd_module_nm_LC(info);
		else if (lc == Cnd_const_grp) doCnd_const_grp_LC(info);
		else if (lc == Cnd_const_grp_nm) doCnd_const_grp_nm_LC(info);
		else if (lc == columnDtl_module_id) doDtl_module_id_LC(info);
		else if (lc == columnDtl_module_nm) doDtl_module_nm_LC(info);
		else if (lc == columnDtl_const_grp) doDtl_const_grp_LC(info);
		else if (lc == columnDtl_const_grp_nm) doDtl_const_grp_nm_LC(info);
		else if (lc == columnDtlSub_const_key) doDtlSub_const_key_LC(info);
		else if (lc == columnDtlSub_const_value) doDtlSub_const_value_LC(info);
		else if (lc == columnDtlSub_const_name) doDtlSub_const_name_LC(info);
		else if (lc == columnDtlSub_const_rmrks) doDtlSub_const_rmrks_LC(info);
		else if (lc == columnDtlSub_col1) doDtlSub_col1_LC(info);
		else if (lc == columnDtlSub_col2) doDtlSub_col2_LC(info);
		else if (lc == columnDtlSub_col3) doDtlSub_col3_LC(info);
		else if (lc == columnDtlSub_col4) doDtlSub_col4_LC(info);
		else if (lc == columnDtlSub_col5) doDtlSub_col5_LC(info);
		else if (lc == columnDtlSub_col6) doDtlSub_col6_LC(info);
		else if (lc == columnDtlSub_col7) doDtlSub_col7_LC(info);
		else if (lc == columnDtlSub_col8) doDtlSub_col8_LC(info);
		else if (lc == columnDtlSub_col9) doDtlSub_col9_LC(info);
		else if (lc == columnDtlSub_col10) doDtlSub_col10_LC(info);
		else if (lc == columnDtlSub_col11) doDtlSub_col11_LC(info);
		else if (lc == columnDtlSub_col12) doDtlSub_col12_LC(info);
		else if (lc == columnDtlSub_col13) doDtlSub_col13_LC(info);
		else if (lc == columnDtlSub_col14) doDtlSub_col14_LC(info);
		else if (lc == columnDtlSub_col15) doDtlSub_col15_LC(info);
		else if (lc == columnDtlSub_col16) doDtlSub_col16_LC(info);
		else if (lc == columnDtlSub_col17) doDtlSub_col17_LC(info);
		else if (lc == columnDtlSub_col18) doDtlSub_col18_LC(info);
		else if (lc == columnDtlSub_col19) doDtlSub_col19_LC(info);
		else if (lc == columnDtlSub_col20) doDtlSub_col20_LC(info);
		else if (lc == columnDtlSub_col21) doDtlSub_col21_LC(info);
		else if (lc == columnDtlSub_col22) doDtlSub_col22_LC(info);
		else if (lc == columnDtlSub_col23) doDtlSub_col23_LC(info);
		else if (lc == columnDtlSub_col24) doDtlSub_col24_LC(info);
		else if (lc == columnDtlSub_col25) doDtlSub_col25_LC(info);
		else if (lc == columnDtlSub_col26) doDtlSub_col26_LC(info);
		else if (lc == columnDtlSub_col27) doDtlSub_col27_LC(info);
		else if (lc == columnDtlSub_col28) doDtlSub_col28_LC(info);
		else if (lc == columnDtlSub_col29) doDtlSub_col29_LC(info);
		else if (lc == columnDtlSub_col30) doDtlSub_col30_LC(info);
	}

	/**
	 * [Cnd]パネルの[module_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[module_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_module_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[const_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_const_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[module_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_module_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[const_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_const_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_key_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_value]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_value_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_name]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_name_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[const_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_const_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col4_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col5_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col6_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col7_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col8_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col9_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col10_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col11_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col12_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col13_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col14_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col15_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col16_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col17_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col18_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col19_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col20_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col21_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col22_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col23_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col24_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col25_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col26_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col27_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col28_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col29_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[col30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_col30_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_module_id]の作成メソッド
	 */
	public MCList getCnd_module_id(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_const_grp]の作成メソッド
	 */
	public MCList getCnd_const_grp(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}