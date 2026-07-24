package mcframe.clientMBBE.MBBEP0040;

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
import mcframe.clientMBBE.MBBEP0040.MBBEP_BizDatDLConf_MC.MB_MBBEL0040_Prnt01Caller;

/**
 * 画面"MBBEP_BizDatDLConf"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_BizDatDLConf_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBEP0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_nm = null;
	/**
	 * File classification ファイル種類.<p>
	 *
	 */
	public MCButtonGroup Cnd_biz_dat_file_typ_Group = null;
	public MCRadioButton Cnd_biz_dat_file_typ_DOWNLOAD = null;
	public MCRadioButton Cnd_biz_dat_file_typ_SCREEN = null;
	public MCRadioButton Cnd_biz_dat_file_typ_REPORT = null;
	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_get_typ = null;
	// [Back]ブロック関連のField定義
	public MCPanel BackPanel = null;
	// [Back]ブロックの項目のField定義
	public MCLabel Back_dt1_Label = null;
	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public MCDateField Back_dt1 = null;
	public MCLabel Back_dt2_Label = null;
	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public MCDateField Back_dt2 = null;
	public MCLabel Back_dt3_Label = null;
	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public MCDateField Back_dt3 = null;
	public MCLabel Back_dt4_Label = null;
	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public MCDateField Back_dt4 = null;
	public MCLabel Back_dt5_Label = null;
	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public MCDateField Back_dt5 = null;
	public MCLabel Back_dt6_Label = null;
	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public MCDateField Back_dt6 = null;
	public MCLabel Back_dt7_Label = null;
	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public MCDateField Back_dt7 = null;
	public MCLabel Back_dt8_Label = null;
	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public MCDateField Back_dt8 = null;
	public MCLabel Back_dt9_Label = null;
	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public MCDateField Back_dt9 = null;
	public MCLabel Back_dt10_Label = null;
	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public MCDateField Back_dt10 = null;
	public MCLabel Back_str1_Label = null;
	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public MCTextField Back_str1 = null;
	public MCLabel Back_str2_Label = null;
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public MCTextField Back_str2 = null;
	public MCLabel Back_str3_Label = null;
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public MCTextField Back_str3 = null;
	public MCLabel Back_str4_Label = null;
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public MCTextField Back_str4 = null;
	public MCLabel Back_str5_Label = null;
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public MCTextField Back_str5 = null;
	public MCLabel Back_num1_Label = null;
	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public MCNumberField Back_num1 = null;
	public MCLabel Back_num2_Label = null;
	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public MCNumberField Back_num2 = null;
	public MCLabel Back_num3_Label = null;
	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public MCNumberField Back_num3 = null;
	public MCLabel Back_num4_Label = null;
	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public MCNumberField Back_num4 = null;
	public MCLabel Back_num5_Label = null;
	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public MCNumberField Back_num5 = null;
	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public MCCheckBox Back_flg1 = null;
	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public MCCheckBox Back_flg2 = null;
	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public MCCheckBox Back_flg3 = null;
	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public MCCheckBox Back_flg4 = null;
	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public MCCheckBox Back_flg5 = null;
	// [Bind]ブロック関連のField定義
	public MCPanel BindPanel = null;
	public MCScrollPane BindScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0040.BindR> BindTable = null;
	// [Bind]ブロックの項目のField定義
	/**
	 * Search criteria 検索条件.<p>
	 *
	 */
	public MCColumnConfig columnBind_cond_col = null;
	/**
	 * Value 値.<p>
	 *
	 */
	public MCColumnConfig columnBind_cond_val = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MB_MBBEL0040_Prnt01]のCallerの作成 */
	protected MBBEP_BizDatDLConf_MC.MB_MBBEL0040_Prnt01Caller createMB_MBBEL0040_Prnt01() {
		MBBEP_BizDatDLConf_MC.MB_MBBEL0040_Prnt01Caller<MBBEP_BizDatDLConf, MB_MBBEL0040_Prnt01Bridge>
		caller = ((MBBEP_BizDatDLConf_MC)this).new MB_MBBEL0040_Prnt01Caller<MBBEP_BizDatDLConf, MB_MBBEL0040_Prnt01Bridge>(
					(MBBEP_BizDatDLConf)this, new MB_MBBEL0040_Prnt01Bridge());
		return caller;
	}
	/** [MB_MBBEL0040_Prnt01]の呼び出し */
	protected void callMB_MBBEL0040_Prnt01() {
		MCCaller caller = createMB_MBBEL0040_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0040.CndR aCndR;
	/** [Back]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0040.BackR aBackR;
	/** [Bind]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0040.BindR> aBindL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0040.RsltR> aRsltL;
	/** [RsltLbl]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0040.RsltLblR aRsltLblR;
	/** [RsltSml]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0040.RsltSmlR aRsltSmlR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0040.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaBackRを設定します。
	 *
	 * aBackRのインスタンスは変更されません。
	 *
	 * @param row BackR
	 */
	public void setBackR(mcframe.clientMBBE.MBBEP0040.BackR row) {
		if (row != null) {
			MCRow.copyall(getBackR(), row);
		}
	}

	/**
	 * [Back]ブロックのコンテナaBackRを返します。
	 *
	 * @return BackR
	 */
	public mcframe.clientMBBE.MBBEP0040.BackR getBackR() {
		return aBackR;
	}

	/**
	 * aBackRを作成します。
	 *
	 * @return BackR
	 */
	public mcframe.clientMBBE.MBBEP0040.BackR createBackR() {
		return mcframe.clientMBBE.MBBEP0040.BackR.create();
	}

	/**
	 * コピーによってaBindLを設定します。
	 *
	 * aBindLのインスタンスは変更されません。
	 *
	 * @param dataset BindL
	 */
	public void setBindL(MCList<mcframe.clientMBBE.MBBEP0040.BindR> aList) {
		if (getBindL() != aList) {
			getBindL().setAll(aList);
		}
	}

	/**
	 * [Bind]ブロックのコンテナaBindLを返します。
	 *
	 * @return BindL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0040.BindR> getBindL() {
		return aBindL;
	}

	/**
	 * aBindRを作成します。
	 *
	 * @return BindR
	 */
	public mcframe.clientMBBE.MBBEP0040.BindR createBindR() {
		return mcframe.clientMBBE.MBBEP0040.BindR.create();
	}

	/**
	 * aBindLを作成します。
	 *
	 * @return BindL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0040.BindR> createBindL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0040.BindR.class);
	}

	/**
	 * BindTableを初期化します。
	 */
	protected void createBindTable(){
		if(BindTable == null){
			BindTable = beansFactory.createTable2("Bind.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBE.MBBEP0040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBE.MBBEP0040.RsltR createRsltR() {
		return mcframe.clientMBBE.MBBEP0040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0040.RsltR.class);
	}

	/**
	 * 項目コピーによってaRsltLblRを設定します。
	 *
	 * aRsltLblRのインスタンスは変更されません。
	 *
	 * @param row RsltLblR
	 */
	public void setRsltLblR(mcframe.clientMBBE.MBBEP0040.RsltLblR row) {
		if (row != null) {
			MCRow.copyall(getRsltLblR(), row);
		}
	}

	/**
	 * [RsltLbl]ブロックのコンテナaRsltLblRを返します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0040.RsltLblR getRsltLblR() {
		return aRsltLblR;
	}

	/**
	 * aRsltLblRを作成します。
	 *
	 * @return RsltLblR
	 */
	public mcframe.clientMBBE.MBBEP0040.RsltLblR createRsltLblR() {
		return mcframe.clientMBBE.MBBEP0040.RsltLblR.create();
	}

	/**
	 * 項目コピーによってaRsltSmlRを設定します。
	 *
	 * aRsltSmlRのインスタンスは変更されません。
	 *
	 * @param row RsltSmlR
	 */
	public void setRsltSmlR(mcframe.clientMBBE.MBBEP0040.RsltSmlR row) {
		if (row != null) {
			MCRow.copyall(getRsltSmlR(), row);
		}
	}

	/**
	 * [RsltSml]ブロックのコンテナaRsltSmlRを返します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0040.RsltSmlR getRsltSmlR() {
		return aRsltSmlR;
	}

	/**
	 * aRsltSmlRを作成します。
	 *
	 * @return RsltSmlR
	 */
	public mcframe.clientMBBE.MBBEP0040.RsltSmlR createRsltSmlR() {
		return mcframe.clientMBBE.MBBEP0040.RsltSmlR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBackR())) ret.add(getBackR());
		if(!MCCollectionUtil.contains(ret, getBindL())) ret.add(getBindL());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltLblR())) ret.add(getRsltLblR());
		if(!MCCollectionUtil.contains(ret, getRsltSmlR())) ret.add(getRsltSmlR());
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
		if(aCnt == getBackR()) return "Back";
		if(aCnt == getBindL()) return "Bind";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltLblR()) return "RsltLbl";
		if(aCnt == getRsltSmlR()) return "RsltSml";
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
		if(bId.equals("Back")) return getBackR();
		if(bId.equals("Bind")) return getBindL();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltLbl")) return getRsltLblR();
		if(bId.equals("RsltSml")) return getRsltSmlR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(BackPanel);
		ret.add(BindPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDLConf_MC_A() {
		aCndR = createCndR();
		aBackR = createBackR();
		aBindL = createBindL();
		aRsltL = createRsltL();
		aRsltLblR = createRsltLblR();
		aRsltSmlR = createRsltSmlR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BizDatDLConf_MC_A(String name) {
		aCndR = createCndR();
		aBackR = createBackR();
		aBindL = createBindL();
		createBindTable();
		BindTable.setRowName(name);
		aRsltL = createRsltL();
		aRsltLblR = createRsltLblR();
		aRsltSmlR = createRsltSmlR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_BizDatDLConf_MC.jbCreateCnd((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbCreateBack((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbCreateBind((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbCreateBtn((MBBEP_BizDatDLConf)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_BizDatDLConf p) {
	}

	/**
	 * [Back]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBack(MBBEP_BizDatDLConf p) {
	}

	/**
	 * [Bind]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBind(MBBEP_BizDatDLConf p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_BizDatDLConf p) {
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

	
	/** [Cnd_biz_dat_id_ListPutter]の定義 */
	private MCListPutter Cnd_biz_dat_id_p = null;

	/**
	 * [Cnd_biz_dat_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_dat_id_ListPutter() {
		if (Cnd_biz_dat_id_p == null) {
			Cnd_biz_dat_id_p = createCnd_biz_dat_id_ListPutter(Cnd_biz_dat_id, "biz_dat_id", "biz_dat_nm","biz_dat_get_typ");

		}
		return Cnd_biz_dat_id_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDLConf create(){
		MBBEP_BizDatDLConf p = new MBBEP_BizDatDLConf();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDLConf create(String name){
		MBBEP_BizDatDLConf p = new MBBEP_BizDatDLConf(name);
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
		MBBEP_BizDatDLConf_MC.jbfInitCnd((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbfInitBack((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbfInitBind((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbfInitBtn((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbInitCnd((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbInitBack((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbInitBind((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.jbInitBtn((MBBEP_BizDatDLConf)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id_Label = p.beansFactory.createLabel("Cnd.biz_dat_id_Label");
		p.Cnd_biz_dat_id = p.beansFactory.createTextComboBox("Cnd.biz_dat_id");
		p.Cnd_biz_dat_id.setLabel(p.Cnd_biz_dat_id_Label);
		p.Cnd_biz_dat_nm = p.beansFactory.createTextField("Cnd.biz_dat_nm");
		p.Cnd_biz_dat_file_typ_Group = p.beansFactory.createButtonGroup("Cnd.biz_dat_file_typ");
		p.Cnd_biz_dat_file_typ_DOWNLOAD = p.beansFactory.createRadioButton("Cnd.biz_dat_file_typ_DOWNLOAD");
		p.Cnd_biz_dat_file_typ_SCREEN = p.beansFactory.createRadioButton("Cnd.biz_dat_file_typ_SCREEN");
		p.Cnd_biz_dat_file_typ_REPORT = p.beansFactory.createRadioButton("Cnd.biz_dat_file_typ_REPORT");
		p.Cnd_biz_dat_get_typ = p.beansFactory.createTextField("Cnd.biz_dat_get_typ");
	}

	/**
	 * [Back]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBack(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.BackPanel = p.beansFactory.createPanel("Back");
		// ブロックの項目の初期化
		p.Back_dt1_Label = p.beansFactory.createLabel("Back.dt1_Label");
		p.Back_dt1 = p.beansFactory.createDateField("Back.dt1");
		p.Back_dt1.setLabel(p.Back_dt1_Label);
		p.Back_dt2_Label = p.beansFactory.createLabel("Back.dt2_Label");
		p.Back_dt2 = p.beansFactory.createDateField("Back.dt2");
		p.Back_dt2.setLabel(p.Back_dt2_Label);
		p.Back_dt3_Label = p.beansFactory.createLabel("Back.dt3_Label");
		p.Back_dt3 = p.beansFactory.createDateField("Back.dt3");
		p.Back_dt3.setLabel(p.Back_dt3_Label);
		p.Back_dt4_Label = p.beansFactory.createLabel("Back.dt4_Label");
		p.Back_dt4 = p.beansFactory.createDateField("Back.dt4");
		p.Back_dt4.setLabel(p.Back_dt4_Label);
		p.Back_dt5_Label = p.beansFactory.createLabel("Back.dt5_Label");
		p.Back_dt5 = p.beansFactory.createDateField("Back.dt5");
		p.Back_dt5.setLabel(p.Back_dt5_Label);
		p.Back_dt6_Label = p.beansFactory.createLabel("Back.dt6_Label");
		p.Back_dt6 = p.beansFactory.createDateField("Back.dt6");
		p.Back_dt6.setLabel(p.Back_dt6_Label);
		p.Back_dt7_Label = p.beansFactory.createLabel("Back.dt7_Label");
		p.Back_dt7 = p.beansFactory.createDateField("Back.dt7");
		p.Back_dt7.setLabel(p.Back_dt7_Label);
		p.Back_dt8_Label = p.beansFactory.createLabel("Back.dt8_Label");
		p.Back_dt8 = p.beansFactory.createDateField("Back.dt8");
		p.Back_dt8.setLabel(p.Back_dt8_Label);
		p.Back_dt9_Label = p.beansFactory.createLabel("Back.dt9_Label");
		p.Back_dt9 = p.beansFactory.createDateField("Back.dt9");
		p.Back_dt9.setLabel(p.Back_dt9_Label);
		p.Back_dt10_Label = p.beansFactory.createLabel("Back.dt10_Label");
		p.Back_dt10 = p.beansFactory.createDateField("Back.dt10");
		p.Back_dt10.setLabel(p.Back_dt10_Label);
		p.Back_str1_Label = p.beansFactory.createLabel("Back.str1_Label");
		p.Back_str1 = p.beansFactory.createTextField("Back.str1");
		p.Back_str1.setLabel(p.Back_str1_Label);
		p.Back_str2_Label = p.beansFactory.createLabel("Back.str2_Label");
		p.Back_str2 = p.beansFactory.createTextField("Back.str2");
		p.Back_str2.setLabel(p.Back_str2_Label);
		p.Back_str3_Label = p.beansFactory.createLabel("Back.str3_Label");
		p.Back_str3 = p.beansFactory.createTextField("Back.str3");
		p.Back_str3.setLabel(p.Back_str3_Label);
		p.Back_str4_Label = p.beansFactory.createLabel("Back.str4_Label");
		p.Back_str4 = p.beansFactory.createTextField("Back.str4");
		p.Back_str4.setLabel(p.Back_str4_Label);
		p.Back_str5_Label = p.beansFactory.createLabel("Back.str5_Label");
		p.Back_str5 = p.beansFactory.createTextField("Back.str5");
		p.Back_str5.setLabel(p.Back_str5_Label);
		p.Back_num1_Label = p.beansFactory.createLabel("Back.num1_Label");
		p.Back_num1 = p.beansFactory.createNumberField("Back.num1");
		p.Back_num1.setLabel(p.Back_num1_Label);
		p.Back_num2_Label = p.beansFactory.createLabel("Back.num2_Label");
		p.Back_num2 = p.beansFactory.createNumberField("Back.num2");
		p.Back_num2.setLabel(p.Back_num2_Label);
		p.Back_num3_Label = p.beansFactory.createLabel("Back.num3_Label");
		p.Back_num3 = p.beansFactory.createNumberField("Back.num3");
		p.Back_num3.setLabel(p.Back_num3_Label);
		p.Back_num4_Label = p.beansFactory.createLabel("Back.num4_Label");
		p.Back_num4 = p.beansFactory.createNumberField("Back.num4");
		p.Back_num4.setLabel(p.Back_num4_Label);
		p.Back_num5_Label = p.beansFactory.createLabel("Back.num5_Label");
		p.Back_num5 = p.beansFactory.createNumberField("Back.num5");
		p.Back_num5.setLabel(p.Back_num5_Label);
		p.Back_flg1 = p.beansFactory.createCheckBox("Back.flg1");
		p.Back_flg2 = p.beansFactory.createCheckBox("Back.flg2");
		p.Back_flg3 = p.beansFactory.createCheckBox("Back.flg3");
		p.Back_flg4 = p.beansFactory.createCheckBox("Back.flg4");
		p.Back_flg5 = p.beansFactory.createCheckBox("Back.flg5");
	}

	/**
	 * [Bind]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBind(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.BindPanel = p.beansFactory.createPanel("Bind");
		p.BindScrollPane = p.beansFactory.createScrollPane("Bind.scroll");
		p.createBindTable();
		// ブロックの項目の初期化
		p.columnBind_cond_col = p.beansFactory.createTableColumn("Bind.cond_col", MCColumnType.TEXT);
		p.columnBind_cond_val = p.beansFactory.createTableColumn("Bind.cond_val", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.BackPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_biz_dat_id.setListType(MCListType.STRICT);
		p.Cnd_biz_dat_id.setLinkBeans(p.Cnd_biz_dat_nm,p.Cnd_biz_dat_get_typ);
		p.CndPanel.add(p.Cnd_biz_dat_id_Label);
		p.CndPanel.add(p.Cnd_biz_dat_id);
		p.CndPanel.setLastBeans(p.Cnd_biz_dat_id);
		p.Cnd_biz_dat_id.setNextBeans(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0040.CndR.biz_dat_id_META);
		p.CndPanel.add(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_nm.setNextBeans(p.Cnd_biz_dat_file_typ_Group);
		p.Cnd_biz_dat_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0040.CndR.biz_dat_nm_META);
		p.Cnd_biz_dat_file_typ_Group.setFirstBeans(p.Cnd_biz_dat_file_typ_DOWNLOAD);
		p.Cnd_biz_dat_file_typ_DOWNLOAD.setActionCommand("1");
		p.Cnd_biz_dat_file_typ_Group.add(p.Cnd_biz_dat_file_typ_DOWNLOAD);
		p.CndPanel.add(p.Cnd_biz_dat_file_typ_DOWNLOAD);
		p.Cnd_biz_dat_file_typ_DOWNLOAD.setNextBeans(p.Cnd_biz_dat_file_typ_SCREEN);
		p.Cnd_biz_dat_file_typ_SCREEN.setActionCommand("X");
		p.Cnd_biz_dat_file_typ_Group.add(p.Cnd_biz_dat_file_typ_SCREEN);
		p.CndPanel.add(p.Cnd_biz_dat_file_typ_SCREEN);
		p.Cnd_biz_dat_file_typ_SCREEN.setNextBeans(p.Cnd_biz_dat_file_typ_REPORT);
		p.Cnd_biz_dat_file_typ_REPORT.setActionCommand("3");
		p.Cnd_biz_dat_file_typ_Group.add(p.Cnd_biz_dat_file_typ_REPORT);
		p.CndPanel.add(p.Cnd_biz_dat_file_typ_REPORT);
		p.Cnd_biz_dat_file_typ_Group.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0040.CndR.biz_dat_file_typ_META);
		p.Cnd_biz_dat_file_typ_Group.setNextBeans(p.Cnd_biz_dat_get_typ);
		p.CndPanel.add(p.Cnd_biz_dat_get_typ);
		p.Cnd_biz_dat_get_typ.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0040.CndR.biz_dat_get_typ_META);
	}

	/**
	 * [Back]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBack(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.add(p.BackPanel);
		p.BackPanel.setNextBeans(p.BindPanel);
		p.BackPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BackPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.BackPanel.add(p.Back_dt1_Label);
		p.BackPanel.add(p.Back_dt1);
		p.BackPanel.setLastBeans(p.Back_dt1);
		p.Back_dt1.setNextBeans(p.Back_dt2);
		p.Back_dt1.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt1_META);
		p.Back_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt2_Label);
		p.BackPanel.add(p.Back_dt2);
		p.Back_dt2.setNextBeans(p.Back_dt3);
		p.Back_dt2.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt2_META);
		p.Back_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt3_Label);
		p.BackPanel.add(p.Back_dt3);
		p.Back_dt3.setNextBeans(p.Back_dt4);
		p.Back_dt3.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt3_META);
		p.Back_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt4_Label);
		p.BackPanel.add(p.Back_dt4);
		p.Back_dt4.setNextBeans(p.Back_dt5);
		p.Back_dt4.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt4_META);
		p.Back_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt5_Label);
		p.BackPanel.add(p.Back_dt5);
		p.Back_dt5.setNextBeans(p.Back_dt6);
		p.Back_dt5.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt5_META);
		p.Back_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt6_Label);
		p.BackPanel.add(p.Back_dt6);
		p.Back_dt6.setNextBeans(p.Back_dt7);
		p.Back_dt6.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt6_META);
		p.Back_dt6.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt7_Label);
		p.BackPanel.add(p.Back_dt7);
		p.Back_dt7.setNextBeans(p.Back_dt8);
		p.Back_dt7.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt7_META);
		p.Back_dt7.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt8_Label);
		p.BackPanel.add(p.Back_dt8);
		p.Back_dt8.setNextBeans(p.Back_dt9);
		p.Back_dt8.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt8_META);
		p.Back_dt8.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt9_Label);
		p.BackPanel.add(p.Back_dt9);
		p.Back_dt9.setNextBeans(p.Back_dt10);
		p.Back_dt9.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt9_META);
		p.Back_dt9.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_dt10_Label);
		p.BackPanel.add(p.Back_dt10);
		p.Back_dt10.setNextBeans(p.Back_str1);
		p.Back_dt10.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.dt10_META);
		p.Back_dt10.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BackPanel.add(p.Back_str1_Label);
		p.BackPanel.add(p.Back_str1);
		p.Back_str1.setNextBeans(p.Back_str2);
		p.Back_str1.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.str1_META);
		p.BackPanel.add(p.Back_str2_Label);
		p.BackPanel.add(p.Back_str2);
		p.Back_str2.setNextBeans(p.Back_str3);
		p.Back_str2.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.str2_META);
		p.BackPanel.add(p.Back_str3_Label);
		p.BackPanel.add(p.Back_str3);
		p.Back_str3.setNextBeans(p.Back_str4);
		p.Back_str3.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.str3_META);
		p.BackPanel.add(p.Back_str4_Label);
		p.BackPanel.add(p.Back_str4);
		p.Back_str4.setNextBeans(p.Back_str5);
		p.Back_str4.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.str4_META);
		p.BackPanel.add(p.Back_str5_Label);
		p.BackPanel.add(p.Back_str5);
		p.Back_str5.setNextBeans(p.Back_num1);
		p.Back_str5.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.str5_META);
		p.BackPanel.add(p.Back_num1_Label);
		p.BackPanel.add(p.Back_num1);
		p.Back_num1.setNextBeans(p.Back_num2);
		p.Back_num1.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.num1_META);
		p.BackPanel.add(p.Back_num2_Label);
		p.BackPanel.add(p.Back_num2);
		p.Back_num2.setNextBeans(p.Back_num3);
		p.Back_num2.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.num2_META);
		p.BackPanel.add(p.Back_num3_Label);
		p.BackPanel.add(p.Back_num3);
		p.Back_num3.setNextBeans(p.Back_num4);
		p.Back_num3.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.num3_META);
		p.BackPanel.add(p.Back_num4_Label);
		p.BackPanel.add(p.Back_num4);
		p.Back_num4.setNextBeans(p.Back_num5);
		p.Back_num4.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.num4_META);
		p.BackPanel.add(p.Back_num5_Label);
		p.BackPanel.add(p.Back_num5);
		p.Back_num5.setNextBeans(p.Back_flg1);
		p.Back_num5.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.num5_META);
		p.BackPanel.add(p.Back_flg1);
		p.Back_flg1.setNextBeans(p.Back_flg2);
		p.Back_flg1.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.flg1_META);
		p.BackPanel.add(p.Back_flg2);
		p.Back_flg2.setNextBeans(p.Back_flg3);
		p.Back_flg2.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.flg2_META);
		p.BackPanel.add(p.Back_flg3);
		p.Back_flg3.setNextBeans(p.Back_flg4);
		p.Back_flg3.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.flg3_META);
		p.BackPanel.add(p.Back_flg4);
		p.Back_flg4.setNextBeans(p.Back_flg5);
		p.Back_flg4.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.flg4_META);
		p.BackPanel.add(p.Back_flg5);
		p.Back_flg5.setRow(p.getBackR(), mcframe.clientMBBE.MBBEP0040.BackR.flg5_META);
	}

	/**
	 * [Bind]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBind(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.add(p.BindPanel);
		p.BindPanel.setNextBeans(p.BtnPanel);
		p.BindPanel.add(p.BindScrollPane);
		p.BindPanel.setLastBeans(p.BindTable);
		p.BindScrollPane.setViewportView(p.BindTable);
		p.BindTable.setList(p.getBindL());
		p.BindTable.setStatusColumnVisible(false);
		p.BindPanel.setValueCheck(false);
		p.BindPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_BizDatDLConf p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SS");
		// ブロックの項目の初期化
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
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
		MBBEP_BizDatDLConf_MC.mcInitCnd((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.mcInitBack((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.mcInitBind((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.mcInitBtn((MBBEP_BizDatDLConf)this);

		// [SRCH]ステータスのモードの設定
		MBBEP_BizDatDLConf_MC.statusInitSRCH_Cnd((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_Back((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_Bind((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_Btn((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_Rslt((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_RsltLbl((MBBEP_BizDatDLConf)this);
		MBBEP_BizDatDLConf_MC.statusInitSRCH_RsltSml((MBBEP_BizDatDLConf)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_BizDatDLConf p) {
		p.Cnd_biz_dat_id.setListListener(p);
		p.Cnd_biz_dat_id.addAllListener(p);
		p.Cnd_biz_dat_nm.setListListener(p);
		p.Cnd_biz_dat_nm.addAllListener(p);
		p.Cnd_biz_dat_file_typ_Group.addAllListener(p);
		p.Cnd_biz_dat_file_typ_DOWNLOAD.addAllListener(p);
		p.Cnd_biz_dat_file_typ_SCREEN.addAllListener(p);
		p.Cnd_biz_dat_file_typ_REPORT.addAllListener(p);
		p.Cnd_biz_dat_get_typ.setListListener(p);
		p.Cnd_biz_dat_get_typ.addAllListener(p);
	}

	/**
	 *  [Back]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBack(MBBEP_BizDatDLConf p) {
		p.Back_dt1.setListListener(p);
		p.Back_dt1.addAllListener(p);
		p.Back_dt2.setListListener(p);
		p.Back_dt2.addAllListener(p);
		p.Back_dt3.setListListener(p);
		p.Back_dt3.addAllListener(p);
		p.Back_dt4.setListListener(p);
		p.Back_dt4.addAllListener(p);
		p.Back_dt5.setListListener(p);
		p.Back_dt5.addAllListener(p);
		p.Back_dt6.setListListener(p);
		p.Back_dt6.addAllListener(p);
		p.Back_dt7.setListListener(p);
		p.Back_dt7.addAllListener(p);
		p.Back_dt8.setListListener(p);
		p.Back_dt8.addAllListener(p);
		p.Back_dt9.setListListener(p);
		p.Back_dt9.addAllListener(p);
		p.Back_dt10.setListListener(p);
		p.Back_dt10.addAllListener(p);
		p.Back_str1.setListListener(p);
		p.Back_str1.addAllListener(p);
		p.Back_str2.setListListener(p);
		p.Back_str2.addAllListener(p);
		p.Back_str3.setListListener(p);
		p.Back_str3.addAllListener(p);
		p.Back_str4.setListListener(p);
		p.Back_str4.addAllListener(p);
		p.Back_str5.setListListener(p);
		p.Back_str5.addAllListener(p);
		p.Back_num1.setListListener(p);
		p.Back_num1.addAllListener(p);
		p.Back_num2.setListListener(p);
		p.Back_num2.addAllListener(p);
		p.Back_num3.setListListener(p);
		p.Back_num3.addAllListener(p);
		p.Back_num4.setListListener(p);
		p.Back_num4.addAllListener(p);
		p.Back_num5.setListListener(p);
		p.Back_num5.addAllListener(p);
		p.Back_flg1.addAllListener(p);
		p.Back_flg2.addAllListener(p);
		p.Back_flg3.addAllListener(p);
		p.Back_flg4.addAllListener(p);
		p.Back_flg5.addAllListener(p);
	}

	/**
	 *  [Bind]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBind(MBBEP_BizDatDLConf p) {
		p.BindTable.addAllListener(p);
		p.columnBind_cond_col.addAllListener(p);
		p.columnBind_cond_col.setListListener(p);
		p.columnBind_cond_val.addAllListener(p);
		p.columnBind_cond_val.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_BizDatDLConf p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBEP_BizDatDLConf p){
		p.Cnd_biz_dat_id.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_dat_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_biz_dat_file_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_dat_get_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Back]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Back(MBBEP_BizDatDLConf p){
		p.Back_dt1.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt2.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt3.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt4.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt5.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt6.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt7.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt8.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt9.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_dt10.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_str1.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_str2.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_str3.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_str4.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_str5.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_num1.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_num2.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_num3.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_num4.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_num5.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_flg1.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_flg2.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_flg3.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_flg4.putMode(p, SRCH, MCMode.ENABLE);
		p.Back_flg5.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Bind]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bind(MBBEP_BizDatDLConf p){
		p.columnBind_cond_col.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnBind_cond_val.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBEP_BizDatDLConf p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBEP_BizDatDLConf p){

	}

	/**
	 * [SRCH]ステータスの[RsltLbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltLbl(MBBEP_BizDatDLConf p){

	}

	/**
	 * [SRCH]ステータスの[RsltSml]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltSml(MBBEP_BizDatDLConf p){

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
		MBBEP_BizDatDLConf_MC.setTableConfigBind((MBBEP_BizDatDLConf)this);
	}

	/**
	 * [Bind]ブロックのTableの設定
	 */
	protected static void setTableConfigBind(MBBEP_BizDatDLConf p) {
		p.columnBind_cond_col.setMeta(mcframe.clientMBBE.MBBEP0040.BindR.cond_col_META);
		p.BindTable.addColumnConfig(p.columnBind_cond_col);
		p.columnBind_cond_val.setMeta(mcframe.clientMBBE.MBBEP0040.BindR.cond_val_META);
		p.BindTable.addColumnConfig(p.columnBind_cond_val);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_dat_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_dat_id.getListConfig().setPutter(getCnd_biz_dat_id_ListPutter());
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
	 * [Cnd_biz_dat_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_dat_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BizDatID");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_biz_dat_id) return getCnd_biz_dat_id(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_prnt) doBtn_prnt(info);
	}

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == BindTable) return doBind_VC(info);
		if (vc == Cnd_biz_dat_id) return doCnd_biz_dat_id_VC(info);
		if (vc == Cnd_biz_dat_nm) return doCnd_biz_dat_nm_VC(info);
		if (vc == Cnd_biz_dat_file_typ_Group) return doCnd_biz_dat_file_typ_VC(info);
		if (vc == Cnd_biz_dat_get_typ) return doCnd_biz_dat_get_typ_VC(info);
		if (vc == Back_dt1) return doBack_dt1_VC(info);
		if (vc == Back_dt2) return doBack_dt2_VC(info);
		if (vc == Back_dt3) return doBack_dt3_VC(info);
		if (vc == Back_dt4) return doBack_dt4_VC(info);
		if (vc == Back_dt5) return doBack_dt5_VC(info);
		if (vc == Back_dt6) return doBack_dt6_VC(info);
		if (vc == Back_dt7) return doBack_dt7_VC(info);
		if (vc == Back_dt8) return doBack_dt8_VC(info);
		if (vc == Back_dt9) return doBack_dt9_VC(info);
		if (vc == Back_dt10) return doBack_dt10_VC(info);
		if (vc == Back_str1) return doBack_str1_VC(info);
		if (vc == Back_str2) return doBack_str2_VC(info);
		if (vc == Back_str3) return doBack_str3_VC(info);
		if (vc == Back_str4) return doBack_str4_VC(info);
		if (vc == Back_str5) return doBack_str5_VC(info);
		if (vc == Back_num1) return doBack_num1_VC(info);
		if (vc == Back_num2) return doBack_num2_VC(info);
		if (vc == Back_num3) return doBack_num3_VC(info);
		if (vc == Back_num4) return doBack_num4_VC(info);
		if (vc == Back_num5) return doBack_num5_VC(info);
		if (vc == Back_flg1) return doBack_flg1_VC(info);
		if (vc == Back_flg2) return doBack_flg2_VC(info);
		if (vc == Back_flg3) return doBack_flg3_VC(info);
		if (vc == Back_flg4) return doBack_flg4_VC(info);
		if (vc == Back_flg5) return doBack_flg5_VC(info);
		if (vc == columnBind_cond_col) return doBind_cond_col_VC(info);
		if (vc == columnBind_cond_val) return doBind_cond_val_VC(info);
		return true;
	}

	/**
	 * [Bind]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBind_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_file_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_file_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_get_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_get_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[dt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_dt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[str1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_str1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[str2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_str2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[str3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_str3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[str4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_str4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[str5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_str5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[num4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_num4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[num5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_num5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Back]パネルの[flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBack_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Bind]パネルの[cond_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBind_cond_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Bind]パネルの[cond_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBind_cond_val_VC(MCEventInfo info){
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
		if (nc == BindTable) doBind_NC(info);
		else if (nc == Cnd_biz_dat_id) doCnd_biz_dat_id_NC(info);
		else if (nc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NC(info);
		else if (nc == Cnd_biz_dat_file_typ_Group) doCnd_biz_dat_file_typ_NC(info);
		else if (nc == Cnd_biz_dat_get_typ) doCnd_biz_dat_get_typ_NC(info);
		else if (nc == Back_dt1) doBack_dt1_NC(info);
		else if (nc == Back_dt2) doBack_dt2_NC(info);
		else if (nc == Back_dt3) doBack_dt3_NC(info);
		else if (nc == Back_dt4) doBack_dt4_NC(info);
		else if (nc == Back_dt5) doBack_dt5_NC(info);
		else if (nc == Back_dt6) doBack_dt6_NC(info);
		else if (nc == Back_dt7) doBack_dt7_NC(info);
		else if (nc == Back_dt8) doBack_dt8_NC(info);
		else if (nc == Back_dt9) doBack_dt9_NC(info);
		else if (nc == Back_dt10) doBack_dt10_NC(info);
		else if (nc == Back_str1) doBack_str1_NC(info);
		else if (nc == Back_str2) doBack_str2_NC(info);
		else if (nc == Back_str3) doBack_str3_NC(info);
		else if (nc == Back_str4) doBack_str4_NC(info);
		else if (nc == Back_str5) doBack_str5_NC(info);
		else if (nc == Back_num1) doBack_num1_NC(info);
		else if (nc == Back_num2) doBack_num2_NC(info);
		else if (nc == Back_num3) doBack_num3_NC(info);
		else if (nc == Back_num4) doBack_num4_NC(info);
		else if (nc == Back_num5) doBack_num5_NC(info);
		else if (nc == Back_flg1) doBack_flg1_NC(info);
		else if (nc == Back_flg2) doBack_flg2_NC(info);
		else if (nc == Back_flg3) doBack_flg3_NC(info);
		else if (nc == Back_flg4) doBack_flg4_NC(info);
		else if (nc == Back_flg5) doBack_flg5_NC(info);
		else if (nc == columnBind_cond_col) doBind_cond_col_NC(info);
		else if (nc == columnBind_cond_val) doBind_cond_val_NC(info);
	}

	/**
	 * [Bind]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_file_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_file_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_get_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_get_typ_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt6_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt7_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt8_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt9_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt10_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str1_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str2_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str3_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str4_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str5_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num1_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num2_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num3_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num4_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num5_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_col_NC(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_val_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == BindTable) doBind_NE(info);
		else if (ne == Cnd_biz_dat_id) doCnd_biz_dat_id_NE(info);
		else if (ne == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NE(info);
		else if (ne == Cnd_biz_dat_file_typ_Group) doCnd_biz_dat_file_typ_NE(info);
		else if (ne == Cnd_biz_dat_get_typ) doCnd_biz_dat_get_typ_NE(info);
		else if (ne == Back_dt1) doBack_dt1_NE(info);
		else if (ne == Back_dt2) doBack_dt2_NE(info);
		else if (ne == Back_dt3) doBack_dt3_NE(info);
		else if (ne == Back_dt4) doBack_dt4_NE(info);
		else if (ne == Back_dt5) doBack_dt5_NE(info);
		else if (ne == Back_dt6) doBack_dt6_NE(info);
		else if (ne == Back_dt7) doBack_dt7_NE(info);
		else if (ne == Back_dt8) doBack_dt8_NE(info);
		else if (ne == Back_dt9) doBack_dt9_NE(info);
		else if (ne == Back_dt10) doBack_dt10_NE(info);
		else if (ne == Back_str1) doBack_str1_NE(info);
		else if (ne == Back_str2) doBack_str2_NE(info);
		else if (ne == Back_str3) doBack_str3_NE(info);
		else if (ne == Back_str4) doBack_str4_NE(info);
		else if (ne == Back_str5) doBack_str5_NE(info);
		else if (ne == Back_num1) doBack_num1_NE(info);
		else if (ne == Back_num2) doBack_num2_NE(info);
		else if (ne == Back_num3) doBack_num3_NE(info);
		else if (ne == Back_num4) doBack_num4_NE(info);
		else if (ne == Back_num5) doBack_num5_NE(info);
		else if (ne == Back_flg1) doBack_flg1_NE(info);
		else if (ne == Back_flg2) doBack_flg2_NE(info);
		else if (ne == Back_flg3) doBack_flg3_NE(info);
		else if (ne == Back_flg4) doBack_flg4_NE(info);
		else if (ne == Back_flg5) doBack_flg5_NE(info);
		else if (ne == columnBind_cond_col) doBind_cond_col_NE(info);
		else if (ne == columnBind_cond_val) doBind_cond_val_NE(info);
	}

	/**
	 * [Bind]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_file_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_file_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_get_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_get_typ_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt6_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt7_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt8_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt9_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt10_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str1_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str2_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str3_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str4_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str5_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num1_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num2_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num3_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num4_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num5_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_col_NE(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_val_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == BindTable) doBind_NX(info);
		else if (nx == Cnd_biz_dat_id) doCnd_biz_dat_id_NX(info);
		else if (nx == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NX(info);
		else if (nx == Cnd_biz_dat_file_typ_Group) doCnd_biz_dat_file_typ_NX(info);
		else if (nx == Cnd_biz_dat_get_typ) doCnd_biz_dat_get_typ_NX(info);
		else if (nx == Back_dt1) doBack_dt1_NX(info);
		else if (nx == Back_dt2) doBack_dt2_NX(info);
		else if (nx == Back_dt3) doBack_dt3_NX(info);
		else if (nx == Back_dt4) doBack_dt4_NX(info);
		else if (nx == Back_dt5) doBack_dt5_NX(info);
		else if (nx == Back_dt6) doBack_dt6_NX(info);
		else if (nx == Back_dt7) doBack_dt7_NX(info);
		else if (nx == Back_dt8) doBack_dt8_NX(info);
		else if (nx == Back_dt9) doBack_dt9_NX(info);
		else if (nx == Back_dt10) doBack_dt10_NX(info);
		else if (nx == Back_str1) doBack_str1_NX(info);
		else if (nx == Back_str2) doBack_str2_NX(info);
		else if (nx == Back_str3) doBack_str3_NX(info);
		else if (nx == Back_str4) doBack_str4_NX(info);
		else if (nx == Back_str5) doBack_str5_NX(info);
		else if (nx == Back_num1) doBack_num1_NX(info);
		else if (nx == Back_num2) doBack_num2_NX(info);
		else if (nx == Back_num3) doBack_num3_NX(info);
		else if (nx == Back_num4) doBack_num4_NX(info);
		else if (nx == Back_num5) doBack_num5_NX(info);
		else if (nx == Back_flg1) doBack_flg1_NX(info);
		else if (nx == Back_flg2) doBack_flg2_NX(info);
		else if (nx == Back_flg3) doBack_flg3_NX(info);
		else if (nx == Back_flg4) doBack_flg4_NX(info);
		else if (nx == Back_flg5) doBack_flg5_NX(info);
		else if (nx == columnBind_cond_col) doBind_cond_col_NX(info);
		else if (nx == columnBind_cond_val) doBind_cond_val_NX(info);
	}

	/**
	 * [Bind]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_file_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_file_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_get_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_get_typ_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt6_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt7_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt8_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt9_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt10_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str1_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str2_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str3_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str4_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str5_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num1_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num2_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num3_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num4_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num5_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_col_NX(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_val_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_biz_dat_id) doCnd_biz_dat_id_LC(info);
		else if (lc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_LC(info);
		else if (lc == Cnd_biz_dat_get_typ) doCnd_biz_dat_get_typ_LC(info);
		else if (lc == Back_dt1) doBack_dt1_LC(info);
		else if (lc == Back_dt2) doBack_dt2_LC(info);
		else if (lc == Back_dt3) doBack_dt3_LC(info);
		else if (lc == Back_dt4) doBack_dt4_LC(info);
		else if (lc == Back_dt5) doBack_dt5_LC(info);
		else if (lc == Back_dt6) doBack_dt6_LC(info);
		else if (lc == Back_dt7) doBack_dt7_LC(info);
		else if (lc == Back_dt8) doBack_dt8_LC(info);
		else if (lc == Back_dt9) doBack_dt9_LC(info);
		else if (lc == Back_dt10) doBack_dt10_LC(info);
		else if (lc == Back_str1) doBack_str1_LC(info);
		else if (lc == Back_str2) doBack_str2_LC(info);
		else if (lc == Back_str3) doBack_str3_LC(info);
		else if (lc == Back_str4) doBack_str4_LC(info);
		else if (lc == Back_str5) doBack_str5_LC(info);
		else if (lc == Back_num1) doBack_num1_LC(info);
		else if (lc == Back_num2) doBack_num2_LC(info);
		else if (lc == Back_num3) doBack_num3_LC(info);
		else if (lc == Back_num4) doBack_num4_LC(info);
		else if (lc == Back_num5) doBack_num5_LC(info);
		else if (lc == columnBind_cond_col) doBind_cond_col_LC(info);
		else if (lc == columnBind_cond_val) doBind_cond_val_LC(info);
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_get_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_get_typ_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt6_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt7_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt8_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt9_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[dt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_dt10_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str1_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str2_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str3_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str4_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[str5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_str5_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num1_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num2_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num3_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num4_LC(MCEventInfo info){
	}

	/**
	 * [Back]パネルの[num5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBack_num5_LC(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_col_LC(MCEventInfo info){
	}

	/**
	 * [Bind]パネルの[cond_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBind_cond_val_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_dat_id]の作成メソッド
	 */
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBizDatID(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0040.Prnt01")) {
			return new MB_MBBEL0040_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0040_Prnt01;

		/** コンストラクタ */
		protected MB_MBBEL0040_Prnt01Bridge() {
			p_MB_MBBEL0040_Prnt01 = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0040_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0040.RsltR.class));
			param.addDownBlock(mcframe.clientMBBE.MBBEP0040.RsltLblR.create());
			param.addDownBlock(mcframe.clientMBBE.MBBEP0040.RsltSmlR.create());

			p_MB_MBBEL0040_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0040_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0040_Prnt01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0040.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0040.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0040.RsltR>)down(0);
		}
		protected mcframe.clientMBBE.MBBEP0040.RsltLblR down1() {
			return (mcframe.clientMBBE.MBBEP0040.RsltLblR)down(1);
		}
		protected mcframe.clientMBBE.MBBEP0040.RsltSmlR down2() {
			return (mcframe.clientMBBE.MBBEP0040.RsltSmlR)down(2);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0040_Prnt01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0040.RsltR.class));
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0040.RsltLblR.create());
			p_MB_MBBEL0040_Prnt01.addDownBlock(mcframe.clientMBBE.MBBEP0040.RsltSmlR.create());
		}
		protected MCParam param() {
			return p_MB_MBBEL0040_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0040.RsltR>)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(0));
			setRsltLblR((mcframe.clientMBBE.MBBEP0040.RsltLblR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(1));
			setRsltSmlR((mcframe.clientMBBE.MBBEP0040.RsltSmlR)p_MB_MBBEL0040_Prnt01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getRsltL().clear();
			getRsltLblR().clear();
			getRsltSmlR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRsltLblR());
			result.add(getRsltSmlR());
			return result;
		}
	}
}