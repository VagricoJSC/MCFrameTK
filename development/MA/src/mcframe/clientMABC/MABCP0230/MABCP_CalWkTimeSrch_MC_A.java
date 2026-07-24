package mcframe.clientMABC.MABCP0230;

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
import mcframe.clientMABC.MABCP0230.MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Srch01Caller;
import mcframe.clientMABC.MABCP0230.MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Upd01Caller;

/**
 * 画面"MABCP_CalWkTimeSrch"パネルクラスです。<p>
 *
 * 稼働状況確認を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_CalWkTimeSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MABCP0230";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [CndPnl]ブロック関連のField定義
	public MCPanel CndPnlPanel = null;
	public MCTitledBorder CndPnlTitledBorder = null;
	// [CndPnl]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_cal_cd_Label = null;
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cal_cd = null;
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public MCTextField Cnd_cal_nm = null;
	public MCLabel Cnd_year_Label = null;
	/**
	 * Year 年.<p>
	 *
	 */
	public MCDateField Cnd_year = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton SrchBtn_srch = null;
	// [RsltCal]ブロック関連のField定義
	public MCPanel RsltCalPanel = null;
	public MCTitledBorder RsltCalTitledBorder = null;
	public MCScrollPane RsltCalScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0230.RsltCalR> RsltCalTable = null;
	// [RsltCal]ブロックの項目のField定義
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_ym = null;
	/**
	 * 1 1.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt01 = null;
	/**
	 * 2 2.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt02 = null;
	/**
	 * 3 3.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt03 = null;
	/**
	 * 4 4.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt04 = null;
	/**
	 * 5 5.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt05 = null;
	/**
	 * 6 6.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt06 = null;
	/**
	 * 7 7.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt07 = null;
	/**
	 * 8 8.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt08 = null;
	/**
	 * 9 9.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt09 = null;
	/**
	 * 10 10.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt10 = null;
	/**
	 * 11 11.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt11 = null;
	/**
	 * 12 12.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt12 = null;
	/**
	 * 13 13.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt13 = null;
	/**
	 * 14 14.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt14 = null;
	/**
	 * 15 15.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt15 = null;
	/**
	 * 16 16.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt16 = null;
	/**
	 * 17 17.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt17 = null;
	/**
	 * 18 18.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt18 = null;
	/**
	 * 19 19.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt19 = null;
	/**
	 * 20 20.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt20 = null;
	/**
	 * 21 21.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt21 = null;
	/**
	 * 22 22.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt22 = null;
	/**
	 * 23 23.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt23 = null;
	/**
	 * 24 24.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt24 = null;
	/**
	 * 25 25.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt25 = null;
	/**
	 * 26 26.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt26 = null;
	/**
	 * 27 27.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt27 = null;
	/**
	 * 28 28.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt28 = null;
	/**
	 * 29 29.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt29 = null;
	/**
	 * 30 30.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt30 = null;
	/**
	 * 31 31.<p>
	 *
	 */
	public MCColumnConfig columnRsltCal_dt31 = null;
	// [RsltDtHdr]ブロック関連のField定義
	public MCPanel RsltDtHdrPanel = null;
	public MCTitledBorder RsltDtHdrTitledBorder = null;
	// [RsltDtHdr]ブロックの項目のField定義
	public MCLabel RsltDtHdr_cal_cd_Label = null;
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox RsltDtHdr_cal_cd = null;
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public MCTextField RsltDtHdr_cal_nm = null;
	public MCLabel RsltDtHdr_dt_Label = null;
	/**
	 * Date 日付.<p>
	 *
	 */
	public MCDateField RsltDtHdr_dt = null;
	public MCLabel RsltDtHdr_day_week_typ_nm_Label = null;
	/**
	 * Day of week 曜日.<p>
	 *
	 */
	public MCTextField RsltDtHdr_day_week_typ_nm = null;
	/**
	 * Holiday 休日.<p>
	 *
	 */
	public MCCheckBox RsltDtHdr_off_flg_disp = null;
	/**
	 * Holiday 休日.<p>
	 *
	 */
	public MCCheckBox RsltDtHdr_off_flg = null;
	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public MCCheckBox RsltDtHdr_cal_ext_disp = null;
	/**
	 * Temporary calendar 臨時カレンダ.<p>
	 *
	 */
	public MCCheckBox RsltDtHdr_cal_ext = null;
	public MCLabel RsltDtHdr_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField RsltDtHdr_memo1 = null;
	public MCLabel RsltDtHdr_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField RsltDtHdr_memo2 = null;
	public MCLabel RsltDtHdr_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField RsltDtHdr_memo3 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Calendar master entry カレンダマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0210 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, REF};
	
	/** [MA_MABCL0230_Srch01]のCallerの作成 */
	protected MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Srch01Caller createMA_MABCL0230_Srch01() {
		MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Srch01Caller<MABCP_CalWkTimeSrch, MA_MABCL0230_Srch01Bridge>
		caller = ((MABCP_CalWkTimeSrch_MC)this).new MA_MABCL0230_Srch01Caller<MABCP_CalWkTimeSrch, MA_MABCL0230_Srch01Bridge>(
					(MABCP_CalWkTimeSrch)this, new MA_MABCL0230_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0230_Srch01]の呼び出し */
	protected void callMA_MABCL0230_Srch01() {
		MCCaller caller = createMA_MABCL0230_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0230_Upd01]のCallerの作成 */
	protected MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Upd01Caller createMA_MABCL0230_Upd01() {
		MABCP_CalWkTimeSrch_MC.MA_MABCL0230_Upd01Caller<MABCP_CalWkTimeSrch, MA_MABCL0230_Upd01Bridge>
		caller = ((MABCP_CalWkTimeSrch_MC)this).new MA_MABCL0230_Upd01Caller<MABCP_CalWkTimeSrch, MA_MABCL0230_Upd01Bridge>(
					(MABCP_CalWkTimeSrch)this, new MA_MABCL0230_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0230_Upd01]の呼び出し */
	protected void callMA_MABCL0230_Upd01() {
		MCCaller caller = createMA_MABCL0230_Upd01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0230.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0230.CndR aCndR;
	/** [RsltCal]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0230.RsltCalR> aRsltCalL;
	/** [RsltDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0230.RsltDtHdrR aRsltDtHdrR;
	/** [RegCalExt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0230.RegCalExtR> aRegCalExtL;
	/** [WkCal]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0230.WkCalR> aWkCalL;
	/** [WkCalExt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0230.WkCalExtR> aWkCalExtL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0230.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0230.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0230.MstR createMstR() {
		return mcframe.clientMABC.MABCP0230.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0230.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0230.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0230.CndR createCndR() {
		return mcframe.clientMABC.MABCP0230.CndR.create();
	}

	/**
	 * コピーによってaRsltCalLを設定します。
	 *
	 * aRsltCalLのインスタンスは変更されません。
	 *
	 * @param dataset RsltCalL
	 */
	public void setRsltCalL(MCList<mcframe.clientMABC.MABCP0230.RsltCalR> aList) {
		if (getRsltCalL() != aList) {
			getRsltCalL().setAll(aList);
		}
	}

	/**
	 * [RsltCal]ブロックのコンテナaRsltCalLを返します。
	 *
	 * @return RsltCalL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.RsltCalR> getRsltCalL() {
		return aRsltCalL;
	}

	/**
	 * aRsltCalRを作成します。
	 *
	 * @return RsltCalR
	 */
	public mcframe.clientMABC.MABCP0230.RsltCalR createRsltCalR() {
		return mcframe.clientMABC.MABCP0230.RsltCalR.create();
	}

	/**
	 * aRsltCalLを作成します。
	 *
	 * @return RsltCalL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.RsltCalR> createRsltCalL() {
		return MCList.create(mcframe.clientMABC.MABCP0230.RsltCalR.class);
	}

	/**
	 * RsltCalTableを初期化します。
	 */
	protected void createRsltCalTable(){
		if(RsltCalTable == null){
			RsltCalTable = beansFactory.createTable2("RsltCal.table");
		}
	}

	/**
	 * 項目コピーによってaRsltDtHdrRを設定します。
	 *
	 * aRsltDtHdrRのインスタンスは変更されません。
	 *
	 * @param row RsltDtHdrR
	 */
	public void setRsltDtHdrR(mcframe.clientMABC.MABCP0230.RsltDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getRsltDtHdrR(), row);
		}
	}

	/**
	 * [RsltDtHdr]ブロックのコンテナaRsltDtHdrRを返します。
	 *
	 * @return RsltDtHdrR
	 */
	public mcframe.clientMABC.MABCP0230.RsltDtHdrR getRsltDtHdrR() {
		return aRsltDtHdrR;
	}

	/**
	 * aRsltDtHdrRを作成します。
	 *
	 * @return RsltDtHdrR
	 */
	public mcframe.clientMABC.MABCP0230.RsltDtHdrR createRsltDtHdrR() {
		return mcframe.clientMABC.MABCP0230.RsltDtHdrR.create();
	}

	/**
	 * コピーによってaRegCalExtLを設定します。
	 *
	 * aRegCalExtLのインスタンスは変更されません。
	 *
	 * @param dataset RegCalExtL
	 */
	public void setRegCalExtL(MCList<mcframe.clientMABC.MABCP0230.RegCalExtR> aList) {
		if (getRegCalExtL() != aList) {
			getRegCalExtL().setAll(aList);
		}
	}

	/**
	 * [RegCalExt]ブロックのコンテナaRegCalExtLを返します。
	 *
	 * @return RegCalExtL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.RegCalExtR> getRegCalExtL() {
		return aRegCalExtL;
	}

	/**
	 * aRegCalExtRを作成します。
	 *
	 * @return RegCalExtR
	 */
	public mcframe.clientMABC.MABCP0230.RegCalExtR createRegCalExtR() {
		return mcframe.clientMABC.MABCP0230.RegCalExtR.create();
	}

	/**
	 * aRegCalExtLを作成します。
	 *
	 * @return RegCalExtL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.RegCalExtR> createRegCalExtL() {
		return MCList.create(mcframe.clientMABC.MABCP0230.RegCalExtR.class);
	}

	/**
	 * コピーによってaWkCalLを設定します。
	 *
	 * aWkCalLのインスタンスは変更されません。
	 *
	 * @param dataset WkCalL
	 */
	public void setWkCalL(MCList<mcframe.clientMABC.MABCP0230.WkCalR> aList) {
		if (getWkCalL() != aList) {
			getWkCalL().setAll(aList);
		}
	}

	/**
	 * [WkCal]ブロックのコンテナaWkCalLを返します。
	 *
	 * @return WkCalL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.WkCalR> getWkCalL() {
		return aWkCalL;
	}

	/**
	 * aWkCalRを作成します。
	 *
	 * @return WkCalR
	 */
	public mcframe.clientMABC.MABCP0230.WkCalR createWkCalR() {
		return mcframe.clientMABC.MABCP0230.WkCalR.create();
	}

	/**
	 * aWkCalLを作成します。
	 *
	 * @return WkCalL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.WkCalR> createWkCalL() {
		return MCList.create(mcframe.clientMABC.MABCP0230.WkCalR.class);
	}

	/**
	 * コピーによってaWkCalExtLを設定します。
	 *
	 * aWkCalExtLのインスタンスは変更されません。
	 *
	 * @param dataset WkCalExtL
	 */
	public void setWkCalExtL(MCList<mcframe.clientMABC.MABCP0230.WkCalExtR> aList) {
		if (getWkCalExtL() != aList) {
			getWkCalExtL().setAll(aList);
		}
	}

	/**
	 * [WkCalExt]ブロックのコンテナaWkCalExtLを返します。
	 *
	 * @return WkCalExtL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.WkCalExtR> getWkCalExtL() {
		return aWkCalExtL;
	}

	/**
	 * aWkCalExtRを作成します。
	 *
	 * @return WkCalExtR
	 */
	public mcframe.clientMABC.MABCP0230.WkCalExtR createWkCalExtR() {
		return mcframe.clientMABC.MABCP0230.WkCalExtR.create();
	}

	/**
	 * aWkCalExtLを作成します。
	 *
	 * @return WkCalExtL
	 */
	public MCList<mcframe.clientMABC.MABCP0230.WkCalExtR> createWkCalExtL() {
		return MCList.create(mcframe.clientMABC.MABCP0230.WkCalExtR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltCalL())) ret.add(getRsltCalL());
		if(!MCCollectionUtil.contains(ret, getRsltDtHdrR())) ret.add(getRsltDtHdrR());
		if(!MCCollectionUtil.contains(ret, getRegCalExtL())) ret.add(getRegCalExtL());
		if(!MCCollectionUtil.contains(ret, getWkCalL())) ret.add(getWkCalL());
		if(!MCCollectionUtil.contains(ret, getWkCalExtL())) ret.add(getWkCalExtL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getRsltCalL()) return "RsltCal";
		if(aCnt == getRsltDtHdrR()) return "RsltDtHdr";
		if(aCnt == getRegCalExtL()) return "RegCalExt";
		if(aCnt == getWkCalL()) return "WkCal";
		if(aCnt == getWkCalExtL()) return "WkCalExt";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("RsltCal")) return getRsltCalL();
		if(bId.equals("RsltDtHdr")) return getRsltDtHdrR();
		if(bId.equals("RegCalExt")) return getRegCalExtL();
		if(bId.equals("WkCal")) return getWkCalL();
		if(bId.equals("WkCalExt")) return getWkCalExtL();
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
		ret.add(MstPanel);
		ret.add(CndPnlPanel);
		ret.add(CndPanel);
		ret.add(SrchBtnPanel);
		ret.add(RsltCalPanel);
		ret.add(RsltDtHdrPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CalWkTimeSrch_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aRsltCalL = createRsltCalL();
		aRsltDtHdrR = createRsltDtHdrR();
		aRegCalExtL = createRegCalExtL();
		aWkCalL = createWkCalL();
		aWkCalExtL = createWkCalExtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_CalWkTimeSrch_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aRsltCalL = createRsltCalL();
		createRsltCalTable();
		RsltCalTable.setRowName(name);
		aRsltDtHdrR = createRsltDtHdrR();
		aRegCalExtL = createRegCalExtL();
		aWkCalL = createWkCalL();
		aWkCalExtL = createWkCalExtL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_CalWkTimeSrch_MC.jbCreateScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateMst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateCndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateCnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateSrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateRsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateRsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbCreateBtn((MABCP_CalWkTimeSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [CndPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPnl(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [RsltCal]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltCal(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [RsltDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltDtHdr(MABCP_CalWkTimeSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_CalWkTimeSrch p) {
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

	
	/** [Cnd_cal_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cal_cd_p = null;

	/**
	 * [Cnd_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cal_cd_ListPutter() {
		if (Cnd_cal_cd_p == null) {
			Cnd_cal_cd_p = createCnd_cal_cd_ListPutter(Cnd_cal_cd, "cal_cd", "cal_nm");

		}
		return Cnd_cal_cd_p;
	}
	
	
	/** [RsltDtHdr_cal_cd_ListPutter]の定義 */
	private MCListPutter RsltDtHdr_cal_cd_p = null;

	/**
	 * [RsltDtHdr_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltDtHdr_cal_cd_ListPutter() {
		if (RsltDtHdr_cal_cd_p == null) {
			RsltDtHdr_cal_cd_p = createRsltDtHdr_cal_cd_ListPutter(RsltDtHdr_cal_cd, "cal_cd");

		}
		return RsltDtHdr_cal_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CalWkTimeSrch create(){
		MABCP_CalWkTimeSrch p = new MABCP_CalWkTimeSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CalWkTimeSrch create(String name){
		MABCP_CalWkTimeSrch p = new MABCP_CalWkTimeSrch(name);
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
		MABCP_CalWkTimeSrch_MC.jbfInitScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitMst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitCndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitCnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitSrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitRsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitRsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbfInitBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitMst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitCndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitCnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitSrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitRsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitRsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.jbInitBtn((MABCP_CalWkTimeSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPnl(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.CndPnlPanel = p.beansFactory.createPanel("CndPnl");
		p.CndPnlTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cal_cd_Label = p.beansFactory.createLabel("Cnd.cal_cd_Label");
		p.Cnd_cal_cd = p.beansFactory.createTextComboBox("Cnd.cal_cd");
		p.Cnd_cal_cd.setLabel(p.Cnd_cal_cd_Label);
		p.Cnd_cal_nm = p.beansFactory.createTextField("Cnd.cal_nm");
		p.Cnd_year_Label = p.beansFactory.createLabel("Cnd.year_Label");
		p.Cnd_year = p.beansFactory.createDateField("Cnd.year");
		p.Cnd_year.setLabel(p.Cnd_year_Label);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
		p.SrchBtn_srch = p.beansFactory.createButton("SrchBtn.srch", "srch");
	}

	/**
	 * [RsltCal]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltCal(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.RsltCalPanel = p.beansFactory.createPanel("RsltCal");
		p.RsltCalTitledBorder = p.beansFactory.createTitledBorder();
		p.RsltCalScrollPane = p.beansFactory.createScrollPane("RsltCal.scroll");
		p.createRsltCalTable();
		// ブロックの項目の初期化
		p.columnRsltCal_ym = p.beansFactory.createTableColumn("RsltCal.ym", MCColumnType.DATE);
		p.columnRsltCal_dt01 = p.beansFactory.createTableColumn("RsltCal.dt01", MCColumnType.TEXT);
		p.columnRsltCal_dt02 = p.beansFactory.createTableColumn("RsltCal.dt02", MCColumnType.TEXT);
		p.columnRsltCal_dt03 = p.beansFactory.createTableColumn("RsltCal.dt03", MCColumnType.TEXT);
		p.columnRsltCal_dt04 = p.beansFactory.createTableColumn("RsltCal.dt04", MCColumnType.TEXT);
		p.columnRsltCal_dt05 = p.beansFactory.createTableColumn("RsltCal.dt05", MCColumnType.TEXT);
		p.columnRsltCal_dt06 = p.beansFactory.createTableColumn("RsltCal.dt06", MCColumnType.TEXT);
		p.columnRsltCal_dt07 = p.beansFactory.createTableColumn("RsltCal.dt07", MCColumnType.TEXT);
		p.columnRsltCal_dt08 = p.beansFactory.createTableColumn("RsltCal.dt08", MCColumnType.TEXT);
		p.columnRsltCal_dt09 = p.beansFactory.createTableColumn("RsltCal.dt09", MCColumnType.TEXT);
		p.columnRsltCal_dt10 = p.beansFactory.createTableColumn("RsltCal.dt10", MCColumnType.TEXT);
		p.columnRsltCal_dt11 = p.beansFactory.createTableColumn("RsltCal.dt11", MCColumnType.TEXT);
		p.columnRsltCal_dt12 = p.beansFactory.createTableColumn("RsltCal.dt12", MCColumnType.TEXT);
		p.columnRsltCal_dt13 = p.beansFactory.createTableColumn("RsltCal.dt13", MCColumnType.TEXT);
		p.columnRsltCal_dt14 = p.beansFactory.createTableColumn("RsltCal.dt14", MCColumnType.TEXT);
		p.columnRsltCal_dt15 = p.beansFactory.createTableColumn("RsltCal.dt15", MCColumnType.TEXT);
		p.columnRsltCal_dt16 = p.beansFactory.createTableColumn("RsltCal.dt16", MCColumnType.TEXT);
		p.columnRsltCal_dt17 = p.beansFactory.createTableColumn("RsltCal.dt17", MCColumnType.TEXT);
		p.columnRsltCal_dt18 = p.beansFactory.createTableColumn("RsltCal.dt18", MCColumnType.TEXT);
		p.columnRsltCal_dt19 = p.beansFactory.createTableColumn("RsltCal.dt19", MCColumnType.TEXT);
		p.columnRsltCal_dt20 = p.beansFactory.createTableColumn("RsltCal.dt20", MCColumnType.TEXT);
		p.columnRsltCal_dt21 = p.beansFactory.createTableColumn("RsltCal.dt21", MCColumnType.TEXT);
		p.columnRsltCal_dt22 = p.beansFactory.createTableColumn("RsltCal.dt22", MCColumnType.TEXT);
		p.columnRsltCal_dt23 = p.beansFactory.createTableColumn("RsltCal.dt23", MCColumnType.TEXT);
		p.columnRsltCal_dt24 = p.beansFactory.createTableColumn("RsltCal.dt24", MCColumnType.TEXT);
		p.columnRsltCal_dt25 = p.beansFactory.createTableColumn("RsltCal.dt25", MCColumnType.TEXT);
		p.columnRsltCal_dt26 = p.beansFactory.createTableColumn("RsltCal.dt26", MCColumnType.TEXT);
		p.columnRsltCal_dt27 = p.beansFactory.createTableColumn("RsltCal.dt27", MCColumnType.TEXT);
		p.columnRsltCal_dt28 = p.beansFactory.createTableColumn("RsltCal.dt28", MCColumnType.TEXT);
		p.columnRsltCal_dt29 = p.beansFactory.createTableColumn("RsltCal.dt29", MCColumnType.TEXT);
		p.columnRsltCal_dt30 = p.beansFactory.createTableColumn("RsltCal.dt30", MCColumnType.TEXT);
		p.columnRsltCal_dt31 = p.beansFactory.createTableColumn("RsltCal.dt31", MCColumnType.TEXT);
	}

	/**
	 * [RsltDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltDtHdr(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.RsltDtHdrPanel = p.beansFactory.createPanel("RsltDtHdr");
		p.RsltDtHdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.RsltDtHdr_cal_cd_Label = p.beansFactory.createLabel("RsltDtHdr.cal_cd_Label");
		p.RsltDtHdr_cal_cd = p.beansFactory.createTextComboBox("RsltDtHdr.cal_cd");
		p.RsltDtHdr_cal_cd.setLabel(p.RsltDtHdr_cal_cd_Label);
		p.RsltDtHdr_cal_nm = p.beansFactory.createTextField("RsltDtHdr.cal_nm");
		p.RsltDtHdr_dt_Label = p.beansFactory.createLabel("RsltDtHdr.dt_Label");
		p.RsltDtHdr_dt = p.beansFactory.createDateField("RsltDtHdr.dt");
		p.RsltDtHdr_dt.setLabel(p.RsltDtHdr_dt_Label);
		p.RsltDtHdr_day_week_typ_nm_Label = p.beansFactory.createLabel("RsltDtHdr.day_week_typ_nm_Label");
		p.RsltDtHdr_day_week_typ_nm = p.beansFactory.createTextField("RsltDtHdr.day_week_typ_nm");
		p.RsltDtHdr_day_week_typ_nm.setLabel(p.RsltDtHdr_day_week_typ_nm_Label);
		p.RsltDtHdr_off_flg_disp = p.beansFactory.createCheckBox("RsltDtHdr.off_flg_disp");
		p.RsltDtHdr_off_flg = p.beansFactory.createCheckBox("RsltDtHdr.off_flg");
		p.RsltDtHdr_cal_ext_disp = p.beansFactory.createCheckBox("RsltDtHdr.cal_ext_disp");
		p.RsltDtHdr_cal_ext = p.beansFactory.createCheckBox("RsltDtHdr.cal_ext");
		p.RsltDtHdr_memo1_Label = p.beansFactory.createLabel("RsltDtHdr.memo1_Label");
		p.RsltDtHdr_memo1 = p.beansFactory.createTextField("RsltDtHdr.memo1");
		p.RsltDtHdr_memo1.setLabel(p.RsltDtHdr_memo1_Label);
		p.RsltDtHdr_memo2_Label = p.beansFactory.createLabel("RsltDtHdr.memo2_Label");
		p.RsltDtHdr_memo2 = p.beansFactory.createTextField("RsltDtHdr.memo2");
		p.RsltDtHdr_memo2.setLabel(p.RsltDtHdr_memo2_Label);
		p.RsltDtHdr_memo3_Label = p.beansFactory.createLabel("RsltDtHdr.memo3_Label");
		p.RsltDtHdr_memo3 = p.beansFactory.createTextField("RsltDtHdr.memo3");
		p.RsltDtHdr_memo3.setLabel(p.RsltDtHdr_memo3_Label);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0210 = p.beansFactory.createButton("Btn.open_MABCP0210", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPnlPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0230.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPnl(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.CndPnlPanel.setBorder(p.CndPnlTitledBorder);
		p.add(p.CndPnlPanel);
		p.CndPnlPanel.setNextBeans(p.RsltCalPanel);
		p.CndPnlPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.CndPnlPanel.add(p.CndPanel, null);
		p.CndPnlPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.CndPnlPanel.add(p.SrchBtnPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("W");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0230.CndR.ope_META);
		p.Cnd_cal_cd.setListType(MCListType.STRICT);
		p.Cnd_cal_cd.setLinkBeans(p.Cnd_cal_nm);
		p.CndPanel.add(p.Cnd_cal_cd_Label);
		p.CndPanel.add(p.Cnd_cal_cd);
		p.CndPanel.setLastBeans(p.Cnd_cal_cd);
		p.Cnd_cal_cd.setNextBeans(p.Cnd_cal_nm);
		p.Cnd_cal_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0230.CndR.cal_cd_META);
		p.CndPanel.add(p.Cnd_cal_nm);
		p.Cnd_cal_nm.setNextBeans(p.Cnd_year);
		p.Cnd_cal_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0230.CndR.cal_nm_META);
		p.CndPanel.add(p.Cnd_year_Label);
		p.CndPanel.add(p.Cnd_year);
		p.Cnd_year.setRow(p.getCndR(), mcframe.clientMABC.MABCP0230.CndR.year_META);
		p.Cnd_year.setFormatID(mcframe.commonMA.meta.MA_META.Y_FORMAT);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("E");
		// ブロックの項目の初期化
		p.SrchBtn_srch.setIcon("SEARCH");
		p.SrchBtn_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtnPanel.add(p.SrchBtn_srch);
		p.SrchBtnPanel.setLastBeans(p.SrchBtn_srch);
	}

	/**
	 * [RsltCal]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltCal(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.RsltCalPanel.setBorder(p.RsltCalTitledBorder);
		p.add(p.RsltCalPanel);
		p.RsltCalPanel.setNextBeans(p.RsltDtHdrPanel);
		p.RsltCalPanel.add(p.RsltCalScrollPane);
		p.RsltCalPanel.setLastBeans(p.RsltCalTable);
		p.RsltCalScrollPane.setViewportView(p.RsltCalTable);
		p.RsltCalTable.setList(p.getRsltCalL());
		p.RsltCalPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltDtHdr(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.RsltDtHdrPanel.setBorder(p.RsltDtHdrTitledBorder);
		p.add(p.RsltDtHdrPanel);
		p.RsltDtHdrPanel.setNextBeans(p.BtnPanel);
		p.RsltDtHdrPanel.setLayoutPosition("CN");
		// ブロックの項目の初期化
		p.RsltDtHdr_cal_cd.setListType(MCListType.STRICT);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_cal_cd_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_cal_cd);
		p.RsltDtHdrPanel.setLastBeans(p.RsltDtHdr_cal_cd);
		p.RsltDtHdr_cal_cd.setNextBeans(p.RsltDtHdr_cal_nm);
		p.RsltDtHdr_cal_cd.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.cal_cd_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_cal_nm);
		p.RsltDtHdr_cal_nm.setNextBeans(p.RsltDtHdr_dt);
		p.RsltDtHdr_cal_nm.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.cal_nm_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_dt_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_dt);
		p.RsltDtHdr_dt.setNextBeans(p.RsltDtHdr_day_week_typ_nm);
		p.RsltDtHdr_dt.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.dt_META);
		p.RsltDtHdr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_day_week_typ_nm_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_day_week_typ_nm);
		p.RsltDtHdr_day_week_typ_nm.setNextBeans(p.RsltDtHdr_off_flg_disp);
		p.RsltDtHdr_day_week_typ_nm.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.day_week_typ_nm_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_off_flg_disp);
		p.RsltDtHdr_off_flg_disp.setNextBeans(p.RsltDtHdr_off_flg);
		p.RsltDtHdr_off_flg_disp.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.off_flg_disp_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_off_flg);
		p.RsltDtHdr_off_flg.setNextBeans(p.RsltDtHdr_cal_ext_disp);
		p.RsltDtHdr_off_flg.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.off_flg_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_cal_ext_disp);
		p.RsltDtHdr_cal_ext_disp.setNextBeans(p.RsltDtHdr_cal_ext);
		p.RsltDtHdr_cal_ext_disp.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.cal_ext_disp_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_cal_ext);
		p.RsltDtHdr_cal_ext.setNextBeans(p.RsltDtHdr_memo1);
		p.RsltDtHdr_cal_ext.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.cal_ext_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo1_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo1);
		p.RsltDtHdr_memo1.setNextBeans(p.RsltDtHdr_memo2);
		p.RsltDtHdr_memo1.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.memo1_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo2_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo2);
		p.RsltDtHdr_memo2.setNextBeans(p.RsltDtHdr_memo3);
		p.RsltDtHdr_memo2.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.memo2_META);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo3_Label);
		p.RsltDtHdrPanel.add(p.RsltDtHdr_memo3);
		p.RsltDtHdr_memo3.setRow(p.getRsltDtHdrR(), mcframe.clientMABC.MABCP0230.RsltDtHdrR.memo3_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_CalWkTimeSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP0210);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP0210);
		p.Btn_open_MABCP0210.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MABCP_CalWkTimeSrch_MC.mcInitScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitMst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitCndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitCnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitSrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitRsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitRsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.mcInitBtn((MABCP_CalWkTimeSrch)this);

		// [UPD]ステータスのモードの設定
		MABCP_CalWkTimeSrch_MC.statusInitUPD_ScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_Mst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_CndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_Cnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_SrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_RsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_RsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_RegCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_WkCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_WkCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitUPD_Btn((MABCP_CalWkTimeSrch)this);

		// [FIX]ステータスのモードの設定
		MABCP_CalWkTimeSrch_MC.statusInitFIX_ScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_Mst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_CndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_Cnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_SrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_RsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_RsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_RegCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_WkCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_WkCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitFIX_Btn((MABCP_CalWkTimeSrch)this);

		// [REF]ステータスのモードの設定
		MABCP_CalWkTimeSrch_MC.statusInitREF_ScreenOpe((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_Mst((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_CndPnl((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_Cnd((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_SrchBtn((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_RsltCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_RsltDtHdr((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_RegCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_WkCal((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_WkCalExt((MABCP_CalWkTimeSrch)this);
		MABCP_CalWkTimeSrch_MC.statusInitREF_Btn((MABCP_CalWkTimeSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_CalWkTimeSrch p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_CalWkTimeSrch p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [CndPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPnl(MABCP_CalWkTimeSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_CalWkTimeSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cal_cd.setListListener(p);
		p.Cnd_cal_cd.addAllListener(p);
		p.Cnd_cal_nm.setListListener(p);
		p.Cnd_cal_nm.addAllListener(p);
		p.Cnd_year.setListListener(p);
		p.Cnd_year.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MABCP_CalWkTimeSrch p) {
		p.SrchBtn_srch.addAllListener(p);
		p.SrchBtn_srch.setAPMethodName("doSrchBtn_srch");
	}

	/**
	 *  [RsltCal]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltCal(MABCP_CalWkTimeSrch p) {
		p.RsltCalTable.addAllListener(p);
		p.columnRsltCal_ym.addAllListener(p);
		p.columnRsltCal_ym.setListListener(p);
		p.columnRsltCal_dt01.addAllListener(p);
		p.columnRsltCal_dt01.setListListener(p);
		p.columnRsltCal_dt02.addAllListener(p);
		p.columnRsltCal_dt02.setListListener(p);
		p.columnRsltCal_dt03.addAllListener(p);
		p.columnRsltCal_dt03.setListListener(p);
		p.columnRsltCal_dt04.addAllListener(p);
		p.columnRsltCal_dt04.setListListener(p);
		p.columnRsltCal_dt05.addAllListener(p);
		p.columnRsltCal_dt05.setListListener(p);
		p.columnRsltCal_dt06.addAllListener(p);
		p.columnRsltCal_dt06.setListListener(p);
		p.columnRsltCal_dt07.addAllListener(p);
		p.columnRsltCal_dt07.setListListener(p);
		p.columnRsltCal_dt08.addAllListener(p);
		p.columnRsltCal_dt08.setListListener(p);
		p.columnRsltCal_dt09.addAllListener(p);
		p.columnRsltCal_dt09.setListListener(p);
		p.columnRsltCal_dt10.addAllListener(p);
		p.columnRsltCal_dt10.setListListener(p);
		p.columnRsltCal_dt11.addAllListener(p);
		p.columnRsltCal_dt11.setListListener(p);
		p.columnRsltCal_dt12.addAllListener(p);
		p.columnRsltCal_dt12.setListListener(p);
		p.columnRsltCal_dt13.addAllListener(p);
		p.columnRsltCal_dt13.setListListener(p);
		p.columnRsltCal_dt14.addAllListener(p);
		p.columnRsltCal_dt14.setListListener(p);
		p.columnRsltCal_dt15.addAllListener(p);
		p.columnRsltCal_dt15.setListListener(p);
		p.columnRsltCal_dt16.addAllListener(p);
		p.columnRsltCal_dt16.setListListener(p);
		p.columnRsltCal_dt17.addAllListener(p);
		p.columnRsltCal_dt17.setListListener(p);
		p.columnRsltCal_dt18.addAllListener(p);
		p.columnRsltCal_dt18.setListListener(p);
		p.columnRsltCal_dt19.addAllListener(p);
		p.columnRsltCal_dt19.setListListener(p);
		p.columnRsltCal_dt20.addAllListener(p);
		p.columnRsltCal_dt20.setListListener(p);
		p.columnRsltCal_dt21.addAllListener(p);
		p.columnRsltCal_dt21.setListListener(p);
		p.columnRsltCal_dt22.addAllListener(p);
		p.columnRsltCal_dt22.setListListener(p);
		p.columnRsltCal_dt23.addAllListener(p);
		p.columnRsltCal_dt23.setListListener(p);
		p.columnRsltCal_dt24.addAllListener(p);
		p.columnRsltCal_dt24.setListListener(p);
		p.columnRsltCal_dt25.addAllListener(p);
		p.columnRsltCal_dt25.setListListener(p);
		p.columnRsltCal_dt26.addAllListener(p);
		p.columnRsltCal_dt26.setListListener(p);
		p.columnRsltCal_dt27.addAllListener(p);
		p.columnRsltCal_dt27.setListListener(p);
		p.columnRsltCal_dt28.addAllListener(p);
		p.columnRsltCal_dt28.setListListener(p);
		p.columnRsltCal_dt29.addAllListener(p);
		p.columnRsltCal_dt29.setListListener(p);
		p.columnRsltCal_dt30.addAllListener(p);
		p.columnRsltCal_dt30.setListListener(p);
		p.columnRsltCal_dt31.addAllListener(p);
		p.columnRsltCal_dt31.setListListener(p);
	}

	/**
	 *  [RsltDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltDtHdr(MABCP_CalWkTimeSrch p) {
		p.RsltDtHdr_cal_cd.setListListener(p);
		p.RsltDtHdr_cal_cd.addAllListener(p);
		p.RsltDtHdr_cal_nm.setListListener(p);
		p.RsltDtHdr_cal_nm.addAllListener(p);
		p.RsltDtHdr_dt.setListListener(p);
		p.RsltDtHdr_dt.addAllListener(p);
		p.RsltDtHdr_day_week_typ_nm.setListListener(p);
		p.RsltDtHdr_day_week_typ_nm.addAllListener(p);
		p.RsltDtHdr_off_flg_disp.addAllListener(p);
		p.RsltDtHdr_off_flg.addAllListener(p);
		p.RsltDtHdr_cal_ext_disp.addAllListener(p);
		p.RsltDtHdr_cal_ext.addAllListener(p);
		p.RsltDtHdr_memo1.setListListener(p);
		p.RsltDtHdr_memo1.addAllListener(p);
		p.RsltDtHdr_memo2.setListListener(p);
		p.RsltDtHdr_memo2.addAllListener(p);
		p.RsltDtHdr_memo3.setListListener(p);
		p.RsltDtHdr_memo3.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_CalWkTimeSrch p) {
		p.Btn_open_MABCP0210.addAllListener(p);
		p.Btn_open_MABCP0210.setAPMethodName("doBtn_open_MABCP0210");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_CalWkTimeSrch p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndPnl(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_CalWkTimeSrch p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_year.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchBtn(MABCP_CalWkTimeSrch p){
		p.SrchBtn_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RsltCal]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltCal(MABCP_CalWkTimeSrch p){
		p.columnRsltCal_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt01.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt02.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt03.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt04.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt05.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt06.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt07.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt08.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt09.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt11.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt12.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt13.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt14.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt15.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt16.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt17.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt18.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt19.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt20.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt21.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt22.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt23.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt24.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt25.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt26.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt27.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt28.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt29.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt30.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltCal_dt31.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[RsltDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltDtHdr(MABCP_CalWkTimeSrch p){
		p.RsltDtHdr_cal_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg_disp.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.RsltDtHdr_cal_ext_disp.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_ext.putMode(p, UPD, MCMode.INVISIBLE);
		p.RsltDtHdr_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDtHdr_memo3.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[RegCalExt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [UPD]ステータスの[WkCal]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WkCal(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [UPD]ステータスの[WkCalExt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WkCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_CalWkTimeSrch p){
		p.Btn_open_MABCP0210.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_CalWkTimeSrch p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndPnl(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_CalWkTimeSrch p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cal_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_year.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SrchBtn(MABCP_CalWkTimeSrch p){
		p.SrchBtn_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[RsltCal]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RsltCal(MABCP_CalWkTimeSrch p){
		p.columnRsltCal_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt01.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt02.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt03.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt04.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt05.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt06.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt07.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt08.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt09.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt21.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt22.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt23.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt24.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt25.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt26.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt27.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt28.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt29.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt30.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRsltCal_dt31.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[RsltDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RsltDtHdr(MABCP_CalWkTimeSrch p){
		p.RsltDtHdr_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_day_week_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.RsltDtHdr_cal_ext_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_ext.putMode(p, FIX, MCMode.INVISIBLE);
		p.RsltDtHdr_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.RsltDtHdr_memo3.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[RegCalExt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [FIX]ステータスの[WkCal]ブロックのモードの設定
	 */
	protected static void statusInitFIX_WkCal(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [FIX]ステータスの[WkCalExt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_WkCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_CalWkTimeSrch p){
		p.Btn_open_MABCP0210.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_CalWkTimeSrch p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPnl(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_CalWkTimeSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cal_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_year.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchBtn(MABCP_CalWkTimeSrch p){
		p.SrchBtn_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[RsltCal]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltCal(MABCP_CalWkTimeSrch p){
		p.columnRsltCal_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltCal_dt31.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[RsltDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltDtHdr(MABCP_CalWkTimeSrch p){
		p.RsltDtHdr_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_off_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.RsltDtHdr_cal_ext_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_cal_ext.putMode(p, REF, MCMode.INVISIBLE);
		p.RsltDtHdr_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDtHdr_memo3.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[RegCalExt]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [REF]ステータスの[WkCal]ブロックのモードの設定
	 */
	protected static void statusInitREF_WkCal(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [REF]ステータスの[WkCalExt]ブロックのモードの設定
	 */
	protected static void statusInitREF_WkCalExt(MABCP_CalWkTimeSrch p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_CalWkTimeSrch p){
		p.Btn_open_MABCP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
		MABCP_CalWkTimeSrch_MC.setTableConfigRsltCal((MABCP_CalWkTimeSrch)this);
	}

	/**
	 * [RsltCal]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltCal(MABCP_CalWkTimeSrch p) {
		p.columnRsltCal_ym.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.ym_META);
		p.columnRsltCal_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_ym);
		p.columnRsltCal_dt01.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt01_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt01);
		p.columnRsltCal_dt02.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt02_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt02);
		p.columnRsltCal_dt03.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt03_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt03);
		p.columnRsltCal_dt04.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt04_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt04);
		p.columnRsltCal_dt05.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt05_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt05);
		p.columnRsltCal_dt06.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt06_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt06);
		p.columnRsltCal_dt07.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt07_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt07);
		p.columnRsltCal_dt08.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt08_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt08);
		p.columnRsltCal_dt09.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt09_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt09);
		p.columnRsltCal_dt10.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt10_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt10);
		p.columnRsltCal_dt11.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt11_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt11);
		p.columnRsltCal_dt12.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt12_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt12);
		p.columnRsltCal_dt13.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt13_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt13);
		p.columnRsltCal_dt14.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt14_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt14);
		p.columnRsltCal_dt15.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt15_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt15);
		p.columnRsltCal_dt16.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt16_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt16);
		p.columnRsltCal_dt17.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt17_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt17);
		p.columnRsltCal_dt18.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt18_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt18);
		p.columnRsltCal_dt19.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt19_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt19);
		p.columnRsltCal_dt20.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt20_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt20);
		p.columnRsltCal_dt21.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt21_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt21);
		p.columnRsltCal_dt22.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt22_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt22);
		p.columnRsltCal_dt23.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt23_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt23);
		p.columnRsltCal_dt24.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt24_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt24);
		p.columnRsltCal_dt25.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt25_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt25);
		p.columnRsltCal_dt26.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt26_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt26);
		p.columnRsltCal_dt27.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt27_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt27);
		p.columnRsltCal_dt28.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt28_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt28);
		p.columnRsltCal_dt29.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt29_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt29);
		p.columnRsltCal_dt30.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt30_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt30);
		p.columnRsltCal_dt31.setMeta(mcframe.clientMABC.MABCP0230.RsltCalR.dt31_META);
		p.RsltCalTable.addColumnConfig(p.columnRsltCal_dt31);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cal_cd.getListConfig().setPutter(getCnd_cal_cd_ListPutter());
		RsltDtHdr_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		RsltDtHdr_cal_cd.getListConfig().setPutter(getRsltDtHdr_cal_cd_ListPutter());
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [RsltDtHdr_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltDtHdr_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cal_cd) return getCnd_cal_cd(row, info);
		if(combo == RsltDtHdr_cal_cd) return getRsltDtHdr_cal_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == SrchBtn_srch) doSrchBtn_srch(info);
		else if (ap == Btn_open_MABCP0210) doBtn_open_MABCP0210(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [SrchBtn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchBtn_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0210(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == RsltCalTable) return doRsltCal_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cal_cd) return doCnd_cal_cd_VC(info);
		if (vc == Cnd_cal_nm) return doCnd_cal_nm_VC(info);
		if (vc == Cnd_year) return doCnd_year_VC(info);
		if (vc == columnRsltCal_ym) return doRsltCal_ym_VC(info);
		if (vc == columnRsltCal_dt01) return doRsltCal_dt01_VC(info);
		if (vc == columnRsltCal_dt02) return doRsltCal_dt02_VC(info);
		if (vc == columnRsltCal_dt03) return doRsltCal_dt03_VC(info);
		if (vc == columnRsltCal_dt04) return doRsltCal_dt04_VC(info);
		if (vc == columnRsltCal_dt05) return doRsltCal_dt05_VC(info);
		if (vc == columnRsltCal_dt06) return doRsltCal_dt06_VC(info);
		if (vc == columnRsltCal_dt07) return doRsltCal_dt07_VC(info);
		if (vc == columnRsltCal_dt08) return doRsltCal_dt08_VC(info);
		if (vc == columnRsltCal_dt09) return doRsltCal_dt09_VC(info);
		if (vc == columnRsltCal_dt10) return doRsltCal_dt10_VC(info);
		if (vc == columnRsltCal_dt11) return doRsltCal_dt11_VC(info);
		if (vc == columnRsltCal_dt12) return doRsltCal_dt12_VC(info);
		if (vc == columnRsltCal_dt13) return doRsltCal_dt13_VC(info);
		if (vc == columnRsltCal_dt14) return doRsltCal_dt14_VC(info);
		if (vc == columnRsltCal_dt15) return doRsltCal_dt15_VC(info);
		if (vc == columnRsltCal_dt16) return doRsltCal_dt16_VC(info);
		if (vc == columnRsltCal_dt17) return doRsltCal_dt17_VC(info);
		if (vc == columnRsltCal_dt18) return doRsltCal_dt18_VC(info);
		if (vc == columnRsltCal_dt19) return doRsltCal_dt19_VC(info);
		if (vc == columnRsltCal_dt20) return doRsltCal_dt20_VC(info);
		if (vc == columnRsltCal_dt21) return doRsltCal_dt21_VC(info);
		if (vc == columnRsltCal_dt22) return doRsltCal_dt22_VC(info);
		if (vc == columnRsltCal_dt23) return doRsltCal_dt23_VC(info);
		if (vc == columnRsltCal_dt24) return doRsltCal_dt24_VC(info);
		if (vc == columnRsltCal_dt25) return doRsltCal_dt25_VC(info);
		if (vc == columnRsltCal_dt26) return doRsltCal_dt26_VC(info);
		if (vc == columnRsltCal_dt27) return doRsltCal_dt27_VC(info);
		if (vc == columnRsltCal_dt28) return doRsltCal_dt28_VC(info);
		if (vc == columnRsltCal_dt29) return doRsltCal_dt29_VC(info);
		if (vc == columnRsltCal_dt30) return doRsltCal_dt30_VC(info);
		if (vc == columnRsltCal_dt31) return doRsltCal_dt31_VC(info);
		if (vc == RsltDtHdr_cal_cd) return doRsltDtHdr_cal_cd_VC(info);
		if (vc == RsltDtHdr_cal_nm) return doRsltDtHdr_cal_nm_VC(info);
		if (vc == RsltDtHdr_dt) return doRsltDtHdr_dt_VC(info);
		if (vc == RsltDtHdr_day_week_typ_nm) return doRsltDtHdr_day_week_typ_nm_VC(info);
		if (vc == RsltDtHdr_off_flg_disp) return doRsltDtHdr_off_flg_disp_VC(info);
		if (vc == RsltDtHdr_off_flg) return doRsltDtHdr_off_flg_VC(info);
		if (vc == RsltDtHdr_cal_ext_disp) return doRsltDtHdr_cal_ext_disp_VC(info);
		if (vc == RsltDtHdr_cal_ext) return doRsltDtHdr_cal_ext_VC(info);
		if (vc == RsltDtHdr_memo1) return doRsltDtHdr_memo1_VC(info);
		if (vc == RsltDtHdr_memo2) return doRsltDtHdr_memo2_VC(info);
		if (vc == RsltDtHdr_memo3) return doRsltDtHdr_memo3_VC(info);
		return true;
	}

	/**
	 * [RsltCal]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[year]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_year_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltCal]パネルの[dt31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltCal_dt31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_off_flg_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_off_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_cal_ext_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_cal_ext_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDtHdr]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDtHdr_memo3_VC(MCEventInfo info){
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
		if (nc == RsltCalTable) doRsltCal_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cal_cd) doCnd_cal_cd_NC(info);
		else if (nc == Cnd_cal_nm) doCnd_cal_nm_NC(info);
		else if (nc == Cnd_year) doCnd_year_NC(info);
		else if (nc == columnRsltCal_ym) doRsltCal_ym_NC(info);
		else if (nc == columnRsltCal_dt01) doRsltCal_dt01_NC(info);
		else if (nc == columnRsltCal_dt02) doRsltCal_dt02_NC(info);
		else if (nc == columnRsltCal_dt03) doRsltCal_dt03_NC(info);
		else if (nc == columnRsltCal_dt04) doRsltCal_dt04_NC(info);
		else if (nc == columnRsltCal_dt05) doRsltCal_dt05_NC(info);
		else if (nc == columnRsltCal_dt06) doRsltCal_dt06_NC(info);
		else if (nc == columnRsltCal_dt07) doRsltCal_dt07_NC(info);
		else if (nc == columnRsltCal_dt08) doRsltCal_dt08_NC(info);
		else if (nc == columnRsltCal_dt09) doRsltCal_dt09_NC(info);
		else if (nc == columnRsltCal_dt10) doRsltCal_dt10_NC(info);
		else if (nc == columnRsltCal_dt11) doRsltCal_dt11_NC(info);
		else if (nc == columnRsltCal_dt12) doRsltCal_dt12_NC(info);
		else if (nc == columnRsltCal_dt13) doRsltCal_dt13_NC(info);
		else if (nc == columnRsltCal_dt14) doRsltCal_dt14_NC(info);
		else if (nc == columnRsltCal_dt15) doRsltCal_dt15_NC(info);
		else if (nc == columnRsltCal_dt16) doRsltCal_dt16_NC(info);
		else if (nc == columnRsltCal_dt17) doRsltCal_dt17_NC(info);
		else if (nc == columnRsltCal_dt18) doRsltCal_dt18_NC(info);
		else if (nc == columnRsltCal_dt19) doRsltCal_dt19_NC(info);
		else if (nc == columnRsltCal_dt20) doRsltCal_dt20_NC(info);
		else if (nc == columnRsltCal_dt21) doRsltCal_dt21_NC(info);
		else if (nc == columnRsltCal_dt22) doRsltCal_dt22_NC(info);
		else if (nc == columnRsltCal_dt23) doRsltCal_dt23_NC(info);
		else if (nc == columnRsltCal_dt24) doRsltCal_dt24_NC(info);
		else if (nc == columnRsltCal_dt25) doRsltCal_dt25_NC(info);
		else if (nc == columnRsltCal_dt26) doRsltCal_dt26_NC(info);
		else if (nc == columnRsltCal_dt27) doRsltCal_dt27_NC(info);
		else if (nc == columnRsltCal_dt28) doRsltCal_dt28_NC(info);
		else if (nc == columnRsltCal_dt29) doRsltCal_dt29_NC(info);
		else if (nc == columnRsltCal_dt30) doRsltCal_dt30_NC(info);
		else if (nc == columnRsltCal_dt31) doRsltCal_dt31_NC(info);
		else if (nc == RsltDtHdr_cal_cd) doRsltDtHdr_cal_cd_NC(info);
		else if (nc == RsltDtHdr_cal_nm) doRsltDtHdr_cal_nm_NC(info);
		else if (nc == RsltDtHdr_dt) doRsltDtHdr_dt_NC(info);
		else if (nc == RsltDtHdr_day_week_typ_nm) doRsltDtHdr_day_week_typ_nm_NC(info);
		else if (nc == RsltDtHdr_off_flg_disp) doRsltDtHdr_off_flg_disp_NC(info);
		else if (nc == RsltDtHdr_off_flg) doRsltDtHdr_off_flg_NC(info);
		else if (nc == RsltDtHdr_cal_ext_disp) doRsltDtHdr_cal_ext_disp_NC(info);
		else if (nc == RsltDtHdr_cal_ext) doRsltDtHdr_cal_ext_NC(info);
		else if (nc == RsltDtHdr_memo1) doRsltDtHdr_memo1_NC(info);
		else if (nc == RsltDtHdr_memo2) doRsltDtHdr_memo2_NC(info);
		else if (nc == RsltDtHdr_memo3) doRsltDtHdr_memo3_NC(info);
	}

	/**
	 * [RsltCal]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[year]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_year_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_ym_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt01_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt02_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt03_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt04_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt05_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt06_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt07_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt08_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt09_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt10_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt11_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt12_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt13_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt14_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt15_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt16_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt17_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt18_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt19_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt20_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt21_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt22_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt23_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt24_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt25_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt26_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt27_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt28_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt29_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt30_NC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt31_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_disp_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_disp_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo3_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltCalTable) doRsltCal_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cal_cd) doCnd_cal_cd_NE(info);
		else if (ne == Cnd_cal_nm) doCnd_cal_nm_NE(info);
		else if (ne == Cnd_year) doCnd_year_NE(info);
		else if (ne == columnRsltCal_ym) doRsltCal_ym_NE(info);
		else if (ne == columnRsltCal_dt01) doRsltCal_dt01_NE(info);
		else if (ne == columnRsltCal_dt02) doRsltCal_dt02_NE(info);
		else if (ne == columnRsltCal_dt03) doRsltCal_dt03_NE(info);
		else if (ne == columnRsltCal_dt04) doRsltCal_dt04_NE(info);
		else if (ne == columnRsltCal_dt05) doRsltCal_dt05_NE(info);
		else if (ne == columnRsltCal_dt06) doRsltCal_dt06_NE(info);
		else if (ne == columnRsltCal_dt07) doRsltCal_dt07_NE(info);
		else if (ne == columnRsltCal_dt08) doRsltCal_dt08_NE(info);
		else if (ne == columnRsltCal_dt09) doRsltCal_dt09_NE(info);
		else if (ne == columnRsltCal_dt10) doRsltCal_dt10_NE(info);
		else if (ne == columnRsltCal_dt11) doRsltCal_dt11_NE(info);
		else if (ne == columnRsltCal_dt12) doRsltCal_dt12_NE(info);
		else if (ne == columnRsltCal_dt13) doRsltCal_dt13_NE(info);
		else if (ne == columnRsltCal_dt14) doRsltCal_dt14_NE(info);
		else if (ne == columnRsltCal_dt15) doRsltCal_dt15_NE(info);
		else if (ne == columnRsltCal_dt16) doRsltCal_dt16_NE(info);
		else if (ne == columnRsltCal_dt17) doRsltCal_dt17_NE(info);
		else if (ne == columnRsltCal_dt18) doRsltCal_dt18_NE(info);
		else if (ne == columnRsltCal_dt19) doRsltCal_dt19_NE(info);
		else if (ne == columnRsltCal_dt20) doRsltCal_dt20_NE(info);
		else if (ne == columnRsltCal_dt21) doRsltCal_dt21_NE(info);
		else if (ne == columnRsltCal_dt22) doRsltCal_dt22_NE(info);
		else if (ne == columnRsltCal_dt23) doRsltCal_dt23_NE(info);
		else if (ne == columnRsltCal_dt24) doRsltCal_dt24_NE(info);
		else if (ne == columnRsltCal_dt25) doRsltCal_dt25_NE(info);
		else if (ne == columnRsltCal_dt26) doRsltCal_dt26_NE(info);
		else if (ne == columnRsltCal_dt27) doRsltCal_dt27_NE(info);
		else if (ne == columnRsltCal_dt28) doRsltCal_dt28_NE(info);
		else if (ne == columnRsltCal_dt29) doRsltCal_dt29_NE(info);
		else if (ne == columnRsltCal_dt30) doRsltCal_dt30_NE(info);
		else if (ne == columnRsltCal_dt31) doRsltCal_dt31_NE(info);
		else if (ne == RsltDtHdr_cal_cd) doRsltDtHdr_cal_cd_NE(info);
		else if (ne == RsltDtHdr_cal_nm) doRsltDtHdr_cal_nm_NE(info);
		else if (ne == RsltDtHdr_dt) doRsltDtHdr_dt_NE(info);
		else if (ne == RsltDtHdr_day_week_typ_nm) doRsltDtHdr_day_week_typ_nm_NE(info);
		else if (ne == RsltDtHdr_off_flg_disp) doRsltDtHdr_off_flg_disp_NE(info);
		else if (ne == RsltDtHdr_off_flg) doRsltDtHdr_off_flg_NE(info);
		else if (ne == RsltDtHdr_cal_ext_disp) doRsltDtHdr_cal_ext_disp_NE(info);
		else if (ne == RsltDtHdr_cal_ext) doRsltDtHdr_cal_ext_NE(info);
		else if (ne == RsltDtHdr_memo1) doRsltDtHdr_memo1_NE(info);
		else if (ne == RsltDtHdr_memo2) doRsltDtHdr_memo2_NE(info);
		else if (ne == RsltDtHdr_memo3) doRsltDtHdr_memo3_NE(info);
	}

	/**
	 * [RsltCal]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[year]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_year_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_ym_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt01_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt02_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt03_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt04_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt05_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt06_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt07_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt08_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt09_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt10_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt11_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt12_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt13_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt14_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt15_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt16_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt17_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt18_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt19_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt20_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt21_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt22_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt23_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt24_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt25_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt26_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt27_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt28_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt29_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt30_NE(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt31_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_disp_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_disp_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo3_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltCalTable) doRsltCal_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cal_cd) doCnd_cal_cd_NX(info);
		else if (nx == Cnd_cal_nm) doCnd_cal_nm_NX(info);
		else if (nx == Cnd_year) doCnd_year_NX(info);
		else if (nx == columnRsltCal_ym) doRsltCal_ym_NX(info);
		else if (nx == columnRsltCal_dt01) doRsltCal_dt01_NX(info);
		else if (nx == columnRsltCal_dt02) doRsltCal_dt02_NX(info);
		else if (nx == columnRsltCal_dt03) doRsltCal_dt03_NX(info);
		else if (nx == columnRsltCal_dt04) doRsltCal_dt04_NX(info);
		else if (nx == columnRsltCal_dt05) doRsltCal_dt05_NX(info);
		else if (nx == columnRsltCal_dt06) doRsltCal_dt06_NX(info);
		else if (nx == columnRsltCal_dt07) doRsltCal_dt07_NX(info);
		else if (nx == columnRsltCal_dt08) doRsltCal_dt08_NX(info);
		else if (nx == columnRsltCal_dt09) doRsltCal_dt09_NX(info);
		else if (nx == columnRsltCal_dt10) doRsltCal_dt10_NX(info);
		else if (nx == columnRsltCal_dt11) doRsltCal_dt11_NX(info);
		else if (nx == columnRsltCal_dt12) doRsltCal_dt12_NX(info);
		else if (nx == columnRsltCal_dt13) doRsltCal_dt13_NX(info);
		else if (nx == columnRsltCal_dt14) doRsltCal_dt14_NX(info);
		else if (nx == columnRsltCal_dt15) doRsltCal_dt15_NX(info);
		else if (nx == columnRsltCal_dt16) doRsltCal_dt16_NX(info);
		else if (nx == columnRsltCal_dt17) doRsltCal_dt17_NX(info);
		else if (nx == columnRsltCal_dt18) doRsltCal_dt18_NX(info);
		else if (nx == columnRsltCal_dt19) doRsltCal_dt19_NX(info);
		else if (nx == columnRsltCal_dt20) doRsltCal_dt20_NX(info);
		else if (nx == columnRsltCal_dt21) doRsltCal_dt21_NX(info);
		else if (nx == columnRsltCal_dt22) doRsltCal_dt22_NX(info);
		else if (nx == columnRsltCal_dt23) doRsltCal_dt23_NX(info);
		else if (nx == columnRsltCal_dt24) doRsltCal_dt24_NX(info);
		else if (nx == columnRsltCal_dt25) doRsltCal_dt25_NX(info);
		else if (nx == columnRsltCal_dt26) doRsltCal_dt26_NX(info);
		else if (nx == columnRsltCal_dt27) doRsltCal_dt27_NX(info);
		else if (nx == columnRsltCal_dt28) doRsltCal_dt28_NX(info);
		else if (nx == columnRsltCal_dt29) doRsltCal_dt29_NX(info);
		else if (nx == columnRsltCal_dt30) doRsltCal_dt30_NX(info);
		else if (nx == columnRsltCal_dt31) doRsltCal_dt31_NX(info);
		else if (nx == RsltDtHdr_cal_cd) doRsltDtHdr_cal_cd_NX(info);
		else if (nx == RsltDtHdr_cal_nm) doRsltDtHdr_cal_nm_NX(info);
		else if (nx == RsltDtHdr_dt) doRsltDtHdr_dt_NX(info);
		else if (nx == RsltDtHdr_day_week_typ_nm) doRsltDtHdr_day_week_typ_nm_NX(info);
		else if (nx == RsltDtHdr_off_flg_disp) doRsltDtHdr_off_flg_disp_NX(info);
		else if (nx == RsltDtHdr_off_flg) doRsltDtHdr_off_flg_NX(info);
		else if (nx == RsltDtHdr_cal_ext_disp) doRsltDtHdr_cal_ext_disp_NX(info);
		else if (nx == RsltDtHdr_cal_ext) doRsltDtHdr_cal_ext_NX(info);
		else if (nx == RsltDtHdr_memo1) doRsltDtHdr_memo1_NX(info);
		else if (nx == RsltDtHdr_memo2) doRsltDtHdr_memo2_NX(info);
		else if (nx == RsltDtHdr_memo3) doRsltDtHdr_memo3_NX(info);
	}

	/**
	 * [RsltCal]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[year]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_year_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_ym_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt01_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt02_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt03_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt04_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt05_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt06_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt07_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt08_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt09_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt10_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt11_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt12_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt13_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt14_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt15_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt16_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt17_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt18_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt19_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt20_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt21_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt22_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt23_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt24_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt25_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt26_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt27_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt28_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt29_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt30_NX(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt31_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_disp_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[off_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_off_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_disp_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_ext]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_ext_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo3_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_cal_cd) doCnd_cal_cd_LC(info);
		else if (lc == Cnd_cal_nm) doCnd_cal_nm_LC(info);
		else if (lc == Cnd_year) doCnd_year_LC(info);
		else if (lc == columnRsltCal_ym) doRsltCal_ym_LC(info);
		else if (lc == columnRsltCal_dt01) doRsltCal_dt01_LC(info);
		else if (lc == columnRsltCal_dt02) doRsltCal_dt02_LC(info);
		else if (lc == columnRsltCal_dt03) doRsltCal_dt03_LC(info);
		else if (lc == columnRsltCal_dt04) doRsltCal_dt04_LC(info);
		else if (lc == columnRsltCal_dt05) doRsltCal_dt05_LC(info);
		else if (lc == columnRsltCal_dt06) doRsltCal_dt06_LC(info);
		else if (lc == columnRsltCal_dt07) doRsltCal_dt07_LC(info);
		else if (lc == columnRsltCal_dt08) doRsltCal_dt08_LC(info);
		else if (lc == columnRsltCal_dt09) doRsltCal_dt09_LC(info);
		else if (lc == columnRsltCal_dt10) doRsltCal_dt10_LC(info);
		else if (lc == columnRsltCal_dt11) doRsltCal_dt11_LC(info);
		else if (lc == columnRsltCal_dt12) doRsltCal_dt12_LC(info);
		else if (lc == columnRsltCal_dt13) doRsltCal_dt13_LC(info);
		else if (lc == columnRsltCal_dt14) doRsltCal_dt14_LC(info);
		else if (lc == columnRsltCal_dt15) doRsltCal_dt15_LC(info);
		else if (lc == columnRsltCal_dt16) doRsltCal_dt16_LC(info);
		else if (lc == columnRsltCal_dt17) doRsltCal_dt17_LC(info);
		else if (lc == columnRsltCal_dt18) doRsltCal_dt18_LC(info);
		else if (lc == columnRsltCal_dt19) doRsltCal_dt19_LC(info);
		else if (lc == columnRsltCal_dt20) doRsltCal_dt20_LC(info);
		else if (lc == columnRsltCal_dt21) doRsltCal_dt21_LC(info);
		else if (lc == columnRsltCal_dt22) doRsltCal_dt22_LC(info);
		else if (lc == columnRsltCal_dt23) doRsltCal_dt23_LC(info);
		else if (lc == columnRsltCal_dt24) doRsltCal_dt24_LC(info);
		else if (lc == columnRsltCal_dt25) doRsltCal_dt25_LC(info);
		else if (lc == columnRsltCal_dt26) doRsltCal_dt26_LC(info);
		else if (lc == columnRsltCal_dt27) doRsltCal_dt27_LC(info);
		else if (lc == columnRsltCal_dt28) doRsltCal_dt28_LC(info);
		else if (lc == columnRsltCal_dt29) doRsltCal_dt29_LC(info);
		else if (lc == columnRsltCal_dt30) doRsltCal_dt30_LC(info);
		else if (lc == columnRsltCal_dt31) doRsltCal_dt31_LC(info);
		else if (lc == RsltDtHdr_cal_cd) doRsltDtHdr_cal_cd_LC(info);
		else if (lc == RsltDtHdr_cal_nm) doRsltDtHdr_cal_nm_LC(info);
		else if (lc == RsltDtHdr_dt) doRsltDtHdr_dt_LC(info);
		else if (lc == RsltDtHdr_day_week_typ_nm) doRsltDtHdr_day_week_typ_nm_LC(info);
		else if (lc == RsltDtHdr_memo1) doRsltDtHdr_memo1_LC(info);
		else if (lc == RsltDtHdr_memo2) doRsltDtHdr_memo2_LC(info);
		else if (lc == RsltDtHdr_memo3) doRsltDtHdr_memo3_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[year]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_year_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_ym_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt01_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt02_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt03_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt04_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt05_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt06_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt07_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt08_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt09_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt10_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt11_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt12_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt13_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt14_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt15_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt16_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt17_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt18_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt19_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt20_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt21_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt22_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt23_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt24_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt25_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt26_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt27_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt28_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt29_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt30_LC(MCEventInfo info){
	}

	/**
	 * [RsltCal]パネルの[dt31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltCal_dt31_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDtHdr]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDtHdr_memo3_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_cal_cd]の作成メソッド
	 */
	public MCList getCnd_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[RsltDtHdr_cal_cd]の作成メソッド
	 */
	public MCList getRsltDtHdr_cal_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0230.Srch01")) {
			return new MA_MABCL0230_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0230.Upd01")) {
			return new MA_MABCL0230_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0230_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0230_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0230_Srch01Bridge() {
			p_MA_MABCL0230_Srch01 = new MCParam(PDef.MA_MABCL0230_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0230_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0230.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0230.WkCalR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0230.WkCalExtR.class));

			p_MA_MABCL0230_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0230_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0230_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0230_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0230_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0230.CndR up0() {
			return (mcframe.clientMABC.MABCP0230.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0230.WkCalR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0230.WkCalR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0230.WkCalExtR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0230.WkCalExtR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0230_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0230.WkCalR.class));
			p_MA_MABCL0230_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0230.WkCalExtR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0230_Srch01;
		}

		protected void show() {
			setWkCalL((MCList<mcframe.clientMABC.MABCP0230.WkCalR>)p_MA_MABCL0230_Srch01.getContainerParam().getDownBlock(0));
			setWkCalExtL((MCList<mcframe.clientMABC.MABCP0230.WkCalExtR>)p_MA_MABCL0230_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getWkCalL().clear();
			getWkCalExtL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getWkCalL());
			result.add(getWkCalExtL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0230_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0230_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0230_Upd01Bridge() {
			p_MA_MABCL0230_Upd01 = new MCParam(PDef.MA_MABCL0230_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0230_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0230.RegCalExtR.class));
			// Down

			p_MA_MABCL0230_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0230_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0230_Upd01.addUpBlock(getRegCalExtL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0230_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0230_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0230.RegCalExtR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0230.RegCalExtR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0230_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRegCalExtL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}