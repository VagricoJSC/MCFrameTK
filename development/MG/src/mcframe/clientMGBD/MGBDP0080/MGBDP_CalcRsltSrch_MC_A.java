package mcframe.clientMGBD.MGBDP0080;

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
import mcframe.clientMGBD.MGBDP0080.MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Srch01Caller;
import mcframe.clientMGBD.MGBDP0080.MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Del01Caller;

/**
 * 画面"MGBDP_CalcRsltSrch"パネルクラスです。<p>
 *
 * 原価計算結果を参照、一括で削除する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CalcRsltSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0080";

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
	 * REF,View,REF;DEL,Delete,DEL REF,参照する,REF;DEL,削除する,DEL.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_fr_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_fr_p.term]を[Cnd_term_fr]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym_fr;	// [Cnd]の[term_fr_p.term_end_ym]を[Cnd_term_end_ym_fr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_to_p_PPanel;
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_to_p.term]を[Cnd_term_to]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym_to;	// [Cnd]の[term_to_p.term_end_ym]を[Cnd_term_end_ym_to]としてエイリアス定義。
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
	public MCLabel Cnd_ins_srv_req_no_Label = null;
	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ins_srv_req_no = null;
	public MCLabel Cnd_calc_usr_cd_Label = null;
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_calc_usr_cd = null;
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public MCTextField Cnd_calc_usr_nm = null;
	public MCLabel Cnd_st_ym_fr_Label = null;
	/**
	 * Calculation first month FROM 計算対象先頭月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Cnd_st_ym_fr = null;
	public MCLabel Cnd_st_ym_to_Label = null;
	/**
	 * Calculation first month TO 計算対象先頭月ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Cnd_st_ym_to = null;
	public MCLabel Cnd_end_ym_fr_Label = null;
	/**
	 * Calculation last month FROM 計算対象末尾月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Cnd_end_ym_fr = null;
	public MCLabel Cnd_end_ym_to_Label = null;
	/**
	 * Calculation last month TO 計算対象末尾月ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Cnd_end_ym_to = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_true_flg = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_false_flg = null;
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public MCCheckBox Cnd_non_del_true_flg = null;
	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public MCCheckBox Cnd_non_del_false_flg = null;
	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_err_true_flg = null;
	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_err_false_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0080.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Dtl_term_p_PPanel;
	public MCColumnConfig columnDtl_term;// [Dtl]の[term_p.term]を[columnDtl_term]としてエイリアス定義。
	public MCColumnConfig columnDtl_term_nm;// [Dtl]の[term_p.term_nm]を[columnDtl_term_nm]としてエイリアス定義。
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_grp_nm = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_no = null;
	/**
	 * Error エラー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_err_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_flg = null;
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_del_flg = null;
	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_ym = null;
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_end_ym = null;
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_cd = null;
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_nm = null;
	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_st = null;
	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_fin = null;
	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_time = null;
	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_srv_req_no = null;
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_batch_log_no = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost calculation results 原価計算結果確認.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0030 = null;
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, DEL, FIX_D};
	
	/** [MG_MGBDL0080_Srch01]のCallerの作成 */
	protected MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Srch01Caller createMG_MGBDL0080_Srch01() {
		MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Srch01Caller<MGBDP_CalcRsltSrch, MG_MGBDL0080_Srch01Bridge>
		caller = ((MGBDP_CalcRsltSrch_MC)this).new MG_MGBDL0080_Srch01Caller<MGBDP_CalcRsltSrch, MG_MGBDL0080_Srch01Bridge>(
					(MGBDP_CalcRsltSrch)this, new MG_MGBDL0080_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0080_Srch01]の呼び出し */
	protected void callMG_MGBDL0080_Srch01() {
		MCCaller caller = createMG_MGBDL0080_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0080_Del01]のCallerの作成 */
	protected MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Del01Caller createMG_MGBDL0080_Del01() {
		MGBDP_CalcRsltSrch_MC.MG_MGBDL0080_Del01Caller<MGBDP_CalcRsltSrch, MG_MGBDL0080_Del01Bridge>
		caller = ((MGBDP_CalcRsltSrch_MC)this).new MG_MGBDL0080_Del01Caller<MGBDP_CalcRsltSrch, MG_MGBDL0080_Del01Bridge>(
					(MGBDP_CalcRsltSrch)this, new MG_MGBDL0080_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0080_Del01]の呼び出し */
	protected void callMG_MGBDL0080_Del01() {
		MCCaller caller = createMG_MGBDL0080_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0080.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0080.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0080.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0080.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0080.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0080.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0080.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0080.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0080.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0080.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcRsltSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CalcRsltSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CalcRsltSrch_MC.jbCreateScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateTop((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateCnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateCtrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateDtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateBtn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbCreateEastBtn((MGBDP_CalcRsltSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CalcRsltSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_CalcRsltSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CalcRsltSrch p) {
		p.Cnd_term_fr_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_fr_p());
		p.Cnd_term_fr_p_PPanel.setName("Cnd.term_fr_p");
		p.Cnd_term_fr = p.Cnd_term_fr_p_PPanel.Term_term;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_end_ym_fr = p.Cnd_term_fr_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym_fr.addAliasName("Cnd.term_end_ym_fr", p);
		p.Cnd_term_to_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_to_p());
		p.Cnd_term_to_p_PPanel.setName("Cnd.term_to_p");
		p.Cnd_term_to = p.Cnd_term_to_p_PPanel.Term_term;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
		p.Cnd_term_end_ym_to = p.Cnd_term_to_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym_to.addAliasName("Cnd.term_end_ym_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_CalcRsltSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_CalcRsltSrch p) {
		p.Dtl_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0080.DtlR.$term_p);
		p.Dtl_term_p_PPanel.setName("Dtl.term_p");
		p.columnDtl_term = p.Dtl_term_p_PPanel.columnTerm_term;
		p.columnDtl_term.addAliasName("Dtl.term", p);
		p.columnDtl_term_nm = p.Dtl_term_p_PPanel.columnTerm_term_nm;
		p.columnDtl_term_nm.addAliasName("Dtl.term_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CalcRsltSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_CalcRsltSrch p) {
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
	
	
	/** [Cnd_calc_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_usr_cd_p = null;

	/**
	 * [Cnd_calc_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_usr_cd_ListPutter() {
		if (Cnd_calc_usr_cd_p == null) {
			Cnd_calc_usr_cd_p = createCnd_calc_usr_cd_ListPutter(Cnd_calc_usr_cd, "calc_usr_cd", "calc_usr_nm");

		}
		return Cnd_calc_usr_cd_p;
	}
	
	
	/** [Cnd_st_ym_fr_ListPutter]の定義 */
	private MCListPutter Cnd_st_ym_fr_p = null;

	/**
	 * [Cnd_st_ym_fr_ListPutter]の取得
	 */
	protected MCListPutter getCnd_st_ym_fr_ListPutter() {
		if (Cnd_st_ym_fr_p == null) {
			Cnd_st_ym_fr_p = createCnd_st_ym_fr_ListPutter(Cnd_st_ym_fr, "st_ym_fr");

		}
		return Cnd_st_ym_fr_p;
	}
	
	
	/** [Cnd_st_ym_to_ListPutter]の定義 */
	private MCListPutter Cnd_st_ym_to_p = null;

	/**
	 * [Cnd_st_ym_to_ListPutter]の取得
	 */
	protected MCListPutter getCnd_st_ym_to_ListPutter() {
		if (Cnd_st_ym_to_p == null) {
			Cnd_st_ym_to_p = createCnd_st_ym_to_ListPutter(Cnd_st_ym_to, "st_ym_to");

		}
		return Cnd_st_ym_to_p;
	}
	
	
	/** [Cnd_end_ym_fr_ListPutter]の定義 */
	private MCListPutter Cnd_end_ym_fr_p = null;

	/**
	 * [Cnd_end_ym_fr_ListPutter]の取得
	 */
	protected MCListPutter getCnd_end_ym_fr_ListPutter() {
		if (Cnd_end_ym_fr_p == null) {
			Cnd_end_ym_fr_p = createCnd_end_ym_fr_ListPutter(Cnd_end_ym_fr, "end_ym_fr");

		}
		return Cnd_end_ym_fr_p;
	}
	
	
	/** [Cnd_end_ym_to_ListPutter]の定義 */
	private MCListPutter Cnd_end_ym_to_p = null;

	/**
	 * [Cnd_end_ym_to_ListPutter]の取得
	 */
	protected MCListPutter getCnd_end_ym_to_ListPutter() {
		if (Cnd_end_ym_to_p == null) {
			Cnd_end_ym_to_p = createCnd_end_ym_to_ListPutter(Cnd_end_ym_to, "end_ym_to");

		}
		return Cnd_end_ym_to_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CalcRsltSrch create(){
		MGBDP_CalcRsltSrch p = new MGBDP_CalcRsltSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CalcRsltSrch create(String name){
		MGBDP_CalcRsltSrch p = new MGBDP_CalcRsltSrch(name);
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
		MGBDP_CalcRsltSrch_MC.jbfInitScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitTop((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitCnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitCtrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitDtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitBtn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbfInitEastBtn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitTop((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitCnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitCtrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitDtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitBtn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.jbInitEastBtn((MGBDP_CalcRsltSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_ins_srv_req_no_Label = p.beansFactory.createLabel("Cnd.ins_srv_req_no_Label");
		p.Cnd_ins_srv_req_no = p.beansFactory.createTextField("Cnd.ins_srv_req_no");
		p.Cnd_ins_srv_req_no.setLabel(p.Cnd_ins_srv_req_no_Label);
		p.Cnd_calc_usr_cd_Label = p.beansFactory.createLabel("Cnd.calc_usr_cd_Label");
		p.Cnd_calc_usr_cd = p.beansFactory.createTextField("Cnd.calc_usr_cd");
		p.Cnd_calc_usr_cd.setLabel(p.Cnd_calc_usr_cd_Label);
		p.Cnd_calc_usr_nm = p.beansFactory.createTextField("Cnd.calc_usr_nm");
		p.Cnd_st_ym_fr_Label = p.beansFactory.createLabel("Cnd.st_ym_fr_Label");
		p.Cnd_st_ym_fr = p.beansFactory.createDateComboBox("Cnd.st_ym_fr");
		p.Cnd_st_ym_fr.setLabel(p.Cnd_st_ym_fr_Label);
		p.Cnd_st_ym_to_Label = p.beansFactory.createLabel("Cnd.st_ym_to_Label");
		p.Cnd_st_ym_to = p.beansFactory.createDateComboBox("Cnd.st_ym_to");
		p.Cnd_st_ym_to.setLabel(p.Cnd_st_ym_to_Label);
		p.Cnd_end_ym_fr_Label = p.beansFactory.createLabel("Cnd.end_ym_fr_Label");
		p.Cnd_end_ym_fr = p.beansFactory.createDateComboBox("Cnd.end_ym_fr");
		p.Cnd_end_ym_fr.setLabel(p.Cnd_end_ym_fr_Label);
		p.Cnd_end_ym_to_Label = p.beansFactory.createLabel("Cnd.end_ym_to_Label");
		p.Cnd_end_ym_to = p.beansFactory.createDateComboBox("Cnd.end_ym_to");
		p.Cnd_end_ym_to.setLabel(p.Cnd_end_ym_to_Label);
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_fix_true_flg = p.beansFactory.createCheckBox("Cnd.fix_true_flg");
		p.Cnd_fix_false_flg = p.beansFactory.createCheckBox("Cnd.fix_false_flg");
		p.Cnd_non_del_true_flg = p.beansFactory.createCheckBox("Cnd.non_del_true_flg");
		p.Cnd_non_del_false_flg = p.beansFactory.createCheckBox("Cnd.non_del_false_flg");
		p.Cnd_calc_err_true_flg = p.beansFactory.createCheckBox("Cnd.calc_err_true_flg");
		p.Cnd_calc_err_false_flg = p.beansFactory.createCheckBox("Cnd.calc_err_false_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_calc_grp_cd = p.beansFactory.createTableColumn("Dtl.calc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_calc_grp_nm = p.beansFactory.createTableColumn("Dtl.calc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_calc_no = p.beansFactory.createTableColumn("Dtl.calc_no", MCColumnType.TEXT);
		p.columnDtl_calc_err_flg = p.beansFactory.createTableColumn("Dtl.calc_err_flg", MCColumnType.CHECK);
		p.columnDtl_fix_flg = p.beansFactory.createTableColumn("Dtl.fix_flg", MCColumnType.CHECK);
		p.columnDtl_non_del_flg = p.beansFactory.createTableColumn("Dtl.non_del_flg", MCColumnType.CHECK);
		p.columnDtl_st_ym = p.beansFactory.createTableColumn("Dtl.st_ym", MCColumnType.DATE);
		p.columnDtl_end_ym = p.beansFactory.createTableColumn("Dtl.end_ym", MCColumnType.DATE);
		p.columnDtl_calc_usr_cd = p.beansFactory.createTableColumn("Dtl.calc_usr_cd", MCColumnType.TEXT);
		p.columnDtl_calc_usr_nm = p.beansFactory.createTableColumn("Dtl.calc_usr_nm", MCColumnType.TEXT);
		p.columnDtl_calc_st = p.beansFactory.createTableColumn("Dtl.calc_st", MCColumnType.DATE);
		p.columnDtl_calc_fin = p.beansFactory.createTableColumn("Dtl.calc_fin", MCColumnType.DATE);
		p.columnDtl_calc_time = p.beansFactory.createTableColumn("Dtl.calc_time", MCColumnType.TEXT);
		p.columnDtl_ins_srv_req_no = p.beansFactory.createTableColumn("Dtl.ins_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_batch_log_no = p.beansFactory.createTableColumn("Dtl.batch_log_no", MCColumnType.TEXT);
		p.columnDtl_rmrks = p.beansFactory.createTableColumn("Dtl.rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0030 = p.beansFactory.createButton("Btn.open_MGBDP0030", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
	protected static void jbInitCnd(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.ope_META);
		p.CndPanel.add(p.Cnd_term_fr_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_fr_p_PPanel);
		p.Cnd_term_fr_p_PPanel.setNextBeans(p.Cnd_term_to_p_PPanel);
		p.Cnd_term_fr_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_term_to_p_PPanel);
		p.Cnd_term_to_p_PPanel.setNextBeans(p.Cnd_calc_grp_cd);
		p.Cnd_term_to_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ins_srv_req_no);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_grp_nm, true);
		p.CndPanel.add(p.Cnd_ins_srv_req_no_Label);
		p.CndPanel.add(p.Cnd_ins_srv_req_no);
		p.Cnd_ins_srv_req_no.setNextBeans(p.Cnd_calc_usr_cd);
		p.Cnd_ins_srv_req_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.ins_srv_req_no_META);
		p.CndPanel.add(p.Cnd_calc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_calc_usr_cd);
		p.Cnd_calc_usr_cd.setNextBeans(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_usr_cd_META);
		p.Cnd_calc_usr_cd.addLinkBeans(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_usr_cd, true);
		p.CndPanel.add(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_nm.setNextBeans(p.Cnd_st_ym_fr);
		p.Cnd_calc_usr_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_usr_nm, true);
		p.Cnd_st_ym_fr.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_st_ym_fr_Label);
		p.CndPanel.add(p.Cnd_st_ym_fr);
		p.Cnd_st_ym_fr.setNextBeans(p.Cnd_st_ym_to);
		p.Cnd_st_ym_fr.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.st_ym_fr_META);
		p.Cnd_st_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_st_ym_to.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_st_ym_to_Label);
		p.CndPanel.add(p.Cnd_st_ym_to);
		p.Cnd_st_ym_to.setNextBeans(p.Cnd_end_ym_fr);
		p.Cnd_st_ym_to.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.st_ym_to_META);
		p.Cnd_st_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_end_ym_fr.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_end_ym_fr_Label);
		p.CndPanel.add(p.Cnd_end_ym_fr);
		p.Cnd_end_ym_fr.setNextBeans(p.Cnd_end_ym_to);
		p.Cnd_end_ym_fr.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.end_ym_fr_META);
		p.Cnd_end_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_end_ym_to.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_end_ym_to_Label);
		p.CndPanel.add(p.Cnd_end_ym_to);
		p.Cnd_end_ym_to.setNextBeans(p.Cnd_rmrks);
		p.Cnd_end_ym_to.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.end_ym_to_META);
		p.Cnd_end_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_fix_true_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_fix_true_flg);
		p.Cnd_fix_true_flg.setNextBeans(p.Cnd_fix_false_flg);
		p.Cnd_fix_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.fix_true_flg_META);
		p.CndPanel.add(p.Cnd_fix_false_flg);
		p.Cnd_fix_false_flg.setNextBeans(p.Cnd_non_del_true_flg);
		p.Cnd_fix_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.fix_false_flg_META);
		p.CndPanel.add(p.Cnd_non_del_true_flg);
		p.Cnd_non_del_true_flg.setNextBeans(p.Cnd_non_del_false_flg);
		p.Cnd_non_del_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.non_del_true_flg_META);
		p.CndPanel.add(p.Cnd_non_del_false_flg);
		p.Cnd_non_del_false_flg.setNextBeans(p.Cnd_calc_err_true_flg);
		p.Cnd_non_del_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.non_del_false_flg_META);
		p.CndPanel.add(p.Cnd_calc_err_true_flg);
		p.Cnd_calc_err_true_flg.setNextBeans(p.Cnd_calc_err_false_flg);
		p.Cnd_calc_err_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_err_true_flg_META);
		p.CndPanel.add(p.Cnd_calc_err_false_flg);
		p.Cnd_calc_err_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0080.CndR.calc_err_false_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CalcRsltSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBDP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBDP0030);
		p.Btn_open_MGBDP0030.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_CalcRsltSrch p) {
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
		MGBDP_CalcRsltSrch_MC.mcInitScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitTop((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitCnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitCtrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitDtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitBtn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.mcInitEastBtn((MGBDP_CalcRsltSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_ScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_Top((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_Cnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_Ctrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_Dtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_Btn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitSRCH_EastBtn((MGBDP_CalcRsltSrch)this);

		// [REF]ステータスのモードの設定
		MGBDP_CalcRsltSrch_MC.statusInitREF_ScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_Top((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_Cnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_Ctrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_Dtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_Btn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitREF_EastBtn((MGBDP_CalcRsltSrch)this);

		// [DEL]ステータスのモードの設定
		MGBDP_CalcRsltSrch_MC.statusInitDEL_ScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_Top((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_Cnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_Ctrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_Dtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_Btn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitDEL_EastBtn((MGBDP_CalcRsltSrch)this);

		// [FIX_D]ステータスのモードの設定
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_ScreenOpe((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_Top((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_Cnd((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_Ctrl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_Dtl((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_Btn((MGBDP_CalcRsltSrch)this);
		MGBDP_CalcRsltSrch_MC.statusInitFIX__D_EastBtn((MGBDP_CalcRsltSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CalcRsltSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_CalcRsltSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CalcRsltSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_ins_srv_req_no.setListListener(p);
		p.Cnd_ins_srv_req_no.addAllListener(p);
		p.Cnd_calc_usr_cd.setListListener(p);
		p.Cnd_calc_usr_cd.addAllListener(p);
		p.Cnd_calc_usr_nm.setListListener(p);
		p.Cnd_calc_usr_nm.addAllListener(p);
		p.Cnd_st_ym_fr.setListListener(p);
		p.Cnd_st_ym_fr.addAllListener(p);
		p.Cnd_st_ym_to.setListListener(p);
		p.Cnd_st_ym_to.addAllListener(p);
		p.Cnd_end_ym_fr.setListListener(p);
		p.Cnd_end_ym_fr.addAllListener(p);
		p.Cnd_end_ym_to.setListListener(p);
		p.Cnd_end_ym_to.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_fix_true_flg.addAllListener(p);
		p.Cnd_fix_false_flg.addAllListener(p);
		p.Cnd_non_del_true_flg.addAllListener(p);
		p.Cnd_non_del_false_flg.addAllListener(p);
		p.Cnd_calc_err_true_flg.addAllListener(p);
		p.Cnd_calc_err_false_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_CalcRsltSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_CalcRsltSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_calc_grp_cd.addAllListener(p);
		p.columnDtl_calc_grp_cd.setListListener(p);
		p.columnDtl_calc_grp_nm.addAllListener(p);
		p.columnDtl_calc_grp_nm.setListListener(p);
		p.columnDtl_calc_no.addAllListener(p);
		p.columnDtl_calc_no.setListListener(p);
		p.columnDtl_calc_err_flg.addAllListener(p);
		p.columnDtl_fix_flg.addAllListener(p);
		p.columnDtl_non_del_flg.addAllListener(p);
		p.columnDtl_st_ym.addAllListener(p);
		p.columnDtl_st_ym.setListListener(p);
		p.columnDtl_end_ym.addAllListener(p);
		p.columnDtl_end_ym.setListListener(p);
		p.columnDtl_calc_usr_cd.addAllListener(p);
		p.columnDtl_calc_usr_cd.setListListener(p);
		p.columnDtl_calc_usr_nm.addAllListener(p);
		p.columnDtl_calc_usr_nm.setListListener(p);
		p.columnDtl_calc_st.addAllListener(p);
		p.columnDtl_calc_st.setListListener(p);
		p.columnDtl_calc_fin.addAllListener(p);
		p.columnDtl_calc_fin.setListListener(p);
		p.columnDtl_calc_time.addAllListener(p);
		p.columnDtl_calc_time.setListListener(p);
		p.columnDtl_ins_srv_req_no.addAllListener(p);
		p.columnDtl_ins_srv_req_no.setListListener(p);
		p.columnDtl_batch_log_no.addAllListener(p);
		p.columnDtl_batch_log_no.setListListener(p);
		p.columnDtl_rmrks.addAllListener(p);
		p.columnDtl_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CalcRsltSrch p) {
		p.Btn_open_MGBDP0030.addAllListener(p);
		p.Btn_open_MGBDP0030.setAPMethodName("doBtn_open_MGBDP0030");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_CalcRsltSrch p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_CalcRsltSrch p){
		p.Cnd_term_fr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_term_to_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_st_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_st_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_end_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_end_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_CalcRsltSrch p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_CalcRsltSrch p){
		p.Btn_open_MGBDP0030.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_CalcRsltSrch p){
		p.Cnd_term_fr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_term_to_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_st_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_st_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_end_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_end_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MGBDP_CalcRsltSrch p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_CalcRsltSrch p){
		p.Btn_open_MGBDP0030.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_CalcRsltSrch p){
		p.Cnd_term_fr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_term_to_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_st_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_st_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_end_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_end_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MGBDP_CalcRsltSrch p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.Dtl_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_CalcRsltSrch p){
		p.Btn_open_MGBDP0030.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Top(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MGBDP_CalcRsltSrch p){
		p.Cnd_term_fr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_term_to_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_calc_usr_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_st_ym_fr.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_st_ym_to.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_end_ym_fr.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_end_ym_to.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);

	}

	/**
	 * [FIX_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Ctrl(MGBDP_CalcRsltSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MGBDP_CalcRsltSrch p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MGBDP_CalcRsltSrch p){
		p.Btn_open_MGBDP0030.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MGBDP_CalcRsltSrch p){

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
		MGBDP_CalcRsltSrch_MC.setTableConfigDtl((MGBDP_CalcRsltSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_CalcRsltSrch p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.DtlTable.addTable(p.Dtl_term_p_PPanel.TermTable);
		p.columnDtl_calc_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_grp_cd);
		p.columnDtl_calc_grp_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_grp_nm);
		p.columnDtl_calc_no.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_no);
		p.columnDtl_calc_err_flg.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_err_flg);
		p.columnDtl_fix_flg.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_flg);
		p.columnDtl_non_del_flg.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.non_del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_del_flg);
		p.columnDtl_st_ym.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.st_ym_META);
		p.columnDtl_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_st_ym);
		p.columnDtl_end_ym.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.end_ym_META);
		p.columnDtl_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_end_ym);
		p.columnDtl_calc_usr_cd.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_cd);
		p.columnDtl_calc_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_nm);
		p.columnDtl_calc_st.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_st_META);
		p.columnDtl_calc_st.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_st);
		p.columnDtl_calc_fin.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_fin_META);
		p.columnDtl_calc_fin.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_fin);
		p.columnDtl_calc_time.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.calc_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_time);
		p.columnDtl_ins_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_srv_req_no);
		p.columnDtl_batch_log_no.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.batch_log_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_batch_log_no);
		p.columnDtl_rmrks.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0080.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_usr_cd.getListConfig().setPutter(getCnd_calc_usr_cd_ListPutter());
		Cnd_st_ym_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_st_ym_fr.getListConfig().setPutter(getCnd_st_ym_fr_ListPutter());
		Cnd_st_ym_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_st_ym_to.getListConfig().setPutter(getCnd_st_ym_to_ListPutter());
		Cnd_end_ym_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_end_ym_fr.getListConfig().setPutter(getCnd_end_ym_fr_ListPutter());
		Cnd_end_ym_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_end_ym_to.getListConfig().setPutter(getCnd_end_ym_to_ListPutter());
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_st_ym_fr_ListPutter]の作成
	 */
	protected MCListPutter createCnd_st_ym_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_st_ym_to_ListPutter]の作成
	 */
	protected MCListPutter createCnd_st_ym_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_end_ym_fr_ListPutter]の作成
	 */
	protected MCListPutter createCnd_end_ym_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_end_ym_to_ListPutter]の作成
	 */
	protected MCListPutter createCnd_end_ym_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_usr_cd) return getCnd_calc_usr_cd(row, info);
		if(combo == Cnd_st_ym_fr) return getCnd_st_ym_fr(row, info);
		if(combo == Cnd_st_ym_to) return getCnd_st_ym_to(row, info);
		if(combo == Cnd_end_ym_fr) return getCnd_end_ym_fr(row, info);
		if(combo == Cnd_end_ym_to) return getCnd_end_ym_to(row, info);
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
		else if (ap == Btn_open_MGBDP0030) doBtn_open_MGBDP0030(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ins_srv_req_no) return doCnd_ins_srv_req_no_VC(info);
		if (vc == Cnd_calc_usr_cd) return doCnd_calc_usr_cd_VC(info);
		if (vc == Cnd_calc_usr_nm) return doCnd_calc_usr_nm_VC(info);
		if (vc == Cnd_st_ym_fr) return doCnd_st_ym_fr_VC(info);
		if (vc == Cnd_st_ym_to) return doCnd_st_ym_to_VC(info);
		if (vc == Cnd_end_ym_fr) return doCnd_end_ym_fr_VC(info);
		if (vc == Cnd_end_ym_to) return doCnd_end_ym_to_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_fix_true_flg) return doCnd_fix_true_flg_VC(info);
		if (vc == Cnd_fix_false_flg) return doCnd_fix_false_flg_VC(info);
		if (vc == Cnd_non_del_true_flg) return doCnd_non_del_true_flg_VC(info);
		if (vc == Cnd_non_del_false_flg) return doCnd_non_del_false_flg_VC(info);
		if (vc == Cnd_calc_err_true_flg) return doCnd_calc_err_true_flg_VC(info);
		if (vc == Cnd_calc_err_false_flg) return doCnd_calc_err_false_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_calc_grp_cd) return doDtl_calc_grp_cd_VC(info);
		if (vc == columnDtl_calc_grp_nm) return doDtl_calc_grp_nm_VC(info);
		if (vc == columnDtl_calc_no) return doDtl_calc_no_VC(info);
		if (vc == columnDtl_calc_err_flg) return doDtl_calc_err_flg_VC(info);
		if (vc == columnDtl_fix_flg) return doDtl_fix_flg_VC(info);
		if (vc == columnDtl_non_del_flg) return doDtl_non_del_flg_VC(info);
		if (vc == columnDtl_st_ym) return doDtl_st_ym_VC(info);
		if (vc == columnDtl_end_ym) return doDtl_end_ym_VC(info);
		if (vc == columnDtl_calc_usr_cd) return doDtl_calc_usr_cd_VC(info);
		if (vc == columnDtl_calc_usr_nm) return doDtl_calc_usr_nm_VC(info);
		if (vc == columnDtl_calc_st) return doDtl_calc_st_VC(info);
		if (vc == columnDtl_calc_fin) return doDtl_calc_fin_VC(info);
		if (vc == columnDtl_calc_time) return doDtl_calc_time_VC(info);
		if (vc == columnDtl_ins_srv_req_no) return doDtl_ins_srv_req_no_VC(info);
		if (vc == columnDtl_batch_log_no) return doDtl_batch_log_no_VC(info);
		if (vc == columnDtl_rmrks) return doDtl_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[ins_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_del_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_del_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_err_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_err_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_st]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_st_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_fin]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_fin_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NC(info);
		else if (nc == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NC(info);
		else if (nc == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NC(info);
		else if (nc == Cnd_st_ym_fr) doCnd_st_ym_fr_NC(info);
		else if (nc == Cnd_st_ym_to) doCnd_st_ym_to_NC(info);
		else if (nc == Cnd_end_ym_fr) doCnd_end_ym_fr_NC(info);
		else if (nc == Cnd_end_ym_to) doCnd_end_ym_to_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_fix_true_flg) doCnd_fix_true_flg_NC(info);
		else if (nc == Cnd_fix_false_flg) doCnd_fix_false_flg_NC(info);
		else if (nc == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NC(info);
		else if (nc == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NC(info);
		else if (nc == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NC(info);
		else if (nc == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NC(info);
		else if (nc == columnDtl_calc_grp_nm) doDtl_calc_grp_nm_NC(info);
		else if (nc == columnDtl_calc_no) doDtl_calc_no_NC(info);
		else if (nc == columnDtl_calc_err_flg) doDtl_calc_err_flg_NC(info);
		else if (nc == columnDtl_fix_flg) doDtl_fix_flg_NC(info);
		else if (nc == columnDtl_non_del_flg) doDtl_non_del_flg_NC(info);
		else if (nc == columnDtl_st_ym) doDtl_st_ym_NC(info);
		else if (nc == columnDtl_end_ym) doDtl_end_ym_NC(info);
		else if (nc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NC(info);
		else if (nc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NC(info);
		else if (nc == columnDtl_calc_st) doDtl_calc_st_NC(info);
		else if (nc == columnDtl_calc_fin) doDtl_calc_fin_NC(info);
		else if (nc == columnDtl_calc_time) doDtl_calc_time_NC(info);
		else if (nc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NC(info);
		else if (nc == columnDtl_batch_log_no) doDtl_batch_log_no_NC(info);
		else if (nc == columnDtl_rmrks) doDtl_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NE(info);
		else if (ne == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NE(info);
		else if (ne == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NE(info);
		else if (ne == Cnd_st_ym_fr) doCnd_st_ym_fr_NE(info);
		else if (ne == Cnd_st_ym_to) doCnd_st_ym_to_NE(info);
		else if (ne == Cnd_end_ym_fr) doCnd_end_ym_fr_NE(info);
		else if (ne == Cnd_end_ym_to) doCnd_end_ym_to_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_fix_true_flg) doCnd_fix_true_flg_NE(info);
		else if (ne == Cnd_fix_false_flg) doCnd_fix_false_flg_NE(info);
		else if (ne == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NE(info);
		else if (ne == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NE(info);
		else if (ne == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NE(info);
		else if (ne == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NE(info);
		else if (ne == columnDtl_calc_grp_nm) doDtl_calc_grp_nm_NE(info);
		else if (ne == columnDtl_calc_no) doDtl_calc_no_NE(info);
		else if (ne == columnDtl_calc_err_flg) doDtl_calc_err_flg_NE(info);
		else if (ne == columnDtl_fix_flg) doDtl_fix_flg_NE(info);
		else if (ne == columnDtl_non_del_flg) doDtl_non_del_flg_NE(info);
		else if (ne == columnDtl_st_ym) doDtl_st_ym_NE(info);
		else if (ne == columnDtl_end_ym) doDtl_end_ym_NE(info);
		else if (ne == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NE(info);
		else if (ne == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NE(info);
		else if (ne == columnDtl_calc_st) doDtl_calc_st_NE(info);
		else if (ne == columnDtl_calc_fin) doDtl_calc_fin_NE(info);
		else if (ne == columnDtl_calc_time) doDtl_calc_time_NE(info);
		else if (ne == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NE(info);
		else if (ne == columnDtl_batch_log_no) doDtl_batch_log_no_NE(info);
		else if (ne == columnDtl_rmrks) doDtl_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NX(info);
		else if (nx == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NX(info);
		else if (nx == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NX(info);
		else if (nx == Cnd_st_ym_fr) doCnd_st_ym_fr_NX(info);
		else if (nx == Cnd_st_ym_to) doCnd_st_ym_to_NX(info);
		else if (nx == Cnd_end_ym_fr) doCnd_end_ym_fr_NX(info);
		else if (nx == Cnd_end_ym_to) doCnd_end_ym_to_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_fix_true_flg) doCnd_fix_true_flg_NX(info);
		else if (nx == Cnd_fix_false_flg) doCnd_fix_false_flg_NX(info);
		else if (nx == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NX(info);
		else if (nx == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NX(info);
		else if (nx == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NX(info);
		else if (nx == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NX(info);
		else if (nx == columnDtl_calc_grp_nm) doDtl_calc_grp_nm_NX(info);
		else if (nx == columnDtl_calc_no) doDtl_calc_no_NX(info);
		else if (nx == columnDtl_calc_err_flg) doDtl_calc_err_flg_NX(info);
		else if (nx == columnDtl_fix_flg) doDtl_fix_flg_NX(info);
		else if (nx == columnDtl_non_del_flg) doDtl_non_del_flg_NX(info);
		else if (nx == columnDtl_st_ym) doDtl_st_ym_NX(info);
		else if (nx == columnDtl_end_ym) doDtl_end_ym_NX(info);
		else if (nx == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NX(info);
		else if (nx == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NX(info);
		else if (nx == columnDtl_calc_st) doDtl_calc_st_NX(info);
		else if (nx == columnDtl_calc_fin) doDtl_calc_fin_NX(info);
		else if (nx == columnDtl_calc_time) doDtl_calc_time_NX(info);
		else if (nx == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NX(info);
		else if (nx == columnDtl_batch_log_no) doDtl_batch_log_no_NX(info);
		else if (nx == columnDtl_rmrks) doDtl_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_LC(info);
		else if (lc == Cnd_calc_usr_cd) doCnd_calc_usr_cd_LC(info);
		else if (lc == Cnd_calc_usr_nm) doCnd_calc_usr_nm_LC(info);
		else if (lc == Cnd_st_ym_fr) doCnd_st_ym_fr_LC(info);
		else if (lc == Cnd_st_ym_to) doCnd_st_ym_to_LC(info);
		else if (lc == Cnd_end_ym_fr) doCnd_end_ym_fr_LC(info);
		else if (lc == Cnd_end_ym_to) doCnd_end_ym_to_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_LC(info);
		else if (lc == columnDtl_calc_grp_nm) doDtl_calc_grp_nm_LC(info);
		else if (lc == columnDtl_calc_no) doDtl_calc_no_LC(info);
		else if (lc == columnDtl_st_ym) doDtl_st_ym_LC(info);
		else if (lc == columnDtl_end_ym) doDtl_end_ym_LC(info);
		else if (lc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_LC(info);
		else if (lc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_LC(info);
		else if (lc == columnDtl_calc_st) doDtl_calc_st_LC(info);
		else if (lc == columnDtl_calc_fin) doDtl_calc_fin_LC(info);
		else if (lc == columnDtl_calc_time) doDtl_calc_time_LC(info);
		else if (lc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_LC(info);
		else if (lc == columnDtl_batch_log_no) doDtl_batch_log_no_LC(info);
		else if (lc == columnDtl_rmrks) doDtl_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
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
	 * [Cnd]パネルの[ins_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_calc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_st_ym_fr]の作成メソッド
	 */
	public MCList getCnd_st_ym_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_st_ym_to]の作成メソッド
	 */
	public MCList getCnd_st_ym_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_end_ym_fr]の作成メソッド
	 */
	public MCList getCnd_end_ym_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_end_ym_to]の作成メソッド
	 */
	public MCList getCnd_end_ym_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0080.Srch01")) {
			return new MG_MGBDL0080_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0080.Del01")) {
			return new MG_MGBDL0080_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0080_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0080_Srch01Bridge() {
			p_MG_MGBDL0080_Srch01 = new MCParam(PDef.MG_MGBDL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0080.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0080.DtlR.class));

			p_MG_MGBDL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0080.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0080.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0080.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0080.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0080_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0080.DtlR>)p_MG_MGBDL0080_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBDL0080_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0080_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0080_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0080_Del01Bridge() {
			p_MG_MGBDL0080_Del01 = new MCParam(PDef.MG_MGBDL0080_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0080_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0080.DtlR.class));
			// Down

			p_MG_MGBDL0080_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0080_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0080_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0080_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0080_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0080.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0080.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0080_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}