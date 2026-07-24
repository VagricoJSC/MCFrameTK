package mcframe.clientMSBB.MSBBP0130;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_MlySPlnFmtReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_MlySPlnFmtReg_MC extends MSBBP_MlySPlnFmtReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnFmtReg_MC() {
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
	public MSBBP_MlySPlnFmtReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Srch01Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0130_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_spln_st_ym_fr, Cnd_spln_st_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_spln_end_ym_fr, Cnd_spln_end_ym_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}

	}

	/**
	 * [MS_MSBBL0130_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Srch02Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0130_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_spln_st_ym_fr, Cnd_spln_st_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_spln_end_ym_fr, Cnd_spln_end_ym_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}

	}

	/**
	 * [MS_MSBBL0130_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Sprt01Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBBL0130_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		@SuppressWarnings("unchecked")
		protected void initCallerSub() {
			MCList<RsltR> cl = getCheckedRows(panel);
			if (isNull(cl) || cl.size() == getRsltL().size()) {
				return;
			}

			// 重複期間補正の単位で上り電文対象にする
			for (RsltR cr : cl.subList(k -> !isNullOr(k.spln_st_ym(), k.spln_end_ym(),
					k.dpt_cd(), k.spln_itm_cd(), k.itm_cd()))) {
				for (RsltR r : getRsltL().subList(k -> isSameGrp(k, cr))) {
					if (!r.check() && isEditable(columnRslt_check, r.getGUIIndex())) {
						r.check(true);
						if (!isNull(r.spln_fmt_no()) && r.isStatusNone()) {
							r.setStatus(MCRow.MODIFY);
						}
					}
				}
			}

		}

		protected boolean isSameGrp(RsltR x, RsltR y) {
			return isSame(x.dpt_cd(), y.dpt_cd())
					&& isSameNullVal(x.spln_itm_cd(), y.spln_itm_cd())
					&& isSameNullVal(x.itm_cd(), y.itm_cd())
					&& isSameNullVal(x.cst_cd(), y.cst_cd())
					&& isSameNullVal(x.wrk_no(), y.wrk_no());
		}

		protected boolean isSameNullVal(String x, String y) {
			if (isSame(x, y)) {
				return true;
			}
			if (MAC_STR.isNULL_VAL(x) && isNull(y)) {
				return true;
			}
			if (MAC_STR.isNULL_VAL(y) && isNull(x)) {
				return true;
			}
			return false;
		}

		@Override
		protected void show() {
			showReplaceDup();
		}

		/**
		 * RsltTableの内容を、下記レコードに詰め替える。
		 * <ul>
		 *  <li>上り電文にないレコード：選択チェックがオフに対応する。</li>
		 *  <li>下り電文にあるレコード：選択チェックがオンに対応する。ただし、行追加、行削除あり</li>
		 * </ul>
		 */
		protected void showReplaceDup() {
			setGUIIndexAtDownParam();
			MCList<RsltR> l = MCList.create(RsltR.class);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					for (RsltR d : bridge.down0()) {
						if (r.getGUIIndex() == d.getGUIIndex()) {
							d.check(true);
							l.add(d);
						}
					}
				}
				else {
					l.add(r);
				}
			}
			getRsltL().setAll(l);
		}

	}

	/**
	 * [MS_MSBBL0130_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Imp01Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBBL0130_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}

			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}

	}

	/**
	 * [MS_MSBBL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Upd01Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL0130_Upd01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MS_MSBBL0130_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0130_Del01Caller<P extends MSBBP_MlySPlnFmtReg, B extends MS_MSBBL0130_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL0130_Del01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()
				|| Cnd_ope_REF.isSelected()) {
			callMS_MSBBL0130_Srch01();
		}
		else if (Cnd_ope_COPY.isSelected()) {
			callMS_MSBBL0130_Srch02();
		}
	}

	/**
	 * Panel[BulkSet]のボタン[setting]の押下時の処理
	 */
	@Override
	public void doBulkSet_setting(MCEventInfo info) {
		bulkSet();
	}

	/**
	 * Panel[Btn]のボタン[sprt_dup_term]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_dup_term(MCEventInfo info) {
		callMS_MSBBL0130_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		if (r != null) {
			r.spln_fmt_no(null);
		}
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL0130_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL0130_Del01();
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isWrkEnabled(this)) {
			setComponentInvisibleAllStatus(BulkSet_wrk_no_unit);
		}
	}
	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnRslt_dpt_cd) {
			setBindRslt_dpt_cd(row, eventIndex);
		}
		return row;
	}

	@Override
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info) {
		setBindRslt_dpt_cd(row, info.getEventIndex());
		return super.getRslt_dpt_cd(row, info);
	}

	protected void setBindRslt_dpt_cd(MCRow row , int eventIndex) {
		if (eventIndex >= 0) {
			RsltR r = getRsltL().get(eventIndex);
			row.setDateNE(DptCols.$i_dt, getYmStDt(r.spln_st_ym(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
		}
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		// 登録訂正種別の場合に行う。
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_COPY.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		BulkSetPanel.setVisible(false);
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setCndMode();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		BulkSetPanel.setVisible(false);
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setCndMode() {
		setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_COPY.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (r.isStatusCreate() || isNull(r.upd_cntr())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_COPY.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		// 検索枠を開く
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_COPY.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		// 検索枠を閉じる
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（登録直後）、REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		fillSpace();
		setSrchStatus();
	}

	// その他イベント
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
		columnRslt_wrk_no.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_LC(info);
		}
		else if (lc == columnRslt_wrk_no) {
			doRslt_wrk_no_LC(info);
		}
	}

	@Override
	public void doRslt_spln_itm_cd_LC(MCEventInfo info) {
		super.doRslt_spln_itm_cd_LC(info);
		int index = info.getEventIndex();
		if (!isNullOrNullVal((String)info.getNewValue())) {
			setValueEx(columnRslt_itm_cd, index, null);
		}
	}

	protected void doRslt_itm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (!isNullOrNullVal((String)info.getNewValue())) {
			setValueEx(columnRslt_spln_itm_cd, index, null);
		}
	}

	@Override
	public void doRslt_cst_cd_LC(MCEventInfo info) {
		super.doRslt_cst_cd_LC(info);
		int index = info.getEventIndex();
		if (isNullOrNullVal((String)info.getNewValue())) {
			setValueEx(columnRslt_cst_cd_unit_flg, index, false);
		}
		else {
			setValueEx(columnRslt_cst_cd_unit_flg, index, true);
		}
	}

	protected void doRslt_wrk_no_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (isNullOrNullVal((String)info.getNewValue())) {
			setValueEx(columnRslt_wrk_no_unit_flg, index, false);
		}
		else {
			setValueEx(columnRslt_wrk_no_unit_flg, index, true);
		}
	}

	// 一括項目設定
	@Override
	public void doBulkSet_cst_cd_unit_t_flg_NC(MCEventInfo info) {
		super.doBulkSet_cst_cd_unit_t_flg_NC(info);
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			getBulkSetR().cst_cd_unit_f_flg(false);
		}
	}

	@Override
	public void doBulkSet_cst_cd_unit_f_flg_NC(MCEventInfo info) {
		super.doBulkSet_cst_cd_unit_f_flg_NC(info);
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			getBulkSetR().cst_cd_unit_t_flg(false);
		}
	}

	@Override
	public void doBulkSet_wrk_no_unit_t_flg_NC(MCEventInfo info) {
		super.doBulkSet_wrk_no_unit_t_flg_NC(info);
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			getBulkSetR().wrk_no_unit_f_flg(false);
		}
	}

	@Override
	public void doBulkSet_wrk_no_unit_f_flg_NC(MCEventInfo info) {
		super.doBulkSet_wrk_no_unit_f_flg_NC(info);
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			getBulkSetR().wrk_no_unit_t_flg(false);
		}
	}

	protected void bulkSet(MCBeans... bulkSet) {
		for (RsltR r : RsltTable.getViewRows()) {
			bulkSet(r, bulkSet);
		}
	}

	protected void bulkSet(RsltR r, MCBeans... bulkSet) {
		if (r != null && r.check()) {
			if (bulkSet.length == 0) {
				List<MCBeans> l = new ArrayList<MCBeans>();
				l.add(BulkSet_spln_st_ym);
				l.add(BulkSet_spln_end_ym);
				l.add(BulkSet_dpt_cd);
				l.add(BulkSet_cst_cd);
				l.add(BulkSet_wrk_no);
				l.add(BulkSet_cur_cd);
				l.add(BulkSet_spln_set_typ);
				l.add(BulkSet_cst_cd_unit_t_flg);
				l.add(BulkSet_cst_cd_unit_f_flg);
				l.add(BulkSet_wrk_no_unit_t_flg);
				l.add(BulkSet_wrk_no_unit_f_flg);
				bulkSet = l.toArray(new MCBeans[]{});
			}
			for (MCBeans b : bulkSet) {
				if (b == BulkSet_spln_st_ym) {
					if (isEditable(columnRslt_spln_st_ym,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().spln_st_ym())) {
							r.spln_st_ym(getBulkSetR().spln_st_ym());
						}
					}
				}
				else if (b == BulkSet_spln_end_ym) {
					if (isEditable(columnRslt_spln_end_ym,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().spln_end_ym())) {
							r.spln_end_ym(getBulkSetR().spln_end_ym());
						}
					}
				}
				else if (b == BulkSet_dpt_cd) {
					if (isEditable(columnRslt_dpt_cd,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().dpt_cd())) {
							r.dpt_cd(getBulkSetR().dpt_cd());
							r.dpt_nm(getBulkSetR().dpt_nm());
						}
					}
				}
				else if (b == BulkSet_cst_cd) {
					if (isEditable(columnRslt_cst_cd,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().cst_cd())) {
							r.cst_cd(getBulkSetR().cst_cd());
							r.cst_nm(getBulkSetR().cst_nm());
							if (isNullOrNullVal(r.cst_cd())) {
								r.cst_cd_unit_flg(false);
							}
						}
					}
				}
				else if (b == BulkSet_wrk_no) {
					if (isEditable(columnRslt_wrk_no,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().wrk_no())) {
							r.wrk_no(getBulkSetR().wrk_no());
							r.wrk_nm(getBulkSetR().wrk_nm());
							if (isNullOrNullVal(r.wrk_no())) {
								r.wrk_no_unit_flg(false);
							}
						}
					}
				}
				else if (b == BulkSet_cur_cd) {
					if (isEditable(columnRslt_cur_cd,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().cur_cd())) {
							r.cur_cd(getBulkSetR().cur_cd());
							r.cur_nm(getBulkSetR().cur_nm());
						}
					}
				}
				else if (b == BulkSet_spln_set_typ) {
					if (isEditable(columnRslt_spln_set_typ,r.getGUIIndex())) {
						if (!isNull(getBulkSetR().spln_set_typ())) {
							r.spln_set_typ(getBulkSetR().spln_set_typ());
							r.spln_set_typ_nm(getBulkSetR().spln_set_typ_nm());
						}
					}
				}
				else if (b == BulkSet_cst_cd_unit_t_flg) {
					if (isEditable(columnRslt_cst_cd_unit_flg,r.getGUIIndex())) {
						if (getBulkSetR().cst_cd_unit_t_flg()) {
							r.cst_cd_unit_flg(true);
						}
					}
				}
				else if (b == BulkSet_cst_cd_unit_f_flg) {
					if (isEditable(columnRslt_cst_cd_unit_flg,r.getGUIIndex())) {
						if (getBulkSetR().cst_cd_unit_f_flg()) {
							r.cst_cd_unit_flg(false);
						}
					}
				}
				else if (b == BulkSet_wrk_no_unit_t_flg) {
					if (isEditable(columnRslt_wrk_no_unit_flg,r.getGUIIndex())) {
						if (getBulkSetR().wrk_no_unit_t_flg()) {
							r.wrk_no_unit_flg(true);
						}
					}
				}
				else if (b == BulkSet_wrk_no_unit_f_flg) {
					if (isEditable(columnRslt_wrk_no_unit_flg,r.getGUIIndex())) {
						if (getBulkSetR().wrk_no_unit_f_flg()) {
							r.wrk_no_unit_flg(false);
						}
					}
				}
			}
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr())) {
					if (column == columnRslt_cst_cd
							|| column == columnRslt_wrk_no
							|| column == columnRslt_spln_itm_cd
							|| column == columnRslt_itm_cd
							|| column == columnRslt_itm_sub1
							|| column == columnRslt_itm_sub2
							|| column == columnRslt_itm_sub3) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_dpt_cd) {
					if (isNull(r.spln_st_ym()) || !isNull(r.upd_cntr())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_cst_cd_unit_flg) {
					if (isNullOrNullVal(r.cst_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_wrk_no_unit_flg) {
					if (isNullOrNullVal(r.wrk_no())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_spln_set_typ) {
					if (isNullOrNullVal(r.itm_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// fileImport
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
	  callMS_MSBBL0130_Imp01();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	// -----------------------------------------------

}