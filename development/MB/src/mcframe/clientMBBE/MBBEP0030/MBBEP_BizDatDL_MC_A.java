package mcframe.clientMBBE.MBBEP0030;

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
import mcframe.clientMBBE.MBBEP0030.MBBEP_BizDatDL_MC.MB_MBBEL0030_Srch01Caller;

/**
 * 画面"MBBEP_BizDatDL"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_BizDatDL_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBEP0030";

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
	public MCLabel Cnd_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_nm = null;
	public MCLabel Cnd_biz_dat_rmrks1_Label = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks1 = null;
	public MCLabel Cnd_biz_dat_rmrks2_Label = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks2 = null;
	public MCLabel Cnd_biz_dat_rmrks3_Label = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks3 = null;
	/**
	 * Search 検索.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_nm = null;
	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_form_file_nm = null;
	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cartridge = null;
	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public MCColumnConfig columnRslt_print_flg = null;
	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dwnld_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_rmrks1 = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_rmrks2 = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_rmrks3 = null;
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	public MCTabbedPane TabTab = null;
	// [Tab]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	public MCScrollPane Tab1_biz_dat_rmrks1ScrollPane = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextArea Tab1_biz_dat_rmrks1 = null;
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	public MCScrollPane Tab2_biz_dat_rmrks2ScrollPane = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextArea Tab2_biz_dat_rmrks2 = null;
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	public MCScrollPane Tab3_biz_dat_rmrks3ScrollPane = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextArea Tab3_biz_dat_rmrks3 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select 選択する.<p>
	 *
	 */
	public MCButton Btn_open_MBBEP0040 = null;
	/**
	 * Manual SQL select query entry 検索ＳＱＬ登録.<p>
	 *
	 */
	public MCButton Btn_open_MBBEP0060 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MB_MBBEL0030_Srch01]のCallerの作成 */
	protected MBBEP_BizDatDL_MC.MB_MBBEL0030_Srch01Caller createMB_MBBEL0030_Srch01() {
		MBBEP_BizDatDL_MC.MB_MBBEL0030_Srch01Caller<MBBEP_BizDatDL, MB_MBBEL0030_Srch01Bridge>
		caller = ((MBBEP_BizDatDL_MC)this).new MB_MBBEL0030_Srch01Caller<MBBEP_BizDatDL, MB_MBBEL0030_Srch01Bridge>(
					(MBBEP_BizDatDL)this, new MB_MBBEL0030_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBEL0030_Srch01]の呼び出し */
	protected void callMB_MBBEL0030_Srch01() {
		MCCaller caller = createMB_MBBEL0030_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0030.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0030.RsltR> aRsltL;
	/** [Tab1]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0030.Tab1R aTab1R;
	/** [Tab2]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0030.Tab2R aTab2R;
	/** [Tab3]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0030.Tab3R aTab3R;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0030.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0030.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBE.MBBEP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBE.MBBEP0030.RsltR createRsltR() {
		return mcframe.clientMBBE.MBBEP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0030.RsltR.class);
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
	 * 項目コピーによってaTab1Rを設定します。
	 *
	 * aTab1Rのインスタンスは変更されません。
	 *
	 * @param row Tab1R
	 */
	public void setTab1R(mcframe.clientMBBE.MBBEP0030.Tab1R row) {
		if (row != null) {
			MCRow.copyall(getTab1R(), row);
		}
	}

	/**
	 * [Tab1]ブロックのコンテナaTab1Rを返します。
	 *
	 * @return Tab1R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab1R getTab1R() {
		return aTab1R;
	}

	/**
	 * aTab1Rを作成します。
	 *
	 * @return Tab1R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab1R createTab1R() {
		return mcframe.clientMBBE.MBBEP0030.Tab1R.create();
	}

	/**
	 * 項目コピーによってaTab2Rを設定します。
	 *
	 * aTab2Rのインスタンスは変更されません。
	 *
	 * @param row Tab2R
	 */
	public void setTab2R(mcframe.clientMBBE.MBBEP0030.Tab2R row) {
		if (row != null) {
			MCRow.copyall(getTab2R(), row);
		}
	}

	/**
	 * [Tab2]ブロックのコンテナaTab2Rを返します。
	 *
	 * @return Tab2R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab2R getTab2R() {
		return aTab2R;
	}

	/**
	 * aTab2Rを作成します。
	 *
	 * @return Tab2R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab2R createTab2R() {
		return mcframe.clientMBBE.MBBEP0030.Tab2R.create();
	}

	/**
	 * 項目コピーによってaTab3Rを設定します。
	 *
	 * aTab3Rのインスタンスは変更されません。
	 *
	 * @param row Tab3R
	 */
	public void setTab3R(mcframe.clientMBBE.MBBEP0030.Tab3R row) {
		if (row != null) {
			MCRow.copyall(getTab3R(), row);
		}
	}

	/**
	 * [Tab3]ブロックのコンテナaTab3Rを返します。
	 *
	 * @return Tab3R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab3R getTab3R() {
		return aTab3R;
	}

	/**
	 * aTab3Rを作成します。
	 *
	 * @return Tab3R
	 */
	public mcframe.clientMBBE.MBBEP0030.Tab3R createTab3R() {
		return mcframe.clientMBBE.MBBEP0030.Tab3R.create();
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
		if(!MCCollectionUtil.contains(ret, getTab1R())) ret.add(getTab1R());
		if(!MCCollectionUtil.contains(ret, getTab2R())) ret.add(getTab2R());
		if(!MCCollectionUtil.contains(ret, getTab3R())) ret.add(getTab3R());
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
		if(aCnt == getTab1R()) return "Tab1";
		if(aCnt == getTab2R()) return "Tab2";
		if(aCnt == getTab3R()) return "Tab3";
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
		if(bId.equals("Tab1")) return getTab1R();
		if(bId.equals("Tab2")) return getTab2R();
		if(bId.equals("Tab3")) return getTab3R();
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
		ret.add(RsltPanel);
		ret.add(TabPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDL_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aTab1R = createTab1R();
		aTab2R = createTab2R();
		aTab3R = createTab3R();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BizDatDL_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aTab1R = createTab1R();
		aTab2R = createTab2R();
		aTab3R = createTab3R();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_BizDatDL_MC.jbCreateCnd((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateRslt((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateTab((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateTab1((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateTab2((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateTab3((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbCreateBtn((MBBEP_BizDatDL)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_BizDatDL p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBEP_BizDatDL p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MBBEP_BizDatDL p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MBBEP_BizDatDL p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MBBEP_BizDatDL p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MBBEP_BizDatDL p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_BizDatDL p) {
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

	
	/** [Cnd_biz_dat_id_ListPutter]の定義 */
	private MCListPutter Cnd_biz_dat_id_p = null;

	/**
	 * [Cnd_biz_dat_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_dat_id_ListPutter() {
		if (Cnd_biz_dat_id_p == null) {
			Cnd_biz_dat_id_p = createCnd_biz_dat_id_ListPutter(Cnd_biz_dat_id, "biz_dat_id", "biz_dat_nm");

		}
		return Cnd_biz_dat_id_p;
	}
	
	
	/** [Rslt_cartridge_ListPutter]の定義 */
	private MCListPutter Rslt_cartridge_p = null;

	/**
	 * [Rslt_cartridge_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cartridge_ListPutter() {
		if (Rslt_cartridge_p == null) {
			Rslt_cartridge_p = createRslt_cartridge_ListPutter(columnRslt_cartridge, "cartridge");

		}
		return Rslt_cartridge_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDL create(){
		MBBEP_BizDatDL p = new MBBEP_BizDatDL();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDL create(String name){
		MBBEP_BizDatDL p = new MBBEP_BizDatDL(name);
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
		MBBEP_BizDatDL_MC.jbfInitCnd((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitRslt((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitTab((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitTab1((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitTab2((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitTab3((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbfInitBtn((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitCnd((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitRslt((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitTab((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitTab1((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitTab2((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitTab3((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.jbInitBtn((MBBEP_BizDatDL)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id_Label = p.beansFactory.createLabel("Cnd.biz_dat_id_Label");
		p.Cnd_biz_dat_id = p.beansFactory.createTextComboBox("Cnd.biz_dat_id");
		p.Cnd_biz_dat_id.setLabel(p.Cnd_biz_dat_id_Label);
		p.Cnd_biz_dat_nm = p.beansFactory.createTextField("Cnd.biz_dat_nm");
		p.Cnd_biz_dat_rmrks1_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks1_Label");
		p.Cnd_biz_dat_rmrks1 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks1");
		p.Cnd_biz_dat_rmrks1.setLabel(p.Cnd_biz_dat_rmrks1_Label);
		p.Cnd_biz_dat_rmrks2_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks2_Label");
		p.Cnd_biz_dat_rmrks2 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks2");
		p.Cnd_biz_dat_rmrks2.setLabel(p.Cnd_biz_dat_rmrks2_Label);
		p.Cnd_biz_dat_rmrks3_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks3_Label");
		p.Cnd_biz_dat_rmrks3 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks3");
		p.Cnd_biz_dat_rmrks3.setLabel(p.Cnd_biz_dat_rmrks3_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_biz_dat_id = p.beansFactory.createTableColumn("Rslt.biz_dat_id", MCColumnType.TEXT);
		p.columnRslt_biz_dat_nm = p.beansFactory.createTableColumn("Rslt.biz_dat_nm", MCColumnType.TEXT);
		p.columnRslt_form_file_nm = p.beansFactory.createTableColumn("Rslt.form_file_nm", MCColumnType.TEXT);
		p.columnRslt_cartridge = p.beansFactory.createTableColumn("Rslt.cartridge", MCColumnType.TEXT_COMBO);
		p.columnRslt_print_flg = p.beansFactory.createTableColumn("Rslt.print_flg", MCColumnType.CHECK);
		p.columnRslt_dwnld_flg = p.beansFactory.createTableColumn("Rslt.dwnld_flg", MCColumnType.CHECK);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_biz_dat_rmrks1 = p.beansFactory.createTableColumn("Rslt.biz_dat_rmrks1", MCColumnType.TEXT);
		p.columnRslt_biz_dat_rmrks2 = p.beansFactory.createTableColumn("Rslt.biz_dat_rmrks2", MCColumnType.TEXT);
		p.columnRslt_biz_dat_rmrks3 = p.beansFactory.createTableColumn("Rslt.biz_dat_rmrks3", MCColumnType.TEXT);
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		p.TabTab = p.beansFactory.createTabbedPane("Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
		p.Tab1_biz_dat_rmrks1ScrollPane = p.beansFactory.createScrollPane("Tab1.biz_dat_rmrks1scroll");
		p.Tab1_biz_dat_rmrks1 = p.beansFactory.createTextArea("Tab1.biz_dat_rmrks1");
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
		p.Tab2_biz_dat_rmrks2ScrollPane = p.beansFactory.createScrollPane("Tab2.biz_dat_rmrks2scroll");
		p.Tab2_biz_dat_rmrks2 = p.beansFactory.createTextArea("Tab2.biz_dat_rmrks2");
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
		p.Tab3_biz_dat_rmrks3ScrollPane = p.beansFactory.createScrollPane("Tab3.biz_dat_rmrks3scroll");
		p.Tab3_biz_dat_rmrks3 = p.beansFactory.createTextArea("Tab3.biz_dat_rmrks3");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MBBEP0040 = p.beansFactory.createButton("Btn.open_MBBEP0040", "open");
		p.Btn_open_MBBEP0060 = p.beansFactory.createButton("Btn.open_MBBEP0060", "open");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_biz_dat_id, true);
		p.Cnd_biz_dat_id.setLinkBeans(p.Cnd_biz_dat_nm);
		p.CndPanel.add(p.Cnd_biz_dat_id_Label);
		p.CndPanel.add(p.Cnd_biz_dat_id);
		p.CndPanel.setLastBeans(p.Cnd_biz_dat_id);
		p.Cnd_biz_dat_id.setNextBeans(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0030.CndR.biz_dat_id_META);
		p.CndPanel.add(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_nm.setNextBeans(p.Cnd_biz_dat_rmrks1);
		p.Cnd_biz_dat_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0030.CndR.biz_dat_nm_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_nm, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks1_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks1);
		p.Cnd_biz_dat_rmrks1.setNextBeans(p.Cnd_biz_dat_rmrks2);
		p.Cnd_biz_dat_rmrks1.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0030.CndR.biz_dat_rmrks1_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks1, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks2_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks2);
		p.Cnd_biz_dat_rmrks2.setNextBeans(p.Cnd_biz_dat_rmrks3);
		p.Cnd_biz_dat_rmrks2.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0030.CndR.biz_dat_rmrks2_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks2, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks3_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks3);
		p.Cnd_biz_dat_rmrks3.setNextBeans(p.Cnd_srch);
		p.Cnd_biz_dat_rmrks3.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0030.CndR.biz_dat_rmrks3_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks3, true);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.TabPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.add(p.TabPanel);
		p.TabPanel.setNextBeans(p.BtnPanel);
		p.TabPanel.add(p.TabTab);
		p.TabPanel.setLastBeans(p.TabTab);
		p.TabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.TabTab.add(p.Tab1Panel, "Tab.tab1");
		p.TabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.TabTab.add(p.Tab2Panel, "Tab.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.TabTab.add(p.Tab3Panel, "Tab.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1_biz_dat_rmrks1ScrollPane.getViewport().add(p.Tab1_biz_dat_rmrks1);
		p.Tab1Panel.add(p.Tab1_biz_dat_rmrks1ScrollPane);
		p.Tab1Panel.setLastBeans(p.Tab1_biz_dat_rmrks1);
		p.Tab1_biz_dat_rmrks1.setRow(p.getTab1R(), mcframe.clientMBBE.MBBEP0030.Tab1R.biz_dat_rmrks1_META);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2_biz_dat_rmrks2ScrollPane.getViewport().add(p.Tab2_biz_dat_rmrks2);
		p.Tab2Panel.add(p.Tab2_biz_dat_rmrks2ScrollPane);
		p.Tab2Panel.setLastBeans(p.Tab2_biz_dat_rmrks2);
		p.Tab2_biz_dat_rmrks2.setRow(p.getTab2R(), mcframe.clientMBBE.MBBEP0030.Tab2R.biz_dat_rmrks2_META);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3_biz_dat_rmrks3ScrollPane.getViewport().add(p.Tab3_biz_dat_rmrks3);
		p.Tab3Panel.add(p.Tab3_biz_dat_rmrks3ScrollPane);
		p.Tab3Panel.setLastBeans(p.Tab3_biz_dat_rmrks3);
		p.Tab3_biz_dat_rmrks3.setRow(p.getTab3R(), mcframe.clientMBBE.MBBEP0030.Tab3R.biz_dat_rmrks3_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_BizDatDL p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MBBEP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MBBEP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MBBEP0040);
		p.Btn_open_MBBEP0040.setNextBeans(p.Btn_open_MBBEP0060);
		p.Btn_open_MBBEP0060.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MBBEP0060);
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
		MBBEP_BizDatDL_MC.mcInitCnd((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitRslt((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitTab((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitTab1((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitTab2((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitTab3((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.mcInitBtn((MBBEP_BizDatDL)this);

		// [SRCH]ステータスのモードの設定
		MBBEP_BizDatDL_MC.statusInitSRCH_Cnd((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Rslt((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Tab((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Tab1((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Tab2((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Tab3((MBBEP_BizDatDL)this);
		MBBEP_BizDatDL_MC.statusInitSRCH_Btn((MBBEP_BizDatDL)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_BizDatDL p) {
		p.Cnd_biz_dat_id.setListListener(p);
		p.Cnd_biz_dat_id.addAllListener(p);
		p.Cnd_biz_dat_nm.setListListener(p);
		p.Cnd_biz_dat_nm.addAllListener(p);
		p.Cnd_biz_dat_rmrks1.setListListener(p);
		p.Cnd_biz_dat_rmrks1.addAllListener(p);
		p.Cnd_biz_dat_rmrks2.setListListener(p);
		p.Cnd_biz_dat_rmrks2.addAllListener(p);
		p.Cnd_biz_dat_rmrks3.setListListener(p);
		p.Cnd_biz_dat_rmrks3.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBEP_BizDatDL p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_biz_dat_id.addAllListener(p);
		p.columnRslt_biz_dat_id.setListListener(p);
		p.columnRslt_biz_dat_nm.addAllListener(p);
		p.columnRslt_biz_dat_nm.setListListener(p);
		p.columnRslt_form_file_nm.addAllListener(p);
		p.columnRslt_form_file_nm.setListListener(p);
		p.columnRslt_cartridge.addAllListener(p);
		p.columnRslt_cartridge.setListListener(p);
		p.columnRslt_print_flg.addAllListener(p);
		p.columnRslt_dwnld_flg.addAllListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
		p.columnRslt_biz_dat_rmrks1.addAllListener(p);
		p.columnRslt_biz_dat_rmrks1.setListListener(p);
		p.columnRslt_biz_dat_rmrks2.addAllListener(p);
		p.columnRslt_biz_dat_rmrks2.setListListener(p);
		p.columnRslt_biz_dat_rmrks3.addAllListener(p);
		p.columnRslt_biz_dat_rmrks3.setListListener(p);
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MBBEP_BizDatDL p) {
		p.TabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MBBEP_BizDatDL p) {
		p.Tab1_biz_dat_rmrks1.addAllListener(p);
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MBBEP_BizDatDL p) {
		p.Tab2_biz_dat_rmrks2.addAllListener(p);
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MBBEP_BizDatDL p) {
		p.Tab3_biz_dat_rmrks3.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_BizDatDL p) {
		p.Btn_open_MBBEP0040.addAllListener(p);
		p.Btn_open_MBBEP0040.setAPMethodName("doBtn_open_MBBEP0040");
		p.Btn_open_MBBEP0060.addAllListener(p);
		p.Btn_open_MBBEP0060.setAPMethodName("doBtn_open_MBBEP0060");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBEP_BizDatDL p){
		p.Cnd_biz_dat_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBEP_BizDatDL p){
		p.columnRslt_biz_dat_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_form_file_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cartridge.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_print_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dwnld_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_rmrks1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_biz_dat_rmrks2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_biz_dat_rmrks3.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab(MBBEP_BizDatDL p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MBBEP_BizDatDL p){
		p.Tab1_biz_dat_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MBBEP_BizDatDL p){
		p.Tab2_biz_dat_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MBBEP_BizDatDL p){
		p.Tab3_biz_dat_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBEP_BizDatDL p){
		p.Btn_open_MBBEP0040.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MBBEP0060.putMode(p, SRCH, MCMode.ENABLE);

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
		MBBEP_BizDatDL_MC.setTableConfigRslt((MBBEP_BizDatDL)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBEP_BizDatDL p) {
		p.columnRslt_biz_dat_id.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.biz_dat_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_id);
		p.columnRslt_biz_dat_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.biz_dat_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_nm);
		p.columnRslt_form_file_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.form_file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_form_file_nm);
		p.columnRslt_cartridge.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.cartridge_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cartridge);
		p.columnRslt_print_flg.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.print_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_print_flg);
		p.columnRslt_dwnld_flg.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.dwnld_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dwnld_flg);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_biz_dat_rmrks1.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.biz_dat_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_rmrks1);
		p.columnRslt_biz_dat_rmrks2.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.biz_dat_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_rmrks2);
		p.columnRslt_biz_dat_rmrks3.setMeta(mcframe.clientMBBE.MBBEP0030.RsltR.biz_dat_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_rmrks3);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_dat_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_dat_id.getListConfig().setPutter(getCnd_biz_dat_id_ListPutter());
		columnRslt_cartridge.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_cartridge.getListConfig().setPutter(getRslt_cartridge_ListPutter());
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
	 * [Cnd_biz_dat_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_dat_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BizDatID");
		return lp;
	}
	 
	/**
	 * [Rslt_cartridge_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cartridge_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_biz_dat_id) return getCnd_biz_dat_id(row, info);
		if(combo == columnRslt_cartridge) return getRslt_cartridge(row, info);
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
		else if (ap == Btn_open_MBBEP0040) doBtn_open_MBBEP0040(info);
		else if (ap == Btn_open_MBBEP0060) doBtn_open_MBBEP0060(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBEP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBEP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBEP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBEP0060(MCEventInfo info);

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
		if (vc == TabTab) return doTab_VC(info);
		if (vc == Cnd_biz_dat_id) return doCnd_biz_dat_id_VC(info);
		if (vc == Cnd_biz_dat_nm) return doCnd_biz_dat_nm_VC(info);
		if (vc == Cnd_biz_dat_rmrks1) return doCnd_biz_dat_rmrks1_VC(info);
		if (vc == Cnd_biz_dat_rmrks2) return doCnd_biz_dat_rmrks2_VC(info);
		if (vc == Cnd_biz_dat_rmrks3) return doCnd_biz_dat_rmrks3_VC(info);
		if (vc == columnRslt_biz_dat_id) return doRslt_biz_dat_id_VC(info);
		if (vc == columnRslt_biz_dat_nm) return doRslt_biz_dat_nm_VC(info);
		if (vc == columnRslt_form_file_nm) return doRslt_form_file_nm_VC(info);
		if (vc == columnRslt_cartridge) return doRslt_cartridge_VC(info);
		if (vc == columnRslt_print_flg) return doRslt_print_flg_VC(info);
		if (vc == columnRslt_dwnld_flg) return doRslt_dwnld_flg_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_biz_dat_rmrks1) return doRslt_biz_dat_rmrks1_VC(info);
		if (vc == columnRslt_biz_dat_rmrks2) return doRslt_biz_dat_rmrks2_VC(info);
		if (vc == columnRslt_biz_dat_rmrks3) return doRslt_biz_dat_rmrks3_VC(info);
		if (vc == Tab1_biz_dat_rmrks1) return doTab1_biz_dat_rmrks1_VC(info);
		if (vc == Tab2_biz_dat_rmrks2) return doTab2_biz_dat_rmrks2_VC(info);
		if (vc == Tab3_biz_dat_rmrks3) return doTab3_biz_dat_rmrks3_VC(info);
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
	 * [Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[form_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_form_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cartridge]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cartridge_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dwnld_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dwnld_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tab1]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab1_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tab2]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab2_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tab3]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab3_biz_dat_rmrks3_VC(MCEventInfo info){
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
		else if (nc == TabTab) doTab_NC(info);
		else if (nc == Cnd_biz_dat_id) doCnd_biz_dat_id_NC(info);
		else if (nc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NC(info);
		else if (nc == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NC(info);
		else if (nc == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NC(info);
		else if (nc == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NC(info);
		else if (nc == columnRslt_biz_dat_id) doRslt_biz_dat_id_NC(info);
		else if (nc == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NC(info);
		else if (nc == columnRslt_form_file_nm) doRslt_form_file_nm_NC(info);
		else if (nc == columnRslt_cartridge) doRslt_cartridge_NC(info);
		else if (nc == columnRslt_print_flg) doRslt_print_flg_NC(info);
		else if (nc == columnRslt_dwnld_flg) doRslt_dwnld_flg_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_biz_dat_rmrks1) doRslt_biz_dat_rmrks1_NC(info);
		else if (nc == columnRslt_biz_dat_rmrks2) doRslt_biz_dat_rmrks2_NC(info);
		else if (nc == columnRslt_biz_dat_rmrks3) doRslt_biz_dat_rmrks3_NC(info);
		else if (nc == Tab1_biz_dat_rmrks1) doTab1_biz_dat_rmrks1_NC(info);
		else if (nc == Tab2_biz_dat_rmrks2) doTab2_biz_dat_rmrks2_NC(info);
		else if (nc == Tab3_biz_dat_rmrks3) doTab3_biz_dat_rmrks3_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[form_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_form_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cartridge]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cartridge_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dwnld_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dwnld_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Tab1]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab1_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Tab2]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab2_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Tab3]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab3_biz_dat_rmrks3_NC(MCEventInfo info){
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
		else if (ne == TabTab) doTab_NE(info);
		else if (ne == Cnd_biz_dat_id) doCnd_biz_dat_id_NE(info);
		else if (ne == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NE(info);
		else if (ne == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NE(info);
		else if (ne == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NE(info);
		else if (ne == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NE(info);
		else if (ne == columnRslt_biz_dat_id) doRslt_biz_dat_id_NE(info);
		else if (ne == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NE(info);
		else if (ne == columnRslt_form_file_nm) doRslt_form_file_nm_NE(info);
		else if (ne == columnRslt_cartridge) doRslt_cartridge_NE(info);
		else if (ne == columnRslt_print_flg) doRslt_print_flg_NE(info);
		else if (ne == columnRslt_dwnld_flg) doRslt_dwnld_flg_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_biz_dat_rmrks1) doRslt_biz_dat_rmrks1_NE(info);
		else if (ne == columnRslt_biz_dat_rmrks2) doRslt_biz_dat_rmrks2_NE(info);
		else if (ne == columnRslt_biz_dat_rmrks3) doRslt_biz_dat_rmrks3_NE(info);
		else if (ne == Tab1_biz_dat_rmrks1) doTab1_biz_dat_rmrks1_NE(info);
		else if (ne == Tab2_biz_dat_rmrks2) doTab2_biz_dat_rmrks2_NE(info);
		else if (ne == Tab3_biz_dat_rmrks3) doTab3_biz_dat_rmrks3_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[form_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_form_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cartridge]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cartridge_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dwnld_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dwnld_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Tab1]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab1_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Tab2]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab2_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Tab3]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab3_biz_dat_rmrks3_NE(MCEventInfo info){
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
		else if (nx == TabTab) doTab_NX(info);
		else if (nx == Cnd_biz_dat_id) doCnd_biz_dat_id_NX(info);
		else if (nx == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NX(info);
		else if (nx == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NX(info);
		else if (nx == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NX(info);
		else if (nx == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NX(info);
		else if (nx == columnRslt_biz_dat_id) doRslt_biz_dat_id_NX(info);
		else if (nx == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NX(info);
		else if (nx == columnRslt_form_file_nm) doRslt_form_file_nm_NX(info);
		else if (nx == columnRslt_cartridge) doRslt_cartridge_NX(info);
		else if (nx == columnRslt_print_flg) doRslt_print_flg_NX(info);
		else if (nx == columnRslt_dwnld_flg) doRslt_dwnld_flg_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_biz_dat_rmrks1) doRslt_biz_dat_rmrks1_NX(info);
		else if (nx == columnRslt_biz_dat_rmrks2) doRslt_biz_dat_rmrks2_NX(info);
		else if (nx == columnRslt_biz_dat_rmrks3) doRslt_biz_dat_rmrks3_NX(info);
		else if (nx == Tab1_biz_dat_rmrks1) doTab1_biz_dat_rmrks1_NX(info);
		else if (nx == Tab2_biz_dat_rmrks2) doTab2_biz_dat_rmrks2_NX(info);
		else if (nx == Tab3_biz_dat_rmrks3) doTab3_biz_dat_rmrks3_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[form_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_form_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cartridge]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cartridge_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dwnld_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dwnld_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Tab1]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab1_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Tab2]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab2_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Tab3]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab3_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_biz_dat_id) doCnd_biz_dat_id_LC(info);
		else if (lc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_LC(info);
		else if (lc == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_LC(info);
		else if (lc == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_LC(info);
		else if (lc == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_LC(info);
		else if (lc == columnRslt_biz_dat_id) doRslt_biz_dat_id_LC(info);
		else if (lc == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_LC(info);
		else if (lc == columnRslt_form_file_nm) doRslt_form_file_nm_LC(info);
		else if (lc == columnRslt_cartridge) doRslt_cartridge_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_biz_dat_rmrks1) doRslt_biz_dat_rmrks1_LC(info);
		else if (lc == columnRslt_biz_dat_rmrks2) doRslt_biz_dat_rmrks2_LC(info);
		else if (lc == columnRslt_biz_dat_rmrks3) doRslt_biz_dat_rmrks3_LC(info);
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[form_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_form_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cartridge]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cartridge_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_dat_id]の作成メソッド
	 */
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBizDatID(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_cartridge]の作成メソッド
	 */
	public MCList getRslt_cartridge(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0030.Srch01")) {
			return new MB_MBBEL0030_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0030_Srch01;

		/** コンストラクタ */
		protected MB_MBBEL0030_Srch01Bridge() {
			p_MB_MBBEL0030_Srch01 = new MCParam(PDef.MB_MBBEL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0030.RsltR.class));

			p_MB_MBBEL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0030.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0030.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0030.RsltR>)p_MB_MBBEL0030_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}