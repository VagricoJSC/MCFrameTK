package mcframe.clientMGBD.MGBDP0040;

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
import mcframe.clientMAUB.MAUBP5160.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ArgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ArgReg_MC extends MGBDP_ArgReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ArgReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ArgReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Srch01Caller<P extends MGBDP_ArgReg, B extends MG_MGBDL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall(){
			super.afterCall();
			afterCallSub();
		}

		protected void afterCallSub() {
			for (DtlR dtl : bridge.down1()) {
				// 計算開始時刻または計算終了時刻がnullの場合は、計算時間はnullとする。
				if (!isNullOr(dtl.calc_st(), dtl.calc_fin())) {
					dtl.calc_time(toHMSStr(dtl.calc_fin().diffSecond(dtl.calc_st())));
				}
			}
			setHiddenList(bridge.down0(), bridge.down1());
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}
		protected void showSub() {
			//Dtlはフォーカス移動イベントに任せる
			DtlTable.clear();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
		 @Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setFocus();
		}
		 @Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			setFocus();
		}
		
	}

	/**
	 * [MG_MGBDL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Ins01Caller<P extends MGBDP_ArgReg, B extends MG_MGBDL0040_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0040_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_REGStatus();
		}
	}

	/**
	 * [MG_MGBDL0040_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Del01Caller<P extends MGBDP_ArgReg, B extends MG_MGBDL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0040_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setDEL_REGStatus();
		}
	}

	/**
	 * [MG_MGBDL0040_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Ins02Caller<P extends MGBDP_ArgReg, B extends MG_MGBDL0040_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0040_Ins02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			
			initCallerSub();
		}
		
		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
		

		@Override
		protected void setMode() {
			super.setMode();
			panel.statusClear();
			setFIX_ISStatus();
		}
	}

	/**
	 * [MG_MGBDL0040_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0040_Del02Caller<P extends MGBDP_ArgReg, B extends MG_MGBDL0040_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0040_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setDEL_SENDStatus();
		}
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMG_MGBDL0040_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0030(MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		showMGBDP0030(dtlR);
	}
	
	protected void showMGBDP0030(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0030");
		setupMGBDP0030AsoParam(aso, r);
		aso.show();
	}
	protected void setupMGBDP0030AsoParam(MAUCP_AppScreenOpener aso, DtlR r) {
		aso.putCnd(crtOpenMGBDP0030CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
		
	}
	protected mcframe.clientMGBD.MGBDP0030.CndR crtOpenMGBDP0030CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMGBD.MGBDP0030.CndR to = mcframe.clientMGBD.MGBDP0030.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.term(r.term());
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MBBBP0080(r);
	}
	protected void doBtn_open_MBBBP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0080");
		mcframe.clientMBBB.MBBBP0080.CndR to = mcframe.clientMBBB.MBBBP0080.CndR.create();
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.ac_ym_fr(r.ym());
		to.ac_ym_to(r.ym());
		aso.putCnd(to);
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd_reg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_reg(MCEventInfo info) {
		callMG_MGBDL0040_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_send_reg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_send_reg(MCEventInfo info) {
		callMG_MGBDL0040_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[del_reg_cancel]の押下時の処理
	 */
	@Override
	public void doBtn_del_reg_cancel(MCEventInfo info) {
		callMG_MGBDL0040_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_send_cancel]の押下時の処理
	 */
	@Override
	public void doBtn_del_send_cancel(MCEventInfo info) {
		callMG_MGBDL0040_Del02();
	}
	
	protected MCList<RsltR> _rsltList;
	protected MCList<DtlR> _dtlList;

	protected void clearHiddenList() {
		_rsltList = null;
		_dtlList = null;
	}

	protected void setHiddenList(MCList<RsltR> rslt, MCList<DtlR> dtl) {
		_rsltList = rslt;
		_dtlList = dtl;
	}
	

	protected void setBtnMode() {
		if (isNull(getDtlL()) || DtlTable.getSelectedMCRow() == null) {
			Btn_open_MGBDP0030.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MGBDP0030);
			
		}

		if (isNull(getRsltL()) || RsltTable.getSelectedMCRow() == null) {
			Btn_open_MBBBP0080.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MBBBP0080);
			
		}
	}

	protected void setFocus() {
		if (isNull(getRsltL())) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
		if (!isNull(getDtlL())) {
			DtlTable.selectLeftmostColumn(0);
			
		}
	}
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		int idx = info.getEventIndex();
		RsltR row = getRsltL().get(idx);
		
		DtlTable.clear();

		if(INS_REG.equals(getStatus())){
			showDtl(row);
		}
		else{
			if (!isNull(row.calc_no())) {
				showDtl(row);
			}
		}
		
		setBtnMode();
		DtlTable.adjustWidth();
	}

	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		
		setBtnMode();
	}
	
	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		int i = info.getEventIndex();
		DtlR er = getDtlL().get(i);
		if (er.check()) {
			getDtlL().forEach(dr -> {
				if (dr != er) {
					dr.check(false);
				}
			});
		}
		
	}
	protected void showDtl(RsltR r) {
		final MCList<DtlR> l = createDtlL();
		//サーバでのソートを崩さないようにするため、subListは使用しない。
		if (!isNull(r.calc_no())) {
			_dtlList.forEach(dr -> {
				if (isSame(dr.calc_no(), r.calc_no())) {
					l.add(dr);
				}
			});
		}
		else {
			_dtlList.forEach(dr -> {
				if (isSame(dr.ym(), r.ym())) {
					l.add(dr);
				}
			});
		}
		l.setStatus(MCRow.NONE);
		getDtlL().setAll(l);
		if (!isNull(l)) {
			DtlTable.selectRowNoFocus(0);
		}
	}

	
	@Override
	public boolean doRslt_VC(MCEventInfo info){

		if (super.doRslt_VC(info)) {
			if(isChanged(DtlTable) && !confirmRegDataClear()){
				return false;
			}
			
			for(DtlR row : getDtlL()) {
				row.check(false);
			}	
			return true;
		}
		return false;
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		// 固定桁（分、秒）の値を揃える
		columnDtl_calc_time.setHorizontalAlignment(MCColumnConfig.RIGHT);
	}
	@Override
	protected void setCellConfig(){
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_term.addAllListener(this);
	}

	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (super.doVCEvent(vc, info)) {
			if (vc == Cnd_term) {
				return doCnd_term_VC(info);
			}
			return true;
		}
		return false;
	}
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_term) {
			doCnd_term_LC(info);
		}
	}
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		
		clearHiddenList();
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (super.doCnd_ope_VC(info)) {
			if(!isChanged(DtlTable) || confirmRegDataClear()){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL(), getDtlL());
		clearHiddenList();
		setSRCHStatus();
	}
	
	protected void clearAllList() {
		clearContainers(getRsltL(), getDtlL());
		clearHiddenList();
	}
	
	@Override
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info) {
		if (super.doCnd_calc_grp_cd_VC(info)) {
			return !isChanged(DtlTable) || confirmRegDataClear();
		}
		return false;
	}
	
	protected boolean doCnd_term_VC(MCEventInfo info) {
		return !isChanged(DtlTable) || confirmRegDataClear();
	}
	
	protected void doCnd_term_LC(MCEventInfo info){
		clearAllList();
	}
	
	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
		super.doCnd_calc_grp_cd_LC(info);
		clearAllList();
	}
	protected void setStatus() {
		if (Cnd_ope_INS01.isSelected()) {
			setINS_REGStatus();
		}
		else if (Cnd_ope_DEL01.isSelected()) {
			setDEL_REGStatus();
		}
		else if (Cnd_ope_INS02.isSelected()) {
			setINS_SENDStatus();
		}
		else if (Cnd_ope_DEL02.isSelected()) {
			setDEL_SENDStatus();
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setINS_REGStatus() {
		super.setINS_REGStatus();
		setBtnMode();
		DtlPanel.focusFirstComponent();
	}
	
	@Override
	public void setINS_SENDStatus() {
		super.setINS_SENDStatus();
		setBtnMode();
		DtlPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_ISStatus() {
		super.setFIX_ISStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setDEL_REGStatus() {
		super.setDEL_REGStatus();
		setBtnMode();
		DtlPanel.focusFirstComponent();
	}
	
	@Override
	public void setDEL_SENDStatus() {
		super.setDEL_SENDStatus();
		setBtnMode();
		DtlPanel.focusFirstComponent();
	}
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}
	
	@Override
	protected boolean useDelMsg() {
		return false;
	}

	/**
	 * 明細情報用のCellConfigクラスを作成する
	 */
	protected DtlCellConfig createDtlCellConfig(){
		return new DtlCellConfig();
	}
	/**
	 * 明細情報用のCellConfigクラス
	 */
	protected class DtlCellConfig extends MGUDP_CellConfig{

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}
		
		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
			RsltR rslt = RsltTable.getSelectedMCRow();
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			if (column == columnDtl_check) {
				if (INS_REG.equals(getStatus())) {
					if (!isNull(rslt.calc_no())) {
						return MCMode.READ_ONLY;
					}
				}
				if (DEL_REG.equals(getStatus())) {
					if (isNull(rslt.calc_no()) || rslt.ac_if_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (INS_SEND.equals(getStatus())) {
					if (isNull(rslt.calc_no()) || rslt.ac_if_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (DEL_SEND.equals(getStatus())) {
					if (isNull(rslt.calc_no()) || !rslt.ac_if_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		 }

	}
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			MCButton b = getDCOpenTgt();
			if (b.isEnabled()) {
				b.doAP();
			}	
		}	
	}
	
	/**
	 * DCイベントで実行するボタンを返す。
	 */
	protected MCButton getDCOpenTgt() {
		return Btn_open_MGBDP0030;
	}

}