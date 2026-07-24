package mcframe.clientMABC.MABCP0800;

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
import mcframe.clientMABC.MABCP0800.MABCP_SeqReg_MC.MA_MABCL0800_Srch01Caller;
import mcframe.clientMABC.MABCP0800.MABCP_SeqReg_MC.MA_MABCL0800_Upd01Caller;
import mcframe.clientMABC.MABCP0800.MABCP_SeqReg_MC.MA_MABCL0800_Del01Caller;

/**
 * 画面"MABCP_SeqReg"パネルクラスです。<p>
 *
 * 発番情報の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_SeqReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0800";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_num_biz_typ_Label = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCTextField Cnd_num_biz_typ_nm = null;
	public MCLabel Cnd_num_ptn_cd_Label = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCTextField Cnd_num_ptn_nm = null;
	public MCLabel Cnd_key_elm_Label = null;
	/**
	 * Key element キー要素.<p>
	 *
	 */
	public MCTextField Cnd_key_elm = null;
	public MCLabel Cnd_seq_typ_Label = null;
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_seq_typ = null;
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public MCTextField Cnd_seq_typ_nm = null;
	public MCLabel Cnd_ora_seq_nm_Label = null;
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public MCTextField Cnd_ora_seq_nm = null;
	/**
	 * Without numbering pattern master 発番パタンマスタなし.<p>
	 *
	 */
	public MCCheckBox Cnd_non_num_ptn = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0800.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_biz_typ_nm = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_ptn_nm = null;
	/**
	 * Key element キー要素.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key_elm = null;
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_seq_typ = null;
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_seq_typ_nm = null;
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ora_seq_nm = null;
	/**
	 * Sequence type_before change シーケンス区分_変更前.<p>
	 *
	 */
	public MCColumnConfig columnDtl_seq_typ_old = null;
	/**
	 * Update number 番号更新.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_upd_flg = null;
	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_min_val = null;
	/**
	 * Current value 現在値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_val = null;
	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_max_val = null;
	/**
	 * Increment 増加量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_increment_by = null;
	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cycl_flg = null;
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
	// [Row]ブロック関連のField定義
	public MCPanel RowPanel = null;
	public MCTitledBorder RowTitledBorder = null;
	// [Row]ブロックの項目のField定義
	public MCLabel Row_num_biz_typ_Label = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCTextComboBox Row_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCTextField Row_num_biz_typ_nm = null;
	public MCLabel Row_num_ptn_cd_Label = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Row_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCTextField Row_num_ptn_nm = null;
	public MCLabel Row_key_elm_Label = null;
	/**
	 * Key element キー要素.<p>
	 *
	 */
	public MCTextField Row_key_elm = null;
	public MCLabel Row_seq_typ_Label = null;
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public MCTextComboBox Row_seq_typ = null;
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public MCTextField Row_seq_typ_nm = null;
	public MCLabel Row_ora_seq_nm_Label = null;
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public MCTextField Row_ora_seq_nm = null;
	/**
	 * Update number 番号更新.<p>
	 *
	 */
	public MCCheckBox Row_num_upd_flg = null;
	public MCLabel Row_min_val_Label = null;
	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public MCNumberField Row_min_val = null;
	public MCLabel Row_last_val_Label = null;
	/**
	 * Current value 現在値.<p>
	 *
	 */
	public MCNumberField Row_last_val = null;
	public MCLabel Row_max_val_Label = null;
	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public MCNumberField Row_max_val = null;
	public MCLabel Row_increment_by_Label = null;
	/**
	 * Increment 増加量.<p>
	 *
	 */
	public MCNumberField Row_increment_by = null;
	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public MCCheckBox Row_cycl_flg = null;
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
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0800_Srch01]のCallerの作成 */
	protected MABCP_SeqReg_MC.MA_MABCL0800_Srch01Caller createMA_MABCL0800_Srch01() {
		MABCP_SeqReg_MC.MA_MABCL0800_Srch01Caller<MABCP_SeqReg, MA_MABCL0800_Srch01Bridge>
		caller = ((MABCP_SeqReg_MC)this).new MA_MABCL0800_Srch01Caller<MABCP_SeqReg, MA_MABCL0800_Srch01Bridge>(
					(MABCP_SeqReg)this, new MA_MABCL0800_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0800_Srch01]の呼び出し */
	protected void callMA_MABCL0800_Srch01() {
		MCCaller caller = createMA_MABCL0800_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0800_Upd01]のCallerの作成 */
	protected MABCP_SeqReg_MC.MA_MABCL0800_Upd01Caller createMA_MABCL0800_Upd01() {
		MABCP_SeqReg_MC.MA_MABCL0800_Upd01Caller<MABCP_SeqReg, MA_MABCL0800_Upd01Bridge>
		caller = ((MABCP_SeqReg_MC)this).new MA_MABCL0800_Upd01Caller<MABCP_SeqReg, MA_MABCL0800_Upd01Bridge>(
					(MABCP_SeqReg)this, new MA_MABCL0800_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0800_Upd01]の呼び出し */
	protected void callMA_MABCL0800_Upd01() {
		MCCaller caller = createMA_MABCL0800_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0800_Del01]のCallerの作成 */
	protected MABCP_SeqReg_MC.MA_MABCL0800_Del01Caller createMA_MABCL0800_Del01() {
		MABCP_SeqReg_MC.MA_MABCL0800_Del01Caller<MABCP_SeqReg, MA_MABCL0800_Del01Bridge>
		caller = ((MABCP_SeqReg_MC)this).new MA_MABCL0800_Del01Caller<MABCP_SeqReg, MA_MABCL0800_Del01Bridge>(
					(MABCP_SeqReg)this, new MA_MABCL0800_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0800_Del01]の呼び出し */
	protected void callMA_MABCL0800_Del01() {
		MCCaller caller = createMA_MABCL0800_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0800.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0800.DtlR> aDtlL;
	/** [Row]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0800.RowR aRowR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0800.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0800.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0800.CndR createCndR() {
		return mcframe.clientMABC.MABCP0800.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0800.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0800.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0800.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0800.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0800.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0800.DtlR.class);
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
	 * 項目コピーによってaRowRを設定します。
	 *
	 * aRowRのインスタンスは変更されません。
	 *
	 * @param row RowR
	 */
	public void setRowR(mcframe.clientMABC.MABCP0800.RowR row) {
		if (row != null) {
			MCRow.copyall(getRowR(), row);
		}
	}

	/**
	 * [Row]ブロックのコンテナaRowRを返します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0800.RowR getRowR() {
		return aRowR;
	}

	/**
	 * aRowRを作成します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0800.RowR createRowR() {
		return mcframe.clientMABC.MABCP0800.RowR.create();
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
		if(!MCCollectionUtil.contains(ret, getRowR())) ret.add(getRowR());
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
		if(aCnt == getRowR()) return "Row";
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
		if(bId.equals("Row")) return getRowR();
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
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(RowPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SeqReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aRowR = createRowR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_SeqReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aRowR = createRowR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_SeqReg_MC.jbCreateScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateTop((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateFold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateCnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateCtrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateDtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateRow((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateBtn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbCreateEastBtn((MABCP_SeqReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_SeqReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_SeqReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_SeqReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_SeqReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_SeqReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_SeqReg p) {
	}

	/**
	 * [Row]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRow(MABCP_SeqReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_SeqReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_SeqReg p) {
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

	
	/** [Cnd_num_biz_typ_ListPutter]の定義 */
	private MCListPutter Cnd_num_biz_typ_p = null;

	/**
	 * [Cnd_num_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_num_biz_typ_ListPutter() {
		if (Cnd_num_biz_typ_p == null) {
			Cnd_num_biz_typ_p = createCnd_num_biz_typ_ListPutter(Cnd_num_biz_typ, "num_biz_typ", "num_biz_typ_nm");

		}
		return Cnd_num_biz_typ_p;
	}
	
	
	/** [Cnd_num_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_num_ptn_cd_p = null;

	/**
	 * [Cnd_num_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_num_ptn_cd_ListPutter() {
		if (Cnd_num_ptn_cd_p == null) {
			Cnd_num_ptn_cd_p = createCnd_num_ptn_cd_ListPutter(Cnd_num_ptn_cd, "num_ptn_cd", "num_ptn_nm");

		}
		return Cnd_num_ptn_cd_p;
	}
	
	
	/** [Cnd_seq_typ_ListPutter]の定義 */
	private MCListPutter Cnd_seq_typ_p = null;

	/**
	 * [Cnd_seq_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_seq_typ_ListPutter() {
		if (Cnd_seq_typ_p == null) {
			Cnd_seq_typ_p = createCnd_seq_typ_ListPutter(Cnd_seq_typ, "seq_typ", "seq_typ_nm");

		}
		return Cnd_seq_typ_p;
	}
	
	
	/** [Row_num_biz_typ_ListPutter]の定義 */
	private MCListPutter Row_num_biz_typ_p = null;

	/**
	 * [Row_num_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getRow_num_biz_typ_ListPutter() {
		if (Row_num_biz_typ_p == null) {
			Row_num_biz_typ_p = createRow_num_biz_typ_ListPutter(Row_num_biz_typ, "num_biz_typ", "num_biz_typ_nm");

		}
		return Row_num_biz_typ_p;
	}
	
	
	/** [Row_num_ptn_cd_ListPutter]の定義 */
	private MCListPutter Row_num_ptn_cd_p = null;

	/**
	 * [Row_num_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRow_num_ptn_cd_ListPutter() {
		if (Row_num_ptn_cd_p == null) {
			Row_num_ptn_cd_p = createRow_num_ptn_cd_ListPutter(Row_num_ptn_cd, "num_ptn_cd", "num_ptn_nm");

		}
		return Row_num_ptn_cd_p;
	}
	
	
	/** [Row_seq_typ_ListPutter]の定義 */
	private MCListPutter Row_seq_typ_p = null;

	/**
	 * [Row_seq_typ_ListPutter]の取得
	 */
	protected MCListPutter getRow_seq_typ_ListPutter() {
		if (Row_seq_typ_p == null) {
			Row_seq_typ_p = createRow_seq_typ_ListPutter(Row_seq_typ, "seq_typ", "seq_typ_nm");

		}
		return Row_seq_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SeqReg create(){
		MABCP_SeqReg p = new MABCP_SeqReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SeqReg create(String name){
		MABCP_SeqReg p = new MABCP_SeqReg(name);
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
		MABCP_SeqReg_MC.jbfInitScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitTop((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitFold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitCnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitCtrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitDtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitRow((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitBtn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbfInitEastBtn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitTop((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitFold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitCnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitCtrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitDtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitRow((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitBtn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.jbInitEastBtn((MABCP_SeqReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_num_biz_typ_Label = p.beansFactory.createLabel("Cnd.num_biz_typ_Label");
		p.Cnd_num_biz_typ = p.beansFactory.createTextComboBox("Cnd.num_biz_typ");
		p.Cnd_num_biz_typ.setLabel(p.Cnd_num_biz_typ_Label);
		p.Cnd_num_biz_typ_nm = p.beansFactory.createTextField("Cnd.num_biz_typ_nm");
		p.Cnd_num_ptn_cd_Label = p.beansFactory.createLabel("Cnd.num_ptn_cd_Label");
		p.Cnd_num_ptn_cd = p.beansFactory.createTextComboBox("Cnd.num_ptn_cd");
		p.Cnd_num_ptn_cd.setLabel(p.Cnd_num_ptn_cd_Label);
		p.Cnd_num_ptn_nm = p.beansFactory.createTextField("Cnd.num_ptn_nm");
		p.Cnd_key_elm_Label = p.beansFactory.createLabel("Cnd.key_elm_Label");
		p.Cnd_key_elm = p.beansFactory.createTextField("Cnd.key_elm");
		p.Cnd_key_elm.setLabel(p.Cnd_key_elm_Label);
		p.Cnd_seq_typ_Label = p.beansFactory.createLabel("Cnd.seq_typ_Label");
		p.Cnd_seq_typ = p.beansFactory.createTextComboBox("Cnd.seq_typ");
		p.Cnd_seq_typ.setLabel(p.Cnd_seq_typ_Label);
		p.Cnd_seq_typ_nm = p.beansFactory.createTextField("Cnd.seq_typ_nm");
		p.Cnd_ora_seq_nm_Label = p.beansFactory.createLabel("Cnd.ora_seq_nm_Label");
		p.Cnd_ora_seq_nm = p.beansFactory.createTextField("Cnd.ora_seq_nm");
		p.Cnd_ora_seq_nm.setLabel(p.Cnd_ora_seq_nm_Label);
		p.Cnd_non_num_ptn = p.beansFactory.createCheckBox("Cnd.non_num_ptn");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_num_biz_typ = p.beansFactory.createTableColumn("Dtl.num_biz_typ", MCColumnType.TEXT);
		p.columnDtl_num_biz_typ_nm = p.beansFactory.createTableColumn("Dtl.num_biz_typ_nm", MCColumnType.TEXT);
		p.columnDtl_num_ptn_cd = p.beansFactory.createTableColumn("Dtl.num_ptn_cd", MCColumnType.TEXT);
		p.columnDtl_num_ptn_nm = p.beansFactory.createTableColumn("Dtl.num_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_key_elm = p.beansFactory.createTableColumn("Dtl.key_elm", MCColumnType.TEXT);
		p.columnDtl_seq_typ = p.beansFactory.createTableColumn("Dtl.seq_typ", MCColumnType.TEXT);
		p.columnDtl_seq_typ_nm = p.beansFactory.createTableColumn("Dtl.seq_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ora_seq_nm = p.beansFactory.createTableColumn("Dtl.ora_seq_nm", MCColumnType.TEXT);
		p.columnDtl_seq_typ_old = p.beansFactory.createTableColumn("Dtl.seq_typ_old", MCColumnType.TEXT);
		p.columnDtl_num_upd_flg = p.beansFactory.createTableColumn("Dtl.num_upd_flg", MCColumnType.CHECK);
		p.columnDtl_min_val = p.beansFactory.createTableColumn("Dtl.min_val", MCColumnType.NUMBER);
		p.columnDtl_last_val = p.beansFactory.createTableColumn("Dtl.last_val", MCColumnType.NUMBER);
		p.columnDtl_max_val = p.beansFactory.createTableColumn("Dtl.max_val", MCColumnType.NUMBER);
		p.columnDtl_increment_by = p.beansFactory.createTableColumn("Dtl.increment_by", MCColumnType.NUMBER);
		p.columnDtl_cycl_flg = p.beansFactory.createTableColumn("Dtl.cycl_flg", MCColumnType.CHECK);
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
	 * [Row]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRow(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.RowPanel = p.beansFactory.createPanel("Row");
		p.RowTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Row_num_biz_typ_Label = p.beansFactory.createLabel("Row.num_biz_typ_Label");
		p.Row_num_biz_typ = p.beansFactory.createTextComboBox("Row.num_biz_typ");
		p.Row_num_biz_typ.setLabel(p.Row_num_biz_typ_Label);
		p.Row_num_biz_typ_nm = p.beansFactory.createTextField("Row.num_biz_typ_nm");
		p.Row_num_ptn_cd_Label = p.beansFactory.createLabel("Row.num_ptn_cd_Label");
		p.Row_num_ptn_cd = p.beansFactory.createTextComboBox("Row.num_ptn_cd");
		p.Row_num_ptn_cd.setLabel(p.Row_num_ptn_cd_Label);
		p.Row_num_ptn_nm = p.beansFactory.createTextField("Row.num_ptn_nm");
		p.Row_key_elm_Label = p.beansFactory.createLabel("Row.key_elm_Label");
		p.Row_key_elm = p.beansFactory.createTextField("Row.key_elm");
		p.Row_key_elm.setLabel(p.Row_key_elm_Label);
		p.Row_seq_typ_Label = p.beansFactory.createLabel("Row.seq_typ_Label");
		p.Row_seq_typ = p.beansFactory.createTextComboBox("Row.seq_typ");
		p.Row_seq_typ.setLabel(p.Row_seq_typ_Label);
		p.Row_seq_typ_nm = p.beansFactory.createTextField("Row.seq_typ_nm");
		p.Row_ora_seq_nm_Label = p.beansFactory.createLabel("Row.ora_seq_nm_Label");
		p.Row_ora_seq_nm = p.beansFactory.createTextField("Row.ora_seq_nm");
		p.Row_ora_seq_nm.setLabel(p.Row_ora_seq_nm_Label);
		p.Row_num_upd_flg = p.beansFactory.createCheckBox("Row.num_upd_flg");
		p.Row_min_val_Label = p.beansFactory.createLabel("Row.min_val_Label");
		p.Row_min_val = p.beansFactory.createNumberField("Row.min_val");
		p.Row_min_val.setLabel(p.Row_min_val_Label);
		p.Row_last_val_Label = p.beansFactory.createLabel("Row.last_val_Label");
		p.Row_last_val = p.beansFactory.createNumberField("Row.last_val");
		p.Row_last_val.setLabel(p.Row_last_val_Label);
		p.Row_max_val_Label = p.beansFactory.createLabel("Row.max_val_Label");
		p.Row_max_val = p.beansFactory.createNumberField("Row.max_val");
		p.Row_max_val.setLabel(p.Row_max_val_Label);
		p.Row_increment_by_Label = p.beansFactory.createLabel("Row.increment_by_Label");
		p.Row_increment_by = p.beansFactory.createNumberField("Row.increment_by");
		p.Row_increment_by.setLabel(p.Row_increment_by_Label);
		p.Row_cycl_flg = p.beansFactory.createCheckBox("Row.cycl_flg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_SeqReg p) {
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
	protected static void jbfInitEastBtn(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_SeqReg p) {
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
	protected static void jbInitTop(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
	protected static void jbInitFold(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
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
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.ope_META);
		p.Cnd_num_biz_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_num_biz_typ, true);
		p.Cnd_num_biz_typ.setLinkBeans(p.Cnd_num_biz_typ_nm);
		p.CndPanel.add(p.Cnd_num_biz_typ_Label);
		p.CndPanel.add(p.Cnd_num_biz_typ);
		p.CndPanel.setLastBeans(p.Cnd_num_biz_typ);
		p.Cnd_num_biz_typ.setNextBeans(p.Cnd_num_biz_typ_nm);
		p.Cnd_num_biz_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.num_biz_typ_META);
		p.CndPanel.add(p.Cnd_num_biz_typ_nm);
		p.Cnd_num_biz_typ_nm.setNextBeans(p.Cnd_num_ptn_cd);
		p.Cnd_num_biz_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.num_biz_typ_nm_META);
		p.Cnd_num_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_num_ptn_cd, true);
		p.Cnd_num_ptn_cd.setLinkBeans(p.Cnd_num_ptn_nm);
		p.CndPanel.add(p.Cnd_num_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_num_ptn_cd);
		p.Cnd_num_ptn_cd.setNextBeans(p.Cnd_num_ptn_nm);
		p.Cnd_num_ptn_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.num_ptn_cd_META);
		p.CndPanel.add(p.Cnd_num_ptn_nm);
		p.Cnd_num_ptn_nm.setNextBeans(p.Cnd_key_elm);
		p.Cnd_num_ptn_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.num_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_num_ptn_nm, true);
		p.CndPanel.add(p.Cnd_key_elm_Label);
		p.CndPanel.add(p.Cnd_key_elm);
		p.Cnd_key_elm.setNextBeans(p.Cnd_seq_typ);
		p.Cnd_key_elm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.key_elm_META);
		p.setPluralValueEnable(p.Cnd_key_elm, true);
		p.Cnd_seq_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_seq_typ, true);
		p.Cnd_seq_typ.setLinkBeans(p.Cnd_seq_typ_nm);
		p.CndPanel.add(p.Cnd_seq_typ_Label);
		p.CndPanel.add(p.Cnd_seq_typ);
		p.Cnd_seq_typ.setNextBeans(p.Cnd_seq_typ_nm);
		p.Cnd_seq_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.seq_typ_META);
		p.CndPanel.add(p.Cnd_seq_typ_nm);
		p.Cnd_seq_typ_nm.setNextBeans(p.Cnd_ora_seq_nm);
		p.Cnd_seq_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.seq_typ_nm_META);
		p.CndPanel.add(p.Cnd_ora_seq_nm_Label);
		p.CndPanel.add(p.Cnd_ora_seq_nm);
		p.Cnd_ora_seq_nm.setNextBeans(p.Cnd_non_num_ptn);
		p.Cnd_ora_seq_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.ora_seq_nm_META);
		p.setPluralValueEnable(p.Cnd_ora_seq_nm, true);
		p.CndPanel.add(p.Cnd_non_num_ptn);
		p.Cnd_non_num_ptn.setRow(p.getCndR(), mcframe.clientMABC.MABCP0800.CndR.non_num_ptn_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_SeqReg p) {
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
	protected static void jbInitDtl(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.RowPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Row]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRow(MABCP_SeqReg p) {
		// ブロック関連の初期化
		p.RowPanel.setBorder(p.RowTitledBorder);
		p.add(p.RowPanel);
		p.RowPanel.setNextBeans(p.BtnPanel);
		p.RowPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Row_num_biz_typ.setListType(MCListType.STRICT);
		p.Row_num_biz_typ.setLinkBeans(p.Row_num_biz_typ_nm);
		p.RowPanel.add(p.Row_num_biz_typ_Label);
		p.RowPanel.add(p.Row_num_biz_typ);
		p.RowPanel.setLastBeans(p.Row_num_biz_typ);
		p.Row_num_biz_typ.setNextBeans(p.Row_num_biz_typ_nm);
		p.Row_num_biz_typ.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.num_biz_typ_META);
		p.RowPanel.add(p.Row_num_biz_typ_nm);
		p.Row_num_biz_typ_nm.setNextBeans(p.Row_num_ptn_cd);
		p.Row_num_biz_typ_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.num_biz_typ_nm_META);
		p.Row_num_ptn_cd.setListType(MCListType.STRICT);
		p.Row_num_ptn_cd.setLinkBeans(p.Row_num_ptn_nm);
		p.RowPanel.add(p.Row_num_ptn_cd_Label);
		p.RowPanel.add(p.Row_num_ptn_cd);
		p.Row_num_ptn_cd.setNextBeans(p.Row_num_ptn_nm);
		p.Row_num_ptn_cd.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.num_ptn_cd_META);
		p.RowPanel.add(p.Row_num_ptn_nm);
		p.Row_num_ptn_nm.setNextBeans(p.Row_key_elm);
		p.Row_num_ptn_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.num_ptn_nm_META);
		p.RowPanel.add(p.Row_key_elm_Label);
		p.RowPanel.add(p.Row_key_elm);
		p.Row_key_elm.setNextBeans(p.Row_seq_typ);
		p.Row_key_elm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.key_elm_META);
		p.Row_seq_typ.setListType(MCListType.STRICT);
		p.Row_seq_typ.setLinkBeans(p.Row_seq_typ_nm);
		p.RowPanel.add(p.Row_seq_typ_Label);
		p.RowPanel.add(p.Row_seq_typ);
		p.Row_seq_typ.setNextBeans(p.Row_seq_typ_nm);
		p.Row_seq_typ.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.seq_typ_META);
		p.RowPanel.add(p.Row_seq_typ_nm);
		p.Row_seq_typ_nm.setNextBeans(p.Row_ora_seq_nm);
		p.Row_seq_typ_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.seq_typ_nm_META);
		p.RowPanel.add(p.Row_ora_seq_nm_Label);
		p.RowPanel.add(p.Row_ora_seq_nm);
		p.Row_ora_seq_nm.setNextBeans(p.Row_num_upd_flg);
		p.Row_ora_seq_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.ora_seq_nm_META);
		p.RowPanel.add(p.Row_num_upd_flg);
		p.Row_num_upd_flg.setNextBeans(p.Row_min_val);
		p.Row_num_upd_flg.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.num_upd_flg_META);
		p.RowPanel.add(p.Row_min_val_Label);
		p.RowPanel.add(p.Row_min_val);
		p.Row_min_val.setNextBeans(p.Row_last_val);
		p.Row_min_val.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.min_val_META);
		p.RowPanel.add(p.Row_last_val_Label);
		p.RowPanel.add(p.Row_last_val);
		p.Row_last_val.setNextBeans(p.Row_max_val);
		p.Row_last_val.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.last_val_META);
		p.RowPanel.add(p.Row_max_val_Label);
		p.RowPanel.add(p.Row_max_val);
		p.Row_max_val.setNextBeans(p.Row_increment_by);
		p.Row_max_val.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.max_val_META);
		p.RowPanel.add(p.Row_increment_by_Label);
		p.RowPanel.add(p.Row_increment_by);
		p.Row_increment_by.setNextBeans(p.Row_cycl_flg);
		p.Row_increment_by.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.increment_by_META);
		p.RowPanel.add(p.Row_cycl_flg);
		p.Row_cycl_flg.setRow(p.getRowR(), mcframe.clientMABC.MABCP0800.RowR.cycl_flg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_SeqReg p) {
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
	protected static void jbInitEastBtn(MABCP_SeqReg p) {
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
		MABCP_SeqReg_MC.mcInitScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitTop((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitFold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitCnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitCtrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitDtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitRow((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitBtn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.mcInitEastBtn((MABCP_SeqReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_SeqReg_MC.statusInitUPD_ScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Top((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Fold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Cnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Ctrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Dtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Row((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_Btn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitUPD_EastBtn((MABCP_SeqReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_SeqReg_MC.statusInitFIX_ScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Top((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Fold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Cnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Ctrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Dtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Row((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_Btn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitFIX_EastBtn((MABCP_SeqReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_SeqReg_MC.statusInitDEL_ScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Top((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Fold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Cnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Ctrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Dtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Row((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_Btn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitDEL_EastBtn((MABCP_SeqReg)this);

		// [REF]ステータスのモードの設定
		MABCP_SeqReg_MC.statusInitREF_ScreenOpe((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Top((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Fold((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Cnd((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Ctrl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Dtl((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Row((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_Btn((MABCP_SeqReg)this);
		MABCP_SeqReg_MC.statusInitREF_EastBtn((MABCP_SeqReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_SeqReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_SeqReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_SeqReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_SeqReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_num_biz_typ.setListListener(p);
		p.Cnd_num_biz_typ.addAllListener(p);
		p.Cnd_num_biz_typ_nm.setListListener(p);
		p.Cnd_num_biz_typ_nm.addAllListener(p);
		p.Cnd_num_ptn_cd.setListListener(p);
		p.Cnd_num_ptn_cd.addAllListener(p);
		p.Cnd_num_ptn_nm.setListListener(p);
		p.Cnd_num_ptn_nm.addAllListener(p);
		p.Cnd_key_elm.setListListener(p);
		p.Cnd_key_elm.addAllListener(p);
		p.Cnd_seq_typ.setListListener(p);
		p.Cnd_seq_typ.addAllListener(p);
		p.Cnd_seq_typ_nm.setListListener(p);
		p.Cnd_seq_typ_nm.addAllListener(p);
		p.Cnd_ora_seq_nm.setListListener(p);
		p.Cnd_ora_seq_nm.addAllListener(p);
		p.Cnd_non_num_ptn.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_SeqReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_SeqReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_num_biz_typ.addAllListener(p);
		p.columnDtl_num_biz_typ.setListListener(p);
		p.columnDtl_num_biz_typ_nm.addAllListener(p);
		p.columnDtl_num_biz_typ_nm.setListListener(p);
		p.columnDtl_num_ptn_cd.addAllListener(p);
		p.columnDtl_num_ptn_cd.setListListener(p);
		p.columnDtl_num_ptn_nm.addAllListener(p);
		p.columnDtl_num_ptn_nm.setListListener(p);
		p.columnDtl_key_elm.addAllListener(p);
		p.columnDtl_key_elm.setListListener(p);
		p.columnDtl_seq_typ.addAllListener(p);
		p.columnDtl_seq_typ.setListListener(p);
		p.columnDtl_seq_typ_nm.addAllListener(p);
		p.columnDtl_seq_typ_nm.setListListener(p);
		p.columnDtl_ora_seq_nm.addAllListener(p);
		p.columnDtl_ora_seq_nm.setListListener(p);
		p.columnDtl_seq_typ_old.addAllListener(p);
		p.columnDtl_seq_typ_old.setListListener(p);
		p.columnDtl_num_upd_flg.addAllListener(p);
		p.columnDtl_min_val.addAllListener(p);
		p.columnDtl_min_val.setListListener(p);
		p.columnDtl_last_val.addAllListener(p);
		p.columnDtl_last_val.setListListener(p);
		p.columnDtl_max_val.addAllListener(p);
		p.columnDtl_max_val.setListListener(p);
		p.columnDtl_increment_by.addAllListener(p);
		p.columnDtl_increment_by.setListListener(p);
		p.columnDtl_cycl_flg.addAllListener(p);
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
	 *  [Row]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRow(MABCP_SeqReg p) {
		p.Row_num_biz_typ.setListListener(p);
		p.Row_num_biz_typ.addAllListener(p);
		p.Row_num_biz_typ_nm.setListListener(p);
		p.Row_num_biz_typ_nm.addAllListener(p);
		p.Row_num_ptn_cd.setListListener(p);
		p.Row_num_ptn_cd.addAllListener(p);
		p.Row_num_ptn_nm.setListListener(p);
		p.Row_num_ptn_nm.addAllListener(p);
		p.Row_key_elm.setListListener(p);
		p.Row_key_elm.addAllListener(p);
		p.Row_seq_typ.setListListener(p);
		p.Row_seq_typ.addAllListener(p);
		p.Row_seq_typ_nm.setListListener(p);
		p.Row_seq_typ_nm.addAllListener(p);
		p.Row_ora_seq_nm.setListListener(p);
		p.Row_ora_seq_nm.addAllListener(p);
		p.Row_num_upd_flg.addAllListener(p);
		p.Row_min_val.setListListener(p);
		p.Row_min_val.addAllListener(p);
		p.Row_last_val.setListListener(p);
		p.Row_last_val.addAllListener(p);
		p.Row_max_val.setListListener(p);
		p.Row_max_val.addAllListener(p);
		p.Row_increment_by.setListListener(p);
		p.Row_increment_by.addAllListener(p);
		p.Row_cycl_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_SeqReg p) {
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
	protected static void mcInitEastBtn(MABCP_SeqReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_SeqReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_SeqReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_SeqReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_SeqReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key_elm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_seq_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_seq_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ora_seq_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_non_num_ptn.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_SeqReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_SeqReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_num_biz_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_key_elm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_seq_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ora_seq_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_old.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_num_upd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_min_val.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_last_val.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_max_val.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_increment_by.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cycl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Row(MABCP_SeqReg p){
		p.Row_num_biz_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_num_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_key_elm.putMode(p, UPD, MCMode.ENABLE);
		p.Row_seq_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_seq_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_ora_seq_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_num_upd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_min_val.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_last_val.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_max_val.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_increment_by.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_cycl_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_SeqReg p){
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
	protected static void statusInitUPD_EastBtn(MABCP_SeqReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_SeqReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_SeqReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_SeqReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_SeqReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key_elm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_seq_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_seq_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ora_seq_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_non_num_ptn.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_SeqReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_SeqReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key_elm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_seq_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ora_seq_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_old.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_num_upd_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_min_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_last_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_max_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_increment_by.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cycl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Row(MABCP_SeqReg p){
		p.Row_num_biz_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_key_elm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_seq_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_seq_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_ora_seq_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_upd_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_min_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_last_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_max_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_increment_by.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_cycl_flg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_SeqReg p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_SeqReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_SeqReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_SeqReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_SeqReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_SeqReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key_elm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_seq_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_seq_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ora_seq_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_non_num_ptn.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_SeqReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_SeqReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_num_biz_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key_elm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_seq_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ora_seq_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_old.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_num_upd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_min_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_last_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_max_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_increment_by.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cycl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Row(MABCP_SeqReg p){
		p.Row_num_biz_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_key_elm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_seq_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_seq_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_ora_seq_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_min_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_last_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_max_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_increment_by.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_cycl_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_SeqReg p){
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
	protected static void statusInitDEL_EastBtn(MABCP_SeqReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_SeqReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_SeqReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_SeqReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_SeqReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_key_elm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_seq_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_seq_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ora_seq_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_non_num_ptn.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_SeqReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_SeqReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_num_biz_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_key_elm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_seq_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ora_seq_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_seq_typ_old.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_num_upd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_min_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_max_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_increment_by.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cycl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitREF_Row(MABCP_SeqReg p){
		p.Row_num_biz_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_key_elm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_seq_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_seq_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_ora_seq_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_min_val.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_last_val.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_max_val.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_increment_by.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_cycl_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_SeqReg p){
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
	protected static void statusInitREF_EastBtn(MABCP_SeqReg p){

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
		MABCP_SeqReg_MC.setTableConfigDtl((MABCP_SeqReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_SeqReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0800.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_num_biz_typ.setMeta(mcframe.clientMABC.MABCP0800.DtlR.num_biz_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_biz_typ);
		p.columnDtl_num_biz_typ_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.num_biz_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_biz_typ_nm);
		p.columnDtl_num_ptn_cd.setMeta(mcframe.clientMABC.MABCP0800.DtlR.num_ptn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_ptn_cd);
		p.columnDtl_num_ptn_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.num_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_ptn_nm);
		p.columnDtl_key_elm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.key_elm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key_elm);
		p.columnDtl_seq_typ.setMeta(mcframe.clientMABC.MABCP0800.DtlR.seq_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_seq_typ);
		p.columnDtl_seq_typ_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.seq_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_seq_typ_nm);
		p.columnDtl_ora_seq_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ora_seq_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ora_seq_nm);
		p.columnDtl_seq_typ_old.setMeta(mcframe.clientMABC.MABCP0800.DtlR.seq_typ_old_META);
		p.DtlTable.addColumnConfig(p.columnDtl_seq_typ_old);
		p.columnDtl_num_upd_flg.setMeta(mcframe.clientMABC.MABCP0800.DtlR.num_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_upd_flg);
		p.columnDtl_min_val.setMeta(mcframe.clientMABC.MABCP0800.DtlR.min_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_min_val);
		p.columnDtl_last_val.setMeta(mcframe.clientMABC.MABCP0800.DtlR.last_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_val);
		p.columnDtl_max_val.setMeta(mcframe.clientMABC.MABCP0800.DtlR.max_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_max_val);
		p.columnDtl_increment_by.setMeta(mcframe.clientMABC.MABCP0800.DtlR.increment_by_META);
		p.DtlTable.addColumnConfig(p.columnDtl_increment_by);
		p.columnDtl_cycl_flg.setMeta(mcframe.clientMABC.MABCP0800.DtlR.cycl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cycl_flg);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0800.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_num_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_num_biz_typ.getListConfig().setPutter(getCnd_num_biz_typ_ListPutter());
		Cnd_num_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_num_ptn_cd.getListConfig().setPutter(getCnd_num_ptn_cd_ListPutter());
		Cnd_seq_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_seq_typ.getListConfig().setPutter(getCnd_seq_typ_ListPutter());
		Row_num_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_num_biz_typ.getListConfig().setPutter(getRow_num_biz_typ_ListPutter());
		Row_num_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_num_ptn_cd.getListConfig().setPutter(getRow_num_ptn_cd_ListPutter());
		Row_seq_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_seq_typ.getListConfig().setPutter(getRow_seq_typ_ListPutter());
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
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
		else if (DEL.equals(status)) {
			setDELStatus();
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
	 * [Cnd_num_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_num_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumBizTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_num_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_num_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_seq_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_seq_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SeqTyp");
		return lp;
	}
	 
	/**
	 * [Row_num_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createRow_num_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumBizTyp");
		return lp;
	}
	 
	/**
	 * [Row_num_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRow_num_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Row_seq_typ_ListPutter]の作成
	 */
	protected MCListPutter createRow_seq_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SeqTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_num_biz_typ) return getCnd_num_biz_typ(row, info);
		if(combo == Cnd_num_ptn_cd) return getCnd_num_ptn_cd(row, info);
		if(combo == Cnd_seq_typ) return getCnd_seq_typ(row, info);
		if(combo == Row_num_biz_typ) return getRow_num_biz_typ(row, info);
		if(combo == Row_num_ptn_cd) return getRow_num_ptn_cd(row, info);
		if(combo == Row_seq_typ) return getRow_seq_typ(row, info);
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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_num_biz_typ) return doCnd_num_biz_typ_VC(info);
		if (vc == Cnd_num_biz_typ_nm) return doCnd_num_biz_typ_nm_VC(info);
		if (vc == Cnd_num_ptn_cd) return doCnd_num_ptn_cd_VC(info);
		if (vc == Cnd_num_ptn_nm) return doCnd_num_ptn_nm_VC(info);
		if (vc == Cnd_key_elm) return doCnd_key_elm_VC(info);
		if (vc == Cnd_seq_typ) return doCnd_seq_typ_VC(info);
		if (vc == Cnd_seq_typ_nm) return doCnd_seq_typ_nm_VC(info);
		if (vc == Cnd_ora_seq_nm) return doCnd_ora_seq_nm_VC(info);
		if (vc == Cnd_non_num_ptn) return doCnd_non_num_ptn_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_num_biz_typ) return doDtl_num_biz_typ_VC(info);
		if (vc == columnDtl_num_biz_typ_nm) return doDtl_num_biz_typ_nm_VC(info);
		if (vc == columnDtl_num_ptn_cd) return doDtl_num_ptn_cd_VC(info);
		if (vc == columnDtl_num_ptn_nm) return doDtl_num_ptn_nm_VC(info);
		if (vc == columnDtl_key_elm) return doDtl_key_elm_VC(info);
		if (vc == columnDtl_seq_typ) return doDtl_seq_typ_VC(info);
		if (vc == columnDtl_seq_typ_nm) return doDtl_seq_typ_nm_VC(info);
		if (vc == columnDtl_ora_seq_nm) return doDtl_ora_seq_nm_VC(info);
		if (vc == columnDtl_seq_typ_old) return doDtl_seq_typ_old_VC(info);
		if (vc == columnDtl_num_upd_flg) return doDtl_num_upd_flg_VC(info);
		if (vc == columnDtl_min_val) return doDtl_min_val_VC(info);
		if (vc == columnDtl_last_val) return doDtl_last_val_VC(info);
		if (vc == columnDtl_max_val) return doDtl_max_val_VC(info);
		if (vc == columnDtl_increment_by) return doDtl_increment_by_VC(info);
		if (vc == columnDtl_cycl_flg) return doDtl_cycl_flg_VC(info);
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
		if (vc == Row_num_biz_typ) return doRow_num_biz_typ_VC(info);
		if (vc == Row_num_biz_typ_nm) return doRow_num_biz_typ_nm_VC(info);
		if (vc == Row_num_ptn_cd) return doRow_num_ptn_cd_VC(info);
		if (vc == Row_num_ptn_nm) return doRow_num_ptn_nm_VC(info);
		if (vc == Row_key_elm) return doRow_key_elm_VC(info);
		if (vc == Row_seq_typ) return doRow_seq_typ_VC(info);
		if (vc == Row_seq_typ_nm) return doRow_seq_typ_nm_VC(info);
		if (vc == Row_ora_seq_nm) return doRow_ora_seq_nm_VC(info);
		if (vc == Row_num_upd_flg) return doRow_num_upd_flg_VC(info);
		if (vc == Row_min_val) return doRow_min_val_VC(info);
		if (vc == Row_last_val) return doRow_last_val_VC(info);
		if (vc == Row_max_val) return doRow_max_val_VC(info);
		if (vc == Row_increment_by) return doRow_increment_by_VC(info);
		if (vc == Row_cycl_flg) return doRow_cycl_flg_VC(info);
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
	 * [Cnd]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key_elm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key_elm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[seq_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_seq_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[seq_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_seq_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ora_seq_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ora_seq_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_num_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_num_ptn_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key_elm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key_elm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[seq_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_seq_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[seq_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_seq_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ora_seq_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ora_seq_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[seq_typ_old]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_seq_typ_old_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[min_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_min_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[max_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_max_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[increment_by]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_increment_by_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cycl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cycl_flg_VC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[key_elm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_key_elm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[seq_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_seq_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[seq_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_seq_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[ora_seq_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_ora_seq_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[min_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_min_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[last_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_last_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[max_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_max_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[increment_by]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_increment_by_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[cycl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_cycl_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_num_biz_typ) doCnd_num_biz_typ_NC(info);
		else if (nc == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NC(info);
		else if (nc == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NC(info);
		else if (nc == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NC(info);
		else if (nc == Cnd_key_elm) doCnd_key_elm_NC(info);
		else if (nc == Cnd_seq_typ) doCnd_seq_typ_NC(info);
		else if (nc == Cnd_seq_typ_nm) doCnd_seq_typ_nm_NC(info);
		else if (nc == Cnd_ora_seq_nm) doCnd_ora_seq_nm_NC(info);
		else if (nc == Cnd_non_num_ptn) doCnd_non_num_ptn_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_num_biz_typ) doDtl_num_biz_typ_NC(info);
		else if (nc == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NC(info);
		else if (nc == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NC(info);
		else if (nc == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NC(info);
		else if (nc == columnDtl_key_elm) doDtl_key_elm_NC(info);
		else if (nc == columnDtl_seq_typ) doDtl_seq_typ_NC(info);
		else if (nc == columnDtl_seq_typ_nm) doDtl_seq_typ_nm_NC(info);
		else if (nc == columnDtl_ora_seq_nm) doDtl_ora_seq_nm_NC(info);
		else if (nc == columnDtl_seq_typ_old) doDtl_seq_typ_old_NC(info);
		else if (nc == columnDtl_num_upd_flg) doDtl_num_upd_flg_NC(info);
		else if (nc == columnDtl_min_val) doDtl_min_val_NC(info);
		else if (nc == columnDtl_last_val) doDtl_last_val_NC(info);
		else if (nc == columnDtl_max_val) doDtl_max_val_NC(info);
		else if (nc == columnDtl_increment_by) doDtl_increment_by_NC(info);
		else if (nc == columnDtl_cycl_flg) doDtl_cycl_flg_NC(info);
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
		else if (nc == Row_num_biz_typ) doRow_num_biz_typ_NC(info);
		else if (nc == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NC(info);
		else if (nc == Row_num_ptn_cd) doRow_num_ptn_cd_NC(info);
		else if (nc == Row_num_ptn_nm) doRow_num_ptn_nm_NC(info);
		else if (nc == Row_key_elm) doRow_key_elm_NC(info);
		else if (nc == Row_seq_typ) doRow_seq_typ_NC(info);
		else if (nc == Row_seq_typ_nm) doRow_seq_typ_nm_NC(info);
		else if (nc == Row_ora_seq_nm) doRow_ora_seq_nm_NC(info);
		else if (nc == Row_num_upd_flg) doRow_num_upd_flg_NC(info);
		else if (nc == Row_min_val) doRow_min_val_NC(info);
		else if (nc == Row_last_val) doRow_last_val_NC(info);
		else if (nc == Row_max_val) doRow_max_val_NC(info);
		else if (nc == Row_increment_by) doRow_increment_by_NC(info);
		else if (nc == Row_cycl_flg) doRow_cycl_flg_NC(info);
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_elm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_elm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ora_seq_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ora_seq_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_num_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_num_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_elm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_elm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ora_seq_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ora_seq_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_old]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_old_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[min_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_min_val_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_val_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_val_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[increment_by]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_increment_by_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cycl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cycl_flg_NC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_elm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_elm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[ora_seq_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_ora_seq_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[min_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_min_val_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[last_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_last_val_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_val_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[increment_by]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_increment_by_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[cycl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_cycl_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_num_biz_typ) doCnd_num_biz_typ_NE(info);
		else if (ne == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NE(info);
		else if (ne == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NE(info);
		else if (ne == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NE(info);
		else if (ne == Cnd_key_elm) doCnd_key_elm_NE(info);
		else if (ne == Cnd_seq_typ) doCnd_seq_typ_NE(info);
		else if (ne == Cnd_seq_typ_nm) doCnd_seq_typ_nm_NE(info);
		else if (ne == Cnd_ora_seq_nm) doCnd_ora_seq_nm_NE(info);
		else if (ne == Cnd_non_num_ptn) doCnd_non_num_ptn_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_num_biz_typ) doDtl_num_biz_typ_NE(info);
		else if (ne == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NE(info);
		else if (ne == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NE(info);
		else if (ne == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NE(info);
		else if (ne == columnDtl_key_elm) doDtl_key_elm_NE(info);
		else if (ne == columnDtl_seq_typ) doDtl_seq_typ_NE(info);
		else if (ne == columnDtl_seq_typ_nm) doDtl_seq_typ_nm_NE(info);
		else if (ne == columnDtl_ora_seq_nm) doDtl_ora_seq_nm_NE(info);
		else if (ne == columnDtl_seq_typ_old) doDtl_seq_typ_old_NE(info);
		else if (ne == columnDtl_num_upd_flg) doDtl_num_upd_flg_NE(info);
		else if (ne == columnDtl_min_val) doDtl_min_val_NE(info);
		else if (ne == columnDtl_last_val) doDtl_last_val_NE(info);
		else if (ne == columnDtl_max_val) doDtl_max_val_NE(info);
		else if (ne == columnDtl_increment_by) doDtl_increment_by_NE(info);
		else if (ne == columnDtl_cycl_flg) doDtl_cycl_flg_NE(info);
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
		else if (ne == Row_num_biz_typ) doRow_num_biz_typ_NE(info);
		else if (ne == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NE(info);
		else if (ne == Row_num_ptn_cd) doRow_num_ptn_cd_NE(info);
		else if (ne == Row_num_ptn_nm) doRow_num_ptn_nm_NE(info);
		else if (ne == Row_key_elm) doRow_key_elm_NE(info);
		else if (ne == Row_seq_typ) doRow_seq_typ_NE(info);
		else if (ne == Row_seq_typ_nm) doRow_seq_typ_nm_NE(info);
		else if (ne == Row_ora_seq_nm) doRow_ora_seq_nm_NE(info);
		else if (ne == Row_num_upd_flg) doRow_num_upd_flg_NE(info);
		else if (ne == Row_min_val) doRow_min_val_NE(info);
		else if (ne == Row_last_val) doRow_last_val_NE(info);
		else if (ne == Row_max_val) doRow_max_val_NE(info);
		else if (ne == Row_increment_by) doRow_increment_by_NE(info);
		else if (ne == Row_cycl_flg) doRow_cycl_flg_NE(info);
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_elm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_elm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ora_seq_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ora_seq_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_num_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_num_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_elm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_elm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ora_seq_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ora_seq_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_old]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_old_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[min_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_min_val_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_val_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_val_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[increment_by]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_increment_by_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cycl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cycl_flg_NE(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_elm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_elm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[ora_seq_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_ora_seq_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[min_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_min_val_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[last_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_last_val_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_val_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[increment_by]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_increment_by_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[cycl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_cycl_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_num_biz_typ) doCnd_num_biz_typ_NX(info);
		else if (nx == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NX(info);
		else if (nx == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NX(info);
		else if (nx == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NX(info);
		else if (nx == Cnd_key_elm) doCnd_key_elm_NX(info);
		else if (nx == Cnd_seq_typ) doCnd_seq_typ_NX(info);
		else if (nx == Cnd_seq_typ_nm) doCnd_seq_typ_nm_NX(info);
		else if (nx == Cnd_ora_seq_nm) doCnd_ora_seq_nm_NX(info);
		else if (nx == Cnd_non_num_ptn) doCnd_non_num_ptn_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_num_biz_typ) doDtl_num_biz_typ_NX(info);
		else if (nx == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NX(info);
		else if (nx == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NX(info);
		else if (nx == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NX(info);
		else if (nx == columnDtl_key_elm) doDtl_key_elm_NX(info);
		else if (nx == columnDtl_seq_typ) doDtl_seq_typ_NX(info);
		else if (nx == columnDtl_seq_typ_nm) doDtl_seq_typ_nm_NX(info);
		else if (nx == columnDtl_ora_seq_nm) doDtl_ora_seq_nm_NX(info);
		else if (nx == columnDtl_seq_typ_old) doDtl_seq_typ_old_NX(info);
		else if (nx == columnDtl_num_upd_flg) doDtl_num_upd_flg_NX(info);
		else if (nx == columnDtl_min_val) doDtl_min_val_NX(info);
		else if (nx == columnDtl_last_val) doDtl_last_val_NX(info);
		else if (nx == columnDtl_max_val) doDtl_max_val_NX(info);
		else if (nx == columnDtl_increment_by) doDtl_increment_by_NX(info);
		else if (nx == columnDtl_cycl_flg) doDtl_cycl_flg_NX(info);
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
		else if (nx == Row_num_biz_typ) doRow_num_biz_typ_NX(info);
		else if (nx == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NX(info);
		else if (nx == Row_num_ptn_cd) doRow_num_ptn_cd_NX(info);
		else if (nx == Row_num_ptn_nm) doRow_num_ptn_nm_NX(info);
		else if (nx == Row_key_elm) doRow_key_elm_NX(info);
		else if (nx == Row_seq_typ) doRow_seq_typ_NX(info);
		else if (nx == Row_seq_typ_nm) doRow_seq_typ_nm_NX(info);
		else if (nx == Row_ora_seq_nm) doRow_ora_seq_nm_NX(info);
		else if (nx == Row_num_upd_flg) doRow_num_upd_flg_NX(info);
		else if (nx == Row_min_val) doRow_min_val_NX(info);
		else if (nx == Row_last_val) doRow_last_val_NX(info);
		else if (nx == Row_max_val) doRow_max_val_NX(info);
		else if (nx == Row_increment_by) doRow_increment_by_NX(info);
		else if (nx == Row_cycl_flg) doRow_cycl_flg_NX(info);
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_elm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_elm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ora_seq_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ora_seq_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_num_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_num_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_elm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_elm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ora_seq_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ora_seq_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_old]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_old_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[min_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_min_val_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_val_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_val_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[increment_by]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_increment_by_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cycl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cycl_flg_NX(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_elm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_elm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[ora_seq_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_ora_seq_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[min_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_min_val_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[last_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_last_val_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_val_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[increment_by]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_increment_by_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[cycl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_cycl_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_num_biz_typ) doCnd_num_biz_typ_LC(info);
		else if (lc == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_LC(info);
		else if (lc == Cnd_num_ptn_cd) doCnd_num_ptn_cd_LC(info);
		else if (lc == Cnd_num_ptn_nm) doCnd_num_ptn_nm_LC(info);
		else if (lc == Cnd_key_elm) doCnd_key_elm_LC(info);
		else if (lc == Cnd_seq_typ) doCnd_seq_typ_LC(info);
		else if (lc == Cnd_seq_typ_nm) doCnd_seq_typ_nm_LC(info);
		else if (lc == Cnd_ora_seq_nm) doCnd_ora_seq_nm_LC(info);
		else if (lc == columnDtl_num_biz_typ) doDtl_num_biz_typ_LC(info);
		else if (lc == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_LC(info);
		else if (lc == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_LC(info);
		else if (lc == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_LC(info);
		else if (lc == columnDtl_key_elm) doDtl_key_elm_LC(info);
		else if (lc == columnDtl_seq_typ) doDtl_seq_typ_LC(info);
		else if (lc == columnDtl_seq_typ_nm) doDtl_seq_typ_nm_LC(info);
		else if (lc == columnDtl_ora_seq_nm) doDtl_ora_seq_nm_LC(info);
		else if (lc == columnDtl_seq_typ_old) doDtl_seq_typ_old_LC(info);
		else if (lc == columnDtl_min_val) doDtl_min_val_LC(info);
		else if (lc == columnDtl_last_val) doDtl_last_val_LC(info);
		else if (lc == columnDtl_max_val) doDtl_max_val_LC(info);
		else if (lc == columnDtl_increment_by) doDtl_increment_by_LC(info);
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
		else if (lc == Row_num_biz_typ) doRow_num_biz_typ_LC(info);
		else if (lc == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_LC(info);
		else if (lc == Row_num_ptn_cd) doRow_num_ptn_cd_LC(info);
		else if (lc == Row_num_ptn_nm) doRow_num_ptn_nm_LC(info);
		else if (lc == Row_key_elm) doRow_key_elm_LC(info);
		else if (lc == Row_seq_typ) doRow_seq_typ_LC(info);
		else if (lc == Row_seq_typ_nm) doRow_seq_typ_nm_LC(info);
		else if (lc == Row_ora_seq_nm) doRow_ora_seq_nm_LC(info);
		else if (lc == Row_min_val) doRow_min_val_LC(info);
		else if (lc == Row_last_val) doRow_last_val_LC(info);
		else if (lc == Row_max_val) doRow_max_val_LC(info);
		else if (lc == Row_increment_by) doRow_increment_by_LC(info);
	}

	/**
	 * [Cnd]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_elm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_elm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[seq_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_seq_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ora_seq_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ora_seq_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_elm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_elm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ora_seq_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ora_seq_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[seq_typ_old]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_seq_typ_old_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[min_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_min_val_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_val_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_val_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[increment_by]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_increment_by_LC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_elm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_elm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[seq_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_seq_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[ora_seq_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_ora_seq_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[min_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_min_val_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[last_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_last_val_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_val_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[increment_by]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_increment_by_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_num_biz_typ]の作成メソッド
	 */
	public MCList getCnd_num_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumBizTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_num_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_num_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_seq_typ]の作成メソッド
	 */
	public MCList getCnd_seq_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSeqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_num_biz_typ]の作成メソッド
	 */
	public MCList getRow_num_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumBizTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_num_ptn_cd]の作成メソッド
	 */
	public MCList getRow_num_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_seq_typ]の作成メソッド
	 */
	public MCList getRow_seq_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSeqTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0800.Srch01")) {
			return new MA_MABCL0800_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0800.Upd01")) {
			return new MA_MABCL0800_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0800.Del01")) {
			return new MA_MABCL0800_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0800_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0800_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0800_Srch01Bridge() {
			p_MA_MABCL0800_Srch01 = new MCParam(PDef.MA_MABCL0800_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0800_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0800.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0800.DtlR.class));

			p_MA_MABCL0800_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0800_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0800_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0800_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0800_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0800.CndR up0() {
			return (mcframe.clientMABC.MABCP0800.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0800.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0800.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0800_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0800.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0800_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0800.DtlR>)p_MA_MABCL0800_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0800_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0800_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0800_Upd01Bridge() {
			p_MA_MABCL0800_Upd01 = new MCParam(PDef.MA_MABCL0800_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0800_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0800.DtlR.class));
			// Down

			p_MA_MABCL0800_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0800_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0800_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0800_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0800_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0800.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0800.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0800_Upd01;
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
	/**
	 * [MA_MABCL0800_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0800_Del01;

		/** コンストラクタ */
		protected MA_MABCL0800_Del01Bridge() {
			p_MA_MABCL0800_Del01 = new MCParam(PDef.MA_MABCL0800_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0800_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0800.DtlR.class));
			// Down

			p_MA_MABCL0800_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0800_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0800_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0800_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0800_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0800.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0800.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0800_Del01;
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