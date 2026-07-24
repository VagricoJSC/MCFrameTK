package mcframe.clientMGBF.MGBFP0250;

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
import mcframe.clientMGBF.MGBFP0250.MGBFP_CostIoListReg_MC.MG_MGBFL0250_Srch01Caller;
import mcframe.clientMGBF.MGBFP0250.MGBFP_CostIoListReg_MC.MG_MGBFL0250_Upd01Caller;
import mcframe.clientMGBF.MGBFP0250.MGBFP_CostIoListReg_MC.MG_MGBFL0250_Del01Caller;

/**
 * 画面"MGBFP_CostIoListReg"パネルクラスです。<p>
 *
 * 原価個別受払表一覧から、選択した個別受払表の作成及び削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_CostIoListReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0250";

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
	public MCLabel Cnd_cost_io_id_Label = null;
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumberComboBox Cnd_cost_io_id = null;
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public MCTextField Cnd_cost_io_nm = null;
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
	public MCTable2<mcframe.clientMGBF.MGBFP0250.RsltR> RsltTable = null;
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
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_io_id = null;
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_io_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_nm = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm10 = null;
	/**
	 * Production asset 生産資産.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prod_flg = null;
	/**
	 * Sales asset 販売資産.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_flg = null;
	/**
	 * Other company's asset 他社資産.<p>
	 *
	 */
	public MCColumnConfig columnRslt_other_flg = null;
	/**
	 * Internal 社内.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_flg = null;
	/**
	 * External 社外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_out_flg = null;
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
	 * Custom T account 原価個別受払表照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBFP0260 = null;
	/**
	 * Custom T account configuration master entry 原価個別受払表構成マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0360 = null;
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
	
	/** [MG_MGBFL0250_Srch01]のCallerの作成 */
	protected MGBFP_CostIoListReg_MC.MG_MGBFL0250_Srch01Caller createMG_MGBFL0250_Srch01() {
		MGBFP_CostIoListReg_MC.MG_MGBFL0250_Srch01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Srch01Bridge>
		caller = ((MGBFP_CostIoListReg_MC)this).new MG_MGBFL0250_Srch01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Srch01Bridge>(
					(MGBFP_CostIoListReg)this, new MG_MGBFL0250_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0250_Srch01]の呼び出し */
	protected void callMG_MGBFL0250_Srch01() {
		MCCaller caller = createMG_MGBFL0250_Srch01();
		caller.exec();
	}
	/** [MG_MGBFL0250_Upd01]のCallerの作成 */
	protected MGBFP_CostIoListReg_MC.MG_MGBFL0250_Upd01Caller createMG_MGBFL0250_Upd01() {
		MGBFP_CostIoListReg_MC.MG_MGBFL0250_Upd01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Upd01Bridge>
		caller = ((MGBFP_CostIoListReg_MC)this).new MG_MGBFL0250_Upd01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Upd01Bridge>(
					(MGBFP_CostIoListReg)this, new MG_MGBFL0250_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBFL0250_Upd01]の呼び出し */
	protected void callMG_MGBFL0250_Upd01() {
		MCCaller caller = createMG_MGBFL0250_Upd01();
		caller.exec();
	}
	/** [MG_MGBFL0250_Del01]のCallerの作成 */
	protected MGBFP_CostIoListReg_MC.MG_MGBFL0250_Del01Caller createMG_MGBFL0250_Del01() {
		MGBFP_CostIoListReg_MC.MG_MGBFL0250_Del01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Del01Bridge>
		caller = ((MGBFP_CostIoListReg_MC)this).new MG_MGBFL0250_Del01Caller<MGBFP_CostIoListReg, MG_MGBFL0250_Del01Bridge>(
					(MGBFP_CostIoListReg)this, new MG_MGBFL0250_Del01Bridge());
		return caller;
	}
	/** [MG_MGBFL0250_Del01]の呼び出し */
	protected void callMG_MGBFL0250_Del01() {
		MCCaller caller = createMG_MGBFL0250_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0250.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0250.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0250.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0250.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0250.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0250.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0250.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0250.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0250.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class);
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
	public MGBFP_CostIoListReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_CostIoListReg_MC_A(String name) {
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
		MGBFP_CostIoListReg_MC.jbCreateScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateTop((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateCnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateCtrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateRslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateBtn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbCreateEastBtn((MGBFP_CostIoListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBFP_CostIoListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_CostIoListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_CostIoListReg p) {
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
	protected static void jbCreateCtrl(MGBFP_CostIoListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBFP_CostIoListReg p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBF.MGBFP0250.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBFP_CostIoListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBFP_CostIoListReg p) {
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
	
	
	/** [Cnd_cost_io_id_ListPutter]の定義 */
	private MCListPutter Cnd_cost_io_id_p = null;

	/**
	 * [Cnd_cost_io_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_io_id_ListPutter() {
		if (Cnd_cost_io_id_p == null) {
			Cnd_cost_io_id_p = createCnd_cost_io_id_ListPutter(Cnd_cost_io_id, "cost_io_id", "cost_io_nm");

		}
		return Cnd_cost_io_id_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostIoListReg create(){
		MGBFP_CostIoListReg p = new MGBFP_CostIoListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostIoListReg create(String name){
		MGBFP_CostIoListReg p = new MGBFP_CostIoListReg(name);
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
		MGBFP_CostIoListReg_MC.jbfInitScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitTop((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitCnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitCtrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitRslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitBtn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbfInitEastBtn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitTop((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitCnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitCtrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitRslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitBtn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.jbInitEastBtn((MGBFP_CostIoListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_CostIoListReg p) {
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
		p.Cnd_cost_io_id_Label = p.beansFactory.createLabel("Cnd.cost_io_id_Label");
		p.Cnd_cost_io_id = p.beansFactory.createNumberComboBox("Cnd.cost_io_id");
		p.Cnd_cost_io_id.setLabel(p.Cnd_cost_io_id_Label);
		p.Cnd_cost_io_nm = p.beansFactory.createTextField("Cnd.cost_io_nm");
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
	protected static void jbfInitCtrl(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_made_flg = p.beansFactory.createTableColumn("Rslt.made_flg", MCColumnType.CHECK);
		p.columnRslt_cost_io_id = p.beansFactory.createTableColumn("Rslt.cost_io_id", MCColumnType.NUMBER);
		p.columnRslt_cost_io_nm = p.beansFactory.createTableColumn("Rslt.cost_io_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd1 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd1", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm1 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm1", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd2 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd2", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm2 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm2", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd3 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd3", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm3 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm3", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd4 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd4", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm4 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm4", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd5 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd5", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm5 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm5", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd6 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd6", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm6 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm6", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd7 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd7", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm7 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm7", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd8 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd8", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm8 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm8", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd9 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd9", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm9 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm9", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd10 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd10", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm10 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm10", MCColumnType.TEXT);
		p.columnRslt_prod_flg = p.beansFactory.createTableColumn("Rslt.prod_flg", MCColumnType.CHECK);
		p.columnRslt_sls_flg = p.beansFactory.createTableColumn("Rslt.sls_flg", MCColumnType.CHECK);
		p.columnRslt_other_flg = p.beansFactory.createTableColumn("Rslt.other_flg", MCColumnType.CHECK);
		p.columnRslt_in_flg = p.beansFactory.createTableColumn("Rslt.in_flg", MCColumnType.CHECK);
		p.columnRslt_out_flg = p.beansFactory.createTableColumn("Rslt.out_flg", MCColumnType.CHECK);
		p.columnRslt_auto_flg = p.beansFactory.createTableColumn("Rslt.auto_flg", MCColumnType.CHECK);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBFP0260 = p.beansFactory.createButton("Btn.open_MGBFP0260", "open");
		p.Btn_open_MABGP0360 = p.beansFactory.createButton("Btn.open_MABGP0360", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBFP_CostIoListReg p) {
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
	protected static void jbInitTop(MGBFP_CostIoListReg p) {
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
	protected static void jbInitCnd(MGBFP_CostIoListReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_cost_io_id);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.Cnd_cost_io_id.setListType(MCListType.FREE);
		p.Cnd_cost_io_id.setLinkBeans(p.Cnd_cost_io_nm);
		p.CndPanel.add(p.Cnd_cost_io_id_Label);
		p.CndPanel.add(p.Cnd_cost_io_id);
		p.Cnd_cost_io_id.setNextBeans(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_id.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.cost_io_id_META);
		p.CndPanel.add(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_cost_io_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.cost_io_nm_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_unmake_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_unmake_flg);
		p.Cnd_unmake_flg.setNextBeans(p.Cnd_made_flg);
		p.Cnd_unmake_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.unmake_flg_META);
		p.CndPanel.add(p.Cnd_made_flg);
		p.Cnd_made_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0250.CndR.made_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_CostIoListReg p) {
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
	protected static void jbInitRslt(MGBFP_CostIoListReg p) {
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
	protected static void jbInitBtn(MGBFP_CostIoListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBFP0260.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBFP0260);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBFP0260);
		p.Btn_open_MGBFP0260.setNextBeans(p.Btn_open_MABGP0360);
		p.Btn_open_MABGP0360.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABGP0360);
		p.Btn_open_MABGP0360.setNextBeans(p.Btn_select_all);
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
	protected static void jbInitEastBtn(MGBFP_CostIoListReg p) {
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
		MGBFP_CostIoListReg_MC.mcInitScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitTop((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitCnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitCtrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitRslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitBtn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.mcInitEastBtn((MGBFP_CostIoListReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__REF_EastBtn((MGBFP_CostIoListReg)this);

		// [REF]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitREF_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitREF_EastBtn((MGBFP_CostIoListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__UPD_EastBtn((MGBFP_CostIoListReg)this);

		// [UPD]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitUPD_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitUPD_EastBtn((MGBFP_CostIoListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitSRCH__DEL_EastBtn((MGBFP_CostIoListReg)this);

		// [DEL]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitDEL_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitDEL_EastBtn((MGBFP_CostIoListReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBFP_CostIoListReg_MC.statusInitFIX__U_ScreenOpe((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_Top((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_Cnd((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_Ctrl((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_Rslt((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_Btn((MGBFP_CostIoListReg)this);
		MGBFP_CostIoListReg_MC.statusInitFIX__U_EastBtn((MGBFP_CostIoListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBFP_CostIoListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_CostIoListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_CostIoListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cost_io_id.setListListener(p);
		p.Cnd_cost_io_id.addAllListener(p);
		p.Cnd_cost_io_nm.setListListener(p);
		p.Cnd_cost_io_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MGBFP_CostIoListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBFP_CostIoListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_made_flg.addAllListener(p);
		p.columnRslt_cost_io_id.addAllListener(p);
		p.columnRslt_cost_io_id.setListListener(p);
		p.columnRslt_cost_io_nm.addAllListener(p);
		p.columnRslt_cost_io_nm.setListListener(p);
		p.columnRslt_itm_jnl_cd.addAllListener(p);
		p.columnRslt_itm_jnl_cd.setListListener(p);
		p.columnRslt_itm_jnl_nm.addAllListener(p);
		p.columnRslt_itm_jnl_nm.setListListener(p);
		p.columnRslt_itm_grp_cd1.addAllListener(p);
		p.columnRslt_itm_grp_cd1.setListListener(p);
		p.columnRslt_itm_grp_nm1.addAllListener(p);
		p.columnRslt_itm_grp_nm1.setListListener(p);
		p.columnRslt_itm_grp_cd2.addAllListener(p);
		p.columnRslt_itm_grp_cd2.setListListener(p);
		p.columnRslt_itm_grp_nm2.addAllListener(p);
		p.columnRslt_itm_grp_nm2.setListListener(p);
		p.columnRslt_itm_grp_cd3.addAllListener(p);
		p.columnRslt_itm_grp_cd3.setListListener(p);
		p.columnRslt_itm_grp_nm3.addAllListener(p);
		p.columnRslt_itm_grp_nm3.setListListener(p);
		p.columnRslt_itm_grp_cd4.addAllListener(p);
		p.columnRslt_itm_grp_cd4.setListListener(p);
		p.columnRslt_itm_grp_nm4.addAllListener(p);
		p.columnRslt_itm_grp_nm4.setListListener(p);
		p.columnRslt_itm_grp_cd5.addAllListener(p);
		p.columnRslt_itm_grp_cd5.setListListener(p);
		p.columnRslt_itm_grp_nm5.addAllListener(p);
		p.columnRslt_itm_grp_nm5.setListListener(p);
		p.columnRslt_itm_grp_cd6.addAllListener(p);
		p.columnRslt_itm_grp_cd6.setListListener(p);
		p.columnRslt_itm_grp_nm6.addAllListener(p);
		p.columnRslt_itm_grp_nm6.setListListener(p);
		p.columnRslt_itm_grp_cd7.addAllListener(p);
		p.columnRslt_itm_grp_cd7.setListListener(p);
		p.columnRslt_itm_grp_nm7.addAllListener(p);
		p.columnRslt_itm_grp_nm7.setListListener(p);
		p.columnRslt_itm_grp_cd8.addAllListener(p);
		p.columnRslt_itm_grp_cd8.setListListener(p);
		p.columnRslt_itm_grp_nm8.addAllListener(p);
		p.columnRslt_itm_grp_nm8.setListListener(p);
		p.columnRslt_itm_grp_cd9.addAllListener(p);
		p.columnRslt_itm_grp_cd9.setListListener(p);
		p.columnRslt_itm_grp_nm9.addAllListener(p);
		p.columnRslt_itm_grp_nm9.setListListener(p);
		p.columnRslt_itm_grp_cd10.addAllListener(p);
		p.columnRslt_itm_grp_cd10.setListListener(p);
		p.columnRslt_itm_grp_nm10.addAllListener(p);
		p.columnRslt_itm_grp_nm10.setListListener(p);
		p.columnRslt_prod_flg.addAllListener(p);
		p.columnRslt_sls_flg.addAllListener(p);
		p.columnRslt_other_flg.addAllListener(p);
		p.columnRslt_in_flg.addAllListener(p);
		p.columnRslt_out_flg.addAllListener(p);
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
	protected static void mcInitBtn(MGBFP_CostIoListReg p) {
		p.Btn_open_MGBFP0260.addAllListener(p);
		p.Btn_open_MGBFP0260.setAPMethodName("doBtn_open_MGBFP0260");
		p.Btn_open_MABGP0360.addAllListener(p);
		p.Btn_open_MABGP0360.setAPMethodName("doBtn_open_MABGP0360");
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
	protected static void mcInitEastBtn(MGBFP_CostIoListReg p) {
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_made_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_made_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_made_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_made_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBFP_CostIoListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBFP_CostIoListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBFP_CostIoListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBFP_CostIoListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(FIX_U, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_cost_io_id.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cost_io_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_unmake_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_made_flg.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBFP_CostIoListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBFP_CostIoListReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_made_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cost_io_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cost_io_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prod_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sls_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_other_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_in_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_auto_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBFP_CostIoListReg p){
		p.Btn_open_MGBFP0260.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABGP0360.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBFP_CostIoListReg p){

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
		MGBFP_CostIoListReg_MC.setTableConfigRslt((MGBFP_CostIoListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBFP_CostIoListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_made_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.made_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_made_flg);
		p.columnRslt_cost_io_id.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.cost_io_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_io_id);
		p.columnRslt_cost_io_nm.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.cost_io_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_io_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_itm_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd1);
		p.columnRslt_itm_grp_nm1.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm1);
		p.columnRslt_itm_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd2);
		p.columnRslt_itm_grp_nm2.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm2);
		p.columnRslt_itm_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd3);
		p.columnRslt_itm_grp_nm3.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm3);
		p.columnRslt_itm_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd4);
		p.columnRslt_itm_grp_nm4.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm4);
		p.columnRslt_itm_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd5);
		p.columnRslt_itm_grp_nm5.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm5);
		p.columnRslt_itm_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd6);
		p.columnRslt_itm_grp_nm6.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm6);
		p.columnRslt_itm_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd7);
		p.columnRslt_itm_grp_nm7.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm7);
		p.columnRslt_itm_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd8);
		p.columnRslt_itm_grp_nm8.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm8);
		p.columnRslt_itm_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd9);
		p.columnRslt_itm_grp_nm9.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm9);
		p.columnRslt_itm_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_cd10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd10);
		p.columnRslt_itm_grp_nm10.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.itm_grp_nm10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm10);
		p.columnRslt_prod_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.prod_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prod_flg);
		p.columnRslt_sls_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.sls_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_flg);
		p.columnRslt_other_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.other_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_other_flg);
		p.columnRslt_in_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.in_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_flg);
		p.columnRslt_out_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.out_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_out_flg);
		p.columnRslt_auto_flg.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.auto_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_auto_flg);
		p.columnRslt_memo1.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMGBF.MGBFP0250.RsltR.memo3_META);
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
		Cnd_cost_io_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_io_id.getListConfig().setPutter(getCnd_cost_io_id_ListPutter());
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
	 * [Cnd_cost_io_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_io_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostIoInCalcCostIo");
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
		if(combo == Cnd_cost_io_id) return getCnd_cost_io_id(row, info);
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
		else if (ap == Btn_open_MGBFP0260) doBtn_open_MGBFP0260(info);
		else if (ap == Btn_open_MABGP0360) doBtn_open_MABGP0360(info);
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
	 * [Btn]パネルの[open_MGBFP0260]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBFP0260(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABGP0360]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0360(MCEventInfo info);

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
		if (vc == Cnd_cost_io_id) return doCnd_cost_io_id_VC(info);
		if (vc == Cnd_cost_io_nm) return doCnd_cost_io_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_unmake_flg) return doCnd_unmake_flg_VC(info);
		if (vc == Cnd_made_flg) return doCnd_made_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_made_flg) return doRslt_made_flg_VC(info);
		if (vc == columnRslt_cost_io_id) return doRslt_cost_io_id_VC(info);
		if (vc == columnRslt_cost_io_nm) return doRslt_cost_io_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_itm_grp_cd1) return doRslt_itm_grp_cd1_VC(info);
		if (vc == columnRslt_itm_grp_nm1) return doRslt_itm_grp_nm1_VC(info);
		if (vc == columnRslt_itm_grp_cd2) return doRslt_itm_grp_cd2_VC(info);
		if (vc == columnRslt_itm_grp_nm2) return doRslt_itm_grp_nm2_VC(info);
		if (vc == columnRslt_itm_grp_cd3) return doRslt_itm_grp_cd3_VC(info);
		if (vc == columnRslt_itm_grp_nm3) return doRslt_itm_grp_nm3_VC(info);
		if (vc == columnRslt_itm_grp_cd4) return doRslt_itm_grp_cd4_VC(info);
		if (vc == columnRslt_itm_grp_nm4) return doRslt_itm_grp_nm4_VC(info);
		if (vc == columnRslt_itm_grp_cd5) return doRslt_itm_grp_cd5_VC(info);
		if (vc == columnRslt_itm_grp_nm5) return doRslt_itm_grp_nm5_VC(info);
		if (vc == columnRslt_itm_grp_cd6) return doRslt_itm_grp_cd6_VC(info);
		if (vc == columnRslt_itm_grp_nm6) return doRslt_itm_grp_nm6_VC(info);
		if (vc == columnRslt_itm_grp_cd7) return doRslt_itm_grp_cd7_VC(info);
		if (vc == columnRslt_itm_grp_nm7) return doRslt_itm_grp_nm7_VC(info);
		if (vc == columnRslt_itm_grp_cd8) return doRslt_itm_grp_cd8_VC(info);
		if (vc == columnRslt_itm_grp_nm8) return doRslt_itm_grp_nm8_VC(info);
		if (vc == columnRslt_itm_grp_cd9) return doRslt_itm_grp_cd9_VC(info);
		if (vc == columnRslt_itm_grp_nm9) return doRslt_itm_grp_nm9_VC(info);
		if (vc == columnRslt_itm_grp_cd10) return doRslt_itm_grp_cd10_VC(info);
		if (vc == columnRslt_itm_grp_nm10) return doRslt_itm_grp_nm10_VC(info);
		if (vc == columnRslt_prod_flg) return doRslt_prod_flg_VC(info);
		if (vc == columnRslt_sls_flg) return doRslt_sls_flg_VC(info);
		if (vc == columnRslt_other_flg) return doRslt_other_flg_VC(info);
		if (vc == columnRslt_in_flg) return doRslt_in_flg_VC(info);
		if (vc == columnRslt_out_flg) return doRslt_out_flg_VC(info);
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
	 * [Cnd]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_io_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_io_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[other_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_other_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_out_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_cost_io_id) doCnd_cost_io_id_NC(info);
		else if (nc == Cnd_cost_io_nm) doCnd_cost_io_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_unmake_flg) doCnd_unmake_flg_NC(info);
		else if (nc == Cnd_made_flg) doCnd_made_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_made_flg) doRslt_made_flg_NC(info);
		else if (nc == columnRslt_cost_io_id) doRslt_cost_io_id_NC(info);
		else if (nc == columnRslt_cost_io_nm) doRslt_cost_io_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NC(info);
		else if (nc == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NC(info);
		else if (nc == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NC(info);
		else if (nc == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NC(info);
		else if (nc == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NC(info);
		else if (nc == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NC(info);
		else if (nc == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NC(info);
		else if (nc == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NC(info);
		else if (nc == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NC(info);
		else if (nc == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NC(info);
		else if (nc == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NC(info);
		else if (nc == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NC(info);
		else if (nc == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NC(info);
		else if (nc == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NC(info);
		else if (nc == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NC(info);
		else if (nc == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NC(info);
		else if (nc == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NC(info);
		else if (nc == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NC(info);
		else if (nc == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NC(info);
		else if (nc == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NC(info);
		else if (nc == columnRslt_prod_flg) doRslt_prod_flg_NC(info);
		else if (nc == columnRslt_sls_flg) doRslt_sls_flg_NC(info);
		else if (nc == columnRslt_other_flg) doRslt_other_flg_NC(info);
		else if (nc == columnRslt_in_flg) doRslt_in_flg_NC(info);
		else if (nc == columnRslt_out_flg) doRslt_out_flg_NC(info);
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
	 * [Cnd]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_io_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_out_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_cost_io_id) doCnd_cost_io_id_NE(info);
		else if (ne == Cnd_cost_io_nm) doCnd_cost_io_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_unmake_flg) doCnd_unmake_flg_NE(info);
		else if (ne == Cnd_made_flg) doCnd_made_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_made_flg) doRslt_made_flg_NE(info);
		else if (ne == columnRslt_cost_io_id) doRslt_cost_io_id_NE(info);
		else if (ne == columnRslt_cost_io_nm) doRslt_cost_io_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NE(info);
		else if (ne == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NE(info);
		else if (ne == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NE(info);
		else if (ne == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NE(info);
		else if (ne == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NE(info);
		else if (ne == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NE(info);
		else if (ne == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NE(info);
		else if (ne == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NE(info);
		else if (ne == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NE(info);
		else if (ne == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NE(info);
		else if (ne == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NE(info);
		else if (ne == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NE(info);
		else if (ne == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NE(info);
		else if (ne == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NE(info);
		else if (ne == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NE(info);
		else if (ne == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NE(info);
		else if (ne == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NE(info);
		else if (ne == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NE(info);
		else if (ne == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NE(info);
		else if (ne == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NE(info);
		else if (ne == columnRslt_prod_flg) doRslt_prod_flg_NE(info);
		else if (ne == columnRslt_sls_flg) doRslt_sls_flg_NE(info);
		else if (ne == columnRslt_other_flg) doRslt_other_flg_NE(info);
		else if (ne == columnRslt_in_flg) doRslt_in_flg_NE(info);
		else if (ne == columnRslt_out_flg) doRslt_out_flg_NE(info);
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
	 * [Cnd]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_io_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_out_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_cost_io_id) doCnd_cost_io_id_NX(info);
		else if (nx == Cnd_cost_io_nm) doCnd_cost_io_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_unmake_flg) doCnd_unmake_flg_NX(info);
		else if (nx == Cnd_made_flg) doCnd_made_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_made_flg) doRslt_made_flg_NX(info);
		else if (nx == columnRslt_cost_io_id) doRslt_cost_io_id_NX(info);
		else if (nx == columnRslt_cost_io_nm) doRslt_cost_io_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NX(info);
		else if (nx == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NX(info);
		else if (nx == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NX(info);
		else if (nx == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NX(info);
		else if (nx == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NX(info);
		else if (nx == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NX(info);
		else if (nx == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NX(info);
		else if (nx == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NX(info);
		else if (nx == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NX(info);
		else if (nx == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NX(info);
		else if (nx == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NX(info);
		else if (nx == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NX(info);
		else if (nx == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NX(info);
		else if (nx == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NX(info);
		else if (nx == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NX(info);
		else if (nx == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NX(info);
		else if (nx == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NX(info);
		else if (nx == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NX(info);
		else if (nx == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NX(info);
		else if (nx == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NX(info);
		else if (nx == columnRslt_prod_flg) doRslt_prod_flg_NX(info);
		else if (nx == columnRslt_sls_flg) doRslt_sls_flg_NX(info);
		else if (nx == columnRslt_other_flg) doRslt_other_flg_NX(info);
		else if (nx == columnRslt_in_flg) doRslt_in_flg_NX(info);
		else if (nx == columnRslt_out_flg) doRslt_out_flg_NX(info);
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
	 * [Cnd]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_io_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[other_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_other_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_out_flg_NX(MCEventInfo info){
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
		else if (lc == Cnd_cost_io_id) doCnd_cost_io_id_LC(info);
		else if (lc == Cnd_cost_io_nm) doCnd_cost_io_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnRslt_cost_io_id) doRslt_cost_io_id_LC(info);
		else if (lc == columnRslt_cost_io_nm) doRslt_cost_io_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_LC(info);
		else if (lc == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_LC(info);
		else if (lc == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_LC(info);
		else if (lc == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_LC(info);
		else if (lc == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_LC(info);
		else if (lc == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_LC(info);
		else if (lc == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_LC(info);
		else if (lc == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_LC(info);
		else if (lc == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_LC(info);
		else if (lc == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_LC(info);
		else if (lc == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_LC(info);
		else if (lc == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_LC(info);
		else if (lc == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_LC(info);
		else if (lc == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_LC(info);
		else if (lc == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_LC(info);
		else if (lc == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_LC(info);
		else if (lc == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_LC(info);
		else if (lc == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_LC(info);
		else if (lc == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_LC(info);
		else if (lc == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_LC(info);
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
	 * [Cnd]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_io_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_io_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cost_io_id]の作成メソッド
	 */
	public MCList getCnd_cost_io_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostIoInCalcCostIo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0250.Srch01")) {
			return new MG_MGBFL0250_Srch01Bridge();
		}
		if (id.equals("MG.MGBFL0250.Upd01")) {
			return new MG_MGBFL0250_Upd01Bridge();
		}
		if (id.equals("MG.MGBFL0250.Del01")) {
			return new MG_MGBFL0250_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0250_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0250_Srch01Bridge() {
			p_MG_MGBFL0250_Srch01 = new MCParam(PDef.MG_MGBFL0250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));

			p_MG_MGBFL0250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0250.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0250.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0250_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)p_MG_MGBFL0250_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBFL0250_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0250_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0250_Upd01;

		/** コンストラクタ */
		protected MG_MGBFL0250_Upd01Bridge() {
			p_MG_MGBFL0250_Upd01 = new MCParam(PDef.MG_MGBFL0250_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0250_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));
			// Down

			p_MG_MGBFL0250_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0250_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0250_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0250_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0250_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBF.MGBFP0250.RsltR> up0() {
			return (MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBFL0250_Upd01;
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
	 * [MG_MGBFL0250_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0250_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0250_Del01;

		/** コンストラクタ */
		protected MG_MGBFL0250_Del01Bridge() {
			p_MG_MGBFL0250_Del01 = new MCParam(PDef.MG_MGBFL0250_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0250_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));

			p_MG_MGBFL0250_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0250_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0250_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0250_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0250_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBF.MGBFP0250.RsltR> up0() {
			return (MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0250.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0250_Del01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0250.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0250_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0250.RsltR>)p_MG_MGBFL0250_Del01.getContainerParam().getDownBlock(0));
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