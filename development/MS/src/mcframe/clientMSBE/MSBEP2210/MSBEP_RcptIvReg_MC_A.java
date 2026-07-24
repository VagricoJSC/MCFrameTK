package mcframe.clientMSBE.MSBEP2210;

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
import mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch01Caller;
import mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch02Caller;
import mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Ins01Caller;
import mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Upd01Caller;
import mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Del01Caller;

/**
 * 画面"MSBEP_RcptIvReg"パネルクラスです。<p>
 *
 * 受領インボイスを登録または確定します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_RcptIvReg_MC_A extends mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP2210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	// [Cnd]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	// [Hdr1]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	// [Dtl1]ブロックの項目のField定義
	// [Dtl1Btn]ブロック関連のField定義
	// [Dtl1Btn]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	// [Dtl2]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	// [Btn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_SCHD]モードを表す定数 */
	public static final String INS_SCHD = "INS_SCHD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_SCHD]モードを表す定数 */
	public static final String UPD_SCHD = "UPD_SCHD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_SCHD]モードを表す定数 */
	public static final String DEL_SCHD = "DEL_SCHD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, INS_SCHD, UPD, UPD_SCHD, DEL, DEL_SCHD};
	
	/** [MS_MSBEL2210_Srch01]のCallerの作成 */
	protected MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch01Caller createMS_MSBEL2210_Srch01() {
		MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Srch01Bridge>
		caller = ((MSBEP_RcptIvReg_MC)this).new MS_MSBEL2210_Srch01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Srch01Bridge>(
					(MSBEP_RcptIvReg)this, new MS_MSBEL2210_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2210_Srch01]の呼び出し */
	protected void callMS_MSBEL2210_Srch01() {
		MCCaller caller = createMS_MSBEL2210_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2210_Srch02]のCallerの作成 */
	protected MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch02Caller createMS_MSBEL2210_Srch02() {
		MSBEP_RcptIvReg_MC.MS_MSBEL2210_Srch02Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Srch02Bridge>
		caller = ((MSBEP_RcptIvReg_MC)this).new MS_MSBEL2210_Srch02Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Srch02Bridge>(
					(MSBEP_RcptIvReg)this, new MS_MSBEL2210_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL2210_Srch02]の呼び出し */
	protected void callMS_MSBEL2210_Srch02() {
		MCCaller caller = createMS_MSBEL2210_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL2210_Iv_Ins01]のCallerの作成 */
	protected MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Ins01Caller createMS_MSBEL2210_Iv_Ins01() {
		MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Ins01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Ins01Bridge>
		caller = ((MSBEP_RcptIvReg_MC)this).new MS_MSBEL2210_Iv_Ins01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Ins01Bridge>(
					(MSBEP_RcptIvReg)this, new MS_MSBEL2210_Iv_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL2210_Iv_Ins01]の呼び出し */
	protected void callMS_MSBEL2210_Iv_Ins01() {
		MCCaller caller = createMS_MSBEL2210_Iv_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL2210_Iv_Upd01]のCallerの作成 */
	protected MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Upd01Caller createMS_MSBEL2210_Iv_Upd01() {
		MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Upd01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Upd01Bridge>
		caller = ((MSBEP_RcptIvReg_MC)this).new MS_MSBEL2210_Iv_Upd01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Upd01Bridge>(
					(MSBEP_RcptIvReg)this, new MS_MSBEL2210_Iv_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL2210_Iv_Upd01]の呼び出し */
	protected void callMS_MSBEL2210_Iv_Upd01() {
		MCCaller caller = createMS_MSBEL2210_Iv_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL2210_Iv_Del01]のCallerの作成 */
	protected MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Del01Caller createMS_MSBEL2210_Iv_Del01() {
		MSBEP_RcptIvReg_MC.MS_MSBEL2210_Iv_Del01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Del01Bridge>
		caller = ((MSBEP_RcptIvReg_MC)this).new MS_MSBEL2210_Iv_Del01Caller<MSBEP_RcptIvReg, MS_MSBEL2210_Iv_Del01Bridge>(
					(MSBEP_RcptIvReg)this, new MS_MSBEL2210_Iv_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL2210_Iv_Del01]の呼び出し */
	protected void callMS_MSBEL2210_Iv_Del01() {
		MCCaller caller = createMS_MSBEL2210_Iv_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2210.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2210.Hdr1R aHdr1R;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R> aDtl2L;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R> aCnd2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2210.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2210.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2210.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2210.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMSBE.MSBEP2210.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBE.MSBEP2210.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBE.MSBEP2210.Hdr1R createHdr1R() {
		return mcframe.clientMSBE.MSBEP2210.Hdr1R.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBE.MSBEP2210.Dtl1R createDtl1R() {
		return mcframe.clientMSBE.MSBEP2210.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList createDtl1L() {
		return MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class);
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBE.MSBEP2210.Dtl2R createDtl2R() {
		return mcframe.clientMSBE.MSBEP2210.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList createDtl2L() {
		return MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class);
	}

	/**
	 * コピーによってaCnd2Lを設定します。
	 *
	 * aCnd2Lのインスタンスは変更されません。
	 *
	 * @param dataset Cnd2L
	 */
	public void setCnd2L(MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R> aList) {
		if (getCnd2L() != aList) {
			getCnd2L().setAll(aList);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Lを返します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R> getCnd2L() {
		return aCnd2L;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMSBE.MSBEP2210.Cnd2R createCnd2R() {
		return mcframe.clientMSBE.MSBEP2210.Cnd2R.create();
	}

	/**
	 * aCnd2Lを作成します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R> createCnd2L() {
		return MCList.create(mcframe.clientMSBE.MSBEP2210.Cnd2R.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getCnd2L())) ret.add(getCnd2L());
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
		if(aCnt == getHdr1R()) return "Hdr1";
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getCnd2L()) return "Cnd2";
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
		if(bId.equals("Hdr1")) return getHdr1R();
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Cnd2")) return getCnd2L();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvReg_MC_A() {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();
		aCnd2L = createCnd2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_RcptIvReg_MC_A(String name) {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aCnd2L = createCnd2L();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_RcptIvReg_MC.jbCreateCnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbCreateHdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbCreateDtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbCreateDtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbCreateDtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbCreateBtn((MSBEP_RcptIvReg)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_RcptIvReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MSBEP_RcptIvReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBEP_RcptIvReg p) {
	}

	/**
	 * [Dtl1Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1Btn(MSBEP_RcptIvReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBEP_RcptIvReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_RcptIvReg p) {
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


	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvReg create(){
		MSBEP_RcptIvReg p = new MSBEP_RcptIvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvReg create(String name){
		MSBEP_RcptIvReg p = new MSBEP_RcptIvReg(name);
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
		MSBEP_RcptIvReg_MC.jbfInitCnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbfInitHdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbfInitDtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbfInitDtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbfInitDtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbfInitBtn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitCnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitHdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitDtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitDtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitDtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.jbInitBtn((MSBEP_RcptIvReg)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1Btn(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.setPluralValueEnable(p.Cnd_srch_tgt_typ, false);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_srch_tgt_typ_nm, false);
		p.setPluralValueEnable(p.Cnd_srch_tgt_no, false);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, false);
		p.Cnd_srch_po.setGroup("srch");
		p.Cnd_srch_purc.setGroup("srch");
		p.setPluralValueEnable(p.Cnd_purc_schd_no, true);
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.Hdr1_trd_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_trd_cd, false);
		p.setPluralValueEnable(p.Hdr1_trd_nm, false);
		p.setPluralValueEnable(p.Hdr1_trd_ptn_typ, false);
		p.setPluralValueEnable(p.Hdr1_purc_act_no, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_no, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_mng_no, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_src_typ, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_src_typ_nm, false);
		p.setPluralValueEnable(p.Hdr1_po_no, false);
		p.setPluralValueEnable(p.Hdr1_inherited_src_no, false);
		p.Hdr1_sppl_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_sppl_cd, false);
		p.setPluralValueEnable(p.Hdr1_sppl_nm, false);
		p.setPluralValueEnable(p.Hdr1_outsrc_upri_typ, false);
		p.setPluralValueEnable(p.Hdr1_in_to_id_typ, false);
		p.setPluralValueEnable(p.Hdr1_in_to_id_typ_nm, false);
		p.Hdr1_in_to_id_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_in_to_id_cd, false);
		p.setPluralValueEnable(p.Hdr1_in_to_id_nm, false);
		p.Hdr1_in_to_id_cd_dmy.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Hdr1_in_to_id_cd_dmy, false);
		p.Hdr1_sppl_addr_p_PPanel.Addr_show_dtl.setGroup("RI");
		p.setPluralValueEnable(p.Hdr1_ap_dpt_cd, false);
		p.setPluralValueEnable(p.Hdr1_mst_ap_dpt_cd, false);
		p.setPluralValueEnable(p.Hdr1_prnt_lcl_cd, false);
		p.setPluralValueEnable(p.Hdr1_purc_tax_calc_typ, false);
		p.setPluralValueEnable(p.Hdr1_dlv_loc_wg_cd, false);
		p.setPluralValueEnable(p.Hdr1_def_purc_usr_cd, false);
		p.setPluralValueEnable(p.Hdr1_def_purc_dpt_cd, false);
		p.setPluralValueEnable(p.Hdr1_purc_dpt_wg_cd, false);
		p.setPluralValueEnable(p.Hdr1_purc_dpt_wg_nm, false);
		p.Hdr1_trnspt_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_trnspt_cd, false);
		p.setPluralValueEnable(p.Hdr1_trnspt_nm, false);
		p.setPluralValueEnable(p.Hdr1_vssl_flght, false);
		p.Hdr1_load_port_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_load_port_cd, false);
		p.setPluralValueEnable(p.Hdr1_load_port_nm, false);
		p.Hdr1_dschrg_port_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_dschrg_port_cd, false);
		p.setPluralValueEnable(p.Hdr1_dschrg_port_nm, false);
		p.Hdr1_via_port_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_via_port_cd, false);
		p.setPluralValueEnable(p.Hdr1_via_port_nm, false);
		p.Hdr1_tterm_cd1.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_tterm_cd1, false);
		p.setPluralValueEnable(p.Hdr1_tterm_nm1, false);
		p.setPluralValueEnable(p.Hdr1_tterm_rmrks1, false);
		p.Hdr1_tterm_cd2.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_tterm_cd2, false);
		p.setPluralValueEnable(p.Hdr1_tterm_nm2, false);
		p.setPluralValueEnable(p.Hdr1_tterm_rmrks2, false);
		p.Hdr1_tterm_cd3.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_tterm_cd3, false);
		p.setPluralValueEnable(p.Hdr1_tterm_nm3, false);
		p.setPluralValueEnable(p.Hdr1_tterm_rmrks3, false);
		p.Hdr1_trd_cur_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_trd_cur_cd, false);
		p.setPluralValueEnable(p.Hdr1_trd_cur_nm, false);
		p.Hdr1_src_trd_cur_cd.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Hdr1_src_trd_cur_cd, false);
		p.setPluralValueEnable(p.Hdr1_purc_xrate_cd, false);
		p.setPluralValueEnable(p.Hdr1_base_cur_cd, false);
		p.setPluralValueEnable(p.Hdr1_base_cur_nm, false);
		p.setPluralValueEnable(p.Hdr1_ptax_cur_cd, false);
		p.setPluralValueEnable(p.Hdr1_ptax_cur_nm, false);
		p.setPluralValueEnable(p.Hdr1_purc_amt_rnd_typ, false);
		p.setPluralValueEnable(p.Hdr1_purc_tax_rnd_typ, false);
		p.setPluralValueEnable(p.Hdr1_purc_slip_each_lot_typ, false);
		p.Hdr1_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Hdr1_asppl_cd, false);
		p.setPluralValueEnable(p.Hdr1_asppl_nm, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_rmrks, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_intr_rmrks, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_sub_char1, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_sub_char2, false);
		p.setPluralValueEnable(p.Hdr1_rcpt_iv_sub_char3, false);
		p.setPluralValueEnable(p.Hdr1_trd_rmrks, false);
		p.setPluralValueEnable(p.Hdr1_intr_rmrks, false);
		p.setPluralValueEnable(p.Hdr1_po_print_rmrks, false);
		p.setPluralValueEnable(p.Hdr1_sub_char1, false);
		p.setPluralValueEnable(p.Hdr1_sub_char2, false);
		p.setPluralValueEnable(p.Hdr1_sub_char3, false);
		p.setPluralValueEnable(p.Hdr1_cst_cd, false);
		p.setPluralValueEnable(p.Hdr1_cst_nm, false);
		p.setPluralValueEnable(p.Hdr1_slo_trd_ptn_typ, false);
		p.setPluralValueEnable(p.Hdr1_slo_trd_ptn_typ_nm, false);
		p.setPluralValueEnable(p.Hdr1_sls_basis_typ, false);
		p.setPluralValueEnable(p.Hdr1_sls_basis_typ_nm, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_cd1, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_nm1, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_rmrks1, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_cd2, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_nm2, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_rmrks2, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_cd3, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_nm3, false);
		p.setPluralValueEnable(p.Hdr1_slo_tterm_rmrks3, false);
		p.setPluralValueEnable(p.Hdr1_slo_cur_cd, false);
		p.setPluralValueEnable(p.Hdr1_slo_cur_nm, false);
		p.setPluralValueEnable(p.Hdr1_ins_usr_id, false);
		p.setPluralValueEnable(p.Hdr1_ins_usr_nm, false);
		p.setPluralValueEnable(p.Hdr1_ins_func_id, false);
		p.setPluralValueEnable(p.Hdr1_ins_func_nm, false);
		p.setPluralValueEnable(p.Hdr1_upd_usr_id, false);
		p.setPluralValueEnable(p.Hdr1_upd_usr_nm, false);
		p.setPluralValueEnable(p.Hdr1_upd_func_id, false);
		p.setPluralValueEnable(p.Hdr1_upd_func_nm, false);
		p.setPluralValueEnable(p.Hdr1_upd_srv_req_no, false);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1Btn(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.Dtl1Btn_open_MSBEP2240.setGroup("open");
		p.Dtl1Btn_radd_no_schd.setGroup("no_border");
		p.Dtl1Btn_radd.setGroup("no_border");
		p.Dtl1Btn_rdel.setGroup("no_border");
		p.Dtl1Btn_rcopy.setGroup("no_border");
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_RcptIvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.Btn_ins_noschd.setGroup("upd");
		p.Btn_ins.setGroup("upd");
		p.Btn_upd_noschd.setGroup("upd");
		p.Btn_upd.setGroup("upd");
		p.Btn_del_noschd.setGroup("del");
		p.Btn_del.setGroup("del");
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
		MSBEP_RcptIvReg_MC.mcInitCnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.mcInitHdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.mcInitDtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.mcInitDtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.mcInitDtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.mcInitBtn((MSBEP_RcptIvReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitINS_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS_Cnd2((MSBEP_RcptIvReg)this);

		// [INS_SCHD]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitINS__SCHD_Cnd2((MSBEP_RcptIvReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitUPD_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD_Cnd2((MSBEP_RcptIvReg)this);

		// [UPD_SCHD]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitUPD__SCHD_Cnd2((MSBEP_RcptIvReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitDEL_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL_Cnd2((MSBEP_RcptIvReg)this);

		// [DEL_SCHD]ステータスのモードの設定
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Cnd((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Hdr1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Dtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Dtl1Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Dtl2((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Btn((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.statusInitDEL__SCHD_Cnd2((MSBEP_RcptIvReg)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_RcptIvReg p) {
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MSBEP_RcptIvReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBEP_RcptIvReg p) {
	}

	/**
	 *  [Dtl1Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1Btn(MSBEP_RcptIvReg p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBEP_RcptIvReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_RcptIvReg p) {
	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_RcptIvReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_rcpt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_newest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt_to.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_po.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_purc.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_schd_no.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_fix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_trd_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_no.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_mng_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_purc_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_iv_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_purc_ac_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_pay_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_pay_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_sppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_in_to_id_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr1_ap_dpt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_trnspt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_trnspt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_vssl_flght.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_load_port_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_load_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_etd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_dschrg_port_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_dschrg_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_eta_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_via_port_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_via_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_via_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char3.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_dlv_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_accpt_dfct_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_re_arr_qty_p_PPanel.columnQty_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_ymd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_hm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_purc_schd_dt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_sync_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_ncv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_ap_dpt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_rcpt_iv_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_purc_act_qty.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBEP_RcptIvReg p){
		p.columnDtl2_dlv_loc_cd.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * [INS_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Cnd(MSBEP_RcptIvReg p){
		p.Cnd_ope_Group.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Cnd_rcpt_iv_no.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Cnd_purc_act_rev.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Cnd_newest_flg.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt_to.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_po.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_purc.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Cnd_purc_schd_no.putMode(p, INS_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SCHD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_fix_flg.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_trd_cd.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_mng_no.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rev.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_purc_schd_dt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_iv_dt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_purc_ac_schd_dt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_pay_basis_dt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_pay_schd_dt.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_sppl_cd.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_in_to_id_cd.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(INS_SCHD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr1_ap_dpt_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Hdr1_trnspt_cd.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_trnspt_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_vssl_flght.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_load_port_cd.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_load_port_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_etd_dt.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_cd.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_eta_dt.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_via_port_cd.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_via_port_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.Hdr1_via_schd_dt.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_rmrks.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_intr_rmrks.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char1.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char2.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char3.putMode(p, INS_SCHD, MCMode.ENABLE);

	}

	/**
	 * [INS_SCHD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_cntry_org_cd.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_accpt_dfct_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_re_arr_qty_p_PPanel.columnQty_qty.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_nm.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_nm.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_str_ln_tgt_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_site_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cal_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cal_cd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_ymd.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_hm.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_purc_schd_dt.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_sync_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_ncv_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.columnDtl1_trd_cd.putMode(p, INS_SCHD, MCMode.REQUIRED);
		p.columnDtl1_trd_nm.putMode(p, INS_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_ap_dpt_flg.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, INS_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_rcpt_iv_d_rmrks.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_intr_d_rmrks.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char1.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char2.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char3.putMode(p, INS_SCHD, MCMode.ENABLE);
		p.columnDtl1_purc_act_qty.putMode(p, INS_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SCHD]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Dtl1Btn(MSBEP_RcptIvReg p){
		p.Dtl1Btn_open_MSBEP2240.putMode(p, INS_SCHD, MCMode.ENABLE);

	}

	/**
	 * [INS_SCHD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Dtl2(MSBEP_RcptIvReg p){

	}

	/**
	 * [INS_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [INS_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS__SCHD_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_RcptIvReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_act_rev.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_newest_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_po.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_purc.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_mng_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_iv_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_purc_ac_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pay_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_pay_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_in_to_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr1_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_trnspt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_trnspt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_vssl_flght.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_load_port_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_load_port_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_etd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_eta_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_via_port_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_via_port_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_via_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_dlv_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_accpt_dfct_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_re_arr_qty_p_PPanel.columnQty_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_ymd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_hm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_purc_schd_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_sync_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_ncv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_trd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_rcpt_iv_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_purc_act_qty.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBEP_RcptIvReg p){
		p.columnDtl2_dlv_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Cnd(MSBEP_RcptIvReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Cnd_srch_tgt_typ.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Cnd_rcpt_iv_no.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Cnd_purc_act_rev.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Cnd_newest_flg.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_po.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Cnd_srch_purc.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, UPD_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SCHD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_fix_flg.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_trd_cd.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_mng_no.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_rev.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_purc_schd_dt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_iv_dt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_purc_ac_schd_dt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_pay_basis_dt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_pay_schd_dt.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_sppl_cd.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_in_to_id_cd.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(UPD_SCHD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr1_ap_dpt_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Hdr1_trnspt_cd.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_trnspt_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_vssl_flght.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_load_port_cd.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_load_port_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_etd_dt.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_cd.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_dschrg_port_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_eta_dt.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_via_port_cd.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_via_port_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.Hdr1_via_schd_dt.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Hdr1_rcpt_iv_rmrks.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_intr_rmrks.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char1.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char2.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_sub_char3.putMode(p, UPD_SCHD, MCMode.ENABLE);

	}

	/**
	 * [UPD_SCHD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_cntry_org_cd.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_cntry_org_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_accpt_dfct_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_re_arr_qty_p_PPanel.columnQty_qty.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_wg_nm.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_nm.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_str_ln_tgt_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_site_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_cal_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_loc_sppl_cal_cd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_ymd.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_re_arr_rqst_tm_p_PPanel.columnYmdHm_hm.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_purc_schd_dt.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_re_arr_sync_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_ncv_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.columnDtl1_trd_cd.putMode(p, UPD_SCHD, MCMode.REQUIRED);
		p.columnDtl1_trd_nm.putMode(p, UPD_SCHD, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_ap_dpt_flg.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, UPD_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_rcpt_iv_d_rmrks.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_intr_d_rmrks.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char1.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char2.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_rcpt_iv_d_sub_char3.putMode(p, UPD_SCHD, MCMode.ENABLE);
		p.columnDtl1_purc_act_qty.putMode(p, UPD_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SCHD]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Dtl1Btn(MSBEP_RcptIvReg p){
		p.Dtl1Btn_open_MSBEP2240.putMode(p, UPD_SCHD, MCMode.ENABLE);

	}

	/**
	 * [UPD_SCHD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Dtl2(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [UPD_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SCHD_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_rcpt_iv_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_ap_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_qty.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Cnd(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL_SCHD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Hdr1(MSBEP_RcptIvReg p){
		p.Hdr1_rcpt_iv_src_typ.putMode(p, DEL_SCHD, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_src_typ_nm.putMode(p, DEL_SCHD, MCMode.READ_ONLY);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, DEL_SCHD, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, DEL_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_SCHD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Dtl1(MSBEP_RcptIvReg p){
		p.columnDtl1_ap_dpt_flg.putMode(p, DEL_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_seq.putMode(p, DEL_SCHD, MCMode.INVISIBLE);
		p.columnDtl1_purc_act_qty.putMode(p, DEL_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_SCHD]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Dtl1Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL_SCHD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Dtl2(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Btn(MSBEP_RcptIvReg p){

	}

	/**
	 * [DEL_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SCHD_Cnd2(MSBEP_RcptIvReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_RcptIvReg_MC.setTableConfigDtl1((MSBEP_RcptIvReg)this);
		MSBEP_RcptIvReg_MC.setTableConfigDtl2((MSBEP_RcptIvReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBEP_RcptIvReg p) {
		p.columnDtl1_peg_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.peg_no_META);
		p.columnDtl1_schd_sync_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.schd_sync_flg_META);
		p.columnDtl1_arr_skip_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_skip_flg_META);
		p.columnDtl1_purc_ddlv_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_ddlv_flg_META);
		p.columnDtl1_arr_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_schd_dt_META);
		p.columnDtl1_arr_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_ptn_typ_META);
		p.columnDtl1_old_sync_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.old_sync_flg_META);
		p.columnDtl1_sync_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sync_flg_META);
		p.columnDtl1_temp_ap_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.temp_ap_flg_META);
		p.columnDtl1_non_purc_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.non_purc_flg_META);
		p.columnDtl1_purc_basis_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_basis_typ_META);
		p.columnDtl1_purc_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_basis_typ_nm_META);
		p.columnDtl1_purc_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_schd_dt_META);
		p.columnDtl1_dlv_loc_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dlv_loc_wg_cd_META);
		p.columnDtl1_dlv_loc_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dlv_loc_wg_nm_META);
		p.columnDtl1_dlv_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dlv_loc_cd_META);
		p.columnDtl1_dlv_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl1_dlv_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dlv_loc_nm_META);
		p.columnDtl1_dlv_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dlv_loc_sppl_cd_META);
		p.columnDtl1_site_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.site_cd_META);
		p.columnDtl1_loc_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.loc_mng_typ_META);
		p.columnDtl1_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.str_ln_tgt_flg_META);
		p.columnDtl1_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.asset_mng_typ_META);
		p.columnDtl1_asset_mng_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.asset_mng_typ_nm_META);
		p.columnDtl1_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.stk_mng_typ_META);
		p.columnDtl1_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.lot_mng_typ_META);
		p.columnDtl1_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.lot_no_typ_META);
		p.columnDtl1_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sublot_mng_typ_META);
		p.columnDtl1_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sublot_no_typ_META);
		p.columnDtl1_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sno1_mng_typ_META);
		p.columnDtl1_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sno2_mng_typ_META);
		p.columnDtl1_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sno3_mng_typ_META);
		p.columnDtl1_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sno4_mng_typ_META);
		p.columnDtl1_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.dscnt_itm_flg_META);
		p.columnDtl1_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.iv_itm_nm_META);
		p.columnDtl1_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sundry_itm_flg_META);
		p.columnDtl1_outsrc_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.outsrc_flg_META);
		p.columnDtl1_src_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_base_unit_qty_META);
		p.columnDtl1_arr_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_qty_META);
		p.columnDtl1_purc_schd_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_schd_qty_META);
		p.columnDtl1_purc_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_qty_META);
		p.columnDtl1_accpt_dfct_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.accpt_dfct_qty_META);
		p.columnDtl1_exim_xpns_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.exim_xpns_typ_META);
		p.columnDtl1_maker_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.maker_cd_META);
		p.columnDtl1_maker_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.maker_nm_META);
		p.columnDtl1_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cntry_org_cd_META);
		p.columnDtl1_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cntry_org_nm_META);
		p.columnDtl1_accpt_dfct_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.accpt_dfct_flg_META);
		p.columnDtl1_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_cd_META);
		p.columnDtl1_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_nm_META);
		p.columnDtl1_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_dec_place_META);
		p.columnDtl1_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_rnd_typ_META);
		p.columnDtl1_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_conv_base_qty_META);
		p.columnDtl1_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_unit_conv_qty_META);
		p.columnDtl1_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.base_unit_cd_META);
		p.columnDtl1_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.base_unit_nm_META);
		p.columnDtl1_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.base_unit_dec_place_META);
		p.columnDtl1_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.base_unit_rnd_typ_META);
		p.columnDtl1_base_unit_qty_bf_cng.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.base_unit_qty_bf_cng_META);
		p.columnDtl1_re_arr_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_flg_META);
		p.columnDtl1_re_arr_loc_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_wg_cd_META);
		p.columnDtl1_re_arr_loc_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_wg_nm_META);
		p.columnDtl1_re_arr_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_cd_META);
		p.columnDtl1_re_arr_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl1_re_arr_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_nm_META);
		p.columnDtl1_re_arr_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_str_ln_tgt_flg_META);
		p.columnDtl1_re_arr_loc_site_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_site_cd_META);
		p.columnDtl1_re_arr_loc_cal_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_cal_cd_META);
		p.columnDtl1_re_arr_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_sppl_cd_META);
		p.columnDtl1_re_arr_loc_sppl_cal_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_loc_sppl_cal_cd_META);
		p.columnDtl1_re_arr_purc_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_purc_schd_dt_META);
		p.columnDtl1_re_arr_sync_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.re_arr_sync_flg_META);
		p.columnDtl1_schd_abort_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.schd_abort_flg_META);
		p.columnDtl1_abort_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.abort_flg_META);
		p.columnDtl1_ncv_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ncv_flg_META);
		p.columnDtl1_src_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_cd_META);
		p.columnDtl1_src_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_conv_qty_META);
		p.columnDtl1_src_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_conv_base_qty_META);
		p.columnDtl1_src_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_dec_place_META);
		p.columnDtl1_src_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_rnd_typ_META);
		p.columnDtl1_src_trd_unit_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_unit_qty_META);
		p.columnDtl1_src_trd_cur_amt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_amt_META);
		p.columnDtl1_src_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_dscnt_amt_META);
		p.columnDtl1_src_trd_cur_onr_prov_amt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_onr_prov_amt_META);
		p.columnDtl1_src_trd_cur_onr_prov_upri.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_onr_prov_upri_META);
		p.columnDtl1_src_trd_cur_proc_amt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_proc_amt_META);
		p.columnDtl1_src_trd_cur_proc_upri.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_proc_upri_META);
		p.columnDtl1_src_trd_cur_tax_amt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_tax_amt_META);
		p.columnDtl1_src_trd_cur_upri.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_trd_cur_upri_META);
		p.columnDtl1_src_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.src_wtax_rate_META);
		p.columnDtl1_old_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.old_quality_typ_META);
		p.columnDtl1_tmp_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.tmp_quality_typ_META);
		p.columnDtl1_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.quality_typ_META);
		p.columnDtl1_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.quality_typ_nm_META);
		p.columnDtl1_old_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.old_gd_cd_META);
		p.columnDtl1_tmp_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.tmp_gd_cd_META);
		p.columnDtl1_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.gd_cd_META);
		p.columnDtl1_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.gd_nm_META);
		p.columnDtl1_drct_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.drct_dlv_typ_META);
		p.columnDtl1_drct_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.drct_dlv_typ_nm_META);
		p.columnDtl1_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.slo_d_no_META);
		p.columnDtl1_slo_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.slo_no_META);
		p.columnDtl1_scst_cal_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.scst_cal_cd_META);
		p.columnDtl1_ver_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ver_flg_META);
		p.columnDtl1_org_ver_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.org_ver_no_META);
		p.columnDtl1_bp_lot_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bp_lot_flg_META);
		p.columnDtl1_bp_lot_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bp_lot_no_META);
		p.columnDtl1_bp_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bp_dlv_slip_no_META);
		p.columnDtl1_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bp_dlv_slip_d_no_META);
		p.columnDtl1_ship_fr_valid_dt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ship_fr_valid_dt_META);
		p.columnDtl1_purc_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_upri_cng_flg_META);
		p.columnDtl1_purc_dtl_upd_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_dtl_upd_flg_META);
		p.columnDtl1_repurc_obli_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.repurc_obli_flg_META);
		p.columnDtl1_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.wtax_rate_META);
		p.columnDtl1_sppl_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sppl_itm_cd_META);
		p.columnDtl1_sppl_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sppl_itm_nm_META);
		p.columnDtl1_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cst_itm_cd_META);
		p.columnDtl1_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cst_itm_nm_META);
		p.columnDtl1_purc_id_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_id_typ_META);
		p.columnDtl1_purc_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_id_typ_nm_META);
		p.columnDtl1_purc_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_rsn_cd_META);
		p.columnDtl1_purc_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_rsn_nm_META);
		p.columnDtl1_xpns_purc_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.xpns_purc_flg_META);
		p.columnDtl1_ap_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ap_dpt_cd_META);
		p.columnDtl1_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl1_ap_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ap_dpt_nm_META);
		p.columnDtl1_itm_pay_crryovr_times.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.itm_pay_crryovr_times_META);
		p.columnDtl1_pay_crryovr_times.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.pay_crryovr_times_META);
		p.columnDtl1_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_cd_META);
		p.columnDtl1_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_nm_META);
		p.columnDtl1_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_ptn_typ_META);
		p.columnDtl1_ap_dpt_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.ap_dpt_flg_META);
		p.columnDtl1_purc_dpt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_dpt_wg_cd_META);
		p.columnDtl1_purc_dpt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_dpt_wg_nm_META);
		p.columnDtl1_po_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.po_no_META);
		p.columnDtl1_po_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.po_d_no_META);
		p.columnDtl1_mfg_inst_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.mfg_inst_no_META);
		p.columnDtl1_mfg_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.mfg_loc_cd_META);
		p.columnDtl1_bom_ptn.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bom_ptn_META);
		p.columnDtl1_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_schd_no_META);
		p.columnDtl1_arr_schd_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_schd_no_META);
		p.columnDtl1_purc_act_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_no_META);
		p.columnDtl1_purc_act_seq.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_seq_META);
		p.columnDtl1_purc_act_rev.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_rev_META);
		p.columnDtl1_purc_act_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_d_no_META);
		p.columnDtl1_purc_act_d_seq.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_d_seq_META);
		p.columnDtl1_rcpt_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_d_no_META);
		p.columnDtl1_manual_add_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.manual_add_flg_META);
		p.columnDtl1_bd_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_lot_mng_typ_META);
		p.columnDtl1_bd_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sublot_mng_typ_META);
		p.columnDtl1_bd_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_lot_no_typ_META);
		p.columnDtl1_bd_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sublot_no_typ_META);
		p.columnDtl1_bd_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sno1_mng_typ_META);
		p.columnDtl1_bd_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sno2_mng_typ_META);
		p.columnDtl1_bd_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sno3_mng_typ_META);
		p.columnDtl1_bd_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.bd_sno4_mng_typ_META);
		p.columnDtl1_rcpt_iv_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_d_rmrks_META);
		p.columnDtl1_rcpt_iv_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_intr_d_rmrks_META);
		p.columnDtl1_rcpt_iv_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_d_sub_char1_META);
		p.columnDtl1_rcpt_iv_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_d_sub_char2_META);
		p.columnDtl1_rcpt_iv_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.rcpt_iv_d_sub_char3_META);
		p.columnDtl1_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.trd_d_rmrks_META);
		p.columnDtl1_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.intr_d_rmrks_META);
		p.columnDtl1_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sub_char1_META);
		p.columnDtl1_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sub_char2_META);
		p.columnDtl1_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.sub_char3_META);
		p.columnDtl1_po_print_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.po_print_d_rmrks_META);
		p.columnDtl1_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cont_fctr_flg_META);
		p.columnDtl1_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cont_fctr_rnd_typ_META);
		p.columnDtl1_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.cont_fctr_dec_place_META);
		p.columnDtl1_disp_seq.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.disp_seq_META);
		p.columnDtl1_arr_pr_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.arr_pr_no_META);
		p.columnDtl1_purc_act_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl1R.purc_act_qty_META);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBEP_RcptIvReg p) {
		p.columnDtl2_dtl_peg_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dtl_peg_no_META);
		p.columnDtl2_peg_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.peg_no_META);
		p.columnDtl2_from_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.from_gd_cd_META);
		p.columnDtl2_tmp_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.tmp_quality_typ_META);
		p.columnDtl2_tmp_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.tmp_stk_insp_typ_META);
		p.columnDtl2_tmp_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.tmp_stk_id_typ_META);
		p.columnDtl2_gi_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gi_wg_cd_META);
		p.columnDtl2_gi_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gi_loc_cd_META);
		p.columnDtl2_gi_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gi_str_ln_cd_META);
		p.columnDtl2_gi_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gi_unit_cd_META);
		p.columnDtl2_dlv_loc_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dlv_loc_wg_cd_META);
		p.columnDtl2_dlv_loc_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dlv_loc_wg_nm_META);
		p.columnDtl2_dlv_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dlv_loc_cd_META);
		p.columnDtl2_dlv_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl2_dlv_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dlv_loc_nm_META);
		p.columnDtl2_dlv_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.dlv_loc_sppl_cd_META);
		p.columnDtl2_site_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.site_cd_META);
		p.columnDtl2_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.str_ln_tgt_flg_META);
		p.columnDtl2_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.stk_mng_typ_META);
		p.columnDtl2_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.lot_mng_typ_META);
		p.columnDtl2_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.lot_no_typ_META);
		p.columnDtl2_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.sublot_mng_typ_META);
		p.columnDtl2_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.sublot_no_typ_META);
		p.columnDtl2_old_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.old_quality_typ_META);
		p.columnDtl2_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.quality_typ_META);
		p.columnDtl2_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.quality_typ_nm_META);
		p.columnDtl2_old_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.old_gd_cd_META);
		p.columnDtl2_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gd_cd_META);
		p.columnDtl2_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.gd_nm_META);
		p.columnDtl2_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.stk_insp_typ_META);
		p.columnDtl2_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.stk_insp_typ_nm_META);
		p.columnDtl2_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.stk_id_typ_META);
		p.columnDtl2_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.stk_id_typ_nm_META);
		p.columnDtl2_ver_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.ver_flg_META);
		p.columnDtl2_org_ver_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.org_ver_no_META);
		p.columnDtl2_bp_lot_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.bp_lot_no_META);
		p.columnDtl2_bp_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.bp_dlv_slip_no_META);
		p.columnDtl2_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.bp_dlv_slip_d_no_META);
		p.columnDtl2_ship_fr_valid_dt.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.ship_fr_valid_dt_META);
		p.columnDtl2_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_cd_META);
		p.columnDtl2_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_nm_META);
		p.columnDtl2_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_dec_place_META);
		p.columnDtl2_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_rnd_typ_META);
		p.columnDtl2_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_conv_base_qty_META);
		p.columnDtl2_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.trd_unit_conv_qty_META);
		p.columnDtl2_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.base_unit_cd_META);
		p.columnDtl2_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.base_unit_nm_META);
		p.columnDtl2_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.base_unit_dec_place_META);
		p.columnDtl2_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.base_unit_rnd_typ_META);
		p.columnDtl2_arr_act_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.arr_act_no_META);
		p.columnDtl2_purc_act_io_no.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.purc_act_io_no_META);
		p.columnDtl2_purc_act_io_seq.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.purc_act_io_seq_META);
		p.columnDtl2_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.cont_fctr_flg_META);
		p.columnDtl2_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.cont_fctr_rnd_typ_META);
		p.columnDtl2_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.cont_fctr_dec_place_META);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.sub_char1_META);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.sub_char2_META);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2210.Dtl2R.sub_char3_META);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createCnd_srch_tgt_typ_nm_ListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr1_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_trd_cd_ListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr1_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_sppl_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr1_in_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_in_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_in_to_id_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Hdr1_in_to_id_cd_dmy_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_in_to_id_cd_dmy_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_in_to_id_cd_dmy_ListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.InToId");
		return lp;
	}
	 
	/**
	 * [Hdr1_trnspt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_trnspt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_trnspt_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trnspt");
		return lp;
	}
	 
	/**
	 * [Hdr1_load_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_load_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_load_port_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
		return lp;
	}
	 
	/**
	 * [Hdr1_dschrg_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_dschrg_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_dschrg_port_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
		return lp;
	}
	 
	/**
	 * [Hdr1_via_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_via_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_via_port_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
		return lp;
	}
	 
	/**
	 * [Hdr1_tterm_cd1_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_tterm_cd1_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr1_tterm_cd2_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_tterm_cd2_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr1_tterm_cd3_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_tterm_cd3_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr1_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_trd_cur_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr1_src_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_src_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_src_trd_cur_cd_ListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr1_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createHdr1_asppl_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl1_dlv_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_dlv_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_dlv_loc_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl1_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_asset_mng_typ_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_maker_cd_ListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Dtl1_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_trd_unit_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl1_re_arr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_re_arr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_re_arr_loc_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl1_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_quality_typ_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_gd_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl1_drct_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_drct_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_drct_dlv_typ_ListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DrctDlvTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_purc_id_typ_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_purc_rsn_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl1_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_ap_dpt_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl1_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl1_trd_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Dtl2_dlv_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_dlv_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_dlv_loc_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl2_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_quality_typ_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_gd_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl2_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_stk_insp_typ_ListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_stk_id_typ_ListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = super.createDtl2_trd_unit_cd_ListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
	}

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
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_sppl_cd]の作成メソッド
	 */
	public MCList getHdr1_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_in_to_id_cd]の作成メソッド
	 */
	public MCList getHdr1_in_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_in_to_id_cd_dmy]の作成メソッド
	 */
	public MCList getHdr1_in_to_id_cd_dmy(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getInToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_trnspt_cd]の作成メソッド
	 */
	public MCList getHdr1_trnspt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrnspt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_load_port_cd]の作成メソッド
	 */
	public MCList getHdr1_load_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_dschrg_port_cd]の作成メソッド
	 */
	public MCList getHdr1_dschrg_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_via_port_cd]の作成メソッド
	 */
	public MCList getHdr1_via_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd1]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd2]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd3]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr1_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_asppl_cd]の作成メソッド
	 */
	public MCList getHdr1_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_dlv_loc_cd]の作成メソッド
	 */
	public MCList getDtl1_dlv_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl1_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_maker_cd]の作成メソッド
	 */
	public MCList getDtl1_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_re_arr_loc_cd]の作成メソッド
	 */
	public MCList getDtl1_re_arr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_re_arr_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl1_re_arr_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_quality_typ]の作成メソッド
	 */
	public MCList getDtl1_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_gd_cd]の作成メソッド
	 */
	public MCList getDtl1_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_drct_dlv_typ]の作成メソッド
	 */
	public MCList getDtl1_drct_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDrctDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl1_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl1_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_id_typ]の作成メソッド
	 */
	public MCList getDtl1_purc_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl1_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_trd_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_dlv_loc_cd]の作成メソッド
	 */
	public MCList getDtl2_dlv_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_quality_typ]の作成メソッド
	 */
	public MCList getDtl2_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_gd_cd]の作成メソッド
	 */
	public MCList getDtl2_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_stk_insp_typ]の作成メソッド
	 */
	public MCList getDtl2_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl2_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl2_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl2_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl2_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2210.Srch01")) {
			return new MS_MSBEL2210_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2210.Srch02")) {
			return new MS_MSBEL2210_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL2210.Iv_Ins01")) {
			return new MS_MSBEL2210_Iv_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL2210.Iv_Upd01")) {
			return new MS_MSBEL2210_Iv_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL2210.Iv_Del01")) {
			return new MS_MSBEL2210_Iv_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2210_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2210_Srch01Bridge() {
			p_MS_MSBEL2210_Srch01 = new MCParam(PDef.MS_MSBEL2210_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2210_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2210.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Cnd2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));

			p_MS_MSBEL2210_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2210_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2210_Srch01.addUpBlock(getCndR());
			p_MS_MSBEL2210_Srch01.addUpBlock(getCnd2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2210_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2210_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2210.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2210.CndR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Cnd2R>)up(1);
		}

		protected mcframe.clientMSBE.MSBEP2210.Hdr1R down0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)down(0);
		}
		protected MCList down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)down(1);
		}
		protected MCList down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2210_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			p_MS_MSBEL2210_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			p_MS_MSBEL2210_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2210_Srch01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBE.MSBEP2210.Hdr1R)p_MS_MSBEL2210_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList)p_MS_MSBEL2210_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList)p_MS_MSBEL2210_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			result.add(getCnd2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2210_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL2210_Srch02Bridge() {
			p_MS_MSBEL2210_Srch02 = new MCParam(PDef.MS_MSBEL2210_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2210_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2210.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));

			p_MS_MSBEL2210_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2210_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2210_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2210_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2210_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2210.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2210.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP2210.Hdr1R down0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)down(0);
		}
		protected MCList down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)down(1);
		}
		protected MCList down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2210_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			p_MS_MSBEL2210_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			p_MS_MSBEL2210_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2210_Srch02;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBE.MSBEP2210.Hdr1R)p_MS_MSBEL2210_Srch02.getContainerParam().getDownBlock(0));
			setDtl1L((MCList)p_MS_MSBEL2210_Srch02.getContainerParam().getDownBlock(1));
			setDtl2L((MCList)p_MS_MSBEL2210_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2210_Iv_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2210_Iv_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL2210_Iv_Ins01Bridge() {
			p_MS_MSBEL2210_Iv_Ins01 = new MCParam(PDef.MS_MSBEL2210_Iv_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2210_Iv_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));

			p_MS_MSBEL2210_Iv_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2210_Iv_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2210_Iv_Ins01.addUpBlock(getHdr1R());
			p_MS_MSBEL2210_Iv_Ins01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBEL2210_Iv_Ins01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2210_Iv_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2210_Iv_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2210.Hdr1R up0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)up(0);
		}
		protected MCList up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)up(1);
		}
		protected MCList up2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)up(2);
		}

		protected mcframe.clientMSBE.MSBEP2210.Hdr1R down0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)down(0);
		}
		protected MCList down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)down(1);
		}
		protected MCList down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2210_Iv_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			p_MS_MSBEL2210_Iv_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			p_MS_MSBEL2210_Iv_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2210_Iv_Ins01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBE.MSBEP2210.Hdr1R)p_MS_MSBEL2210_Iv_Ins01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList)p_MS_MSBEL2210_Iv_Ins01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList)p_MS_MSBEL2210_Iv_Ins01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2210_Iv_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2210_Iv_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL2210_Iv_Upd01Bridge() {
			p_MS_MSBEL2210_Iv_Upd01 = new MCParam(PDef.MS_MSBEL2210_Iv_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2210_Iv_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));

			p_MS_MSBEL2210_Iv_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2210_Iv_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2210_Iv_Upd01.addUpBlock(getHdr1R());
			p_MS_MSBEL2210_Iv_Upd01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBEL2210_Iv_Upd01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2210_Iv_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2210_Iv_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2210.Hdr1R up0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)up(0);
		}
		protected MCList up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)up(1);
		}
		protected MCList up2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)up(2);
		}

		protected mcframe.clientMSBE.MSBEP2210.Hdr1R down0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)down(0);
		}
		protected MCList down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)down(1);
		}
		protected MCList down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2210_Iv_Upd01.addDownBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			p_MS_MSBEL2210_Iv_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			p_MS_MSBEL2210_Iv_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2210_Iv_Upd01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBE.MSBEP2210.Hdr1R)p_MS_MSBEL2210_Iv_Upd01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList)p_MS_MSBEL2210_Iv_Upd01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList)p_MS_MSBEL2210_Iv_Upd01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2210_Iv_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2210_Iv_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2210_Iv_Del01;

		/** コンストラクタ */
		protected MS_MSBEL2210_Iv_Del01Bridge() {
			p_MS_MSBEL2210_Iv_Del01 = new MCParam(PDef.MS_MSBEL2210_Iv_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2210_Iv_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2210.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2210.Dtl2R.class));
			// Down

			p_MS_MSBEL2210_Iv_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2210_Iv_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2210_Iv_Del01.addUpBlock(getHdr1R());
			p_MS_MSBEL2210_Iv_Del01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBEL2210_Iv_Del01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2210_Iv_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2210_Iv_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2210.Hdr1R up0() {
			return (mcframe.clientMSBE.MSBEP2210.Hdr1R)up(0);
		}
		protected MCList up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl1R>)up(1);
		}
		protected MCList up2() {
			return (MCList<mcframe.clientMSBE.MSBEP2210.Dtl2R>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL2210_Iv_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}