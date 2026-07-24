package mcframe.clientMABC.MABCP2040;

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
import mcframe.clientMABC.MABCP2040.MABCP_MenuConfigReg_MC.MA_MABCL2040_Srch01Caller;
import mcframe.clientMABC.MABCP2040.MABCP_MenuConfigReg_MC.MA_MABCL2040_Upd01Caller;
import mcframe.clientMABC.MABCP2040.MABCP_MenuConfigReg_MC.MA_MABCL2040_Del01Caller;

/**
 * 画面"MABCP_MenuConfigReg"パネルクラスです。<p>
 *
 * 原価メニュー構成マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_MenuConfigReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP2040";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_menu_cd_Label = null;
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_menu_cd = null;
	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public MCTextField Cnd_menu_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_menu_cd_Label = null;
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_menu_cd = null;
	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public MCTextField Hdr_menu_nm = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP2040.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D Dtl_module1_p_PPanel;
	public MCColumnConfig columnDtl_module_id1;// [Dtl]の[module1_p.module_id]を[columnDtl_module_id1]としてエイリアス定義。
	public MCColumnConfig columnDtl_module_id_nm1;// [Dtl]の[module1_p.module_id_nm]を[columnDtl_module_id_nm1]としてエイリアス定義。
	public mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D Dtl_scrn1_p_PPanel;
	public MCColumnConfig columnDtl_scrn_id1;// [Dtl]の[scrn1_p.screen_id]を[columnDtl_scrn_id1]としてエイリアス定義。
	public MCColumnConfig columnDtl_scrn_name1;// [Dtl]の[scrn1_p.screen_name]を[columnDtl_scrn_name1]としてエイリアス定義。
	public mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D Dtl_module2_p_PPanel;
	public MCColumnConfig columnDtl_module_id2;// [Dtl]の[module2_p.module_id]を[columnDtl_module_id2]としてエイリアス定義。
	public MCColumnConfig columnDtl_module_id_nm2;// [Dtl]の[module2_p.module_id_nm]を[columnDtl_module_id_nm2]としてエイリアス定義。
	public mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D Dtl_scrn2_p_PPanel;
	public MCColumnConfig columnDtl_scrn_id2;// [Dtl]の[scrn2_p.screen_id]を[columnDtl_scrn_id2]としてエイリアス定義。
	public MCColumnConfig columnDtl_scrn_name2;// [Dtl]の[scrn2_p.screen_name]を[columnDtl_scrn_name2]としてエイリアス定義。
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	// [Dtl2]ブロックの項目のField定義
	public MCLabel Dtl2_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Dtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Dtl2_ins_usr_nm = null;
	public MCLabel Dtl2_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Dtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Dtl2_ins_func_nm = null;
	public MCLabel Dtl2_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Dtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Dtl2_upd_usr_nm = null;
	public MCLabel Dtl2_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Dtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Dtl2_upd_func_nm = null;
	public MCLabel Dtl2_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Dtl2_ins_ts = null;
	public MCLabel Dtl2_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Dtl2_upd_ts = null;
	public MCLabel Dtl2_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Dtl2_upd_srv_req_no = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [FIX_M]モードを表す定数 */
	public static final String FIX_M = "FIX_M";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, MOD, FIX_M, DEL, FIX_D, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL2040_Srch01]のCallerの作成 */
	protected MABCP_MenuConfigReg_MC.MA_MABCL2040_Srch01Caller createMA_MABCL2040_Srch01() {
		MABCP_MenuConfigReg_MC.MA_MABCL2040_Srch01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Srch01Bridge>
		caller = ((MABCP_MenuConfigReg_MC)this).new MA_MABCL2040_Srch01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Srch01Bridge>(
					(MABCP_MenuConfigReg)this, new MA_MABCL2040_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL2040_Srch01]の呼び出し */
	protected void callMA_MABCL2040_Srch01() {
		MCCaller caller = createMA_MABCL2040_Srch01();
		caller.exec();
	}
	/** [MA_MABCL2040_Upd01]のCallerの作成 */
	protected MABCP_MenuConfigReg_MC.MA_MABCL2040_Upd01Caller createMA_MABCL2040_Upd01() {
		MABCP_MenuConfigReg_MC.MA_MABCL2040_Upd01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Upd01Bridge>
		caller = ((MABCP_MenuConfigReg_MC)this).new MA_MABCL2040_Upd01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Upd01Bridge>(
					(MABCP_MenuConfigReg)this, new MA_MABCL2040_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL2040_Upd01]の呼び出し */
	protected void callMA_MABCL2040_Upd01() {
		MCCaller caller = createMA_MABCL2040_Upd01();
		caller.exec();
	}
	/** [MA_MABCL2040_Del01]のCallerの作成 */
	protected MABCP_MenuConfigReg_MC.MA_MABCL2040_Del01Caller createMA_MABCL2040_Del01() {
		MABCP_MenuConfigReg_MC.MA_MABCL2040_Del01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Del01Bridge>
		caller = ((MABCP_MenuConfigReg_MC)this).new MA_MABCL2040_Del01Caller<MABCP_MenuConfigReg, MA_MABCL2040_Del01Bridge>(
					(MABCP_MenuConfigReg)this, new MA_MABCL2040_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL2040_Del01]の呼び出し */
	protected void callMA_MABCL2040_Del01() {
		MCCaller caller = createMA_MABCL2040_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP2040.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP2040.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP2040.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP2040.DtlR> aDtlL;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP2040.Dtl2R aDtl2R;
	/** [Menu]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP2040.MenuR> aMenuL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP2040.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP2040.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP2040.MstR createMstR() {
		return mcframe.clientMABC.MABCP2040.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP2040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP2040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP2040.CndR createCndR() {
		return mcframe.clientMABC.MABCP2040.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABC.MABCP2040.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP2040.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP2040.HdrR createHdrR() {
		return mcframe.clientMABC.MABCP2040.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP2040.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP2040.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP2040.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP2040.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP2040.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP2040.DtlR.class);
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
	 * 項目コピーによってaDtl2Rを設定します。
	 *
	 * aDtl2Rのインスタンスは変更されません。
	 *
	 * @param row Dtl2R
	 */
	public void setDtl2R(mcframe.clientMABC.MABCP2040.Dtl2R row) {
		if (row != null) {
			MCRow.copyall(getDtl2R(), row);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Rを返します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMABC.MABCP2040.Dtl2R getDtl2R() {
		return aDtl2R;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMABC.MABCP2040.Dtl2R createDtl2R() {
		return mcframe.clientMABC.MABCP2040.Dtl2R.create();
	}

	/**
	 * コピーによってaMenuLを設定します。
	 *
	 * aMenuLのインスタンスは変更されません。
	 *
	 * @param dataset MenuL
	 */
	public void setMenuL(MCList<mcframe.clientMABC.MABCP2040.MenuR> aList) {
		if (getMenuL() != aList) {
			getMenuL().setAll(aList);
		}
	}

	/**
	 * [Menu]ブロックのコンテナaMenuLを返します。
	 *
	 * @return MenuL
	 */
	public MCList<mcframe.clientMABC.MABCP2040.MenuR> getMenuL() {
		return aMenuL;
	}

	/**
	 * aMenuRを作成します。
	 *
	 * @return MenuR
	 */
	public mcframe.clientMABC.MABCP2040.MenuR createMenuR() {
		return mcframe.clientMABC.MABCP2040.MenuR.create();
	}

	/**
	 * aMenuLを作成します。
	 *
	 * @return MenuL
	 */
	public MCList<mcframe.clientMABC.MABCP2040.MenuR> createMenuL() {
		return MCList.create(mcframe.clientMABC.MABCP2040.MenuR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtl2R())) ret.add(getDtl2R());
		if(!MCCollectionUtil.contains(ret, getMenuL())) ret.add(getMenuL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtl2R()) return "Dtl2";
		if(aCnt == getMenuL()) return "Menu";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Dtl2")) return getDtl2R();
		if(bId.equals("Menu")) return getMenuL();
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
		ret.add(MstPanel);
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(DtlTabPanel);
		ret.add(DtlPanel);
		ret.add(Dtl2Panel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_MenuConfigReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aDtl2R = createDtl2R();
		aMenuL = createMenuL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_MenuConfigReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtl2R = createDtl2R();
		aMenuL = createMenuL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_MenuConfigReg_MC.jbCreateScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateMst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateCnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateHdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateDtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateDtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateDtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateDtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbCreateEastBtn((MABCP_MenuConfigReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_MenuConfigReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_MenuConfigReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_MenuConfigReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABCP_MenuConfigReg p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABCP_MenuConfigReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_MenuConfigReg p) {
		p.Dtl_module1_p_PPanel = mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.create(mcframe.clientMABC.MABCP2040.DtlR.$module1_p);
		p.Dtl_module1_p_PPanel.setName("Dtl.module1_p");
		p.columnDtl_module_id1 = p.Dtl_module1_p_PPanel.columnModule_module_id;
		p.columnDtl_module_id1.addAliasName("Dtl.module_id1", p);
		p.columnDtl_module_id_nm1 = p.Dtl_module1_p_PPanel.columnModule_module_id_nm;
		p.columnDtl_module_id_nm1.addAliasName("Dtl.module_id_nm1", p);
		p.Dtl_scrn1_p_PPanel = mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.create(mcframe.clientMABC.MABCP2040.DtlR.$scrn1_p);
		p.Dtl_scrn1_p_PPanel.setName("Dtl.scrn1_p");
		p.columnDtl_scrn_id1 = p.Dtl_scrn1_p_PPanel.columnScreen_screen_id;
		p.columnDtl_scrn_id1.addAliasName("Dtl.scrn_id1", p);
		p.columnDtl_scrn_name1 = p.Dtl_scrn1_p_PPanel.columnScreen_screen_name;
		p.columnDtl_scrn_name1.addAliasName("Dtl.scrn_name1", p);
		p.Dtl_module2_p_PPanel = mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.create(mcframe.clientMABC.MABCP2040.DtlR.$module2_p);
		p.Dtl_module2_p_PPanel.setName("Dtl.module2_p");
		p.columnDtl_module_id2 = p.Dtl_module2_p_PPanel.columnModule_module_id;
		p.columnDtl_module_id2.addAliasName("Dtl.module_id2", p);
		p.columnDtl_module_id_nm2 = p.Dtl_module2_p_PPanel.columnModule_module_id_nm;
		p.columnDtl_module_id_nm2.addAliasName("Dtl.module_id_nm2", p);
		p.Dtl_scrn2_p_PPanel = mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.create(mcframe.clientMABC.MABCP2040.DtlR.$scrn2_p);
		p.Dtl_scrn2_p_PPanel.setName("Dtl.scrn2_p");
		p.columnDtl_scrn_id2 = p.Dtl_scrn2_p_PPanel.columnScreen_screen_id;
		p.columnDtl_scrn_id2.addAliasName("Dtl.scrn_id2", p);
		p.columnDtl_scrn_name2 = p.Dtl_scrn2_p_PPanel.columnScreen_screen_name;
		p.columnDtl_scrn_name2.addAliasName("Dtl.scrn_name2", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MABCP_MenuConfigReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_MenuConfigReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_MenuConfigReg p) {
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

	
	/** [Cnd_menu_cd_ListPutter]の定義 */
	private MCListPutter Cnd_menu_cd_p = null;

	/**
	 * [Cnd_menu_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_menu_cd_ListPutter() {
		if (Cnd_menu_cd_p == null) {
			Cnd_menu_cd_p = createCnd_menu_cd_ListPutter(Cnd_menu_cd, "menu_cd", "menu_nm");

		}
		return Cnd_menu_cd_p;
	}
	
	
	/** [Hdr_menu_cd_ListPutter]の定義 */
	private MCListPutter Hdr_menu_cd_p = null;

	/**
	 * [Hdr_menu_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_menu_cd_ListPutter() {
		if (Hdr_menu_cd_p == null) {
			Hdr_menu_cd_p = createHdr_menu_cd_ListPutter(Hdr_menu_cd, "menu_cd", "menu_nm");

		}
		return Hdr_menu_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_MenuConfigReg create(){
		MABCP_MenuConfigReg p = new MABCP_MenuConfigReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_MenuConfigReg create(String name){
		MABCP_MenuConfigReg p = new MABCP_MenuConfigReg(name);
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
		MABCP_MenuConfigReg_MC.jbfInitScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitMst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitCnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitHdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitDtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitDtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitDtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitDtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbfInitEastBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitMst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitCnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitHdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitDtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitDtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitDtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitDtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.jbInitEastBtn((MABCP_MenuConfigReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_menu_cd_Label = p.beansFactory.createLabel("Cnd.menu_cd_Label");
		p.Cnd_menu_cd = p.beansFactory.createTextComboBox("Cnd.menu_cd");
		p.Cnd_menu_cd.setLabel(p.Cnd_menu_cd_Label);
		p.Cnd_menu_nm = p.beansFactory.createTextField("Cnd.menu_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_menu_cd_Label = p.beansFactory.createLabel("Hdr.menu_cd_Label");
		p.Hdr_menu_cd = p.beansFactory.createTextComboBox("Hdr.menu_cd");
		p.Hdr_menu_cd.setLabel(p.Hdr_menu_cd_Label);
		p.Hdr_menu_nm = p.beansFactory.createTextField("Hdr.menu_nm");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		// ブロックの項目の初期化
		p.Dtl2_ins_usr_id_Label = p.beansFactory.createLabel("Dtl2.ins_usr_id_Label");
		p.Dtl2_ins_usr_id = p.beansFactory.createTextField("Dtl2.ins_usr_id");
		p.Dtl2_ins_usr_id.setLabel(p.Dtl2_ins_usr_id_Label);
		p.Dtl2_ins_usr_nm = p.beansFactory.createTextField("Dtl2.ins_usr_nm");
		p.Dtl2_ins_func_id_Label = p.beansFactory.createLabel("Dtl2.ins_func_id_Label");
		p.Dtl2_ins_func_id = p.beansFactory.createTextField("Dtl2.ins_func_id");
		p.Dtl2_ins_func_id.setLabel(p.Dtl2_ins_func_id_Label);
		p.Dtl2_ins_func_nm = p.beansFactory.createTextField("Dtl2.ins_func_nm");
		p.Dtl2_upd_usr_id_Label = p.beansFactory.createLabel("Dtl2.upd_usr_id_Label");
		p.Dtl2_upd_usr_id = p.beansFactory.createTextField("Dtl2.upd_usr_id");
		p.Dtl2_upd_usr_id.setLabel(p.Dtl2_upd_usr_id_Label);
		p.Dtl2_upd_usr_nm = p.beansFactory.createTextField("Dtl2.upd_usr_nm");
		p.Dtl2_upd_func_id_Label = p.beansFactory.createLabel("Dtl2.upd_func_id_Label");
		p.Dtl2_upd_func_id = p.beansFactory.createTextField("Dtl2.upd_func_id");
		p.Dtl2_upd_func_id.setLabel(p.Dtl2_upd_func_id_Label);
		p.Dtl2_upd_func_nm = p.beansFactory.createTextField("Dtl2.upd_func_nm");
		p.Dtl2_ins_ts_Label = p.beansFactory.createLabel("Dtl2.ins_ts_Label");
		p.Dtl2_ins_ts = p.beansFactory.createTimestampField("Dtl2.ins_ts");
		p.Dtl2_ins_ts.setLabel(p.Dtl2_ins_ts_Label);
		p.Dtl2_upd_ts_Label = p.beansFactory.createLabel("Dtl2.upd_ts_Label");
		p.Dtl2_upd_ts = p.beansFactory.createTimestampField("Dtl2.upd_ts");
		p.Dtl2_upd_ts.setLabel(p.Dtl2_upd_ts_Label);
		p.Dtl2_upd_srv_req_no_Label = p.beansFactory.createLabel("Dtl2.upd_srv_req_no_Label");
		p.Dtl2_upd_srv_req_no = p.beansFactory.createTextField("Dtl2.upd_srv_req_no");
		p.Dtl2_upd_srv_req_no.setLabel(p.Dtl2_upd_srv_req_no_Label);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_del = p.beansFactory.createButton("DtlBtn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP2040.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP2040.CndR.ope_META);
		p.Cnd_menu_cd.setListType(MCListType.STRICT);
		p.Cnd_menu_cd.setLinkBeans(p.Cnd_menu_nm);
		p.CndPanel.add(p.Cnd_menu_cd_Label);
		p.CndPanel.add(p.Cnd_menu_cd);
		p.CndPanel.setLastBeans(p.Cnd_menu_cd);
		p.Cnd_menu_cd.setNextBeans(p.Cnd_menu_nm);
		p.Cnd_menu_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP2040.CndR.menu_cd_META);
		p.CndPanel.add(p.Cnd_menu_nm);
		p.Cnd_menu_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_menu_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP2040.CndR.menu_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlTabPanel);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr_menu_cd.setListType(MCListType.STRICT);
		p.Hdr_menu_cd.setLinkBeans(p.Hdr_menu_nm);
		p.HdrPanel.add(p.Hdr_menu_cd_Label);
		p.HdrPanel.add(p.Hdr_menu_cd);
		p.HdrPanel.setLastBeans(p.Hdr_menu_cd);
		p.Hdr_menu_cd.setNextBeans(p.Hdr_menu_nm);
		p.Hdr_menu_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP2040.HdrR.menu_cd_META);
		p.HdrPanel.add(p.Hdr_menu_nm);
		p.Hdr_menu_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP2040.HdrR.menu_nm_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.add(p.DtlTabPanel);
		p.DtlTabPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.DtlPanel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.Dtl2Panel);
		p.DtlTabTab.add(p.Dtl2Panel, "DtlTab.tab2");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.DtlPanel.setNextBeans(p.Dtl2Panel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Dtl2Panel.add(p.Dtl2_ins_usr_id_Label);
		p.Dtl2Panel.add(p.Dtl2_ins_usr_id);
		p.Dtl2Panel.setLastBeans(p.Dtl2_ins_usr_id);
		p.Dtl2_ins_usr_id.setNextBeans(p.Dtl2_ins_usr_nm);
		p.Dtl2_ins_usr_id.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.ins_usr_id_META);
		p.Dtl2Panel.add(p.Dtl2_ins_usr_nm);
		p.Dtl2_ins_usr_nm.setNextBeans(p.Dtl2_ins_func_id);
		p.Dtl2_ins_usr_nm.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.ins_usr_nm_META);
		p.Dtl2Panel.add(p.Dtl2_ins_func_id_Label);
		p.Dtl2Panel.add(p.Dtl2_ins_func_id);
		p.Dtl2_ins_func_id.setNextBeans(p.Dtl2_ins_func_nm);
		p.Dtl2_ins_func_id.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.ins_func_id_META);
		p.Dtl2Panel.add(p.Dtl2_ins_func_nm);
		p.Dtl2_ins_func_nm.setNextBeans(p.Dtl2_upd_usr_id);
		p.Dtl2_ins_func_nm.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.ins_func_nm_META);
		p.Dtl2Panel.add(p.Dtl2_upd_usr_id_Label);
		p.Dtl2Panel.add(p.Dtl2_upd_usr_id);
		p.Dtl2_upd_usr_id.setNextBeans(p.Dtl2_upd_usr_nm);
		p.Dtl2_upd_usr_id.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_usr_id_META);
		p.Dtl2Panel.add(p.Dtl2_upd_usr_nm);
		p.Dtl2_upd_usr_nm.setNextBeans(p.Dtl2_upd_func_id);
		p.Dtl2_upd_usr_nm.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_usr_nm_META);
		p.Dtl2Panel.add(p.Dtl2_upd_func_id_Label);
		p.Dtl2Panel.add(p.Dtl2_upd_func_id);
		p.Dtl2_upd_func_id.setNextBeans(p.Dtl2_upd_func_nm);
		p.Dtl2_upd_func_id.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_func_id_META);
		p.Dtl2Panel.add(p.Dtl2_upd_func_nm);
		p.Dtl2_upd_func_nm.setNextBeans(p.Dtl2_ins_ts);
		p.Dtl2_upd_func_nm.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_func_nm_META);
		p.Dtl2Panel.add(p.Dtl2_ins_ts_Label);
		p.Dtl2Panel.add(p.Dtl2_ins_ts);
		p.Dtl2_ins_ts.setNextBeans(p.Dtl2_upd_ts);
		p.Dtl2_ins_ts.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.ins_ts_META);
		p.Dtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Panel.add(p.Dtl2_upd_ts_Label);
		p.Dtl2Panel.add(p.Dtl2_upd_ts);
		p.Dtl2_upd_ts.setNextBeans(p.Dtl2_upd_srv_req_no);
		p.Dtl2_upd_ts.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_ts_META);
		p.Dtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Panel.add(p.Dtl2_upd_srv_req_no_Label);
		p.Dtl2Panel.add(p.Dtl2_upd_srv_req_no);
		p.Dtl2_upd_srv_req_no.setRow(p.getDtl2R(), mcframe.clientMABC.MABCP2040.Dtl2R.upd_srv_req_no_META);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_upd.setIcon("REGISTER");
		p.DtlBtn_upd.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_upd);
		p.DtlBtn_del.setIcon("DELETE");
		p.DtlBtn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del);
		p.EastBtnPanel.add(p.DtlBtn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_MenuConfigReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MABCP_MenuConfigReg_MC.mcInitScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitMst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitCnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitHdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitDtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitDtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitDtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitDtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.mcInitEastBtn((MABCP_MenuConfigReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitUPD_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitUPD_EastBtn((MABCP_MenuConfigReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitFIX_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX_EastBtn((MABCP_MenuConfigReg)this);

		// [MOD]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitMOD_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitMOD_EastBtn((MABCP_MenuConfigReg)this);

		// [FIX_M]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitFIX__M_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__M_EastBtn((MABCP_MenuConfigReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitDEL_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitDEL_EastBtn((MABCP_MenuConfigReg)this);

		// [FIX_D]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitFIX__D_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitFIX__D_EastBtn((MABCP_MenuConfigReg)this);

		// [REF]ステータスのモードの設定
		MABCP_MenuConfigReg_MC.statusInitREF_ScreenOpe((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Mst((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Cnd((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Hdr((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_DtlTab((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Dtl((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Dtl2((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_Menu((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_DtlBtn((MABCP_MenuConfigReg)this);
		MABCP_MenuConfigReg_MC.statusInitREF_EastBtn((MABCP_MenuConfigReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_MenuConfigReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_MenuConfigReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_MenuConfigReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_menu_cd.setListListener(p);
		p.Cnd_menu_cd.addAllListener(p);
		p.Cnd_menu_nm.setListListener(p);
		p.Cnd_menu_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABCP_MenuConfigReg p) {
		p.Hdr_menu_cd.setListListener(p);
		p.Hdr_menu_cd.addAllListener(p);
		p.Hdr_menu_nm.setListListener(p);
		p.Hdr_menu_nm.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABCP_MenuConfigReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_MenuConfigReg p) {
		p.DtlTable.addAllListener(p);
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MABCP_MenuConfigReg p) {
		p.Dtl2_ins_usr_id.setListListener(p);
		p.Dtl2_ins_usr_id.addAllListener(p);
		p.Dtl2_ins_usr_nm.setListListener(p);
		p.Dtl2_ins_usr_nm.addAllListener(p);
		p.Dtl2_ins_func_id.setListListener(p);
		p.Dtl2_ins_func_id.addAllListener(p);
		p.Dtl2_ins_func_nm.setListListener(p);
		p.Dtl2_ins_func_nm.addAllListener(p);
		p.Dtl2_upd_usr_id.setListListener(p);
		p.Dtl2_upd_usr_id.addAllListener(p);
		p.Dtl2_upd_usr_nm.setListListener(p);
		p.Dtl2_upd_usr_nm.addAllListener(p);
		p.Dtl2_upd_func_id.setListListener(p);
		p.Dtl2_upd_func_id.addAllListener(p);
		p.Dtl2_upd_func_nm.setListListener(p);
		p.Dtl2_upd_func_nm.addAllListener(p);
		p.Dtl2_ins_ts.setListListener(p);
		p.Dtl2_ins_ts.addAllListener(p);
		p.Dtl2_upd_ts.setListListener(p);
		p.Dtl2_upd_ts.addAllListener(p);
		p.Dtl2_upd_srv_req_no.setListListener(p);
		p.Dtl2_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_MenuConfigReg p) {
		p.DtlBtn_upd.addAllListener(p);
		p.DtlBtn_upd.setAPMethodName("doDtlBtn_upd");
		p.DtlBtn_del.addAllListener(p);
		p.DtlBtn_del.setAPMethodName("doDtlBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_MenuConfigReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_menu_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_menu_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.ENABLE);
		p.Dtl_scrn1_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.ENABLE);
		p.Dtl_module2_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.ENABLE);
		p.Dtl_scrn2_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_menu_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(FIX, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn1_p_PPanel.putStatus(FIX, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);
		p.Dtl_module2_p_PPanel.putStatus(FIX, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn2_p_PPanel.putStatus(FIX, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [MOD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_menu_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.ENABLE);
		p.Dtl_scrn1_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.ENABLE);
		p.Dtl_module2_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.ENABLE);
		p.Dtl_scrn2_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [MOD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, MOD, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_menu_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_M, MCMode.ENABLE);

	}

	/**
	 * [FIX_M]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn1_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);
		p.Dtl_module2_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn2_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_M]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_menu_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn1_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);
		p.Dtl_module2_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn2_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_menu_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn1_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);
		p.Dtl_module2_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn2_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MABCP_MenuConfigReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_MenuConfigReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_MenuConfigReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_MenuConfigReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_menu_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_menu_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABCP_MenuConfigReg p){
		p.Hdr_menu_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_menu_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABCP_MenuConfigReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_MenuConfigReg p){
		p.Dtl_module1_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn1_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);
		p.Dtl_module2_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0100.FSUBP_Module_D.READ_ONLY);
		p.Dtl_scrn2_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0110.FSUBP_Screen_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MABCP_MenuConfigReg p){
		p.Dtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitREF_Menu(MABCP_MenuConfigReg p){

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_MenuConfigReg p){
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_MenuConfigReg p){

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
		MABCP_MenuConfigReg_MC.setTableConfigDtl((MABCP_MenuConfigReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_MenuConfigReg p) {
		p.DtlTable.addTable(p.Dtl_module1_p_PPanel.ModuleTable);
		p.DtlTable.addTable(p.Dtl_scrn1_p_PPanel.ScreenTable);
		p.DtlTable.addTable(p.Dtl_module2_p_PPanel.ModuleTable);
		p.DtlTable.addTable(p.Dtl_scrn2_p_PPanel.ScreenTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_menu_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_menu_cd.getListConfig().setPutter(getCnd_menu_cd_ListPutter());
		Hdr_menu_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_menu_cd.getListConfig().setPutter(getHdr_menu_cd_ListPutter());
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
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_M]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_MStatus() {
		status = FIX_M;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (FIX_M.equals(status)) {
			setFIX_MStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_menu_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_menu_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostMenu");
		return lp;
	}
	 
	/**
	 * [Hdr_menu_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_menu_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostMenuNotInMenuConfig");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_menu_cd) return getCnd_menu_cd(row, info);
		if(combo == Hdr_menu_cd) return getHdr_menu_cd(row, info);
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
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_del) doDtlBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_menu_cd) return doCnd_menu_cd_VC(info);
		if (vc == Cnd_menu_nm) return doCnd_menu_nm_VC(info);
		if (vc == Hdr_menu_cd) return doHdr_menu_cd_VC(info);
		if (vc == Hdr_menu_nm) return doHdr_menu_nm_VC(info);
		if (vc == Dtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == Dtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == Dtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == Dtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == Dtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == Dtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == Dtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == Dtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == Dtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == Dtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == Dtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
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
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[menu_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_menu_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[menu_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_menu_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[menu_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_menu_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[menu_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_menu_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_menu_cd) doCnd_menu_cd_NC(info);
		else if (nc == Cnd_menu_nm) doCnd_menu_nm_NC(info);
		else if (nc == Hdr_menu_cd) doHdr_menu_cd_NC(info);
		else if (nc == Hdr_menu_nm) doHdr_menu_nm_NC(info);
		else if (nc == Dtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == Dtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == Dtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == Dtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == Dtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == Dtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == Dtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == Dtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == Dtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == Dtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == Dtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_menu_cd) doCnd_menu_cd_NE(info);
		else if (ne == Cnd_menu_nm) doCnd_menu_nm_NE(info);
		else if (ne == Hdr_menu_cd) doHdr_menu_cd_NE(info);
		else if (ne == Hdr_menu_nm) doHdr_menu_nm_NE(info);
		else if (ne == Dtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == Dtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == Dtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == Dtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == Dtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == Dtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == Dtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == Dtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == Dtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == Dtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == Dtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_menu_cd) doCnd_menu_cd_NX(info);
		else if (nx == Cnd_menu_nm) doCnd_menu_nm_NX(info);
		else if (nx == Hdr_menu_cd) doHdr_menu_cd_NX(info);
		else if (nx == Hdr_menu_nm) doHdr_menu_nm_NX(info);
		else if (nx == Dtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == Dtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == Dtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == Dtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == Dtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == Dtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == Dtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == Dtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == Dtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == Dtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == Dtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_menu_cd) doCnd_menu_cd_LC(info);
		else if (lc == Cnd_menu_nm) doCnd_menu_nm_LC(info);
		else if (lc == Hdr_menu_cd) doHdr_menu_cd_LC(info);
		else if (lc == Hdr_menu_nm) doHdr_menu_nm_LC(info);
		else if (lc == Dtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == Dtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == Dtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == Dtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == Dtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == Dtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == Dtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == Dtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == Dtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == Dtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == Dtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[menu_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_menu_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_menu_cd]の作成メソッド
	 */
	public MCList getCnd_menu_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostMenu(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_menu_cd]の作成メソッド
	 */
	public MCList getHdr_menu_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostMenuNotInMenuConfig(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL2040.Srch01")) {
			return new MA_MABCL2040_Srch01Bridge();
		}
		if (id.equals("MA.MABCL2040.Upd01")) {
			return new MA_MABCL2040_Upd01Bridge();
		}
		if (id.equals("MA.MABCL2040.Del01")) {
			return new MA_MABCL2040_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL2040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL2040_Srch01;

		/** コンストラクタ */
		protected MA_MABCL2040_Srch01Bridge() {
			p_MA_MABCL2040_Srch01 = new MCParam(PDef.MA_MABCL2040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL2040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP2040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP2040.MenuR.class));
			param.addDownBlock(mcframe.clientMABC.MABCP2040.HdrR.create());

			p_MA_MABCL2040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL2040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL2040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL2040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL2040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP2040.CndR up0() {
			return (mcframe.clientMABC.MABCP2040.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP2040.MenuR> down0() {
			return (MCList<mcframe.clientMABC.MABCP2040.MenuR>)down(0);
		}
		protected mcframe.clientMABC.MABCP2040.HdrR down1() {
			return (mcframe.clientMABC.MABCP2040.HdrR)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL2040_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP2040.MenuR.class));
			p_MA_MABCL2040_Srch01.addDownBlock(mcframe.clientMABC.MABCP2040.HdrR.create());
		}
		protected MCParam param() {
			return p_MA_MABCL2040_Srch01;
		}

		protected void show() {
			setMenuL((MCList<mcframe.clientMABC.MABCP2040.MenuR>)p_MA_MABCL2040_Srch01.getContainerParam().getDownBlock(0));
			setHdrR((mcframe.clientMABC.MABCP2040.HdrR)p_MA_MABCL2040_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getMenuL().clear();
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getMenuL());
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MA_MABCL2040_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL2040_Upd01;

		/** コンストラクタ */
		protected MA_MABCL2040_Upd01Bridge() {
			p_MA_MABCL2040_Upd01 = new MCParam(PDef.MA_MABCL2040_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL2040_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP2040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP2040.MenuR.class));
			// Down

			p_MA_MABCL2040_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL2040_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL2040_Upd01.addUpBlock(getHdrR());
			p_MA_MABCL2040_Upd01.addUpBlock(getMenuL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL2040_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL2040_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP2040.HdrR up0() {
			return (mcframe.clientMABC.MABCP2040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP2040.MenuR> up1() {
			return (MCList<mcframe.clientMABC.MABCP2040.MenuR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL2040_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getMenuL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL2040_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL2040_Del01;

		/** コンストラクタ */
		protected MA_MABCL2040_Del01Bridge() {
			p_MA_MABCL2040_Del01 = new MCParam(PDef.MA_MABCL2040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL2040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP2040.HdrR.create());
			// Down

			p_MA_MABCL2040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL2040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL2040_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL2040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL2040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP2040.HdrR up0() {
			return (mcframe.clientMABC.MABCP2040.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL2040_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}