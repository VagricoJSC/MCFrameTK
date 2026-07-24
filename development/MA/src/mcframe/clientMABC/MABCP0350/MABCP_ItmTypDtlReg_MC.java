package mcframe.clientMABC.MABCP0350;

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
import mcframe.clientMAUB.MAUBP0100.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.Arrays;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmTypDtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmTypDtlReg_MC extends MABCP_ItmTypDtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _INPT_CTL = "INPT_CTL";
	protected String _PHANTOM = "PNTM";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmTypDtlReg_MC() {
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
	public MABCP_ItmTypDtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0350_Srch01();
	}
	/**
	 * [MA_MABCL0350_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Srch01Caller<P extends MABCP_ItmTypDtlReg, B extends MA_MABCL0350_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0350_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0350_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Upd01Caller<P extends MABCP_ItmTypDtlReg, B extends MA_MABCL0350_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0350_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0350_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Del01Caller<P extends MABCP_ItmTypDtlReg, B extends MA_MABCL0350_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0350_Del01Caller(P p, B b) {
			super(p, b);
		}
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
		callMA_MABCL0350_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0350_Del01();
	}
	
	//--------------------リストロジック表示制御Start-----------------------

	@Override	
	public MCList getDtl_def_sublot_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSublotMngTyp(info));
		return super.getDtl_def_sublot_mng_typ(row, info);
	}
	/**
	 * 表示するサブロット管理区分を取得する
	 */
	protected MAC_SUBLOT_MNG_TYP[] getSublotMngTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
			return new MAC_SUBLOT_MNG_TYP[] { MAC_SUBLOT_MNG_TYP.NOT_MNG, MAC_SUBLOT_MNG_TYP.STK };
		}
		return MAC_SUBLOT_MNG_TYP.array();
	}

	@Override
	public MCList getDtl_def_sno1_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$def_rqmt_sno1_flg));
		return super.getDtl_def_sno1_num_typ(row, info);
	}
	@Override
	public MCList getDtl_def_sno2_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$def_rqmt_sno2_flg));
		return super.getDtl_def_sno2_num_typ(row, info);
	}
	@Override
	public MCList getDtl_def_sno3_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$def_rqmt_sno3_flg));
		return super.getDtl_def_sno3_num_typ(row, info);
	}
	@Override
	public MCList getDtl_def_sno4_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$def_rqmt_sno4_flg));
		return super.getDtl_def_sno4_num_typ(row, info);
	}
	/**
	 * 表示する手配ＮＯ発番区分を取得する
	 */
	protected MAC_SNO_NO_TYP[] getSnoNumTyp(MCEventInfo info, String rqmtSnoFlgCol) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
			return MAC_SNO_NO_TYP.array();
		}
		if (r.getBooleanNE(rqmtSnoFlgCol)) {
			return new MAC_SNO_NO_TYP[] { MAC_SNO_NO_TYP.AUTO, MAC_SNO_NO_TYP.AUTO_MANU };
		}
		return MAC_SNO_NO_TYP.array();
	}

	//--------------------リストロジック表示制御End-------------------------

	//--------------------画面イベントstart-------------------------
	
	@Override
	public void doDtl_def_lot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_lot_mng_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
			setValueEx(columnDtl_def_lot_mix_flg, idx, false);
			setValueEx(columnDtl_def_lot_no_typ, idx, null);
			setValueEx(columnDtl_def_ver_flg, idx, false);
			setValueEx(columnDtl_def_lmt_ctl_flg, idx, false);
			if (isNull(r.def_lot_mng_typ())
					|| !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())
					&& !MAC_SUBLOT_MNG_TYP.isSTK(r.def_sublot_mng_typ())) {
				setValueEx(columnDtl_def_sublot_mng_typ, idx, null);
			}
			if (isNull(r.def_sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())) {
				setValueEx(columnDtl_def_not_new_lot_flg, idx, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(r.def_lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.def_sublot_mng_typ())) {
			setValueEx(columnDtl_def_mrkt_judg_flg, idx, false);
			setValueEx(columnDtl_def_insp_bind_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_itm_typ_LC(MCEventInfo info) {
		super.doDtl_itm_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分に「7：架空品」が設定されている場合
		if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
			for (MCColumnConfig c : getPhantomGrpCols()) {
				if (c.getDataType() == MCDataType.BOOLEAN) {
					setValueEx(c, idx, false);
				}
				else {
					setValueEx(c, idx, null);
				}
			}
		}
		else {
			if (!r.def_mrkt_judg_flg()) {
				setValueEx(columnDtl_def_mrkt_judg_role_cd, idx, null);
				setValueEx(columnDtl_def_mrkt_judg_upd_role_cd, idx, null);
			}
		}
	}

	@Override
	public void doDtl_def_comp_spec_typ_LC(MCEventInfo info) {
		super.doDtl_def_comp_spec_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.def_comp_spec_typ())) {
			setValueEx(columnDtl_def_comp_rev_at_slo_flg, idx, false);
		}
	}
	
	@Override
	public void doDtl_def_lmt_ctl_flg_NC(MCEventInfo info) {
		super.doDtl_def_lmt_ctl_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.def_lmt_ctl_flg()) {
			setValueEx(columnDtl_def_lmt_ctl_categ, idx, null);
			setValueEx(columnDtl_def_ship_lot_back_stop_flg, idx, false);
			setValueEx(columnDtl_def_ship_valid_grp_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_lot_no_typ_LC(MCEventInfo info) {
		super.doDtl_def_lot_no_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_lot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(r.def_lot_no_typ())) {
			setValueEx(columnDtl_def_lot_no_ptn_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sublot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_sublot_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())) {
			setValueEx(columnDtl_def_sublot_no_typ, idx, null);
			setValueEx(columnDtl_def_sublot_mix_flg, idx, false);
			if (isNull(r.def_lot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
				setValueEx(columnDtl_def_not_new_lot_flg, idx, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(r.def_lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.def_sublot_mng_typ())) {
			setValueEx(columnDtl_def_mrkt_judg_flg, idx, false);
			setValueEx(columnDtl_def_insp_bind_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sublot_no_typ_LC(MCEventInfo info) {
		super.doDtl_def_sublot_no_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sublot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(r.def_sublot_no_typ())) {
			setValueEx(columnDtl_def_sublot_no_ptn_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sno1_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno1_mng_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_def_slo_sno1_flg, idx, false);
		setValueEx(columnDtl_def_rqmt_sno1_flg, idx, false);

		if (isNull(r.def_sno1_mng_typ())) {
			setValueEx(columnDtl_def_sno_typ1, idx, null);
			setValueEx(columnDtl_def_sno1_num_typ, idx, null);
		}
		else {
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno1_flg, idx, false);
				setValueEx(columnDtl_def_rqmt_sno1_flg, idx, false);
				setValueEx(columnDtl_def_sno1_num_typ, idx, null);
				setValueEx(columnDtl_def_sno_typ1, idx, MAC_SNO_TYP.NO_EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno1_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno1_flg, idx, true);
				setValueEx(columnDtl_def_rqmt_sno1_flg, idx, true);
				setValueEx(columnDtl_def_sno_typ1, idx, MAC_SNO_TYP.EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno1_mng_typ())) {
				setValueEx(columnDtl_def_sno_typ1, idx, MAC_SNO_TYP.EXTND_NULL.value());
			}
			else {
				setValueEx(columnDtl_def_sno_typ1, idx, null);
			}
		}
	}
	
	@Override
	public void doDtl_def_sno1_num_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno1_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sno1_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.def_sno1_num_typ())) {
			setValueEx(columnDtl_def_sno1_ptn_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sno2_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno2_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_def_slo_sno2_flg, idx, false);
		setValueEx(columnDtl_def_rqmt_sno2_flg, idx, false);
		
		if (isNull(r.def_sno2_mng_typ())) {
			setValueEx(columnDtl_def_sno_typ2, idx, null);
			setValueEx(columnDtl_def_sno2_num_typ, idx, null);
		}
		else {
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno2_flg, idx, false);
				setValueEx(columnDtl_def_rqmt_sno2_flg, idx, false);
				setValueEx(columnDtl_def_sno2_num_typ, idx, null);
				setValueEx(columnDtl_def_sno_typ2, idx, MAC_SNO_TYP.NO_EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno2_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno2_flg, idx, true);
				setValueEx(columnDtl_def_rqmt_sno2_flg, idx, true);
				setValueEx(columnDtl_def_sno_typ2, idx, MAC_SNO_TYP.EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno2_mng_typ())) {
				setValueEx(columnDtl_def_sno_typ2, idx, MAC_SNO_TYP.EXTND_NULL.value());
			}
			else {
				setValueEx(columnDtl_def_sno_typ2, idx, null);
			}
		}
	}
	
	@Override
	public void doDtl_def_sno2_num_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno2_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sno2_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.def_sno2_num_typ())) {
			setValueEx(columnDtl_def_sno2_ptn_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sno3_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno3_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_def_slo_sno3_flg, idx, false);
		setValueEx(columnDtl_def_rqmt_sno3_flg, idx, false);
		
		if (isNull(r.def_sno3_mng_typ())) {
			setValueEx(columnDtl_def_sno_typ3, idx, null);
			setValueEx(columnDtl_def_sno3_num_typ, idx, null);
		}
		else {
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno3_flg, idx, false);
				setValueEx(columnDtl_def_rqmt_sno3_flg, idx, false);
				setValueEx(columnDtl_def_sno3_num_typ, idx, null);
				setValueEx(columnDtl_def_sno_typ3, idx, MAC_SNO_TYP.NO_EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno3_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno3_flg, idx, true);
				setValueEx(columnDtl_def_rqmt_sno3_flg, idx, true);
				setValueEx(columnDtl_def_sno_typ3, idx, MAC_SNO_TYP.EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno3_mng_typ())) {
				setValueEx(columnDtl_def_sno_typ3, idx, MAC_SNO_TYP.EXTND_NULL.value());
			}
			else {
				setValueEx(columnDtl_def_sno_typ3, idx, null);
			}
		}
	}
	
	@Override
	public void doDtl_def_sno3_num_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno3_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sno3_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.def_sno3_num_typ())) {
			setValueEx(columnDtl_def_sno3_ptn_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_sno4_mng_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno4_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_def_slo_sno4_flg, idx, false);
		setValueEx(columnDtl_def_rqmt_sno4_flg, idx, false);
		
		if (isNull(r.def_sno4_mng_typ())) {
			setValueEx(columnDtl_def_sno_typ4, idx, null);
			setValueEx(columnDtl_def_sno4_num_typ, idx, null);
		}
		else {
			if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno4_flg, idx, false);
				setValueEx(columnDtl_def_rqmt_sno4_flg, idx, false);
				setValueEx(columnDtl_def_sno4_num_typ, idx, null);
				setValueEx(columnDtl_def_sno_typ4, idx, MAC_SNO_TYP.NO_EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno4_mng_typ())) {
				setValueEx(columnDtl_def_slo_sno4_flg, idx, true);
				setValueEx(columnDtl_def_rqmt_sno4_flg, idx, true);
				setValueEx(columnDtl_def_sno_typ4, idx, MAC_SNO_TYP.EXTND.value());
			}
			else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno4_mng_typ())) {
				setValueEx(columnDtl_def_sno_typ4, idx, MAC_SNO_TYP.EXTND_NULL.value());
			}
			else {
				setValueEx(columnDtl_def_sno_typ4, idx, null);
			}
		}
	}
	
	@Override
	public void doDtl_def_sno4_num_typ_LC(MCEventInfo info) {
		super.doDtl_def_sno4_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.def_sno4_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.def_sno4_num_typ())) {
			setValueEx(columnDtl_def_sno4_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_def_rqmt_sno1_flg_NC(MCEventInfo info) {
		super.doDtl_def_rqmt_sno1_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.def_rqmt_sno1_flg() && MAC_SNO_NO_TYP.isMANUAL(r.def_sno1_num_typ())) {
			setValueEx(columnDtl_def_sno1_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_def_rqmt_sno2_flg_NC(MCEventInfo info) {
		super.doDtl_def_rqmt_sno2_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.def_rqmt_sno2_flg() && MAC_SNO_NO_TYP.isMANUAL(r.def_sno2_num_typ())) {
			setValueEx(columnDtl_def_sno2_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_def_rqmt_sno3_flg_NC(MCEventInfo info) {
		super.doDtl_def_rqmt_sno3_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.def_rqmt_sno3_flg() && MAC_SNO_NO_TYP.isMANUAL(r.def_sno3_num_typ())) {
			setValueEx(columnDtl_def_sno3_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_def_rqmt_sno4_flg_NC(MCEventInfo info) {
		super.doDtl_def_rqmt_sno4_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.def_rqmt_sno4_flg() && MAC_SNO_NO_TYP.isMANUAL(r.def_sno4_num_typ())) {
			setValueEx(columnDtl_def_sno4_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_def_plnt_aprv_flg_NC(MCEventInfo info) {
		super.doDtl_def_plnt_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.def_plnt_aprv_flg()) {
			setValueEx(columnDtl_def_plnt_aprv_role_cd, idx, null);
		}
	}

	@Override
	public void doDtl_def_insp_aprv_flg_NC(MCEventInfo info) {
		super.doDtl_def_insp_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.def_insp_aprv_flg()) {
			setValueEx(columnDtl_def_insp_aprv_role_cd, idx, null);
		}
	}

	@Override
	public void doDtl_def_mfg_aprv_flg_NC(MCEventInfo info) {
		super.doDtl_def_mfg_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.def_mfg_aprv_flg()) {
			setValueEx(columnDtl_def_mfg_aprv_role_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_def_byprod_flg_NC(MCEventInfo info) {
		super.doDtl_def_byprod_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.def_byprod_flg()) {
			setValueEx(columnDtl_def_main_itm_flg, idx, false);
			setValueEx(columnDtl_def_lot_mix_flg, idx, false);
			setValueEx(columnDtl_def_sublot_mix_flg, idx, false);
			setValueEx(columnDtl_def_alloc_ctl_typ, idx, null);
			setValueEx(columnDtl_def_inpt_ctl_typ, idx, null);
			setValueEx(columnDtl_def_bkf_typ, idx, null);
		}
	}
	@Override
	public void doDtl_def_slo_proc_flg_NC(MCEventInfo info) {
		super.doDtl_def_slo_proc_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.def_slo_proc_flg()) {
			setValueEx(columnDtl_def_slo_proc_typ, idx, null);
		}
	}

	@Override
	public void doDtl_def_slo_proc_typ_LC(MCEventInfo info) {
		super.doDtl_def_slo_proc_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.def_slo_proc_typ())) {
			setValueEx(columnDtl_def_ship_inst_typ, idx, MAC_SHIP_INST_TYP.NON.value());
		}
	}
	
	@Override
	public void doDtl_def_inpt_ctl_typ_LC(MCEventInfo info) {
		super.doDtl_def_inpt_ctl_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.def_inpt_ctl_typ())) {
			setValueEx(columnDtl_def_alloc_ctl_typ, idx, null);
		}
	}
	
	//--------------------画面イベントend---------------------------
	//--------------------セルコンフィグstart-------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}
	
	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (getStatus() == UPD) {
				DtlR r = DtlTable.getRow(index);
				
				// 品目区分に「7：架空品」が設定されている場合、下記項目は常に入力不可
				if (getPhantomGrpCols().contains(column) && MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
					return MCMode.READ_ONLY;
				}

				if (column == columnDtl_def_comp_rev_at_slo_flg) {
					if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.def_comp_spec_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// サブロットＮＯ管理区分
				else if (column == columnDtl_def_sublot_mng_typ) {
					if (isNull(r.def_lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// ロット管理区分に「3：同一ロット不許可」が設定されている、
				// もしくはサブロット管理区分に「3：ロット内同一サブロット不許可」が設定されている場合に入力可
				else if (column == columnDtl_def_insp_bind_typ 
						|| column == columnDtl_def_mrkt_judg_flg) {
					if (!MAC_LOT_MNG_TYP.isUNIQ(r.def_lot_mng_typ())
							&& !MAC_SUBLOT_MNG_TYP.isUNIQ(r.def_sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 期限管理種別、出荷ロット逆転禁止、出荷有効期限グループＣＤ
				else if (column == columnDtl_def_lmt_ctl_categ
						|| column == columnDtl_def_ship_lot_back_stop_flg
						|| column == columnDtl_def_ship_valid_grp_cd) {
					if (!r.def_lmt_ctl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// ロットＮＯ発番区分
				else if (column == columnDtl_def_lot_no_typ) {
					if (isNull(r.def_lot_mng_typ()) 
							|| MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// ロットＮＯ発番パタンＣＤ
				else if (column == columnDtl_def_lot_no_ptn_cd) {
					if (isNull(r.def_lot_no_typ()) 
							|| MAC_LOT_NO_TYP.isMANUAL(r.def_lot_no_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// サブロットＮＯ発番区分
				else if (column == columnDtl_def_sublot_no_typ) {
					if (isNull(r.def_sublot_mng_typ()) 
							|| MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// サブロットＮＯ発番パタンＣＤ
				else if (column == columnDtl_def_sublot_no_ptn_cd) {
					if (isNull(r.def_sublot_no_typ())
							|| MAC_LOT_NO_TYP.isMANUAL(r.def_sublot_no_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 受注手配ＮＯ1必須、所要手配ＮＯ1必須
				else if (column == columnDtl_def_slo_sno1_flg
						|| column == columnDtl_def_rqmt_sno1_flg) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ1発番区分
				else if (column == columnDtl_def_sno1_num_typ) {
					if (isNull(r.def_sno1_mng_typ()) 
							|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ1発番パタンＣＤ
				else if (column == columnDtl_def_sno1_ptn_cd) {
					if (isNull(r.def_sno1_num_typ())
							|| MAC_SNO_NO_TYP.isMANUAL(r.def_sno1_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 受注手配ＮＯ2必須、所要手配ＮＯ2必須
				else if (column == columnDtl_def_slo_sno2_flg 
						|| column == columnDtl_def_rqmt_sno2_flg) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ2発番区分
				else if (column == columnDtl_def_sno2_num_typ) {
					if (isNull(r.def_sno2_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ2発番パタンＣＤ
				else if (column == columnDtl_def_sno2_ptn_cd) {
					if (isNull(r.def_sno2_num_typ())
							|| MAC_SNO_NO_TYP.isMANUAL(r.def_sno2_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 受注手配ＮＯ3必須、所要手配ＮＯ3必須
				else if (column == columnDtl_def_slo_sno3_flg
						|| column == columnDtl_def_rqmt_sno3_flg) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ3発番区分
				else if (column == columnDtl_def_sno3_num_typ) {
					if (isNull(r.def_sno3_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ3発番パタンＣＤ
				else if (column == columnDtl_def_sno3_ptn_cd) {
					if (isNull(r.def_sno3_num_typ())
							|| MAC_SNO_NO_TYP.isMANUAL(r.def_sno3_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 受注手配ＮＯ4必須、所要手配ＮＯ4必須
				else if (column == columnDtl_def_slo_sno4_flg
						|| column == columnDtl_def_rqmt_sno4_flg) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ4発番区分
				else if (column == columnDtl_def_sno4_num_typ) {
					if (isNull(r.def_sno4_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手配ＮＯ4発番パタンＣＤ
				else if (column == columnDtl_def_sno4_ptn_cd) {
					if (isNull(r.def_sno4_num_typ())
							|| MAC_SNO_NO_TYP.isMANUAL(r.def_sno4_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 市場出荷判定役割ＣＤ,市場出荷判定更新役割ＣＤ
				else if (column == columnDtl_def_mrkt_judg_role_cd
						|| column == columnDtl_def_mrkt_judg_upd_role_cd) {
					if (!r.def_mrkt_judg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 工場出荷承認役割ＣＤ
				else if (column == columnDtl_def_plnt_aprv_role_cd) {
					if (!r.def_plnt_aprv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 検査承認役割ＣＤ
				else if (column == columnDtl_def_insp_aprv_role_cd) {
					if (!r.def_insp_aprv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 製造承認役割ＣＤ
				else if (column == columnDtl_def_mfg_aprv_role_cd) {
					if (!r.def_mfg_aprv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 手配ＮＯ１区分
				else if (column == columnDtl_def_sno_typ1) {
					if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
						if (isNull(r.def_sno1_mng_typ())
								|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno1_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno1_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
	
				// 手配ＮＯ２区分
				else if (column == columnDtl_def_sno_typ2) {
					if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
						if (isNull(r.def_sno2_mng_typ())
								|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno2_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno2_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
	
				// 手配ＮＯ３区分
				else if (column == columnDtl_def_sno_typ3) {
					if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
						if (isNull(r.def_sno3_mng_typ())
								|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno3_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno3_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
	
				// 手配ＮＯ４区分
				else if (column == columnDtl_def_sno_typ4) {
					if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
						if (isNull(r.def_sno4_mng_typ())
								|| MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno4_mng_typ())
								|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno4_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				// 版管理対象ＦＬＧ
				else if (column == columnDtl_def_ver_flg) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// ロット混在
				else if (column == columnDtl_def_lot_mix_flg) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())
							|| r.def_byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// サブロット混在
				else if (column == columnDtl_def_sublot_mix_flg) {
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())
							|| r.def_byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 新規ロット入力不可
				else if (column == columnDtl_def_not_new_lot_flg) {
					if ((isNull(r.def_lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ()))
							&& (isNull(r.def_sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 引継対象子品目、投入制御区分、バックフラッシュ区分
				else if (column == columnDtl_def_main_itm_flg
						|| column == columnDtl_def_inpt_ctl_typ
						|| column == columnDtl_def_bkf_typ) {
					if (r.def_byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 受注手配区分
				else if (column == columnDtl_def_slo_proc_typ) {
					if (!r.def_slo_proc_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 出荷指図区分
				else if (column == columnDtl_def_ship_inst_typ) {
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.def_slo_proc_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 引当制御区分
				else if (column == columnDtl_def_alloc_ctl_typ) {
					if (r.def_byprod_flg()
							|| MAC_INPT_CTL_TYP.isNO_MRP_INST(r.def_inpt_ctl_typ())){
						return MCMode.READ_ONLY;
					}
				}
				
				// 期限管理対象ＦＬＧ
				else if (column == columnDtl_def_lmt_ctl_flg) {
					if (isNull(r.def_lot_mng_typ()) 
							|| MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
			
		};
		
	}
	//--------------------セルコンフィグend---------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM_TYP_D));
	}


	protected List<MCColumnConfig> _phantomGrp;
	protected List<MCColumnConfig> getPhantomGrpCols() {
		if (_phantomGrp == null) {
			_phantomGrp = getGroupCol(DtlTable, _INPT_CTL, _PHANTOM);
		}
		return _phantomGrp;
	}

	protected List<MCColumnConfig> getGroupCol(MCTable table, String grp, String key) {
		List<MCColumnConfig> l = new ArrayList<MCColumnConfig>();
		MCConstRow r = (MCConstRow) table.getList().createRow();
		Map<String, String> m = r.getExtMap(grp);
		if (m != null && !m.isEmpty()) {
			for (Map.Entry<String, String> e : m.entrySet()) {
				if (Arrays.asList(e.getValue().split(";")).contains(key)) {
					for (MCColumnConfig cc : table.getColumnConfigs()) {
						if (isSame(cc.getBaseRowColumnName(), e.getKey())) {
							l.add(cc);
						}
					}
				}
			}
		}
		return l;
	}

}