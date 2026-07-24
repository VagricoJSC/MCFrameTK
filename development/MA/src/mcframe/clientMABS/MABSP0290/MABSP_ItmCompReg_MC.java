package mcframe.clientMABS.MABSP0290;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmCompReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmCompReg_MC extends MABSP_ItmCompReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmCompReg_MC() {
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
	public MABSP_ItmCompReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0290_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0290_Srch01Caller<P extends MABSP_ItmCompReg, B extends MA_MABSL0290_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0290_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0290_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0290_Upd01Caller<P extends MABSP_ItmCompReg, B extends MA_MABSL0290_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0290_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0290_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0290_Del01Caller<P extends MABSP_ItmCompReg, B extends MA_MABSL0290_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0290_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0290_Srch01();
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
		DtlR r = copyRow(DtlTable);
		if (!isNull(r.itm_comp_grp_cd())) {
			r.def_flg(false);
		}
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABSL0290_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0290_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_core_qty_p_PPanel.setRelateBeans(columnDtl_core_itm_unit_cd, columnDtl_core_itm_dec_place);
		Dtl_comp_qty_p_PPanel.setRelateBeans(columnDtl_comp_itm_unit_cd, columnDtl_comp_itm_dec_place);
	}
	// -------------------- 初期処理 --------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_core_itm_p_PPanel.addItmLCListner(this);
		Dtl_comp_itm_p_PPanel.addItmLCListner(this);
	}

	// -------------------- イベント処理 --------------------

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Dtl_core_itm_p_PPanel.isItm(lc)) {
			doDtl_core_itm_cd_LC(info);
		}
		else if (Dtl_comp_itm_p_PPanel.isItm(lc)) {
			doDtl_comp_itm_cd_LC(info);
		}
	}

	public void doDtl_core_itm_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = getDtlL().get(index);
		getDtl_core_itm_unit_cd(r, info);
		setValueEx(columnDtl_core_itm_qty, r.getGUIIndex(), null);
		setDefFlg(r);
	}
	
	public void doDtl_comp_itm_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = getDtlL().get(index);

		setValueEx(columnDtl_comp_itm_qty, r.getGUIIndex(), null);
	}


	@Override
	public void doDtl_def_flg_NC(MCEventInfo info) {
		super.doDtl_def_flg_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = getDtlL().get(index);

		setDefFlg(r);
	}

	@Override
	public void doDtl_itm_comp_grp_cd_LC(MCEventInfo info) {
		super.doDtl_itm_comp_grp_cd_LC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = getDtlL().get(index);

		setDefFlg(r);
	}

	/**
	 * 通常構成ＦＬＧ設定
	 * 
	 * 主品目、品目構成グループごとで設定される通常構成ＦＬＧが1つだけになるようにする。
	 * （ただし、品目構成グループの値がない場合は別とする。
	 * 
	 * @param changedR 変更をした明細行
	 */
	protected void setDefFlg(DtlR changedR) {
		if (changedR.def_flg() && !isNull(changedR.itm_comp_grp_cd())) {
			String[] keys = {DtlR.$core_itm_cd, DtlR.$core_itm_sub1, DtlR.$core_itm_sub2,
					 DtlR.$core_itm_sub3, DtlR.$itm_comp_grp_cd, DtlR.$def_flg};
			Comparable<?>[] vals = {changedR.core_itm_cd(), changedR.core_itm_sub1(), changedR.core_itm_sub2(),
					 changedR.core_itm_sub3(), changedR.itm_comp_grp_cd(), true};

			for (DtlR checkedR : getDtlL().subList(keys, vals)) {
				if (!isSame(changedR, checkedR)) {
					setValueEx(columnDtl_def_flg, checkedR.getGUIIndex(), false);
				}
			}
		}
	}

}