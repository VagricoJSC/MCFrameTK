package mcframe.clientMBBE.MBBEP0080;

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
import mcframe.clientMBBE.MBBEP0080.MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Srch01Caller;
import mcframe.clientMBBE.MBBEP0080.MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Upd01Caller;

/**
 * 画面"MBBEP_BatchIfDataConfirm"パネルクラスです。<p>
 *
 * バッチ・ＩＦデータ情報の確認を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_BatchIfDataConfirm_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBEP0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0140.FXBAP0140 Top_db_PPanel;
	// [Bottom]ブロック関連のField定義
	public MCPanel BottomPanel = null;
	// [Bottom]ブロックの項目のField定義
	// [MsgLst]ブロック関連のField定義
	public MCPanel MsgLstPanel = null;
	public MCScrollPane MsgLstScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0080.MsgLstR> MsgLstTable = null;
	// [MsgLst]ブロックの項目のField定義
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_msg_id = null;
	/**
	 * Message メッセージ.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_msg_txt = null;
	/**
	 * Message level メッセージレベル.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_msg_lvl = null;
	/**
	 * Logged date and time ログ発生日時.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_log_ts = null;
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_batch_log_no = null;
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_seq = null;
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_log_sub_key1 = null;
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_log_sub_key2 = null;
	/**
	 * Log type ログ区分.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_batch_log_typ = null;
	/**
	 * Log type name ログ区分名.<p>
	 *
	 */
	public MCColumnConfig columnMsgLst_batch_log_typ_nm = null;
	// [MsgDtl]ブロック関連のField定義
	public MCPanel MsgDtlPanel = null;
	// [MsgDtl]ブロックの項目のField定義
	public MCScrollPane MsgDtl_msgScrollPane = null;
	public MCTextArea MsgDtl_msg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl_info = null;
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_if_proc_typ = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * To import 取込対象.<p>
	 *
	 */
	public MCLabel Btn_label_imp_flg = null;
	/**
	 * Select all To import flg. 取込対象全選択.<p>
	 *
	 */
	public MCButton Btn_imp_flg_select_all = null;
	/**
	 * Release all To import flg. 取込対象全解除.<p>
	 *
	 */
	public MCButton Btn_imp_flg_deselect_all = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Import received data 受信データ取込.<p>
	 *
	 */
	public MCButton Btn_imp = null;
	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public MCButton Btn_in_file = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX};
	
	/** [MB_MBBEL0080_Srch01]のCallerの作成 */
	protected MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Srch01Caller createMB_MBBEL0080_Srch01() {
		MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Srch01Caller<MBBEP_BatchIfDataConfirm, MB_MBBEL0080_Srch01Bridge>
		caller = ((MBBEP_BatchIfDataConfirm_MC)this).new MB_MBBEL0080_Srch01Caller<MBBEP_BatchIfDataConfirm, MB_MBBEL0080_Srch01Bridge>(
					(MBBEP_BatchIfDataConfirm)this, new MB_MBBEL0080_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBEL0080_Srch01]の呼び出し */
	protected void callMB_MBBEL0080_Srch01() {
		MCCaller caller = createMB_MBBEL0080_Srch01();
		caller.exec();
	}
	/** [MB_MBBEL0080_Upd01]のCallerの作成 */
	protected MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Upd01Caller createMB_MBBEL0080_Upd01() {
		MBBEP_BatchIfDataConfirm_MC.MB_MBBEL0080_Upd01Caller<MBBEP_BatchIfDataConfirm, MB_MBBEL0080_Upd01Bridge>
		caller = ((MBBEP_BatchIfDataConfirm_MC)this).new MB_MBBEL0080_Upd01Caller<MBBEP_BatchIfDataConfirm, MB_MBBEL0080_Upd01Bridge>(
					(MBBEP_BatchIfDataConfirm)this, new MB_MBBEL0080_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBEL0080_Upd01]の呼び出し */
	protected void callMB_MBBEL0080_Upd01() {
		MCCaller caller = createMB_MBBEL0080_Upd01();
		caller.exec();
	}
	/** [LogCnd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0080.LogCndR> aLogCndL;
	/** [MsgLst]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR> aMsgLstL;
	/** [MsgDtl]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0080.MsgDtlR aMsgDtlR;
	/** [Info]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0080.InfoR aInfoR;
	/** [Cont]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0080.ContR> aContL;

	/**
	 * コピーによってaLogCndLを設定します。
	 *
	 * aLogCndLのインスタンスは変更されません。
	 *
	 * @param dataset LogCndL
	 */
	public void setLogCndL(MCList<mcframe.clientMBBE.MBBEP0080.LogCndR> aList) {
		if (getLogCndL() != aList) {
			getLogCndL().setAll(aList);
		}
	}

	/**
	 * [LogCnd]ブロックのコンテナaLogCndLを返します。
	 *
	 * @return LogCndL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.LogCndR> getLogCndL() {
		return aLogCndL;
	}

	/**
	 * aLogCndRを作成します。
	 *
	 * @return LogCndR
	 */
	public mcframe.clientMBBE.MBBEP0080.LogCndR createLogCndR() {
		return mcframe.clientMBBE.MBBEP0080.LogCndR.create();
	}

	/**
	 * aLogCndLを作成します。
	 *
	 * @return LogCndL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.LogCndR> createLogCndL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0080.LogCndR.class);
	}

	/**
	 * コピーによってaMsgLstLを設定します。
	 *
	 * aMsgLstLのインスタンスは変更されません。
	 *
	 * @param dataset MsgLstL
	 */
	public void setMsgLstL(MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR> aList) {
		if (getMsgLstL() != aList) {
			getMsgLstL().setAll(aList);
		}
	}

	/**
	 * [MsgLst]ブロックのコンテナaMsgLstLを返します。
	 *
	 * @return MsgLstL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR> getMsgLstL() {
		return aMsgLstL;
	}

	/**
	 * aMsgLstRを作成します。
	 *
	 * @return MsgLstR
	 */
	public mcframe.clientMBBE.MBBEP0080.MsgLstR createMsgLstR() {
		return mcframe.clientMBBE.MBBEP0080.MsgLstR.create();
	}

	/**
	 * aMsgLstLを作成します。
	 *
	 * @return MsgLstL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR> createMsgLstL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0080.MsgLstR.class);
	}

	/**
	 * MsgLstTableを初期化します。
	 */
	protected void createMsgLstTable(){
		if(MsgLstTable == null){
			MsgLstTable = beansFactory.createTable2("MsgLst.table");
		}
	}

	/**
	 * 項目コピーによってaMsgDtlRを設定します。
	 *
	 * aMsgDtlRのインスタンスは変更されません。
	 *
	 * @param row MsgDtlR
	 */
	public void setMsgDtlR(mcframe.clientMBBE.MBBEP0080.MsgDtlR row) {
		if (row != null) {
			MCRow.copyall(getMsgDtlR(), row);
		}
	}

	/**
	 * [MsgDtl]ブロックのコンテナaMsgDtlRを返します。
	 *
	 * @return MsgDtlR
	 */
	public mcframe.clientMBBE.MBBEP0080.MsgDtlR getMsgDtlR() {
		return aMsgDtlR;
	}

	/**
	 * aMsgDtlRを作成します。
	 *
	 * @return MsgDtlR
	 */
	public mcframe.clientMBBE.MBBEP0080.MsgDtlR createMsgDtlR() {
		return mcframe.clientMBBE.MBBEP0080.MsgDtlR.create();
	}

	/**
	 * 項目コピーによってaInfoRを設定します。
	 *
	 * aInfoRのインスタンスは変更されません。
	 *
	 * @param row InfoR
	 */
	public void setInfoR(mcframe.clientMBBE.MBBEP0080.InfoR row) {
		if (row != null) {
			MCRow.copyall(getInfoR(), row);
		}
	}

	/**
	 * [Info]ブロックのコンテナaInfoRを返します。
	 *
	 * @return InfoR
	 */
	public mcframe.clientMBBE.MBBEP0080.InfoR getInfoR() {
		return aInfoR;
	}

	/**
	 * aInfoRを作成します。
	 *
	 * @return InfoR
	 */
	public mcframe.clientMBBE.MBBEP0080.InfoR createInfoR() {
		return mcframe.clientMBBE.MBBEP0080.InfoR.create();
	}

	/**
	 * コピーによってaContLを設定します。
	 *
	 * aContLのインスタンスは変更されません。
	 *
	 * @param dataset ContL
	 */
	public void setContL(MCList<mcframe.clientMBBE.MBBEP0080.ContR> aList) {
		if (getContL() != aList) {
			getContL().setAll(aList);
		}
	}

	/**
	 * [Cont]ブロックのコンテナaContLを返します。
	 *
	 * @return ContL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.ContR> getContL() {
		return aContL;
	}

	/**
	 * aContRを作成します。
	 *
	 * @return ContR
	 */
	public mcframe.clientMBBE.MBBEP0080.ContR createContR() {
		return mcframe.clientMBBE.MBBEP0080.ContR.create();
	}

	/**
	 * aContLを作成します。
	 *
	 * @return ContL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0080.ContR> createContL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0080.ContR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getLogCndL())) ret.add(getLogCndL());
		if(!MCCollectionUtil.contains(ret, getMsgLstL())) ret.add(getMsgLstL());
		if(!MCCollectionUtil.contains(ret, getMsgDtlR())) ret.add(getMsgDtlR());
		if(!MCCollectionUtil.contains(ret, getInfoR())) ret.add(getInfoR());
		if(!MCCollectionUtil.contains(ret, getContL())) ret.add(getContL());
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
		if(aCnt == getLogCndL()) return "LogCnd";
		if(aCnt == getMsgLstL()) return "MsgLst";
		if(aCnt == getMsgDtlR()) return "MsgDtl";
		if(aCnt == getInfoR()) return "Info";
		if(aCnt == getContL()) return "Cont";
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
		if(bId.equals("LogCnd")) return getLogCndL();
		if(bId.equals("MsgLst")) return getMsgLstL();
		if(bId.equals("MsgDtl")) return getMsgDtlR();
		if(bId.equals("Info")) return getInfoR();
		if(bId.equals("Cont")) return getContL();
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
		ret.add(BottomPanel);
		ret.add(MsgLstPanel);
		ret.add(MsgDtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BatchIfDataConfirm_MC_A() {
		aLogCndL = createLogCndL();
		aMsgLstL = createMsgLstL();
		aMsgDtlR = createMsgDtlR();
		aInfoR = createInfoR();
		aContL = createContL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BatchIfDataConfirm_MC_A(String name) {
		aLogCndL = createLogCndL();
		aMsgLstL = createMsgLstL();
		createMsgLstTable();
		MsgLstTable.setRowName(name);
		aMsgDtlR = createMsgDtlR();
		aInfoR = createInfoR();
		aContL = createContL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_BatchIfDataConfirm_MC.jbCreateTop((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbCreateBottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbCreateMsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbCreateMsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbCreateBtn((MBBEP_BatchIfDataConfirm)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBEP_BatchIfDataConfirm p) {
		p.Top_db_PPanel = mcframe.clientFXBA.FXBAP0140.FXBAP0140.create();
		p.Top_db_PPanel.setName("Top.db");
	}

	/**
	 * [Bottom]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBottom(MBBEP_BatchIfDataConfirm p) {
	}

	/**
	 * [MsgLst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMsgLst(MBBEP_BatchIfDataConfirm p) {
	}

	/**
	 * [MsgDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMsgDtl(MBBEP_BatchIfDataConfirm p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_BatchIfDataConfirm p) {
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

	
	/** [MsgLst_batch_log_typ_ListPutter]の定義 */
	private MCListPutter MsgLst_batch_log_typ_p = null;

	/**
	 * [MsgLst_batch_log_typ_ListPutter]の取得
	 */
	protected MCListPutter getMsgLst_batch_log_typ_ListPutter() {
		if (MsgLst_batch_log_typ_p == null) {
			MsgLst_batch_log_typ_p = createMsgLst_batch_log_typ_ListPutter(columnMsgLst_batch_log_typ, "batch_log_typ");

		}
		return MsgLst_batch_log_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BatchIfDataConfirm create(){
		MBBEP_BatchIfDataConfirm p = new MBBEP_BatchIfDataConfirm();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BatchIfDataConfirm create(String name){
		MBBEP_BatchIfDataConfirm p = new MBBEP_BatchIfDataConfirm(name);
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
		MBBEP_BatchIfDataConfirm_MC.jbfInitTop((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbfInitBottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbfInitMsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbfInitMsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbfInitBtn((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbInitTop((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbInitBottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbInitMsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbInitMsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.jbInitBtn((MBBEP_BatchIfDataConfirm)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBottom(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.BottomPanel = p.beansFactory.createPanel("Bottom");
		// ブロックの項目の初期化
	}

	/**
	 * [MsgLst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMsgLst(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.MsgLstPanel = p.beansFactory.createPanel("MsgLst");
		p.MsgLstScrollPane = p.beansFactory.createScrollPane("MsgLst.scroll");
		p.createMsgLstTable();
		// ブロックの項目の初期化
		p.columnMsgLst_msg_id = p.beansFactory.createTableColumn("MsgLst.msg_id", MCColumnType.TEXT);
		p.columnMsgLst_msg_txt = p.beansFactory.createTableColumn("MsgLst.msg_txt", MCColumnType.TEXT);
		p.columnMsgLst_msg_lvl = p.beansFactory.createTableColumn("MsgLst.msg_lvl", MCColumnType.TEXT);
		p.columnMsgLst_log_ts = p.beansFactory.createTableColumn("MsgLst.log_ts", MCColumnType.TIMESTAMP);
		p.columnMsgLst_batch_log_no = p.beansFactory.createTableColumn("MsgLst.batch_log_no", MCColumnType.TEXT);
		p.columnMsgLst_seq = p.beansFactory.createTableColumn("MsgLst.seq", MCColumnType.NUMBER);
		p.columnMsgLst_log_sub_key1 = p.beansFactory.createTableColumn("MsgLst.log_sub_key1", MCColumnType.NUMBER);
		p.columnMsgLst_log_sub_key2 = p.beansFactory.createTableColumn("MsgLst.log_sub_key2", MCColumnType.NUMBER);
		p.columnMsgLst_batch_log_typ = p.beansFactory.createTableColumn("MsgLst.batch_log_typ", MCColumnType.TEXT_COMBO);
		p.columnMsgLst_batch_log_typ_nm = p.beansFactory.createTableColumn("MsgLst.batch_log_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [MsgDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMsgDtl(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.MsgDtlPanel = p.beansFactory.createPanel("MsgDtl");
		// ブロックの項目の初期化
		p.MsgDtl_msgScrollPane = p.beansFactory.createScrollPane("MsgDtl.msgscroll");
		p.MsgDtl_msg = p.beansFactory.createTextArea("MsgDtl.msg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl_info = p.beansFactory.createButton("Btn.open_dtl_info", "open");
		p.Btn_open_if_proc_typ = p.beansFactory.createButton("Btn.open_if_proc_typ", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_label_imp_flg = p.beansFactory.createLabel("Btn.label_imp_flg");
		p.Btn_imp_flg_select_all = p.beansFactory.createButton("Btn.imp_flg_select_all", "no_border");
		p.Btn_imp_flg_deselect_all = p.beansFactory.createButton("Btn.imp_flg_deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_imp = p.beansFactory.createButton("Btn.imp", "upd");
		p.Btn_in_file = p.beansFactory.createButton("Btn.in_file");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.BottomPanel);
		p.TopPanel.setLayoutPosition("T+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.Top_db_PPanel);
		p.TopPanel.setLastBeans(p.Top_db_PPanel);
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBottom(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.add(p.BottomPanel);
		p.BottomPanel.setValueCheck(false);
		p.BottomPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BottomPanel.setLayoutPosition("B+");
		// ブロックの項目の初期化
		p.BottomPanel.add(p.MsgLstPanel, null);
		p.BottomPanel.setLastBeans(p.MsgLstPanel);
		p.MsgLstPanel.setNextBeans(p.MsgDtlPanel);
		p.BottomPanel.add(p.MsgDtlPanel, null);
		p.MsgDtlPanel.setNextBeans(p.BtnPanel);
		p.BottomPanel.add(p.BtnPanel, null);
	}

	/**
	 * [MsgLst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMsgLst(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.MsgLstPanel.add(p.MsgLstScrollPane);
		p.MsgLstPanel.setLastBeans(p.MsgLstTable);
		p.MsgLstScrollPane.setViewportView(p.MsgLstTable);
		p.MsgLstTable.setList(p.getMsgLstL());
		p.MsgLstPanel.setValueCheck(false);
		p.MsgLstPanel.setLayoutPosition("CLC");
		// ブロックの項目の初期化
	}

	/**
	 * [MsgDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMsgDtl(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.MsgDtlPanel.setValueCheck(false);
		p.MsgDtlPanel.setLayoutPosition("CRC");
		// ブロックの項目の初期化
		p.MsgDtl_msgScrollPane.getViewport().add(p.MsgDtl_msg);
		p.MsgDtlPanel.add(p.MsgDtl_msgScrollPane);
		p.MsgDtlPanel.setLastBeans(p.MsgDtl_msg);
		p.MsgDtl_msg.setRow(p.getMsgDtlR(), mcframe.clientMBBE.MBBEP0080.MsgDtlR.msg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_BatchIfDataConfirm p) {
		// ブロック関連の初期化
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_open_dtl_info);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl_info);
		p.Btn_open_dtl_info.setNextBeans(p.Btn_open_if_proc_typ);
		p.BtnPanel.add(p.Btn_open_if_proc_typ);
		p.Btn_open_if_proc_typ.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_imp_flg_select_all);
		p.BtnPanel.add(p.Btn_label_imp_flg);
		p.Btn_imp_flg_select_all.setIcon("SELECT_ALL");
		p.Btn_imp_flg_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_imp_flg_select_all);
		p.Btn_imp_flg_select_all.setNextBeans(p.Btn_imp_flg_deselect_all);
		p.Btn_imp_flg_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_imp_flg_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_imp_flg_deselect_all);
		p.Btn_imp_flg_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_imp);
		p.Btn_imp.setFunctionKey(MCFunctionKey.F11);
		p.BtnPanel.add(p.Btn_imp);
		p.Btn_imp.setNextBeans(p.Btn_in_file);
		p.BtnPanel.add(p.Btn_in_file);
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
		MBBEP_BatchIfDataConfirm_MC.mcInitTop((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.mcInitBottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.mcInitMsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.mcInitMsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.mcInitBtn((MBBEP_BatchIfDataConfirm)this);

		// [UPD]ステータスのモードの設定
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_Top((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_Bottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_LogCnd((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_MsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_MsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_Btn((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_Info((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitUPD_Cont((MBBEP_BatchIfDataConfirm)this);

		// [FIX]ステータスのモードの設定
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_Top((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_Bottom((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_LogCnd((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_MsgLst((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_MsgDtl((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_Btn((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_Info((MBBEP_BatchIfDataConfirm)this);
		MBBEP_BatchIfDataConfirm_MC.statusInitFIX_Cont((MBBEP_BatchIfDataConfirm)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBEP_BatchIfDataConfirm p) {
	}

	/**
	 *  [Bottom]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBottom(MBBEP_BatchIfDataConfirm p) {
	}

	/**
	 *  [MsgLst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMsgLst(MBBEP_BatchIfDataConfirm p) {
		p.MsgLstTable.addAllListener(p);
		p.columnMsgLst_msg_id.addAllListener(p);
		p.columnMsgLst_msg_id.setListListener(p);
		p.columnMsgLst_msg_txt.addAllListener(p);
		p.columnMsgLst_msg_txt.setListListener(p);
		p.columnMsgLst_msg_lvl.addAllListener(p);
		p.columnMsgLst_msg_lvl.setListListener(p);
		p.columnMsgLst_log_ts.addAllListener(p);
		p.columnMsgLst_log_ts.setListListener(p);
		p.columnMsgLst_batch_log_no.addAllListener(p);
		p.columnMsgLst_batch_log_no.setListListener(p);
		p.columnMsgLst_seq.addAllListener(p);
		p.columnMsgLst_seq.setListListener(p);
		p.columnMsgLst_log_sub_key1.addAllListener(p);
		p.columnMsgLst_log_sub_key1.setListListener(p);
		p.columnMsgLst_log_sub_key2.addAllListener(p);
		p.columnMsgLst_log_sub_key2.setListListener(p);
		p.columnMsgLst_batch_log_typ.addAllListener(p);
		p.columnMsgLst_batch_log_typ.setListListener(p);
		p.columnMsgLst_batch_log_typ_nm.addAllListener(p);
		p.columnMsgLst_batch_log_typ_nm.setListListener(p);
	}

	/**
	 *  [MsgDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMsgDtl(MBBEP_BatchIfDataConfirm p) {
		p.MsgDtl_msg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_BatchIfDataConfirm p) {
		p.Btn_open_dtl_info.addAllListener(p);
		p.Btn_open_dtl_info.setAPMethodName("doBtn_open_dtl_info");
		p.Btn_open_if_proc_typ.addAllListener(p);
		p.Btn_open_if_proc_typ.setAPMethodName("doBtn_open_if_proc_typ");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_imp_flg_select_all.addAllListener(p);
		p.Btn_imp_flg_select_all.setAPMethodName("doBtn_imp_flg_select_all");
		p.Btn_imp_flg_deselect_all.addAllListener(p);
		p.Btn_imp_flg_deselect_all.setAPMethodName("doBtn_imp_flg_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_imp.addAllListener(p);
		p.Btn_imp.setAPMethodName("doBtn_imp");
		p.Btn_in_file.addAllListener(p);
		p.Btn_in_file.setAPMethodName("doBtn_in_file");
	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MBBEP_BatchIfDataConfirm p){
		p.Top_db_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0140.FXBAP0140.UPD);

	}

	/**
	 * [UPD]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Bottom(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [UPD]ステータスの[LogCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LogCnd(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [UPD]ステータスの[MsgLst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MsgLst(MBBEP_BatchIfDataConfirm p){
		p.columnMsgLst_msg_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_msg_txt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_msg_lvl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_log_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_log_sub_key1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_log_sub_key2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[MsgDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MsgDtl(MBBEP_BatchIfDataConfirm p){
		p.MsgDtl_msg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MBBEP_BatchIfDataConfirm p){
		p.Btn_open_dtl_info.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_if_proc_typ.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_imp_flg_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_imp_flg_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_imp.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_in_file.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Info(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [UPD]ステータスの[Cont]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cont(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MBBEP_BatchIfDataConfirm p){
		p.Top_db_PPanel.putStatus(FIX, mcframe.clientFXBA.FXBAP0140.FXBAP0140.FIX);

	}

	/**
	 * [FIX]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Bottom(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [FIX]ステータスの[LogCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LogCnd(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [FIX]ステータスの[MsgLst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_MsgLst(MBBEP_BatchIfDataConfirm p){
		p.columnMsgLst_msg_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_msg_txt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_msg_lvl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_log_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_log_sub_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_log_sub_key2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsgLst_batch_log_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[MsgDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_MsgDtl(MBBEP_BatchIfDataConfirm p){
		p.MsgDtl_msg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MBBEP_BatchIfDataConfirm p){
		p.Btn_open_dtl_info.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_if_proc_typ.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_imp_flg_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_imp_flg_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_imp.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_in_file.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Info(MBBEP_BatchIfDataConfirm p){

	}

	/**
	 * [FIX]ステータスの[Cont]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cont(MBBEP_BatchIfDataConfirm p){

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
		MBBEP_BatchIfDataConfirm_MC.setTableConfigMsgLst((MBBEP_BatchIfDataConfirm)this);
	}

	/**
	 * [MsgLst]ブロックのTableの設定
	 */
	protected static void setTableConfigMsgLst(MBBEP_BatchIfDataConfirm p) {
		p.columnMsgLst_msg_id.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.msg_id_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_msg_id);
		p.columnMsgLst_msg_txt.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.msg_txt_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_msg_txt);
		p.columnMsgLst_msg_lvl.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.msg_lvl_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_msg_lvl);
		p.columnMsgLst_log_ts.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.log_ts_META);
		p.columnMsgLst_log_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_log_ts);
		p.columnMsgLst_batch_log_no.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.batch_log_no_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_batch_log_no);
		p.columnMsgLst_seq.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.seq_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_seq);
		p.columnMsgLst_log_sub_key1.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.log_sub_key1_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_log_sub_key1);
		p.columnMsgLst_log_sub_key2.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.log_sub_key2_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_log_sub_key2);
		p.columnMsgLst_batch_log_typ.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.batch_log_typ_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_batch_log_typ);
		p.columnMsgLst_batch_log_typ_nm.setMeta(mcframe.clientMBBE.MBBEP0080.MsgLstR.batch_log_typ_nm_META);
		p.MsgLstTable.addColumnConfig(p.columnMsgLst_batch_log_typ_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnMsgLst_batch_log_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnMsgLst_batch_log_typ.getListConfig().setPutter(getMsgLst_batch_log_typ_ListPutter());
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
	}

	/**
	 * [MsgLst_batch_log_typ_ListPutter]の作成
	 */
	protected MCListPutter createMsgLst_batch_log_typ_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnMsgLst_batch_log_typ) return getMsgLst_batch_log_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_open_dtl_info) doBtn_open_dtl_info(info);
		else if (ap == Btn_open_if_proc_typ) doBtn_open_if_proc_typ(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_imp_flg_select_all) doBtn_imp_flg_select_all(info);
		else if (ap == Btn_imp_flg_deselect_all) doBtn_imp_flg_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_imp) doBtn_imp(info);
		else if (ap == Btn_in_file) doBtn_in_file(info);
	}

	/**
	 * [Btn]パネルの[open_dtl_info]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl_info(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_if_proc_typ]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_if_proc_typ(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[imp_flg_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_imp_flg_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[imp_flg_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_imp_flg_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[imp]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_imp(MCEventInfo info);

	/**
	 * [Btn]パネルの[in_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_in_file(MCEventInfo info);

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
		if (vc == MsgLstTable) return doMsgLst_VC(info);
		if (vc == columnMsgLst_msg_id) return doMsgLst_msg_id_VC(info);
		if (vc == columnMsgLst_msg_txt) return doMsgLst_msg_txt_VC(info);
		if (vc == columnMsgLst_msg_lvl) return doMsgLst_msg_lvl_VC(info);
		if (vc == columnMsgLst_log_ts) return doMsgLst_log_ts_VC(info);
		if (vc == columnMsgLst_batch_log_no) return doMsgLst_batch_log_no_VC(info);
		if (vc == columnMsgLst_seq) return doMsgLst_seq_VC(info);
		if (vc == columnMsgLst_log_sub_key1) return doMsgLst_log_sub_key1_VC(info);
		if (vc == columnMsgLst_log_sub_key2) return doMsgLst_log_sub_key2_VC(info);
		if (vc == columnMsgLst_batch_log_typ) return doMsgLst_batch_log_typ_VC(info);
		if (vc == columnMsgLst_batch_log_typ_nm) return doMsgLst_batch_log_typ_nm_VC(info);
		if (vc == MsgDtl_msg) return doMsgDtl_msg_VC(info);
		return true;
	}

	/**
	 * [MsgLst]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[msg_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_msg_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[msg_txt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_msg_txt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[msg_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_msg_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[log_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_log_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[log_sub_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_log_sub_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[log_sub_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_log_sub_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_batch_log_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgLst_batch_log_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgDtl]パネルの[msg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgDtl_msg_VC(MCEventInfo info){
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
		if (nc == MsgLstTable) doMsgLst_NC(info);
		else if (nc == columnMsgLst_msg_id) doMsgLst_msg_id_NC(info);
		else if (nc == columnMsgLst_msg_txt) doMsgLst_msg_txt_NC(info);
		else if (nc == columnMsgLst_msg_lvl) doMsgLst_msg_lvl_NC(info);
		else if (nc == columnMsgLst_log_ts) doMsgLst_log_ts_NC(info);
		else if (nc == columnMsgLst_batch_log_no) doMsgLst_batch_log_no_NC(info);
		else if (nc == columnMsgLst_seq) doMsgLst_seq_NC(info);
		else if (nc == columnMsgLst_log_sub_key1) doMsgLst_log_sub_key1_NC(info);
		else if (nc == columnMsgLst_log_sub_key2) doMsgLst_log_sub_key2_NC(info);
		else if (nc == columnMsgLst_batch_log_typ) doMsgLst_batch_log_typ_NC(info);
		else if (nc == columnMsgLst_batch_log_typ_nm) doMsgLst_batch_log_typ_nm_NC(info);
		else if (nc == MsgDtl_msg) doMsgDtl_msg_NC(info);
	}

	/**
	 * [MsgLst]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_id_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_txt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_txt_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_lvl_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_ts_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_seq_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key1_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key2_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_NC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [MsgDtl]パネルの[msg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgDtl_msg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == MsgLstTable) doMsgLst_NE(info);
		else if (ne == columnMsgLst_msg_id) doMsgLst_msg_id_NE(info);
		else if (ne == columnMsgLst_msg_txt) doMsgLst_msg_txt_NE(info);
		else if (ne == columnMsgLst_msg_lvl) doMsgLst_msg_lvl_NE(info);
		else if (ne == columnMsgLst_log_ts) doMsgLst_log_ts_NE(info);
		else if (ne == columnMsgLst_batch_log_no) doMsgLst_batch_log_no_NE(info);
		else if (ne == columnMsgLst_seq) doMsgLst_seq_NE(info);
		else if (ne == columnMsgLst_log_sub_key1) doMsgLst_log_sub_key1_NE(info);
		else if (ne == columnMsgLst_log_sub_key2) doMsgLst_log_sub_key2_NE(info);
		else if (ne == columnMsgLst_batch_log_typ) doMsgLst_batch_log_typ_NE(info);
		else if (ne == columnMsgLst_batch_log_typ_nm) doMsgLst_batch_log_typ_nm_NE(info);
		else if (ne == MsgDtl_msg) doMsgDtl_msg_NE(info);
	}

	/**
	 * [MsgLst]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_id_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_txt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_txt_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_lvl_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_ts_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_seq_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key1_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key2_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_NE(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [MsgDtl]パネルの[msg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgDtl_msg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == MsgLstTable) doMsgLst_NX(info);
		else if (nx == columnMsgLst_msg_id) doMsgLst_msg_id_NX(info);
		else if (nx == columnMsgLst_msg_txt) doMsgLst_msg_txt_NX(info);
		else if (nx == columnMsgLst_msg_lvl) doMsgLst_msg_lvl_NX(info);
		else if (nx == columnMsgLst_log_ts) doMsgLst_log_ts_NX(info);
		else if (nx == columnMsgLst_batch_log_no) doMsgLst_batch_log_no_NX(info);
		else if (nx == columnMsgLst_seq) doMsgLst_seq_NX(info);
		else if (nx == columnMsgLst_log_sub_key1) doMsgLst_log_sub_key1_NX(info);
		else if (nx == columnMsgLst_log_sub_key2) doMsgLst_log_sub_key2_NX(info);
		else if (nx == columnMsgLst_batch_log_typ) doMsgLst_batch_log_typ_NX(info);
		else if (nx == columnMsgLst_batch_log_typ_nm) doMsgLst_batch_log_typ_nm_NX(info);
		else if (nx == MsgDtl_msg) doMsgDtl_msg_NX(info);
	}

	/**
	 * [MsgLst]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_id_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_txt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_txt_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_lvl_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_ts_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_seq_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key1_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key2_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_NX(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [MsgDtl]パネルの[msg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgDtl_msg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnMsgLst_msg_id) doMsgLst_msg_id_LC(info);
		else if (lc == columnMsgLst_msg_txt) doMsgLst_msg_txt_LC(info);
		else if (lc == columnMsgLst_msg_lvl) doMsgLst_msg_lvl_LC(info);
		else if (lc == columnMsgLst_log_ts) doMsgLst_log_ts_LC(info);
		else if (lc == columnMsgLst_batch_log_no) doMsgLst_batch_log_no_LC(info);
		else if (lc == columnMsgLst_seq) doMsgLst_seq_LC(info);
		else if (lc == columnMsgLst_log_sub_key1) doMsgLst_log_sub_key1_LC(info);
		else if (lc == columnMsgLst_log_sub_key2) doMsgLst_log_sub_key2_LC(info);
		else if (lc == columnMsgLst_batch_log_typ) doMsgLst_batch_log_typ_LC(info);
		else if (lc == columnMsgLst_batch_log_typ_nm) doMsgLst_batch_log_typ_nm_LC(info);
	}

	/**
	 * [MsgLst]パネルの[msg_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_id_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_txt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_txt_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[msg_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_msg_lvl_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_ts_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_seq_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key1_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[log_sub_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_log_sub_key2_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_LC(MCEventInfo info){
	}

	/**
	 * [MsgLst]パネルの[batch_log_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgLst_batch_log_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnMsgLst_batch_log_typ]の作成メソッド
	 */
	public MCList getMsgLst_batch_log_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0080.Srch01")) {
			return new MB_MBBEL0080_Srch01Bridge();
		}
		if (id.equals("MB.MBBEL0080.Upd01")) {
			return new MB_MBBEL0080_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0080_Srch01;

		/** コンストラクタ */
		protected MB_MBBEL0080_Srch01Bridge() {
			p_MB_MBBEL0080_Srch01 = new MCParam(PDef.MB_MBBEL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0080.LogCndR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0080.MsgLstR.class));

			p_MB_MBBEL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0080_Srch01.addUpBlock(getLogCndL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0080.LogCndR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0080.LogCndR>)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0080.MsgLstR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0080_Srch01;
		}

		protected void show() {
			setMsgLstL((MCList<mcframe.clientMBBE.MBBEP0080.MsgLstR>)p_MB_MBBEL0080_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getMsgLstL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getLogCndL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getMsgLstL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0080_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0080_Upd01;

		/** コンストラクタ */
		protected MB_MBBEL0080_Upd01Bridge() {
			p_MB_MBBEL0080_Upd01 = new MCParam(PDef.MB_MBBEL0080_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0080_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0080.InfoR.create());
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0080.ContR.class));
			// Down

			p_MB_MBBEL0080_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0080_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0080_Upd01.addUpBlock(getInfoR());
			p_MB_MBBEL0080_Upd01.addUpBlock(getContL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0080_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0080_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0080.InfoR up0() {
			return (mcframe.clientMBBE.MBBEP0080.InfoR)up(0);
		}
		protected MCList<mcframe.clientMBBE.MBBEP0080.ContR> up1() {
			return (MCList<mcframe.clientMBBE.MBBEP0080.ContR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBEL0080_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getInfoR());
			result.add(getContL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}