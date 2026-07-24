package mcframe.clientMAUC.MAUCP0020;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientCore.resource.MCConst;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_AppSys"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_AppSys_MC extends MAUCP_AppSys_MC_A implements MCLogoutListener, MCLoginListener {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static MAUCP_AppSys _appSys = new MAUCP_AppSys();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_AppSys_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 会社情報を取得します。
	 *
	 * @return 会社情報
	 */
	public static CoR getCoNoCache() {

		return _appSys._getCoNoCache();
	}

	/** 会社情報の格納用フィールド */
//	protected CoR _coR;

	/**
	 * 会社情報を取得します。
	 *
	 * @return 会社情報
	 */
	protected CoR _getCoNoCache() {

		CoR coR = CoR.create();

		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch01_INFO);
		p.addDownBlock(coR);
		_createCaller(p, null).exec();

		return coR;
	}

	/**
	 * 基準通貨情報を取得します。
	 *
	 * @return 基準通貨情報
	 */
	public static BaseCurR getBaseCurNoCache() {

		return _appSys._getBaseCurNoCache();
	}

	/**
	 * 基準通貨情報を取得します。
	 *
	 * @return 基準通貨情報
	 */
	protected BaseCurR _getBaseCurNoCache() {

		BaseCurR baseCurR = BaseCurR.create();

		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch04_INFO);
		p.addDownBlock(baseCurR);
		_createCaller(p, null).exec();

		return baseCurR;
	}

	/**
	 * 日付に対応する計上月度を取得する
	 * @param base_dt 日付(YMD)
	 * @param ac_cl_day 会計締日
	 * @param ac_cl_mon_base 会計月度基準
	 * @return 計上月度(YM)
	 */
	public static MCDate getAcYm(MCDate base_dt, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {
		return _appSys._getAcYm(base_dt, ac_cl_day, ac_cl_mon_base);
	}
	 
	/**
	 * 日付に対応する計上月度を取得する（内部処理用）
	 * @param base_dt 日付(YMD)
	 * @return 計上月度(YM)
	 */
	protected static MCDate getAcYm(MCDate base_dt) {
		CoR dbc = getCoNoCache();
		return _appSys._getAcYm(base_dt, dbc.ac_cl_day(), dbc.ac_cl_mon_base());
	}

	protected MCDate _getAcYm(MCDate base_dt, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {

		if (isNull(base_dt)) {
			return null;
		}
		MCDate tmpym;
		if (ac_cl_day.lt(base_dt.getDay())) {
			tmpym = base_dt.trunc(MCDateFieldType.MONTH).addMonth(1);
		}
		else {
			tmpym = base_dt.trunc(MCDateFieldType.MONTH);
		}
		MCDate acYm = tmpym.addMonth(ac_cl_mon_base);
		
		return acYm;
	}

	/**
	 * システムパラメータを取得します。
	 * 
	 * @return システムパラメータ
	 */
	public static MCList<SysParmR> getSysParmAllNoCache() {
		MCList<SysParmR> sysParamL = _appSys._getSysParmAllNoCache();
		for (SysParmR r : sysParamL) {
			if (isSame(r.parm_key(), "ITM_SUB_TYP") || isSame(r.parm_key(), "SNO_TYP")) {
				try {
					Integer.parseInt(r.parm_val());
				}
				catch (NumberFormatException e) {
					r.parm_val("0");
				}
			}
		}
		return sysParamL;
	}
	
	/**
	 * システムパラメータを取得します。
	 * 
	 * @return システムパラメータ
	 */
	protected MCList<SysParmR> _getSysParmAllNoCache() {

		MCList<SysParmR> sysParmL = MCList.create(SysParmR.class);

		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch02_INFO);
		p.addDownBlock(sysParmL);
		_createCaller(p, null).exec();

		return sysParmL;
	}

	/**
	 * システムパラメータ（ITM_SUB_TYP）を返します。
	 * 
	 * @param panel 画面
	 * @return システムパラメータ（ITM_SUB_TYP）
	 */
	public static int getItmSubTyp(IfMAUDP_PanelBase panel) {
		return _appSys._getItmSubTyp(panel);
	}
	
	protected int _getItmSubTyp(IfMAUDP_PanelBase panel) {
		String param = panel.getSysParm("ITM_SUB_TYP");
		if (!isNull(param) && isIntStr(param)) {
			int result = Integer.parseInt(param);
			if (result >= 1 && result <= 3) {
				return result;
			}
		}
		return 0;
	}

	/**
	 * システムパラメータ（SNO_TYP）を返します。
	 * 
	 * @param panel 画面
	 * @return システムパラメータ（SNO_TYP）
	 */
	public static int getSnoTyp(IfMAUDP_PanelBase panel) {
		return _appSys._getSnoTyp(panel);
	}

	protected int _getSnoTyp(IfMAUDP_PanelBase panel) {
		String param = panel.getSysParm("SNO_TYP");
		if (!isNull(param) && isIntStr(param)) {
			int result = Integer.parseInt(param);
			if (result >= 1 && result <= 4) {
				return result;
			}
		}
		return 0;
	}

	/**
	 * システムパラメータ（DEST_TYP）を返します。
	 * 
	 * @param panel 画面
	 * @return システムパラメータ（DEST_TYP）
	 */
	public static int getDestTyp(IfMAUDP_PanelBase panel) {
		return _appSys._getDestTyp(panel);
	}

	protected int _getDestTyp(IfMAUDP_PanelBase panel) {
		String param = panel.getSysParm("DEST_TYP");
		if (!isNull(param) && isIntStr(param)) {
			int result = Integer.parseInt(param);
			if (result >= 1 && result <= 3) {
				return result;
			}
		}
		return 0;
	}
	/**
	 *  システムパラメータ（DEST_TYP）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isDestEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isDestEnabled(panel);
	}
	protected boolean _isDestEnabled(IfMAUDP_PanelBase panel) {
		int result = _getDestTyp(panel);
		if (result >= 1 && result <= 3) {
			return true;
		}
		return false;
	}
	/**
	 * システムパラメータ（MAKER_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isMakerEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isMakerEnabled(panel);
	}
	protected boolean _isMakerEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "MAKER_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（CRED_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isCredEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isCredEnabled(panel);
	}
	protected boolean _isCredEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "CRED_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（PTAX_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isPtaxEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isPtaxEnabled(panel);
	}
	protected boolean _isPtaxEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "PTAX_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（STR_LN_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isStrLnEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isStrLnEnabled(panel);
	}
	protected boolean _isStrLnEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "STR_LN_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（TM_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isTmEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isTmEnabled(panel);
	}
	protected boolean _isTmEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "TM_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（WRK_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isWrkEnabled(IfMAUDP_PanelBase panel) {
		return _appSys._isWrkEnabled(panel);
	}
	protected boolean _isWrkEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "WRK_ENABLE_FLG");
	}
	/**
	 * システムパラメータ（WTAX_ENABLE_FLG）が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isWtaxEnabled(IfMAUDP_PanelBase panel) {
		return  _appSys._isWtaxEnabled(panel);
	}
	protected boolean _isWtaxEnabled(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "WTAX_ENABLE_FLG");
	}
	/**
	 * システムパラメータ(BASE_UNIT_FLG)が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isBaseUnitFlg(IfMAUDP_PanelBase panel) {
		return  _appSys._isBaseUnitFlg(panel);
	}
	
	protected boolean _isBaseUnitFlg(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "BASE_UNIT_FLG");
	}
	/**
	 * システムパラメータ(BASE_CUR_FLG)が有効か判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean isBaseCurFlg(IfMAUDP_PanelBase panel) {
		return  _appSys._isBaseCurFlg(panel);
	}
	
	protected boolean _isBaseCurFlg(IfMAUDP_PanelBase panel) {
		return isSysParamEnabled(panel, "BASE_CUR_FLG");
	}
	/**
	 * システムパラメータが有効か判定します。
	 * @param panel 画面
	 * @param paramKey システムパラメータ
	 * @return 判定結果
	 */
	protected boolean isSysParamEnabled(IfMAUDP_PanelBase panel, String paramKey) {
		String param = panel.getSysParm(paramKey);
		if (!isNull(param) && isIntStr(param)) {
			int result = Integer.parseInt(param);
			if (result == 1) {
				return true;
			}
		}
		return false;
	}
	/**
	 * システムパラメータ（DEF_WG_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasWgDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasWgDefCd(panel);
	}
	protected boolean _hasWgDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_WG_CD");
	}
	/**
	 * システムパラメータ（DEF_SITE_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasSiteDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasSiteDefCd(panel);
	}
	protected boolean _hasSiteDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_SITE_CD");
	}
	/**
	 * システムパラメータ（DEF_LG_GRP_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasLgGrpDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasLgGrpDefCd(panel);
	}
	protected boolean _hasLgGrpDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_LG_GRP_CD");
	}
	/**
	 * システムパラメータ（DEF_ALLOC_GRP_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasAllocGrpDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasAllocGrpDefCd(panel);
	}
	protected boolean _hasAllocGrpDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_ALLOC_GRP_CD");
	}
	/**
	 * システムパラメータ（DEF_LOC_GRP_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasLocGrpDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasLocGrpDefCd(panel);
	}
	protected boolean _hasLocGrpDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_LOC_GRP_CD");
	}
	/**
	 * システムパラメータ（DEF_STK_GD_CD）に初期値が設定されているか判定します。
	 * @param panel 画面
	 * @return 判定結果
	 */
	public static boolean hasStkGdDefCd(IfMAUDP_PanelBase panel) {
		return _appSys._hasStkGdDefCd(panel);
	}
	protected boolean _hasStkGdDefCd(IfMAUDP_PanelBase panel) {
		return hasSysParamDefaultCode(panel, "DEF_STK_GD_CD");
	}
	/**
	 * システムパラメータに初期値が設定されているか判定します。
	 * @param panel 画面
	 * @param paramKey システムパラメータ
	 * @return 判定結果
	 */
	protected boolean hasSysParamDefaultCode(IfMAUDP_PanelBase panel, String paramKey) {
		String param = panel.getSysParm(paramKey);
		if (!isNull(param)) {
			return true;
		}
		return false;
	}
	/**
	 * システムパラメータ（ADDR_TYP）を返します。
	 * 
	 * @param panel 画面
	 * @return システムパラメータ（ADDR_TYP）
	 */
	public static int getAddrTyp(IfMAUDP_PanelBase panel) {
		return _appSys._getAddrTyp(panel);
	}

	protected int _getAddrTyp(IfMAUDP_PanelBase panel) {
		String param = panel.getSysParm("ADDR_TYP");
		if (!isNull(param) && isIntStr(param)) {
			int result = Integer.parseInt(param);
			if (result >= 1 && result <= 3) {
				return result;
			}
		}
		return 99;
	}
	protected boolean isIntStr(String param) {
		try {
			Integer.parseInt(param);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	// ログインリスナ（ここから）
	@Override
	public void doNLIEvent(MCAuthEvent event) {
		clearAll();
	}
	// ログインリスナ（ここまで）

	// ログアウトリスナ（ここから）
	public void doNLOEvent(MCAuthEvent event) {
		clearAll();
	}

	@Override
	public boolean doVLOEvent(MCAuthEvent event) {
		return true;
	}
	// ログアウトリスナ（ここまで）

	/**
	 * キャッシュされている情報をクリアします。
	 *
	 */
	public static void clearAll() {
		_appSys._clearCache();
	}

	protected void _clearCache() {
		_setTerm((FXBAP_PanelBase)null, (MCDate)null);
		_setCostAmtDispDigit(null);
		_setCostUnitDispDigit(null);
		_setCostStdDispDigit(null);
		_setCostRateDispDigit(null);
		_setExcelPlnFlg(null);
		_setExcelActFlg(null);
		_setExcelAlcFlg(null);
		_systemDefaultTermInfo = null;
	}

	/**
	 * サーバ通信用のCallerを返します。
	 *
	 * @param p MCParam
	 * @param panel パネル
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p,
			MCRootPanel panel) {

		return new MAUDP_CallerNoPanel(p);

	}


	// ///////////////////////////////////////////////
	// 対象期間マスタ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 対象期間マスタ情報を返します。
	 * @return 対象期間マスタ情報（全て）
	 */
	public static MCList<TermR> getTermListNoCache() {
		return _appSys._getTermListNoCache();
	}

	/**
	 * 対象期間マスタ情報を返します。
	 * @return 対象期間マスタ情報（全て）
	 * {@link TermR#$term} の昇順にソートされています。
	 */
	protected MCList<TermR> _getTermListNoCache() {
		
		MCList<TermR> termList;
		
		termList = MCList.create(TermR.class);
		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch03_INFO);
		p.addDownBlock(termList);
		_createCaller(p, null).exec();

		MCRowComparator.ASC<TermR> rc;
		rc = new MCRowComparator.ASC<TermR>(TermR.$term);
		termList.sort(rc);

		return termList;
	}

	/**
	 * 期に対応する情報を返します。
	 *
	 * @param panel 画面
	 * @param term 期
	 * @return 期の情報
	 */
	public static TermR getTermInfo(FXBAP_PanelBase panel, MCDate term) {
		return _appSys._getTermInfo(panel, term);
	}

	/**
	 * 期に対応する情報を返します。
	 *
	 * @param panel 画面
	 * @param term 期
	 * @return 期の情報
	 */
	protected TermR _getTermInfo(FXBAP_PanelBase panel, MCDate term) {
		if(term == null ){
			return null;
		}
		for (TermR t : getTermList(panel)) {
			if (isSame(t.term(), term)) {
				return t;
			}
		}
		return null;
	}

	/**
	 * 対象の年月が所属する期情報を返します。
	 */
	public static TermR getTermInfoYM(FXBAP_PanelBase panel, MCDate ym) {
		return _appSys._getTermInfoYM(ym, 0, getTermList(panel));
	}

	/**
	 * 対象の日付が所属する期情報を返します。
	 * @param panel 画面
	 * @param ymd 対象の日付
	 * @return 期情報
	 * 
	 */
	 public static TermR getTermInfoYMD(FXBAP_PanelBase panel, MCDate ymd) {
		return _appSys._getTermInfoYM(getAcYm(ymd), 0, getTermList(panel));
	}

	/**
	 * 対象の年月が所属する対象期間の次の期間を返す
	 * 
	 * @param ym 対象の年月
	 * @return 対象期間
	 */
	public static TermR getNextTermInfoYM(FXBAP_PanelBase panel, MCDate ym) {
		return _appSys._getTermInfoYM(ym, 1, getTermList(panel));
	}

	/**
	 * 対象の年月が所属する対象期間の前の期間を返す
	 * 
	 * @param ym 対象の年月
	 * @return 対象期間
	 */
	public static TermR getPrevTermInfoYM(FXBAP_PanelBase panel, MCDate ym) {
		return _appSys._getTermInfoYM(ym, -1, getTermList(panel));
	}

	protected static MCList<TermR> getTermList(FXBAP_PanelBase panel) {
		MCList<TermR> l;
		if (panel instanceof MAUDP_PanelBase) {
			l = ((MAUDP_PanelBase) panel).getTermList();
		}
		else {
			l = getTermListNoCache();
		}
		return l;
	}

	/**
	 * 対象の日付が所属する期情報を返します。
	 * <P>
	 * 期間の調整数（diff）分、進めた（戻した）期の情報を返します。<br>
	 * diff > 0 期を進めます。（diff=1の場合、次の期を返します）<br>
	 * diff < 0 期を戻します。（diff=-1の場合、前の期を返します）<br>
	 * @param ym 対象の日付
	 * @param diff 期間の調整数
	 * @return 期情報
	 */
	protected TermR _getTermInfoYM(MCDate ym, int diff, MCList<TermR> termList) {
		if (ym == null) {
			return null;
		}

		MCList<TermR> tList = termList;
		MCRowComparator.ASC<TermR> rc;
		rc = new MCRowComparator.ASC<TermR>(TermR.$term);
		tList.sort(rc);
		
		int rowIndex;
		for (rowIndex = 0; rowIndex < tList.size(); rowIndex++) {
			TermR currentTerm = tList.get(rowIndex);
			if (ym.gte(currentTerm.term())
					&& ym.lt(currentTerm.term_end_ym())) {
				break;
			}
		}
		int ansIndex = rowIndex + diff;
		if (ansIndex < 0 || ansIndex >= tList.size()) {
			return null;
		}
		return tList.get(ansIndex);
	}

	/**
	 * オペレータが設定した値
	 */
	protected MCDate _userTermStYm;

	/**
	 * システムのデフォルトの値
	 */
	protected TermR _systemDefaultTermInfo;

	/**
	 * システムデフォルトの現在の対象期を取得します。
	 * <P>
	 * 運用日付の会計月度が所属する期
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期情報
	 */
	protected static TermR getSystemDefaultTermInfo(FXBAP_PanelBase panel) {
		// ニーズが微妙なので実装だけしておくが
		// public にしていない。publicにする必要があれば変更可
		return _appSys._getSystemDefaultTermInfo(panel);
	}

	/**
	 * システムデフォルトの現在の対象期を取得します。
	 * <P>
	 * 運用日付の会計月度が所属する期
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期情報
	 */
	protected TermR _getSystemDefaultTermInfo(FXBAP_PanelBase panel) {
		if(_systemDefaultTermInfo == null ){
			_systemDefaultTermInfo = getTermInfoYMD(panel, panel.getToday());
		}
		return _systemDefaultTermInfo;
	}

	/**
	 * 現在の対象期を設定します。
	 *
	 * @param panel 画面
	 * @param term 現在の対象期
	 */
	public static void setTerm(FXBAP_PanelBase panel, MCDate term){
		_appSys._setTerm(panel, term);
	}

	/**
	 * 現在の対象期を変更します。
	 *
	 * @param panel 画面
	 * @param term 期
	 */
	protected void _setTerm(FXBAP_PanelBase panel, MCDate term) {
		if (term == null) {
			_userTermStYm = null;
			return;
		}
		TermR r = _getTermInfo(panel, term);
		if (r == null) {
			throw new MCAppException(MAUCP0001, toYMString(term));
		}
		_userTermStYm = term;
	}

	/**
	 * 現在の対象期を返します。
	 * <P>
	 * 以下の優先順で設定されている期を返します。<br>
	 * 1){@link #setTerm(MCDate)}で設定されている期。<br>
	 * 2)システムデフォルト（ {@link #getSystemDefaultTermInfo(FXBAP_PanelBase)} ）の期。<br>
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期
	 */
	public static MCDate getTerm(FXBAP_PanelBase panel) {
		return _appSys._getTerm(panel);
	}

	/**
	 * 現在の対象期を返します。
	 * <P>
	 * 以下の優先順で設定されている期を返します。<br>
	 * 1){@link #setTerm(MCDate)}で設定されている期。<br>
	 * 2)システムデフォルト（ {@link #getSystemDefaultTermInfo(FXBAP_PanelBase)} ）の期。<br>
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期
	 */
	protected MCDate _getTerm(FXBAP_PanelBase panel) {
		TermR term = _getTermInfo(panel);
		if(term == null ){
			return null;
		}
		return term.term();
	}

	/**
	 * 現在の対象期の情報を返します。
	 * <P>
	 * 以下の優先順で設定されている期を返します。<br>
	 * 1){@link #setTerm(MCDate)}で設定されている期。<br>
	 * 2)システムデフォルト（ {@link #getSystemDefaultTermInfo(FXBAP_PanelBase)} ）の期。<br>
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期情報
	 */
	public static TermR getTermInfo(FXBAP_PanelBase panel) {
		return _appSys._getTermInfo(panel);
	}

	/**
	 * 現在の対象期の情報を返します。
	 * <P>
	 * 以下の優先順で設定されている期を返します。<br>
	 * 1){@link #setTerm(MCDate)}で設定されている期。<br>
	 * 2)システムデフォルト（ {@link #getSystemDefaultTermInfo(FXBAP_PanelBase)} ）の期。<br>
	 * </P>
	 * 
	 * @param panel 画面
	 * @return 期情報
	 */
	protected TermR _getTermInfo(FXBAP_PanelBase panel) {
		TermR t = _getTermInfo(panel, _userTermStYm);
		if (t != null) {
			return t;
		}
		return _getSystemDefaultTermInfo(panel);
	}
	// ///////////////////////////////////////////////
	// 対象期間マスタ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 納税通貨関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 納税通貨情報を取得します。
	 *
	 * @return 納税通貨情報
	 */
	public static PtaxCurR getPtaxCurNoCache() {
		return _appSys._getPtaxCurNoCache();
	}

	/**
	 * 納税通貨情報を取得します。
	 *
	 * @return 納税通貨情報
	 */
	protected PtaxCurR _getPtaxCurNoCache() {

		PtaxCurR ptaxCurR = PtaxCurR.create();
		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch05_INFO);
		p.addDownBlock(ptaxCurR);
		_createCaller(p, null).exec();
		
		return ptaxCurR;
	}
	// ///////////////////////////////////////////////
	// 納税通貨関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// デフォルト格付関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * デフォルト格付情報を取得します。
	 *
	 * @return デフォルト格付情報
	 */
	public static GdR getDefaultFeedStkGdNoCache() {
		return _appSys._getDefaultFeedStkGdNoCache();
	}

	/**
	 * デフォルト格付情報を取得します。
	 *
	 * @return デフォルト格付情報
	 */
	protected GdR _getDefaultFeedStkGdNoCache() {

		GdR gdR = GdR.create();
		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch06_INFO);
		p.addDownBlock(gdR);
		_createCaller(p, null).exec();

		return gdR;
	}
	// ///////////////////////////////////////////////
	// デフォルト格付関連（ここまで）
	// ///////////////////////////////////////////////
	
	// ///////////////////////////////////////////////
	// ライセンス関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ライセンス情報を取得します。
	 *
	 * @return ライセンス情報
	 */
	public static LicenceR getLicenceInfoNoCache() {
		return _appSys._getLicenceInfoNoCache();
	}

	/**
	 * ライセンス情報を取得します。
	 *
	 * @return ライセンス情報
	 */
	protected LicenceR _getLicenceInfoNoCache() {

		LicenceR licenceR = LicenceR.create();
		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch07_INFO);
		p.addDownBlock(licenceR);
		_createCaller(p, null).exec();

		return licenceR;
	}
	// ///////////////////////////////////////////////
	// ライセンス関連（ここまで）
	// ///////////////////////////////////////////////
	
	// ///////////////////////////////////////////////
	// マスタ参照用データベースリンク情報関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * マスタ参照用データベースリンク情報を取得します。
	 *
	 * @return マスタ参照用データベースリンク情報
	 */
	public static DblinkR getMstDblinkNoCache() {
		return _appSys._getMstDblinkNoCache();
	}

	/**
	 * ライセンス情報を取得します。
	 *
	 * @return マスタ参照用データベースリンク情報
	 */
	protected DblinkR _getMstDblinkNoCache() {
		DblinkR r = DblinkR.create();
		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch08_INFO);
		p.addDownBlock(r);
		_createCaller(p, null).exec();
		return r;
	}
	// ///////////////////////////////////////////////
	// マスタ参照用データベースリンク情報関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 年月ラベル関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 年月データからテーブルカラムのラベル名を取得します。
	 * 下記優先順位で、取得します。
	 * <ul>
	 * <li> [panel]のモジュールＩＤ.[panel]の画面ＩＤ.[keys] </li>
	 * <li> [panel]の継承関係の上位のモジュールＩＤ.[panel]の継承関係の上位の画面ＩＤ.[keys]</li>
	 * <li> [panel]のモジュールＩＤ.[keys]</li>
	 * </ul>
	 * [keys]は、「ym_header.label」を表します。<br>
	 * リソース値に、「Y2M」が指定された場合、toY2MString(date)を返します。
	 * それ以外は、toYMString(date)を返します。
	 * 
	 * @param panel 画面
	 * @param date 年月データ
	 */
	public static String toYMHeaderLabel(MAUDP_PanelBase panel, MCDate date) {
		return _appSys._toYMHeaderLabel(panel, date);
	}

	/**
	 * 年月データからテーブルカラムのラベル名を取得します。
	 */
	protected String _toYMHeaderLabel(MAUDP_PanelBase panel, MCDate date) {
		String key = MCConst.createKey("ym_header", "label");

		String format = panel.getPgmSettingStringNE(panel, null, key);
		if (format == null) {
			format = MCConst.app.getString(MCConst.createKey(panel.getModuleID(), key));
		}

		if (isSame(format, "Y2M")) {
			return toY2MString(date);
		}
		else {
			return toYMString(date);
		}
	}

	/**
	 * 年月データからテーブルカラムのメッセージ用名称を取得します。
	 * 下記優先順位で、取得します。
	 * <ul>
	 * <li> [panel]のモジュールＩＤ.[panel]の画面ＩＤ.[keys] </li>
	 * <li> [panel]の継承関係の上位のモジュールＩＤ.[panel]の継承関係の上位の画面ＩＤ.[keys]</li>
	 * <li> [panel]のモジュールＩＤ.[keys]</li>
	 * </ul>
	 * [keys]は、「ym_header.message」を表します。<br>
	 * リソースキーが存在しない場合は、 {@link #toYMHeaderLabel(panel, date)} を返します。
	 * リソース値に、「Y2M」が指定された場合、toY2MString(date)を返します。
	 * それ以外は、toYMString(date)を返します。
	 * @param panel 画面
	 * @param date 年月データ
	 */
	public static String toYMHeaderMessage(MAUDP_PanelBase panel, MCDate date) {
		return _appSys._toYMHeaderMessage(panel, date);
	}

	/**
	 * 年月データからテーブルカラムのメッセージ用名称を取得します。
	 */
	protected String _toYMHeaderMessage(MAUDP_PanelBase panel, MCDate date) {
		String key = MCConst.createKey("ym_header", "message");

		String format = panel.getPgmSettingStringNE(panel, null, key);
		if (format == null) {
			format = MCConst.app.getString(MCConst.createKey(panel.getModuleID(), key));
		}

		if (format == null) {
			return _toYMHeaderLabel(panel, date);
		}
		else if (isSame(format, "Y2M")) {
			return toY2MString(date);
		}
		else {
			return toYMString(date);
		}
	}

	// ///////////////////////////////////////////////
	// 年月ラベル関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 原価会社パラメータマスタ関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 原価会社パラメータ情報を取得します。
	 *
	 * @return 原価会社パラメータ情報
	 */
	public static CoParmR getCoParmNoCache() {
		return _appSys._getCoParmNoCache();
	}

	/**
	 * 原価会社パラメータ情報を取得します。
	 *
	 * @return 原価会社パラメータ情報
	 */
	protected CoParmR _getCoParmNoCache() {
		CoParmR coParmR = CoParmR.create();

		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch09_INFO);
		p.addDownBlock(coParmR);
		_createCaller(p, null).exec();

		return coParmR;
	}

	protected CoParmR getCoParm(MAUDP_PanelBase panel) {
		return panel.getCoParm();
	}

	// -----------------------------------------------
	// 原価数値表示桁
	/**
	 * オペレータが設定した 原価金額小数部表示桁
	 */
	protected MCNumber _userCostAmtDispDigit;

	/**
	 * 当該ログイン中、原価会社パラメータの金額小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価金額小数部表示桁
	 */
	public static void setCostAmtDispDigit(MCNumber digit){
		_appSys._setCostAmtDispDigit(digit);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの金額小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価金額小数部表示桁
	 */
	protected void _setCostAmtDispDigit(MCNumber digit){
		_userCostAmtDispDigit = digit;
	}

	/**
	 * 原価金額小数部表示桁を返します。
	 * <P>
	 * {@link #setCostAmtDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価金額小数部表示桁
	 */
	public static int getCostAmtDispDigit(MAUDP_PanelBase panel){
		return _appSys._getCostAmtDispDigit(panel);
	}

	/**
	 * 原価金額小数部表示桁を返します。
	 * <P>
	 * {@link #_setCostAmtDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価金額小数部表示桁
	 */
	protected int _getCostAmtDispDigit(MAUDP_PanelBase panel){
		if(_userCostAmtDispDigit != null) { 
			return _userCostAmtDispDigit.intValueExact();
		}
		return getCoParm(panel).amt_disp_digit().intValueExact();
	}

	/**
	 * オペレータが設定した 原価単価小数部表示桁
	 */
	protected MCNumber _userCostUnitDispDigit;

	/**
	 * 当該ログイン中、原価会社パラメータの単価小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価単価小数部表示桁
	 */
	public static void setCostUnitDispDigit(MCNumber digit){
		_appSys._setCostUnitDispDigit(digit);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの単価小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価単価小数部表示桁
	 */
	protected void _setCostUnitDispDigit(MCNumber digit){
		_userCostUnitDispDigit = digit;
	}

	/**
	 * 原価単価小数部表示桁を返します。
	 * <P>
	 * {@link #setCostUnitDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価単価小数部表示桁
	 */
	public static int getCostUnitDispDigit(MAUDP_PanelBase panel){
		return _appSys._getCostUnitDispDigit(panel);
	}

	/**
	 * 原価単価小数部表示桁を返します。
	 * <P>
	 * {@link #_setCostUnitDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価単価小数部表示桁
	 */
	protected int _getCostUnitDispDigit(MAUDP_PanelBase panel){
		if(_userCostUnitDispDigit != null) { 
			return _userCostUnitDispDigit.intValueExact();
		}
		return getCoParm(panel).unit_disp_digit().intValueExact();
	}

	/**
	 * オペレータが設定した 原価標準小数部表示桁
	 */
	protected MCNumber _userCostStdDispDigit;

	/**
	 * 当該ログイン中、原価会社パラメータの標準小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価標準小数部表示桁
	 */
	public static void setCostStdDispDigit(MCNumber digit){
		_appSys._setCostStdDispDigit(digit);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの標準小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価標準小数部表示桁
	 */
	protected void _setCostStdDispDigit(MCNumber digit){
		_userCostStdDispDigit = digit;
	}

	/**
	 * 原価標準小数部表示桁を返します。
	 * <P>
	 * {@link #setCostStdDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価標準小数部表示桁
	 */
	public static int getCostStdDispDigit(MAUDP_PanelBase panel){
		return _appSys._getCostStdDispDigit(panel);
	}

	/**
	 * 原価標準小数部表示桁を返します。
	 * <P>
	 * {@link #_setCostStdDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * </P>
	 * @return 原価標準小数部表示桁
	 */
	protected int _getCostStdDispDigit(MAUDP_PanelBase panel){
		if(_userCostStdDispDigit != null) { 
			return _userCostStdDispDigit.intValueExact();
		}
		return getCoParm(panel).std_disp_digit().intValueExact();
	}

	/**
	 * オペレータが設定した 原価比率小数部表示桁
	 */
	protected MCNumber _userCostRateDispDigit;

	/**
	 * 当該ログイン中、原価会社パラメータの比率小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価比率小数部表示桁
	 */
	public static void setCostRateDispDigit(MCNumber digit){
		_appSys._setCostRateDispDigit(digit);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの比率小数部表示桁を当該ログイン中変更
	 * したい場合に使用する。
	 * <p>
	 * 引数にnullをセットするとデフォルト値（原価会社パラメータマスタの値）
	 * が採用されるようになる。
	 * </p>
	 * @param digit 原価比率小数部表示桁
	 */
	protected void _setCostRateDispDigit(MCNumber digit){
		_userCostRateDispDigit = digit;
	}

	/**
	 * 原価比率小数部表示桁を返します。
	 * <P>
	 * {@link #setCostRateDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * 原価会社パラメータマスタもnullのときは2を返す
	 * </P>
	 * @return 原価比率小数部表示桁
	 */
	public static int getCostRateDispDigit(MAUDP_PanelBase panel){
		return _appSys._getCostRateDispDigit(panel);
	}

	/**
	 * 原価比率小数部表示桁を返します。
	 * <P>
	 * {@link #_setCostRateDispDigit(MCNumber)}でnull以外の値がセットされている
	 * 場合はその値を返す。
	 * それ以外は、原価会社パラメータマスタの値を返す
	 * 原価会社パラメータマスタもnullのときは2を返す
	 * </P>
	 * @return 原価比率小数部表示桁
	 */
	protected int _getCostRateDispDigit(MAUDP_PanelBase panel){
		if(_userCostRateDispDigit != null) { 
			return _userCostRateDispDigit.intValueExact();
		}
		MCNumber digit = getCoParm(panel).rate_disp_digit();
		if(digit != null) {
			return digit.intValueExact();
		}
		return _getRateViewScale();
	}

	/**
	 * 有効桁数が変更可能な比率（％）表示する際の小数点以下の桁数。
	 * 
	 * @return 比率（％）表示する際の小数点以下の桁数
	 */
	protected int _getRateViewScale() {
		return 2;
	}

	/**
	 * 有効桁数が変更可能な比率（％）を計算する際の小数点以下の桁数。
	 * 
	 * @see {@link #getRateViewScale()}
	 * @return 比率（％）計算する際の小数点以下の桁数
	 */
	public static int getRateDivScale(){
		return _appSys._getRateDivScale();
	}

	/**
	 * 有効桁数が変更可能な比率（％）を計算する際の小数点以下の桁数。
	 * 
	 * @return 比率（％）計算する際の小数点以下の桁数
	 */
	protected int _getRateDivScale(){
		return 8;
	}

	// -----------------------------------------------
	// 原価計画・実績・配賦データExcel入出力ＦＬＧ
	/**
	 * オペレータが設定した 計画データをExcelで入出力するＦＬＧ
	 */
	protected Boolean _excelPlnFlg;

	/**
	 * 当該ログイン中、原価会社パラメータの計画データをExcelで入出力するＦＬＧを変更
	 * したい場合に使用します。
	 * @param excelPlnFlg 計画データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelPlnFlg(boolean excelPlnFlg) {
		_appSys._setExcelPlnFlg(excelPlnFlg);
	}

	protected void _setExcelPlnFlg(boolean excelPlnFlg) {
		_excelPlnFlg = Boolean.valueOf(excelPlnFlg);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの計画データをExcelで入出力するＦＬＧを
	 * <tt>null</tt>に設定したい場合に使用します。<tt>null</tt>に設定して{@link #getExcelPlnFlg()}
	 * を実行すると原価会社パラメータマスタの<tt>excelPlnFlg</tt>の値が返ります。<BR>
	 * <tt>null</tt>以外の値(<tt>true</tt>か<tt>false</tt>)をセットする場合は
	 * {@link #setExcelPlnFlg(boolean excelPlnFlg)}の使用を推奨します。
	 * @param excelPlnFlg 計画データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelPlnFlg(Boolean excelPlnFlg) {
		_appSys._setExcelPlnFlg(excelPlnFlg);
	}

	protected void _setExcelPlnFlg(Boolean excelPlnFlg) {
		_excelPlnFlg = excelPlnFlg;
	}


	/**
	 * 当該ログインで有効な計画データをExcelで入出力するＦＬＧを返します。<BR>
	 * キャッシュしている値がある場合はその値を返します。キャッシュしている値が無い場合は
	 * 原価会社パラメータマスタから<tt>excelPlnFlg</tt>を取得してその値を返します。
	 * @return 計画データをExcelで入出力するＦＬＧ
	 */
	public static boolean getExcelPlnFlg(MAUDP_PanelBase panel) {
		return _appSys._getExcelPlnFlg(panel);
	}

	protected boolean _getExcelPlnFlg(MAUDP_PanelBase panel) {
		if (_excelPlnFlg != null) {
			return _excelPlnFlg.booleanValue();
		}
		return getCoParm(panel).excel_pln_flg();
	}

	/**
	 * オペレータが設定した実績データをExcelで入出力するＦＬＧ
	 */
	protected Boolean _excelActFlg;

	/**
	 * 当該ログイン中、原価会社パラメータの実績データをExcelで入出力するＦＬＧを変更
	 * したい場合に使用します。
	 * @param excelActFlg 実績データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelActFlg(boolean excelActFlg) {
		_appSys._setExcelActFlg(excelActFlg);
	}

	protected void _setExcelActFlg(boolean excelActFlg) {
		_excelActFlg = Boolean.valueOf(excelActFlg);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの実績データをExcelで入出力するＦＬＧを当該ログイン中
	 * <tt>null</tt>に設定したい場合に使用します。<tt>null</tt>に設定して{@link #getExcelActFlg()}
	 * を実行すると原価会社パラメータマスタの<tt>excel_act_flg</tt>の値が返ります。<BR>
	 * <tt>null</tt>以外の値(<tt>true</tt>か<tt>false</tt>)をセットする場合は
	 * {@link #setExcelActFlg(boolean excelActFlg)}の使用を推奨します。
	 * @param excelActFlg 実績データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelActFlg(Boolean excelActFlg) {
		_appSys._setExcelActFlg(excelActFlg);
	}

	protected void _setExcelActFlg(Boolean excelActFlg) {
		_excelActFlg = excelActFlg;
	}


	/**
	 * 当該ログインで有効な実績データをExcelで入出力するＦＬＧを返します。<BR>
	 * キャッシュしている値がある場合はその値を返します。キャッシュしている値が無い場合は
	 * 原価会社パラメータマスタから<tt>excelActFlg</tt>を取得してその値を返します。
	 * @return 実績データをExcelで入出力するＦＬＧ
	 */
	public static boolean getExcelActFlg(MAUDP_PanelBase panel) {
		return _appSys._getExcelActFlg(panel);
	}

	protected boolean _getExcelActFlg(MAUDP_PanelBase panel) {
		if (_excelActFlg != null) {
			return _excelActFlg.booleanValue();
		}
		return getCoParm(panel).excel_act_flg();
	}

	/**
	 * オペレータが設定した 配賦データをExcelで入出力するＦＬＧ
	 */
	protected Boolean _excelAlcFlg;


	/**
	 * 当該ログイン中、原価会社パラメータの配賦データをExcelで入出力するＦＬＧを変更
	 * したい場合に使用する。
	 * @param excelAlcFlg 配賦データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelAlcFlg(boolean excelAlcFlg) {
		_appSys._setExcelAlcFlg(excelAlcFlg);
	}

	protected void _setExcelAlcFlg(boolean excelAlcFlg) {
		_excelAlcFlg = Boolean.valueOf(excelAlcFlg);
	}

	/**
	 * 当該ログイン中、原価会社パラメータの配賦データをExcelで入出力するＦＬＧを
	 * <tt>null</tt>に設定したい場合に使用します。<tt>null</tt>に設定して{@link #getExcelAlcFlg()}
	 * を実行すると原価会社パラメータマスタの<tt>excel_alc_flg</tt>の値が返ります。<BR>
	 * <tt>null</tt>以外の値(<tt>true</tt>か<tt>false</tt>)をセットする場合は
	 * {@link #setExcelAlcFlg(boolean excelAlcFlg)}の使用を推奨します。
	 * @param excelAlcFlg 配賦データをExcelで入出力するＦＬＧ
	 */
	public static void setExcelAlcFlg(Boolean excelAlcFlg) {
		_appSys._setExcelAlcFlg(excelAlcFlg);
	}

	protected void _setExcelAlcFlg(Boolean excelAlcFlg) {
		_excelAlcFlg = excelAlcFlg;
	}

	/**
	 * 当該ログインで有効な配賦データをExcelで入出力するＦＬＧを返します。<BR>
	 * キャッシュしている値がある場合はその値を返します。キャッシュしている値が無い場合は
	 * 原価会社パラメータマスタから<tt>excelAlcFlg</tt>を取得してその値を返します。
	 * @return 配賦データをExcelで入出力するＦＬＧ
	 */
	public static boolean getExcelAlcFlg(MAUDP_PanelBase panel) {
		return _appSys._getExcelAlcFlg(panel);
	}
	
	protected boolean _getExcelAlcFlg(MAUDP_PanelBase panel) {
		if (_excelAlcFlg != null) {
			return _excelAlcFlg.booleanValue();
		}
		return getCoParm(panel).excel_alc_flg();
	}
	// ///////////////////////////////////////////////
	// 原価会社パラメータマスタ関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 担当者権限マスタ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 担当者権限情報を取得します。
	 *
	 * @return 担当者権限情報
	 */
	public static UsrAclR getUsrAclNoCache() {

		return _appSys._getUsrAclNoCache();
	}

	/**
	 * 担当者権限情報を取得します。
	 *
	 * @return 担当者権限情報
	 */
	protected UsrAclR _getUsrAclNoCache() {

		UsrAclR usrAclR = UsrAclR.create();

		MCParam p = new MCParam(PDef.MA_MAUCL0020_Srch10_INFO);
		p.addDownBlock(usrAclR);
		_createCaller(p, null).exec();

		return usrAclR;
	}

}