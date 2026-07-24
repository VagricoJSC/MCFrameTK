package mcframe.clientMABG.MABGP0400;

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
import mcframe.clientMABG.MABGP0400.MABGP_RptKeyConfReg_MC.MA_MABGL0400_Srch01Caller;
import mcframe.clientMABG.MABGP0400.MABGP_RptKeyConfReg_MC.MA_MABGL0400_Upd01Caller;
import mcframe.clientMABG.MABGP0400.MABGP_RptKeyConfReg_MC.MA_MABGL0400_Del01Caller;

/**
 * 画面"MABGP_RptKeyConfReg"パネルクラスです。<p>
 *
 * 原価レポートキー構成マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_RptKeyConfReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0400";

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
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_rpt_key_cd_Label = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_rpt_key_cd = null;
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public MCTextField Hdr_rpt_key_nm = null;
	public MCLabel Hdr_rpt_key_typ_Label = null;
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_rpt_key_typ = null;
	/**
	 * Report key type name レポートキー区分名.<p>
	 *
	 */
	public MCTextField Hdr_rpt_key_typ_nm = null;
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public MCTextField Hdr_itm_grp_typ = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0400.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_key_cd = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_nm = null;
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_typ = null;
	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd = null;
	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_key_seq = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
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
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
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
	/** [UPD_FIX_H]モードを表す定数 */
	public static final String UPD_FIX_H = "UPD_FIX_H";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [MOD_FIX_H]モードを表す定数 */
	public static final String MOD_FIX_H = "MOD_FIX_H";
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
	public static final String[] statusArray = new String[]{UPD, UPD_FIX_H, FIX_U, MOD, MOD_FIX_H, FIX_M, DEL, FIX_D, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABGL0400_Srch01]のCallerの作成 */
	protected MABGP_RptKeyConfReg_MC.MA_MABGL0400_Srch01Caller createMA_MABGL0400_Srch01() {
		MABGP_RptKeyConfReg_MC.MA_MABGL0400_Srch01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Srch01Bridge>
		caller = ((MABGP_RptKeyConfReg_MC)this).new MA_MABGL0400_Srch01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Srch01Bridge>(
					(MABGP_RptKeyConfReg)this, new MA_MABGL0400_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0400_Srch01]の呼び出し */
	protected void callMA_MABGL0400_Srch01() {
		MCCaller caller = createMA_MABGL0400_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0400_Upd01]のCallerの作成 */
	protected MABGP_RptKeyConfReg_MC.MA_MABGL0400_Upd01Caller createMA_MABGL0400_Upd01() {
		MABGP_RptKeyConfReg_MC.MA_MABGL0400_Upd01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Upd01Bridge>
		caller = ((MABGP_RptKeyConfReg_MC)this).new MA_MABGL0400_Upd01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Upd01Bridge>(
					(MABGP_RptKeyConfReg)this, new MA_MABGL0400_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0400_Upd01]の呼び出し */
	protected void callMA_MABGL0400_Upd01() {
		MCCaller caller = createMA_MABGL0400_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0400_Del01]のCallerの作成 */
	protected MABGP_RptKeyConfReg_MC.MA_MABGL0400_Del01Caller createMA_MABGL0400_Del01() {
		MABGP_RptKeyConfReg_MC.MA_MABGL0400_Del01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Del01Bridge>
		caller = ((MABGP_RptKeyConfReg_MC)this).new MA_MABGL0400_Del01Caller<MABGP_RptKeyConfReg, MA_MABGL0400_Del01Bridge>(
					(MABGP_RptKeyConfReg)this, new MA_MABGL0400_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0400_Del01]の呼び出し */
	protected void callMA_MABGL0400_Del01() {
		MCCaller caller = createMA_MABGL0400_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0400.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0400.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0400.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0400.CndR createCndR() {
		return mcframe.clientMABG.MABGP0400.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABG.MABGP0400.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0400.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0400.HdrR createHdrR() {
		return mcframe.clientMABG.MABGP0400.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0400.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0400.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0400.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0400.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0400.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0400.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
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
		if(aCnt == getHdrR()) return "Hdr";
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
		if(bId.equals("Hdr")) return getHdrR();
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
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_RptKeyConfReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_RptKeyConfReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_RptKeyConfReg_MC.jbCreateScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbCreateCnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbCreateHdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbCreateDtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbCreateBtn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbCreateEastBtn((MABGP_RptKeyConfReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_RptKeyConfReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_RptKeyConfReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABGP_RptKeyConfReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_RptKeyConfReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABG.MABGP0400.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_RptKeyConfReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_RptKeyConfReg p) {
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

	
	/** [Cnd_rpt_key_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_key_cd_p = null;

	/**
	 * [Cnd_rpt_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_key_cd_ListPutter() {
		if (Cnd_rpt_key_cd_p == null) {
			Cnd_rpt_key_cd_p = createCnd_rpt_key_cd_ListPutter(Cnd_rpt_key_cd, "rpt_key_cd", "rpt_key_nm","rpt_key_typ");

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
	
	
	/** [Hdr_rpt_key_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rpt_key_cd_p = null;

	/**
	 * [Hdr_rpt_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rpt_key_cd_ListPutter() {
		if (Hdr_rpt_key_cd_p == null) {
			Hdr_rpt_key_cd_p = createHdr_rpt_key_cd_ListPutter(Hdr_rpt_key_cd, "rpt_key_cd", "rpt_key_nm","rpt_key_typ");

		}
		return Hdr_rpt_key_cd_p;
	}
	
	
	/** [Hdr_rpt_key_typ_ListPutter]の定義 */
	private MCListPutter Hdr_rpt_key_typ_p = null;

	/**
	 * [Hdr_rpt_key_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rpt_key_typ_ListPutter() {
		if (Hdr_rpt_key_typ_p == null) {
			Hdr_rpt_key_typ_p = createHdr_rpt_key_typ_ListPutter(Hdr_rpt_key_typ, "rpt_key_typ", "rpt_key_typ_nm");

		}
		return Hdr_rpt_key_typ_p;
	}
	
	
	/** [Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_cd_p = null;

	/**
	 * [Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_cd_ListPutter() {
		if (Dtl_dpt_cd_p == null) {
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Dtl_dpt_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_jnl_cd_p = null;

	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_jnl_cd_ListPutter() {
		if (Dtl_itm_jnl_cd_p == null) {
			Dtl_itm_jnl_cd_p = createDtl_itm_jnl_cd_ListPutter(columnDtl_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Dtl_itm_jnl_cd_p;
	}
	
	
	/** [Dtl_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd_p = null;

	/**
	 * [Dtl_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd_ListPutter() {
		if (Dtl_itm_grp_cd_p == null) {
			Dtl_itm_grp_cd_p = createDtl_itm_grp_cd_ListPutter(columnDtl_itm_grp_cd, "itm_grp_cd", "itm_grp_nm");

		}
		return Dtl_itm_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_RptKeyConfReg create(){
		MABGP_RptKeyConfReg p = new MABGP_RptKeyConfReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_RptKeyConfReg create(String name){
		MABGP_RptKeyConfReg p = new MABGP_RptKeyConfReg(name);
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
		MABGP_RptKeyConfReg_MC.jbfInitScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbfInitCnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbfInitHdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbfInitDtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbfInitBtn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbfInitEastBtn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitCnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitHdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitDtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitBtn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.jbInitEastBtn((MABGP_RptKeyConfReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rpt_key_cd_Label = p.beansFactory.createLabel("Cnd.rpt_key_cd_Label");
		p.Cnd_rpt_key_cd = p.beansFactory.createTextComboBox("Cnd.rpt_key_cd");
		p.Cnd_rpt_key_cd.setLabel(p.Cnd_rpt_key_cd_Label);
		p.Cnd_rpt_key_nm = p.beansFactory.createTextField("Cnd.rpt_key_nm");
		p.Cnd_rpt_key_typ_Label = p.beansFactory.createLabel("Cnd.rpt_key_typ_Label");
		p.Cnd_rpt_key_typ = p.beansFactory.createTextComboBox("Cnd.rpt_key_typ");
		p.Cnd_rpt_key_typ.setLabel(p.Cnd_rpt_key_typ_Label);
		p.Cnd_rpt_key_typ_nm = p.beansFactory.createTextField("Cnd.rpt_key_typ_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_rpt_key_cd_Label = p.beansFactory.createLabel("Hdr.rpt_key_cd_Label");
		p.Hdr_rpt_key_cd = p.beansFactory.createTextComboBox("Hdr.rpt_key_cd");
		p.Hdr_rpt_key_cd.setLabel(p.Hdr_rpt_key_cd_Label);
		p.Hdr_rpt_key_nm = p.beansFactory.createTextField("Hdr.rpt_key_nm");
		p.Hdr_rpt_key_typ_Label = p.beansFactory.createLabel("Hdr.rpt_key_typ_Label");
		p.Hdr_rpt_key_typ = p.beansFactory.createTextComboBox("Hdr.rpt_key_typ");
		p.Hdr_rpt_key_typ.setLabel(p.Hdr_rpt_key_typ_Label);
		p.Hdr_rpt_key_typ_nm = p.beansFactory.createTextField("Hdr.rpt_key_typ_nm");
		p.Hdr_itm_grp_typ = p.beansFactory.createTextField("Hdr.itm_grp_typ");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_rpt_key_cd = p.beansFactory.createTableColumn("Dtl.rpt_key_cd", MCColumnType.TEXT);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_itm_grp_typ = p.beansFactory.createTableColumn("Dtl.itm_grp_typ", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_rpt_key_seq = p.beansFactory.createTableColumn("Dtl.rpt_key_seq", MCColumnType.NUMBER);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
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
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_RptKeyConfReg p) {
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
	protected static void jbfInitEastBtn(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0400.CndR.ope_META);
		p.Cnd_rpt_key_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_key_cd.setLinkBeans(p.Cnd_rpt_key_nm,p.Cnd_rpt_key_typ);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.CndPanel.setLastBeans(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0400.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setNextBeans(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0400.CndR.rpt_key_nm_META);
		p.Cnd_rpt_key_typ.setListType(MCListType.FREE);
		p.Cnd_rpt_key_typ.setLinkBeans(p.Cnd_rpt_key_typ_nm);
		p.CndPanel.add(p.Cnd_rpt_key_typ_Label);
		p.CndPanel.add(p.Cnd_rpt_key_typ);
		p.Cnd_rpt_key_typ.setNextBeans(p.Cnd_rpt_key_typ_nm);
		p.Cnd_rpt_key_typ.setRow(p.getCndR(), mcframe.clientMABG.MABGP0400.CndR.rpt_key_typ_META);
		p.CndPanel.add(p.Cnd_rpt_key_typ_nm);
		p.Cnd_rpt_key_typ_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_rpt_key_typ_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0400.CndR.rpt_key_typ_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlPanel);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrPanel.setLayoutPosition("NSS");
		// ブロックの項目の初期化
		p.Hdr_rpt_key_cd.setListType(MCListType.STRICT);
		p.Hdr_rpt_key_cd.setLinkBeans(p.Hdr_rpt_key_nm,p.Hdr_rpt_key_typ);
		p.HdrPanel.add(p.Hdr_rpt_key_cd_Label);
		p.HdrPanel.add(p.Hdr_rpt_key_cd);
		p.HdrPanel.setLastBeans(p.Hdr_rpt_key_cd);
		p.Hdr_rpt_key_cd.setNextBeans(p.Hdr_rpt_key_nm);
		p.Hdr_rpt_key_cd.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0400.HdrR.rpt_key_cd_META);
		p.HdrPanel.add(p.Hdr_rpt_key_nm);
		p.Hdr_rpt_key_nm.setNextBeans(p.Hdr_rpt_key_typ);
		p.Hdr_rpt_key_nm.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0400.HdrR.rpt_key_nm_META);
		p.Hdr_rpt_key_typ.setListType(MCListType.STRICT);
		p.Hdr_rpt_key_typ.setLinkBeans(p.Hdr_rpt_key_typ_nm);
		p.HdrPanel.add(p.Hdr_rpt_key_typ_Label);
		p.HdrPanel.add(p.Hdr_rpt_key_typ);
		p.Hdr_rpt_key_typ.setNextBeans(p.Hdr_rpt_key_typ_nm);
		p.Hdr_rpt_key_typ.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0400.HdrR.rpt_key_typ_META);
		p.HdrPanel.add(p.Hdr_rpt_key_typ_nm);
		p.Hdr_rpt_key_typ_nm.setNextBeans(p.Hdr_itm_grp_typ);
		p.Hdr_rpt_key_typ_nm.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0400.HdrR.rpt_key_typ_nm_META);
		p.HdrPanel.add(p.Hdr_itm_grp_typ);
		p.Hdr_itm_grp_typ.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0400.HdrR.itm_grp_typ_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_RptKeyConfReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_RptKeyConfReg p) {
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
	protected static void jbInitEastBtn(MABGP_RptKeyConfReg p) {
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
		MABGP_RptKeyConfReg_MC.mcInitScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.mcInitCnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.mcInitHdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.mcInitDtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.mcInitBtn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.mcInitEastBtn((MABGP_RptKeyConfReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitUPD_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD_EastBtn((MABGP_RptKeyConfReg)this);

		// [UPD_FIX_H]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitUPD__FIX__H_EastBtn((MABGP_RptKeyConfReg)this);

		// [FIX_U]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__U_EastBtn((MABGP_RptKeyConfReg)this);

		// [MOD]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitMOD_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD_EastBtn((MABGP_RptKeyConfReg)this);

		// [MOD_FIX_H]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitMOD__FIX__H_EastBtn((MABGP_RptKeyConfReg)this);

		// [FIX_M]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__M_EastBtn((MABGP_RptKeyConfReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitDEL_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitDEL_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitDEL_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitDEL_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitDEL_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitDEL_EastBtn((MABGP_RptKeyConfReg)this);

		// [FIX_D]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitFIX__D_EastBtn((MABGP_RptKeyConfReg)this);

		// [REF]ステータスのモードの設定
		MABGP_RptKeyConfReg_MC.statusInitREF_ScreenOpe((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitREF_Cnd((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitREF_Hdr((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitREF_Dtl((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitREF_Btn((MABGP_RptKeyConfReg)this);
		MABGP_RptKeyConfReg_MC.statusInitREF_EastBtn((MABGP_RptKeyConfReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_RptKeyConfReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_RptKeyConfReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rpt_key_cd.setListListener(p);
		p.Cnd_rpt_key_cd.addAllListener(p);
		p.Cnd_rpt_key_nm.setListListener(p);
		p.Cnd_rpt_key_nm.addAllListener(p);
		p.Cnd_rpt_key_typ.setListListener(p);
		p.Cnd_rpt_key_typ.addAllListener(p);
		p.Cnd_rpt_key_typ_nm.setListListener(p);
		p.Cnd_rpt_key_typ_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABGP_RptKeyConfReg p) {
		p.Hdr_rpt_key_cd.setListListener(p);
		p.Hdr_rpt_key_cd.addAllListener(p);
		p.Hdr_rpt_key_nm.setListListener(p);
		p.Hdr_rpt_key_nm.addAllListener(p);
		p.Hdr_rpt_key_typ.setListListener(p);
		p.Hdr_rpt_key_typ.addAllListener(p);
		p.Hdr_rpt_key_typ_nm.setListListener(p);
		p.Hdr_rpt_key_typ_nm.addAllListener(p);
		p.Hdr_itm_grp_typ.setListListener(p);
		p.Hdr_itm_grp_typ.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_RptKeyConfReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_rpt_key_cd.addAllListener(p);
		p.columnDtl_rpt_key_cd.setListListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_itm_grp_typ.addAllListener(p);
		p.columnDtl_itm_grp_typ.setListListener(p);
		p.columnDtl_itm_grp_cd.addAllListener(p);
		p.columnDtl_itm_grp_cd.setListListener(p);
		p.columnDtl_itm_grp_nm.addAllListener(p);
		p.columnDtl_itm_grp_nm.setListListener(p);
		p.columnDtl_rpt_key_seq.addAllListener(p);
		p.columnDtl_rpt_key_seq.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
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
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_RptKeyConfReg p) {
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
	protected static void mcInitEastBtn(MABGP_RptKeyConfReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rpt_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rpt_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_key_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Hdr_rpt_key_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_key_cd.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_dpt_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_itm_grp_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rpt_key_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABGP_RptKeyConfReg p){
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
	protected static void statusInitFIX__U_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, MOD, MCMode.INVISIBLE);

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_rpt_key_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_key_cd.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_dpt_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_jnl_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_itm_jnl_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_itm_grp_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_radd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, MOD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_M, MCMode.ENABLE);

	}

	/**
	 * [FIX_M]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, FIX_M, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_M]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_M, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_RptKeyConfReg p){
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
	protected static void statusInitDEL_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MABGP_RptKeyConfReg p){
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MABGP_RptKeyConfReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_RptKeyConfReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_RptKeyConfReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_key_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rpt_key_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABGP_RptKeyConfReg p){
		p.Hdr_rpt_key_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rpt_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rpt_key_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_grp_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_RptKeyConfReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_key_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_RptKeyConfReg p){
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
	protected static void statusInitREF_EastBtn(MABGP_RptKeyConfReg p){

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
		MABGP_RptKeyConfReg_MC.setTableConfigDtl((MABGP_RptKeyConfReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_RptKeyConfReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0400.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0400.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_rpt_key_cd.setMeta(mcframe.clientMABG.MABGP0400.DtlR.rpt_key_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_key_cd);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABG.MABGP0400.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABG.MABGP0400.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMABG.MABGP0400.DtlR.itm_jnl_cd_META);
		p.columnDtl_itm_jnl_cd.addLinkBeans(p.columnDtl_itm_jnl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_itm_grp_typ.setMeta(mcframe.clientMABG.MABGP0400.DtlR.itm_grp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_typ);
		p.columnDtl_itm_grp_cd.setMeta(mcframe.clientMABG.MABGP0400.DtlR.itm_grp_cd_META);
		p.columnDtl_itm_grp_cd.addLinkBeans(p.columnDtl_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd);
		p.columnDtl_itm_grp_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm);
		p.columnDtl_rpt_key_seq.setMeta(mcframe.clientMABG.MABGP0400.DtlR.rpt_key_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_key_seq);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0400.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0400.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0400.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0400.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0400.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0400.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0400.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0400.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0400.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0400.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_rpt_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_cd.getListConfig().setPutter(getCnd_rpt_key_cd_ListPutter());
		Cnd_rpt_key_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_key_typ.getListConfig().setPutter(getCnd_rpt_key_typ_ListPutter());
		Hdr_rpt_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rpt_key_cd.getListConfig().setPutter(getHdr_rpt_key_cd_ListPutter());
		Hdr_rpt_key_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rpt_key_typ.getListConfig().setPutter(getHdr_rpt_key_typ_ListPutter());
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_jnl_cd.getListConfig().setPutter(getDtl_itm_jnl_cd_ListPutter());
		columnDtl_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd.getListConfig().setPutter(getDtl_itm_grp_cd_ListPutter());
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
	 * この画面を[UPD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_FIX_HStatus() {
		status = UPD_FIX_H;
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
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMOD_FIX_HStatus() {
		status = MOD_FIX_H;
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
		else if (UPD_FIX_H.equals(status)) {
			setUPD_FIX_HStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (MOD_FIX_H.equals(status)) {
			setMOD_FIX_HStatus();
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
	 * [Cnd_rpt_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKeyWithTyp");
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
	 * [Hdr_rpt_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rpt_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKeyWithTypNotInRptKeyConf");
		return lp;
	}
	 
	/**
	 * [Hdr_rpt_key_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rpt_key_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptKeyTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_rpt_key_cd) return getCnd_rpt_key_cd(row, info);
		if(combo == Cnd_rpt_key_typ) return getCnd_rpt_key_typ(row, info);
		if(combo == Hdr_rpt_key_cd) return getHdr_rpt_key_cd(row, info);
		if(combo == Hdr_rpt_key_typ) return getHdr_rpt_key_typ(row, info);
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_itm_jnl_cd) return getDtl_itm_jnl_cd(row, info);
		if(combo == columnDtl_itm_grp_cd) return getDtl_itm_grp_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
		if (vc == Cnd_rpt_key_cd) return doCnd_rpt_key_cd_VC(info);
		if (vc == Cnd_rpt_key_nm) return doCnd_rpt_key_nm_VC(info);
		if (vc == Cnd_rpt_key_typ) return doCnd_rpt_key_typ_VC(info);
		if (vc == Cnd_rpt_key_typ_nm) return doCnd_rpt_key_typ_nm_VC(info);
		if (vc == Hdr_rpt_key_cd) return doHdr_rpt_key_cd_VC(info);
		if (vc == Hdr_rpt_key_nm) return doHdr_rpt_key_nm_VC(info);
		if (vc == Hdr_rpt_key_typ) return doHdr_rpt_key_typ_VC(info);
		if (vc == Hdr_rpt_key_typ_nm) return doHdr_rpt_key_typ_nm_VC(info);
		if (vc == Hdr_itm_grp_typ) return doHdr_itm_grp_typ_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_rpt_key_cd) return doDtl_rpt_key_cd_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_itm_grp_typ) return doDtl_itm_grp_typ_VC(info);
		if (vc == columnDtl_itm_grp_cd) return doDtl_itm_grp_cd_VC(info);
		if (vc == columnDtl_itm_grp_nm) return doDtl_itm_grp_nm_VC(info);
		if (vc == columnDtl_rpt_key_seq) return doDtl_rpt_key_seq_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
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
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
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
	 * [Hdr]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rpt_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_key_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_key_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_grp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_grp_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_key_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_key_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NC(info);
		else if (nc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NC(info);
		else if (nc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NC(info);
		else if (nc == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NC(info);
		else if (nc == Hdr_rpt_key_cd) doHdr_rpt_key_cd_NC(info);
		else if (nc == Hdr_rpt_key_nm) doHdr_rpt_key_nm_NC(info);
		else if (nc == Hdr_rpt_key_typ) doHdr_rpt_key_typ_NC(info);
		else if (nc == Hdr_rpt_key_typ_nm) doHdr_rpt_key_typ_nm_NC(info);
		else if (nc == Hdr_itm_grp_typ) doHdr_itm_grp_typ_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_rpt_key_cd) doDtl_rpt_key_cd_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_itm_grp_typ) doDtl_itm_grp_typ_NC(info);
		else if (nc == columnDtl_itm_grp_cd) doDtl_itm_grp_cd_NC(info);
		else if (nc == columnDtl_itm_grp_nm) doDtl_itm_grp_nm_NC(info);
		else if (nc == columnDtl_rpt_key_seq) doDtl_rpt_key_seq_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
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
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
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
	 * [Hdr]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_grp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_grp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NE(info);
		else if (ne == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NE(info);
		else if (ne == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NE(info);
		else if (ne == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NE(info);
		else if (ne == Hdr_rpt_key_cd) doHdr_rpt_key_cd_NE(info);
		else if (ne == Hdr_rpt_key_nm) doHdr_rpt_key_nm_NE(info);
		else if (ne == Hdr_rpt_key_typ) doHdr_rpt_key_typ_NE(info);
		else if (ne == Hdr_rpt_key_typ_nm) doHdr_rpt_key_typ_nm_NE(info);
		else if (ne == Hdr_itm_grp_typ) doHdr_itm_grp_typ_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_rpt_key_cd) doDtl_rpt_key_cd_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_itm_grp_typ) doDtl_itm_grp_typ_NE(info);
		else if (ne == columnDtl_itm_grp_cd) doDtl_itm_grp_cd_NE(info);
		else if (ne == columnDtl_itm_grp_nm) doDtl_itm_grp_nm_NE(info);
		else if (ne == columnDtl_rpt_key_seq) doDtl_rpt_key_seq_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
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
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
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
	 * [Hdr]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_grp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_grp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NX(info);
		else if (nx == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NX(info);
		else if (nx == Cnd_rpt_key_typ) doCnd_rpt_key_typ_NX(info);
		else if (nx == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_NX(info);
		else if (nx == Hdr_rpt_key_cd) doHdr_rpt_key_cd_NX(info);
		else if (nx == Hdr_rpt_key_nm) doHdr_rpt_key_nm_NX(info);
		else if (nx == Hdr_rpt_key_typ) doHdr_rpt_key_typ_NX(info);
		else if (nx == Hdr_rpt_key_typ_nm) doHdr_rpt_key_typ_nm_NX(info);
		else if (nx == Hdr_itm_grp_typ) doHdr_itm_grp_typ_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_rpt_key_cd) doDtl_rpt_key_cd_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_itm_grp_typ) doDtl_itm_grp_typ_NX(info);
		else if (nx == columnDtl_itm_grp_cd) doDtl_itm_grp_cd_NX(info);
		else if (nx == columnDtl_itm_grp_nm) doDtl_itm_grp_nm_NX(info);
		else if (nx == columnDtl_rpt_key_seq) doDtl_rpt_key_seq_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
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
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
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
	 * [Hdr]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_grp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_grp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_LC(info);
		else if (lc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_LC(info);
		else if (lc == Cnd_rpt_key_typ) doCnd_rpt_key_typ_LC(info);
		else if (lc == Cnd_rpt_key_typ_nm) doCnd_rpt_key_typ_nm_LC(info);
		else if (lc == Hdr_rpt_key_cd) doHdr_rpt_key_cd_LC(info);
		else if (lc == Hdr_rpt_key_nm) doHdr_rpt_key_nm_LC(info);
		else if (lc == Hdr_rpt_key_typ) doHdr_rpt_key_typ_LC(info);
		else if (lc == Hdr_rpt_key_typ_nm) doHdr_rpt_key_typ_nm_LC(info);
		else if (lc == Hdr_itm_grp_typ) doHdr_itm_grp_typ_LC(info);
		else if (lc == columnDtl_rpt_key_cd) doDtl_rpt_key_cd_LC(info);
		else if (lc == columnDtl_dpt_cd) doDtl_dpt_cd_LC(info);
		else if (lc == columnDtl_dpt_nm) doDtl_dpt_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_itm_grp_typ) doDtl_itm_grp_typ_LC(info);
		else if (lc == columnDtl_itm_grp_cd) doDtl_itm_grp_cd_LC(info);
		else if (lc == columnDtl_itm_grp_nm) doDtl_itm_grp_nm_LC(info);
		else if (lc == columnDtl_rpt_key_seq) doDtl_rpt_key_seq_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
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
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
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
	 * [Hdr]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_key_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_key_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_grp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_grp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_key_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_key_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_key_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyWithTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_key_typ]の作成メソッド
	 */
	public MCList getCnd_rpt_key_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rpt_key_cd]の作成メソッド
	 */
	public MCList getHdr_rpt_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyWithTypNotInRptKeyConf(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rpt_key_typ]の作成メソッド
	 */
	public MCList getHdr_rpt_key_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptKeyTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0400.Srch01")) {
			return new MA_MABGL0400_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0400.Upd01")) {
			return new MA_MABGL0400_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0400.Del01")) {
			return new MA_MABGL0400_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0400_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0400_Srch01Bridge() {
			p_MA_MABGL0400_Srch01 = new MCParam(PDef.MA_MABGL0400_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0400_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0400.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0400.DtlR.class));

			p_MA_MABGL0400_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0400_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0400_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0400_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0400_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0400.CndR up0() {
			return (mcframe.clientMABG.MABGP0400.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0400.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0400.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0400_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0400.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0400_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0400.DtlR>)p_MA_MABGL0400_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABGL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0400_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0400_Upd01Bridge() {
			p_MA_MABGL0400_Upd01 = new MCParam(PDef.MA_MABGL0400_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0400_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0400.DtlR.class));
			param.addUpBlock(mcframe.clientMABG.MABGP0400.HdrR.create());
			// Down

			p_MA_MABGL0400_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0400_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0400_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABGL0400_Upd01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0400_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0400_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0400.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0400.DtlR>)up(0);
		}
		protected mcframe.clientMABG.MABGP0400.HdrR up1() {
			return (mcframe.clientMABG.MABGP0400.HdrR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0400_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABGL0400_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0400_Del01;

		/** コンストラクタ */
		protected MA_MABGL0400_Del01Bridge() {
			p_MA_MABGL0400_Del01 = new MCParam(PDef.MA_MABGL0400_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0400_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0400.DtlR.class));
			// Down

			p_MA_MABGL0400_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0400_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0400_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0400_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0400_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0400.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0400.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0400_Del01;
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