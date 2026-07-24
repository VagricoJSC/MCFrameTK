package mcframe.clientMGBF.MGBFP0230;

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
import mcframe.clientMGBF.MGBFP0230.MGBFP_CostReportListReg_MC.MG_MGBFL0230_Srch01Caller;
import mcframe.clientMGBF.MGBFP0230.MGBFP_CostReportListReg_MC.MG_MGBFL0230_Upd01Caller;
import mcframe.clientMGBF.MGBFP0230.MGBFP_CostReportListReg_MC.MG_MGBFL0230_Del01Caller;

/**
 * 画面"MGBFP_CostReportListReg"パネルクラスです。<p>
 *
 * 原価レポート一覧から、選択したレポートの作成及び削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_CostReportListReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBFP0230";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF,View,0;UPD,Create,1;DEL,Delete,2; REF,参照する,0;UPD,作成する,1;DEL,削除する,2;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	public MCLabel Cnd_rpt_ptn_cd_Label = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_ptn_nm = null;
	public MCLabel Cnd_rpt_key_cd_Label = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_key_cd = null;
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_nm = null;
	public MCLabel Cnd_rpt_key_typ_Label = null;
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_key_typ = null;
	/**
	 * Report key type name レポートキー区分名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_typ_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Not created 未作成.<p>
	 *
	 */
	public MCCheckBox Cnd_unmake_flg = null;
	/**
	 * Created 作成済.<p>
	 *
	 */
	public MCCheckBox Cnd_made_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBF.MGBFP0230.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Created 作成済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_made_flg = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_ptn_nm = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_key_cd = null;
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_key_nm = null;
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_key_typ = null;
	/**
	 * Report key type name レポートキー区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_key_typ_nm = null;
	/**
	 * Auto-create 自動作成.<p>
	 *
	 */
	public MCColumnConfig columnRslt_auto_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost report 原価レポート照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBFP0240 = null;
	/**
	 * Cost report structure master entry 原価レポート構成マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0420 = null;
	/**
	 * Cost report key configuration master entry 原価レポートキー構成マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0400 = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF, REF, SRCH_UPD, UPD, SRCH_DEL, DEL, FIX_U};
	
	/** [MG_MGBFL0230_Srch01]のCallerの作成 */
	protected MGBFP_CostReportListReg_MC.MG_MGBFL0230_Srch01Caller createMG_MGBFL0230_Srch01() {
		MGBFP_CostReportListReg_MC.MG_MGBFL0230_Srch01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Srch01Bridge>
		caller = ((MGBFP_CostReportListReg_MC)this).new MG_MGBFL0230_Srch01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Srch01Bridge>(
					(MGBFP_CostReportListReg)this, new MG_MGBFL0230_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0230_Srch01]の呼び出し */
	protected void callMG_MGBFL0230_Srch01() {
		MCCaller caller = createMG_MGBFL0230_Srch01();
		caller.exec();
	}
	/** [MG_MGBFL0230_Upd01]のCallerの作成 */
	protected MGBFP_CostReportListReg_MC.MG_MGBFL0230_Upd01Caller createMG_MGBFL0230_Upd01() {
		MGBFP_CostReportListReg_MC.MG_MGBFL0230_Upd01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Upd01Bridge>
		caller = ((MGBFP_CostReportListReg_MC)this).new MG_MGBFL0230_Upd01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Upd01Bridge>(
					(MGBFP_CostReportListReg)this, new MG_MGBFL0230_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBFL0230_Upd01]の呼び出し */
	protected void callMG_MGBFL0230_Upd01() {
		MCCaller caller = createMG_MGBFL0230_Upd01();
		caller.exec();
	}
	/** [MG_MGBFL0230_Del01]のCallerの作成 */
	protected MGBFP_CostReportListReg_MC.MG_MGBFL0230_Del01Caller createMG_MGBFL0230_Del01() {
		MGBFP_CostReportListReg_MC.MG_MGBFL0230_Del01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Del01Bridge>
		caller = ((MGBFP_CostReportListReg_MC)this).new MG_MGBFL0230_Del01Caller<MGBFP_CostReportListReg, MG_MGBFL0230_Del01Bridge>(
					(MGBFP_CostReportListReg)this, new MG_MGBFL0230_Del01Bridge());
		return caller;
	}
	/** [MG_MGBFL0230_Del01]の呼び出し */
	protected void callMG_MGBFL0230_Del01() {
		MCCaller caller = createMG_MGBFL0230_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0230.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0230.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0230.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0230.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0230.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0230.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0230.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0230.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0230.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0230.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0230.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostReportListReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_CostReportListReg_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_CostReportListReg_MC.jbCreateScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateTop((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateCnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateCtrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateRslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateBtn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbCreateEastBtn((MGBFP_CostReportListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBFP_CostReportListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_CostReportListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_CostReportListReg p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_CostReportListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBFP_CostReportListReg p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBF.MGBFP0230.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBFP_CostReportListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBFP_CostReportListReg p) {
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Cnd_rpt_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_ptn_cd_p = null;

	/**
	 * [Cnd_rpt_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_ptn_cd_ListPutter() {
		if (Cnd_rpt_ptn_cd_p == null) {
			Cnd_rpt_ptn_cd_p = createCnd_rpt_ptn_cd_ListPutter(Cnd_rpt_ptn_cd, "rpt_ptn_cd", "rpt_ptn_nm");

		}
		return Cnd_rpt_ptn_cd_p;
	}
	
	
	/** [Cnd_rpt_key_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_key_cd_p = null;

	/**
	 * [Cnd_rpt_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_key_cd_ListPutter() {
		if (Cnd_rpt_key_cd_p == null) {
			Cnd_rpt_key_cd_p = createCnd_rpt_key_cd_ListPutter(Cnd_rpt_key_cd, "rpt_key_cd", "rpt_key_nm");

		}
		return Cnd_rpt_key_cd_p;
	}
	
	
	/** [Cnd_rpt_key_typ_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_key_typ_p = null;

	/**
	 * [Cnd_rpt_key_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_key_typ_ListPutter() {
		if (Cnd_rpt_key_typ_p == null) {
			Cnd_rpt_key_typ_p = createCnd_rpt_key_typ_ListPutter(Cnd_rpt_key_typ, "rpt_key_typ", "rpt_key_typ_nm");

		}
		return Cnd_rpt_key_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostReportListReg create(){
		MGBFP_CostReportListReg p = new MGBFP_CostReportListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostReportListReg create(String name){
		MGBFP_CostReportListReg p = new MGBFP_CostReportListReg(name);
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
		MGBFP_CostReportListReg_MC.jbfInitScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitTop((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitCnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitCtrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitRslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitBtn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbfInitEastBtn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitTop((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitCnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitCtrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitRslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitBtn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.jbInitEastBtn((MGBFP_CostReportListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_rpt_ptn_cd_Label = p.beansFactory.createLabel("Cnd.rpt_ptn_cd_Label");
		p.Cnd_rpt_ptn_cd = p.beansFactory.createTextComboBox("Cnd.rpt_ptn_cd");
		p.Cnd_rpt_ptn_cd.setLabel(p.Cnd_rpt_ptn_cd_Label);
		p.Cnd_rpt_ptn_nm = p.beansFactory.createTextField("Cnd.rpt_ptn_nm");
		p.Cnd_rpt_key_cd_Label = p.beansFactory.createLabel("Cnd.rpt_key_cd_Label");
		p.Cnd_rpt_key_cd = p.beansFactory.createTextComboBox("Cnd.rpt_key_cd");
		p.Cnd_rpt_key_cd.setLabel(p.Cnd_rpt_key_cd_Label);
		p.Cnd_rpt_key_nm = p.beansFactory.createTextField("Cnd.rpt_key_nm");
		p.Cnd_rpt_key_typ_Label = p.beansFactory.createLabel("Cnd.rpt_key_typ_Label");
		p.Cnd_rpt_key_typ = p.beansFactory.createTextComboBox("Cnd.rpt_key_typ");
		p.Cnd_rpt_key_typ.setLabel(p.Cnd_rpt_key_typ_Label);
		p.Cnd_rpt_key_typ_nm = p.beansFactory.createTextField("Cnd.rpt_key_typ_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_unmake_flg = p.beansFactory.createCheckBox("Cnd.unmake_flg");
		p.Cnd_made_flg = p.beansFactory.createCheckBox("Cnd.made_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_made_flg = p.beansFactory.createTableColumn("Rslt.made_flg", MCColumnType.CHECK);
		p.columnRslt_rpt_ptn_cd = p.beansFactory.createTableColumn("Rslt.rpt_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_rpt_ptn_nm = p.beansFactory.createTableColumn("Rslt.rpt_ptn_nm", MCColumnType.TEXT);
		p.columnRslt_rpt_key_cd = p.beansFactory.createTableColumn("Rslt.rpt_key_cd", MCColumnType.TEXT);
		p.columnRslt_rpt_key_nm = p.beansFactory.createTableColumn("Rslt.rpt_key_nm", MCColumnType.TEXT);
		p.columnRslt_rpt_key_typ = p.beansFactory.createTableColumn("Rslt.rpt_key_typ", MCColumnType.TEXT);
		p.columnRslt_rpt_key_typ_nm = p.beansFactory.createTableColumn("Rslt.rpt_key_typ_nm", MCColumnType.TEXT);
		p.columnRslt_auto_flg = p.beansFactory.createTableColumn("Rslt.auto_flg", MCColumnType.CHECK);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBFP0240 = p.beansFactory.createButton("Btn.open_MGBFP0240", "open");
		p.Btn_open_MABGP0420 = p.beansFactory.createButton("Btn.open_MABGP0420", "open");
		p.Btn_open_MABGP0400 = p.beansFactory.createButton("Btn.open_MABGP0400", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_rpt_ptn_cd);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.Cnd_rpt_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rpt_ptn_cd, true);
		p.Cnd_rpt_ptn_cd.setLinkBeans(p.Cnd_rpt_ptn_nm);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd);
		p.Cnd_rpt_ptn_cd.setNextBeans(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_ptn_cd_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_nm.setNextBeans(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_rpt_ptn_nm, true);
		p.Cnd_rpt_key_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rpt_key_cd, true);
		p.Cnd_rpt_key_cd.setLinkBeans(p.Cnd_rpt_key_nm);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setNextBeans(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_key_nm_META);
		p.setPluralValueEnable(p.Cnd_rpt_key_nm, true);
		p.Cnd_rpt_key_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rpt_key_typ, true);
		p.Cnd_rpt_key_typ.setLinkBeans(p.Cnd_rpt_key_typ_nm);
		p.CndPanel.add(p.Cnd_rpt_key_typ_Label);
		p.CndPanel.add(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_typ.setNextBeans(p.Cnd_rpt_key_typ_nm);
		p.Cnd_rpt_key_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_key_typ_META);
		p.CndPanel.add(p.Cnd_rpt_key_typ_nm);
		p.Cnd_rpt_key_typ_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_rpt_key_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.rpt_key_typ_nm_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_unmake_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_unmake_flg);
		p.Cnd_unmake_flg.setNextBeans(p.Cnd_made_flg);
		p.Cnd_unmake_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.unmake_flg_META);
		p.CndPanel.add(p.Cnd_made_flg);
		p.Cnd_made_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0230.CndR.made_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBFP_CostReportListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBFP0240.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBFP0240);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBFP0240);
		p.Btn_open_MGBFP0240.setNextBeans(p.Btn_open_MABGP0420);
		p.Btn_open_MABGP0420.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABGP0420);
		p.Btn_open_MABGP0420.setNextBeans(p.Btn_open_MABGP0400);
		p.Btn_open_MABGP0400.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MABGP0400);
		p.Btn_open_MABGP0400.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBFP_CostReportListReg p) {
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
		MGBFP_CostReportListReg_MC.mcInitScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitTop((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitCnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitCtrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitRslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitBtn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.mcInitEastBtn((MGBFP_CostReportListReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__REF_EastBtn((MGBFP_CostReportListReg)this);

		// [REF]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitREF_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitREF_EastBtn((MGBFP_CostReportListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__UPD_EastBtn((MGBFP_CostReportListReg)this);

		// [UPD]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitUPD_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitUPD_EastBtn((MGBFP_CostReportListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitSRCH__DEL_EastBtn((MGBFP_CostReportListReg)this);

		// [DEL]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitDEL_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitDEL_EastBtn((MGBFP_CostReportListReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBFP_CostReportListReg_MC.statusInitFIX__U_ScreenOpe((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_Top((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_Cnd((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_Ctrl((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_Rslt((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_Btn((MGBFP_CostReportListReg)this);
		MGBFP_CostReportListReg_MC.statusInitFIX__U_EastBtn((MGBFP_CostReportListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBFP_CostReportListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_CostReportListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_CostReportListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_rpt_ptn_cd.setListListener(p);
		p.Cnd_rpt_ptn_cd.addAllListener(p);
		p.Cnd_rpt_ptn_nm.setListListener(p);
		p.Cnd_rpt_ptn_nm.addAllListener(p);
		p.Cnd_rpt_key_cd.setListListener(p);
		p.Cnd_rpt_key_cd.addAllListener(p);
		p.Cnd_rpt_key_nm.setListListener(p);
		p.Cnd_rpt_key_nm.addAllListener(p);
		p.Cnd_rpt_key_typ.setListListener(p);
		p.Cnd_rpt_key_typ.addAllListener(p);
		p.Cnd_rpt_key_typ_nm.setListListener(p);
		p.Cnd_rpt_key_typ_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_unmake_flg.addAllListener(p);
		p.Cnd_made_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_CostReportListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBFP_CostReportListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_made_flg.addAllListener(p);
		p.columnRslt_rpt_ptn_cd.addAllListener(p);
		p.columnRslt_rpt_ptn_cd.setListListener(p);
		p.columnRslt_rpt_ptn_nm.addAllListener(p);
		p.columnRslt_rpt_ptn_nm.setListListener(p);
		p.columnRslt_rpt_key_cd.addAllListener(p);
		p.columnRslt_rpt_key_cd.setListListener(p);
		p.columnRslt_rpt_key_nm.addAllListener(p);
		p.columnRslt_rpt_key_nm.setListListener(p);
		p.columnRslt_rpt_key_typ.addAllListener(p);
		p.columnRslt_rpt_key_typ.setListListener(p);
		p.columnRslt_rpt_key_typ_nm.addAllListener(p);
		p.columnRslt_rpt_key_typ_nm.setListListener(p);
		p.columnRslt_auto_flg.addAllListener(p);
		p.columnRslt_memo1.addAllListener(p);
		p.columnRslt_memo1.setListListener(p);
		p.columnRslt_memo2.addAllListener(p);
		p.columnRslt_memo2.setListListener(p);
		p.columnRslt_memo3.addAllListener(p);
		p.columnRslt_memo3.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBFP_CostReportListReg p) {
		p.Btn_open_MGBFP0240.addAllListener(p);
		p.Btn_open_MGBFP0240.setAPMethodName("doBtn_open_MGBFP0240");
		p.Btn_open_MABGP0420.addAllListener(p);
		p.Btn_open_MABGP0420.setAPMethodName("doBtn_open_MABGP0420");
		p.Btn_open_MABGP0400.addAllListener(p);
		p.Btn_open_MABGP0400.setAPMethodName("doBtn_open_MABGP0400");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBFP_CostReportListReg p) {
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_made_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_made_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_made_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_made_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBFP_CostReportListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBFP_CostReportListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBFP_CostReportListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(FIX_U, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rpt_ptn_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rpt_key_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rpt_key_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rpt_key_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rpt_key_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBFP_CostReportListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBFP_CostReportListReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rpt_key_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBFP_CostReportListReg p){
		p.Btn_open_MGBFP0240.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABGP0420.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABGP0400.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBFP_CostReportListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBFP_CostReportListReg_MC.setTableConfigRslt((MGBFP_CostReportListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBFP_CostReportListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_made_flg.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.made_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_made_flg);
		p.columnRslt_rpt_ptn_cd.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_ptn_cd);
		p.columnRslt_rpt_ptn_nm.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_ptn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_ptn_nm);
		p.columnRslt_rpt_key_cd.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_key_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_key_cd);
		p.columnRslt_rpt_key_nm.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_key_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_key_nm);
		p.columnRslt_rpt_key_typ.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_key_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_key_typ);
		p.columnRslt_rpt_key_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.rpt_key_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_key_typ_nm);
		p.columnRslt_auto_flg.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.auto_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_auto_flg);
		p.columnRslt_memo1.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMGBF.MGBFP0230.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		Cnd_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_ptn_cd.getListConfig().setPutter(getCnd_rpt_ptn_cd_ListPutter());
		Cnd_rpt_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_cd.getListConfig().setPutter(getCnd_rpt_key_cd_ListPutter());
		Cnd_rpt_key_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_typ.getListConfig().setPutter(getCnd_rpt_key_typ_ListPutter());
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Cnd_rpt_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_rpt_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKey");
		return lp;
	}
	 
	/**
	 * [Cnd_rpt_key_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_key_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKeyTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_rpt_ptn_cd) return getCnd_rpt_ptn_cd(row, info);
		if(combo == Cnd_rpt_key_cd) return getCnd_rpt_key_cd(row, info);
		if(combo == Cnd_rpt_key_typ) return getCnd_rpt_key_typ(row, info);
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
		else if (ap == Btn_open_MGBFP0240) doBtn_open_MGBFP0240(info);
		else if (ap == Btn_open_MABGP0420) doBtn_open_MABGP0420(info);
		else if (ap == Btn_open_MABGP0400) doBtn_open_MABGP0400(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBFP0240]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBFP0240(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABGP0420]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0420(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABGP0400]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0400(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_rpt_ptn_cd) return doCnd_rpt_ptn_cd_VC(info);
		if (vc == Cnd_rpt_ptn_nm) return doCnd_rpt_ptn_nm_VC(info);
		if (vc == Cnd_rpt_key_cd) return doCnd_rpt_key_cd_VC(info);
		if (vc == Cnd_rpt_key_nm) return doCnd_rpt_key_nm_VC(info);
		if (vc == Cnd_rpt_key_typ) return doCnd_rpt_key_typ_VC(info);
		if (vc == Cnd_rpt_key_typ_nm) return doCnd_rpt_key_typ_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_unmake_flg) return doCnd_unmake_flg_VC(info);
		if (vc == Cnd_made_flg) return doCnd_made_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_made_flg) return doRslt_made_flg_VC(info);
		if (vc == columnRslt_rpt_ptn_cd) return doRslt_rpt_ptn_cd_VC(info);
		if (vc == columnRslt_rpt_ptn_nm) return doRslt_rpt_ptn_nm_VC(info);
		if (vc == columnRslt_rpt_key_cd) return doRslt_rpt_key_cd_VC(info);
		if (vc == columnRslt_rpt_key_nm) return doRslt_rpt_key_nm_VC(info);
		if (vc == columnRslt_rpt_key_typ) return doRslt_rpt_key_typ_VC(info);
		if (vc == columnRslt_rpt_key_typ_nm) return doRslt_rpt_key_typ_nm_VC(info);
		if (vc == columnRslt_auto_flg) return doRslt_auto_flg_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unmake_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unmake_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[made_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_made_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[made_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_made_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_key_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_key_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[auto_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_auto_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NC(info);
		else if (nc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NC(info);
		else if (nc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NC(info);
		else if (nc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NC(info);
		else if (nc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NC(info);
		else if (nc == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_unmake_flg) doCnd_unmake_flg_NC(info);
		else if (nc == Cnd_made_flg) doCnd_made_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_made_flg) doRslt_made_flg_NC(info);
		else if (nc == columnRslt_rpt_ptn_cd) doRslt_rpt_ptn_cd_NC(info);
		else if (nc == columnRslt_rpt_ptn_nm) doRslt_rpt_ptn_nm_NC(info);
		else if (nc == columnRslt_rpt_key_cd) doRslt_rpt_key_cd_NC(info);
		else if (nc == columnRslt_rpt_key_nm) doRslt_rpt_key_nm_NC(info);
		else if (nc == columnRslt_rpt_key_typ) doRslt_rpt_key_typ_NC(info);
		else if (nc == columnRslt_rpt_key_typ_nm) doRslt_rpt_key_typ_nm_NC(info);
		else if (nc == columnRslt_auto_flg) doRslt_auto_flg_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unmake_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unmake_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[made_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_made_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[made_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_made_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NE(info);
		else if (ne == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NE(info);
		else if (ne == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NE(info);
		else if (ne == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NE(info);
		else if (ne == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NE(info);
		else if (ne == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_unmake_flg) doCnd_unmake_flg_NE(info);
		else if (ne == Cnd_made_flg) doCnd_made_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_made_flg) doRslt_made_flg_NE(info);
		else if (ne == columnRslt_rpt_ptn_cd) doRslt_rpt_ptn_cd_NE(info);
		else if (ne == columnRslt_rpt_ptn_nm) doRslt_rpt_ptn_nm_NE(info);
		else if (ne == columnRslt_rpt_key_cd) doRslt_rpt_key_cd_NE(info);
		else if (ne == columnRslt_rpt_key_nm) doRslt_rpt_key_nm_NE(info);
		else if (ne == columnRslt_rpt_key_typ) doRslt_rpt_key_typ_NE(info);
		else if (ne == columnRslt_rpt_key_typ_nm) doRslt_rpt_key_typ_nm_NE(info);
		else if (ne == columnRslt_auto_flg) doRslt_auto_flg_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unmake_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unmake_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[made_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_made_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[made_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_made_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NX(info);
		else if (nx == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NX(info);
		else if (nx == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NX(info);
		else if (nx == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NX(info);
		else if (nx == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NX(info);
		else if (nx == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_unmake_flg) doCnd_unmake_flg_NX(info);
		else if (nx == Cnd_made_flg) doCnd_made_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_made_flg) doRslt_made_flg_NX(info);
		else if (nx == columnRslt_rpt_ptn_cd) doRslt_rpt_ptn_cd_NX(info);
		else if (nx == columnRslt_rpt_ptn_nm) doRslt_rpt_ptn_nm_NX(info);
		else if (nx == columnRslt_rpt_key_cd) doRslt_rpt_key_cd_NX(info);
		else if (nx == columnRslt_rpt_key_nm) doRslt_rpt_key_nm_NX(info);
		else if (nx == columnRslt_rpt_key_typ) doRslt_rpt_key_typ_NX(info);
		else if (nx == columnRslt_rpt_key_typ_nm) doRslt_rpt_key_typ_nm_NX(info);
		else if (nx == columnRslt_auto_flg) doRslt_auto_flg_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unmake_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unmake_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[made_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_made_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[made_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_made_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_LC(info);
		else if (lc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_LC(info);
		else if (lc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_LC(info);
		else if (lc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_LC(info);
		else if (lc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_LC(info);
		else if (lc == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnRslt_rpt_ptn_cd) doRslt_rpt_ptn_cd_LC(info);
		else if (lc == columnRslt_rpt_ptn_nm) doRslt_rpt_ptn_nm_LC(info);
		else if (lc == columnRslt_rpt_key_cd) doRslt_rpt_key_cd_LC(info);
		else if (lc == columnRslt_rpt_key_nm) doRslt_rpt_key_nm_LC(info);
		else if (lc == columnRslt_rpt_key_typ) doRslt_rpt_key_typ_LC(info);
		else if (lc == columnRslt_rpt_key_typ_nm) doRslt_rpt_key_typ_nm_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_key_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_key_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_key_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKey(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_key_typ]の作成メソッド
	 */
	public MCList getCnd_rpt_key_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0230.Srch01")) {
			return new MG_MGBFL0230_Srch01Bridge();
		}
		if (id.equals("MG.MGBFL0230.Upd01")) {
			return new MG_MGBFL0230_Upd01Bridge();
		}
		if (id.equals("MG.MGBFL0230.Del01")) {
			return new MG_MGBFL0230_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0230_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0230_Srch01Bridge() {
			p_MG_MGBFL0230_Srch01 = new MCParam(PDef.MG_MGBFL0230_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0230_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0230.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));

			p_MG_MGBFL0230_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0230_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0230_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0230_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0230_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0230.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0230.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0230.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0230_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0230_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)p_MG_MGBFL0230_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBFL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0230_Upd01;

		/** コンストラクタ */
		protected MG_MGBFL0230_Upd01Bridge() {
			p_MG_MGBFL0230_Upd01 = new MCParam(PDef.MG_MGBFL0230_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0230_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));
			// Down

			p_MG_MGBFL0230_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0230_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0230_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0230_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0230_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBF.MGBFP0230.RsltR> up0() {
			return (MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBFL0230_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBFL0230_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0230_Del01;

		/** コンストラクタ */
		protected MG_MGBFL0230_Del01Bridge() {
			p_MG_MGBFL0230_Del01 = new MCParam(PDef.MG_MGBFL0230_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0230_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));

			p_MG_MGBFL0230_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0230_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0230_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0230_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0230_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBF.MGBFP0230.RsltR> up0() {
			return (MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0230.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0230_Del01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0230.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0230_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0230.RsltR>)p_MG_MGBFL0230_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}