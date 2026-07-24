package mcframe.clientMGBD.MGBDP0310;

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
import mcframe.clientMGBD.MGBDP0310.MGBDP_BatchOutReg_MC.MG_MGBDL0310_Srch01Caller;
import mcframe.clientMGBD.MGBDP0310.MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd01Caller;
import mcframe.clientMGBD.MGBDP0310.MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd02Caller;
import mcframe.clientMGBD.MGBDP0310.MGBDP_BatchOutReg_MC.MG_MGBDL0310_Del01Caller;
import mcframe.clientMGBD.MGBDP0310.MGBDP_BatchOutReg_MC.MG_MGBDL0310_Imp01Caller;

/**
 * 画面"MGBDP_BatchOutReg"パネルクラスです。<p>
 *
 * 処理対象外バッチ情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_BatchOutReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0310";

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
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete,1;REF,View,2;EXE,Run batch,3 UPD,登録・訂正する,0;DEL,削除する,1;REF,参照する,2;EXE,バッチを実行する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_EXE = null;
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
	public MCLabel Cnd_batch_typ_Label = null;
	/**
	 * Cost batch type 原価バッチ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_batch_typ = null;
	/**
	 * Cost batch type name 原価バッチ区分名.<p>
	 *
	 */
	public MCTextField Cnd_batch_typ_nm = null;
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
	// [ExeCnd]ブロック関連のField定義
	public MCPanel ExeCndPanel = null;
	// [ExeCnd]ブロックの項目のField定義
	public MCLabel ExeCnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox ExeCnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField ExeCnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H ExeCnd_calc_no_p_PPanel;
	public MCTextComboBox ExeCnd_calc_no;	// [ExeCnd]の[calc_no_p.calc_no]を[ExeCnd_calc_no]としてエイリアス定義。
	public MCTextField ExeCnd_rmrks;	// [ExeCnd]の[calc_no_p.rmrks]を[ExeCnd_rmrks]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0310.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_nm = null;
	/**
	 * Cost batch type 原価バッチ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_batch_typ = null;
	/**
	 * Cost batch type name 原価バッチ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_batch_typ_nm = null;
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
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_no = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd2 = null;
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
	/** [EXE]モードを表す定数 */
	public static final String EXE = "EXE";
	/** [FIX_E]モードを表す定数 */
	public static final String FIX_E = "FIX_E";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH_REF, REF, SRCH_DEL, DEL, FIX_U, EXE, FIX_E};
	
	/** [MG_MGBDL0310_Srch01]のCallerの作成 */
	protected MGBDP_BatchOutReg_MC.MG_MGBDL0310_Srch01Caller createMG_MGBDL0310_Srch01() {
		MGBDP_BatchOutReg_MC.MG_MGBDL0310_Srch01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Srch01Bridge>
		caller = ((MGBDP_BatchOutReg_MC)this).new MG_MGBDL0310_Srch01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Srch01Bridge>(
					(MGBDP_BatchOutReg)this, new MG_MGBDL0310_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0310_Srch01]の呼び出し */
	protected void callMG_MGBDL0310_Srch01() {
		MCCaller caller = createMG_MGBDL0310_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0310_Upd01]のCallerの作成 */
	protected MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd01Caller createMG_MGBDL0310_Upd01() {
		MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Upd01Bridge>
		caller = ((MGBDP_BatchOutReg_MC)this).new MG_MGBDL0310_Upd01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Upd01Bridge>(
					(MGBDP_BatchOutReg)this, new MG_MGBDL0310_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0310_Upd01]の呼び出し */
	protected void callMG_MGBDL0310_Upd01() {
		MCCaller caller = createMG_MGBDL0310_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0310_Upd02]のCallerの作成 */
	protected MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd02Caller createMG_MGBDL0310_Upd02() {
		MGBDP_BatchOutReg_MC.MG_MGBDL0310_Upd02Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Upd02Bridge>
		caller = ((MGBDP_BatchOutReg_MC)this).new MG_MGBDL0310_Upd02Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Upd02Bridge>(
					(MGBDP_BatchOutReg)this, new MG_MGBDL0310_Upd02Bridge());
		return caller;
	}
	/** [MG_MGBDL0310_Upd02]の呼び出し */
	protected void callMG_MGBDL0310_Upd02() {
		MCCaller caller = createMG_MGBDL0310_Upd02();
		caller.exec();
	}
	/** [MG_MGBDL0310_Del01]のCallerの作成 */
	protected MGBDP_BatchOutReg_MC.MG_MGBDL0310_Del01Caller createMG_MGBDL0310_Del01() {
		MGBDP_BatchOutReg_MC.MG_MGBDL0310_Del01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Del01Bridge>
		caller = ((MGBDP_BatchOutReg_MC)this).new MG_MGBDL0310_Del01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Del01Bridge>(
					(MGBDP_BatchOutReg)this, new MG_MGBDL0310_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0310_Del01]の呼び出し */
	protected void callMG_MGBDL0310_Del01() {
		MCCaller caller = createMG_MGBDL0310_Del01();
		caller.exec();
	}
	/** [MG_MGBDL0310_Imp01]のCallerの作成 */
	protected MGBDP_BatchOutReg_MC.MG_MGBDL0310_Imp01Caller createMG_MGBDL0310_Imp01() {
		MGBDP_BatchOutReg_MC.MG_MGBDL0310_Imp01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Imp01Bridge>
		caller = ((MGBDP_BatchOutReg_MC)this).new MG_MGBDL0310_Imp01Caller<MGBDP_BatchOutReg, MG_MGBDL0310_Imp01Bridge>(
					(MGBDP_BatchOutReg)this, new MG_MGBDL0310_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBDL0310_Imp01]の呼び出し */
	protected void callMG_MGBDL0310_Imp01() {
		MCCaller caller = createMG_MGBDL0310_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0310.CndR aCndR;
	/** [ExeCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0310.ExeCndR aExeCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0310.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0310.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0310.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0310.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0310.CndR.create();
	}

	/**
	 * 項目コピーによってaExeCndRを設定します。
	 *
	 * aExeCndRのインスタンスは変更されません。
	 *
	 * @param row ExeCndR
	 */
	public void setExeCndR(mcframe.clientMGBD.MGBDP0310.ExeCndR row) {
		if (row != null) {
			MCRow.copyall(getExeCndR(), row);
		}
	}

	/**
	 * [ExeCnd]ブロックのコンテナaExeCndRを返します。
	 *
	 * @return ExeCndR
	 */
	public mcframe.clientMGBD.MGBDP0310.ExeCndR getExeCndR() {
		return aExeCndR;
	}

	/**
	 * aExeCndRを作成します。
	 *
	 * @return ExeCndR
	 */
	public mcframe.clientMGBD.MGBDP0310.ExeCndR createExeCndR() {
		return mcframe.clientMGBD.MGBDP0310.ExeCndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0310.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0310.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0310.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0310.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0310.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getExeCndR())) ret.add(getExeCndR());
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
		if(aCnt == getExeCndR()) return "ExeCnd";
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
		if(bId.equals("ExeCnd")) return getExeCndR();
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
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(ExeCndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_BatchOutReg_MC_A() {
		aCndR = createCndR();
		aExeCndR = createExeCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_BatchOutReg_MC_A(String name) {
		aCndR = createCndR();
		aExeCndR = createExeCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_BatchOutReg_MC.jbCreateScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateTop((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateFold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateCtrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateRslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateBtn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbCreateEastBtn((MGBDP_BatchOutReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_BatchOutReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_BatchOutReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_BatchOutReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_BatchOutReg p) {
	}

	/**
	 * [ExeCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExeCnd(MGBDP_BatchOutReg p) {
		p.ExeCnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getExeCndR().calc_no_p());
		p.ExeCnd_calc_no_p_PPanel.setName("ExeCnd.calc_no_p");
		p.ExeCnd_calc_no = p.ExeCnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.ExeCnd_calc_no.addAliasName("ExeCnd.calc_no", p);
		p.ExeCnd_rmrks = p.ExeCnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.ExeCnd_rmrks.addAliasName("ExeCnd.rmrks", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_BatchOutReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_BatchOutReg p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0310.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_BatchOutReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_BatchOutReg p) {
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
	
	
	/** [Cnd_batch_typ_ListPutter]の定義 */
	private MCListPutter Cnd_batch_typ_p = null;

	/**
	 * [Cnd_batch_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_batch_typ_ListPutter() {
		if (Cnd_batch_typ_p == null) {
			Cnd_batch_typ_p = createCnd_batch_typ_ListPutter(Cnd_batch_typ, "batch_typ", "batch_typ_nm");

		}
		return Cnd_batch_typ_p;
	}
	
	
	/** [ExeCnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter ExeCnd_calc_grp_cd_p = null;

	/**
	 * [ExeCnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getExeCnd_calc_grp_cd_ListPutter() {
		if (ExeCnd_calc_grp_cd_p == null) {
			ExeCnd_calc_grp_cd_p = createExeCnd_calc_grp_cd_ListPutter(ExeCnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return ExeCnd_calc_grp_cd_p;
	}
	
	
	/** [ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_p = createExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(ExeCnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
		}
		return ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Rslt_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_calc_grp_cd_p = null;

	/**
	 * [Rslt_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_calc_grp_cd_ListPutter() {
		if (Rslt_calc_grp_cd_p == null) {
			Rslt_calc_grp_cd_p = createRslt_calc_grp_cd_ListPutter(columnRslt_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Rslt_calc_grp_cd_p;
	}
	
	
	/** [Rslt_batch_typ_ListPutter]の定義 */
	private MCListPutter Rslt_batch_typ_p = null;

	/**
	 * [Rslt_batch_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_batch_typ_ListPutter() {
		if (Rslt_batch_typ_p == null) {
			Rslt_batch_typ_p = createRslt_batch_typ_ListPutter(columnRslt_batch_typ, "batch_typ", "batch_typ_nm");

		}
		return Rslt_batch_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BatchOutReg create(){
		MGBDP_BatchOutReg p = new MGBDP_BatchOutReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BatchOutReg create(String name){
		MGBDP_BatchOutReg p = new MGBDP_BatchOutReg(name);
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
		MGBDP_BatchOutReg_MC.jbfInitScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitTop((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitFold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitCtrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitRslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitBtn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbfInitEastBtn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitTop((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitFold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitCtrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitRslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitBtn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.jbInitEastBtn((MGBDP_BatchOutReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_EXE = p.beansFactory.createRadioButton("Cnd.ope_EXE");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_batch_typ_Label = p.beansFactory.createLabel("Cnd.batch_typ_Label");
		p.Cnd_batch_typ = p.beansFactory.createTextComboBox("Cnd.batch_typ");
		p.Cnd_batch_typ.setLabel(p.Cnd_batch_typ_Label);
		p.Cnd_batch_typ_nm = p.beansFactory.createTextField("Cnd.batch_typ_nm");
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
	}

	/**
	 * [ExeCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExeCnd(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.ExeCndPanel = p.beansFactory.createPanel("ExeCnd");
		// ブロックの項目の初期化
		p.ExeCnd_calc_grp_cd_Label = p.beansFactory.createLabel("ExeCnd.calc_grp_cd_Label");
		p.ExeCnd_calc_grp_cd = p.beansFactory.createTextComboBox("ExeCnd.calc_grp_cd");
		p.ExeCnd_calc_grp_cd.setLabel(p.ExeCnd_calc_grp_cd_Label);
		p.ExeCnd_calc_grp_nm = p.beansFactory.createTextField("ExeCnd.calc_grp_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_calc_grp_cd = p.beansFactory.createTableColumn("Rslt.calc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_calc_grp_nm = p.beansFactory.createTableColumn("Rslt.calc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_batch_typ = p.beansFactory.createTableColumn("Rslt.batch_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_batch_typ_nm = p.beansFactory.createTableColumn("Rslt.batch_typ_nm", MCColumnType.TEXT);
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
		p.columnRslt_calc_no = p.beansFactory.createTableColumn("Rslt.calc_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd2 = p.beansFactory.createButton("Btn.upd2", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_BatchOutReg p) {
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
	protected static void jbInitTop(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
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
	protected static void jbInitFold(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.CndPanel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.ExeCndPanel);
		p.FoldTab.add(p.ExeCndPanel, "Fold.tab2");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.CndPanel.setNextBeans(p.ExeCndPanel);
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_EXE);
		p.Cnd_ope_EXE.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_EXE);
		p.ScreenOpePanel.add(p.Cnd_ope_EXE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_batch_typ);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.calc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_grp_nm, true);
		p.Cnd_batch_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_batch_typ, true);
		p.Cnd_batch_typ.setLinkBeans(p.Cnd_batch_typ_nm);
		p.CndPanel.add(p.Cnd_batch_typ_Label);
		p.CndPanel.add(p.Cnd_batch_typ);
		p.Cnd_batch_typ.setNextBeans(p.Cnd_batch_typ_nm);
		p.Cnd_batch_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.batch_typ_META);
		p.CndPanel.add(p.Cnd_batch_typ_nm);
		p.Cnd_batch_typ_nm.setNextBeans(p.Cnd_rmrks);
		p.Cnd_batch_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.batch_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_batch_typ_nm, true);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0310.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
	}

	/**
	 * [ExeCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExeCnd(MGBDP_BatchOutReg p) {
		// ブロック関連の初期化
		p.ExeCndPanel.setValueCheck(false);
		p.ExeCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ExeCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ExeCnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.ExeCnd_calc_grp_cd.setLinkBeans(p.ExeCnd_calc_grp_nm);
		p.ExeCndPanel.add(p.ExeCnd_calc_grp_cd_Label);
		p.ExeCndPanel.add(p.ExeCnd_calc_grp_cd);
		p.ExeCndPanel.setLastBeans(p.ExeCnd_calc_grp_cd);
		p.ExeCnd_calc_grp_cd.setNextBeans(p.ExeCnd_calc_grp_nm);
		p.ExeCnd_calc_grp_cd.setRow(p.getExeCndR(), mcframe.clientMGBD.MGBDP0310.ExeCndR.calc_grp_cd_META);
		p.ExeCndPanel.add(p.ExeCnd_calc_grp_nm);
		p.ExeCnd_calc_grp_nm.setNextBeans(p.ExeCnd_calc_no_p_PPanel);
		p.ExeCnd_calc_grp_nm.setRow(p.getExeCndR(), mcframe.clientMGBD.MGBDP0310.ExeCndR.calc_grp_nm_META);
		p.ExeCndPanel.add(p.ExeCnd_calc_no_p_PPanel);
		p.ExeCnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.ExeCnd_rmrks);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_BatchOutReg p) {
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
	protected static void jbInitRslt(MGBDP_BatchOutReg p) {
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
	protected static void jbInitBtn(MGBDP_BatchOutReg p) {
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
		p.Btn_upd.setNextBeans(p.Btn_upd2);
		p.Btn_upd2.setIcon("REGISTER");
		p.Btn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd2);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_BatchOutReg p) {
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
		MGBDP_BatchOutReg_MC.mcInitScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitTop((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitFold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitCtrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitRslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitBtn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.mcInitEastBtn((MGBDP_BatchOutReg)this);

		// [UPD]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitUPD_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitUPD_EastBtn((MGBDP_BatchOutReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__REF_EastBtn((MGBDP_BatchOutReg)this);

		// [REF]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitREF_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitREF_EastBtn((MGBDP_BatchOutReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitSRCH__DEL_EastBtn((MGBDP_BatchOutReg)this);

		// [DEL]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitDEL_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitDEL_EastBtn((MGBDP_BatchOutReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitFIX__U_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__U_EastBtn((MGBDP_BatchOutReg)this);

		// [EXE]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitEXE_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitEXE_EastBtn((MGBDP_BatchOutReg)this);

		// [FIX_E]ステータスのモードの設定
		MGBDP_BatchOutReg_MC.statusInitFIX__E_ScreenOpe((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Top((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Fold((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Cnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_ExeCnd((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Ctrl((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Rslt((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_Btn((MGBDP_BatchOutReg)this);
		MGBDP_BatchOutReg_MC.statusInitFIX__E_EastBtn((MGBDP_BatchOutReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_BatchOutReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_BatchOutReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_BatchOutReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_BatchOutReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_EXE.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_batch_typ.setListListener(p);
		p.Cnd_batch_typ.addAllListener(p);
		p.Cnd_batch_typ_nm.setListListener(p);
		p.Cnd_batch_typ_nm.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [ExeCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExeCnd(MGBDP_BatchOutReg p) {
		p.ExeCnd_calc_grp_cd.setListListener(p);
		p.ExeCnd_calc_grp_cd.addAllListener(p);
		p.ExeCnd_calc_grp_nm.setListListener(p);
		p.ExeCnd_calc_grp_nm.addAllListener(p);
		p.ExeCnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_BatchOutReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_BatchOutReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_calc_grp_cd.addAllListener(p);
		p.columnRslt_calc_grp_cd.setListListener(p);
		p.columnRslt_calc_grp_nm.addAllListener(p);
		p.columnRslt_calc_grp_nm.setListListener(p);
		p.columnRslt_batch_typ.addAllListener(p);
		p.columnRslt_batch_typ.setListListener(p);
		p.columnRslt_batch_typ_nm.addAllListener(p);
		p.columnRslt_batch_typ_nm.setListListener(p);
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
		p.columnRslt_calc_no.addAllListener(p);
		p.columnRslt_calc_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_BatchOutReg p) {
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
		p.Btn_upd2.addAllListener(p);
		p.Btn_upd2.setAPMethodName("doBtn_upd2");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_BatchOutReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_batch_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(FIX_U, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_batch_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.columnRslt_calc_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [EXE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitEXE_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [EXE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [EXE]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [EXE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, EXE, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_calc_grp_nm.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_batch_typ.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_batch_typ_nm.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, EXE, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, EXE, MCMode.READ_ONLY);

	}

	/**
	 * [EXE]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitEXE_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, EXE, MCMode.REQUIRED);
		p.ExeCnd_calc_grp_nm.putMode(p, EXE, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(EXE, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);

	}

	/**
	 * [EXE]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(EXE, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [EXE]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, EXE, MCMode.REQUIRED);
		p.columnRslt_calc_grp_cd.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_batch_typ.putMode(p, EXE, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, EXE, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, EXE, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(EXE, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, EXE, MCMode.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, EXE, MCMode.INVISIBLE);

	}

	/**
	 * [EXE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitEXE_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, EXE, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, EXE, MCMode.ENABLE);
		p.Btn_radd.putMode(p, EXE, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, EXE, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, EXE, MCMode.DISABLE);
		p.Btn_upd.putMode(p, EXE, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, EXE, MCMode.ENABLE);
		p.Btn_del.putMode(p, EXE, MCMode.DISABLE);

	}

	/**
	 * [EXE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitEXE_EastBtn(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_E]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_ScreenOpe(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_E]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Top(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_E]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Fold(MGBDP_BatchOutReg p){

	}

	/**
	 * [FIX_E]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Cnd(MGBDP_BatchOutReg p){
		p.Cnd_ope_Group.putMode(p, FIX_E, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_batch_typ.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_batch_typ_nm.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_E, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_E, MCMode.ENABLE);

	}

	/**
	 * [FIX_E]ステータスの[ExeCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_ExeCnd(MGBDP_BatchOutReg p){
		p.ExeCnd_calc_grp_cd.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.ExeCnd_calc_grp_nm.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.ExeCnd_calc_no_p_PPanel.putStatus(FIX_E, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);

	}

	/**
	 * [FIX_E]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Ctrl(MGBDP_BatchOutReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_E, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [FIX_E]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Rslt(MGBDP_BatchOutReg p){
		p.columnRslt_check.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_batch_typ.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.columnRslt_batch_typ_nm.putMode(p, FIX_E, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_E, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, FIX_E, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_E]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_Btn(MGBDP_BatchOutReg p){
		p.Btn_select_all.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_E, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, FIX_E, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_E, MCMode.DISABLE);

	}

	/**
	 * [FIX_E]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__E_EastBtn(MGBDP_BatchOutReg p){

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
		MGBDP_BatchOutReg_MC.setTableConfigRslt((MGBDP_BatchOutReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_BatchOutReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_calc_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.calc_grp_cd_META);
		p.columnRslt_calc_grp_cd.addLinkBeans(p.columnRslt_calc_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_cd);
		p.columnRslt_calc_grp_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.calc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_nm);
		p.columnRslt_batch_typ.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.batch_typ_META);
		p.columnRslt_batch_typ.addLinkBeans(p.columnRslt_batch_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_batch_typ);
		p.columnRslt_batch_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.batch_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_batch_typ_nm);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_calc_no.setMeta(mcframe.clientMGBD.MGBDP0310.RsltR.calc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_no);
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
		Cnd_batch_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_batch_typ.getListConfig().setPutter(getCnd_batch_typ_ListPutter());
		ExeCnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		ExeCnd_calc_grp_cd.getListConfig().setPutter(getExeCnd_calc_grp_cd_ListPutter());
		ExeCnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		ExeCnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		columnRslt_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_grp_cd.getListConfig().setPutter(getRslt_calc_grp_cd_ListPutter());
		columnRslt_batch_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_batch_typ.getListConfig().setPutter(getRslt_batch_typ_ListPutter());
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
	 * この画面を[EXE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setEXEStatus() {
		status = EXE;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_E]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_EStatus() {
		status = FIX_E;
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
		else if (EXE.equals(status)) {
			setEXEStatus();
		}
		else if (FIX_E.equals(status)) {
			setFIX_EStatus();
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
	 * [Cnd_batch_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_batch_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.BatchTyp");
		return lp;
	}
	 
	/**
	 * [ExeCnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createExeCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [ExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createExeCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Rslt_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Rslt_batch_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_batch_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.BatchTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_batch_typ) return getCnd_batch_typ(row, info);
		if(combo == ExeCnd_calc_grp_cd) return getExeCnd_calc_grp_cd(row, info);
		if(combo == ExeCnd_calc_no_p_PPanel.CalcNo_calc_no) return getExeCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == columnRslt_calc_grp_cd) return getRslt_calc_grp_cd(row, info);
		if(combo == columnRslt_batch_typ) return getRslt_batch_typ(row, info);
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
		else if (ap == Btn_upd2) doBtn_upd2(info);
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
	 * [Btn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd2(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_batch_typ) return doCnd_batch_typ_VC(info);
		if (vc == Cnd_batch_typ_nm) return doCnd_batch_typ_nm_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == ExeCnd_calc_grp_cd) return doExeCnd_calc_grp_cd_VC(info);
		if (vc == ExeCnd_calc_grp_nm) return doExeCnd_calc_grp_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_calc_grp_cd) return doRslt_calc_grp_cd_VC(info);
		if (vc == columnRslt_calc_grp_nm) return doRslt_calc_grp_nm_VC(info);
		if (vc == columnRslt_batch_typ) return doRslt_batch_typ_VC(info);
		if (vc == columnRslt_batch_typ_nm) return doRslt_batch_typ_nm_VC(info);
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
		if (vc == columnRslt_calc_no) return doRslt_calc_no_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[batch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_typ_nm_VC(MCEventInfo info){
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
	 * [ExeCnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExeCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExeCnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExeCnd_calc_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[batch_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_batch_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[batch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_batch_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_no_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_batch_typ) doCnd_batch_typ_NC(info);
		else if (nc == Cnd_batch_typ_nm) doCnd_batch_typ_nm_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == ExeCnd_calc_grp_cd) doExeCnd_calc_grp_cd_NC(info);
		else if (nc == ExeCnd_calc_grp_nm) doExeCnd_calc_grp_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NC(info);
		else if (nc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NC(info);
		else if (nc == columnRslt_batch_typ) doRslt_batch_typ_NC(info);
		else if (nc == columnRslt_batch_typ_nm) doRslt_batch_typ_nm_NC(info);
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
		else if (nc == columnRslt_calc_no) doRslt_calc_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_nm_NC(MCEventInfo info){
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
	 * [ExeCnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ExeCnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_batch_typ) doCnd_batch_typ_NE(info);
		else if (ne == Cnd_batch_typ_nm) doCnd_batch_typ_nm_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == ExeCnd_calc_grp_cd) doExeCnd_calc_grp_cd_NE(info);
		else if (ne == ExeCnd_calc_grp_nm) doExeCnd_calc_grp_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NE(info);
		else if (ne == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NE(info);
		else if (ne == columnRslt_batch_typ) doRslt_batch_typ_NE(info);
		else if (ne == columnRslt_batch_typ_nm) doRslt_batch_typ_nm_NE(info);
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
		else if (ne == columnRslt_calc_no) doRslt_calc_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_nm_NE(MCEventInfo info){
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
	 * [ExeCnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ExeCnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_batch_typ) doCnd_batch_typ_NX(info);
		else if (nx == Cnd_batch_typ_nm) doCnd_batch_typ_nm_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == ExeCnd_calc_grp_cd) doExeCnd_calc_grp_cd_NX(info);
		else if (nx == ExeCnd_calc_grp_nm) doExeCnd_calc_grp_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NX(info);
		else if (nx == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NX(info);
		else if (nx == columnRslt_batch_typ) doRslt_batch_typ_NX(info);
		else if (nx == columnRslt_batch_typ_nm) doRslt_batch_typ_nm_NX(info);
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
		else if (nx == columnRslt_calc_no) doRslt_calc_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_nm_NX(MCEventInfo info){
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
	 * [ExeCnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ExeCnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_batch_typ) doCnd_batch_typ_LC(info);
		else if (lc == Cnd_batch_typ_nm) doCnd_batch_typ_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == ExeCnd_calc_grp_cd) doExeCnd_calc_grp_cd_LC(info);
		else if (lc == ExeCnd_calc_grp_nm) doExeCnd_calc_grp_nm_LC(info);
		else if (lc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_LC(info);
		else if (lc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_LC(info);
		else if (lc == columnRslt_batch_typ) doRslt_batch_typ_LC(info);
		else if (lc == columnRslt_batch_typ_nm) doRslt_batch_typ_nm_LC(info);
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
		else if (lc == columnRslt_calc_no) doRslt_calc_no_LC(info);
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
	 * [Cnd]パネルの[batch_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_typ_nm_LC(MCEventInfo info){
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
	 * [ExeCnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ExeCnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExeCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_batch_typ]の作成メソッド
	 */
	public MCList getCnd_batch_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getBatchTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[ExeCnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getExeCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[ExeCnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getExeCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_calc_grp_cd]の作成メソッド
	 */
	public MCList getRslt_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_batch_typ]の作成メソッド
	 */
	public MCList getRslt_batch_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getBatchTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0310.Srch01")) {
			return new MG_MGBDL0310_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0310.Upd01")) {
			return new MG_MGBDL0310_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0310.Upd02")) {
			return new MG_MGBDL0310_Upd02Bridge();
		}
		if (id.equals("MG.MGBDL0310.Del01")) {
			return new MG_MGBDL0310_Del01Bridge();
		}
		if (id.equals("MG.MGBDL0310.Imp01")) {
			return new MG_MGBDL0310_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0310_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0310_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0310_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0310_Srch01Bridge() {
			p_MG_MGBDL0310_Srch01 = new MCParam(PDef.MG_MGBDL0310_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0310_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0310.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));

			p_MG_MGBDL0310_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0310_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0310_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0310_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0310_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0310.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0310.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0310_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0310_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)p_MG_MGBDL0310_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0310_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0310_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0310_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0310_Upd01Bridge() {
			p_MG_MGBDL0310_Upd01 = new MCParam(PDef.MG_MGBDL0310_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0310_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));

			p_MG_MGBDL0310_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0310_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0310_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0310_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0310_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0310_Upd01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0310_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)p_MG_MGBDL0310_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0310_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0310_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0310_Upd02;

		/** コンストラクタ */
		protected MG_MGBDL0310_Upd02Bridge() {
			p_MG_MGBDL0310_Upd02 = new MCParam(PDef.MG_MGBDL0310_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0310_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
			// Down

			p_MG_MGBDL0310_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0310_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0310_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0310_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0310_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0310_Upd02;
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
	 * [MG_MGBDL0310_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0310_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0310_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0310_Del01Bridge() {
			p_MG_MGBDL0310_Del01 = new MCParam(PDef.MG_MGBDL0310_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0310_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));

			p_MG_MGBDL0310_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0310_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0310_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0310_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0310_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0310_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0310_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)p_MG_MGBDL0310_Del01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0310_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0310_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0310_Imp01;

		/** コンストラクタ */
		protected MG_MGBDL0310_Imp01Bridge() {
			p_MG_MGBDL0310_Imp01 = new MCParam(PDef.MG_MGBDL0310_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0310_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));

			p_MG_MGBDL0310_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0310_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0310_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0310_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0310_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0310.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0310_Imp01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0310.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0310_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0310.RsltR>)p_MG_MGBDL0310_Imp01.getContainerParam().getDownBlock(0));
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