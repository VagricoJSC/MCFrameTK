package mcframe.clientMGBD.MGBDP0650;

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
import mcframe.clientMGBD.MGBDP0650.MGBDP_CurXrateReg_MC.MG_MGBDL0650_Srch01Caller;
import mcframe.clientMGBD.MGBDP0650.MGBDP_CurXrateReg_MC.MG_MGBDL0650_Upd01Caller;
import mcframe.clientMGBD.MGBDP0650.MGBDP_CurXrateReg_MC.MG_MGBDL0650_Del01Caller;
import mcframe.clientMGBD.MGBDP0650.MGBDP_CurXrateReg_MC.MG_MGBDL0650_Imp01Caller;

/**
 * 画面"MGBDP_CurXrateReg"パネルクラスです。<p>
 *
 * 原価為替レートを登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CurXrateReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0650";

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
	 * UPD,Create/Modify,0;DEL,Delete,1;REF,View,2 UPD,登録・訂正する,0;DEL,削除する,1;REF,参照する,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCTextField Cnd_term_fr_nm;	// [Cnd]の[term_p.term_fr_nm]を[Cnd_term_fr_nm]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
	public MCTextField Cnd_term_to_nm;	// [Cnd]の[term_p.term_to_nm]を[Cnd_term_to_nm]としてエイリアス定義。
	public MCLabel Cnd_fr_cur_cd_Label = null;
	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_fr_cur_cd = null;
	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public MCTextField Cnd_fr_cur_nm = null;
	public MCLabel Cnd_to_cur_cd_Label = null;
	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_to_cur_cd = null;
	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public MCTextField Cnd_to_cur_nm = null;
	public MCLabel Cnd_xrate_cd_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCTextField Cnd_xrate_nm = null;
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
	public MCLabel Cnd_fix_flg_lab = null;
	/**
	 * Firm. Off 確定.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_fix_flg = null;
	/**
	 * Firm.off 確定.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_fix_flg = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0650.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Rslt_term_p_PPanel;
	public MCColumnConfig columnRslt_term;// [Rslt]の[term_p.term]を[columnRslt_term]としてエイリアス定義。
	public MCColumnConfig columnRslt_term_nm;// [Rslt]の[term_p.term_nm]を[columnRslt_term_nm]としてエイリアス定義。
	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fr_cur_cd = null;
	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fr_cur_nm = null;
	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_to_cur_cd = null;
	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_to_cur_nm = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_nm = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
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
	public static final String[] statusArray = new String[]{UPD, SRCH_REF, REF, SRCH_DEL, DEL, FIX_U};
	
	/** [MG_MGBDL0650_Srch01]のCallerの作成 */
	protected MGBDP_CurXrateReg_MC.MG_MGBDL0650_Srch01Caller createMG_MGBDL0650_Srch01() {
		MGBDP_CurXrateReg_MC.MG_MGBDL0650_Srch01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Srch01Bridge>
		caller = ((MGBDP_CurXrateReg_MC)this).new MG_MGBDL0650_Srch01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Srch01Bridge>(
					(MGBDP_CurXrateReg)this, new MG_MGBDL0650_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0650_Srch01]の呼び出し */
	protected void callMG_MGBDL0650_Srch01() {
		MCCaller caller = createMG_MGBDL0650_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0650_Upd01]のCallerの作成 */
	protected MGBDP_CurXrateReg_MC.MG_MGBDL0650_Upd01Caller createMG_MGBDL0650_Upd01() {
		MGBDP_CurXrateReg_MC.MG_MGBDL0650_Upd01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Upd01Bridge>
		caller = ((MGBDP_CurXrateReg_MC)this).new MG_MGBDL0650_Upd01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Upd01Bridge>(
					(MGBDP_CurXrateReg)this, new MG_MGBDL0650_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0650_Upd01]の呼び出し */
	protected void callMG_MGBDL0650_Upd01() {
		MCCaller caller = createMG_MGBDL0650_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0650_Del01]のCallerの作成 */
	protected MGBDP_CurXrateReg_MC.MG_MGBDL0650_Del01Caller createMG_MGBDL0650_Del01() {
		MGBDP_CurXrateReg_MC.MG_MGBDL0650_Del01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Del01Bridge>
		caller = ((MGBDP_CurXrateReg_MC)this).new MG_MGBDL0650_Del01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Del01Bridge>(
					(MGBDP_CurXrateReg)this, new MG_MGBDL0650_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0650_Del01]の呼び出し */
	protected void callMG_MGBDL0650_Del01() {
		MCCaller caller = createMG_MGBDL0650_Del01();
		caller.exec();
	}
	/** [MG_MGBDL0650_Imp01]のCallerの作成 */
	protected MGBDP_CurXrateReg_MC.MG_MGBDL0650_Imp01Caller createMG_MGBDL0650_Imp01() {
		MGBDP_CurXrateReg_MC.MG_MGBDL0650_Imp01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Imp01Bridge>
		caller = ((MGBDP_CurXrateReg_MC)this).new MG_MGBDL0650_Imp01Caller<MGBDP_CurXrateReg, MG_MGBDL0650_Imp01Bridge>(
					(MGBDP_CurXrateReg)this, new MG_MGBDL0650_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBDL0650_Imp01]の呼び出し */
	protected void callMG_MGBDL0650_Imp01() {
		MCCaller caller = createMG_MGBDL0650_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0650.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0650.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0650.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0650.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0650.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0650.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0650.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0650.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0650.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0650.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0650.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class);
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
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CurXrateReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CurXrateReg_MC_A(String name) {
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
		MGBDP_CurXrateReg_MC.jbCreateScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateTop((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateCnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateCnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateCtrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateRslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateBtn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbCreateEastBtn((MGBDP_CurXrateReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CurXrateReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_CurXrateReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CurXrateReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_fr_nm = p.Cnd_term_p_PPanel.Term_term_fr_nm;
		p.Cnd_term_fr_nm.addAliasName("Cnd.term_fr_nm", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
		p.Cnd_term_to_nm = p.Cnd_term_p_PPanel.Term_term_to_nm;
		p.Cnd_term_to_nm.addAliasName("Cnd.term_to_nm", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBDP_CurXrateReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_CurXrateReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_CurXrateReg p) {
		p.Rslt_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0650.RsltR.$term_p);
		p.Rslt_term_p_PPanel.setName("Rslt.term_p");
		p.columnRslt_term = p.Rslt_term_p_PPanel.columnTerm_term;
		p.columnRslt_term.addAliasName("Rslt.term", p);
		p.columnRslt_term_nm = p.Rslt_term_p_PPanel.columnTerm_term_nm;
		p.columnRslt_term_nm.addAliasName("Rslt.term_nm", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0650.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CurXrateReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_CurXrateReg p) {
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

	
	/** [Cnd_fr_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_fr_cur_cd_p = null;

	/**
	 * [Cnd_fr_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_fr_cur_cd_ListPutter() {
		if (Cnd_fr_cur_cd_p == null) {
			Cnd_fr_cur_cd_p = createCnd_fr_cur_cd_ListPutter(Cnd_fr_cur_cd, "fr_cur_cd", "fr_cur_nm");

		}
		return Cnd_fr_cur_cd_p;
	}
	
	
	/** [Cnd_to_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_to_cur_cd_p = null;

	/**
	 * [Cnd_to_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_to_cur_cd_ListPutter() {
		if (Cnd_to_cur_cd_p == null) {
			Cnd_to_cur_cd_p = createCnd_to_cur_cd_ListPutter(Cnd_to_cur_cd, "to_cur_cd", "to_cur_nm");

		}
		return Cnd_to_cur_cd_p;
	}
	
	
	/** [Cnd_xrate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_xrate_cd_p = null;

	/**
	 * [Cnd_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_xrate_cd_ListPutter() {
		if (Cnd_xrate_cd_p == null) {
			Cnd_xrate_cd_p = createCnd_xrate_cd_ListPutter(Cnd_xrate_cd, "xrate_cd", "xrate_nm");

		}
		return Cnd_xrate_cd_p;
	}
	
	
	/** [Rslt_fr_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_fr_cur_cd_p = null;

	/**
	 * [Rslt_fr_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_fr_cur_cd_ListPutter() {
		if (Rslt_fr_cur_cd_p == null) {
			Rslt_fr_cur_cd_p = createRslt_fr_cur_cd_ListPutter(columnRslt_fr_cur_cd, "fr_cur_cd", "fr_cur_nm");

		}
		return Rslt_fr_cur_cd_p;
	}
	
	
	/** [Rslt_to_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_to_cur_cd_p = null;

	/**
	 * [Rslt_to_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_to_cur_cd_ListPutter() {
		if (Rslt_to_cur_cd_p == null) {
			Rslt_to_cur_cd_p = createRslt_to_cur_cd_ListPutter(columnRslt_to_cur_cd, "to_cur_cd", "to_cur_nm");

		}
		return Rslt_to_cur_cd_p;
	}
	
	
	/** [Rslt_xrate_cd_ListPutter]の定義 */
	private MCListPutter Rslt_xrate_cd_p = null;

	/**
	 * [Rslt_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_xrate_cd_ListPutter() {
		if (Rslt_xrate_cd_p == null) {
			Rslt_xrate_cd_p = createRslt_xrate_cd_ListPutter(columnRslt_xrate_cd, "xrate_cd", "xrate_nm");

		}
		return Rslt_xrate_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CurXrateReg create(){
		MGBDP_CurXrateReg p = new MGBDP_CurXrateReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CurXrateReg create(String name){
		MGBDP_CurXrateReg p = new MGBDP_CurXrateReg(name);
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
		MGBDP_CurXrateReg_MC.jbfInitScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitTop((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitCnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitCnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitCtrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitRslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitBtn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbfInitEastBtn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitTop((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitCnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitCnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitCtrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitRslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitBtn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.jbInitEastBtn((MGBDP_CurXrateReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_fr_cur_cd_Label = p.beansFactory.createLabel("Cnd.fr_cur_cd_Label");
		p.Cnd_fr_cur_cd = p.beansFactory.createTextComboBox("Cnd.fr_cur_cd");
		p.Cnd_fr_cur_cd.setLabel(p.Cnd_fr_cur_cd_Label);
		p.Cnd_fr_cur_nm = p.beansFactory.createTextField("Cnd.fr_cur_nm");
		p.Cnd_to_cur_cd_Label = p.beansFactory.createLabel("Cnd.to_cur_cd_Label");
		p.Cnd_to_cur_cd = p.beansFactory.createTextComboBox("Cnd.to_cur_cd");
		p.Cnd_to_cur_cd.setLabel(p.Cnd_to_cur_cd_Label);
		p.Cnd_to_cur_nm = p.beansFactory.createTextField("Cnd.to_cur_nm");
		p.Cnd_xrate_cd_Label = p.beansFactory.createLabel("Cnd.xrate_cd_Label");
		p.Cnd_xrate_cd = p.beansFactory.createTextComboBox("Cnd.xrate_cd");
		p.Cnd_xrate_cd.setLabel(p.Cnd_xrate_cd_Label);
		p.Cnd_xrate_nm = p.beansFactory.createTextField("Cnd.xrate_nm");
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
		p.Cnd_fix_flg_lab = p.beansFactory.createLabel("Cnd.fix_flg_lab");
		p.Cnd_off_fix_flg = p.beansFactory.createCheckBox("Cnd.off_fix_flg");
		p.Cnd_on_fix_flg = p.beansFactory.createCheckBox("Cnd.on_fix_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_fr_cur_cd = p.beansFactory.createTableColumn("Rslt.fr_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_fr_cur_nm = p.beansFactory.createTableColumn("Rslt.fr_cur_nm", MCColumnType.TEXT);
		p.columnRslt_to_cur_cd = p.beansFactory.createTableColumn("Rslt.to_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_to_cur_nm = p.beansFactory.createTableColumn("Rslt.to_cur_nm", MCColumnType.TEXT);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_xrate_nm = p.beansFactory.createTableColumn("Rslt.xrate_nm", MCColumnType.TEXT);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CurXrateReg p) {
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
	protected static void jbInitTop(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.Cnd2Panel);
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
	protected static void jbInitCnd(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.ope_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_fr_cur_cd);
		p.Cnd_term_p_PPanel.Term_term_fr.setListType(MCListType.FREE);
		p.Cnd_term_p_PPanel.Term_term_to.setListType(MCListType.FREE);
		p.Cnd_fr_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_fr_cur_cd, true);
		p.Cnd_fr_cur_cd.setLinkBeans(p.Cnd_fr_cur_nm);
		p.CndPanel.add(p.Cnd_fr_cur_cd_Label);
		p.CndPanel.add(p.Cnd_fr_cur_cd);
		p.Cnd_fr_cur_cd.setNextBeans(p.Cnd_fr_cur_nm);
		p.Cnd_fr_cur_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.fr_cur_cd_META);
		p.CndPanel.add(p.Cnd_fr_cur_nm);
		p.Cnd_fr_cur_nm.setNextBeans(p.Cnd_to_cur_cd);
		p.Cnd_fr_cur_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.fr_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_fr_cur_nm, true);
		p.Cnd_to_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_to_cur_cd, true);
		p.Cnd_to_cur_cd.setLinkBeans(p.Cnd_to_cur_nm);
		p.CndPanel.add(p.Cnd_to_cur_cd_Label);
		p.CndPanel.add(p.Cnd_to_cur_cd);
		p.Cnd_to_cur_cd.setNextBeans(p.Cnd_to_cur_nm);
		p.Cnd_to_cur_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.to_cur_cd_META);
		p.CndPanel.add(p.Cnd_to_cur_nm);
		p.Cnd_to_cur_nm.setNextBeans(p.Cnd_xrate_cd);
		p.Cnd_to_cur_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.to_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_to_cur_nm, true);
		p.Cnd_xrate_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_xrate_cd, true);
		p.Cnd_xrate_cd.setLinkBeans(p.Cnd_xrate_nm);
		p.CndPanel.add(p.Cnd_xrate_cd_Label);
		p.CndPanel.add(p.Cnd_xrate_cd);
		p.Cnd_xrate_cd.setNextBeans(p.Cnd_xrate_nm);
		p.Cnd_xrate_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.xrate_cd_META);
		p.CndPanel.add(p.Cnd_xrate_nm);
		p.Cnd_xrate_nm.setNextBeans(p.Cnd_rmrks);
		p.Cnd_xrate_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.xrate_nm_META);
		p.setPluralValueEnable(p.Cnd_xrate_nm, true);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_off_fix_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_fix_flg_lab);
		p.CndPanel.add(p.Cnd_off_fix_flg);
		p.Cnd_off_fix_flg.setNextBeans(p.Cnd_on_fix_flg);
		p.Cnd_off_fix_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.off_fix_flg_META);
		p.CndPanel.add(p.Cnd_on_fix_flg);
		p.Cnd_on_fix_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0650.CndR.on_fix_flg_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.add(p.Cnd2Panel);
		p.Cnd2Panel.setNextBeans(p.RsltPanel);
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_CurXrateReg p) {
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
	protected static void jbInitRslt(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CurXrateReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MGBDP_CurXrateReg p) {
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
		MGBDP_CurXrateReg_MC.mcInitScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitTop((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitCnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitCnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitCtrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitRslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitBtn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.mcInitEastBtn((MGBDP_CurXrateReg)this);

		// [UPD]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitUPD_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitUPD_EastBtn((MGBDP_CurXrateReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__REF_EastBtn((MGBDP_CurXrateReg)this);

		// [REF]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitREF_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitREF_EastBtn((MGBDP_CurXrateReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitSRCH__DEL_EastBtn((MGBDP_CurXrateReg)this);

		// [DEL]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitDEL_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitDEL_EastBtn((MGBDP_CurXrateReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBDP_CurXrateReg_MC.statusInitFIX__U_ScreenOpe((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Top((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Cnd((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Cnd2((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Ctrl((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Rslt((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_Btn((MGBDP_CurXrateReg)this);
		MGBDP_CurXrateReg_MC.statusInitFIX__U_EastBtn((MGBDP_CurXrateReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CurXrateReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_CurXrateReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CurXrateReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_fr_cur_cd.setListListener(p);
		p.Cnd_fr_cur_cd.addAllListener(p);
		p.Cnd_fr_cur_nm.setListListener(p);
		p.Cnd_fr_cur_nm.addAllListener(p);
		p.Cnd_to_cur_cd.setListListener(p);
		p.Cnd_to_cur_cd.addAllListener(p);
		p.Cnd_to_cur_nm.setListListener(p);
		p.Cnd_to_cur_nm.addAllListener(p);
		p.Cnd_xrate_cd.setListListener(p);
		p.Cnd_xrate_cd.addAllListener(p);
		p.Cnd_xrate_nm.setListListener(p);
		p.Cnd_xrate_nm.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_off_fix_flg.addAllListener(p);
		p.Cnd_on_fix_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_CurXrateReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_CurXrateReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_CurXrateReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_fr_cur_cd.addAllListener(p);
		p.columnRslt_fr_cur_cd.setListListener(p);
		p.columnRslt_fr_cur_nm.addAllListener(p);
		p.columnRslt_fr_cur_nm.setListListener(p);
		p.columnRslt_to_cur_cd.addAllListener(p);
		p.columnRslt_to_cur_cd.setListListener(p);
		p.columnRslt_to_cur_nm.addAllListener(p);
		p.columnRslt_to_cur_nm.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_xrate_nm.addAllListener(p);
		p.columnRslt_xrate_nm.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CurXrateReg p) {
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
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_CurXrateReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.REQUIRED);
		p.columnRslt_fr_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_fr_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_to_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_fr_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_fr_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_to_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBDP_CurXrateReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_fr_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fr_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_to_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_fr_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fr_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_to_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBDP_CurXrateReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_fr_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_fr_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_to_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_CurXrateReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBDP_CurXrateReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBDP_CurXrateReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBDP_CurXrateReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_fr_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_fr_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_to_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_to_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_xrate_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_xrate_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_off_fix_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_on_fix_flg.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MGBDP_CurXrateReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBDP_CurXrateReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBDP_CurXrateReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_fr_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_fr_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_to_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_to_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBDP_CurXrateReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBDP_CurXrateReg p){

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
		MGBDP_CurXrateReg_MC.setTableConfigRslt((MGBDP_CurXrateReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_CurXrateReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.RsltTable.addTable(p.Rslt_term_p_PPanel.TermTable);
		p.columnRslt_fr_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.fr_cur_cd_META);
		p.columnRslt_fr_cur_cd.addLinkBeans(p.columnRslt_fr_cur_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_fr_cur_cd);
		p.columnRslt_fr_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.fr_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fr_cur_nm);
		p.columnRslt_to_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.to_cur_cd_META);
		p.columnRslt_to_cur_cd.addLinkBeans(p.columnRslt_to_cur_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_to_cur_cd);
		p.columnRslt_to_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.to_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_to_cur_nm);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.xrate_cd_META);
		p.columnRslt_xrate_cd.addLinkBeans(p.columnRslt_xrate_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_xrate_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.xrate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_nm);
		p.columnRslt_xrate.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBD.MGBDP0650.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_fr_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_fr_cur_cd.getListConfig().setPutter(getCnd_fr_cur_cd_ListPutter());
		Cnd_to_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_to_cur_cd.getListConfig().setPutter(getCnd_to_cur_cd_ListPutter());
		Cnd_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_xrate_cd.getListConfig().setPutter(getCnd_xrate_cd_ListPutter());
		columnRslt_fr_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_fr_cur_cd.getListConfig().setPutter(getRslt_fr_cur_cd_ListPutter());
		columnRslt_to_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_to_cur_cd.getListConfig().setPutter(getRslt_to_cur_cd_ListPutter());
		columnRslt_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_xrate_cd.getListConfig().setPutter(getRslt_xrate_cd_ListPutter());
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_fr_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_fr_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_to_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_to_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Rslt_fr_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_fr_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_to_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_to_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_fr_cur_cd) return getCnd_fr_cur_cd(row, info);
		if(combo == Cnd_to_cur_cd) return getCnd_to_cur_cd(row, info);
		if(combo == Cnd_xrate_cd) return getCnd_xrate_cd(row, info);
		if(combo == columnRslt_fr_cur_cd) return getRslt_fr_cur_cd(row, info);
		if(combo == columnRslt_to_cur_cd) return getRslt_to_cur_cd(row, info);
		if(combo == columnRslt_xrate_cd) return getRslt_xrate_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == Cnd_fr_cur_cd) return doCnd_fr_cur_cd_VC(info);
		if (vc == Cnd_fr_cur_nm) return doCnd_fr_cur_nm_VC(info);
		if (vc == Cnd_to_cur_cd) return doCnd_to_cur_cd_VC(info);
		if (vc == Cnd_to_cur_nm) return doCnd_to_cur_nm_VC(info);
		if (vc == Cnd_xrate_cd) return doCnd_xrate_cd_VC(info);
		if (vc == Cnd_xrate_nm) return doCnd_xrate_nm_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_off_fix_flg) return doCnd_off_fix_flg_VC(info);
		if (vc == Cnd_on_fix_flg) return doCnd_on_fix_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_fr_cur_cd) return doRslt_fr_cur_cd_VC(info);
		if (vc == columnRslt_fr_cur_nm) return doRslt_fr_cur_nm_VC(info);
		if (vc == columnRslt_to_cur_cd) return doRslt_to_cur_cd_VC(info);
		if (vc == columnRslt_to_cur_nm) return doRslt_to_cur_nm_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_nm) return doRslt_xrate_nm_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[fr_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fr_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fr_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[to_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_to_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[to_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_to_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[off_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_fix_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fr_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fr_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fr_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[to_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_to_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[to_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_to_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_fr_cur_cd) doCnd_fr_cur_cd_NC(info);
		else if (nc == Cnd_fr_cur_nm) doCnd_fr_cur_nm_NC(info);
		else if (nc == Cnd_to_cur_cd) doCnd_to_cur_cd_NC(info);
		else if (nc == Cnd_to_cur_nm) doCnd_to_cur_nm_NC(info);
		else if (nc == Cnd_xrate_cd) doCnd_xrate_cd_NC(info);
		else if (nc == Cnd_xrate_nm) doCnd_xrate_nm_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_off_fix_flg) doCnd_off_fix_flg_NC(info);
		else if (nc == Cnd_on_fix_flg) doCnd_on_fix_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_fr_cur_cd) doRslt_fr_cur_cd_NC(info);
		else if (nc == columnRslt_fr_cur_nm) doRslt_fr_cur_nm_NC(info);
		else if (nc == columnRslt_to_cur_cd) doRslt_to_cur_cd_NC(info);
		else if (nc == columnRslt_to_cur_nm) doRslt_to_cur_nm_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_nm) doRslt_xrate_nm_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[fr_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[off_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_fr_cur_cd) doCnd_fr_cur_cd_NE(info);
		else if (ne == Cnd_fr_cur_nm) doCnd_fr_cur_nm_NE(info);
		else if (ne == Cnd_to_cur_cd) doCnd_to_cur_cd_NE(info);
		else if (ne == Cnd_to_cur_nm) doCnd_to_cur_nm_NE(info);
		else if (ne == Cnd_xrate_cd) doCnd_xrate_cd_NE(info);
		else if (ne == Cnd_xrate_nm) doCnd_xrate_nm_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_off_fix_flg) doCnd_off_fix_flg_NE(info);
		else if (ne == Cnd_on_fix_flg) doCnd_on_fix_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_fr_cur_cd) doRslt_fr_cur_cd_NE(info);
		else if (ne == columnRslt_fr_cur_nm) doRslt_fr_cur_nm_NE(info);
		else if (ne == columnRslt_to_cur_cd) doRslt_to_cur_cd_NE(info);
		else if (ne == columnRslt_to_cur_nm) doRslt_to_cur_nm_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_nm) doRslt_xrate_nm_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[fr_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[off_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_fr_cur_cd) doCnd_fr_cur_cd_NX(info);
		else if (nx == Cnd_fr_cur_nm) doCnd_fr_cur_nm_NX(info);
		else if (nx == Cnd_to_cur_cd) doCnd_to_cur_cd_NX(info);
		else if (nx == Cnd_to_cur_nm) doCnd_to_cur_nm_NX(info);
		else if (nx == Cnd_xrate_cd) doCnd_xrate_cd_NX(info);
		else if (nx == Cnd_xrate_nm) doCnd_xrate_nm_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_off_fix_flg) doCnd_off_fix_flg_NX(info);
		else if (nx == Cnd_on_fix_flg) doCnd_on_fix_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_fr_cur_cd) doRslt_fr_cur_cd_NX(info);
		else if (nx == columnRslt_fr_cur_nm) doRslt_fr_cur_nm_NX(info);
		else if (nx == columnRslt_to_cur_cd) doRslt_to_cur_cd_NX(info);
		else if (nx == columnRslt_to_cur_nm) doRslt_to_cur_nm_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_nm) doRslt_xrate_nm_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[fr_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[off_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_fr_cur_cd) doCnd_fr_cur_cd_LC(info);
		else if (lc == Cnd_fr_cur_nm) doCnd_fr_cur_nm_LC(info);
		else if (lc == Cnd_to_cur_cd) doCnd_to_cur_cd_LC(info);
		else if (lc == Cnd_to_cur_nm) doCnd_to_cur_nm_LC(info);
		else if (lc == Cnd_xrate_cd) doCnd_xrate_cd_LC(info);
		else if (lc == Cnd_xrate_nm) doCnd_xrate_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_fr_cur_cd) doRslt_fr_cur_cd_LC(info);
		else if (lc == columnRslt_fr_cur_nm) doRslt_fr_cur_nm_LC(info);
		else if (lc == columnRslt_to_cur_cd) doRslt_to_cur_cd_LC(info);
		else if (lc == columnRslt_to_cur_nm) doRslt_to_cur_nm_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate_nm) doRslt_xrate_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_rmrks) doRslt_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[fr_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[fr_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fr_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fr_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_fr_cur_cd]の作成メソッド
	 */
	public MCList getCnd_fr_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_to_cur_cd]の作成メソッド
	 */
	public MCList getCnd_to_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_xrate_cd]の作成メソッド
	 */
	public MCList getCnd_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_fr_cur_cd]の作成メソッド
	 */
	public MCList getRslt_fr_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_to_cur_cd]の作成メソッド
	 */
	public MCList getRslt_to_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_xrate_cd]の作成メソッド
	 */
	public MCList getRslt_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0650.Srch01")) {
			return new MG_MGBDL0650_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0650.Upd01")) {
			return new MG_MGBDL0650_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0650.Del01")) {
			return new MG_MGBDL0650_Del01Bridge();
		}
		if (id.equals("MG.MGBDL0650.Imp01")) {
			return new MG_MGBDL0650_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0650_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0650_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0650_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0650_Srch01Bridge() {
			p_MG_MGBDL0650_Srch01 = new MCParam(PDef.MG_MGBDL0650_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0650_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0650.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));

			p_MG_MGBDL0650_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0650_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0650_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0650_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0650_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0650.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0650.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0650_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0650_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)p_MG_MGBDL0650_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0650_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0650_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0650_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0650_Upd01Bridge() {
			p_MG_MGBDL0650_Upd01 = new MCParam(PDef.MG_MGBDL0650_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0650_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));

			p_MG_MGBDL0650_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0650_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0650_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0650_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0650_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0650_Upd01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0650_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)p_MG_MGBDL0650_Upd01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBDL0650_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0650_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0650_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0650_Del01Bridge() {
			p_MG_MGBDL0650_Del01 = new MCParam(PDef.MG_MGBDL0650_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0650_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));

			p_MG_MGBDL0650_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0650_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0650_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0650_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0650_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0650_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0650_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)p_MG_MGBDL0650_Del01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBDL0650_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0650_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0650_Imp01;

		/** コンストラクタ */
		protected MG_MGBDL0650_Imp01Bridge() {
			p_MG_MGBDL0650_Imp01 = new MCParam(PDef.MG_MGBDL0650_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0650_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));

			p_MG_MGBDL0650_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0650_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0650_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0650_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0650_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0650.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0650_Imp01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0650.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0650_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0650.RsltR>)p_MG_MGBDL0650_Imp01.getContainerParam().getDownBlock(0));
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