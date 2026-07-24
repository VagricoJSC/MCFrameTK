package mcframe.clientMABS.MABSP0440;

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
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_LgCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_LgCtlReg_MC extends MABSP_LgCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_LgCtlReg_MC() {
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
	public MABSP_LgCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected final String DUMMY_YMD = "19000101";

	protected final String DUMMY_YMD_F = "yyyyMMdd";

	protected final String DUMMY_SEC = "01";

	protected final String DUMMY_SEC_F = "ss";

	/**
	 * [MA_MABSL0440_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Srch01Caller<P extends MABSP_LgCtlReg, B extends MA_MABSL0440_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABSL0440_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {

			// 出荷締時間の表示値を設定する
			for (DtlR dtlRow : bridge.down0()) {
				setValueToDispDtl(dtlRow);
			}
			for (LclR lclRow : bridge.down1()) {
				setValueToDispLcl(lclRow);
			}

			super.show();

		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0440_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Upd01Caller<P extends MABSP_LgCtlReg, B extends MA_MABSL0440_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABSL0440_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0440_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Del01Caller<P extends MABSP_LgCtlReg, B extends MA_MABSL0440_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABSL0440_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0440_Srch01();
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
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABSL0440_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0440_Del01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setDividerPos(WrkPanel, 0.65);
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		sort(LclTable);
		LclTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void doDtl_fin_cl_time_disp_NC(MCEventInfo info){
		super.doDtl_fin_cl_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		convDispDtl(r);
		setDispToValueDtl(r);
	}
	
	@Override
	public void doDtl_to_lg_grp_cd_NC(MCEventInfo info){
		super.doDtl_to_lg_grp_cd_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_iv_trd_flg, idx, false);
	}
	
	@Override
	public void doDtl_iv_trd_flg_NC(MCEventInfo info) {
		super.doDtl_iv_trd_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.iv_trd_flg() && r.to_lg_grp_loc_flg()) {
			setValueEx(columnDtl_def_tdlv_cd, idx, null) ;
		}
	}
	@Override
	public void doDtl_to_lg_grp_loc_flg_NC(MCEventInfo info) {
		super.doDtl_to_lg_grp_loc_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!r.iv_trd_flg() && r.to_lg_grp_loc_flg()) {
			setValueEx(columnDtl_def_tdlv_cd, idx, null) ;
		}
	}

	@Override
	public void doLcl_fin_cl_time_disp_NC(MCEventInfo info){
		super.doLcl_fin_cl_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		LclR r = getLclL().get(idx);
		
		convDispLcl(r);
		setDispToValueLcl(r);
	}

	protected void convDispDtl(DtlR r) {
		if (!isNull(r.fin_cl_time_disp())) {
			String hm = r.fin_cl_time_disp().toString(getDispAndValueFormatDtl());
			r.fin_cl_time_disp(getConstYmdssDate(hm, true));
		}
	}

	protected void setDispToValueDtl(DtlR r) {

		int idx = r.getGUIIndex();

		if (!isNull(r.fin_cl_time_disp())) {
			String hm = r.fin_cl_time_disp().toString(getDispAndValueFormatDtl());
			getDtlL().get(idx).fin_cl_time(hm);
		}
		else {
			getDtlL().get(idx).fin_cl_time(null);
		}
	}
	
	protected void convDispLcl(LclR r) {
		if (!isNull(r.fin_cl_time_disp())) {
			String hm = r.fin_cl_time_disp().toString(getDispAndValueFormatLcl());
			r.fin_cl_time_disp(getConstYmdssDate(hm, false));
		}
	}

	protected void setDispToValueLcl(LclR r) {

		int idx = r.getGUIIndex();

		if (!isNull(r.fin_cl_time_disp())) {
			String hm = r.fin_cl_time_disp().toString(getDispAndValueFormatLcl());
			getLclL().get(idx).fin_cl_time(hm);
		}
		else {
			getLclL().get(idx).fin_cl_time(null);
		}
	}

	protected String getDispAndValueFormatDtl() {
		return columnDtl_fin_cl_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}
	
	protected String getDispAndValueFormatLcl() {
		return columnLcl_fin_cl_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}
	
	/**
	 * valueフィールドの値に固定値の年月日、秒を追加した値を、Dispフィールドに設定します。
	 * 
	 * @param r 設定対象のRow
	 */
	protected void setValueToDispDtl(DtlR r) {

		if (!isNull(r.fin_cl_time())) {
			r.fin_cl_time_disp(getConstYmdssDate(r.fin_cl_time(), true));
		}
	}
	
	protected void setValueToDispLcl(LclR r) {

		if (!isNull(r.fin_cl_time())) {
			r.fin_cl_time_disp(getConstYmdssDate(r.fin_cl_time(), false));
		}
	}

	/**
	 * 引数の時刻文字列に、固定値の年月日、秒を追加したMCDateを返します。
	 * 
	 * @param hm 時刻文字列
	 * @param dtlFlg 画面上段と下段の区別フラグ 上段：true 下段:false
	 */
	protected MCDate getConstYmdssDate(String hm, boolean dtlFlg) {

		StringBuilder d = new StringBuilder();
		StringBuilder f = new StringBuilder();
		
		String dispFormat = new String();
		if(dtlFlg) {
			dispFormat = getDispAndValueFormatDtl();
		}
		else {
			dispFormat = getDispAndValueFormatLcl();
		}
		d.append(DUMMY_YMD).append(hm).append(DUMMY_SEC);
		f.append(DUMMY_YMD_F).append(dispFormat).append(DUMMY_SEC_F);

		return MCDate.valueOf(d.toString(), f.toString());
	}

	// ------------CellConfig------------
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
		LclTable.setCellConfig(createShipConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_LCLRLBaseCellConfig {

		public DtlConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_def_tdlv_cd) {
					if (!r.iv_trd_flg()) {
						if (!r.to_lg_grp_loc_flg()) {
							return MCMode.ENABLE;
						}
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_iv_trd_flg) {
					if (!r.to_lg_grp_loc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected MCCellConfig createShipConf() {
		return new ShipConf(this);
	}
	
	public class ShipConf extends MAUDP_LCLRLBaseCellConfig {

		public ShipConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				LclR r = (LclR) table.getBaseTable().getRow(index);
				
				if (column == columnLcl_fin_cl_time_disp) {
					if ((r.no_ship_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnLcl_no_ship_flg) {
					if (!isNull(r.fin_cl_time_disp())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}