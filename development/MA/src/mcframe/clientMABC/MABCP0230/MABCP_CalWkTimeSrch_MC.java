package mcframe.clientMABC.MABCP0230;

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
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_CalWkTimeSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_CalWkTimeSrch_MC extends MABCP_CalWkTimeSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Color _no_cal_odd;
	protected Color _rest_day_odd;
	protected Color _wk_time_odd;
	protected Color _wk_time_upd_fg_odd;
	protected Color _wk_time_upd_bg_odd;
	protected Color _no_cal_even;
	protected Color _rest_day_even;
	protected Color _wk_time_even;
	protected Color _wk_time_upd_fg_even;
	protected Color _wk_time_upd_bg_even;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CalWkTimeSrch_MC() {
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
	public MABCP_CalWkTimeSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0230_Srch01Caller<P extends MABCP_CalWkTimeSrch, B extends MA_MABCL0230_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		
		protected MA_MABCL0230_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRsltCalL(), getRsltDtHdrR(), getRegCalExtL());
		}
		
		@Override
		protected boolean execConfirm() {
			if (getRegCalExtL().size() == 0) {
				return true ;
			}
			return super.execConfirm();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setUPDStatus();
		}
		
		@Override
		protected void show() {
			super.show();
			for (int i = 0; i < 12; i++) {
				RsltCalR m = RsltCalR.create();
				m.setRefTime(bridge.down0().getRefTime());
				setMonthDayInfo(m, i);
				getRsltCalL().add(m);
			}
		}
		
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			RsltCalTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			CndPanel.focusFirstComponent();
		}
		
		protected void setMonthDayInfo(RsltCalR m, int i) {
			// 月情報設定
			String ym_str = String.valueOf(bridge.up0().year().getYear())
					+ lpad(String.valueOf(i + 1), 2, "0");
			m.ym(MCDate.valueOf(ym_str, "yyyyMM"));
			
			// 日情報設定
			for (int j = 1; j < 32; j++) {
				setDayInfo(m, m.ym(), j);
			}

		}
		
		protected void setDayInfo(RsltCalR d, MCDate ym, int i) {
			MCDate dt = null;
			try {
				dt = ym.modDay(i);
				d.setStringNE("dt" + lpad(String.valueOf(i), 2, "0"), getDtView(dt));
			}
			catch (MCException e) {
				if (e.getID().equals("FCBFC0010")) {
					_setBlancDayInfo();
				}
				else {
					throw e;
				}
			}
		}
		
		protected void _setBlancDayInfo() {
			// 何も設定しない
		}
		
		protected String getDtView(MCDate dt) {
			// 曜日名をdt_viewの長さで切り捨てて表示
			String dayWeekTyp = MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt);
			String dayWeekTypNm = MAC_DAY_WEEK_TYP.get(dayWeekTyp).name();
			String dt_view = dayWeekTypNm;
			
			if (dayWeekTypNm.length() > RsltCalR.dt01_META.length()) {
				dt_view = dayWeekTypNm.substring(0, RsltCalR.dt01_META.length());
			}
			return dt_view;
		}
		
	}

	/**
	 * [MA_MABCL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0230_Upd01Caller<P extends MABCP_CalWkTimeSrch, B extends MA_MABCL0230_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MA_MABCL0230_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			// カレンダ取得時の参照日時をセットする
			getRegCalExtL().setRefTime(getRsltCalL().getRefTime());
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			for (RegCalExtR r : getRegCalExtL()) {

				WkCalR cal = null;
				for (WkCalR r2 :getWkCalL()) {
					if (r.dt().gteDate(r2.st_dt()) && r.dt().lteDate(r2.end_dt())) {
						cal = r2;
					}
				}

				if (r.cal_ext()) {
					// 臨時カレンダがオンでカレンダマスタと休日が同じ⇒臨時カレンダを削除
					if (isSame(r.off_flg_disp(), getOffFlg(cal, MAC_DAY_WEEK_TYP.toDayWeekTypValue(r.dt())))) {
						r.setStatus(MCRow.DELETE);
					}
					// 臨時カレンダがオンでカレンダマスタと休日が異なる⇒臨時カレンダを更新
					else {
						r.off_flg(r.off_flg_disp());
						r.setStatus(MCRow.MODIFY);
					}
				}
				// 臨時カレンダがオフ⇒臨時カレンダを追加
				else {
					r.off_flg(r.off_flg_disp());
					r.setStatus(MCRow.CREATE);
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}
		
	}

	/**
	 * Panel[SrchBtn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doSrchBtn_srch(MCEventInfo info) {
		callMA_MABCL0230_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0230_Upd01();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MABCP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0210(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0210");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0210CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP0210]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0210.CndR crtOpenMABCP0210CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0210.CndR to = mcframe.clientMABC.MABCP0210.CndR.create();
		CndR fr = getCndR();
		to.cal_cd(fr.cal_cd());
		if (!isNull(to.cal_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		RsltCalTable.setSortable(false);
		_no_cal_odd = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.no_cal.odd");
		_rest_day_odd = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.rest_day.odd");
		_wk_time_odd = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time.odd");
		_wk_time_upd_fg_odd = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time_upd_fg.odd");
		_wk_time_upd_bg_odd = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time_upd_bg.odd");

		_no_cal_even = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.no_cal.even");
		_rest_day_even = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.rest_day.even");
		_wk_time_even = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time.even");
		_wk_time_upd_fg_even = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time_upd_fg.even");
		_wk_time_upd_bg_even = getPgmSettingColor(MABCP_CalWkTimeSrch.class, "color.wk_time_upd_bg.even");
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltCalTable.setCellConfig(createRsltCalCellConfig());
	}
	
	
	@Override
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == columnRsltCal_dt01)  doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt02) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt03) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt04) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt05) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt06) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt07) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt08) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt09) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt10) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt11) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt12) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt13) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt14) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt15) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt16) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt17) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt18) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt19) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt20) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt21) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt22) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt23) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt24) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt25) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt26) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt27) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt28) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt29) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt30) doRsltCal_dt_NE(info);
		else if (ne == columnRsltCal_dt31) doRsltCal_dt_NE(info);
	}
	
	@Override
	public void doRsltDtHdr_off_flg_disp_NC(MCEventInfo info) {
		super.doRsltDtHdr_off_flg_disp_NC(info);
		setRegCalExt();
		ctrlLsMode();
		ctrlBtnMode();
	}
	
	@Override
	public void doRsltDtHdr_memo1_NC(MCEventInfo info) {
		super.doRsltDtHdr_memo1_NC(info);
		setRegCalMemo();
		ctrlBtnMode();
	}
	
	@Override
	public void doRsltDtHdr_memo2_NC(MCEventInfo info) {
		super.doRsltDtHdr_memo2_NC(info);
		setRegCalMemo();
		ctrlBtnMode();
	}
	
	@Override
	public void doRsltDtHdr_memo3_NC(MCEventInfo info) {
		super.doRsltDtHdr_memo3_NC(info);
		setRegCalMemo();
		ctrlBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)){
			return false ;
		}
		else if (!isStatusNone(getRegCalExtL()) && getStatus() == UPD) {
			return confirmRegDataClear() ;
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		getRsltCalL().clear();
		getRegCalExtL().clear();
		getWkCalL().clear();
	}
	
	protected void setRegCalMemo() {
		boolean find = false;
		for (RegCalExtR r : getRegCalExtL()) {
			if (isSame(getRsltDtHdrR().cal_cd(), r.cal_cd()) && isSame(getRsltDtHdrR().dt(), r.dt())) {
				r.memo1(getRsltDtHdrR().memo1());
				r.memo2(getRsltDtHdrR().memo2());
				r.memo3(getRsltDtHdrR().memo3());
				find = true;
				break;
			}
		}
		
		if (!find) {
			RegCalExtR calR = RegCalExtR.create();
			calR.cal_cd(getRsltDtHdrR().cal_cd());
			calR.cal_nm(getRsltDtHdrR().cal_nm());
			calR.dt(getRsltDtHdrR().dt());
			calR.off_flg_disp(getRsltDtHdrR().off_flg_disp());
			calR.cal_ext_disp(getRsltDtHdrR().cal_ext_disp());
			calR.memo1(getRsltDtHdrR().memo1());
			calR.memo2(getRsltDtHdrR().memo2());
			calR.memo3(getRsltDtHdrR().memo3());
			calR.off_flg(getRsltDtHdrR().off_flg());
			calR.cal_ext(getRsltDtHdrR().cal_ext());
			calR.setStatus(MCRow.MODIFY);
			getRegCalExtL().add(calR);
		}
		
	}
	
	protected void doRsltCal_dt_NE(MCEventInfo info) {
		int idx = info.getNewIndex();
		if (idx < 0) {
			return;
		}

		RsltCalR tar = (RsltCalR)getRsltCalL().get(idx);
		if (tar == null) {
			return;
		}
		
		MCColumnConfig conf = info.getNewColumn();
		if (conf == null) {
			return;
		}
		
		MCNumber day = MCNumber.valueOf(lpad(conf.getHeaderName(), 2, "0"));
		MCDate dt = getDayInfo(tar.ym(), day);
		MCRow.copyvalue(getRsltDtHdrR(), getRsltDtHdrByReg(dt));
		
		ctrlLsMode();
		ctrlBtnMode();
	}
	
	protected RsltDtHdrR getRsltDtHdrByWk(MCDate dt) {
		
		RsltDtHdrR rsltDt = RsltDtHdrR.create();
		
		if (isNull(dt)) {
			return rsltDt;
		}
		
		// カレンダマスタ情報の取得
		WkCalR cal = null;
		WkCalExtR cal_ext = null;
		for (WkCalR r :getWkCalL()) {
			if (dt.gteDate(r.st_dt()) && dt.lteDate(r.end_dt())) {
				cal = r;
				break;
			}
		}
		
		// 日付情報の設定
		// カレンダがある場合
		if (cal != null) {
			// 臨時カレンダがある場合は、臨時カレンダを優先する
			cal_ext = getWkCalExtL().getFirst(WkCalExtR.$dt, dt);
			if (cal_ext == null || cal_ext.del_flg() == true) {
				rsltDt.cal_cd(cal.cal_cd());
				rsltDt.cal_nm(cal.cal_nm());
				rsltDt.dt(dt);
				rsltDt.day_week_typ(MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt));
				rsltDt.day_week_typ_nm(MAC_DAY_WEEK_TYP.get(rsltDt.day_week_typ()).name());
				rsltDt.off_flg_disp(getOffFlg(cal, rsltDt.day_week_typ()));
				rsltDt.cal_ext_disp(false);
			}
			else {
				rsltDt.cal_cd(cal_ext.cal_cd());
				rsltDt.cal_nm(cal_ext.cal_nm());
				rsltDt.dt(dt);
				rsltDt.day_week_typ(MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt));
				rsltDt.day_week_typ_nm(MAC_DAY_WEEK_TYP.get(rsltDt.day_week_typ()).name());
				rsltDt.off_flg_disp(cal_ext.off_flg());
				rsltDt.cal_ext_disp(true);
				rsltDt.memo1(cal_ext.memo1());
				rsltDt.memo2(cal_ext.memo2());
				rsltDt.memo3(cal_ext.memo3());
			}
			if (cal_ext == null) {
				rsltDt.off_flg(rsltDt.off_flg_disp());
				rsltDt.cal_ext(false);
			}
			else {
				rsltDt.off_flg(cal_ext.off_flg());
				rsltDt.cal_ext(true);
			}
		}
		
		return rsltDt;
	}
	
	protected RsltDtHdrR getRsltDtHdrByReg(MCDate dt) {
		
		RsltDtHdrR rsltDt = RsltDtHdrR.create();
		
		if (isNull(dt)) {
			return rsltDt;
		}
		
		// カレンダマスタ情報の取得
		WkCalR cal = null;
		WkCalExtR cal_ext = null;
		RegCalExtR cal_ext_reg = null;
		for (WkCalR r :getWkCalL()) {
			if (dt.gteDate(r.st_dt()) && dt.lteDate(r.end_dt())) {
				cal = r;
				break;
			}
		}
		
		// 日付情報の設定
		// カレンダがある場合
		if (cal != null) {
			// 臨時カレンダがある場合は、臨時カレンダを優先する
			cal_ext_reg = getRegCalExtL().getFirst(RegCalExtR.$dt, dt);
			if (cal_ext_reg == null) {
				cal_ext = getWkCalExtL().getFirst(WkCalExtR.$dt, dt);
				if (cal_ext == null || cal_ext.del_flg() == true) {
					rsltDt.cal_cd(cal.cal_cd());
					rsltDt.cal_nm(cal.cal_nm());
					rsltDt.dt(dt);
					rsltDt.day_week_typ(MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt));
					rsltDt.day_week_typ_nm(MAC_DAY_WEEK_TYP.get(rsltDt.day_week_typ()).name());
					rsltDt.off_flg_disp(getOffFlg(cal, rsltDt.day_week_typ()));
				}
				else {
					rsltDt.cal_cd(cal_ext.cal_cd());
					rsltDt.cal_nm(cal_ext.cal_nm());
					rsltDt.dt(dt);
					rsltDt.day_week_typ(MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt));
					rsltDt.day_week_typ_nm(MAC_DAY_WEEK_TYP.get(rsltDt.day_week_typ()).name());
					rsltDt.off_flg_disp(cal_ext.off_flg());
					rsltDt.cal_ext_disp(true);
					rsltDt.memo1(cal_ext.memo1());
					rsltDt.memo2(cal_ext.memo2());
					rsltDt.memo3(cal_ext.memo3());
				}
				if (cal_ext == null) {
					rsltDt.off_flg(rsltDt.off_flg_disp());
					rsltDt.cal_ext(false);
				}
				else {
					rsltDt.off_flg(cal_ext.off_flg());
					rsltDt.cal_ext(true);
				}
			} 
			else {
				rsltDt.cal_cd(cal_ext_reg.cal_cd());
				rsltDt.cal_nm(cal_ext_reg.cal_nm());
				rsltDt.dt(dt);
				rsltDt.day_week_typ(MAC_DAY_WEEK_TYP.toDayWeekTypValue(dt));
				rsltDt.day_week_typ_nm(MAC_DAY_WEEK_TYP.get(rsltDt.day_week_typ()).name());
				rsltDt.off_flg_disp(cal_ext_reg.off_flg_disp());
				rsltDt.cal_ext_disp(cal_ext_reg.cal_ext_disp());
				rsltDt.memo1(cal_ext_reg.memo1());
				rsltDt.memo2(cal_ext_reg.memo2());
				rsltDt.memo3(cal_ext_reg.memo3());
				rsltDt.off_flg(cal_ext_reg.off_flg());
				rsltDt.cal_ext(cal_ext_reg.cal_ext());
			}
			
		}
		
		return rsltDt;
	}
	
	/**
	 * カレンダマスタから休日を取得する
	 * @param cal カレンダマスタ
	 * @param DayWeekTyp 曜日
	 * @return 休日
	 */
	protected boolean getOffFlg(WkCalR cal, String DayWeekTyp) {
		boolean offFlg = false;
		
		if (MAC_DAY_WEEK_TYP.isSUN(DayWeekTyp)) {
			offFlg = cal.sun_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isMON(DayWeekTyp)) {
			offFlg = cal.mon_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isTUE(DayWeekTyp)) {
			offFlg = cal.tue_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isWED(DayWeekTyp)) {
			offFlg = cal.wed_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isTHU(DayWeekTyp)) {
			offFlg = cal.thu_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isFRI(DayWeekTyp)) {
			offFlg = cal.fri_off_flg();
		} else if (MAC_DAY_WEEK_TYP.isSAT(DayWeekTyp)) {
			offFlg = cal.sat_off_flg();
		}
		
		return offFlg;
	}
	
	protected RsltCalCellConfig createRsltCalCellConfig() {
		return new RsltCalCellConfig();
	}
	
	protected class RsltCalCellConfig extends MAUDP_CellConfig {
		
		@Override
		public Color getSelectedRowPriorFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			// 選択行を別の色にしない
			if (!isApplyColumn(column, index)) {
				return super.getSelectedRowPriorFG(index, column, table, mode);
			}
			return super.getPriorFG(index, column, table, mode);
		}
		
		@Override
		public Color getPriorFG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (!isApplyColumn(column, index)) {
				return super.getPriorFG(index, column, table, mode);
			}
			
			MCNumber day = MCNumber.valueOf(lpad(column.getHeaderName(), 2, "0"));
			RsltCalR row = (RsltCalR) table.getRow(index);
			MCDate dt = getDayInfo(row.ym(), day);
			
			if (isChgRegCalExt(getRsltDtHdrByWk(dt))) {
				if (isOddRow(index, column, table, mode)) {
					return _wk_time_upd_fg_odd;
				}
				else {
					return _wk_time_upd_fg_even;
				}
			}
			else {
				return Color.BLACK;
			}
		}
		
		@Override
		public Color getSelectedRowPriorBG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			if (!isApplyColumn(column, index)) {
				return super.getSelectedRowPriorBG(index, column, table, mode);
			}
			
			// 選択行を別の色にしない
			return getPriorBG(index, column, table, mode);
		}
		
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			
			if (!isApplyColumn(column, index)) {
				return super.getPriorBG(index, column, table, mode);
			}
			
			MCNumber day = MCNumber.valueOf(lpad(column.getHeaderName(), 2, "0"));
			RsltCalR row = (RsltCalR) table.getRow(index);
			MCDate dt = getDayInfo(row.ym(), day);
			
			if (isOddRow(index, column, table, mode)) {
				return getOddPriorBG(index, column, table, mode, getRsltDtHdrByWk(dt));
			}
			else {
				return getEvenPriorBG(index, column, table, mode, getRsltDtHdrByWk(dt));
			}
			
		}
		
		protected Color getOddPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode, RsltDtHdrR cal) {
			// カレンダなし
			if (isNull(cal.cal_cd())) {
				return _no_cal_odd;
			}
			// 稼働日
			if (isChgRegCalExt(cal)) {
				return _wk_time_upd_bg_odd;
			}
			// 休日
			if (cal.off_flg_disp()) {
				return _rest_day_odd;
			}
			// 稼働日
			return _wk_time_odd;
		}
		
		protected Color getEvenPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode, RsltDtHdrR cal) {
			// カレンダなし
			if (isNull(cal.cal_cd())) {
				return _no_cal_even;
			}
			// 稼働日
			if (isChgRegCalExt(cal)) {
				return _wk_time_upd_bg_even;
			}
			// 休日
			if (cal.off_flg_disp()) {
				return _rest_day_even;
			}
			// 稼働日
			return _wk_time_even;
		}
	}
	
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		ctrlLsMode();
		ctrlBtnMode();
	}
	
	protected void ctrlLsMode() {
		if (getStatus() == UPD) {
			if (isNullOr(getRsltDtHdrR().cal_cd(), getRsltDtHdrR().dt())) {
				RsltDtHdr_off_flg_disp.setMode(MCMode.READ_ONLY);
				RsltDtHdr_memo1.setMode(MCMode.READ_ONLY);
				RsltDtHdr_memo2.setMode(MCMode.READ_ONLY);
				RsltDtHdr_memo3.setMode(MCMode.READ_ONLY);
			}
			else if (Cnd_ope_UPD.isSelected()) {
				RsltDtHdr_off_flg_disp.setMode(MCMode.REQUIRED);

				if (getRsltDtHdrR().cal_ext() || isChgRegCalExt(getRsltDtHdrByWk(getRsltDtHdrR().dt()))) {
					RsltDtHdr_memo1.setMode(MCMode.ENABLE);
					RsltDtHdr_memo2.setMode(MCMode.ENABLE);
					RsltDtHdr_memo3.setMode(MCMode.ENABLE);
				} else {
					RsltDtHdr_memo1.setMode(MCMode.READ_ONLY);
					RsltDtHdr_memo2.setMode(MCMode.READ_ONLY);
					RsltDtHdr_memo3.setMode(MCMode.READ_ONLY);
					getRsltDtHdrR().memo1(null);
					getRsltDtHdrR().memo2(null);
					getRsltDtHdrR().memo3(null);
				}
			}
		}
	}

	protected void ctrlBtnMode() {
		Btn_upd.setMode(MCMode.DISABLE);
		if (getStatus() == UPD) {
			if (getRegCalExtL().size() > 0) {
				Btn_upd.setMode(MCMode.ENABLE);
			}
		}
	}
	
	protected MCDate getDayInfo(MCDate ym, MCNumber day) {
		MCDate dt = null;
		try {
			dt = ym.modDay(day);
		}
		catch (MCException e) {
			if (e.getID().equals("FCBFC0010")) {
			}
			else {
				throw e;
			}
		}
		return dt;
	}
	
	protected boolean isChgRegCalExt(RsltDtHdrR cal) {
		for (RegCalExtR r :getRegCalExtL()) {
			if (isSame(cal.cal_cd(), r.cal_cd()) && isSame(cal.dt(), r.dt())) {
				if(!isSame(cal.off_flg_disp(), r.off_flg_disp())
						|| !isSame(cal.memo1(), r.memo1()) 
						|| !isSame(cal.memo2(), r.memo2()) 
						|| !isSame(cal.memo3(), r.memo3())) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected boolean isApplyColumn(MCColumnConfig column, int index) {
		if (column == columnRsltCal_dt01 || column == columnRsltCal_dt02 ||
				column == columnRsltCal_dt03 || column == columnRsltCal_dt04 ||
				column == columnRsltCal_dt05 || column == columnRsltCal_dt06 ||
				column == columnRsltCal_dt07 || column == columnRsltCal_dt08 ||
				column == columnRsltCal_dt09 || column == columnRsltCal_dt10 ||
				column == columnRsltCal_dt11 || column == columnRsltCal_dt12 ||
				column == columnRsltCal_dt13 || column == columnRsltCal_dt14 ||
				column == columnRsltCal_dt15 || column == columnRsltCal_dt16 ||
				column == columnRsltCal_dt17 || column == columnRsltCal_dt18 ||
				column == columnRsltCal_dt19 || column == columnRsltCal_dt20 ||
				column == columnRsltCal_dt21 || column == columnRsltCal_dt22 ||
				column == columnRsltCal_dt23 || column == columnRsltCal_dt24 ||
				column == columnRsltCal_dt25 || column == columnRsltCal_dt26 ||
				column == columnRsltCal_dt27 || column == columnRsltCal_dt28 ||
				column == columnRsltCal_dt29 || column == columnRsltCal_dt30 ||
				column == columnRsltCal_dt31) {
			return true;
		} else {
			return false;
		}
	}
	
	protected void setRegCalExt() {
		boolean find = false;
		for (RegCalExtR r : getRegCalExtL()) {
			if (isSame(getRsltDtHdrR().cal_cd(), r.cal_cd()) && isSame(getRsltDtHdrR().dt(), r.dt())) {
				r.off_flg_disp(getRsltDtHdrR().off_flg_disp());
				find = true;
				break;
			}
		}

		if (!find) {
			RegCalExtR calR = RegCalExtR.create();
			calR.cal_cd(getRsltDtHdrR().cal_cd());
			calR.cal_nm(getRsltDtHdrR().cal_nm());
			calR.dt(getRsltDtHdrR().dt());
			calR.off_flg_disp(getRsltDtHdrR().off_flg_disp());
			calR.cal_ext_disp(getRsltDtHdrR().cal_ext_disp());
			calR.memo1(getRsltDtHdrR().memo1());
			calR.memo2(getRsltDtHdrR().memo2());
			calR.memo3(getRsltDtHdrR().memo3());
			calR.off_flg(getRsltDtHdrR().off_flg());
			calR.cal_ext(getRsltDtHdrR().cal_ext());
			calR.setStatus(MCRow.CREATE);
			getRegCalExtL().add(calR);
		}
	}
	
	public String getMstSetTypNm(MAC_MST_NM typ) {
		if (typ == null) {
			return null;
		}
		MCOperationInfo Srch01_INFO = new MCOperationInfo("MA", "MAUDL6010", "Srch01", "000000", null);
		MCParam p = new MCParam(Srch01_INFO);
		MCRow up = MCRow.create();
		up.addStringColumn("mst_nm", typ.value());
		MCRow down = MCRow.create();
		down.addStringColumn("mst_set_typ");
		down.addStringColumn("mst_set_typ_nm");
		p.addUpBlock(up);
		p.addDownBlock(down);
		(new MAUDP_CallerNoPanel(p)).exec();
		
		return down.getString("mst_set_typ_nm");
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();

		getMstR().mst_set_typ_nm(getMstSetTypNm(MAC_MST_NM.MAM_CAL));
	}

}