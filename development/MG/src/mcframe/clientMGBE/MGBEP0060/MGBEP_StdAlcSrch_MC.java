package mcframe.clientMGBE.MGBEP0060;

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
import mcframe.clientMAUB.MAUBP5030.*;
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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdAlcSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdAlcSrch_MC extends MGBEP_StdAlcSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Color _otherColor = getExpnsSrchRsltColor(this);

	protected Color _ttlColor = getVTtlColor(this);

	protected Color _expnsTtlColor = getVttlExpnsColor(this);

	protected Color _expnsgTtlColor = getVttlExpnsgColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdAlcSrch_MC() {
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
	public MGBEP_StdAlcSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0060_Srch01Caller<P extends MGBEP_StdAlcSrch, B extends MG_MGBEL0060_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0060_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {

			super.show();
			calcTtl();

		}

		/**
		 * 費目の合計、費目Ｇの合計、総合計を計算する
		 */
		protected void calcTtl() {
			RsltR prevR = null;
			MCNumber subttl = MCNumber.ZERO;// 費目合計
			MCNumber ttl = MCNumber.ZERO;// 費目Ｇ合計
			MCNumber gttl = MCNumber.ZERO;// 総計
			MCList<RsltR> tempL = MCList.create(RsltR.class);
			for (RsltR r : getRsltL()) {
				if (null != prevR && !isSame(prevR.expns_cd(), r.expns_cd())) {
					RsltR subttlR = copyExpns(prevR);
					subttlR.alc_amt(subttl);
					subttl = MCNumber.ZERO;
					tempL.add(subttlR);
				}
				if (null != prevR && !isSame(prevR.expns_grp_cd(), r.expns_grp_cd())) {
					RsltR ttlR = copyExpnsG(prevR);
					ttlR.alc_amt(ttl);
					ttl = MCNumber.ZERO;
					tempL.add(ttlR);
				}
				tempL.add(r);
				subttl = MCNumber.sum(subttl, r.alc_amt());
				ttl = MCNumber.sum(ttl, r.alc_amt());
				gttl = MCNumber.sum(gttl, r.alc_amt());
				prevR = r;
			}
			RsltR subttlR = copyExpns(prevR);
			subttlR.alc_amt(subttl);
			tempL.add(subttlR);
			RsltR ttlR = copyExpnsG(prevR);
			ttlR.alc_amt(ttl);
			tempL.add(ttlR);
			RsltR addR = RsltR.create();
			addR.alc_amt(gttl);
			tempL.add(addR);
			getRsltL().setAll(tempL);
		}

		protected RsltR copyExpns(RsltR src) {
			RsltR dest = RsltR.create();
			dest.expns_cd(src.expns_cd());
			dest.expns_nm(src.expns_nm());
			return dest;
		}

		protected RsltR copyExpnsG(RsltR src) {
			RsltR dest = RsltR.create();
			dest.expns_grp_cd(src.expns_grp_cd());
			dest.expns_grp_nm(src.expns_grp_nm());
			return dest;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			FoldTab.focusActiveFirstComponent();
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBEL0060_Srch01();
	}

	@Override
	protected void setCellConfig() {

		super.setCellConfig();
		RsltTable.setCellConfig(createCellConf());
	}

	protected RsltCellConf createCellConf() {
		return new RsltCellConf();
	}

	public class RsltCellConf extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (index == getRsltL().size() - 1) {
				return _ttlColor;
			}
			// 費目Ｇの合計行を、配賦科目ＣＤ==NULLかつ、費目Ｇ!=NULLで判断する
			else if (isNull(getRsltL().get(index).alc_ac_cd())
					&& !isNull(getRsltL().get(index).expns_grp_cd())) {
				return _expnsgTtlColor;
			}
			// 費目の合計行を、配賦科目ＣＤ==NULLかつ、費目!=NULLで判断する
			else if (isNull(getRsltL().get(index).alc_ac_cd())
					&& !isNull(getRsltL().get(index).expns_cd())) {
				return _expnsTtlColor;
			}
			else {
				return _otherColor;
			}
		}
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			// ソート順変更画面を起動させない
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		RsltTable.setSortable(false);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFocus();
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		setCalcNoMode();
	}

	protected void setCalcNoMode() {
		CndR r = getCndR();
		if (isNull(r.calc_grp_cd())) {
			Cnd_calc_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_calc_no);
		}
	}

	// -----------------------------------------------
	// Event

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Cnd_itm2_p_PPanel.addItmLCListner(this);
		Cnd_itm_nm2.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Cnd_itm2_p_PPanel.isItm(lc) || lc == Cnd_itm_nm2) {
			doCnd_itm2_LC(info);
		}
	}

	protected void doCnd_itm2_LC(MCEventInfo info) {
		if (!isNull(info.getNewValue())) {
			getCndR().no_itm2_flg(false);
		}
	}

	@Override
	public void doCnd_no_itm2_flg_NC(MCEventInfo info) {
		super.doCnd_no_itm2_flg_NC(info);
		if (getCndR().no_itm2_flg()) {
			setValueEx(Cnd_itm_cd2, null);
			setValueEx(Cnd_itm_nm2, null);
			setValueEx(Cnd_itm_sub1_2, null);
			setValueEx(Cnd_itm_sub2_2, null);
			setValueEx(Cnd_itm_sub3_2, null);
		}
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		setCalcNoMode();
	}

	@Override
	public void doCnd_no_cst_flg_NC(MCEventInfo info) {
		super.doCnd_no_cst_flg_NC(info);
		if (getCndR().no_cst_flg()) {
			setValueEx(Cnd_cst_cd, null);
			setValueEx(Cnd_cst_nm, null);
		}
	}

	@Override
	public void doCnd_cst_cd_LC(MCEventInfo info) {
		super.doCnd_cst_cd_LC(info);
		if (!isNull(getCndR().cst_cd())) {
			getCndR().no_cst_flg(false);
		}
	}

	@Override
	public void doCnd_cst_nm_LC(MCEventInfo info) {
		super.doCnd_cst_nm_LC(info);
		if (!isNull(getCndR().cst_nm())) {
			getCndR().no_cst_flg(false);
		}
	}

	@Override
	public void doCnd_no_dlv_flg_NC(MCEventInfo info) {
		super.doCnd_no_dlv_flg_NC(info);
		if (getCndR().no_dlv_flg()) {
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
		}
	}

	@Override
	public void doCnd_dlv_cd_LC(MCEventInfo info) {
		super.doCnd_dlv_cd_LC(info);
		if (!isNull(getCndR().dlv_cd())) {
			getCndR().no_dlv_flg(false);
		}
	}

	@Override
	public void doCnd_dlv_nm_LC(MCEventInfo info) {
		super.doCnd_dlv_nm_LC(info);
		if (!isNull(getCndR().dlv_nm())) {
			getCndR().no_dlv_flg(false);
		}
	}

	@Override
	public void doCnd_no_loc_flg_NC(MCEventInfo info) {
		super.doCnd_no_loc_flg_NC(info);
		if (getCndR().no_loc_flg()) {
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
		}
	}

	@Override
	public void doCnd_loc_cd_LC(MCEventInfo info) {
		super.doCnd_loc_cd_LC(info);
		if (!isNull(getCndR().loc_cd())) {
			getCndR().no_loc_flg(false);
		}
	}

	@Override
	public void doCnd_loc_nm_LC(MCEventInfo info) {
		super.doCnd_loc_nm_LC(info);
		if (!isNull(getCndR().loc_nm())) {
			getCndR().no_loc_flg(false);
		}
	}

	@Override
	public void doCnd_no_loc2_flg_NC(MCEventInfo info) {
		super.doCnd_no_loc2_flg_NC(info);
		if (getCndR().no_loc2_flg()) {
			setValueEx(Cnd_loc_cd2, null);
			setValueEx(Cnd_loc_nm2, null);
		}
	}

	@Override
	public void doCnd_loc_cd2_LC(MCEventInfo info) {
		super.doCnd_loc_cd2_LC(info);
		if (!isNull(getCndR().loc_cd2())) {
			getCndR().no_loc2_flg(false);
		}
	}

	@Override
	public void doCnd_loc_nm2_LC(MCEventInfo info) {
		super.doCnd_loc_nm2_LC(info);
		if (!isNull(getCndR().loc_nm2())) {
			getCndR().no_loc2_flg(false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
		if (!isNull(getCndR().bp_cd())) {
			getCndR().no_bp_flg(false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);
		if (!isNull(getCndR().bp_nm())) {
			getCndR().no_bp_flg(false);
		}
	}

	@Override
	public void doCnd_no_sppl_flg_NC(MCEventInfo info) {
		super.doCnd_no_sppl_flg_NC(info);
		if (getCndR().no_sppl_flg()) {
			setValueEx(Cnd_sppl_cd, null);
			setValueEx(Cnd_sppl_nm, null);
		}
	}

	@Override
	public void doCnd_sppl_cd_LC(MCEventInfo info) {
		super.doCnd_sppl_cd_LC(info);
		if (!isNull(getCndR().sppl_cd())) {
			getCndR().no_sppl_flg(false);
		}
	}

	@Override
	public void doCnd_sppl_nm_LC(MCEventInfo info) {
		super.doCnd_sppl_nm_LC(info);
		if (!isNull(getCndR().sppl_nm())) {
			getCndR().no_sppl_flg(false);
		}
	}

	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt_flg_NC(info);
		if (getCndR().no_dpt_flg()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}

	@Override
	public void doCnd_dpt_cd_LC(MCEventInfo info) {
		super.doCnd_dpt_cd_LC(info);
		if (!isNull(getCndR().dpt_cd())) {
			getCndR().no_dpt_flg(false);
		}
	}

	@Override
	public void doCnd_dpt_nm_LC(MCEventInfo info) {
		super.doCnd_dpt_nm_LC(info);
		if (!isNull(getCndR().dpt_nm())) {
			getCndR().no_dpt_flg(false);
		}
	}

	@Override
	public void doCnd_no_dpt2_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt2_flg_NC(info);
		if (getCndR().no_dpt2_flg()) {
			setValueEx(Cnd_dpt_cd2, null);
			setValueEx(Cnd_dpt_nm2, null);
		}
	}

	@Override
	public void doCnd_dpt_cd2_LC(MCEventInfo info) {
		super.doCnd_dpt_cd2_LC(info);
		if (!isNull(getCndR().dpt_cd2())) {
			getCndR().no_dpt2_flg(false);
		}
	}

	@Override
	public void doCnd_dpt_nm2_LC(MCEventInfo info) {
		super.doCnd_dpt_nm2_LC(info);
		if (!isNull(getCndR().dpt_nm2())) {
			getCndR().no_dpt2_flg(false);
		}
	}

	@Override
	public void doCnd_no_oper_flg_NC(MCEventInfo info) {
		super.doCnd_no_oper_flg_NC(info);
		if (getCndR().no_oper_flg()) {
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
		}
	}

	@Override
	public void doCnd_oper_cd_LC(MCEventInfo info) {
		super.doCnd_oper_cd_LC(info);
		if (!isNull(getCndR().oper_cd())) {
			getCndR().no_oper_flg(false);
		}
	}

	@Override
	public void doCnd_oper_nm_LC(MCEventInfo info) {
		super.doCnd_oper_nm_LC(info);
		if (!isNull(getCndR().oper_nm())) {
			getCndR().no_oper_flg(false);
		}
	}

	@Override
	public void doCnd_no_ctg_flg_NC(MCEventInfo info) {
		super.doCnd_no_ctg_flg_NC(info);
		if (getCndR().no_ctg_flg()) {
			setValueEx(Cnd_ctg_cd, null);
			setValueEx(Cnd_ctg_nm, null);
		}
	}

	@Override
	public void doCnd_ctg_cd_LC(MCEventInfo info) {
		super.doCnd_ctg_cd_LC(info);
		if (!isNull(getCndR().ctg_cd())) {
			getCndR().no_ctg_flg(false);
		}
	}

	@Override
	public void doCnd_ctg_nm_LC(MCEventInfo info) {
		super.doCnd_ctg_nm_LC(info);
		if (!isNull(getCndR().ctg_nm())) {
			getCndR().no_ctg_flg(false);
		}
	}

	@Override
	public void doCnd_no_dest1_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_dest1_flg_NC(info);
		if (getCndR().no_dest1_flg()) {
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
		}
	}

	@Override
	public void doCnd_dest_cd1_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_cd1_LC(info);
		if (!isNull(getCndR().dest_cd1())) {
			getCndR().no_dest1_flg(false);
		}
	}

	@Override
	public void doCnd_dest_nm1_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_nm1_LC(info);
		if (!isNull(getCndR().dest_nm1())) {
			getCndR().no_dest1_flg(false);
		}
	}

	@Override
	public void doCnd_no_dest2_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_dest2_flg_NC(info);
		if (getCndR().no_dest2_flg()) {
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
		}
	}

	@Override
	public void doCnd_dest_cd2_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_cd2_LC(info);
		if (!isNull(getCndR().dest_cd2())) {
			getCndR().no_dest2_flg(false);
		}
	}

	@Override
	public void doCnd_dest_nm2_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_nm2_LC(info);
		if (!isNull(getCndR().dest_nm2())) {
			getCndR().no_dest2_flg(false);
		}
	}

	@Override
	public void doCnd_no_dest3_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_dest3_flg_NC(info);
		if (getCndR().no_dest3_flg()) {
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
		}
	}

	@Override
	public void doCnd_dest_cd3_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_cd3_LC(info);
		if (!isNull(getCndR().dest_cd3())) {
			getCndR().no_dest3_flg(false);
		}
	}

	@Override
	public void doCnd_dest_nm3_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dest_nm3_LC(info);
		if (!isNull(getCndR().dest_nm3())) {
			getCndR().no_dest3_flg(false);
		}
	}

}