package mcframe.clientMABS.MABSP0470;

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

import mcframe.clientFXBA.FXBAP0130.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ShipWkJdgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ShipWkJdgReg_MC extends MABSP_ShipWkJdgReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected final String DUMMY_YMD = "19000101";

	protected final String DUMMY_YMD_F = "yyyyMMdd";

	protected final String DUMMY_SEC = "01";

	protected final String DUMMY_SEC_F = "ss";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ShipWkJdgReg_MC() {
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
	public MABSP_ShipWkJdgReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0470_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0470_Srch01Caller<P extends MABSP_ShipWkJdgReg, B extends MA_MABSL0470_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0470_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void show() {
			// 納入締切時刻,出荷予定時刻の表示値を設定する
			for (DtlR dtlRow : bridge.down0()) {
				setValueToDispDtlR(dtlRow);
			}
			super.show();
		}
	}

	/**
	 * [MA_MABSL0470_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0470_Upd01Caller<P extends MABSP_ShipWkJdgReg, B extends MA_MABSL0470_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0470_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0470_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0470_Del01Caller<P extends MABSP_ShipWkJdgReg, B extends MA_MABSL0470_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0470_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0470_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABSL0470_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0470_Del01();
	}

	protected String getDispAndValueFormatCndDlvDedTimeFr() {
		return Cnd_dlv_ded_time_fr_disp.getCalendarFormat().getInputPattern().replaceAll("h", "H");
	}

	protected String getDispAndValueFormatCndDlvDedTimeTo() {
		return Cnd_dlv_ded_time_to_disp.getCalendarFormat().getInputPattern().replaceAll("h", "H");
	}

	protected String getDispAndValueFormatDtlDlvDedTime() {
		return columnDtl_dlv_ded_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}

	protected String getDispAndValueFormatDtlShipSchdTime() {
		return columnDtl_ship_schd_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}

	// -----時刻関連処理-----
	@Override
	public void doCnd_dlv_ded_time_fr_disp_NC(MCEventInfo info){
		super.doCnd_dlv_ded_time_fr_disp_NC(info);

		CndR CndR = getCndR();
		setDispToValueCnd(CndR);
	}

	@Override
	public void doCnd_dlv_ded_time_to_disp_NC(MCEventInfo info){
		super.doCnd_dlv_ded_time_to_disp_NC(info);

		CndR CndR = getCndR();
		setDispToValueCnd(CndR);
	}

	@Override
	public void doDtl_dlv_ded_time_disp_NC(MCEventInfo info){
		super.doDtl_dlv_ded_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		DtlR DtlR = getDtlL().get(idx);
		convDispDtl(DtlR);
		setDispToValueDtl(DtlR);
	}

	@Override
	public void doDtl_ship_schd_time_disp_NC(MCEventInfo info){
		super.doDtl_ship_schd_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		DtlR DtlR = getDtlL().get(idx);
		convDispDtl(DtlR);
		setDispToValueDtl(DtlR);
	}

	protected void convDispDtl(DtlR r) {
		if (!isNull(r.dlv_ded_time_disp())) {
			String hm = r.dlv_ded_time_disp().toString(getDispAndValueFormatDtlDlvDedTime());
			r.dlv_ded_time_disp(getConstYmdssDate(hm, DtlR.$dlv_ded_time_disp));
		}
		if (!isNull(r.ship_schd_time_disp())) {
			String hm = r.ship_schd_time_disp().toString(getDispAndValueFormatDtlDlvDedTime());
			r.ship_schd_time_disp(getConstYmdssDate(hm, DtlR.$ship_schd_time_disp));
		}
	}

	protected void setDispToValueCnd(CndR r) {
		if (!isNull(r.dlv_ded_time_fr_disp())) {
			String hm = r.dlv_ded_time_fr_disp().toString(getDispAndValueFormatCndDlvDedTimeFr());
			r.dlv_ded_time_fr(hm);
		}
		else {
			r.dlv_ded_time_fr(null);
		}
		if (!isNull(r.dlv_ded_time_to_disp())) {
			String hm = r.dlv_ded_time_to_disp().toString(getDispAndValueFormatCndDlvDedTimeTo());
			r.dlv_ded_time_to(hm);
		}
		else {
			r.dlv_ded_time_to(null);
		}
	}

	protected void setDispToValueDtl(DtlR r) {

		int idx = r.getGUIIndex();

		if (!isNull(r.dlv_ded_time_disp())) {
			String hm = r.dlv_ded_time_disp().toString(getDispAndValueFormatDtlDlvDedTime());
			getDtlL().get(idx).dlv_ded_time(hm);
		}
		else {
			getDtlL().get(idx).dlv_ded_time(null);
		}

		if (!isNull(r.ship_schd_time_disp())) {
			String hm = r.ship_schd_time_disp().toString(getDispAndValueFormatDtlShipSchdTime());
			getDtlL().get(idx).ship_schd_time(hm);
		}
		else {
			getDtlL().get(idx).ship_schd_time(null);
		}
	}

	/**
	 * valueフィールドの値に固定値の年月日、秒を追加した値を、Dispフィールドに設定します。
	 * 
	 * @param r 設定対象のRow
	 */
	protected void setValueToDispDtlR(DtlR r) {

		if (!isNull(r.dlv_ded_time())) {
			r.dlv_ded_time_disp(getConstYmdssDate(r.dlv_ded_time(), DtlR.$dlv_ded_time_disp));
		}

		if (!isNull(r.ship_schd_time())) {
			r.ship_schd_time_disp(getConstYmdssDate(r.ship_schd_time(), DtlR.$ship_schd_time_disp));
		}
	}

	/**
	 * 引数の時刻文字列に、固定値の年月日、秒を追加したMCDateを返します。
	 * 
	 * @param hm 時刻文字列
	 * @param column 判断用項目名
	 */
	protected MCDate getConstYmdssDate(String hm, String column) {

		StringBuilder d = new StringBuilder();
		StringBuilder f = new StringBuilder();

		String dispFormat = new String();
		if(isSame(column, DtlR.$dlv_ded_time_disp)) {
			dispFormat = getDispAndValueFormatDtlDlvDedTime();
		}
		else if (isSame(column, DtlR.$ship_schd_time_disp)) {
			dispFormat = getDispAndValueFormatDtlShipSchdTime();
		}
		d.append(DUMMY_YMD).append(hm).append(DUMMY_SEC);
		f.append(DUMMY_YMD_F).append(dispFormat).append(DUMMY_SEC_F);

		return MCDate.valueOf(d.toString(), f.toString());
	}

	// -----時刻関連処理ここまで-----
	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}

	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (getStatus() == UPD && !isNull(r.upd_cntr())) {
				if (column == columnDtl_dlv_ded_time_disp) {
					 return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}