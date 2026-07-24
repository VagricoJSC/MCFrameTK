package mcframe.clientMGBD.MGBDP0010;

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

import mcframe.clientMAUB.MAUBP0230.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import mcframe.clientMGBD.MGBDP0020.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CalcCost"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CalcCost_MC extends MGBDP_CalcCost_MC_A implements MCResultViewer, IfMGBDP0020_T1_MGBDP0010 {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected Boolean _isItm = true;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcCost_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MGBDP_CalcCost_MC(mcframe.clientMGBD.MGBDP0010.CndR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Cnd START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Cnd END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0010_Srch01Caller<P extends MGBDP_CalcCost, B extends MG_MGBDL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Caller<P, B> {

		protected MG_MGBDL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		protected void initCallerSub() {
			keepAttributes(true);
			setScreenAsync(false);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Cnd_calc_grp_cd, Cnd_term));
		}
		
		@Override
		protected void show() {
			showSub();
		}
		protected void showSub() {
			showMerge();
		}
	}


	/**
	 * [MG_MGBDL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0010_Ins01Caller<P extends MGBDP_CalcCost, B extends MG_MGBDL0010_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0010_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
		
		@Override
		protected boolean beforeExecMain() {
			// 計算対象品目がチェックされている場合、GDP0020を開き、登録が行われた場合のみ原価計算を続行する
			if (getCndR().itm_limit_flg() && _isItm) {
				MCMessageList msg = new MCMessageList();
				super.checkReq(msg);
				if (0 < msg.size()) {
					message(msg);
					return false;
				}
				openMGBDP0020();
				return false;
			}
			return super.beforeExecMain();
		}

		protected void openMGBDP0020() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("calc_grp_cd", getCndR().calc_grp_cd());
			bind.addDateColumn("term", getCndR().term());
			openModalPanel("MG", "MGBDP0020", T1, bind, getCndR());
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}

		@Override
		protected boolean execConfirm() {
			if (_isItm) {
				return super.execConfirm();
			}
			return true;
		}
	}

	/**
	 * 原価計算を実行する
	 * 品目指定計算を実行する場合であっても計算対象品目登録画面は開かないので
	 * MGT_USR_ITMを事前に作成しておく必要がある
	 */
	@Override
	public void calc() {
		_isItm = false;
		callMG_MGBDL0010_Ins01();
	}

	/**
	 * Panel[Cnd]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doCnd_ins(MCEventInfo info) {
		_isItm = true;
		callMG_MGBDL0010_Ins01();
	}
	/**
	 * Panel[Cnd]のボタン[open_MGBDP0030]の押下時の処理
	 */
	@Override
	public void doCnd_open_MGBDP0030(MCEventInfo info) {
		showMGBDP0030(getCndR());
	}
	
	protected void showMGBDP0030(CndR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0030");
		setupMGBDP0030AsoParam(aso, r);
		aso.show();
	}
	
	protected void setupMGBDP0030AsoParam(MAUCP_AppScreenOpener aso, CndR r) {
		aso.putCnd(crtOpenMGBDP0030CndR(aso, r), crtOpenMGBDP0030CndRNullCols(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}
	
	/**
	 * nullまたはfalseでも遷移先に設定させる項目を返す。
	 */
	protected List<String> crtOpenMGBDP0030CndRNullCols(MAUCP_AppScreenOpener aso, CndR r) {
		return null;
	}
	
	protected mcframe.clientMGBD.MGBDP0030.CndR crtOpenMGBDP0030CndR(MAUCP_AppScreenOpener aso, CndR r) {	
		mcframe.clientMGBD.MGBDP0030.CndR to = mcframe.clientMGBD.MGBDP0030.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.term(r.term());
		to.st_ym(r.ym_fr());
		to.end_ym(r.ym_to());
		to.rmrks(r.rmrks());
		to.sub_char1(r.sub_char1());
		to.sub_char2(r.sub_char2());
		to.sub_char3(r.sub_char3());
		return to;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCList getCnd_ym_to(
			MCRow row,
			MCEventInfo info) {
		CndR cr = getCndR();
		if (isNull(cr.ym_fr())) {
			return null;
		}
		row.addDateColumn(YmCols.$i_st_ym, cr.ym_fr());
		row.addDateColumn(YmCols.$i_end_ym, getYmToEnd());
		
		return super.getCnd_ym_to(row, info);
	}
	@Override
	protected void listenerInit() {

		super.listenerInit();
		Cnd_term.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {

		super.doLCEvent(lc, info);
		if (lc == Cnd_term) {
			doCnd_term_LC(info);
		}
	}
	

	protected void doCnd_term_LC(MCEventInfo info) {
		setValueEx(Cnd_calc_grp_cd, null);
	}
	
	
	@Override
	public void doCnd_calc_grp_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		setYmMode();
		setDefault();
	}

	protected void setDefault() {
		CndR cr = getCndR();
		cr.ym_fr(null);
		cr.ym_to(null);
		
		MCDate ymFr;

		if (isNullOr(cr.calc_grp_cd(), cr.term())) {
			ymFr = null;
		}
		else if (isNull(cr.max_mons()) || cr.max_mons().isZero()) {
			ymFr = null;
		}
		else {

			if (MAC_COST_CALC_TYP.isCOST_STD(cr.cost_calc_typ())) {
				ymFr = cr.term();
			}
			else {
				MCDate maxFixedYm = getMaxFixedYm(cr.calc_grp_cd(),
						cr.term());
				if (isNull(maxFixedYm)) {
					// 未確定の場合
					ymFr = cr.term();
				}
				else {
					maxFixedYm = maxFixedYm.addMonth(1);
					// 確定の場合
					mcframe.clientMAUC.MAUCP0020.TermR termInfo
						= getTermInfo(this, cr.term());
					if (maxFixedYm.lt(termInfo.term())
							|| termInfo.term_end_ym().lte(maxFixedYm)) {
						// 指定されている期から外れている場合
						ymFr = null;
					}
					else {
						int diff = (int) maxFixedYm.diffMonth(termInfo.term());
						int maxMons = cr.max_mons().intValueExact();
						int n = diff / maxMons;
						ymFr = cr.term().addMonth(maxMons * n);
						
					}
				}
			}
		}

		setValueEx(Cnd_ym_fr, ymFr);
		
	}
	
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		setYmMode();
	}

	protected void setYmMode() {
		CndR r = getCndR();
		if (isNullOr(r.term(), r.calc_grp_cd())) {
			Cnd_ym_fr.setMode(MCMode.READ_ONLY);
			Cnd_ym_to.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_ym_fr);
			setDefaultMode(Cnd_ym_to);
		}
	}
	protected MCDate getMaxFixedYm(String calcGrpCd, MCDate term) {
		callMG_MGBDL0010_Srch01();
		return getCndR().ym();
	}
	@Override
	public void doCnd_ym_fr_LC(MCEventInfo info) {
		super.doCnd_ym_fr_LC(info);
		setYmTo(true);
	}

	/**
	 * 開始年月に応じて終了年月を設定する
	 * @param withEvents
	 */
	protected void setYmTo(boolean withEvents) {
		
		CndR cr = getCndR();
		MCDate ymTo;

		if (isNullOr(cr.calc_grp_cd(), cr.term(), cr.ym_fr())) {
			ymTo = null;
		}
		else if (isNull(cr.max_mons()) || cr.max_mons().isZero()) {
			ymTo = null;
		}
		else {
			if (MAC_COST_CALC_TYP.isCOST_STD(cr.cost_calc_typ())) {
				MCNumber maxMons = cr.max_mons();
				MCDate maxYm = cr.ym_fr().addMonth(maxMons.intValueExact());

				mcframe.clientMAUC.MAUCP0020.TermR termInfo
					= getTermInfo(this, cr.term());

				ymTo = getMin(maxYm, termInfo.term_end_ym());
				ymTo = ymTo.addMonth(-1);
			}
			else {
				MCDate maxFixedYm = getMaxFixedYm(cr.calc_grp_cd(),
						cr.term());
				if (isNull(maxFixedYm)) {
					// 未確定の場合
					ymTo = cr.ym_fr();
				}
				else {
					// 確定の場合
					MCDate maxFixedYmNext = maxFixedYm.addMonth(1);
					if (maxFixedYmNext.lt(cr.ym_fr())) {
						ymTo = cr.ym_fr();
					}
					else if (maxFixedYmNext.gte(getYmToEnd())) {
						ymTo = null;
					}
					else {
						ymTo = maxFixedYmNext;
					}
				}
			}
		}

		if (withEvents) {
			setValueEx(Cnd_ym_to, ymTo);
		}
		else {
			cr.ym_to(ymTo);
		}
	}
	

	protected MCDate getMin(MCDate dt1, MCDate dt2) {
		if (dt1.lt(dt2)) {
			return dt1;
		}
		return dt2;
	}

	protected MCDate getYmToEnd() {
		MCDate maxYm;
		
		CndR cr = getCndR();
		mcframe.clientMAUC.MAUCP0020.TermR termInfo
			= getTermInfo(this, cr.term());

		if (isNull(cr.max_mons()) || cr.max_mons().isZero()) {
			maxYm = termInfo.term_end_ym();
		}
		else {
			maxYm = cr.ym_fr().addMonth(cr.max_mons().intValueExact());
		}

		return getMin(maxYm, termInfo.term_end_ym());
	}
	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}

	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge) {
		if (bridge instanceof MG_MGBDL0010_Ins01Bridge) {
			MG_MGBDL0010_Ins01Bridge b = (MG_MGBDL0010_Ins01Bridge) bridge;
			doAsyncResult_MG_MGBDL0010_Ins01Bridge(b);
		}
		return false;
	}

	protected void doAsyncResult_MG_MGBDL0010_Ins01Bridge(MG_MGBDL0010_Ins01Bridge bridge) {
		MCException ex = bridge.param().getExceptionParam().getException();
		String calc_no = null;
		if (null != ex) {
			calc_no = getScaErrCalcNo(ex);
			
		}
		if (isNull(calc_no)) {
			calc_no = bridge.down0().calc_no();
		}
		
		CndR bind = CndR.create();
		bind.calc_grp_cd(bridge.up0().calc_grp_cd());
		bind.calc_no(calc_no);
		bind.term(bridge.up0().term());
		showMGBDP0030(bind);
	}
	
	protected String getScaErrCalcNo(MCException ex) {
		int calcNoIdx = 2;
		if (MGBDL0001.equals(ex.getID()) || MGBDL0002.equals(ex.getID())) {
			return ex.getBind(calcNoIdx);
		}
		
		MCMessageList ml = ex.getCauseMessageList();
		for(MCMessage m : ml) {
			if (MGBDL0001.equals(m.getID()) || MGBDL0002.equals(m.getID())) {
				return m.getBind(calcNoIdx);
			}
		}
		return null;
	}

}