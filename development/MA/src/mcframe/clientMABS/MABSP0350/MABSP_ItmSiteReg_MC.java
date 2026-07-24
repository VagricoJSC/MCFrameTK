package mcframe.clientMABS.MABSP0350;

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
 * 画面"MABSP_ItmSiteReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmSiteReg_MC extends MABSP_ItmSiteReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmSiteReg_MC() {
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
	public MABSP_ItmSiteReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0350_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0350_Srch01Caller<P extends MABSP_ItmSiteReg, B extends MA_MABSL0350_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0350_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0350_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0350_Upd01Caller<P extends MABSP_ItmSiteReg, B extends MA_MABSL0350_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0350_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0350_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0350_Del01Caller<P extends MABSP_ItmSiteReg, B extends MA_MABSL0350_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0350_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0350_Srch01();
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
		callMA_MABSL0350_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0350_Del01();
	}

	
	// --------------------セルコンフィグstart--------------------

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createItmSiteTableCellConfig());
	}
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 品目マスタ（工場・物流倉庫）明細用のセルコンフィグ
	 */
	protected ItmSiteTableCellConfig createItmSiteTableCellConfig() {

		return new ItmSiteTableCellConfig(this);
	}

	/**
	 * 品目マスタ（工場・物流倉庫）明細用のセルコンフィグクラス
	 */
	protected class ItmSiteTableCellConfig extends MAUDP_RLBaseCellConfig {

		public ItmSiteTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);

			if (getStatus() == UPD) {
				// 工場出荷承認対象ＦＬＧ,検査承認対象ＦＬＧ,製造承認対象ＦＬＧ
				if (column == columnDtl_plnt_aprv_flg
						|| column == columnDtl_insp_aprv_flg
						|| column == columnDtl_mfg_aprv_flg) {
					if (MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())
							|| MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
						return MCMode.REQUIRED;
					}
				}
				// 工場出荷承認役割ＣＤ
				if (column == columnDtl_plnt_aprv_role_cd) {
					if (r.plnt_aprv_flg()) {
						return MCMode.REQUIRED;
					}
				}
				// 検査承認役割ＣＤ
				if (column == columnDtl_insp_aprv_role_cd) {
					if (r.insp_aprv_flg()) {
						return MCMode.REQUIRED;
					}
				}
				// 製造承認役割ＣＤ
				if (column == columnDtl_mfg_aprv_role_cd) {
					if (r.mfg_aprv_flg()) {
						return MCMode.REQUIRED;
					}
				}
				// 移送入荷時ロットＮＯ振替ＦＬＧ
				if (column == columnDtl_xfr_lot_flg) {
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						return MCMode.ENABLE;
					}
				}
				if (column == columnDtl_in_prmt_insp_flg) {
					if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())
							 && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
								return MCMode.READ_ONLY;
							}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	// --------------------セルコンフィグend----------------------
	// --------------------イベント処理start--------------------
	@Override
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info) {
		super.doDtl_itm_typ_d_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// デフォルト値設定
		if (isEditable(columnDtl_plnt_aprv_flg, idx)) {
			setValueEx(columnDtl_plnt_aprv_flg, idx, r.def_plnt_aprv_flg()) ;
		}
		if (isEditable(columnDtl_plnt_aprv_role_cd, idx)) {
			setValueEx(columnDtl_plnt_aprv_role_cd, idx, r.def_plnt_aprv_role_cd()) ;
		}
		if (isEditable(columnDtl_insp_aprv_flg, idx)) {
			setValueEx(columnDtl_insp_aprv_flg, idx, r.def_insp_aprv_flg()) ;
		}
		if (isEditable(columnDtl_insp_aprv_role_cd, idx)) {
			setValueEx(columnDtl_insp_aprv_role_cd, idx, r.def_insp_aprv_role_cd()) ;
		}
		if (isEditable(columnDtl_mfg_aprv_flg, idx)) {
			setValueEx(columnDtl_mfg_aprv_flg, idx, r.def_mfg_aprv_flg()) ;
		}
		if (isEditable(columnDtl_mfg_aprv_role_cd, idx)) {
			setValueEx(columnDtl_mfg_aprv_role_cd, idx, r.def_mfg_aprv_role_cd()) ;
		}
	}
	@Override
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
		super.doDtl_lot_mng_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())
				&& !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
			setValueEx(columnDtl_plnt_aprv_flg, idx, false) ;
			setValueEx(columnDtl_insp_aprv_flg, idx, false) ;
			setValueEx(columnDtl_mfg_aprv_flg, idx, false) ;
			setValueEx(columnDtl_in_prmt_insp_flg, idx, false) ;
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnDtl_xfr_lot_flg, idx, false) ;
		}
	}
	@Override
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
		super.doDtl_sublot_mng_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())
				&& !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
			setValueEx(columnDtl_plnt_aprv_flg, idx, false) ;
			setValueEx(columnDtl_insp_aprv_flg, idx, false) ;
			setValueEx(columnDtl_mfg_aprv_flg, idx, false) ;
			setValueEx(columnDtl_in_prmt_insp_flg, idx, false) ;
		}
	}
	@Override
	public void doDtl_plnt_aprv_flg_NC(MCEventInfo info){
		super.doDtl_plnt_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.plnt_aprv_flg()){
			setValueEx(columnDtl_plnt_aprv_role_cd, idx, null) ;
		}
	}
	@Override
	public void doDtl_insp_aprv_flg_NC(MCEventInfo info){
		super.doDtl_insp_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.insp_aprv_flg()){
			setValueEx(columnDtl_insp_aprv_role_cd, idx, null) ;
		}
	}
	@Override
	public void doDtl_mfg_aprv_flg_NC(MCEventInfo info){
		super.doDtl_mfg_aprv_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.mfg_aprv_flg()){
			setValueEx(columnDtl_mfg_aprv_role_cd, idx, null) ;
		}
	}
	// --------------------イベント処理end----------------------

}