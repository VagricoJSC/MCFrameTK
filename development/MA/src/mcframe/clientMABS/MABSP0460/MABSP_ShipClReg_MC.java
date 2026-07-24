package mcframe.clientMABS.MABSP0460;

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
 * 画面"MABSP_ShipClReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ShipClReg_MC extends MABSP_ShipClReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ShipClReg_MC() {
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
	public MABSP_ShipClReg_MC(String name) {
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
	 * [MA_MABSL0460_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0460_Srch01Caller<P extends MABSP_ShipClReg, B extends MA_MABSL0460_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0460_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {

			// 出荷締時間の表示値を設定する
			for (DtlR dtlRow : bridge.down0()) {
				setValueToDispDtl(dtlRow);
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
	 * [MA_MABSL0460_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0460_Upd01Caller<P extends MABSP_ShipClReg, B extends MA_MABSL0460_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0460_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0460_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0460_Del01Caller<P extends MABSP_ShipClReg, B extends MA_MABSL0460_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0460_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0460_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABSL0460_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0460_Del01();
	}

	@Override
	public void doDtl_fin_cl_time_disp_NC(MCEventInfo info){
		super.doDtl_fin_cl_time_disp_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		convDispDtl(r);
		setDispToValueDtl(r);
	}

	protected void convDispDtl(DtlR r) {
		if (!isNull(r.fin_cl_time_disp())) {
			String hm = r.fin_cl_time_disp().toString(getDispAndValueFormatDtl());
			r.fin_cl_time_disp(getConstYmdssDate(hm));
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

	/**
	 * valueフィールドの値に固定値の年月日、秒を追加した値を、Dispフィールドに設定します。
	 * 
	 * @param r 設定対象のRow
	 */
	protected void setValueToDispDtl(DtlR r) {

		if (!isNull(r.fin_cl_time())) {
			r.fin_cl_time_disp(getConstYmdssDate(r.fin_cl_time()));
		}
	}

	/**
	 * 引数の時刻文字列に、固定値の年月日、秒を追加したMCDateを返します。
	 * 
	 * @param hm 時刻文字列
	 */
	protected MCDate getConstYmdssDate(String hm) {

		StringBuilder d = new StringBuilder();
		StringBuilder f = new StringBuilder();

		String dispFormat = new String();
		dispFormat = getDispAndValueFormatDtl();
		d.append(DUMMY_YMD).append(hm).append(DUMMY_SEC);
		f.append(DUMMY_YMD_F).append(dispFormat).append(DUMMY_SEC_F);

		return MCDate.valueOf(d.toString(), f.toString());
	}

	protected String getDispAndValueFormatDtl() {
		return columnDtl_fin_cl_time_disp.getDateFormat().getInputPattern().replaceAll("h", "H");
	}

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
			if (getStatus() == UPD) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_fin_cl_time_disp) {
					if ((r.no_ship_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_no_ship_flg) {
					if (!isNull(r.fin_cl_time_disp())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}