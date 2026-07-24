package mcframe.clientMABC.MABCP0830;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMABC.MABCP0830.MABCP_AttachInfoChk_MC.MA_MABCL0830_Srch01Caller;

/**
 * 画面"MABCP_AttachInfoChk"パネルクラスです。<p>
 *
 * 品目付加情報確認の検索を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_AttachInfoChk_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0830";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_attach_info_typ_Label = null;
	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_attach_info_typ = null;
	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public MCTextField Cnd_attach_info_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0830.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub3 = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4 = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key1 = null;
	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key2 = null;
	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key3 = null;
	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key4 = null;
	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key5 = null;
	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_id = null;
	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_typ = null;
	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_typ_nm = null;
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_no_attach = null;
	/**
	 * Heading 見出し.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_rmrks = null;
	/**
	 * Path パス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_path = null;
	/**
	 * Binary data バイナリデータ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_bin = null;
	/**
	 * Binary data name バイナリデータ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_bin_nm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Open file ファイルを開く.<p>
	 *
	 */
	public MCButton DtlBtn_open = null;
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton DtlBtn_dwnld = null;
	public MCLabel DtlBtn_file_Label = null;
	/**
	 * Browser executable file ブラウザ実行ファイル.<p>
	 *
	 */
	public MCTextField DtlBtn_file = null;
	/**
	 * Select browser executable file ブラウザ実行ファイル選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_file = null;
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
	
	/** [MA_MABCL0830_Srch01]のCallerの作成 */
	protected MABCP_AttachInfoChk_MC.MA_MABCL0830_Srch01Caller createMA_MABCL0830_Srch01() {
		MABCP_AttachInfoChk_MC.MA_MABCL0830_Srch01Caller<MABCP_AttachInfoChk, MA_MABCL0830_Srch01Bridge>
		caller = ((MABCP_AttachInfoChk_MC)this).new MA_MABCL0830_Srch01Caller<MABCP_AttachInfoChk, MA_MABCL0830_Srch01Bridge>(
					(MABCP_AttachInfoChk)this, new MA_MABCL0830_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0830_Srch01]の呼び出し */
	protected void callMA_MABCL0830_Srch01() {
		MCCaller caller = createMA_MABCL0830_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0830.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0830.DtlR> aDtlL;
	/** [DtlBtn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0830.DtlBtnR aDtlBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0830.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0830.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0830.CndR createCndR() {
		return mcframe.clientMABC.MABCP0830.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0830.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0830.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0830.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0830.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0830.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0830.DtlR.class);
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
	 * 項目コピーによってaDtlBtnRを設定します。
	 *
	 * aDtlBtnRのインスタンスは変更されません。
	 *
	 * @param row DtlBtnR
	 */
	public void setDtlBtnR(mcframe.clientMABC.MABCP0830.DtlBtnR row) {
		if (row != null) {
			MCRow.copyall(getDtlBtnR(), row);
		}
	}

	/**
	 * [DtlBtn]ブロックのコンテナaDtlBtnRを返します。
	 *
	 * @return DtlBtnR
	 */
	public mcframe.clientMABC.MABCP0830.DtlBtnR getDtlBtnR() {
		return aDtlBtnR;
	}

	/**
	 * aDtlBtnRを作成します。
	 *
	 * @return DtlBtnR
	 */
	public mcframe.clientMABC.MABCP0830.DtlBtnR createDtlBtnR() {
		return mcframe.clientMABC.MABCP0830.DtlBtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlBtnR())) ret.add(getDtlBtnR());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlBtnR()) return "DtlBtn";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlBtn")) return getDtlBtnR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AttachInfoChk_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aDtlBtnR = createDtlBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_AttachInfoChk_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlBtnR = createDtlBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_AttachInfoChk_MC.jbCreateTop((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbCreateFold((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbCreateCnd((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbCreateCtrl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbCreateDtl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbCreateDtlBtn((MABCP_AttachInfoChk)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_AttachInfoChk p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_AttachInfoChk p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_AttachInfoChk p) {
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_sno_p_PPanel = mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.Sno_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.Sno_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.Sno_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.Sno_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_AttachInfoChk p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_AttachInfoChk p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_AttachInfoChk p) {
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

	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_attach_info_typ_ListPutter]の定義 */
	private MCListPutter Cnd_attach_info_typ_p = null;

	/**
	 * [Cnd_attach_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_attach_info_typ_ListPutter() {
		if (Cnd_attach_info_typ_p == null) {
			Cnd_attach_info_typ_p = createCnd_attach_info_typ_ListPutter(Cnd_attach_info_typ, "attach_info_typ", "attach_info_typ_nm");

		}
		return Cnd_attach_info_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AttachInfoChk create(){
		MABCP_AttachInfoChk p = new MABCP_AttachInfoChk();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AttachInfoChk create(String name){
		MABCP_AttachInfoChk p = new MABCP_AttachInfoChk(name);
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
		MABCP_AttachInfoChk_MC.jbfInitTop((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbfInitFold((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbfInitCnd((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbfInitCtrl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbfInitDtl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbfInitDtlBtn((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitTop((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitFold((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitCnd((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitCtrl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitDtl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.jbInitDtlBtn((MABCP_AttachInfoChk)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_attach_info_typ_Label = p.beansFactory.createLabel("Cnd.attach_info_typ_Label");
		p.Cnd_attach_info_typ = p.beansFactory.createTextComboBox("Cnd.attach_info_typ");
		p.Cnd_attach_info_typ.setLabel(p.Cnd_attach_info_typ_Label);
		p.Cnd_attach_info_typ_nm = p.beansFactory.createTextField("Cnd.attach_info_typ_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_itm_cd = p.beansFactory.createTableColumn("Dtl.itm_cd", MCColumnType.TEXT);
		p.columnDtl_itm_sub1 = p.beansFactory.createTableColumn("Dtl.itm_sub1", MCColumnType.TEXT);
		p.columnDtl_itm_sub2 = p.beansFactory.createTableColumn("Dtl.itm_sub2", MCColumnType.TEXT);
		p.columnDtl_itm_sub3 = p.beansFactory.createTableColumn("Dtl.itm_sub3", MCColumnType.TEXT);
		p.columnDtl_sno1 = p.beansFactory.createTableColumn("Dtl.sno1", MCColumnType.TEXT);
		p.columnDtl_sno2 = p.beansFactory.createTableColumn("Dtl.sno2", MCColumnType.TEXT);
		p.columnDtl_sno3 = p.beansFactory.createTableColumn("Dtl.sno3", MCColumnType.TEXT);
		p.columnDtl_sno4 = p.beansFactory.createTableColumn("Dtl.sno4", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_attach_info_key1 = p.beansFactory.createTableColumn("Dtl.attach_info_key1", MCColumnType.TEXT);
		p.columnDtl_attach_info_key2 = p.beansFactory.createTableColumn("Dtl.attach_info_key2", MCColumnType.TEXT);
		p.columnDtl_attach_info_key3 = p.beansFactory.createTableColumn("Dtl.attach_info_key3", MCColumnType.TEXT);
		p.columnDtl_attach_info_key4 = p.beansFactory.createTableColumn("Dtl.attach_info_key4", MCColumnType.TEXT);
		p.columnDtl_attach_info_key5 = p.beansFactory.createTableColumn("Dtl.attach_info_key5", MCColumnType.TEXT);
		p.columnDtl_attach_info_id = p.beansFactory.createTableColumn("Dtl.attach_info_id", MCColumnType.TEXT);
		p.columnDtl_attach_info_typ = p.beansFactory.createTableColumn("Dtl.attach_info_typ", MCColumnType.TEXT);
		p.columnDtl_attach_info_typ_nm = p.beansFactory.createTableColumn("Dtl.attach_info_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ext_sys_no_attach = p.beansFactory.createTableColumn("Dtl.ext_sys_no_attach", MCColumnType.TEXT);
		p.columnDtl_attach_info_rmrks = p.beansFactory.createTableColumn("Dtl.attach_info_rmrks", MCColumnType.TEXT);
		p.columnDtl_attach_info_path = p.beansFactory.createTableColumn("Dtl.attach_info_path", MCColumnType.TEXT);
		p.columnDtl_attach_info_bin = p.beansFactory.createTableColumn("Dtl.attach_info_bin", MCColumnType.IMAGE_VIEW);
		p.columnDtl_attach_info_bin_nm = p.beansFactory.createTableColumn("Dtl.attach_info_bin_nm", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open = p.beansFactory.createButton("DtlBtn.open");
		p.DtlBtn_dwnld = p.beansFactory.createButton("DtlBtn.dwnld", "dwnld");
		p.DtlBtn_file_Label = p.beansFactory.createLabel("DtlBtn.file_Label");
		p.DtlBtn_file = p.beansFactory.createTextField("DtlBtn.file");
		p.DtlBtn_file.setLabel(p.DtlBtn_file_Label);
		p.DtlBtn_select_file = p.beansFactory.createButton("DtlBtn.select_file", "no_border");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.CndPanel.setLastBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0830.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_attach_info_typ);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0830.CndR.wg_nm_META);
		p.Cnd_attach_info_typ.setListType(MCListType.STRICT);
		p.Cnd_attach_info_typ.setLinkBeans(p.Cnd_attach_info_typ_nm);
		p.CndPanel.add(p.Cnd_attach_info_typ_Label);
		p.CndPanel.add(p.Cnd_attach_info_typ);
		p.Cnd_attach_info_typ.setNextBeans(p.Cnd_attach_info_typ_nm);
		p.Cnd_attach_info_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0830.CndR.attach_info_typ_META);
		p.CndPanel.add(p.Cnd_attach_info_typ_nm);
		p.Cnd_attach_info_typ_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_attach_info_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0830.CndR.attach_info_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_AttachInfoChk p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setValueCheck(false);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtnPanel.add(p.DtlBtn_open);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_open);
		p.DtlBtn_open.setNextBeans(p.DtlBtn_dwnld);
		p.DtlBtn_dwnld.setIcon("DWNLD");
		p.DtlBtnPanel.add(p.DtlBtn_dwnld);
		p.DtlBtn_dwnld.setNextBeans(p.DtlBtn_file);
		p.DtlBtnPanel.add(p.DtlBtn_file_Label);
		p.DtlBtnPanel.add(p.DtlBtn_file);
		p.DtlBtn_file.setNextBeans(p.DtlBtn_select_file);
		p.DtlBtn_file.setRow(p.getDtlBtnR(), mcframe.clientMABC.MABCP0830.DtlBtnR.file_META);
		p.DtlBtn_select_file.setIcon("FOLDER");
		p.DtlBtnPanel.add(p.DtlBtn_select_file);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABCP_AttachInfoChk_MC.mcInitTop((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.mcInitFold((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.mcInitCnd((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.mcInitCtrl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.mcInitDtl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.mcInitDtlBtn((MABCP_AttachInfoChk)this);

		// [SRCH]ステータスのモードの設定
		MABCP_AttachInfoChk_MC.statusInitSRCH_Top((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.statusInitSRCH_Fold((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.statusInitSRCH_Cnd((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.statusInitSRCH_Ctrl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.statusInitSRCH_Dtl((MABCP_AttachInfoChk)this);
		MABCP_AttachInfoChk_MC.statusInitSRCH_DtlBtn((MABCP_AttachInfoChk)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_AttachInfoChk p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_AttachInfoChk p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_AttachInfoChk p) {
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_attach_info_typ.setListListener(p);
		p.Cnd_attach_info_typ.addAllListener(p);
		p.Cnd_attach_info_typ_nm.setListListener(p);
		p.Cnd_attach_info_typ_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_AttachInfoChk p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_AttachInfoChk p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_itm_cd.addAllListener(p);
		p.columnDtl_itm_cd.setListListener(p);
		p.columnDtl_itm_sub1.addAllListener(p);
		p.columnDtl_itm_sub1.setListListener(p);
		p.columnDtl_itm_sub2.addAllListener(p);
		p.columnDtl_itm_sub2.setListListener(p);
		p.columnDtl_itm_sub3.addAllListener(p);
		p.columnDtl_itm_sub3.setListListener(p);
		p.columnDtl_sno1.addAllListener(p);
		p.columnDtl_sno1.setListListener(p);
		p.columnDtl_sno2.addAllListener(p);
		p.columnDtl_sno2.setListListener(p);
		p.columnDtl_sno3.addAllListener(p);
		p.columnDtl_sno3.setListListener(p);
		p.columnDtl_sno4.addAllListener(p);
		p.columnDtl_sno4.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_attach_info_key1.addAllListener(p);
		p.columnDtl_attach_info_key1.setListListener(p);
		p.columnDtl_attach_info_key2.addAllListener(p);
		p.columnDtl_attach_info_key2.setListListener(p);
		p.columnDtl_attach_info_key3.addAllListener(p);
		p.columnDtl_attach_info_key3.setListListener(p);
		p.columnDtl_attach_info_key4.addAllListener(p);
		p.columnDtl_attach_info_key4.setListListener(p);
		p.columnDtl_attach_info_key5.addAllListener(p);
		p.columnDtl_attach_info_key5.setListListener(p);
		p.columnDtl_attach_info_id.addAllListener(p);
		p.columnDtl_attach_info_id.setListListener(p);
		p.columnDtl_attach_info_typ.addAllListener(p);
		p.columnDtl_attach_info_typ.setListListener(p);
		p.columnDtl_attach_info_typ_nm.addAllListener(p);
		p.columnDtl_attach_info_typ_nm.setListListener(p);
		p.columnDtl_ext_sys_no_attach.addAllListener(p);
		p.columnDtl_ext_sys_no_attach.setListListener(p);
		p.columnDtl_attach_info_rmrks.addAllListener(p);
		p.columnDtl_attach_info_rmrks.setListListener(p);
		p.columnDtl_attach_info_path.addAllListener(p);
		p.columnDtl_attach_info_path.setListListener(p);
		p.columnDtl_attach_info_bin.addAllListener(p);
		p.columnDtl_attach_info_bin_nm.addAllListener(p);
		p.columnDtl_attach_info_bin_nm.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_AttachInfoChk p) {
		p.DtlBtn_open.addAllListener(p);
		p.DtlBtn_open.setAPMethodName("doDtlBtn_open");
		p.DtlBtn_dwnld.addAllListener(p);
		p.DtlBtn_dwnld.setAPMethodName("doDtlBtn_dwnld");
		p.DtlBtn_file.setListListener(p);
		p.DtlBtn_file.addAllListener(p);
		p.DtlBtn_select_file.addAllListener(p);
		p.DtlBtn_select_file.setAPMethodName("doDtlBtn_select_file");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABCP_AttachInfoChk p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABCP_AttachInfoChk p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_AttachInfoChk p){
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_attach_info_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attach_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABCP_AttachInfoChk p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABCP_AttachInfoChk p){
		p.columnDtl_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_key1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_key2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_key3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_key4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_key5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_attach.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attach_info_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attach_info_bin.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_attach_info_bin_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MABCP_AttachInfoChk p){
		p.DtlBtn_open.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_dwnld.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_file.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_select_file.putMode(p, SRCH, MCMode.ENABLE);

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
		MABCP_AttachInfoChk_MC.setTableConfigDtl((MABCP_AttachInfoChk)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_AttachInfoChk p) {
		p.columnDtl_itm_cd.setMeta(mcframe.clientMABC.MABCP0830.DtlR.itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_cd);
		p.columnDtl_itm_sub1.setMeta(mcframe.clientMABC.MABCP0830.DtlR.itm_sub1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub1);
		p.columnDtl_itm_sub2.setMeta(mcframe.clientMABC.MABCP0830.DtlR.itm_sub2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub2);
		p.columnDtl_itm_sub3.setMeta(mcframe.clientMABC.MABCP0830.DtlR.itm_sub3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub3);
		p.columnDtl_sno1.setMeta(mcframe.clientMABC.MABCP0830.DtlR.sno1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1);
		p.columnDtl_sno2.setMeta(mcframe.clientMABC.MABCP0830.DtlR.sno2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2);
		p.columnDtl_sno3.setMeta(mcframe.clientMABC.MABCP0830.DtlR.sno3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3);
		p.columnDtl_sno4.setMeta(mcframe.clientMABC.MABCP0830.DtlR.sno4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0830.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_attach_info_key1.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key1);
		p.columnDtl_attach_info_key2.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key2);
		p.columnDtl_attach_info_key3.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_key3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key3);
		p.columnDtl_attach_info_key4.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_key4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key4);
		p.columnDtl_attach_info_key5.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_key5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key5);
		p.columnDtl_attach_info_id.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_id);
		p.columnDtl_attach_info_typ.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_typ_META);
		p.columnDtl_attach_info_typ.addLinkBeans(p.columnDtl_attach_info_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_typ);
		p.columnDtl_attach_info_typ_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_typ_nm);
		p.columnDtl_ext_sys_no_attach.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ext_sys_no_attach_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_attach);
		p.columnDtl_attach_info_rmrks.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_rmrks);
		p.columnDtl_attach_info_path.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_path_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_path);
		p.columnDtl_attach_info_bin.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_bin_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_bin);
		p.columnDtl_attach_info_bin_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.attach_info_bin_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_bin_nm);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0830.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_attach_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_attach_info_typ.getListConfig().setPutter(getCnd_attach_info_typ_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_attach_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_attach_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AttachInfoTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_attach_info_typ) return getCnd_attach_info_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == DtlBtn_open) doDtlBtn_open(info);
		else if (ap == DtlBtn_dwnld) doDtlBtn_dwnld(info);
		else if (ap == DtlBtn_select_file) doDtlBtn_select_file(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_dwnld(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_file(MCEventInfo info);

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
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_attach_info_typ) return doCnd_attach_info_typ_VC(info);
		if (vc == Cnd_attach_info_typ_nm) return doCnd_attach_info_typ_nm_VC(info);
		if (vc == columnDtl_itm_cd) return doDtl_itm_cd_VC(info);
		if (vc == columnDtl_itm_sub1) return doDtl_itm_sub1_VC(info);
		if (vc == columnDtl_itm_sub2) return doDtl_itm_sub2_VC(info);
		if (vc == columnDtl_itm_sub3) return doDtl_itm_sub3_VC(info);
		if (vc == columnDtl_sno1) return doDtl_sno1_VC(info);
		if (vc == columnDtl_sno2) return doDtl_sno2_VC(info);
		if (vc == columnDtl_sno3) return doDtl_sno3_VC(info);
		if (vc == columnDtl_sno4) return doDtl_sno4_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_attach_info_key1) return doDtl_attach_info_key1_VC(info);
		if (vc == columnDtl_attach_info_key2) return doDtl_attach_info_key2_VC(info);
		if (vc == columnDtl_attach_info_key3) return doDtl_attach_info_key3_VC(info);
		if (vc == columnDtl_attach_info_key4) return doDtl_attach_info_key4_VC(info);
		if (vc == columnDtl_attach_info_key5) return doDtl_attach_info_key5_VC(info);
		if (vc == columnDtl_attach_info_id) return doDtl_attach_info_id_VC(info);
		if (vc == columnDtl_attach_info_typ) return doDtl_attach_info_typ_VC(info);
		if (vc == columnDtl_attach_info_typ_nm) return doDtl_attach_info_typ_nm_VC(info);
		if (vc == columnDtl_ext_sys_no_attach) return doDtl_ext_sys_no_attach_VC(info);
		if (vc == columnDtl_attach_info_rmrks) return doDtl_attach_info_rmrks_VC(info);
		if (vc == columnDtl_attach_info_path) return doDtl_attach_info_path_VC(info);
		if (vc == columnDtl_attach_info_bin) return doDtl_attach_info_bin_VC(info);
		if (vc == columnDtl_attach_info_bin_nm) return doDtl_attach_info_bin_nm_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == DtlBtn_file) return doDtlBtn_file_VC(info);
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
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attach_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attach_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attach_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_no_attach_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_bin]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_bin_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_bin_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlBtn]パネルの[file]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlBtn_file_VC(MCEventInfo info){
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
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_attach_info_typ) doCnd_attach_info_typ_NC(info);
		else if (nc == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NC(info);
		else if (nc == columnDtl_itm_cd) doDtl_itm_cd_NC(info);
		else if (nc == columnDtl_itm_sub1) doDtl_itm_sub1_NC(info);
		else if (nc == columnDtl_itm_sub2) doDtl_itm_sub2_NC(info);
		else if (nc == columnDtl_itm_sub3) doDtl_itm_sub3_NC(info);
		else if (nc == columnDtl_sno1) doDtl_sno1_NC(info);
		else if (nc == columnDtl_sno2) doDtl_sno2_NC(info);
		else if (nc == columnDtl_sno3) doDtl_sno3_NC(info);
		else if (nc == columnDtl_sno4) doDtl_sno4_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_attach_info_key1) doDtl_attach_info_key1_NC(info);
		else if (nc == columnDtl_attach_info_key2) doDtl_attach_info_key2_NC(info);
		else if (nc == columnDtl_attach_info_key3) doDtl_attach_info_key3_NC(info);
		else if (nc == columnDtl_attach_info_key4) doDtl_attach_info_key4_NC(info);
		else if (nc == columnDtl_attach_info_key5) doDtl_attach_info_key5_NC(info);
		else if (nc == columnDtl_attach_info_id) doDtl_attach_info_id_NC(info);
		else if (nc == columnDtl_attach_info_typ) doDtl_attach_info_typ_NC(info);
		else if (nc == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NC(info);
		else if (nc == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NC(info);
		else if (nc == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NC(info);
		else if (nc == columnDtl_attach_info_path) doDtl_attach_info_path_NC(info);
		else if (nc == columnDtl_attach_info_bin) doDtl_attach_info_bin_NC(info);
		else if (nc == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == DtlBtn_file) doDtlBtn_file_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[file]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_file_NC(MCEventInfo info){
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
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_attach_info_typ) doCnd_attach_info_typ_NE(info);
		else if (ne == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NE(info);
		else if (ne == columnDtl_itm_cd) doDtl_itm_cd_NE(info);
		else if (ne == columnDtl_itm_sub1) doDtl_itm_sub1_NE(info);
		else if (ne == columnDtl_itm_sub2) doDtl_itm_sub2_NE(info);
		else if (ne == columnDtl_itm_sub3) doDtl_itm_sub3_NE(info);
		else if (ne == columnDtl_sno1) doDtl_sno1_NE(info);
		else if (ne == columnDtl_sno2) doDtl_sno2_NE(info);
		else if (ne == columnDtl_sno3) doDtl_sno3_NE(info);
		else if (ne == columnDtl_sno4) doDtl_sno4_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_attach_info_key1) doDtl_attach_info_key1_NE(info);
		else if (ne == columnDtl_attach_info_key2) doDtl_attach_info_key2_NE(info);
		else if (ne == columnDtl_attach_info_key3) doDtl_attach_info_key3_NE(info);
		else if (ne == columnDtl_attach_info_key4) doDtl_attach_info_key4_NE(info);
		else if (ne == columnDtl_attach_info_key5) doDtl_attach_info_key5_NE(info);
		else if (ne == columnDtl_attach_info_id) doDtl_attach_info_id_NE(info);
		else if (ne == columnDtl_attach_info_typ) doDtl_attach_info_typ_NE(info);
		else if (ne == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NE(info);
		else if (ne == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NE(info);
		else if (ne == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NE(info);
		else if (ne == columnDtl_attach_info_path) doDtl_attach_info_path_NE(info);
		else if (ne == columnDtl_attach_info_bin) doDtl_attach_info_bin_NE(info);
		else if (ne == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == DtlBtn_file) doDtlBtn_file_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[file]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_file_NE(MCEventInfo info){
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
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_attach_info_typ) doCnd_attach_info_typ_NX(info);
		else if (nx == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NX(info);
		else if (nx == columnDtl_itm_cd) doDtl_itm_cd_NX(info);
		else if (nx == columnDtl_itm_sub1) doDtl_itm_sub1_NX(info);
		else if (nx == columnDtl_itm_sub2) doDtl_itm_sub2_NX(info);
		else if (nx == columnDtl_itm_sub3) doDtl_itm_sub3_NX(info);
		else if (nx == columnDtl_sno1) doDtl_sno1_NX(info);
		else if (nx == columnDtl_sno2) doDtl_sno2_NX(info);
		else if (nx == columnDtl_sno3) doDtl_sno3_NX(info);
		else if (nx == columnDtl_sno4) doDtl_sno4_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_attach_info_key1) doDtl_attach_info_key1_NX(info);
		else if (nx == columnDtl_attach_info_key2) doDtl_attach_info_key2_NX(info);
		else if (nx == columnDtl_attach_info_key3) doDtl_attach_info_key3_NX(info);
		else if (nx == columnDtl_attach_info_key4) doDtl_attach_info_key4_NX(info);
		else if (nx == columnDtl_attach_info_key5) doDtl_attach_info_key5_NX(info);
		else if (nx == columnDtl_attach_info_id) doDtl_attach_info_id_NX(info);
		else if (nx == columnDtl_attach_info_typ) doDtl_attach_info_typ_NX(info);
		else if (nx == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NX(info);
		else if (nx == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NX(info);
		else if (nx == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NX(info);
		else if (nx == columnDtl_attach_info_path) doDtl_attach_info_path_NX(info);
		else if (nx == columnDtl_attach_info_bin) doDtl_attach_info_bin_NX(info);
		else if (nx == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == DtlBtn_file) doDtlBtn_file_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[file]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_file_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_attach_info_typ) doCnd_attach_info_typ_LC(info);
		else if (lc == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_LC(info);
		else if (lc == columnDtl_itm_cd) doDtl_itm_cd_LC(info);
		else if (lc == columnDtl_itm_sub1) doDtl_itm_sub1_LC(info);
		else if (lc == columnDtl_itm_sub2) doDtl_itm_sub2_LC(info);
		else if (lc == columnDtl_itm_sub3) doDtl_itm_sub3_LC(info);
		else if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		else if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		else if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		else if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_attach_info_key1) doDtl_attach_info_key1_LC(info);
		else if (lc == columnDtl_attach_info_key2) doDtl_attach_info_key2_LC(info);
		else if (lc == columnDtl_attach_info_key3) doDtl_attach_info_key3_LC(info);
		else if (lc == columnDtl_attach_info_key4) doDtl_attach_info_key4_LC(info);
		else if (lc == columnDtl_attach_info_key5) doDtl_attach_info_key5_LC(info);
		else if (lc == columnDtl_attach_info_id) doDtl_attach_info_id_LC(info);
		else if (lc == columnDtl_attach_info_typ) doDtl_attach_info_typ_LC(info);
		else if (lc == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_LC(info);
		else if (lc == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_LC(info);
		else if (lc == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_LC(info);
		else if (lc == columnDtl_attach_info_path) doDtl_attach_info_path_LC(info);
		else if (lc == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == DtlBtn_file) doDtlBtn_file_LC(info);
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[file]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_file_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_attach_info_typ]の作成メソッド
	 */
	public MCList getCnd_attach_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAttachInfoTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0830.Srch01")) {
			return new MA_MABCL0830_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0830_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0830_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0830_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0830_Srch01Bridge() {
			p_MA_MABCL0830_Srch01 = new MCParam(PDef.MA_MABCL0830_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0830_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0830.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0830.DtlR.class));

			p_MA_MABCL0830_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0830_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0830_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0830_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0830_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0830.CndR up0() {
			return (mcframe.clientMABC.MABCP0830.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0830.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0830.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0830_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0830.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0830_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0830.DtlR>)p_MA_MABCL0830_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}