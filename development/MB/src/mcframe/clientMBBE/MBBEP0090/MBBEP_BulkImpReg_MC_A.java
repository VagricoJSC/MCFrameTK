package mcframe.clientMBBE.MBBEP0090;

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
import mcframe.clientMBBE.MBBEP0090.MBBEP_BulkImpReg_MC.MB_MBBEL0090_Srch01Caller;
import mcframe.clientMBBE.MBBEP0090.MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd01Caller;
import mcframe.clientMBBE.MBBEP0090.MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd02Caller;
import mcframe.clientMBBE.MBBEP0090.MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt01Caller;
import mcframe.clientMBBE.MBBEP0090.MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt02Caller;

/**
 * 画面"MBBEP_BulkImpReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_BulkImpReg_MC_A extends mcframe.clientMBUD.MBUDP0010.MBUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBEP0090";

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
	 * REG,Create;CHK,Perform check only;PR_FMT,Output (Format);PR_DAT,Output (Data) REG,登録する;CHK,チェックのみを実行する;PR_FMT,出力する（フォーマット）;PR_DAT,出力する（データ）.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REG = null;
	public MCRadioButton Cnd_ope_CHK = null;
	public MCRadioButton Cnd_ope_PR_FMT = null;
	public MCRadioButton Cnd_ope_PR_DAT = null;
	public MCLabel Cnd_table_ctg_Label = null;
	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public MCTextComboBox Cnd_table_ctg = null;
	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_table_ctg_nm = null;
	public MCLabel Cnd_table_id_Label = null;
	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_table_id = null;
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public MCTextField Cnd_table_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	// [Ext]ブロック関連のField定義
	public MCPanel ExtPanel = null;
	public MCTitledBorder ExtTitledBorder = null;
	// [Ext]ブロックの項目のField定義
	// [Fmt]ブロック関連のField定義
	public MCPanel FmtPanel = null;
	public MCTitledBorder FmtTitledBorder = null;
	// [Fmt]ブロックの項目のField定義
	// [Dir]ブロック関連のField定義
	public MCPanel DirPanel = null;
	public MCTitledBorder DirTitledBorder = null;
	// [Dir]ブロックの項目のField定義
	// [Mode]ブロック関連のField定義
	public MCPanel ModePanel = null;
	public MCTitledBorder ModeTitledBorder = null;
	// [Mode]ブロックの項目のField定義
	// [Err]ブロック関連のField定義
	public MCPanel ErrPanel = null;
	public MCTitledBorder ErrTitledBorder = null;
	// [Err]ブロックの項目のField定義
	// [Data]ブロック関連のField定義
	public MCPanel DataPanel = null;
	public MCTitledBorder DataTitledBorder = null;
	// [Data]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	/**
	 * XLSX,Excel,0;CSV,CSV,1 XLSX,Excel,0;CSV,CSV,1.<p>
	 *
	 */
	public MCButtonGroup Cnd2_file_ext_typ_Group = null;
	public MCRadioButton Cnd2_file_ext_typ_XLSX = null;
	public MCRadioButton Cnd2_file_ext_typ_CSV = null;
	/**
	 * YMD,YMD,0;MDY,MDY,1;DMY,DMY,2 YMD,YMD,0;MDY,MDY,1;DMY,DMY,2.<p>
	 *
	 */
	public MCButtonGroup Cnd2_fmt_typ_Group = null;
	public MCRadioButton Cnd2_fmt_typ_YMD = null;
	public MCRadioButton Cnd2_fmt_typ_MDY = null;
	public MCRadioButton Cnd2_fmt_typ_DMY = null;
	public MCLabel Cnd2_dir_Label = null;
	/**
	 * Folder フォルダ.<p>
	 *
	 */
	public MCTextField Cnd2_dir = null;
	/**
	 * Select folder フォルダ選択.<p>
	 *
	 */
	public MCButton Cnd2_select_dir = null;
	/**
	 * INS,Add only,0;INSUPD,Add/Update,1;DELINS,Re-create after deletion,2;CRUD,Follow the data,3 INS,追加のみ,0;INSUPD,追加・更新,1;DELINS,削除後再作成,2;CRUD,データに従う,3.<p>
	 *
	 */
	public MCButtonGroup Cnd2_proc_typ_Group = null;
	public MCRadioButton Cnd2_proc_typ_INS = null;
	public MCRadioButton Cnd2_proc_typ_INSUPD = null;
	public MCRadioButton Cnd2_proc_typ_DELINS = null;
	public MCRadioButton Cnd2_proc_typ_CRUD = null;
	/**
	 * STOP,Stop process;SKIP,Skip (Enter record except error row) STOP,処理中止;SKIP,スキップ（エラー行以外登録）.<p>
	 *
	 */
	public MCButtonGroup Cnd2_err_typ_Group = null;
	public MCRadioButton Cnd2_err_typ_STOP = null;
	public MCRadioButton Cnd2_err_typ_SKIP = null;
	public MCLabel Cnd2_data_start_row_Label = null;
	/**
	 * Data start row データ開始行.<p>
	 *
	 */
	public MCNumberField Cnd2_data_start_row = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0090.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_ctg = null;
	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_ctg_nm = null;
	/**
	 * Table category sequence テーブルカテゴリ順序.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_ctg_seq = null;
	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_id = null;
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_nm = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_file_nm = null;
	/**
	 * Table sequence テーブル順序.<p>
	 *
	 */
	public MCColumnConfig columnDtl_table_seq = null;
	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_start_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Batch log check バッチログ確認.<p>
	 *
	 */
	public MCButton Btn_open_FSBGP0160 = null;
	/**
	 * Check server process サーバ処理確認.<p>
	 *
	 */
	public MCButton Btn_open_FSBGP0140 = null;
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
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_chk = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_prnt_fmt = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_prnt_dat = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_CHK]モードを表す定数 */
	public static final String SRCH_CHK = "SRCH_CHK";
	/** [SRCH_FMT]モードを表す定数 */
	public static final String SRCH_FMT = "SRCH_FMT";
	/** [SRCH_DAT]モードを表す定数 */
	public static final String SRCH_DAT = "SRCH_DAT";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_CHK]モードを表す定数 */
	public static final String UPD_CHK = "UPD_CHK";
	/** [PRNT_FMT]モードを表す定数 */
	public static final String PRNT_FMT = "PRNT_FMT";
	/** [PRNT_DAT]モードを表す定数 */
	public static final String PRNT_DAT = "PRNT_DAT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_CHK, SRCH_FMT, SRCH_DAT, UPD, UPD_CHK, PRNT_FMT, PRNT_DAT};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MB_MBBEL0090_Srch01]のCallerの作成 */
	protected MBBEP_BulkImpReg_MC.MB_MBBEL0090_Srch01Caller createMB_MBBEL0090_Srch01() {
		MBBEP_BulkImpReg_MC.MB_MBBEL0090_Srch01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Srch01Bridge>
		caller = ((MBBEP_BulkImpReg_MC)this).new MB_MBBEL0090_Srch01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Srch01Bridge>(
					(MBBEP_BulkImpReg)this, new MB_MBBEL0090_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBEL0090_Srch01]の呼び出し */
	protected void callMB_MBBEL0090_Srch01() {
		MCCaller caller = createMB_MBBEL0090_Srch01();
		caller.exec();
	}
	/** [MB_MBBEL0090_Upd01]のCallerの作成 */
	protected MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd01Caller createMB_MBBEL0090_Upd01() {
		MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Upd01Bridge>
		caller = ((MBBEP_BulkImpReg_MC)this).new MB_MBBEL0090_Upd01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Upd01Bridge>(
					(MBBEP_BulkImpReg)this, new MB_MBBEL0090_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBEL0090_Upd01]の呼び出し */
	protected void callMB_MBBEL0090_Upd01() {
		MCCaller caller = createMB_MBBEL0090_Upd01();
		caller.exec();
	}
	/** [MB_MBBEL0090_Upd02]のCallerの作成 */
	protected MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd02Caller createMB_MBBEL0090_Upd02() {
		MBBEP_BulkImpReg_MC.MB_MBBEL0090_Upd02Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Upd02Bridge>
		caller = ((MBBEP_BulkImpReg_MC)this).new MB_MBBEL0090_Upd02Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Upd02Bridge>(
					(MBBEP_BulkImpReg)this, new MB_MBBEL0090_Upd02Bridge());
		return caller;
	}
	/** [MB_MBBEL0090_Upd02]の呼び出し */
	protected void callMB_MBBEL0090_Upd02() {
		MCCaller caller = createMB_MBBEL0090_Upd02();
		caller.exec();
	}
	/** [MB_MBBEL0090_Prnt01]のCallerの作成 */
	protected MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt01Caller createMB_MBBEL0090_Prnt01() {
		MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Prnt01Bridge>
		caller = ((MBBEP_BulkImpReg_MC)this).new MB_MBBEL0090_Prnt01Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Prnt01Bridge>(
					(MBBEP_BulkImpReg)this, new MB_MBBEL0090_Prnt01Bridge());
		return caller;
	}
	/** [MB_MBBEL0090_Prnt01]の呼び出し */
	protected void callMB_MBBEL0090_Prnt01() {
		MCCaller caller = createMB_MBBEL0090_Prnt01();
		caller.exec();
	}
	/** [MB_MBBEL0090_Prnt02]のCallerの作成 */
	protected MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt02Caller createMB_MBBEL0090_Prnt02() {
		MBBEP_BulkImpReg_MC.MB_MBBEL0090_Prnt02Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Prnt02Bridge>
		caller = ((MBBEP_BulkImpReg_MC)this).new MB_MBBEL0090_Prnt02Caller<MBBEP_BulkImpReg, MB_MBBEL0090_Prnt02Bridge>(
					(MBBEP_BulkImpReg)this, new MB_MBBEL0090_Prnt02Bridge());
		return caller;
	}
	/** [MB_MBBEL0090_Prnt02]の呼び出し */
	protected void callMB_MBBEL0090_Prnt02() {
		MCCaller caller = createMB_MBBEL0090_Prnt02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0090.CndR aCndR;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0090.Cnd2R aCnd2R;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0090.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0090.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0090.CndR.create();
	}

	/**
	 * 項目コピーによってaCnd2Rを設定します。
	 *
	 * aCnd2Rのインスタンスは変更されません。
	 *
	 * @param row Cnd2R
	 */
	public void setCnd2R(mcframe.clientMBBE.MBBEP0090.Cnd2R row) {
		if (row != null) {
			MCRow.copyall(getCnd2R(), row);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Rを返します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMBBE.MBBEP0090.Cnd2R getCnd2R() {
		return aCnd2R;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMBBE.MBBEP0090.Cnd2R createCnd2R() {
		return mcframe.clientMBBE.MBBEP0090.Cnd2R.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMBBE.MBBEP0090.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0090.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMBBE.MBBEP0090.DtlR createDtlR() {
		return mcframe.clientMBBE.MBBEP0090.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0090.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getCnd2R())) ret.add(getCnd2R());
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
		if(aCnt == getCnd2R()) return "Cnd2";
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
		if(bId.equals("Cnd2")) return getCnd2R();
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
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(ExtPanel);
		ret.add(FmtPanel);
		ret.add(DirPanel);
		ret.add(ModePanel);
		ret.add(ErrPanel);
		ret.add(DataPanel);
		ret.add(Cnd2Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BulkImpReg_MC_A() {
		aCndR = createCndR();
		aCnd2R = createCnd2R();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BulkImpReg_MC_A(String name) {
		aCndR = createCndR();
		aCnd2R = createCnd2R();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_BulkImpReg_MC.jbCreateScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateTop((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateFold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateCnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateCtrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateTbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateHdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateExt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateFmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateDir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateMode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateErr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateData((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateCnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateDtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbCreateBtn((MBBEP_BulkImpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBEP_BulkImpReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Ext]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExt(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Fmt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFmt(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Dir]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDir(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Mode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMode(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Err]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateErr(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Data]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateData(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MBBEP_BulkImpReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_BulkImpReg p) {
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

	
	/** [Cnd_table_ctg_ListPutter]の定義 */
	private MCListPutter Cnd_table_ctg_p = null;

	/**
	 * [Cnd_table_ctg_ListPutter]の取得
	 */
	protected MCListPutter getCnd_table_ctg_ListPutter() {
		if (Cnd_table_ctg_p == null) {
			Cnd_table_ctg_p = createCnd_table_ctg_ListPutter(Cnd_table_ctg, "table_ctg", "table_ctg_nm");

		}
		return Cnd_table_ctg_p;
	}
	
	
	/** [Cnd_table_id_ListPutter]の定義 */
	private MCListPutter Cnd_table_id_p = null;

	/**
	 * [Cnd_table_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_table_id_ListPutter() {
		if (Cnd_table_id_p == null) {
			Cnd_table_id_p = createCnd_table_id_ListPutter(Cnd_table_id, "table_id", "table_nm");

		}
		return Cnd_table_id_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BulkImpReg create(){
		MBBEP_BulkImpReg p = new MBBEP_BulkImpReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BulkImpReg create(String name){
		MBBEP_BulkImpReg p = new MBBEP_BulkImpReg(name);
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
		MBBEP_BulkImpReg_MC.jbfInitScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitTop((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitFold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitCnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitCtrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitTbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitHdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitExt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitFmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitDir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitMode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitErr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitData((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitCnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitDtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbfInitBtn((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitTop((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitFold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitCnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitCtrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitTbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitHdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitExt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitFmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitDir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitMode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitErr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitData((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitCnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitDtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.jbInitBtn((MBBEP_BulkImpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REG = p.beansFactory.createRadioButton("Cnd.ope_REG");
		p.Cnd_ope_CHK = p.beansFactory.createRadioButton("Cnd.ope_CHK");
		p.Cnd_ope_PR_FMT = p.beansFactory.createRadioButton("Cnd.ope_PR_FMT");
		p.Cnd_ope_PR_DAT = p.beansFactory.createRadioButton("Cnd.ope_PR_DAT");
		p.Cnd_table_ctg_Label = p.beansFactory.createLabel("Cnd.table_ctg_Label");
		p.Cnd_table_ctg = p.beansFactory.createTextComboBox("Cnd.table_ctg");
		p.Cnd_table_ctg.setLabel(p.Cnd_table_ctg_Label);
		p.Cnd_table_ctg_nm = p.beansFactory.createTextField("Cnd.table_ctg_nm");
		p.Cnd_table_id_Label = p.beansFactory.createLabel("Cnd.table_id_Label");
		p.Cnd_table_id = p.beansFactory.createTextComboBox("Cnd.table_id");
		p.Cnd_table_id.setLabel(p.Cnd_table_id_Label);
		p.Cnd_table_nm = p.beansFactory.createTextField("Cnd.table_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Ext]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExt(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ExtPanel = p.beansFactory.createPanel("Ext");
		p.ExtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Fmt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFmt(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.FmtPanel = p.beansFactory.createPanel("Fmt");
		p.FmtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dir]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDir(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DirPanel = p.beansFactory.createPanel("Dir");
		p.DirTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMode(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ModePanel = p.beansFactory.createPanel("Mode");
		p.ModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Err]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitErr(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ErrPanel = p.beansFactory.createPanel("Err");
		p.ErrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Data]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitData(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DataPanel = p.beansFactory.createPanel("Data");
		p.DataTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
		p.Cnd2_file_ext_typ_Group = p.beansFactory.createButtonGroup("Cnd2.file_ext_typ");
		p.Cnd2_file_ext_typ_XLSX = p.beansFactory.createRadioButton("Cnd2.file_ext_typ_XLSX");
		p.Cnd2_file_ext_typ_CSV = p.beansFactory.createRadioButton("Cnd2.file_ext_typ_CSV");
		p.Cnd2_fmt_typ_Group = p.beansFactory.createButtonGroup("Cnd2.fmt_typ");
		p.Cnd2_fmt_typ_YMD = p.beansFactory.createRadioButton("Cnd2.fmt_typ_YMD");
		p.Cnd2_fmt_typ_MDY = p.beansFactory.createRadioButton("Cnd2.fmt_typ_MDY");
		p.Cnd2_fmt_typ_DMY = p.beansFactory.createRadioButton("Cnd2.fmt_typ_DMY");
		p.Cnd2_dir_Label = p.beansFactory.createLabel("Cnd2.dir_Label");
		p.Cnd2_dir = p.beansFactory.createTextField("Cnd2.dir");
		p.Cnd2_dir.setLabel(p.Cnd2_dir_Label);
		p.Cnd2_select_dir = p.beansFactory.createButton("Cnd2.select_dir", "no_border");
		p.Cnd2_proc_typ_Group = p.beansFactory.createButtonGroup("Cnd2.proc_typ");
		p.Cnd2_proc_typ_INS = p.beansFactory.createRadioButton("Cnd2.proc_typ_INS");
		p.Cnd2_proc_typ_INSUPD = p.beansFactory.createRadioButton("Cnd2.proc_typ_INSUPD");
		p.Cnd2_proc_typ_DELINS = p.beansFactory.createRadioButton("Cnd2.proc_typ_DELINS");
		p.Cnd2_proc_typ_CRUD = p.beansFactory.createRadioButton("Cnd2.proc_typ_CRUD");
		p.Cnd2_err_typ_Group = p.beansFactory.createButtonGroup("Cnd2.err_typ");
		p.Cnd2_err_typ_STOP = p.beansFactory.createRadioButton("Cnd2.err_typ_STOP");
		p.Cnd2_err_typ_SKIP = p.beansFactory.createRadioButton("Cnd2.err_typ_SKIP");
		p.Cnd2_data_start_row_Label = p.beansFactory.createLabel("Cnd2.data_start_row_Label");
		p.Cnd2_data_start_row = p.beansFactory.createNumberField("Cnd2.data_start_row");
		p.Cnd2_data_start_row.setLabel(p.Cnd2_data_start_row_Label);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_table_ctg = p.beansFactory.createTableColumn("Dtl.table_ctg", MCColumnType.TEXT);
		p.columnDtl_table_ctg_nm = p.beansFactory.createTableColumn("Dtl.table_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_table_ctg_seq = p.beansFactory.createTableColumn("Dtl.table_ctg_seq", MCColumnType.NUMBER);
		p.columnDtl_table_id = p.beansFactory.createTableColumn("Dtl.table_id", MCColumnType.TEXT);
		p.columnDtl_table_nm = p.beansFactory.createTableColumn("Dtl.table_nm", MCColumnType.TEXT);
		p.columnDtl_file_nm = p.beansFactory.createTableColumn("Dtl.file_nm", MCColumnType.TEXT);
		p.columnDtl_table_seq = p.beansFactory.createTableColumn("Dtl.table_seq", MCColumnType.NUMBER);
		p.columnDtl_start_dt = p.beansFactory.createTableColumn("Dtl.start_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_FSBGP0160 = p.beansFactory.createButton("Btn.open_FSBGP0160", "open");
		p.Btn_open_FSBGP0140 = p.beansFactory.createButton("Btn.open_FSBGP0140", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_chk = p.beansFactory.createButton("Btn.upd_chk", "upd");
		p.Btn_prnt_fmt = p.beansFactory.createButton("Btn.prnt_fmt", "upd");
		p.Btn_prnt_dat = p.beansFactory.createButton("Btn.prnt_dat", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBEP_BulkImpReg p) {
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
	protected static void jbInitTop(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REG);
		p.Cnd_ope_REG.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REG);
		p.ScreenOpePanel.add(p.Cnd_ope_REG);
		p.Cnd_ope_REG.setNextBeans(p.Cnd_ope_CHK);
		p.Cnd_ope_CHK.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_CHK);
		p.ScreenOpePanel.add(p.Cnd_ope_CHK);
		p.Cnd_ope_CHK.setNextBeans(p.Cnd_ope_PR_FMT);
		p.Cnd_ope_PR_FMT.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_PR_FMT);
		p.ScreenOpePanel.add(p.Cnd_ope_PR_FMT);
		p.Cnd_ope_PR_FMT.setNextBeans(p.Cnd_ope_PR_DAT);
		p.Cnd_ope_PR_DAT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_PR_DAT);
		p.ScreenOpePanel.add(p.Cnd_ope_PR_DAT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0090.CndR.ope_META);
		p.Cnd_table_ctg.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_table_ctg, true);
		p.Cnd_table_ctg.setLinkBeans(p.Cnd_table_ctg_nm);
		p.CndPanel.add(p.Cnd_table_ctg_Label);
		p.CndPanel.add(p.Cnd_table_ctg);
		p.CndPanel.setLastBeans(p.Cnd_table_ctg);
		p.Cnd_table_ctg.setNextBeans(p.Cnd_table_ctg_nm);
		p.Cnd_table_ctg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0090.CndR.table_ctg_META);
		p.CndPanel.add(p.Cnd_table_ctg_nm);
		p.Cnd_table_ctg_nm.setNextBeans(p.Cnd_table_id);
		p.Cnd_table_ctg_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0090.CndR.table_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_table_ctg_nm, true);
		p.Cnd_table_id.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_table_id, true);
		p.Cnd_table_id.setLinkBeans(p.Cnd_table_nm);
		p.CndPanel.add(p.Cnd_table_id_Label);
		p.CndPanel.add(p.Cnd_table_id);
		p.Cnd_table_id.setNextBeans(p.Cnd_table_nm);
		p.Cnd_table_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0090.CndR.table_id_META);
		p.CndPanel.add(p.Cnd_table_nm);
		p.Cnd_table_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0090.CndR.table_nm_META);
		p.setPluralValueEnable(p.Cnd_table_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TblPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlPanel);
		p.TblPanel.add(p.DtlPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrPanel.setLayoutPosition("N+");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.ExtPanel, null);
		p.HdrPanel.setLastBeans(p.ExtPanel);
		p.ExtPanel.setNextBeans(p.FmtPanel);
		p.HdrPanel.add(p.FmtPanel, null);
		p.FmtPanel.setNextBeans(p.DirPanel);
		p.HdrPanel.add(p.DirPanel, null);
		p.DirPanel.setNextBeans(p.ModePanel);
		p.HdrPanel.add(p.ModePanel, null);
		p.ModePanel.setNextBeans(p.ErrPanel);
		p.HdrPanel.add(p.ErrPanel, null);
		p.ErrPanel.setNextBeans(p.DataPanel);
		p.HdrPanel.add(p.DataPanel, null);
		p.DataPanel.setNextBeans(p.Cnd2Panel);
		p.HdrPanel.add(p.Cnd2Panel, null);
	}

	/**
	 * [Ext]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExt(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ExtPanel.setBorder(p.ExtTitledBorder);
		p.ExtPanel.setValueCheck(false);
		p.ExtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ExtPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Fmt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFmt(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.FmtPanel.setBorder(p.FmtTitledBorder);
		p.FmtPanel.setValueCheck(false);
		p.FmtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FmtPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dir]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDir(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DirPanel.setBorder(p.DirTitledBorder);
		p.DirPanel.setValueCheck(false);
		p.DirPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DirPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMode(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ModePanel.setBorder(p.ModeTitledBorder);
		p.ModePanel.setValueCheck(false);
		p.ModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ModePanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Err]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitErr(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.ErrPanel.setBorder(p.ErrTitledBorder);
		p.ErrPanel.setValueCheck(false);
		p.ErrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ErrPanel.setLayoutPosition("SWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Data]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitData(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DataPanel.setBorder(p.DataTitledBorder);
		p.DataPanel.setValueCheck(false);
		p.DataPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DataPanel.setLayoutPosition("SWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ExtPanel.setLastBeans(p.Cnd2_file_ext_typ_Group);
		p.Cnd2_file_ext_typ_Group.setFirstBeans(p.Cnd2_file_ext_typ_XLSX);
		p.Cnd2_file_ext_typ_XLSX.setActionCommand("0");
		p.Cnd2_file_ext_typ_Group.add(p.Cnd2_file_ext_typ_XLSX);
		p.ExtPanel.add(p.Cnd2_file_ext_typ_XLSX);
		p.Cnd2_file_ext_typ_XLSX.setNextBeans(p.Cnd2_file_ext_typ_CSV);
		p.Cnd2_file_ext_typ_CSV.setActionCommand("1");
		p.Cnd2_file_ext_typ_Group.add(p.Cnd2_file_ext_typ_CSV);
		p.ExtPanel.add(p.Cnd2_file_ext_typ_CSV);
		p.Cnd2_file_ext_typ_Group.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.file_ext_typ_META);
		p.FmtPanel.setLastBeans(p.Cnd2_fmt_typ_Group);
		p.Cnd2_fmt_typ_Group.setFirstBeans(p.Cnd2_fmt_typ_YMD);
		p.Cnd2_fmt_typ_YMD.setActionCommand("0");
		p.Cnd2_fmt_typ_Group.add(p.Cnd2_fmt_typ_YMD);
		p.FmtPanel.add(p.Cnd2_fmt_typ_YMD);
		p.Cnd2_fmt_typ_YMD.setNextBeans(p.Cnd2_fmt_typ_MDY);
		p.Cnd2_fmt_typ_MDY.setActionCommand("1");
		p.Cnd2_fmt_typ_Group.add(p.Cnd2_fmt_typ_MDY);
		p.FmtPanel.add(p.Cnd2_fmt_typ_MDY);
		p.Cnd2_fmt_typ_MDY.setNextBeans(p.Cnd2_fmt_typ_DMY);
		p.Cnd2_fmt_typ_DMY.setActionCommand("2");
		p.Cnd2_fmt_typ_Group.add(p.Cnd2_fmt_typ_DMY);
		p.FmtPanel.add(p.Cnd2_fmt_typ_DMY);
		p.Cnd2_fmt_typ_Group.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.fmt_typ_META);
		p.DirPanel.add(p.Cnd2_dir_Label);
		p.DirPanel.add(p.Cnd2_dir);
		p.DirPanel.setLastBeans(p.Cnd2_dir);
		p.Cnd2_dir.setNextBeans(p.Cnd2_select_dir);
		p.Cnd2_dir.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.dir_META);
		p.Cnd2_select_dir.setIcon("FOLDER");
		p.DirPanel.add(p.Cnd2_select_dir);
		p.ModePanel.setLastBeans(p.Cnd2_proc_typ_Group);
		p.Cnd2_proc_typ_Group.setFirstBeans(p.Cnd2_proc_typ_INS);
		p.Cnd2_proc_typ_INS.setActionCommand("0");
		p.Cnd2_proc_typ_Group.add(p.Cnd2_proc_typ_INS);
		p.ModePanel.add(p.Cnd2_proc_typ_INS);
		p.Cnd2_proc_typ_INS.setNextBeans(p.Cnd2_proc_typ_INSUPD);
		p.Cnd2_proc_typ_INSUPD.setActionCommand("1");
		p.Cnd2_proc_typ_Group.add(p.Cnd2_proc_typ_INSUPD);
		p.ModePanel.add(p.Cnd2_proc_typ_INSUPD);
		p.Cnd2_proc_typ_INSUPD.setNextBeans(p.Cnd2_proc_typ_DELINS);
		p.Cnd2_proc_typ_DELINS.setActionCommand("2");
		p.Cnd2_proc_typ_Group.add(p.Cnd2_proc_typ_DELINS);
		p.ModePanel.add(p.Cnd2_proc_typ_DELINS);
		p.Cnd2_proc_typ_DELINS.setNextBeans(p.Cnd2_proc_typ_CRUD);
		p.Cnd2_proc_typ_CRUD.setActionCommand("3");
		p.Cnd2_proc_typ_Group.add(p.Cnd2_proc_typ_CRUD);
		p.ModePanel.add(p.Cnd2_proc_typ_CRUD);
		p.Cnd2_proc_typ_Group.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.proc_typ_META);
		p.ErrPanel.setLastBeans(p.Cnd2_err_typ_Group);
		p.Cnd2_err_typ_Group.setFirstBeans(p.Cnd2_err_typ_STOP);
		p.Cnd2_err_typ_STOP.setActionCommand("0");
		p.Cnd2_err_typ_Group.add(p.Cnd2_err_typ_STOP);
		p.ErrPanel.add(p.Cnd2_err_typ_STOP);
		p.Cnd2_err_typ_STOP.setNextBeans(p.Cnd2_err_typ_SKIP);
		p.Cnd2_err_typ_SKIP.setActionCommand("1");
		p.Cnd2_err_typ_Group.add(p.Cnd2_err_typ_SKIP);
		p.ErrPanel.add(p.Cnd2_err_typ_SKIP);
		p.Cnd2_err_typ_Group.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.err_typ_META);
		p.DataPanel.add(p.Cnd2_data_start_row_Label);
		p.DataPanel.add(p.Cnd2_data_start_row);
		p.DataPanel.setLastBeans(p.Cnd2_data_start_row);
		p.Cnd2_data_start_row.setRow(p.getCnd2R(), mcframe.clientMBBE.MBBEP0090.Cnd2R.data_start_row_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_BulkImpReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_FSBGP0160.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_FSBGP0160);
		p.BtnPanel.setLastBeans(p.Btn_open_FSBGP0160);
		p.Btn_open_FSBGP0160.setNextBeans(p.Btn_open_FSBGP0140);
		p.Btn_open_FSBGP0140.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_FSBGP0140);
		p.Btn_open_FSBGP0140.setNextBeans(p.Btn_select_all);
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
		p.Btn_upd.setNextBeans(p.Btn_upd_chk);
		p.Btn_upd_chk.setIcon("REGISTER");
		p.Btn_upd_chk.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_chk);
		p.Btn_upd_chk.setNextBeans(p.Btn_prnt_fmt);
		p.Btn_prnt_fmt.setIcon("REGISTER");
		p.Btn_prnt_fmt.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_prnt_fmt);
		p.Btn_prnt_fmt.setNextBeans(p.Btn_prnt_dat);
		p.Btn_prnt_dat.setIcon("REGISTER");
		p.Btn_prnt_dat.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_prnt_dat);
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
		MBBEP_BulkImpReg_MC.mcInitScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitTop((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitFold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitCnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitCtrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitTbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitHdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitExt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitFmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitDir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitMode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitErr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitData((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitCnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitDtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.mcInitBtn((MBBEP_BulkImpReg)this);

		// [SRCH]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitSRCH_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH_Btn((MBBEP_BulkImpReg)this);

		// [SRCH_CHK]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__CHK_Btn((MBBEP_BulkImpReg)this);

		// [SRCH_FMT]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__FMT_Btn((MBBEP_BulkImpReg)this);

		// [SRCH_DAT]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitSRCH__DAT_Btn((MBBEP_BulkImpReg)this);

		// [UPD]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitUPD_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD_Btn((MBBEP_BulkImpReg)this);

		// [UPD_CHK]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitUPD__CHK_Btn((MBBEP_BulkImpReg)this);

		// [PRNT_FMT]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__FMT_Btn((MBBEP_BulkImpReg)this);

		// [PRNT_DAT]ステータスのモードの設定
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_ScreenOpe((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Top((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Fold((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Cnd((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Ctrl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Tbl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Hdr((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Ext((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Fmt((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Dir((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Mode((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Err((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Data((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Cnd2((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Dtl((MBBEP_BulkImpReg)this);
		MBBEP_BulkImpReg_MC.statusInitPRNT__DAT_Btn((MBBEP_BulkImpReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_BulkImpReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REG.addAllListener(p);
		p.Cnd_ope_CHK.addAllListener(p);
		p.Cnd_ope_PR_FMT.addAllListener(p);
		p.Cnd_ope_PR_DAT.addAllListener(p);
		p.Cnd_table_ctg.setListListener(p);
		p.Cnd_table_ctg.addAllListener(p);
		p.Cnd_table_ctg_nm.setListListener(p);
		p.Cnd_table_ctg_nm.addAllListener(p);
		p.Cnd_table_id.setListListener(p);
		p.Cnd_table_id.addAllListener(p);
		p.Cnd_table_nm.setListListener(p);
		p.Cnd_table_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBEP_BulkImpReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Ext]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExt(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Fmt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFmt(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Dir]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDir(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Mode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMode(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Err]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitErr(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Data]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitData(MBBEP_BulkImpReg p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MBBEP_BulkImpReg p) {
		p.Cnd2_file_ext_typ_Group.addAllListener(p);
		p.Cnd2_file_ext_typ_XLSX.addAllListener(p);
		p.Cnd2_file_ext_typ_CSV.addAllListener(p);
		p.Cnd2_fmt_typ_Group.addAllListener(p);
		p.Cnd2_fmt_typ_YMD.addAllListener(p);
		p.Cnd2_fmt_typ_MDY.addAllListener(p);
		p.Cnd2_fmt_typ_DMY.addAllListener(p);
		p.Cnd2_dir.setListListener(p);
		p.Cnd2_dir.addAllListener(p);
		p.Cnd2_select_dir.addAllListener(p);
		p.Cnd2_select_dir.setAPMethodName("doCnd2_select_dir");
		p.Cnd2_proc_typ_Group.addAllListener(p);
		p.Cnd2_proc_typ_INS.addAllListener(p);
		p.Cnd2_proc_typ_INSUPD.addAllListener(p);
		p.Cnd2_proc_typ_DELINS.addAllListener(p);
		p.Cnd2_proc_typ_CRUD.addAllListener(p);
		p.Cnd2_err_typ_Group.addAllListener(p);
		p.Cnd2_err_typ_STOP.addAllListener(p);
		p.Cnd2_err_typ_SKIP.addAllListener(p);
		p.Cnd2_data_start_row.setListListener(p);
		p.Cnd2_data_start_row.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MBBEP_BulkImpReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_table_ctg.addAllListener(p);
		p.columnDtl_table_ctg.setListListener(p);
		p.columnDtl_table_ctg_nm.addAllListener(p);
		p.columnDtl_table_ctg_nm.setListListener(p);
		p.columnDtl_table_ctg_seq.addAllListener(p);
		p.columnDtl_table_ctg_seq.setListListener(p);
		p.columnDtl_table_id.addAllListener(p);
		p.columnDtl_table_id.setListListener(p);
		p.columnDtl_table_nm.addAllListener(p);
		p.columnDtl_table_nm.setListListener(p);
		p.columnDtl_file_nm.addAllListener(p);
		p.columnDtl_file_nm.setListListener(p);
		p.columnDtl_table_seq.addAllListener(p);
		p.columnDtl_table_seq.setListListener(p);
		p.columnDtl_start_dt.addAllListener(p);
		p.columnDtl_start_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_BulkImpReg p) {
		p.Btn_open_FSBGP0160.addAllListener(p);
		p.Btn_open_FSBGP0160.setAPMethodName("doBtn_open_FSBGP0160");
		p.Btn_open_FSBGP0140.addAllListener(p);
		p.Btn_open_FSBGP0140.setAPMethodName("doBtn_open_FSBGP0140");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_chk.addAllListener(p);
		p.Btn_upd_chk.setAPMethodName("doBtn_upd_chk");
		p.Btn_prnt_fmt.addAllListener(p);
		p.Btn_prnt_fmt.setAPMethodName("doBtn_prnt_fmt");
		p.Btn_prnt_dat.addAllListener(p);
		p.Btn_prnt_dat.setAPMethodName("doBtn_prnt_dat");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd2_select_dir.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd2_proc_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd2_err_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd2_data_start_row.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_ctg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_chk.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_CHK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_CHK, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, SRCH_CHK, MCMode.ENABLE);

	}

	/**
	 * [SRCH_CHK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_CHK]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, SRCH_CHK, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, SRCH_CHK, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Cnd2_select_dir.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Cnd2_proc_typ_Group.putMode(p, SRCH_CHK, MCMode.REQUIRED);
		p.Cnd2_err_typ_Group.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, SRCH_CHK, MCMode.ENABLE);

	}

	/**
	 * [SRCH_CHK]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_ctg.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, SRCH_CHK, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, SRCH_CHK, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_CHK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CHK_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, SRCH_CHK, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_CHK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_CHK, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_CHK, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, SRCH_CHK, MCMode.DISABLE);
		p.Btn_prnt_fmt.putMode(p, SRCH_CHK, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, SRCH_CHK, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_FMT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_FMT, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, SRCH_FMT, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, SRCH_FMT, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, SRCH_FMT, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, SRCH_FMT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_FMT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_FMT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, SRCH_FMT, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.Cnd2_dir.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.Cnd2_select_dir.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Cnd2_proc_typ_Group.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.Cnd2_err_typ_Group.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, SRCH_FMT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_FMT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, SRCH_FMT, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, SRCH_FMT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_FMT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FMT_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Btn_open_FSBGP0140.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_FMT, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, SRCH_FMT, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, SRCH_FMT, MCMode.DISABLE);
		p.Btn_prnt_dat.putMode(p, SRCH_FMT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DAT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DAT, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, SRCH_DAT, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, SRCH_DAT, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, SRCH_DAT, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, SRCH_DAT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DAT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [SRCH_DAT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, SRCH_DAT, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, SRCH_DAT, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.Cnd2_select_dir.putMode(p, SRCH_DAT, MCMode.DISABLE);
		p.Cnd2_proc_typ_Group.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.Cnd2_err_typ_Group.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, SRCH_DAT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DAT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, SRCH_DAT, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, SRCH_DAT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DAT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DAT_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, SRCH_DAT, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, SRCH_DAT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DAT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DAT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DAT, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, SRCH_DAT, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, SRCH_DAT, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, SRCH_DAT, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd2_select_dir.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd2_proc_typ_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd2_err_typ_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd2_data_start_row.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_table_ctg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_chk.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CHK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, UPD_CHK, MCMode.ENABLE);

	}

	/**
	 * [UPD_CHK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [UPD_CHK]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.Cnd2_select_dir.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Cnd2_proc_typ_Group.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.Cnd2_err_typ_Group.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, UPD_CHK, MCMode.ENABLE);

	}

	/**
	 * [UPD_CHK]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, UPD_CHK, MCMode.REQUIRED);
		p.columnDtl_table_ctg.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, UPD_CHK, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, UPD_CHK, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_CHK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CHK_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_CHK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD_CHK, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD_CHK, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, UPD_CHK, MCMode.ENABLE);
		p.Btn_prnt_fmt.putMode(p, UPD_CHK, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, UPD_CHK, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_FMT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, PRNT_FMT, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, PRNT_FMT, MCMode.ENABLE);

	}

	/**
	 * [PRNT_FMT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_FMT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, PRNT_FMT, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.Cnd2_dir.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.Cnd2_select_dir.putMode(p, PRNT_FMT, MCMode.DISABLE);
		p.Cnd2_proc_typ_Group.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.Cnd2_err_typ_Group.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, PRNT_FMT, MCMode.ENABLE);

	}

	/**
	 * [PRNT_FMT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, PRNT_FMT, MCMode.REQUIRED);
		p.columnDtl_table_ctg.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, PRNT_FMT, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, PRNT_FMT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_FMT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__FMT_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, PRNT_FMT, MCMode.DISABLE);
		p.Btn_open_FSBGP0140.putMode(p, PRNT_FMT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, PRNT_FMT, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, PRNT_FMT, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, PRNT_FMT, MCMode.ENABLE);
		p.Btn_prnt_dat.putMode(p, PRNT_FMT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_DAT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_ScreenOpe(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Top(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Fold(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Cnd(MBBEP_BulkImpReg p){
		p.Cnd_ope_Group.putMode(p, PRNT_DAT, MCMode.REQUIRED);
		p.Cnd_table_ctg.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Cnd_table_ctg_nm.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Cnd_table_id.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Cnd_table_nm.putMode(p, PRNT_DAT, MCMode.ENABLE);

	}

	/**
	 * [PRNT_DAT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Ctrl(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Tbl(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Hdr(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Ext]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Ext(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Fmt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Fmt(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Dir]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Dir(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Mode(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Err]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Err(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Data]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Data(MBBEP_BulkImpReg p){

	}

	/**
	 * [PRNT_DAT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Cnd2(MBBEP_BulkImpReg p){
		p.Cnd2_file_ext_typ_Group.putMode(p, PRNT_DAT, MCMode.REQUIRED);
		p.Cnd2_fmt_typ_Group.putMode(p, PRNT_DAT, MCMode.REQUIRED);
		p.Cnd2_dir.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.Cnd2_select_dir.putMode(p, PRNT_DAT, MCMode.DISABLE);
		p.Cnd2_proc_typ_Group.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.Cnd2_err_typ_Group.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.Cnd2_data_start_row.putMode(p, PRNT_DAT, MCMode.ENABLE);

	}

	/**
	 * [PRNT_DAT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Dtl(MBBEP_BulkImpReg p){
		p.columnDtl_check.putMode(p, PRNT_DAT, MCMode.REQUIRED);
		p.columnDtl_table_ctg.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_nm.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_ctg_seq.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_id.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_nm.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_file_nm.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_table_seq.putMode(p, PRNT_DAT, MCMode.READ_ONLY);
		p.columnDtl_start_dt.putMode(p, PRNT_DAT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_DAT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DAT_Btn(MBBEP_BulkImpReg p){
		p.Btn_open_FSBGP0160.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Btn_open_FSBGP0140.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_DAT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, PRNT_DAT, MCMode.INVISIBLE);
		p.Btn_upd_chk.putMode(p, PRNT_DAT, MCMode.INVISIBLE);
		p.Btn_prnt_fmt.putMode(p, PRNT_DAT, MCMode.INVISIBLE);
		p.Btn_prnt_dat.putMode(p, PRNT_DAT, MCMode.ENABLE);

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
		MBBEP_BulkImpReg_MC.setTableConfigDtl((MBBEP_BulkImpReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MBBEP_BulkImpReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_table_ctg.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_ctg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_ctg);
		p.columnDtl_table_ctg_nm.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_ctg_nm);
		p.columnDtl_table_ctg_seq.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_ctg_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_ctg_seq);
		p.columnDtl_table_id.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_id);
		p.columnDtl_table_nm.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_nm);
		p.columnDtl_file_nm.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.file_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_file_nm);
		p.columnDtl_table_seq.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.table_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_table_seq);
		p.columnDtl_start_dt.setMeta(mcframe.clientMBBE.MBBEP0090.DtlR.start_dt_META);
		p.columnDtl_start_dt.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_start_dt);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_table_ctg.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_table_ctg.getListConfig().setPutter(getCnd_table_ctg_ListPutter());
		Cnd_table_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_table_id.getListConfig().setPutter(getCnd_table_id_ListPutter());
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
	 * この画面を[SRCH_CHK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_CHKStatus() {
		status = SRCH_CHK;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_FMT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_FMTStatus() {
		status = SRCH_FMT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DAT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DATStatus() {
		status = SRCH_DAT;
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
	 * この画面を[UPD_CHK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CHKStatus() {
		status = UPD_CHK;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_FMT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_FMTStatus() {
		status = PRNT_FMT;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_DAT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_DATStatus() {
		status = PRNT_DAT;
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
		else if (SRCH_CHK.equals(status)) {
			setSRCH_CHKStatus();
		}
		else if (SRCH_FMT.equals(status)) {
			setSRCH_FMTStatus();
		}
		else if (SRCH_DAT.equals(status)) {
			setSRCH_DATStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_CHK.equals(status)) {
			setUPD_CHKStatus();
		}
		else if (PRNT_FMT.equals(status)) {
			setPRNT_FMTStatus();
		}
		else if (PRNT_DAT.equals(status)) {
			setPRNT_DATStatus();
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
	 * [Cnd_table_ctg_ListPutter]の作成
	 */
	protected MCListPutter createCnd_table_ctg_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BulkImpCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_table_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_table_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BulkImpCtl");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_table_ctg) return getCnd_table_ctg(row, info);
		if(combo == Cnd_table_id) return getCnd_table_id(row, info);
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
		else if (ap == Cnd2_select_dir) doCnd2_select_dir(info);
		else if (ap == Btn_open_FSBGP0160) doBtn_open_FSBGP0160(info);
		else if (ap == Btn_open_FSBGP0140) doBtn_open_FSBGP0140(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_chk) doBtn_upd_chk(info);
		else if (ap == Btn_prnt_fmt) doBtn_prnt_fmt(info);
		else if (ap == Btn_prnt_dat) doBtn_prnt_dat(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Cnd2]パネルの[select_dir]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd2_select_dir(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_FSBGP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_FSBGP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_FSBGP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_FSBGP0140(MCEventInfo info);

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
	 * [Btn]パネルの[upd_chk]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_chk(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_fmt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_fmt(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dat]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dat(MCEventInfo info);

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
		if (vc == Cnd_table_ctg) return doCnd_table_ctg_VC(info);
		if (vc == Cnd_table_ctg_nm) return doCnd_table_ctg_nm_VC(info);
		if (vc == Cnd_table_id) return doCnd_table_id_VC(info);
		if (vc == Cnd_table_nm) return doCnd_table_nm_VC(info);
		if (vc == Cnd2_file_ext_typ_Group) return doCnd2_file_ext_typ_VC(info);
		if (vc == Cnd2_fmt_typ_Group) return doCnd2_fmt_typ_VC(info);
		if (vc == Cnd2_dir) return doCnd2_dir_VC(info);
		if (vc == Cnd2_proc_typ_Group) return doCnd2_proc_typ_VC(info);
		if (vc == Cnd2_err_typ_Group) return doCnd2_err_typ_VC(info);
		if (vc == Cnd2_data_start_row) return doCnd2_data_start_row_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_table_ctg) return doDtl_table_ctg_VC(info);
		if (vc == columnDtl_table_ctg_nm) return doDtl_table_ctg_nm_VC(info);
		if (vc == columnDtl_table_ctg_seq) return doDtl_table_ctg_seq_VC(info);
		if (vc == columnDtl_table_id) return doDtl_table_id_VC(info);
		if (vc == columnDtl_table_nm) return doDtl_table_nm_VC(info);
		if (vc == columnDtl_file_nm) return doDtl_file_nm_VC(info);
		if (vc == columnDtl_table_seq) return doDtl_table_seq_VC(info);
		if (vc == columnDtl_start_dt) return doDtl_start_dt_VC(info);
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
	 * [Cnd]パネルの[table_ctg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_table_ctg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[table_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_table_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[table_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_table_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[table_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_table_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[file_ext_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_file_ext_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[fmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_fmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[dir]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_dir_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[err_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_err_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd2]パネルの[data_start_row]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_data_start_row_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[table_ctg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_ctg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[table_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[table_ctg_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_ctg_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[table_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[table_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[table_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_table_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[start_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_start_dt_VC(MCEventInfo info){
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
		else if (nc == Cnd_table_ctg) doCnd_table_ctg_NC(info);
		else if (nc == Cnd_table_ctg_nm) doCnd_table_ctg_nm_NC(info);
		else if (nc == Cnd_table_id) doCnd_table_id_NC(info);
		else if (nc == Cnd_table_nm) doCnd_table_nm_NC(info);
		else if (nc == Cnd2_file_ext_typ_Group) doCnd2_file_ext_typ_NC(info);
		else if (nc == Cnd2_fmt_typ_Group) doCnd2_fmt_typ_NC(info);
		else if (nc == Cnd2_dir) doCnd2_dir_NC(info);
		else if (nc == Cnd2_proc_typ_Group) doCnd2_proc_typ_NC(info);
		else if (nc == Cnd2_err_typ_Group) doCnd2_err_typ_NC(info);
		else if (nc == Cnd2_data_start_row) doCnd2_data_start_row_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_table_ctg) doDtl_table_ctg_NC(info);
		else if (nc == columnDtl_table_ctg_nm) doDtl_table_ctg_nm_NC(info);
		else if (nc == columnDtl_table_ctg_seq) doDtl_table_ctg_seq_NC(info);
		else if (nc == columnDtl_table_id) doDtl_table_id_NC(info);
		else if (nc == columnDtl_table_nm) doDtl_table_nm_NC(info);
		else if (nc == columnDtl_file_nm) doDtl_file_nm_NC(info);
		else if (nc == columnDtl_table_seq) doDtl_table_seq_NC(info);
		else if (nc == columnDtl_start_dt) doDtl_start_dt_NC(info);
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
	 * [Cnd]パネルの[table_ctg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[file_ext_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_file_ext_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[fmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_fmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[dir]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_dir_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[err_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_err_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[data_start_row]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_data_start_row_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[start_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_start_dt_NC(MCEventInfo info){
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
		else if (ne == Cnd_table_ctg) doCnd_table_ctg_NE(info);
		else if (ne == Cnd_table_ctg_nm) doCnd_table_ctg_nm_NE(info);
		else if (ne == Cnd_table_id) doCnd_table_id_NE(info);
		else if (ne == Cnd_table_nm) doCnd_table_nm_NE(info);
		else if (ne == Cnd2_file_ext_typ_Group) doCnd2_file_ext_typ_NE(info);
		else if (ne == Cnd2_fmt_typ_Group) doCnd2_fmt_typ_NE(info);
		else if (ne == Cnd2_dir) doCnd2_dir_NE(info);
		else if (ne == Cnd2_proc_typ_Group) doCnd2_proc_typ_NE(info);
		else if (ne == Cnd2_err_typ_Group) doCnd2_err_typ_NE(info);
		else if (ne == Cnd2_data_start_row) doCnd2_data_start_row_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_table_ctg) doDtl_table_ctg_NE(info);
		else if (ne == columnDtl_table_ctg_nm) doDtl_table_ctg_nm_NE(info);
		else if (ne == columnDtl_table_ctg_seq) doDtl_table_ctg_seq_NE(info);
		else if (ne == columnDtl_table_id) doDtl_table_id_NE(info);
		else if (ne == columnDtl_table_nm) doDtl_table_nm_NE(info);
		else if (ne == columnDtl_file_nm) doDtl_file_nm_NE(info);
		else if (ne == columnDtl_table_seq) doDtl_table_seq_NE(info);
		else if (ne == columnDtl_start_dt) doDtl_start_dt_NE(info);
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
	 * [Cnd]パネルの[table_ctg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[file_ext_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_file_ext_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[fmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_fmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[dir]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_dir_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[err_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_err_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[data_start_row]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_data_start_row_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[start_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_start_dt_NE(MCEventInfo info){
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
		else if (nx == Cnd_table_ctg) doCnd_table_ctg_NX(info);
		else if (nx == Cnd_table_ctg_nm) doCnd_table_ctg_nm_NX(info);
		else if (nx == Cnd_table_id) doCnd_table_id_NX(info);
		else if (nx == Cnd_table_nm) doCnd_table_nm_NX(info);
		else if (nx == Cnd2_file_ext_typ_Group) doCnd2_file_ext_typ_NX(info);
		else if (nx == Cnd2_fmt_typ_Group) doCnd2_fmt_typ_NX(info);
		else if (nx == Cnd2_dir) doCnd2_dir_NX(info);
		else if (nx == Cnd2_proc_typ_Group) doCnd2_proc_typ_NX(info);
		else if (nx == Cnd2_err_typ_Group) doCnd2_err_typ_NX(info);
		else if (nx == Cnd2_data_start_row) doCnd2_data_start_row_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_table_ctg) doDtl_table_ctg_NX(info);
		else if (nx == columnDtl_table_ctg_nm) doDtl_table_ctg_nm_NX(info);
		else if (nx == columnDtl_table_ctg_seq) doDtl_table_ctg_seq_NX(info);
		else if (nx == columnDtl_table_id) doDtl_table_id_NX(info);
		else if (nx == columnDtl_table_nm) doDtl_table_nm_NX(info);
		else if (nx == columnDtl_file_nm) doDtl_file_nm_NX(info);
		else if (nx == columnDtl_table_seq) doDtl_table_seq_NX(info);
		else if (nx == columnDtl_start_dt) doDtl_start_dt_NX(info);
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
	 * [Cnd]パネルの[table_ctg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[file_ext_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_file_ext_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[fmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_fmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[dir]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_dir_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[err_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_err_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[data_start_row]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_data_start_row_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[start_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_start_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_table_ctg) doCnd_table_ctg_LC(info);
		else if (lc == Cnd_table_ctg_nm) doCnd_table_ctg_nm_LC(info);
		else if (lc == Cnd_table_id) doCnd_table_id_LC(info);
		else if (lc == Cnd_table_nm) doCnd_table_nm_LC(info);
		else if (lc == Cnd2_dir) doCnd2_dir_LC(info);
		else if (lc == Cnd2_data_start_row) doCnd2_data_start_row_LC(info);
		else if (lc == columnDtl_table_ctg) doDtl_table_ctg_LC(info);
		else if (lc == columnDtl_table_ctg_nm) doDtl_table_ctg_nm_LC(info);
		else if (lc == columnDtl_table_ctg_seq) doDtl_table_ctg_seq_LC(info);
		else if (lc == columnDtl_table_id) doDtl_table_id_LC(info);
		else if (lc == columnDtl_table_nm) doDtl_table_nm_LC(info);
		else if (lc == columnDtl_file_nm) doDtl_file_nm_LC(info);
		else if (lc == columnDtl_table_seq) doDtl_table_seq_LC(info);
		else if (lc == columnDtl_start_dt) doDtl_start_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[table_ctg]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[table_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_table_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[dir]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_dir_LC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[data_start_row]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_data_start_row_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_ctg_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_ctg_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[table_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_table_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[start_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_start_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_table_ctg]の作成メソッド
	 */
	public MCList getCnd_table_ctg(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBulkImpCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_table_id]の作成メソッド
	 */
	public MCList getCnd_table_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBulkImpCtl(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0090.Srch01")) {
			return new MB_MBBEL0090_Srch01Bridge();
		}
		if (id.equals("MB.MBBEL0090.Upd01")) {
			return new MB_MBBEL0090_Upd01Bridge();
		}
		if (id.equals("MB.MBBEL0090.Upd02")) {
			return new MB_MBBEL0090_Upd02Bridge();
		}
		if (id.equals("MB.MBBEL0090.Prnt01")) {
			return new MB_MBBEL0090_Prnt01Bridge();
		}
		if (id.equals("MB.MBBEL0090.Prnt02")) {
			return new MB_MBBEL0090_Prnt02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0090_Srch01;

		/** コンストラクタ */
		protected MB_MBBEL0090_Srch01Bridge() {
			p_MB_MBBEL0090_Srch01 = new MCParam(PDef.MB_MBBEL0090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0090.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));

			p_MB_MBBEL0090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0090.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0090.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0090_Srch01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0090_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)p_MB_MBBEL0090_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MB_MBBEL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0090_Upd01;

		/** コンストラクタ */
		protected MB_MBBEL0090_Upd01Bridge() {
			p_MB_MBBEL0090_Upd01 = new MCParam(PDef.MB_MBBEL0090_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0090_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
			param.addUpBlock(mcframe.clientMBBE.MBBEP0090.Cnd2R.create());
			// Down

			p_MB_MBBEL0090_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0090_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0090_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MB_MBBEL0090_Upd01.addUpBlock(getCnd2R());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0090_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0090_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)up(0);
		}
		protected mcframe.clientMBBE.MBBEP0090.Cnd2R up1() {
			return (mcframe.clientMBBE.MBBEP0090.Cnd2R)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBEL0090_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCnd2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MB_MBBEL0090_Upd02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0090_Upd02;

		/** コンストラクタ */
		protected MB_MBBEL0090_Upd02Bridge() {
			p_MB_MBBEL0090_Upd02 = new MCParam(PDef.MB_MBBEL0090_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0090_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
			param.addUpBlock(mcframe.clientMBBE.MBBEP0090.Cnd2R.create());
			// Down

			p_MB_MBBEL0090_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0090_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0090_Upd02.addUpBlock(getDtlL().shallowClone());
			p_MB_MBBEL0090_Upd02.addUpBlock(getCnd2R());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0090_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0090_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)up(0);
		}
		protected mcframe.clientMBBE.MBBEP0090.Cnd2R up1() {
			return (mcframe.clientMBBE.MBBEP0090.Cnd2R)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBEL0090_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCnd2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MB_MBBEL0090_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0090_Prnt01;

		/** コンストラクタ */
		protected MB_MBBEL0090_Prnt01Bridge() {
			p_MB_MBBEL0090_Prnt01 = new MCParam(PDef.MB_MBBEL0090_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0090_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));

			p_MB_MBBEL0090_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0090_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0090_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0090_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0090_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0090_Prnt01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0090_Prnt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)p_MB_MBBEL0090_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0090_Prnt02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0090_Prnt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0090_Prnt02;

		/** コンストラクタ */
		protected MB_MBBEL0090_Prnt02Bridge() {
			p_MB_MBBEL0090_Prnt02 = new MCParam(PDef.MB_MBBEL0090_Prnt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0090_Prnt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0090.DtlR.class));
			param.addUpBlock(mcframe.clientMBBE.MBBEP0090.Cnd2R.create());
			// Down

			p_MB_MBBEL0090_Prnt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0090_Prnt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0090_Prnt02.addUpBlock(getDtlL().shallowClone());
			p_MB_MBBEL0090_Prnt02.addUpBlock(getCnd2R());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0090_Prnt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0090_Prnt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0090.DtlR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0090.DtlR>)up(0);
		}
		protected mcframe.clientMBBE.MBBEP0090.Cnd2R up1() {
			return (mcframe.clientMBBE.MBBEP0090.Cnd2R)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MB_MBBEL0090_Prnt02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCnd2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}