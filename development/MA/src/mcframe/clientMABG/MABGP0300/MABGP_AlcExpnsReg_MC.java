package mcframe.clientMABG.MABGP0300;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5160.*;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_AlcExpnsReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_AlcExpnsReg_MC extends MABGP_AlcExpnsReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_AlcExpnsReg_MC() {
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
	public MABGP_AlcExpnsReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0300_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0300_Srch01Caller<P extends MABGP_AlcExpnsReg, B extends MA_MABGL0300_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0300_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0300_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0300_Upd01Caller<P extends MABGP_AlcExpnsReg, B extends MA_MABGL0300_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0300_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0300_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0300_Del01Caller<P extends MABGP_AlcExpnsReg, B extends MA_MABGL0300_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0300_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0300_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
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
		callMA_MABGL0300_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0300_Del01();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_itm_p_PPanel.addItmLCListner(this);
		Dtl_term_p_PPanel.columnTerm_term.addLCListener(this);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getDtl_alc_ptn_cd_ListPutter().putBind(AlcRuleAlcPtnAsExpnsCostOrProfitCols.$i_term, columnDtl_term);
	}

	/**
	 * ソートの設定
	 */
	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_term, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_alc_ptn_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_expns_cd, SortType.ASC);
	}
	
	//------------------ イベント Start ------------------//	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
		if (lc == Dtl_term_p_PPanel.columnTerm_term) {
			doDtl_term_LC(info);
		}
	}
	
	public void doDtl_term_LC(MCEventInfo info) {
		setValueEx(columnDtl_alc_ptn_cd, info.getEventIndex(), null);
	}
	
	@Override
	public void doDtl_alc_ptn_cd_LC(MCEventInfo info) {
		super.doDtl_alc_ptn_cd_LC(info);
		setValueEx(columnDtl_self_oper_flg, info.getEventIndex(), false);
		setValueEx(columnDtl_inpt_itm_typ, info.getEventIndex(), null);
		setValueEx(columnDtl_itm_cd, info.getEventIndex(), null);
	}
	
	@Override
	public void doDtl_alc_tgt_typ_LC(MCEventInfo info) {
		super.doDtl_alc_tgt_typ_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ())) {
			setValueEx(columnDtl_self_oper_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_inpt_itm_typ, info.getEventIndex(), null);
			setValueEx(columnDtl_itm_cd, info.getEventIndex(), null);
		}
		else if (isNull(r.alc_tgt_typ())) {
			setValueEx(columnDtl_inpt_itm_typ, info.getEventIndex(), MAC_INPT_ITM_TYP.PURC.value());
		}
	}
	
	@Override
	public void doDtl_inpt_itm_typ_LC(MCEventInfo info) {
		super.doDtl_inpt_itm_typ_LC(info);
		setValueEx(columnDtl_ctg_cd, info.getEventIndex(), null);
		setValueEx(columnDtl_itm_cd, info.getEventIndex(), null);
	}
	
	public void doDtl_ctg_cd_LC(MCEventInfo info){
		super.doDtl_ctg_cd_LC(info);
		setValueEx(columnDtl_itm_cd, info.getEventIndex(), null);
	}
	
	public void doDtl_itm_cd_LC(MCEventInfo info){
		setValueEx(columnDtl_ctg_cd, info.getEventIndex(), null);
	}
	
	//------------------ イベント End ------------------//

	// ------------CellConfig------------
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
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_self_oper_flg) {
					if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ())
							|| isNull(r.alc_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_inpt_itm_typ) {
					if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ())
							|| isNull(r.alc_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_ctg_cd) {
					if (!MAC_INPT_ITM_TYP.isALL_ITM(r.inpt_itm_typ())
							|| !isNull(r.itm_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_itm_cd) {
					if (!MAC_INPT_ITM_TYP.isALL_ITM(r.inpt_itm_typ())
							|| !isNull(r.ctg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}