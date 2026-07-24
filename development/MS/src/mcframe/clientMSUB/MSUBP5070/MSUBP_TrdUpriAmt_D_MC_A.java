package mcframe.clientMSUB.MSUBP5070;

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
 * 画面"MSUBP_TrdUpriAmt_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUBP_TrdUpriAmt_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MSUBP5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [TrdUpriAmt]ブロック関連のField定義
	public MCPanel TrdUpriAmtPanel = null;
	public MCScrollPane TrdUpriAmtScrollPane = null;
	public MCTable2<mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR> TrdUpriAmtTable = null;
	// [TrdUpriAmt]ブロックの項目のField定義
	/**
	 * Manual price entry 単価取得対象外.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_upri_not_tgt_flg = null;
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_trd_cur_upri = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_interim_flg = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_trd_cur_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_trd_cur_inc_tax_amt = null;
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_tax_fix_flg = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_tax_rate = null;
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_tax_typ = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_inc_tax_flg = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_trd_cur_tax_amt = null;
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_trd_cur_dscnt_amt = null;
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_dscnt_rsn_cd = null;
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_dscnt_rsn_nm = null;
	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_org_trd_cur_dscnt_amt = null;
	/**
	 * Before change qty. 変更前数量.<p>
	 *
	 */
	public MCColumnConfig columnTrdUpriAmt_org_qty = null;
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
	
	/** [TrdUpriAmt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR> aTrdUpriAmtL;

	/**
	 * コピーによってaTrdUpriAmtLを設定します。
	 *
	 * aTrdUpriAmtLのインスタンスは変更されません。
	 *
	 * @param dataset TrdUpriAmtL
	 */
	public void setTrdUpriAmtL(MCList<mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR> aList) {
		if (getTrdUpriAmtL() != aList) {
			getTrdUpriAmtL().setAll(aList);
		}
	}

	/**
	 * [TrdUpriAmt]ブロックのコンテナaTrdUpriAmtLを返します。
	 *
	 * @return TrdUpriAmtL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR> getTrdUpriAmtL() {
		return aTrdUpriAmtL;
	}

	/**
	 * aTrdUpriAmtRを作成します。
	 *
	 * @return TrdUpriAmtR
	 */
	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR createTrdUpriAmtR() {
		return mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.create();
	}

	/**
	 * aTrdUpriAmtLを作成します。
	 *
	 * @return TrdUpriAmtL
	 */
	public MCList<mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR> createTrdUpriAmtL() {
		return MCList.create(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	}

	/**
	 * TrdUpriAmtTableを初期化します。
	 */
	protected void createTrdUpriAmtTable(){
		if(TrdUpriAmtTable == null){
			TrdUpriAmtTable = beansFactory.createTable2("TrdUpriAmt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTrdUpriAmtL())) ret.add(getTrdUpriAmtL());
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
		if(aCnt == getTrdUpriAmtL()) return "TrdUpriAmt";
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
		if(bId.equals("TrdUpriAmt")) return getTrdUpriAmtL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TrdUpriAmtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_TrdUpriAmt_D_MC_A() {
		aTrdUpriAmtL = createTrdUpriAmtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_TrdUpriAmt_D_MC_A(String name) {
		aTrdUpriAmtL = createTrdUpriAmtL();
		createTrdUpriAmtTable();
		TrdUpriAmtTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSUBP_TrdUpriAmt_D_MC.jbCreateTrdUpriAmt((MSUBP_TrdUpriAmt_D)this);
	}

	/**
	 * [TrdUpriAmt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTrdUpriAmt(MSUBP_TrdUpriAmt_D p) {
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

	
	/** [TrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter TrdUpriAmt_tax_cd_p = null;

	/**
	 * [TrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getTrdUpriAmt_tax_cd_ListPutter() {
		if (TrdUpriAmt_tax_cd_p == null) {
			TrdUpriAmt_tax_cd_p = createTrdUpriAmt_tax_cd_ListPutter(columnTrdUpriAmt_tax_cd, "tax_cd");

		}
		return TrdUpriAmt_tax_cd_p;
	}
	
	
	/** [TrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter TrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [TrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (TrdUpriAmt_dscnt_rsn_cd_p == null) {
			TrdUpriAmt_dscnt_rsn_cd_p = createTrdUpriAmt_dscnt_rsn_cd_ListPutter(columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd");

		}
		return TrdUpriAmt_dscnt_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_TrdUpriAmt_D create(){
		MSUBP_TrdUpriAmt_D p = new MSUBP_TrdUpriAmt_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUBP_TrdUpriAmt_D create(String name){
		MSUBP_TrdUpriAmt_D p = new MSUBP_TrdUpriAmt_D(name);
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
		MSUBP_TrdUpriAmt_D_MC.jbfInitTrdUpriAmt((MSUBP_TrdUpriAmt_D)this);
		MSUBP_TrdUpriAmt_D_MC.jbInitTrdUpriAmt((MSUBP_TrdUpriAmt_D)this);
	}

	/**
	 * [TrdUpriAmt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTrdUpriAmt(MSUBP_TrdUpriAmt_D p) {
		// ブロック関連の初期化
		p.TrdUpriAmtPanel = p.beansFactory.createPanel("TrdUpriAmt");
		p.TrdUpriAmtScrollPane = p.beansFactory.createScrollPane("TrdUpriAmt.scroll");
		p.createTrdUpriAmtTable();
		// ブロックの項目の初期化
		p.columnTrdUpriAmt_upri_not_tgt_flg = p.beansFactory.createTableColumn("TrdUpriAmt.upri_not_tgt_flg", MCColumnType.CHECK);
		p.columnTrdUpriAmt_trd_cur_upri = p.beansFactory.createTableColumn("TrdUpriAmt.trd_cur_upri", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_interim_flg = p.beansFactory.createTableColumn("TrdUpriAmt.interim_flg", MCColumnType.CHECK);
		p.columnTrdUpriAmt_trd_cur_amt = p.beansFactory.createTableColumn("TrdUpriAmt.trd_cur_amt", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("TrdUpriAmt.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_tax_fix_flg = p.beansFactory.createTableColumn("TrdUpriAmt.tax_fix_flg", MCColumnType.CHECK);
		p.columnTrdUpriAmt_tax_cd = p.beansFactory.createTableColumn("TrdUpriAmt.tax_cd", MCColumnType.TEXT_COMBO);
		p.columnTrdUpriAmt_tax_nm = p.beansFactory.createTableColumn("TrdUpriAmt.tax_nm", MCColumnType.TEXT);
		p.columnTrdUpriAmt_tax_rate = p.beansFactory.createTableColumn("TrdUpriAmt.tax_rate", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_tax_typ = p.beansFactory.createTableColumn("TrdUpriAmt.tax_typ", MCColumnType.TEXT);
		p.columnTrdUpriAmt_inc_tax_flg = p.beansFactory.createTableColumn("TrdUpriAmt.inc_tax_flg", MCColumnType.CHECK);
		p.columnTrdUpriAmt_trd_cur_tax_amt = p.beansFactory.createTableColumn("TrdUpriAmt.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("TrdUpriAmt.trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_dscnt_rsn_cd = p.beansFactory.createTableColumn("TrdUpriAmt.dscnt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnTrdUpriAmt_dscnt_rsn_nm = p.beansFactory.createTableColumn("TrdUpriAmt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("TrdUpriAmt.org_trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnTrdUpriAmt_org_qty = p.beansFactory.createTableColumn("TrdUpriAmt.org_qty", MCColumnType.NUMBER);
	}

	/**
	 * [TrdUpriAmt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTrdUpriAmt(MSUBP_TrdUpriAmt_D p) {
		// ブロック関連の初期化
		p.add(p.TrdUpriAmtPanel);
		p.setLastBeans(p.TrdUpriAmtPanel);
		p.TrdUpriAmtPanel.add(p.TrdUpriAmtScrollPane);
		p.TrdUpriAmtPanel.setLastBeans(p.TrdUpriAmtTable);
		p.TrdUpriAmtScrollPane.setViewportView(p.TrdUpriAmtTable);
		p.TrdUpriAmtTable.setList(p.getTrdUpriAmtL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUBP_TrdUpriAmt_D_MC.mcInitTrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

		// [ENABLE]ステータスのモードの設定
		MSUBP_TrdUpriAmt_D_MC.statusInitENABLE_TrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

		// [DISABLE]ステータスのモードの設定
		MSUBP_TrdUpriAmt_D_MC.statusInitDISABLE_TrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MSUBP_TrdUpriAmt_D_MC.statusInitREAD__ONLY_TrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

		// [REQUIRED]ステータスのモードの設定
		MSUBP_TrdUpriAmt_D_MC.statusInitREQUIRED_TrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MSUBP_TrdUpriAmt_D_MC.statusInitINVISIBLE_TrdUpriAmt((MSUBP_TrdUpriAmt_D)this);

	}

	/**
	 *  [TrdUpriAmt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTrdUpriAmt(MSUBP_TrdUpriAmt_D p) {
		p.TrdUpriAmtTable.addAllListener(p);
		p.columnTrdUpriAmt_upri_not_tgt_flg.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_upri.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_upri.setListListener(p);
		p.columnTrdUpriAmt_interim_flg.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_amt.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_amt.setListListener(p);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.setListListener(p);
		p.columnTrdUpriAmt_tax_fix_flg.addAllListener(p);
		p.columnTrdUpriAmt_tax_cd.addAllListener(p);
		p.columnTrdUpriAmt_tax_cd.setListListener(p);
		p.columnTrdUpriAmt_tax_nm.addAllListener(p);
		p.columnTrdUpriAmt_tax_nm.setListListener(p);
		p.columnTrdUpriAmt_tax_rate.addAllListener(p);
		p.columnTrdUpriAmt_tax_rate.setListListener(p);
		p.columnTrdUpriAmt_tax_typ.addAllListener(p);
		p.columnTrdUpriAmt_tax_typ.setListListener(p);
		p.columnTrdUpriAmt_inc_tax_flg.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_tax_amt.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_tax_amt.setListListener(p);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.addAllListener(p);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.setListListener(p);
		p.columnTrdUpriAmt_dscnt_rsn_cd.addAllListener(p);
		p.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);
		p.columnTrdUpriAmt_dscnt_rsn_nm.addAllListener(p);
		p.columnTrdUpriAmt_dscnt_rsn_nm.setListListener(p);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.addAllListener(p);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.setListListener(p);
		p.columnTrdUpriAmt_org_qty.addAllListener(p);
		p.columnTrdUpriAmt_org_qty.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[TrdUpriAmt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_TrdUpriAmt(MSUBP_TrdUpriAmt_D p){
		p.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_upri.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTrdUpriAmt_interim_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnTrdUpriAmt_trd_cur_amt.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnTrdUpriAmt_tax_fix_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.columnTrdUpriAmt_tax_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTrdUpriAmt_tax_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_rate.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_typ.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_inc_tax_flg.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_tax_amt.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.putMode(p, ENABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_qty.putMode(p, ENABLE, MCMode.INVISIBLE);

	}

	/**
	 * [DISABLE]ステータスの[TrdUpriAmt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_TrdUpriAmt(MSUBP_TrdUpriAmt_D p){
		p.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_upri.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_interim_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_trd_cur_amt.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_tax_fix_flg.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_tax_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_tax_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_tax_rate.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_tax_typ.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_inc_tax_flg.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_tax_amt.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.putMode(p, DISABLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_qty.putMode(p, DISABLE, MCMode.INVISIBLE);

	}

	/**
	 * [READ_ONLY]ステータスの[TrdUpriAmt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_TrdUpriAmt(MSUBP_TrdUpriAmt_D p){
		p.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_upri.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_interim_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_trd_cur_amt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_fix_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_rate.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_typ.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_inc_tax_flg.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_tax_amt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.putMode(p, READ_ONLY, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_qty.putMode(p, READ_ONLY, MCMode.INVISIBLE);

	}

	/**
	 * [REQUIRED]ステータスの[TrdUpriAmt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_TrdUpriAmt(MSUBP_TrdUpriAmt_D p){
		p.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_upri.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_interim_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_trd_cur_amt.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_tax_fix_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_tax_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_tax_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_rate.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_tax_typ.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_inc_tax_flg.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_tax_amt.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REQUIRED, MCMode.ENABLE);
		p.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.putMode(p, REQUIRED, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_qty.putMode(p, REQUIRED, MCMode.INVISIBLE);

	}

	/**
	 * [INVISIBLE]ステータスの[TrdUpriAmt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_TrdUpriAmt(MSUBP_TrdUpriAmt_D p){
		p.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_upri.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_interim_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_tax_fix_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_tax_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_tax_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_tax_rate.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_tax_typ.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_inc_tax_flg.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_tax_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTrdUpriAmt_org_qty.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSUBP_TrdUpriAmt_D_MC.setTableConfigTrdUpriAmt((MSUBP_TrdUpriAmt_D)this);
	}

	/**
	 * [TrdUpriAmt]ブロックのTableの設定
	 */
	protected static void setTableConfigTrdUpriAmt(MSUBP_TrdUpriAmt_D p) {
		p.columnTrdUpriAmt_upri_not_tgt_flg.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.upri_not_tgt_flg_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_upri_not_tgt_flg);
		p.columnTrdUpriAmt_trd_cur_upri.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.trd_cur_upri_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_trd_cur_upri);
		p.columnTrdUpriAmt_interim_flg.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.interim_flg_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_interim_flg);
		p.columnTrdUpriAmt_trd_cur_amt.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.trd_cur_amt_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_trd_cur_amt);
		p.columnTrdUpriAmt_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.trd_cur_inc_tax_amt_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_trd_cur_inc_tax_amt);
		p.columnTrdUpriAmt_tax_fix_flg.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.tax_fix_flg_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_tax_fix_flg);
		p.columnTrdUpriAmt_tax_cd.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.tax_cd_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_tax_cd);
		p.columnTrdUpriAmt_tax_nm.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.tax_nm_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_tax_nm);
		p.columnTrdUpriAmt_tax_rate.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.tax_rate_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_tax_rate);
		p.columnTrdUpriAmt_tax_typ.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.tax_typ_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_tax_typ);
		p.columnTrdUpriAmt_inc_tax_flg.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.inc_tax_flg_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_inc_tax_flg);
		p.columnTrdUpriAmt_trd_cur_tax_amt.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.trd_cur_tax_amt_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_trd_cur_tax_amt);
		p.columnTrdUpriAmt_trd_cur_dscnt_amt.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.trd_cur_dscnt_amt_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_trd_cur_dscnt_amt);
		p.columnTrdUpriAmt_dscnt_rsn_cd.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.dscnt_rsn_cd_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_dscnt_rsn_cd);
		p.columnTrdUpriAmt_dscnt_rsn_nm.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.dscnt_rsn_nm_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_dscnt_rsn_nm);
		p.columnTrdUpriAmt_org_trd_cur_dscnt_amt.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.org_trd_cur_dscnt_amt_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_org_trd_cur_dscnt_amt);
		p.columnTrdUpriAmt_org_qty.setMeta(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.org_qty_META);
		p.TrdUpriAmtTable.addColumnConfig(p.columnTrdUpriAmt_org_qty);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getTrdUpriAmt_tax_cd_ListPutter());
		columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getTrdUpriAmt_dscnt_rsn_cd_ListPutter());
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
	 * [TrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [TrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnTrdUpriAmt_tax_cd) return getTrdUpriAmt_tax_cd(row, info);
		if(combo == columnTrdUpriAmt_dscnt_rsn_cd) return getTrdUpriAmt_dscnt_rsn_cd(row, info);
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
		if (vc == TrdUpriAmtTable) return doTrdUpriAmt_VC(info);
		if (vc == columnTrdUpriAmt_upri_not_tgt_flg) return doTrdUpriAmt_upri_not_tgt_flg_VC(info);
		if (vc == columnTrdUpriAmt_trd_cur_upri) return doTrdUpriAmt_trd_cur_upri_VC(info);
		if (vc == columnTrdUpriAmt_interim_flg) return doTrdUpriAmt_interim_flg_VC(info);
		if (vc == columnTrdUpriAmt_trd_cur_amt) return doTrdUpriAmt_trd_cur_amt_VC(info);
		if (vc == columnTrdUpriAmt_trd_cur_inc_tax_amt) return doTrdUpriAmt_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnTrdUpriAmt_tax_fix_flg) return doTrdUpriAmt_tax_fix_flg_VC(info);
		if (vc == columnTrdUpriAmt_tax_cd) return doTrdUpriAmt_tax_cd_VC(info);
		if (vc == columnTrdUpriAmt_tax_nm) return doTrdUpriAmt_tax_nm_VC(info);
		if (vc == columnTrdUpriAmt_tax_rate) return doTrdUpriAmt_tax_rate_VC(info);
		if (vc == columnTrdUpriAmt_tax_typ) return doTrdUpriAmt_tax_typ_VC(info);
		if (vc == columnTrdUpriAmt_inc_tax_flg) return doTrdUpriAmt_inc_tax_flg_VC(info);
		if (vc == columnTrdUpriAmt_trd_cur_tax_amt) return doTrdUpriAmt_trd_cur_tax_amt_VC(info);
		if (vc == columnTrdUpriAmt_trd_cur_dscnt_amt) return doTrdUpriAmt_trd_cur_dscnt_amt_VC(info);
		if (vc == columnTrdUpriAmt_dscnt_rsn_cd) return doTrdUpriAmt_dscnt_rsn_cd_VC(info);
		if (vc == columnTrdUpriAmt_dscnt_rsn_nm) return doTrdUpriAmt_dscnt_rsn_nm_VC(info);
		if (vc == columnTrdUpriAmt_org_trd_cur_dscnt_amt) return doTrdUpriAmt_org_trd_cur_dscnt_amt_VC(info);
		if (vc == columnTrdUpriAmt_org_qty) return doTrdUpriAmt_org_qty_VC(info);
		return true;
	}

	/**
	 * [TrdUpriAmt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[upri_not_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_upri_not_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_tax_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_tax_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_dscnt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[org_trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_org_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TrdUpriAmt]パネルの[org_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTrdUpriAmt_org_qty_VC(MCEventInfo info){
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
		if (nc == TrdUpriAmtTable) doTrdUpriAmt_NC(info);
		else if (nc == columnTrdUpriAmt_upri_not_tgt_flg) doTrdUpriAmt_upri_not_tgt_flg_NC(info);
		else if (nc == columnTrdUpriAmt_trd_cur_upri) doTrdUpriAmt_trd_cur_upri_NC(info);
		else if (nc == columnTrdUpriAmt_interim_flg) doTrdUpriAmt_interim_flg_NC(info);
		else if (nc == columnTrdUpriAmt_trd_cur_amt) doTrdUpriAmt_trd_cur_amt_NC(info);
		else if (nc == columnTrdUpriAmt_trd_cur_inc_tax_amt) doTrdUpriAmt_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnTrdUpriAmt_tax_fix_flg) doTrdUpriAmt_tax_fix_flg_NC(info);
		else if (nc == columnTrdUpriAmt_tax_cd) doTrdUpriAmt_tax_cd_NC(info);
		else if (nc == columnTrdUpriAmt_tax_nm) doTrdUpriAmt_tax_nm_NC(info);
		else if (nc == columnTrdUpriAmt_tax_rate) doTrdUpriAmt_tax_rate_NC(info);
		else if (nc == columnTrdUpriAmt_tax_typ) doTrdUpriAmt_tax_typ_NC(info);
		else if (nc == columnTrdUpriAmt_inc_tax_flg) doTrdUpriAmt_inc_tax_flg_NC(info);
		else if (nc == columnTrdUpriAmt_trd_cur_tax_amt) doTrdUpriAmt_trd_cur_tax_amt_NC(info);
		else if (nc == columnTrdUpriAmt_trd_cur_dscnt_amt) doTrdUpriAmt_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnTrdUpriAmt_dscnt_rsn_cd) doTrdUpriAmt_dscnt_rsn_cd_NC(info);
		else if (nc == columnTrdUpriAmt_dscnt_rsn_nm) doTrdUpriAmt_dscnt_rsn_nm_NC(info);
		else if (nc == columnTrdUpriAmt_org_trd_cur_dscnt_amt) doTrdUpriAmt_org_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnTrdUpriAmt_org_qty) doTrdUpriAmt_org_qty_NC(info);
	}

	/**
	 * [TrdUpriAmt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[upri_not_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_upri_not_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_typ_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_qty_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TrdUpriAmtTable) doTrdUpriAmt_NE(info);
		else if (ne == columnTrdUpriAmt_upri_not_tgt_flg) doTrdUpriAmt_upri_not_tgt_flg_NE(info);
		else if (ne == columnTrdUpriAmt_trd_cur_upri) doTrdUpriAmt_trd_cur_upri_NE(info);
		else if (ne == columnTrdUpriAmt_interim_flg) doTrdUpriAmt_interim_flg_NE(info);
		else if (ne == columnTrdUpriAmt_trd_cur_amt) doTrdUpriAmt_trd_cur_amt_NE(info);
		else if (ne == columnTrdUpriAmt_trd_cur_inc_tax_amt) doTrdUpriAmt_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnTrdUpriAmt_tax_fix_flg) doTrdUpriAmt_tax_fix_flg_NE(info);
		else if (ne == columnTrdUpriAmt_tax_cd) doTrdUpriAmt_tax_cd_NE(info);
		else if (ne == columnTrdUpriAmt_tax_nm) doTrdUpriAmt_tax_nm_NE(info);
		else if (ne == columnTrdUpriAmt_tax_rate) doTrdUpriAmt_tax_rate_NE(info);
		else if (ne == columnTrdUpriAmt_tax_typ) doTrdUpriAmt_tax_typ_NE(info);
		else if (ne == columnTrdUpriAmt_inc_tax_flg) doTrdUpriAmt_inc_tax_flg_NE(info);
		else if (ne == columnTrdUpriAmt_trd_cur_tax_amt) doTrdUpriAmt_trd_cur_tax_amt_NE(info);
		else if (ne == columnTrdUpriAmt_trd_cur_dscnt_amt) doTrdUpriAmt_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnTrdUpriAmt_dscnt_rsn_cd) doTrdUpriAmt_dscnt_rsn_cd_NE(info);
		else if (ne == columnTrdUpriAmt_dscnt_rsn_nm) doTrdUpriAmt_dscnt_rsn_nm_NE(info);
		else if (ne == columnTrdUpriAmt_org_trd_cur_dscnt_amt) doTrdUpriAmt_org_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnTrdUpriAmt_org_qty) doTrdUpriAmt_org_qty_NE(info);
	}

	/**
	 * [TrdUpriAmt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[upri_not_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_upri_not_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_typ_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_qty_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TrdUpriAmtTable) doTrdUpriAmt_NX(info);
		else if (nx == columnTrdUpriAmt_upri_not_tgt_flg) doTrdUpriAmt_upri_not_tgt_flg_NX(info);
		else if (nx == columnTrdUpriAmt_trd_cur_upri) doTrdUpriAmt_trd_cur_upri_NX(info);
		else if (nx == columnTrdUpriAmt_interim_flg) doTrdUpriAmt_interim_flg_NX(info);
		else if (nx == columnTrdUpriAmt_trd_cur_amt) doTrdUpriAmt_trd_cur_amt_NX(info);
		else if (nx == columnTrdUpriAmt_trd_cur_inc_tax_amt) doTrdUpriAmt_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnTrdUpriAmt_tax_fix_flg) doTrdUpriAmt_tax_fix_flg_NX(info);
		else if (nx == columnTrdUpriAmt_tax_cd) doTrdUpriAmt_tax_cd_NX(info);
		else if (nx == columnTrdUpriAmt_tax_nm) doTrdUpriAmt_tax_nm_NX(info);
		else if (nx == columnTrdUpriAmt_tax_rate) doTrdUpriAmt_tax_rate_NX(info);
		else if (nx == columnTrdUpriAmt_tax_typ) doTrdUpriAmt_tax_typ_NX(info);
		else if (nx == columnTrdUpriAmt_inc_tax_flg) doTrdUpriAmt_inc_tax_flg_NX(info);
		else if (nx == columnTrdUpriAmt_trd_cur_tax_amt) doTrdUpriAmt_trd_cur_tax_amt_NX(info);
		else if (nx == columnTrdUpriAmt_trd_cur_dscnt_amt) doTrdUpriAmt_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnTrdUpriAmt_dscnt_rsn_cd) doTrdUpriAmt_dscnt_rsn_cd_NX(info);
		else if (nx == columnTrdUpriAmt_dscnt_rsn_nm) doTrdUpriAmt_dscnt_rsn_nm_NX(info);
		else if (nx == columnTrdUpriAmt_org_trd_cur_dscnt_amt) doTrdUpriAmt_org_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnTrdUpriAmt_org_qty) doTrdUpriAmt_org_qty_NX(info);
	}

	/**
	 * [TrdUpriAmt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[upri_not_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_upri_not_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_typ_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnTrdUpriAmt_trd_cur_upri) doTrdUpriAmt_trd_cur_upri_LC(info);
		else if (lc == columnTrdUpriAmt_trd_cur_amt) doTrdUpriAmt_trd_cur_amt_LC(info);
		else if (lc == columnTrdUpriAmt_trd_cur_inc_tax_amt) doTrdUpriAmt_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnTrdUpriAmt_tax_cd) doTrdUpriAmt_tax_cd_LC(info);
		else if (lc == columnTrdUpriAmt_tax_nm) doTrdUpriAmt_tax_nm_LC(info);
		else if (lc == columnTrdUpriAmt_tax_rate) doTrdUpriAmt_tax_rate_LC(info);
		else if (lc == columnTrdUpriAmt_tax_typ) doTrdUpriAmt_tax_typ_LC(info);
		else if (lc == columnTrdUpriAmt_trd_cur_tax_amt) doTrdUpriAmt_trd_cur_tax_amt_LC(info);
		else if (lc == columnTrdUpriAmt_trd_cur_dscnt_amt) doTrdUpriAmt_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnTrdUpriAmt_dscnt_rsn_cd) doTrdUpriAmt_dscnt_rsn_cd_LC(info);
		else if (lc == columnTrdUpriAmt_dscnt_rsn_nm) doTrdUpriAmt_dscnt_rsn_nm_LC(info);
		else if (lc == columnTrdUpriAmt_org_trd_cur_dscnt_amt) doTrdUpriAmt_org_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnTrdUpriAmt_org_qty) doTrdUpriAmt_org_qty_LC(info);
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[tax_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_tax_typ_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [TrdUpriAmt]パネルの[org_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTrdUpriAmt_org_qty_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}