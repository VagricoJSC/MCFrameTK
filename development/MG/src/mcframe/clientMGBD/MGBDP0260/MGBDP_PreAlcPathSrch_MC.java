package mcframe.clientMGBD.MGBDP0260;

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
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5210.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_PreAlcPathSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_PreAlcPathSrch_MC extends MGBDP_PreAlcPathSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _is_expand_all = false;
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_PreAlcPathSrch_MC() {
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
	public MGBDP_PreAlcPathSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0260_Srch01Caller<P extends MGBDP_PreAlcPathSrch, B extends MG_MGBDL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0260_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {
			super.show();
			if(_is_expand_all){
				Dtl_hrrchy_p_PPanel.showExpandAll(getDtlL());
			}
			else{
				Dtl_hrrchy_p_PPanel.showCollapseAll(getDtlL());
			}
		}

		@Override
		protected void clear() {
			super.clear();
			Dtl_hrrchy_p_PPanel.screenClearBody();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMG_MGBDL0260_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMG_MGBDL0260_Srch01();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MGBDP0260]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0260(MCEventInfo info) {
		DtlR dtl = DtlTable.getSelectedMCRow();
		if (isNull(dtl)) {
			dialog(msgNoSelectedRow());
			return ;
		}
		CndR bind = CndR.create();
		bind.calc_grp_cd(_cndR.calc_grp_cd());
		bind.calc_no(_cndR.calc_no());
		bind.wg_cd(dtl.wg_cd());
		bind.pre_alc_seq(dtl.pre_alc_seq());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0260");
		so.putCnd(bind);
		so.runValueInit();
		so.putBind(MCScreenOpener.PARAM_ACTION, MCScreenOpener.createGUIKey(RPnl_srch_all));
		so.showChild(this);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false); // ソート不可
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Dtl_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		// ソート設定のポップアップを無効にする
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			conf.ignoreSortOrder(true);
		}
		return conf;
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setOpenBtnMode();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setOpenBtnMode();
	}

	protected void setOpenBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r) && r.hrrchy().isZero()) {
			setDefaultMode(Btn_open_MGBDP0260);
		}
		else {
			Btn_open_MGBDP0260.setMode(MCMode.READ_ONLY);
		}
	}

}